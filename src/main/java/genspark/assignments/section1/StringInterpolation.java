package genspark.assignments.section1;

import genspark.assignments.Assignment;

public class StringInterpolation implements Assignment {
    public String solution(String str){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String str1 = "Genspark";
        String str2 = "to improve";
        String message = str1+" provides a great opportunity "+ str2 + " the Java skills";

        System.out.println(message);

        return null;
    }
}
