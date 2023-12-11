public class BeginSymbol implements Filter {
    private char symbol;

    public BeginSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public boolean apply(String str) {
        return str.charAt(0) == symbol;
    }
}

