package machine;

public class Espresso extends CoffeeMachine {
     static void makeEspresso() {
        if (waterInMachine < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (beansInMachine < 16) {
            System.out.println("Sorry, not enough beans!");
        }else if (cupsInMachine < 0) {
            System.out.println("Sorry, not enough cups!");
        } else {
            waterInMachine -= 250;
            beansInMachine -= 16;
            cupsInMachine--;
            moneyInMachine += 4;
            cupsBeforeCleaning++;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }
}
