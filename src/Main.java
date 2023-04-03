public class Main {
    public static void main(String[] args) {
        int summacheck = 200; // сумма на счету
        int replenishment = 100; //сумма пополнения счета
        int bonus;
        int totlBonus;
        if (replenishment > 1000) {
            System.out.println(" Начислено бонусов " + replenishment / 100);
            System.out.println(" Ваш баланс с учетом бонусов " + (summacheck + replenishment + replenishment / 100));
        } else {
            System.out.println("Ваш баланс счета " + (summacheck + replenishment));
        }
    }
}