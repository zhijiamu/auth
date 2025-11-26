package org.test.auth.design.pattern.structural.filter.interceptorfilter;

public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
