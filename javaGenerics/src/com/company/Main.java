package com.company;

import com.company.lamdbasInterface.IntMath;
//import com.company.lamdbasInterface.Mathfunctions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        IntMath addMethod = (a,b) -> a-b;
        System.out.println(addMethod.operations(4,5));

        JavaLambdas stuffArr = new JavaLambdas();
        stuffArr.arrayStuff();

        AnotherClass<Integer, String> myClass = new AnotherClass<>(12, "Hello");
        int numVal = myClass.getThingOne();
        String strVal = myClass.getThingTwo();

        AnotherClass<String, String> myClass2 = new AnotherClass<>("12", "45");
        String numVal2 = myClass2.getThingOne();
        String numVal3 = myClass2.getThingTwo();

//        System.out.println("Printing everything");
//        System.out.println("numVal" + numVal);
//        System.out.println("strVal" + strVal);


        Set<String> newSet = new HashSet<>();
        newSet.add("one");
        newSet.add("Two");
        newSet.add("Java");

        Set<String> newSet2 = new HashSet<>();
        newSet2.add("one");
        newSet2.add("Two");
        newSet2.add("Spring");


      Set<String> setResult = printStuff(newSet,newSet2);
//                Iterator<String> myItr = setResult.iterator();
//        while(myItr.hasNext()){
//            System.out.println(myItr.next());
//        }
        for (String s : setResult) {
//            System.out.println(s);
        }
    }


    public static <E>Set<E> printStuff(Set<E> setOne, Set<E> setTwo) {
        // I for got to put setOne in the hashSet
        Set<E> result = new HashSet<>(setOne);
        // then when you get to add all you add the setTwo in the argument.
        result.addAll(setTwo);
        System.out.println("result "+ result);
        return result;
    }

}