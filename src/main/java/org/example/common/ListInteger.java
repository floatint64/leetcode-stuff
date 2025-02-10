package org.example.common;

import java.util.ArrayList;
import java.util.List;

public class ListInteger implements NestedInteger {
    private List<NestedInteger> list = new ArrayList<>();

    @Override
    public boolean isInteger() {
        return false;
    }

    @Override
    public Integer getInteger() {
        throw new RuntimeException();
    }

    @Override
    public void setInteger(int value) {
        throw new RuntimeException();
    }

    @Override
    public void add(NestedInteger ni) {
        list.add(ni);
    }

    @Override
    public List<NestedInteger> getList() {
        return  list;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
