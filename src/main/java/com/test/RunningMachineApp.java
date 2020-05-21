package com.test;

import java.util.HashMap;
import java.util.Map;

public class RunningMachineApp {
    public static void main(String[] args) {

        Map<String, Integer> itemMap = new HashMap<String, Integer>();
        //TODO We can create class that use factory pattern to get SnackItem or Drink Items.
        Items snacksItems = new SnacksItem(itemMap);

        snacksItems.addItems("Lays", 5);

        int receivedItems = snacksItems.withdrawItems("Lays", 2);

        //TODO We can use Decorator patter to calculate price based on Item's quantity.

        System.out.println("Received number of items ::: " + receivedItems);


    }
}
