package ru.netology.servise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(60);
        assertEquals(60, radio.getCurrentVolume());
    }


    @Test
    void shouldNonIncreaseVolumeThanMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldNonDecreaseVolumeThanMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolumeMin(0);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeMin() {
        Radio radio = new Radio();
        radio.setVolumeMin(0);
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeMax() {
        Radio radio = new Radio();
        radio.setVolumeMax(100);
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldSetCurrentRadioNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(3);
        assertEquals(3, radio.getCurrentRadioNumber());
    }


    @Test
    void shouldNotSetRadioNumberAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(9);
        radio.nextRadio();
        assertEquals(9, radio.getCurrentRadioNumber());
    }

    @Test
    void shouldNotSetRadioNumberBelongMin() {
        Radio radio = new Radio();
        radio.setNumberMinRadio(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentRadioNumber());
    }


    @Test
    void shouldSetNumberMinRadio() {
        Radio radio = new Radio();
        radio.setNumberMinRadio(0);
        assertEquals(0, radio.getCurrentRadioNumber());
    }


    @Test
    void shouldSetNextRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(3);
        radio.nextRadio();
        assertEquals(4, radio.getCurrentRadioNumber());
    }

    @Test
    void shouldSetPrevRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(4);
        radio.prevRadio();
        assertEquals(3, radio.getCurrentRadioNumber());
    }
}







