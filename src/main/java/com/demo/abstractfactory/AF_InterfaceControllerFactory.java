package com.demo.abstractfactory;

/**
 * @Author: Xiaok
 * @Date: 2019/8/28 15:27
 * @version: 1.0
 * @Description:
 */
public class AF_InterfaceControllerFactory implements AF_ControllerFactory {
    @Override
    public AF_Android createAndroid() {
        return new AF_AndroidInterfaceController();
    }

    @Override
    public AF_Symbian createSymbian() {
        return new AF_SymbianInterfaceController();
    }

    @Override
    public AF_Windows createWindows() {
        return new AF_WindowsInterfaceController();
    }
}
