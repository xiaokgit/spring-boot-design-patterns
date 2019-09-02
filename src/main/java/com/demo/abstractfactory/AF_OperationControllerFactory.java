package com.demo.abstractfactory;

/**
 * @Author: Xiaok
 * @Date: 2019/8/28 15:25
 * @version: 1.0
 * @Description:
 */
public class AF_OperationControllerFactory implements AF_ControllerFactory {
    @Override
    public AF_Android createAndroid() {
        return new AF_AndroidOperationController();
    }

    @Override
    public AF_Symbian createSymbian() {
        return new AF_SymbianOperationController();
    }

    @Override
    public AF_Windows createWindows() {
        return new AF_WindowsOperationController();
    }
}
