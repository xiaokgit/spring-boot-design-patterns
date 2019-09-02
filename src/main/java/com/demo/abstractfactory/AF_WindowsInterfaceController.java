package com.demo.abstractfactory;

/**
 * @Author: Xiaok
 * @Date: 2019/8/28 15:23
 * @version: 1.0
 * @Description: 具体产品
 */
public class AF_WindowsInterfaceController implements AF_Windows {
    @Override
    public void supported() {
        System.out.println("支持Windows界面控制器...");
    }
}
