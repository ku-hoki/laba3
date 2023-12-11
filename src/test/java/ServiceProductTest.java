import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ServiceProductTest {

    @Test
    void testCountByFilter() {
        ArrayList<PackagedPieceProduct> pieceProducts = new ArrayList<>();
        pieceProducts.add(new PackagedPieceProduct(new PieceProduct("Бананчики", "Кубинские",0.3 ), new PackingProduct("коробка", 0.5),10));
        pieceProducts.add(new PackagedPieceProduct(new PieceProduct("Инжир", "Заграничные", 0.1), new PackingProduct("мешок", 0.1),9));

        ArrayList<PackagedWeightedProduct> weightedProducts = new ArrayList<>();
        weightedProducts.add(new PackagedWeightedProduct(new WeightProduct("Ананасы", "сочные и вкусные"), new PackingProduct("коробка", 0.5), 15));
        weightedProducts.add(new PackagedWeightedProduct(new WeightProduct("Бананчики", "желтые"), new PackingProduct("коробка", 0.2), 11));

        ProductBatch batch = new ProductBatch("новая партия", weightedProducts, pieceProducts);
        ServiceProduct service = new ServiceProduct();
        BeginStringFilter filter = new BeginStringFilter("Бананчики");

        int res = service.countByFilter(batch, filter);

        assertEquals(2, res);


    }
}