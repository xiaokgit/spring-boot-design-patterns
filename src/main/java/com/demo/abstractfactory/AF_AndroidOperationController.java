package com.demo.abstractfactory;

/**
 * @Author: Xiaok
 * @Date: 2019/8/28 15:20
 * @version: 1.0
 * @Description: 具体产品
 */
public class AF_AndroidOperationController implements AF_Android {
    @Override
    public void supported() {
        System.out.println("支持Android操作控制器...");
    }
}
