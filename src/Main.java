public class Main {
    public static void main(String[] args) {
        CreditPayService service = new CreditPayService();
        double monthPay = service.calculate(1_000_000, 12, 9.99);
        System.out.println("Ежемесячный платеж при кредите на 1 год: ");
        System.out.println(Math.round(monthPay) + " рублей");

        System.out.println();
        System.out.println("Ежемесячный платеж при кредите на 2 года: ");
        System.out.println(Math.round(service.calculate(1_000_000, 24, 9.99)) + " рублей");

        System.out.println();
        System.out.println("Ежемесячный платеж при кредите на 3 года: ");
        System.out.println(Math.round(service.calculate(1_000_000, 36, 9.99)) + " рублей");

//        Пришлось найти как возвести в степень и как округлять вещественные числа, сложно было

    }
}
