public class Main {

    public static void main(String[] args) {

        int balance = 100;

        int replenishment = 1309;

//        boolean isReplenishment = true;
//
//        int ruble;
//        if (isReplenishment) {
//            ruble = 1;
//        } else {
//            ruble = 0;
//        }

        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

//        int bonus = replenishment / 100;
        int check = replenishment + balance + bonus;
        System.out.println("Ваш баланс: " + check + " Рублей");

    }

}