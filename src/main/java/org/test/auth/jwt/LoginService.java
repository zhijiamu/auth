package org.test.auth.jwt;

import org.test.auth.models.User;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

    public Map login(String username, String password) {
        //登录业务流程
        User user=new User();
        String token = JwtUtils.getToken(user.getId(), user.getNickname());
        Map map = new HashMap<>();
        map.put("user", user);
        map.put("token", token);
        return map;
    }
}
