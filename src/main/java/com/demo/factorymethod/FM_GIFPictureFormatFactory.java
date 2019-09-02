package com.demo.factorymethod;

/**
 * @Author: Xiaok
 * @Date: 2019/8/27 14:59
 * @version: 1.0
 * @Description: 创建读取gif图片格式的工厂类
 */
public class FM_GIFPictureFormatFactory implements FM_PictureFormatFactory {
    @Override
    public FM_PictureFormat createPictureFormat() {
        return new FM_GIFPictureFormat();
    }
}
