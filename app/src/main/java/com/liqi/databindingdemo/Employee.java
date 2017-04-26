package com.liqi.databindingdemo;

/**
 * Created by liqi on 2017/4/26.
 */

public class Employee {
    private String first;
    private String last;

    public Employee(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
