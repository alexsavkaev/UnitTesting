package seminars.second.hw;

import hw.Car;
import hw.Motorcycle;
import hw.Vehicle;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;


class VehicleTest {
    Car bmw = new Car("BMW", "X5", 2021);
    Motorcycle honda = new Motorcycle("Honda", "CB500X", 2022);

    @Test
    public void carInstanceOfVehicle(){
        assertInstanceOf(Vehicle.class, bmw);
    }
    @Test
    public void carWheelsAmount() {
        assertEquals(bmw.getNumWheels(), 4);
    }
    @Test
    void wheelsAmountMoto(){
        assertEquals(honda.getNumWheels(), 2);
    }
    @Test
    void carSpeedTestDrive(){
        bmw.testDrive();
        assertEquals(bmw.getSpeed(), 60);
    }
    @Test
    void motoSpeedTestDrive(){
        honda.testDrive();
        assertEquals(honda.getSpeed(), 75);
    }
    @Test
    void carParkingSpeed(){
        bmw.testDrive();
        bmw.park();
        assertEquals(bmw.getSpeed(),0);
    }
    @Test
    void motoParkingSpeed(){
        honda.testDrive();
        honda.park();
        assertEquals(honda.getSpeed(), 0);
    }

}