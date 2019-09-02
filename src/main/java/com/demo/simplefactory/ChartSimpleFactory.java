package com.demo.simplefactory;

/**
 * @Author: Xiaok
 * @Date: 2019/8/27 11:47
 * @version: 1.0
 * @Description: 简单工厂模式：
 *  图表简单工厂类，根据getChart的参数返回具体的图表类
 *
 *  简单工厂模式：优点：1.无需客户端直接创建实例，只需要知道参数对应的实例，即可获取实例；2.可以根据配置文件，在不修改代码的情况下更换具体的实例。
 *      缺点：1.简单工厂模式会增加系统的类的个数；2.添加新的实例对象不得不修改工厂代码，在工厂中实例类型过多时，会造成工厂逻辑复杂，不利于系统维护和扩展。
 */
public class ChartSimpleFactory {

    //根据具体的参数返回具体的对象
    public static SF_Chart getChart(String type){
        if("histogram".equals(type)){
            return new SF_HistogramChart();
        }else if("pie".equals(type)){
            return new SF_PieChart();
        }else if("line".equals(type)){
            return new SF_LineChart();
        }else {
            return null;
        }
    }

}
