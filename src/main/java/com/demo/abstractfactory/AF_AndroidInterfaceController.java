package com.demo.abstractfactory;

/**
 * @Author: Xiaok
 * @Date: 2019/8/28 15:21
 * @version: 1.0
 * @Description: 具体产品
 */
public class AF_AndroidInterfaceController implements AF_Android {
    @Override
    public void supported() {
        System.out.println("支持Android界面控制器...");
    }
}
