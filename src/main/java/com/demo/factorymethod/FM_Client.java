package com.demo.factorymethod;

/**
 * @Author: Xiaok
 * @Date: 2019/8/27 15:01
 * @version: 1.0
 * @Description:
 */
public class FM_Client {

    public static void main(String[] args){
        FM_PictureFormatFactory factory = new FM_GIFPictureFormatFactory();
        FM_PictureFormat pictureFormat = factory.createPictureFormat();
        pictureFormat.writeFormat();
    }

}
