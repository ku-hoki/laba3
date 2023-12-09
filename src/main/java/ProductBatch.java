import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProductBatch {//Партия товаров
    private String specification;
    private ArrayList<PackagedWeightedProduct> weightedProducts; //некоторое кол-во упакованного весового товара
    private ArrayList<PackagedPieceProduct> pieceProducts;//некоторое кол-во упакованного штучного товара

    // конструктов по произвольному набору упаковок товара
    public ProductBatch(String specification, ArrayList<PackagedWeightedProduct> weightedProducts, ArrayList<PackagedPieceProduct> pieceProducts){
        this.specification = specification;
        this.weightedProducts = weightedProducts;
        this.pieceProducts = pieceProducts;
    }

    public double getBruttoMass(){
        double bruttoMass = 0;
        for (int i = 0; i < weightedProducts.size(); i++){
            bruttoMass += weightedProducts.get(i).getBruttoMass();
        }
        for (int i = 0; i < pieceProducts.size(); i++){
            bruttoMass += pieceProducts.get(i).getBruttoMass();
        }
        return bruttoMass;
    }
}
