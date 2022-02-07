package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testCurrent() {
        Radio cond = new Radio();  //узнаем текущую радиостанцию

        int expected = 0;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNumber10() {
        Radio cond = new Radio();  //увеличиваю текущую радиостанцию на 10

        cond.setCurrentRadioStation(10);
        int expected = 0;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNumber9() {
        Radio cond = new Radio();  //увеличиваю текущую радиостанцию на 9

        cond.setCurrentRadioStation(9);
        cond.setCurrentRadioStationNext();
        int expected = 0;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNumber8() {
        Radio cond = new Radio();  //увеличиваю текущую радиостанцию на 8

        cond.setCurrentRadioStation(8);
        cond.setCurrentRadioStationNext();
        int expected = 9;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void next0() {
        Radio cond = new Radio();  //увеличиваю текущую радиостанцию с 0

        cond.setCurrentRadioStation(0);
        cond.setCurrentRadioStationNext();
        int expected = 1;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prev9() {
        Radio cond = new Radio();  //уменьшаю радиостанцию с 9

        cond.setCurrentRadioStation(9);
        cond.setCurrentRadioStationPrev();
        int expected = 8;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prev0() {
        Radio cond = new Radio();  //уменьшаю радиостанцию с 9

        cond.setCurrentRadioStation(0);
        cond.setCurrentRadioStationPrev();
        int expected = 9;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prev5() {
        Radio cond = new Radio();  //уменьшаю радиостанцию с 5

        cond.setCurrentRadioStation(5);
        cond.setCurrentRadioStationPrev();
        int expected = 4;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testCurrentVolume() {
        Radio cond = new Radio();  //узнаем текущую громкость


        int expected = 0;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume0() {
        Radio cond = new Radio();  //увеличиваю громкость на 1

        cond.setCurrentVolume(0);
        cond.volumePlus();
        int expected = 1;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1() {
        Radio cond = new Radio();  //увеличиваю громкость на 1

        cond.setCurrentVolume(1);
        cond.volumePlus();
        int expected = 2;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume9() {
        Radio cond = new Radio();  //увеличиваю громкость на 1

        cond.setCurrentVolume(9);
        cond.volumePlus();
        int expected = 10;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseMax() {
        Radio cond = new Radio();  //увеличиваю громкость на 1 max

        cond.setCurrentVolume(10);
        cond.volumePlus();
        int expected = 10;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void reducingVolumeMin() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);
        cond.volumeMinus();
        int expected = 0;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void reducingVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(10);
        cond.volumeMinus();
        int expected = 9;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void reducingVolume1() {
        Radio cond = new Radio();

        cond.setCurrentVolume(1);
        cond.volumeMinus();
        int expected = 0;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void reducingVolume5() {
        Radio cond = new Radio();

        cond.setCurrentVolume(5);
        cond.volumeMinus();
        int expected = 4;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }
}

