import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void shouldNextMaxRadiostation() {
        Radio radio = new Radio(10);
        radio.maxRadioStation = 9;
        radio.minRadioStation = 0;
        radio.nextRadiostation(11);
        Assertions.assertEquals(0, radio.getRadiostation());

    }

    @Test
    public void shouldPrevMinRadiostation() {
        Radio radio = new Radio(10);
        radio.maxRadioStation = 9;
        radio.minRadioStation = 0;
        radio.prevRadiostation(-1);
        Assertions.assertEquals(9, radio.getRadiostation());
    }

    @Test
    public void shouldSetRadiostation() {
        Radio radio = new Radio(10);
        radio.maxRadioStation = 9;
        radio.minRadioStation = 0;
        radio.setRadiostation(7);
        Assertions.assertEquals(7, radio.getRadiostation());
    }

    @Test
    public void shouldPrevRadiostation() {
        Radio radio = new Radio(10);
        radio.maxRadioStation = 9;
        radio.minRadioStation = 0;
        radio.prevRadiostation(4);
        Assertions.assertEquals(3, radio.getRadiostation());
    }

    @Test
    public void shouldNextRadiostation() {
        Radio radio = new Radio(10);
        radio.maxRadioStation = 9;
        radio.minRadioStation = 0;
        radio.nextRadiostation(5);
        Assertions.assertEquals(6, radio.getRadiostation());
    }

    @Test
    public void shouldRadiostationOverSetMax() {
        Radio radio = new Radio(10);
        radio.maxRadioStation = 9;
        radio.minRadioStation = 0;
        radio.setRadiostation(20);
        Assertions.assertEquals(0, radio.getRadiostation());

    }

    @Test
    public void shouldSetRadiostationUnlimited() {
        Radio radio = new Radio(10);
        radio.maxRadioStation = 9;
        radio.minRadioStation = 0;
        radio.setRadiostation(-7);
        Assertions.assertEquals(0, radio.getRadiostation());

    }
    @Test
    public void shouldSetRadiostationXX(){
        Radio radioD = new Radio(20);
        radioD.maxRadioStation = 19;
        radioD.minRadioStation = 0;
        radioD.setRadiostation(15);
        Assertions.assertEquals(15,radioD.getRadiostation());
    }

    @Test
    public void shouldVolumeSetCurrent() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeOverSet() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(200);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentCurrentVolumeDecrease() {
        Radio radio = new Radio(10);
        radio.decreaseVolume(62);
        int expected = 61;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentCurrentVolumeDecreaseOver() {
        Radio radio = new Radio(10);
        radio.decreaseVolume(-2);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentCurrentVolumeIncrease() {
        Radio radio = new Radio(10);
        radio.increaseVolume(77);
        int expected = 78;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentCurrentVolumeIncreaseOver() {
        Radio radio = new Radio(10);
        radio.increaseVolume(101);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeUnOverSet() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(-100);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}