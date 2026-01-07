package com.stringbufferconcatenate;

public class StringBufferConcatenate {

    public static void main(String[] args) {
        String[] arr = {"Java", " ", "is", " ", "powerful"};

        StringBuffer sb = new StringBuffer();

        for (String str : arr) {
            sb.append(str);
        }

        System.out.println(sb.toString());
    }
}
