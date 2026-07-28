package machine;

public class Cappuccino extends CoffeeMachine {
    static void makeCappuccino() {
        if (waterInMachine < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (milkInMachine < 100) {
            System.out.println("Sorry, not enough milk!");
            ;
        } else if (beansInMachine < 12) {
            System.out.println("Sorry, not enough beans!");
        } else if (cupsInMachine < 1) {
            System.out.println("Sorry, not enough cups!");
        } else {
            waterInMachine -= 200;
            milkInMachine -= 100;
            beansInMachine -= 12;
            cupsInMachine--;
            moneyInMachine += 6;
            cupsBeforeCleaning++;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }
}
