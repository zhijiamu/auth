package org.test.auth.handler;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.websocket.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@Slf4j
@ControllerAdvice // 或者在特定控制器上使用 @Controller 或 @RestController
public class GlobalExceptionHandler {
    @Autowired
    private ResourceLoader resourceLoader;

/*    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> handleException(Exception e) {
        // 处理异常，例如记录日志
        log.error("An error occurred", e);

        if(e.getMessage().equals("缺少令牌"))
        {
            Resource resource = resourceLoader.getResource("classpath:static/html/error.html");
            return ResponseEntity.ok().body(resource);
        }
        // 返回适当的响应
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }*/

    @ExceptionHandler(value = NoResourceFoundException.class)
    public ResponseEntity<Object> handleNoResourceFoundException(Exception e) {
        // 处理异常，例如记录日志
        log.error("An NoResourceFoundException error occurred", e);
        Resource resource = resourceLoader.getResource("classpath:static/html/error.html");
        return ResponseEntity.ok().body(resource);
        // 返回适当的响应
        // return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = AuthenticationException.class)
    public ResponseEntity<Object> handleAuthenticationException(Exception e) {
        // 处理异常，例如记录日志
        log.error("An handleAuthenticationException error occurred", e);
        return ResponseEntity.ok().body(e.getMessage());
        // 返回适当的响应
        // return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }


}