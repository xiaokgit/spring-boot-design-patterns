package com.demo.simplefactory;

/**
 * @Author: Xiaok
 * @Date: 2019/8/27 11:46
 * @version: 1.0
 * @Description: 线状图类
 */
public class SF_LineChart implements SF_Chart {

    public SF_LineChart(){
        System.out.println("创建线状图...");
    }

    @Override
    public void display() {
        System.out.println("显示线状图...");
    }
}
