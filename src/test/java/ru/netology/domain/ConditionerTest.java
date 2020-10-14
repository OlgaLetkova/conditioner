package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(23);
        conditioner.increaseCurrentTemperature();
        assertEquals(24,conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30,conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(35);
        conditioner.increaseCurrentTemperature();
        assertEquals(30,conditioner.getCurrentTemperature());

    }
    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(16);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        assertEquals(19,conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(16);
        conditioner.decreaseCurrentTemperature();
        assertEquals(16,conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(12);
        conditioner.decreaseCurrentTemperature();
        assertEquals(16,conditioner.getCurrentTemperature());
    }
}


