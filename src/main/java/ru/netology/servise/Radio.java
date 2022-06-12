package ru.netology.servise;

public class Radio {

    private int currentVolume;
    private int volumeMin = 0;
    private int volumeMax = 100;
    private int currentRadioNumber;
    private int numberMinRadio = 0;
    private int numberMaxRadio = 9;
    private int amountOffRadio = 10;

    public Radio (){
    }

    public Radio(int amountOffRadio) {
        this.amountOffRadio = amountOffRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getVolumeMin() {
        return volumeMin;
    }

    public void setVolumeMin(int volumeMin) {
        this.volumeMin = volumeMin;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public void setVolumeMax(int volumeMax) {
        this.volumeMax = volumeMax;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
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

    public int getNumberMinRadio() {
        return numberMinRadio;
    }

    public void setNumberMinRadio(int numberMinRadio) {
        this.numberMinRadio = numberMinRadio;
    }

    public int getNumberMaxRadio() {
        return numberMaxRadio;
    }

    public void setNumberMaxRadio(int numberMaxRadio) {
        this.numberMaxRadio = numberMaxRadio;
    }

    public int nextRadio() {
        currentRadioNumber = currentRadioNumber + 1;
        if (currentRadioNumber >= amountOffRadio) {
            currentRadioNumber = currentRadioNumber -1;
        }
        return currentRadioNumber;
    }

    public int prevRadio() {
        currentRadioNumber = currentRadioNumber - 1;
        if (currentRadioNumber < amountOffRadio) {
            currentRadioNumber = currentRadioNumber;
        }
        return currentRadioNumber;
    }

    public int getAmountOffRadio() {
        return amountOffRadio;
    }

    public void setAmountOffRadio(int amountOffRadio) {
        this.amountOffRadio = amountOffRadio;
    }
}

