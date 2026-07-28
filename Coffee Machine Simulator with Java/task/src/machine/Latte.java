package machine;

public class Latte extends CoffeeMachine {
    static void makeLatte() {
        if (waterInMachine < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (milkInMachine < 75) {
            System.out.println("Sorry, not enough milk!");
        } else if (beansInMachine < 20) {
            System.out.println("Sorry, not enough beans!");
        } else if (cupsInMachine < 1) {
            System.out.println("Sorry, not enough cups!");
        } else {
            beansInMachine -= 20;
            waterInMachine -= 350;
            milkInMachine -= 75;
            cupsInMachine--;
            moneyInMachine += 7;
            cupsBeforeCleaning++;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }
}
