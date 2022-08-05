public class CreditPayService {
    public double calculate(int sum, int mon, double per) {

        double percent = per / 100 / 12;

        double step = Math.pow(1 + percent, mon);

        double pay = sum * ((percent * step) / (step - 1));

        return pay;
    }
}

