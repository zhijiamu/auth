package org.test.auth.intercept;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@Slf4j
@Component
public class UrlToHomeInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("请求链接为" + request.getRequestURI());
        if (request.getRequestURI().contains("api"))
            return true;
        if (request.getRequestURI().equals("/login")) {
            return true;
        } else {
            throw new NoResourceFoundException(HttpMethod.valueOf("GET"), request.getRequestURI(), request.getServletPath());
        }
    }

}
