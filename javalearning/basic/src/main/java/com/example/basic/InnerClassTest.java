package com.example.basic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class InnerClassTest  {

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.details =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            InnerClass.data data1=new InnerClass.data(String.valueOf(i),i);
            innerClass.details.add(data1);
        }

        for (InnerClass.data detail : innerClass.details) {
            System.out.println(detail.getName());
        }
    }

}
