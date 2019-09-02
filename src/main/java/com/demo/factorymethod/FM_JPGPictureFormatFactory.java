package com.demo.factorymethod;

/**
 * @Author: Xiaok
 * @Date: 2019/8/27 15:00
 * @version: 1.0
 * @Description: 创建读取JPG图片格式的工厂
 */
public class FM_JPGPictureFormatFactory implements FM_PictureFormatFactory {
    @Override
    public FM_PictureFormat createPictureFormat() {
        return new FM_JPGPictureFormat();
    }
}
