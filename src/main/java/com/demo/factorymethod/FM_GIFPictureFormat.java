package com.demo.factorymethod;

/**
 * @Author: Xiaok
 * @Date: 2019/8/27 14:55
 * @version: 1.0
 * @Description:
 */
public class FM_GIFPictureFormat implements FM_PictureFormat {
    @Override
    public void writeFormat() {
        System.out.println("读取GIF图片格式...");
    }
}
