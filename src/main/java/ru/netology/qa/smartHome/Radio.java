package ru.netology.qa.smartHome;

public class Radio {

    private int currentRadioStation;         // текущая радиостанция
    private int currentSoundVolume;          // текущая громкость звука

    public Radio() {
        this.currentRadioStation = 0;
        this.currentSoundVolume = 0;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nexRadioStation() {     // переключение на следующую станцию
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void revRadioStation() {     // переключение на предыдущую станцию
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 100) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void minSoundVolume() {           // мин. громкость
        currentSoundVolume = 0;
    }

    public void maxSoundVolume() {           // мак. громкость звука
        currentSoundVolume = 100;
    }

    public void increaseVolume() {          // увеличение громкости +1
        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseVolume() {       // уменьшение громкости - 1
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }
}