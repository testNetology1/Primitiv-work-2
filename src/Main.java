public class Main {
    public static void main(String[] args) {
        int balance = 1_000;
        int refill = 1200;
        int total;
        int bonus = 0;

        if (refill > 1_000) {
            bonus = refill / 100;
        }

        total = balance + refill + bonus;

        System.out.print("Количество бонусных рублей - " + bonus + "; итоговый баланс - " + total + " рублей.");

    }
}