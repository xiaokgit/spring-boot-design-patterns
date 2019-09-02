package com.demo.abstractfactory;

/**
 * @Author: Xiaok
 * @Date: 2019/8/28 15:57
 * @version: 1.0
 * @Description:
 */
public class AF_Client {

    public static void main(String[] args){
        AF_ControllerFactory factory = new AF_OperationControllerFactory();
        AF_Android android = factory.createAndroid();
        AF_Symbian symbian = factory.createSymbian();
        AF_Windows windows = factory.createWindows();
        android.supported();
        symbian.supported();
        windows.supported();
    }

}
