package genspark.assignments.section1;

import genspark.assignments.Assignment;

public class StringConcat implements Assignment {
    public String solution(String str){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String str1 = "cats";
        String str2 = "t6700";
        String str3 = str1.concat(str2);

        System.out.println("solution: " + str3);

        return null;
    }
}
