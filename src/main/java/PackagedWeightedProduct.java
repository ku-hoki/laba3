public class PackagedWeightedProduct {// упакованный весовой товар
    private PackingProduct packing;
    private WeightProduct product;
    private double weight;
    public PackagedWeightedProduct(WeightProduct product,  PackingProduct packing,double weight){
        this.product = product;
        this.weight = weight;
        this.packing = packing;
    }

    public double getNettoMass(){// вес только товара
        return weight;
    }

    public double getBruttoMass(){// вес упаковки и товара вместе
        return weight + packing.getWeight();
    }

    public String getName(){
        return product.getNameProduct();
    }
}
