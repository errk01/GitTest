package com.company;

import com.company.lamdbasInterface.IntMath;

import java.util.ArrayList;

public class JavaLambdas {
    public void arrayStuff(){

        ArrayList<String> students = new ArrayList<>();
        students.add("Bob");
        students.add("Jessica");
        students.add("Dave");

        students.forEach(idx -> {
            if(idx.substring(0,1).equals("J")){
                System.out.println(idx);
            }
        });
    }


}
