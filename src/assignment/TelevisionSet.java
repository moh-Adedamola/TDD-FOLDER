package assignment;

public class TelevisionSet {
    public boolean isOn;
    private int volume;



    public void setOn() {
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOff() {
        isOn = false;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (isOn && volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (isOn && volume > 0) {
            volume--;
        }
    }
}



