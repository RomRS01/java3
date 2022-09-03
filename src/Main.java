public class Main {
    public static void main(String[] args) {
        int initialBalance = 150;
        int replenishment = 3000;
        int balance;
        if (replenishment > 1000) {
            balance = initialBalance + replenishment + replenishment / 100;

        } else {
            balance = initialBalance + replenishment;
        }
        System.out.println("Итоговый баланс " + balance + " рублей");


    }
}
