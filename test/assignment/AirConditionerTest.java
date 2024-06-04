package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    @Test
   public void testThatAcCanOn(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.isAirConditionerOn());
        airConditioner.turnOn();
        assertTrue(airConditioner.isAirConditionerOn());
    }

    @Test
    public void testThatAcCanOff(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.isAirConditionerOn());
        airConditioner.turnOn();
        assertTrue(airConditioner.isAirConditionerOn());
        airConditioner.turnOff();
        assertFalse(airConditioner.isAirConditionerOn());

    }
   @Test
    public void testThatAcTemperatureIs16ByDefault(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.isAirConditionerOn());
        airConditioner.turnOn();
        assertTrue(airConditioner.isAirConditionerOn());
        assertEquals(16,airConditioner.getTemperature());


   }

    @Test
    public void testThatAcCanIncreaseTemperature(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.isAirConditionerOn());
        airConditioner.turnOn();
        assertTrue(airConditioner.isAirConditionerOn());
        assertEquals(16,airConditioner.getTemperature());
        airConditioner.increaseTemperature();
        assertEquals(17,airConditioner.getTemperature());


    }

    @Test
    public void testThatAcCanDecreaseTemperature(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.isAirConditionerOn());
        airConditioner.turnOn();
        assertTrue(airConditioner.isAirConditionerOn());
        assertEquals(16,airConditioner.getTemperature());
        airConditioner.increaseTemperature();
        assertEquals(17,airConditioner.getTemperature());
        airConditioner.decreaseTemperature();
        assertEquals(16,airConditioner.getTemperature());


    }

    @Test
    public void testThatAcCanIncreaseTemperature2(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.isAirConditionerOn());
        airConditioner.turnOn();
        assertTrue(airConditioner.isAirConditionerOn());
        assertEquals(16,airConditioner.getTemperature());
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        assertEquals(19,airConditioner.getTemperature());
    }


    @Test
    public void testThatAcCanNotIncreaseTemperatureBeyond30(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.isAirConditionerOn());
        airConditioner.turnOn();
        assertTrue(airConditioner.isAirConditionerOn());
        assertEquals(16,airConditioner.getTemperature());
        for(int count = 0; count < 14; count++){
            airConditioner.increaseTemperature();
        }
        //airConditioner.increaseTemperature();
        assertEquals(30,airConditioner.getTemperature());
    }

    @Test
    public void testThatAcCanNotDecreaseTemperatureBelow16(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.isAirConditionerOn());
        airConditioner.turnOn();
        assertTrue(airConditioner.isAirConditionerOn());
        assertEquals(16,airConditioner.getTemperature());
        airConditioner.decreaseTemperature();
        assertEquals(16,airConditioner.getTemperature());
    }
    @Test
    public void testThatAcCannotIncreaseTemperatureWhileOff(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.isAirConditionerOn());
        assertEquals(16,airConditioner.getTemperature());
        airConditioner.increaseTemperature();
        assertEquals(16,airConditioner.getTemperature());
    }

//    @Test
//    public void testThatAcCanTurnOnAndOffWithToggle(){
//        AirConditioner airConditioner = new AirConditioner();
//        assertFalse(airConditioner.isAirConditionerOn());
//        airConditioner.toggle();
//        assertTrue(airConditioner.isAirConditionerOn());
//        airConditioner.toggle();
//        assertFalse(airConditioner.isAirConditionerOn());
//    }


}