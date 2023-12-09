import java.util.Objects;

public class Magazin {
    private String nameShop;
    private String country;

    public Magazin(String nameShop, String country){
        this.nameShop = nameShop;
        this.country = country;
    }

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazin magazin = (Magazin) o;
        return Objects.equals(nameShop, magazin.nameShop) && Objects.equals(country, magazin.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameShop, country);
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "nameShop='" + nameShop + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}
