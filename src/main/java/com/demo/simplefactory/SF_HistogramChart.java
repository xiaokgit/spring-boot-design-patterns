package com.demo.simplefactory;

/**
 * @Author: Xiaok
 * @Date: 2019/8/27 11:43
 * @version: 1.0
 * @Description: 柱状图类
 */
public class SF_HistogramChart implements SF_Chart {

    public SF_HistogramChart(){
        System.out.println("创建柱状图...");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图...");
    }
}
