public class Main {

    public static void main(String[] args) {

        int balance = 100;

        int replenishment = 1231;

//        boolean isReplenishment = true;
//
//        int ruble;
//        if (isReplenishment) {
//            ruble = 1;
//        } else {
//            ruble = 0;
//        }

        int bonus = replenishment / 100;
        int check = replenishment + balance + bonus;
        System.out.println("Ваш баланс: " + check + " Рублей");

    }

}