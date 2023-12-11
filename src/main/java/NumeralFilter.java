public class NumeralFilter implements Filter {
    @Override
    public boolean apply(String str) {
        return str.matches("\\d+"); //проверяем состоит ли строка только из цифр
    }
}
