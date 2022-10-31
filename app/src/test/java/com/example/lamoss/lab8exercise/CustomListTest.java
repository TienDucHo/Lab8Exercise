package com.example.lamoss.lab8exercise;

import org.junit.Before;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.countCity();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.countCity(), listSize + 1);
    }

    @Test
    public void hasCityTest() {
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void countCityTest() {
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(1, list.countCity());
    }
}


