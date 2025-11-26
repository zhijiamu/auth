package org.test.auth.design.pattern.structural.filter.interceptorfilter;

import org.test.auth.design.pattern.j2ee.mvc.view.Target;

public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
