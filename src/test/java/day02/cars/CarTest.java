package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void testCons() {
        Car car = new Car("Toyota",2.1,Color.BLACK,25_000);
        assertEquals("Toyota",car.getBrand());
        assertEquals(2.1,car.getCarEngine());
        assertEquals(25_000,car.getPrice());
    }

    @Test
    void testDecreasePrice() {
        Car car = new Car("Toyota",2.1,Color.BLACK,25_000);
        car.decreasePrice(10);
        assertEquals(22500,car.getPrice());
    }
}