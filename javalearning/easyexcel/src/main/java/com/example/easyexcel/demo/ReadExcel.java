package com.example.easyexcel.demo;

import com.alibaba.excel.EasyExcel;

public class ReadExcel {

    public static void main(String[] args) {
        String fileName = "/Users/alg037/Documents/code/SampleCode/javalearning/target/classes/demo.xlsx";
        System.out.println("读取文件地址："+fileName);
        EasyExcel.read(fileName,new NoModelDataLisnter()).sheet().doRead();
    }


}
