package com.demo.factorymethod;

/**
 * @Author: Xiaok
 * @Date: 2019/8/27 14:56
 * @version: 1.0
 * @Description:
 */
public class FM_JPGPictureFormat implements FM_PictureFormat {
    @Override
    public void writeFormat() {
        System.out.println("读取JPG图片格式...");
        //do something
    }
}
