package org.test.auth.service;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.auth.jwt.JwtUtils;
import org.test.auth.models.User;

import java.util.HashMap;
import java.util.Map;
@Service
public class LoginService {

    @Autowired
    HttpServletResponse httpServletResponse;
    public Map login(String username, String password) {
        //登录业务流程
        User user=new User();
        Map map = new HashMap<>();
        user.setNickname(username);
        user.setUid("23043443");
      if(username.equals("muhaiyan")) {
          String token = JwtUtils.getToken(user.getUid(), user.getNickname());
          map.put("token", token);
          httpServletResponse.addHeader("Authorization",token);
      }
        map.put("user", user);

        return map;
    }
}
