import java.util.Objects;

public class Kitchen extends Magazin{
    private String bread;

    public Kitchen(String nameShop, String country, String bread){
        super(nameShop, country);
        this.bread = bread;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kitchen kitchen = (Kitchen) o;
        return Objects.equals(bread, kitchen.bread);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bread);
    }

    @Override
    public String toString() {
        return "Magazin{ "+getNameShop()+", from " +getCountry()+"}"+ "\n" +
                "Kitchen["+ "bread = '" +bread+'\'' + ']';
    }
}
