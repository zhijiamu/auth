package org.test.auth.intercept;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.websocket.AuthenticationException;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.test.auth.handler.UserHandler;
import org.test.auth.jwt.JwtUtils;

import java.util.Map;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

    /**
     * 业务执行前
     */
    @Override
    public boolean preHandle(HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull Object handler) throws Exception {
        //获取本次请求路径
        String requestURI = request.getRequestURI();
        System.out.println("拦截到请求:" + requestURI);
        //定义不需要处理的路径（也可以在配置类中配置）
        String[] urls = new String[]{
                "/user/login",
                "/doc.html",
                "/swagger-resources",
                "/v2/api-docs",
                "/favicon.ico",
                "/login",
                "/login.html",
                "/default.jpg",
                "/home.html",
                "/html",
                "/home",
                "/"
        };
        //判断本次是否需要处理
        boolean check = check(urls, requestURI);
        //如果不需要处理，则直接放行
        if (check) {
            return true;
        }
        //1.获取token信息
        String authorization = request.getHeader("Authorization");
        //2.解析token 判断是否有效
        if (authorization == null) {
        /*    return false;
        if (authorization.isEmpty()) {*/
            // throw new RuntimeException("缺少令牌");
            throw new AuthenticationException("缺少authoration");
            //return  false;
        }
        //3.解析token信息
        Map map = JwtUtils.verifyToken(authorization);
        Long uid = (Long) map.get("uid");
        String nickname = (String) map.get("nickname");
        //4.保存用户数据
        UserHandler.set(uid);
        //5.解析成功放行
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //释放内存
        UserHandler.remove();
    }

    /**
     * 路径匹配，检查本次请求是否需要放行
     *
     * @param urls       请求白名单
     * @param requestURI 请求路径
     */
    public boolean check(String[] urls, String requestURI) {
        for (String url : urls) {
            boolean match = PATH_MATCHER.match(url, requestURI);
            if (match) {
                return true;
            }
        }
        return false;
    }
}
