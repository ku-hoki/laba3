import java.util.ArrayList;

public class ServiceProduct {//сервис товаров

    public int countByFilter(ProductBatch batch, Filter filter){
        int count = 0;
        ArrayList<PackagedPieceProduct> pieceProducts = batch.getPieceProducts();
        ArrayList<PackagedWeightedProduct> weightedProducts = batch.getWeightedProducts();

        for (int i = 0; i < pieceProducts.size(); i++){
            if (filter.apply(pieceProducts.get(i).getName())){
                count++;
            }
        }

        for (int i = 0; i < weightedProducts.size(); i++){
            if (filter.apply(weightedProducts.get(i).getName())){
                count++;
            }
        }
        return count;
    }
}
