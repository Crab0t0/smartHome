package ru.netology.qa.smartHome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio station = new Radio();

    @Test
    public void countQuantityRadioStation() {
        station.setCurrentRadioStation(19);

        Assertions.assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStation() {

        station.setCurrentRadioStation(7);

        Assertions.assertEquals(7, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationUnderZero() {

        station.setCurrentRadioStation(-1);

        Assertions.assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationZero() {

        station.setCurrentRadioStation(7);
        station.setCurrentRadioStation(0);

        Assertions.assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationOne() {

        station.setCurrentRadioStation(1);

        Assertions.assertEquals(1, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationMoreThanNine() {
        station.setCurrentRadioStation(10);
        Assertions.assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationNine() {
        station.setCurrentRadioStation(9);
        Assertions.assertEquals(9, station.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationEight() {
        station.setCurrentRadioStation(8);
        Assertions.assertEquals(8, station.getCurrentRadioStation());
    }

    @Test
    public void switchNextStation() {
        station.setCurrentRadioStation(5);
        station.nextStation();
        Assertions.assertEquals(6, station.getCurrentRadioStation());
    }

    @Test
    public void switchNextStationMin() {
        station.setCurrentRadioStation(0);
        station.nextStation();
        Assertions.assertEquals(1, station.getCurrentRadioStation());
    }

    @Test
    public void switchNextStationMaх() {
        station.setCurrentRadioStation(9);
        station.nextStation();
        Assertions.assertEquals(0, station.getCurrentRadioStation());
    }

    @Test
    public void switchPrevStation() {
        station.setCurrentRadioStation(7);
        station.prevStation();
        Assertions.assertEquals(6, station.getCurrentRadioStation());
    }

    @Test
    public void switchPrevStationMin() {
        station.setCurrentRadioStation(0);
        station.prevStation();
        Assertions.assertEquals(9, station.getCurrentRadioStation());
    }

    @Test
    public void switchPrevStationMaх() {
        station.setCurrentRadioStation(9);
        station.prevStation();
        Assertions.assertEquals(8, station.getCurrentRadioStation());
    }

    @Test
    public void increaseVolumeNext() {
        station.setCurrentSoundVolume(50);
        station.increaseVolume();
        Assertions.assertEquals(51, station.getCurrentSoundVolume());
    }

    @Test
    public void increaseVolumeMaх() {
        station.setCurrentSoundVolume(100);
        station.increaseVolume();
        Assertions.assertEquals(100, station.getCurrentSoundVolume());
    }

    @Test
    public void decreaseVolumeUnderZero() {
        station.setCurrentSoundVolume(-1);
        station.decreaseVolume();
        Assertions.assertEquals(0, station.getCurrentSoundVolume());
    }

    @Test
    public void decreaseVolumeZero() {
        station.setCurrentSoundVolume(0);
        station.decreaseVolume();
        Assertions.assertEquals(0, station.getCurrentSoundVolume());
    }

    @Test
    public void decreaseVolumeToZero() {
        station.setCurrentSoundVolume(1);
        station.decreaseVolume();
        Assertions.assertEquals(0, station.getCurrentSoundVolume());
    }

    @Test
    public void setVolumeUnderHundred() {
        station.setCurrentSoundVolume(101);
        Assertions.assertEquals(0, station.getCurrentSoundVolume());
    }

    @Test
    public void increaseVolumeHundred() {
        station.setCurrentSoundVolume(100);
        station.increaseVolume();
        Assertions.assertEquals(100, station.getCurrentSoundVolume());
    }

    @Test
    public void increaseVolumeToHundred() {
        station.setCurrentSoundVolume(99);
        station.increaseVolume();
        Assertions.assertEquals(100, station.getCurrentSoundVolume());
    }
}

