package ru.netology.radio;

import jdk.jfr.Registered;

import javax.annotation.processing.SupportedAnnotationTypes;

public class Radio {
    private int radiostation;

    public int getRadiostation() {
        return radiostation;
    }

    public void setRadiostation(int newRadiostation) {
        if (newRadiostation > 9) {
            return;
        }
        if (newRadiostation < 0) {
            return;
        }
        radiostation = newRadiostation;
    }

    public void nextRadiostation(int nextNewRadiostation) {
        if (nextNewRadiostation > 9) {
            nextNewRadiostation = 0;
        } else {
            nextNewRadiostation++;
        }
        radiostation = nextNewRadiostation;
    }

    public void prevRadiostation(int prevNewRadiostation) {
        if (prevNewRadiostation < 0) {
            prevNewRadiostation = 9;
        } else {
            prevNewRadiostation--;
        }
        radiostation = prevNewRadiostation;
    }


    private int currentVolume;

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
