package com.demo.abstractfactory;

/**
 * @Author: Xiaok
 * @Date: 2019/8/28 15:22
 * @version: 1.0
 * @Description: 具体产品
 */
public class AF_SymbianInterfaceController implements AF_Symbian {
    @Override
    public void supported() {
        System.out.println("支持Symbian界面控制器...");
    }
}
