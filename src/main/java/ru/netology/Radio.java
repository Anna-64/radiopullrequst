package ru.netology;

public class Radio {
    private int currentRadioStation; //текущая радиостанция
    private int currentVolume; // текущую громкость
    private int numberRadioStation = 10 - 1; //количество радиостанций

    public Radio(int numberRadioStation) {
        this.numberRadioStation = numberRadioStation - 1;
    }

    public Radio() {

    }

    public int getNumberChanel() {
        return this.numberRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentChanel) {
        if (currentChanel < 0) {
            currentChanel = 9;
        }
        if (currentChanel > 9) {
            currentChanel = 0;
        }
        this.currentRadioStation = currentChanel;
    }

    public void next() {
        setCurrentRadioStation(currentRadioStation = currentRadioStation + 1);
    }

    public void prev() {
        setCurrentRadioStation(currentRadioStation = currentRadioStation - 1);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public void up() {
        setCurrentVolume(currentVolume = currentVolume + 1);
    }

    public void down() {
        setCurrentVolume(currentVolume = currentVolume - 1);
    }
}