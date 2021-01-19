package org.example;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        StringFunctions sf = new StringFunctions();
        System.out.println("Reversed string :" + sf.stringReverse(s));
        System.out.println("Length :" + sf.stringLength(s));
    }
}
