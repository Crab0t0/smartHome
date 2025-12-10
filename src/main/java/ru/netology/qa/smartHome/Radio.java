package ru.netology.qa.smartHome;

public class Radio {

    public int currentRadioStation;         //текущая радиостанция

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

    public int currentSoundVolume;          // тукущая громкость звука

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

    public void minSoundVolume() {           //мин. громкость
        currentSoundVolume = 0;
    }

    public void maxSoundVolume() {           // мак.громкость звука
        currentSoundVolume = 100;
    }

    public void increaseVolume() {          // увелечение громкости +1
        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseVolume() {       //уменьшение громкости - 1
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }

    }


//    public void noIncreaseInMaximumVolume() {       //не увеличение максимальной громкости
//    if (currentSoundVolume >= 100) {
//        currentSoundVolume = 100;
//    }
//
//    }

}
