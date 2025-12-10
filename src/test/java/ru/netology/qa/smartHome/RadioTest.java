package ru.netology.qa.smartHome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadio() {           //можно установить радиостанцию
        Radio station = new Radio();
        station.currentRadioStation = 2;

        int expected = 2;
        int actual = station.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSoundVolume() {         //установленная грмкость
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(20);

        int expected = 20;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSoundVolume() {           //мак.установленная громкость
        Radio volume = new Radio();
        volume.maxSoundVolume();

        int expected = 100;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NoMaxSoundVolume() {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(111);

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {      // увелечение громкости +1.
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(11);
        volume.increaseVolume();

        int expected = 12;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {      // уменьшение громкости -1.
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(11);
        volume.decreaseVolume();

        int expected = 10;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minDecreaseVolume0() {          // уменьшение меньше 0
        Radio volume = new Radio();
        volume.minSoundVolume();
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void noIncreaseInMaximumVolume() {      // увелечение выше  100.
        Radio volume = new Radio();
        volume.maxSoundVolume();

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nexRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);

        station.nexRadioStation();
        station.nexRadioStation();

        int expected = 1;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void revRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);

        station.revRadioStation();
        station.revRadioStation();

        int expected = 8;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeVolumeValue() {      // громкость меньше 0
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeStation() {      // станция меньше 0
        Radio volume = new Radio();
        volume.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = volume.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationIsBigger() {      // станция больше 9
        Radio volume = new Radio();
        volume.setCurrentRadioStation(10);

        int expected = 0;
        int actual = volume.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnUpTheVolume() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(111);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


}
