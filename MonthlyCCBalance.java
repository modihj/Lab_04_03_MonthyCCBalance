public class MonthlyCCBalance {

    public static void main(String[] args) {

        // credit card balance
        double balance = 5000;

        // 17% interest
        double interest = balance * 0.17;

        // after one month
        System.out.printf("Interest after 1 month is $%.2f\n", interest);

        balance += interest;

        // after two months
        System.out.printf("Interest after 2 months is $%.2f\n", interest + balance * 0.17);
    }
}
