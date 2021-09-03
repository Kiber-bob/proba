package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Conditioner;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test

    public void shouldInitFields() {
        Conditioner conditioner = new Conditioner();

        assertEquals("Panasonic", conditioner.getName());
        assertEquals(25, conditioner.getMaxTemperature());
        assertEquals(16, conditioner.getMinTemperature());
    }

}