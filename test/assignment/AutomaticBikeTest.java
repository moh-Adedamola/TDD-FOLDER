package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    public void testThatAutomaticBikeCanBeTurnedOn() {
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.setOff();
        assertFalse(automaticBike.isOn());
        automaticBike.setOn();
        assertTrue(automaticBike.isOn());
    }



    @Test
    public void testThatAutomaticBikeCanBeTurnedOff() {
        AutomaticBike automaticBike = new AutomaticBike();
        assertTrue(automaticBike.isOn());
        automaticBike.setOff();
        assertFalse(automaticBike.isOn());

    }


    @Test
    public void testThatAutomaticBikeCanBeAcceleratedBy_1() {
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.setOn();
        assertTrue(automaticBike.isOn());
        for (int acceleration = 1; acceleration <= 19; acceleration++) {
            automaticBike.accelerate();
        }
        assertEquals(19, automaticBike.getAutomaticSpeed());
        assertEquals(1, automaticBike.getAutomaticGear());

    }
    @Test
    public void testThatAutomaticBikeCanBeAcceleratedBy_2() {
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.setOn();
        assertTrue(automaticBike.isOn());
        for (int acceleration = 1; acceleration <= 22; acceleration++) {
            automaticBike.accelerate();
        }
        assertEquals(24, automaticBike.getAutomaticSpeed());
        assertEquals(2, automaticBike.getAutomaticGear());

    }

    @Test
    public void testThatAutomaticBikeCanBeAcceleratedBy_3() {
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.setOn();
        assertTrue(automaticBike.isOn());
        for (int acceleration = 1; acceleration <= 28; acceleration++) {
            automaticBike.accelerate();
        }
        assertEquals(39, automaticBike.getAutomaticSpeed());
        assertEquals(3, automaticBike.getAutomaticGear());

    }

    @Test
    public void testThatAutomaticBikeCanBeAcceleratedBy_4() {
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.setOn();
        assertTrue(automaticBike.isOn());
        for (int acceleration = 1; acceleration <= 29; acceleration++) {
            automaticBike.accelerate();
        }
        assertEquals(42, automaticBike.getAutomaticSpeed());
        assertEquals(4, automaticBike.getAutomaticGear());

    }

    @Test
    public void testThatAutomaticBikeCanBeDeceleratedBy_1(){
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.setOn();
        assertTrue(automaticBike.isOn());
        for(int acceleration = 1; acceleration < 20; acceleration++) {
            automaticBike.accelerate();
        }
        assertEquals(19,automaticBike.getAutomaticSpeed());
        assertEquals(1,automaticBike.getAutomaticGear());

        for(int acceleration = 1; acceleration < 20; acceleration--) {
            automaticBike.decelerate();
        }

        assertEquals(0,automaticBike.getAutomaticSpeed());
        assertEquals(1,automaticBike.getAutomaticGear());

    }
    @Test
    public void testThatAutomaticBikeCanBeDeceleratedBy_2(){
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.setOn();
        assertTrue(automaticBike.isOn());
        for(int acceleration = 1; acceleration <= 22; acceleration++) {
            automaticBike.accelerate();
        }
        assertEquals(24,automaticBike.getAutomaticSpeed());
        assertEquals(2,automaticBike.getAutomaticGear());

        for(int acceleration = 1; acceleration <= 22; acceleration--) {
            automaticBike.decelerate();
        }

        assertEquals(0,automaticBike.getAutomaticSpeed());
        assertEquals(2,automaticBike.getAutomaticGear());

    }



}



