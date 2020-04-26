package com.example.easyexcel.demo;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class WriteExcel {

    public static void main(String[] args) {
        String fileName = WriteExcel.class.getResource("/").getPath()+System.currentTimeMillis()+".xlsx";
        System.out.println("保存文件地址："+fileName);
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, ExportExcelData.class).sheet("表1").doWrite(data());
    }

    private static List<ExportExcelData> data(){
        List<ExportExcelData> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ExportExcelData exportExcelData = new ExportExcelData();
            exportExcelData.setName(String.valueOf(i));
            exportExcelData.setAge(i+20);
            list.add(exportExcelData);
        }
        return list;
    }
}
