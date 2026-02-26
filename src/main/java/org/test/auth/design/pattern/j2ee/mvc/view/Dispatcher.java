package org.test.auth.design.pattern.j2ee.mvc.view;

public class Dispatcher {
    private final StudentView studentView;
    private final HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
