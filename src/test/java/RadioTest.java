import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void shouldSetRadiostation() {
        Radio cond = new Radio();
        cond.setRadiostation(7);

        int expected = 7;
        int actual = cond.getRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadiostationPrevMin() {
        Radio cond = new Radio();
        cond.prevRadiostation(-1);

        int expected = 9;
        int actual = cond.getRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadiostationNextMax() {
        Radio cond = new Radio();
        cond.nextRadiostation(10);
        int expected = 0;
        int actual = cond.getRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadiostationPrev() {
        Radio cond = new Radio();
        cond.prevRadiostation(3);
        int expected = 2;
        int actual = cond.getRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadiostationNext() {
        Radio cond = new Radio();
        cond.nextRadiostation(5);
        int expected = 6;
        int actual = cond.getRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadiostationOverSet() {
        Radio cond = new Radio();
        cond.setRadiostation(20);
        int expected = 0;
        int actual = cond.getRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeSerCurrent() {
        Radio cond = new Radio();
        cond.setCurrentVolume(50);
        int expected = 50;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeOverSet() {
        Radio cond = new Radio();
        cond.setCurrentVolume(200);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentCurrentVolumeDecrease() {
        Radio cond = new Radio();
        cond.decreaseVolume(62);
        int expected = 61;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentCurrentVolumeDecreaseOver() {
        Radio cond = new Radio();
        cond.decreaseVolume(-2);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentCurrentVolumeIncrease() {
        Radio cond = new Radio();
        cond.increaseVolume(77);
        int expected = 78;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentCurrentVolumeIncreaseOver() {
        Radio cond = new Radio();
        cond.increaseVolume(101);
        int expected = 100;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostationUnlimited() {
        Radio cond = new Radio();
        cond.setRadiostation(-7);

        int expected = 0;
        int actual = cond.getRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCurrentVolumeUnOverSet() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-100);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}