package com;

import com.test.Items;
import com.test.SnacksItem;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestSnackItems {

    Map<String, Integer> testItemMap = null;

    @BeforeClass
    public void init(){
        testItemMap  = new HashMap<String, Integer>();
    }

    @Test
    public void testOrderItemEqualtoORLessthan(){

        Items items = new SnacksItem(testItemMap);
        items.addItems("Lays",2 );

        int item = items.withdrawItems("Lays",2);

        assertEquals(2,item);

    }

    @Test
    public void testOrderItemEqualtoORGreaterthan(){

        Items items = new SnacksItem(testItemMap);
        items.addItems("Lays", 2);

        int item = items.withdrawItems("Lays",5);

        assertEquals(0,item);

    }
}
