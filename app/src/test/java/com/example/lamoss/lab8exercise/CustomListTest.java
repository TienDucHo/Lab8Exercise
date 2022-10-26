package com.example.lamoss.lab8exercise;

import org.junit.Before;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), listSize + 1);
    }
}


