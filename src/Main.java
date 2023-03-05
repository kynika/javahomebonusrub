public class Main {
    public static void main(String[] args) {

        int initialAccount = 100; //начальный счет
        int refill = 1100; //сумма пополнения

        int bonus;

        if (refill > 1000){  //расчет количества вонусов
            bonus = refill / 100;
            System.out.println("Вам начисленно " + bonus + " бонусных рублей");

        } else {
            bonus = 0;
            System.out.println("Вам не начислены бонусы, т.к. недостаточная сумма пополнения. Бонусы начисляются при пополнении от 1000 рублей");
        }
        int finalAccount = initialAccount + refill + bonus; //итоговый счет

        System.out.println("На Вашем счету " + finalAccount + " рублей");

    }
}