package com.example.easyexcel.demo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class ExportExcelData {
    @ExcelProperty("姓名")
    String name;

    @ExcelProperty("年龄")
    Integer age;
}
