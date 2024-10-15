import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    Radio radio = new Radio(10, 9, 0);

    @Test
    public void shouldNextMaxRadiostation() {
        radio.nextRadiostation(11);
        Assertions.assertEquals(0, radio.getRadiostation());

    }

    @Test
    public void shouldPrevMinRadiostation() {
        radio.prevRadiostation(-1);
        Assertions.assertEquals(9, radio.getRadiostation());
    }

    @Test
    public void shouldSetRadiostation() {
        radio.setRadiostation(7);
        Assertions.assertEquals(7, radio.getRadiostation());
    }

    @Test
    public void shouldPrevRadiostation() {
        radio.prevRadiostation(4);
        Assertions.assertEquals(3, radio.getRadiostation());
    }

    @Test
    public void shouldNextRadiostation() {
        radio.nextRadiostation(5);
        Assertions.assertEquals(6, radio.getRadiostation());
    }

    @Test
    public void shouldRadiostationOverSetMax() {
        radio.setRadiostation(20);
        Assertions.assertEquals(0, radio.getRadiostation());

    }

    @Test
    public void shouldSetRadiostationUnlimited() {
        radio.setRadiostation(-7);
        Assertions.assertEquals(0, radio.getRadiostation());

    }

    @Test
    public void shouldVolumeSetCurrent() {
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeOverSet() {
        radio.setCurrentVolume(200);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentCurrentVolumeDecrease() {
        radio.decreaseVolume(62);
        int expected = 61;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentCurrentVolumeDecreaseOver() {
        radio.decreaseVolume(-2);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentCurrentVolumeIncrease() {
        radio.increaseVolume(77);
        int expected = 78;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentCurrentVolumeIncreaseOver() {
        radio.increaseVolume(101);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeUnOverSet() {
        radio.setCurrentVolume(-100);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}