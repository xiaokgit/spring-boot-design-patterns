package com.demo.simplefactory;

/**
 * @Author: Xiaok
 * @Date: 2019/8/27 11:45
 * @version: 1.0
 * @Description: 饼状图类
 */
public class SF_PieChart implements SF_Chart {

    public SF_PieChart(){
        System.out.println("创建饼状图...");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图...");
    }
}
