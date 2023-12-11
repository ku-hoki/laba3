public class PackagedPieceProduct {//упакованный штучный товар
    private PackingProduct packing;
    private PieceProduct product;
    private int countItems;

    public PackagedPieceProduct(PieceProduct product, PackingProduct packing,  int countItems){
        this.countItems = countItems;
        this.product = product;
        this.packing = packing;
    }
    public int getCountItems() {
        return countItems;
    }

    public double getNettoMass(){
        return product.getWeightPieceProduct()*countItems;//суммарный вес всех единиц товара
    }

    public double getBruttoMass(){
        return packing.getWeight()+product.getWeightPieceProduct()*countItems;//вес упаковки и всех единиц товара вместе
    }

    public String getName(){
        return product.getNameProduct();
    }
}
