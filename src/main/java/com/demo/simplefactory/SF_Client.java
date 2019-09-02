package com.demo.simplefactory;

/**
 * @Author: Xiaok
 * @Date: 2019/8/27 11:53
 * @version: 1.0
 * @Description: 简单工厂模式测试类，根据参数返回具体的实体。
 */
public class SF_Client {

    public static void main(String[] args){
        //此参数可以通过配置xml文件获取，之后根据需要的实体修改xml文件即可
        //String type = getTypeByXml(); //通过xml文件获取type类型
        SF_Chart sf_chart = ChartSimpleFactory.getChart("pie");
        sf_chart.display();
    }

}
