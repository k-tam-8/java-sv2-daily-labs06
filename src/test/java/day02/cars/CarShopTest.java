package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {
    @Test
    void testCons() {
        CarShop carShop = new CarShop("CarDeal",250_000);
        assertEquals("CarDeal" , carShop.getDealer());
        assertEquals(250_000,carShop.getMaxPrice());
        assertEquals(0,carShop.getCarsForSell().size());
    }
}