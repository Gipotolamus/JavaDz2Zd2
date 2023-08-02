public class Main {

    public static void main(String[] args) {

        int Balance = 100;

        int Replenishment = 1231;

        boolean isReplenishment = true;

        int ruble;
        if (isReplenishment) {
            ruble = 1;
        } else {
            ruble = 0;
        }

        int bonus = Replenishment / 100;
        int check = Replenishment + Balance + bonus;
        System.out.println("Ваш баланс: " + check + " Рублей");

    }

}