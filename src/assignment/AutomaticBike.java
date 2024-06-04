package assignment;

public class AutomaticBike {
    private int automaticSpeed;
    private int automaticGear;
    public boolean isOn = true;

    public AutomaticBike() {
        automaticSpeed = 0;
        automaticGear = 1;
    }

    public void setOn() {
        isOn = true;
    }


    public void setOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;

    }

    public void accelerate() {
        if  (automaticGear == 1) {
            automaticSpeed += 1;
        } else if (automaticGear == 2) {
            automaticSpeed += 2;
        } else if (automaticGear == 3) {
            automaticSpeed += 3;
        } else if (automaticGear== 4) {
            automaticSpeed += 4;
        }

        checkGearChange();
    }

    public void decelerate() {
        if (automaticGear == 1) {
            automaticSpeed -= 1;
        } else if (automaticGear == 2) {
            automaticSpeed -= 2;
        } else if (automaticGear == 3) {
            automaticSpeed -= 3;
        } else if (automaticGear== 4) {
            automaticSpeed -= 4;
        }
        checkGearChange();
    }

    private void checkGearChange() {
        if(automaticSpeed < 0){
            automaticSpeed =0;
        } else if (automaticSpeed >= 41) {
            automaticGear =4;
        }else if(automaticSpeed >= 30){
            automaticGear =3;
        }else if(automaticSpeed >= 20){
            automaticGear =2;
        }else {
            automaticGear=1;
        }
    }


    public int getAutomaticSpeed() {
        return automaticSpeed;
    }

    public int getAutomaticGear() {
        return automaticGear;
    }
}

