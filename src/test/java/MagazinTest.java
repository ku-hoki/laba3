import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MagazinTest {

    @Test
    public void testMagazinEquals(){
        Magazin shop1 = new Magazin("Magnit", "Russia");
        Magazin shop2 = new Magazin("Magnit", "Russia");
        assertEquals(shop1,shop2);
    }

    @Test
    public void testIerarhi(){
        Fruit fruty1 = new Fruit("Magnit", "Russia", "Banana");
        Kitchen product1 = new Kitchen("La Magazine", "France", "baget");
        System.out.println(fruty1.toString());
        System.out.println(product1.toString());
    }
}