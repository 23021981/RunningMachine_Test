package com.test;

import java.util.Map;

public class SnacksItem implements Items {

    Map<String, Integer> items;

   public SnacksItem(Map<String, Integer> items){
       this.items = items;
   }


    public void addItems(String itemName, Integer quantity) {
        if(items.containsKey(itemName)){

            items.put(itemName,items.get(itemName) + quantity);
        } else {
            items.put(itemName, quantity);
        }

    }

    public int withdrawItems(String itemName, Integer reqQuantity) {

        int availQuantity = items.get(itemName);
        if(availQuantity >= reqQuantity){
            items.put(itemName,availQuantity - reqQuantity);
        } else {
            System.out.println("Item is not sufficient to withdraw");
            return 0;
        }
        
        return reqQuantity;

    }
}
