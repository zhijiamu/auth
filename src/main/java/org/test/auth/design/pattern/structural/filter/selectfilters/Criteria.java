package org.test.auth.design.pattern.structural.filter.selectfilters;

import java.util.List;

public interface  Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
