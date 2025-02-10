package org.example.common;

import java.util.List;

public class SimpleInteger implements NestedInteger {

    private int val;

    public SimpleInteger(int val) {
        this.val = val;
    }

    @Override
    public boolean isInteger() {
        return true;
    }

    @Override
    public Integer getInteger() {
        return val;
    }

    @Override
    public void setInteger(int value) {
        this.val = value;
    }

    @Override
    public void add(NestedInteger ni) {
        throw new RuntimeException();
    }

    @Override
    public List<NestedInteger> getList() {
        throw new RuntimeException();
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}
