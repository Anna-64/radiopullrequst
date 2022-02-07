package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


//    @Test
//    public void shouldInitFields() {//инициализируем поля
//        Radio radio = new Radio();
//
//        assertEquals(0, radio.getCurrentRadioStation());
//    }

    @Test
    void getNumberChanel() {
        Radio radio = new Radio(10);
        int expected = 9;
        int actual = radio.getNumberChanel();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChanel2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChanel3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChanel6() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void next1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void next3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void next4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void prev1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void prev3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void prev4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getNumberChanel();

        assertEquals(expected, actual);
    }

    @Test
    void getCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        int expected = 3;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void up1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.up();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    public void up3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.up();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void up4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.up();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void down1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.down();
        int expected = 99;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void down2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.down();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void down3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.down();
        int expected =49;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}


