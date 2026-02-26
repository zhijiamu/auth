package org.test.auth.design.pattern.j2ee.mvc.controller;

import org.test.auth.design.pattern.j2ee.mvc.view.Dispatcher;

public class FrontController {
    private final Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request) {
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
