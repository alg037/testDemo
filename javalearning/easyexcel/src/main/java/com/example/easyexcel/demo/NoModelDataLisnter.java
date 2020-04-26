package com.example.easyexcel.demo;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.metadata.holder.ReadRowHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NoModelDataLisnter extends AnalysisEventListener<Map<Integer,String>> {
   List<Map<Integer,String>> list=new ArrayList<>();

    /**
     * 处理每一行
     * @param integerStringMap
     * @param analysisContext
     */
    @Override
    public void invoke(Map<Integer, String> integerStringMap, AnalysisContext analysisContext) {
        ReadRowHolder readRowHolder = analysisContext.readRowHolder();
        list.add(integerStringMap);
        for (Map.Entry<Integer, String> integerStringEntry : integerStringMap.entrySet()) {
            System.out.print(integerStringEntry.getValue()+" ");
        }
        System.out.println();
    }

    /**
     * 读取完毕后处理
     * @param analysisContext
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("所有数据解析完成");
    }

    /**
     * 读取表头信息
     * @param headMap
     * @param context
     */
    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        System.out.println("表头");
        for (Map.Entry<Integer, String> integerStringEntry : headMap.entrySet()) {
            System.out.print(integerStringEntry.getValue()+" ");
        }
        System.out.println();
    }
}
