package com.demo.factorymethod;

/**
 * @Author: Xiaok
 * @Date: 2019/8/27 14:57
 * @version: 1.0
 * @Description: 工厂方法模式:优点：一个产品类对应一个工厂类，新加产品时，不需要修改之前的工程类，只需要添加一个产品类和一个工厂类即可，符合“开闭原则”。
 *  缺点：每次新加产品类，系统的类都是成对增加的。
 *  创建图片读取器工厂类
 */
public interface FM_PictureFormatFactory {

    FM_PictureFormat createPictureFormat();

}
