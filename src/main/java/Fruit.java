import java.util.Objects;

public class Fruit extends Magazin{

    private String product;

    public Fruit(String nameShop, String country, String product){
        super(nameShop,country);//получаем доступ к методам родительского класса(Magazin)
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(product, fruit.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), product);
    }

    @Override
    public String toString() {
        return "Magazin{ "+getNameShop()+", from " +getCountry()+"}"+ "\n" +
                "Fruit["+ "product = '" +product+'\'' + ']';
    }
}
