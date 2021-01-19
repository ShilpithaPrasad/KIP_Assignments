package org.example;
public class StringFunctions {
    public String stringReverse(String s) {
        StringBuffer ss = new StringBuffer(s);
        ss = ss.reverse();
        return ss.toString();
    }
    public int stringLength(String s) {
        int t = s.length();
        return t;
    }
}
