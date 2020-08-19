public class Main {
    public static void main(String[] args) {
        int summ = 900;
        int bonus;
        int eachSpentMoney = 100;
        if (summ > 1000) {
            bonus = 1;
        } else {
            bonus = (int) 0.1;
        }

        int total = summ / eachSpentMoney * bonus;
        int clientBill = 100 + summ + total;

        System.out.println(clientBill);
    }
}