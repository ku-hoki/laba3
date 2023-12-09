public class PieceProduct extends Product{//штучный товар
    private double weightPieceProduct;// вес одной штуки товара в кг

    public PieceProduct(String nameProduct, String specification, double weightPieceProduct){
        super(nameProduct, specification);
        this.weightPieceProduct = weightPieceProduct;
    }

    public double getWeightPieceProduct() {
        return weightPieceProduct;
    }
}
