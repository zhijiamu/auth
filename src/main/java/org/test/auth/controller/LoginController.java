package org.test.auth.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.json.JsonMapper;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.test.auth.service.LoginService;

import java.io.IOException;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;
    @RequestMapping({"/", "/index.html"})
    void  home(HttpServletResponse response) throws IOException {
           response.sendRedirect("/html/login.html");
    }


    @RequestMapping("/login")
    public String login( @RequestBody String data,HttpServletResponse httpServletResponse) throws JsonProcessingException {
        JsonMapper mapper=new JsonMapper();
        JsonNode OB=mapper.readTree(data);
        System.out.println(OB.toString());
        Map map=loginService.login(OB.get("username").asText(),OB.get("password").asText());
        map.put("message","congratulation successful");
        httpServletResponse.setHeader("Authorization",map.get("token").toString());
        String result=null;
        try {
            result=mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @GetMapping("/home")
    public ModelAndView home( ModelAndView modelAndView) {
        modelAndView.setViewName("home");
        return modelAndView;
    }
}
