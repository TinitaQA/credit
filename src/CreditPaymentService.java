public class CreditPaymentService {

    public int calculate (double procenter, int amount, int month){

        double b = procenter / 12 / 100; // проценты в месяц
        double a = Math.pow((1 + b), month);
        double payment = (b * a) / (a - 1) * amount; // платеж в месяц

        return (int) payment;
    }
}
