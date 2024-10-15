package ru.netology.radio;

import jdk.jfr.Registered;

import javax.annotation.processing.SupportedAnnotationTypes;

public class Radio {
    private int radioStations;
    private int maxRadioStation;
    private int minRadioStation;
    private int currentRadioStation;
    private int currentVolume;

    public Radio(int radioStations, int maxRadioStation, int minRadioStation) {
        this.radioStations = radioStations;
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
    }

    public Radio() {
        this.radioStations = 10;
    }

    public int getRadiostation() {
        return currentRadioStation;
    }

    public void setRadiostation(int newRadiostation) {
        if (newRadiostation > maxRadioStation) {
            return;
        }
        if (newRadiostation < minRadioStation) {
            return;
        }
        currentRadioStation = newRadiostation;
    }

    public void nextRadiostation(int nextNewRadiostation) {
        if (nextNewRadiostation > maxRadioStation) {
            nextNewRadiostation = minRadioStation;
        } else {
            nextNewRadiostation++;
        }
        currentRadioStation = nextNewRadiostation;
    }

    public void prevRadiostation(int prevNewRadiostation) {
        if (prevNewRadiostation < minRadioStation) {
            prevNewRadiostation = maxRadioStation;
        } else {
            prevNewRadiostation--;
        }
        currentRadioStation = prevNewRadiostation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume(int newCurrentVolumeMax) {
        if (newCurrentVolumeMax < 100) {
            newCurrentVolumeMax++;
        }
        if (newCurrentVolumeMax >= 100) {
            newCurrentVolumeMax = 100;
        }
        currentVolume = newCurrentVolumeMax;
    }

    public void decreaseVolume(int newCurrentVolumeMin) {
        if (newCurrentVolumeMin > 0) {
            newCurrentVolumeMin--;
        }
        if (newCurrentVolumeMin <= 0) {
            newCurrentVolumeMin = 0;
        }
        currentVolume = newCurrentVolumeMin;
    }
}