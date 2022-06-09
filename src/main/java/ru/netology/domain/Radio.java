package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int toMax = 10;
    private int toMin = 0;
    private int increaseVolume;
    private int decreaseVolume;
    private int currentRadioNumber;
    private int minRadioNumber = 0;
    private int maxRadioNumber =9;


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

    public void toMax(int toMax) {

        currentVolume = 10;
    }

    public void toMin(int toMin) {

        currentVolume = 0;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 9) {
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

    public void setMaxRadioNumber(int maxRadioNumber) {

        currentRadioNumber = 9;
    }

    public void setMinRadioNumber(int minRadioNumber) {

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