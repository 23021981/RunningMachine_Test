package com.test.factory;

import com.test.VendingMachine;
import com.test.VendingMachineImpl;

public class VendingMachineFactory {
    public static VendingMachine createVendingMachine() {
        return new VendingMachineImpl();
    }

}
