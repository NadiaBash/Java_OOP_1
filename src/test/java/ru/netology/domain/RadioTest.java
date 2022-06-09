package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setCurrentVolume(11);
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetToMax() {
        Radio radio = new Radio();
        radio.toMax(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void shouldSetToMin() {
        Radio radio = new Radio();
        radio.toMin(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.decreaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(10);
        radio.setCurrentRadioNumber(-1);
        radio.setCurrentRadioNumber(0);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTurnToMaxRadioNumber() {
        Radio radio = new Radio();
        radio.setMaxRadioNumber(9);
        int expected = 9;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTurnToMinRadioNumber() {
        Radio radio = new Radio();
        radio.setMinRadioNumber(0);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTurnUpRadioNumber() {
        Radio radio = new Radio();
        radio.setMinRadioNumber(0);;
        radio.turnUpRadioNumber();
        int expected = 1;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotTurnUpRadioNumber() {
        Radio radio = new Radio();
        radio.setMaxRadioNumber(9);
        radio.turnUpRadioNumber();
        int expected = 9;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTurnDownRadioNumber() {
        Radio radio = new Radio();
        radio.setMaxRadioNumber(9);
        radio.setCurrentRadioNumber(9);
        radio.turnDownRadioNumber();
        int expected = 8;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }


    @Test
    void shouldNotTurnDownRadioNumber() {
        Radio radio = new Radio();
        radio.setMinRadioNumber(0);
        radio.setCurrentRadioNumber(-1);
        radio.turnDownRadioNumber();
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

}