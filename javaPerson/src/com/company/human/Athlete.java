package com.company.human;

public class Athlete implements Actions {
    String walking;

    @Override
    public String run(String walk) {
        walking = walk;
        return walking;
    }

    @Override
    public String toString() {
        return walking;
    }
}
