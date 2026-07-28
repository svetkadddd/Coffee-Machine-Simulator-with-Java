package machine;

import java.util.Scanner;

import static machine.Cappuccino.makeCappuccino;
import static machine.Espresso.makeEspresso;
import static machine.Latte.makeLatte;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean processing = true;

        while (processing) {

            System.out.println("Write action (buy, fill, take, clean, remaining, exit");
            String action = scanner.nextLine();

            if (action.equals("remaining")) {
                displayInMachine();
            } else if (action.equals("exit")) {
                processing = false;
            } else if (action.equals("buy")) {
                if (needCleaning()) {
                    continue;
                }
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String choice = scanner.nextLine();
                if (choice.equals("1")) {
                    makeEspresso();
                } else if (choice.equals("2")) {
                    makeLatte();
                } else if (choice.equals("3")) {
                    makeCappuccino();
                } else if (choice.equals("back")) {
                    continue;
                }
            } else if (action.equals("take")) {
                takeMoney();
            } else if (action.equals("fill")) {
                fill();
            } else if (action.equals("clean")) {
                cleaning();
            }
        }
        scanner.close();
    }

    static int moneyInMachine = 550;
    static int waterInMachine = 400;
    static int milkInMachine = 540;
    static int beansInMachine = 120;
    static int cupsInMachine = 9;
    static int cupsBeforeCleaning = 0;
    static boolean needCleaning = false;

    private static void cleaning() {
        System.out.println("I have been cleaned!");
        cupsBeforeCleaning = 0;
        needCleaning = false;
    }

    private static boolean needCleaning() {
        if (cupsBeforeCleaning >= 10) {
            needCleaning = true;
            System.out.println("I need cleaning!");
        }
        return needCleaning;
    }

    private static void displayInMachine() {
        System.out.println("The coffee machine has:\n" +
                waterInMachine + " ml of water\n" +
                milkInMachine + " ml of milk\n" +
                beansInMachine + " g of coffee beans\n" +
                cupsInMachine + " disposable cups\n" +
                moneyInMachine + " of money\n");
    }

    private static void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int waterAdd = scanner.nextInt();
        waterInMachine += waterAdd;

        System.out.println("Write how many ml of milk you want to add: ");
        int milkAdd = scanner.nextInt();
        milkInMachine += milkAdd;

        System.out.println("Write how many grams of coffee beans you want to add:");
        int beansAdd = scanner.nextInt();
        beansInMachine += beansAdd;

        System.out.println("Write how many disposable cups you want to add:");
        int cupsAdd = scanner.nextInt();
        cupsInMachine += cupsAdd;

        scanner.close();
    }

    private static void takeMoney() {
        System.out.println("I gave you $" + moneyInMachine);
        moneyInMachine = 0;
    }
}