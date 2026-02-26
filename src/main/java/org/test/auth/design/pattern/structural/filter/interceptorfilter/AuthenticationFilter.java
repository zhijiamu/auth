package org.test.auth.design.pattern.structural.filter.interceptorfilter;

public class AuthenticationFilter implements Filter {
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
