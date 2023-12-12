import java.util.ArrayList;
import java.util.List;

public class PackagedSet {//упакованный набор товаров
    private PackingProduct packing;
    private List<PackagedWeightedProduct> weightedProducts;
    private List<PackagedPieceProduct> pieceProducts;

    public PackagedSet(PackingProduct packaging, List<PackagedWeightedProduct> weightedProducts, List<PackagedPieceProduct> pieceProducts) {
        this.packing = packaging;
        this.weightedProducts = weightedProducts;
        this.pieceProducts = pieceProducts;
    }

    public double getNettoMass(){
        double nettoMass = 0;
        for (int i = 0; i < weightedProducts.size(); i++){
            nettoMass += weightedProducts.get(i).getNettoMass();
        }
        for (int i = 0; i < pieceProducts.size(); i++){
            nettoMass += pieceProducts.get(i).getNettoMass();
        }
        return nettoMass;
    }

    public double getBruttoMass(){
        double bruttoMass = 0;
        for (int i = 0; i < weightedProducts.size(); i++){
            bruttoMass += weightedProducts.get(i).getBruttoMass();
        }
        for (int i = 0; i < pieceProducts.size(); i++){
            bruttoMass += pieceProducts.get(i).getBruttoMass();
        }

        return bruttoMass + packing.getWeight();

    }
}
