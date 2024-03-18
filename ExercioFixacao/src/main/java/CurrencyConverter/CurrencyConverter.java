package CurrencyConverter;

public class CurrencyConverter {

    public static final double IOF = 0.06;
    public static double converter (double dollarPrice, double quantityD) {
        double totalSemTaxa = dollarPrice * quantityD;
        double totalComTaxa = totalSemTaxa * (1 + IOF);
        return  totalComTaxa;

    }



}
