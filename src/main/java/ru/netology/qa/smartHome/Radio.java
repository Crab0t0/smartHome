package ru.netology.qa.smartHome;

public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;
    private int maxRadioStation;

    public Radio() {
        maxRadioStation = 9;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation ++;
            return;
        }
        else {
            currentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation > 0) {
            currentRadioStation --;
            return;
        }
        else {
            currentRadioStation = maxRadioStation;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            return;
        }
        if (currentSoundVolume > 100) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void increaseVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
            return;
        } else {
            currentSoundVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
            return;
        } else {
            currentSoundVolume = 0;
        }
    }
}
