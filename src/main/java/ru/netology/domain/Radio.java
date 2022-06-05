package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int setToMax;
    private int setToMin;
    private int increaseVolume;
    private int decreaseVolume;
    private int currentRadioNumber;
    private int minRadioNumber;
    private int maxRadioNumber;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setToMax() {
        currentVolume = 10;
    }

    public void setToMin() {
        currentVolume = 0;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentRadioNumber() {
        return currentRadioNumber;
    }

    public void setCurrentRadioNumber(int currentRadioNumber) {
        if (currentRadioNumber < 0) {
            return;
        }
        if (currentRadioNumber > 9) {
            return;
        }
        this.currentRadioNumber = currentRadioNumber;
    }

    public void setMaxRadioNumber() {
        currentRadioNumber = 9;
    }

    public void setMinRadioNumber() {
        currentRadioNumber = 0;
    }

    public void turnUpRadioNumber() {
        if (currentRadioNumber < 9) {
            currentRadioNumber = currentRadioNumber + 1;
        }
    }

    public void turnDownRadioNumber() {
        if (currentRadioNumber > 0) {
            currentRadioNumber = currentRadioNumber - 1;
        }
    }

}
