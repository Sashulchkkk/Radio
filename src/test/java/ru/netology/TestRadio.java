package ru.netology;

import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {



    @Test
    public void testNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        Assertions.assertEquals(6, radio.getCurrentStation());

        radio.setCurrentStation(9);
        radio.next();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.prev();
        Assertions.assertEquals(2, radio.getCurrentStation());

        radio.setCurrentStation(0);
        radio.prev();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testGetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        Assertions.assertEquals(4, radio.getCurrentStation());

        radio.setCurrentStation(-1);
        Assertions.assertEquals(4, radio.getCurrentStation());

        radio.setCurrentStation(10);
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void testGetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void testSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(30);
        Assertions.assertEquals(30, radio.getCurrentVolume());

        radio.setCurrentVolume(-1);
        Assertions.assertEquals(30, radio.getCurrentVolume());

        radio.setCurrentVolume(110);
        Assertions.assertEquals(30, radio.getCurrentVolume());
    }
}
