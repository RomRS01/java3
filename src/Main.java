public class Main {
    public static void main(String[] args) {
        int nachBalans = 150;
        int popolnjenie = 3000;
        int balans;
        if (popolnjenie > 1000) {
            balans = nachBalans + popolnjenie + popolnjenie / 100;

        } else {
            balans = nachBalans + popolnjenie;
        }
        System.out.println("Итоговый баланс " + balans + " рублей");


    }
}
