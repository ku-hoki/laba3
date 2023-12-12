import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PackagedSetTest {

    @Test
    void testNettoMass() {
        List<PackagedPieceProduct> pieceProducts = new ArrayList<>();
        pieceProducts.add(new PackagedPieceProduct(new PieceProduct("Апельсин", "сочный", 0.15), new PackingProduct("коробка",0.05), 10));

        List<PackagedWeightedProduct> weightedProducts = new ArrayList<>();
        weightedProducts.add(new PackagedWeightedProduct(new WeightProduct("Apple", "Fresh apple"), new PackingProduct("коробка",0.1), 5));
        weightedProducts.add(new PackagedWeightedProduct(new WeightProduct("Banana", "Yellow banana"), new PackingProduct("коробка",0.2), 3));

        PackingProduct pack = new PackingProduct("ящик", 0.5);

        PackagedSet set = new PackagedSet(pack, weightedProducts, pieceProducts);
        double nettoMass = set.getNettoMass();

        assertEquals(9.5, nettoMass);

    }
    @Test
    void testBruttoMass(){
        List<PackagedPieceProduct> pieceProducts = new ArrayList<>();
        pieceProducts.add(new PackagedPieceProduct(new PieceProduct("Апельсин", "сочный", 0.15), new PackingProduct("коробка",0.2), 10));

        List<PackagedWeightedProduct> weightedProducts = new ArrayList<>();
        weightedProducts.add(new PackagedWeightedProduct(new WeightProduct("Apple", "Fresh apple"), new PackingProduct("коробка",0.1), 5));
        weightedProducts.add(new PackagedWeightedProduct(new WeightProduct("Banana", "Yellow banana"), new PackingProduct("коробка",0.2), 3));

        PackingProduct pack = new PackingProduct("ящик", 0.5);

        PackagedSet set = new PackagedSet(pack, weightedProducts, pieceProducts);
        double bruttoMass = set.getBruttoMass();

        assertEquals(10.5, bruttoMass);
    }
}