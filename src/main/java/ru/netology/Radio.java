package ru.netology;

public class Radio {
    private int currentRadioStation; //запрашиваем текущую радиостанцию
    private int currentVolume; // запрашиваем текущую громкость

    public int getCurrentRadioStation() { //узнаем текущую радиостанцию
        return this.currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {  //увеличиваю текущую радиостанцию на 10
        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = 9;
        }
        if (newCurrentRadioStation > 9) {
            newCurrentRadioStation = 0;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentRadioStationNext() {  //увеличиваю текущую радиостанцию на 9

        setCurrentRadioStation(currentRadioStation + 1);
    }

    public void setCurrentRadioStationPrev() {  //
        setCurrentRadioStation(currentRadioStation - 1);
    }

    public int getCurrentVolume() { //узнаем текущую громкость
        return this.currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) { //увеличиваю громкость на 1
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void volumePlus() {
        setCurrentVolume(currentVolume + 1);
    }

    public void volumeMinus() {
        setCurrentVolume(currentVolume - 1);
    }
}


