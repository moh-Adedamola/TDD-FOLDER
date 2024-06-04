package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionSetTest {
    @Test
    public void testToCheckIfTelevisionSetIsOn(){
        TelevisionSet televisionSet = new TelevisionSet();
        televisionSet.setOn();
        assertTrue(televisionSet.isOn());
    }

    @Test
    public void testToCheckIfTelevisionSetIsOff(){
        TelevisionSet televisionSet = new TelevisionSet();
        televisionSet.setOff();
        assertFalse(televisionSet.isOn());
    }

    @Test
    public void testToSetTelevisionSetVolume(){
        TelevisionSet televisionSet = new TelevisionSet();
        televisionSet.setVolume(7);
        assertEquals(7, televisionSet.getVolume());

    }

    @Test
    public void testToIncreaseTelevisionSetVolume(){
        TelevisionSet televisionSet = new TelevisionSet();
        assertFalse(televisionSet.isOn());
        televisionSet.setOn();
        assertTrue(televisionSet.isOn);
        televisionSet.setVolume(7);
        assertEquals(7, televisionSet.getVolume());
        televisionSet.increaseVolume();
        assertEquals(8, televisionSet.getVolume());
    }

    @Test
    public void testToDecreaseTelevisionSetVolume(){
        TelevisionSet televisionSet = new TelevisionSet();
        assertFalse(televisionSet.isOn());
        televisionSet.setOn();
        assertTrue(televisionSet.isOn);
        televisionSet.setVolume(7);
        assertEquals(7, televisionSet.getVolume());
        televisionSet.decreaseVolume();
        assertEquals(6, televisionSet.getVolume());
    }





}