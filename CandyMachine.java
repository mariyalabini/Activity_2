import java.util.Scanner;
public class CandyMachine {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int itemsToBuy;
            int totalCost = 0;

            System.out.println(" Product              Cost");
            System.out.println("[1] Cool                  35");
            System.out.println("[2]  Toblerone         64");
            System.out.println("[3]  V-fresh            22");
            System.out.println("[4]  Champi           25");
            System.out.println("[5]  Crunch            32");
            System.out.println("[6]  Fres                37");
            System.out.println("[7]  Dairy Milk        44");
            System.out.println("[8]  Ube                32");
            System.out.println("[9]  Chubby           38");
            System.out.println("[10] White Rabbit   27");
            System.out.println();

            System.out.print("How many items to buy?: ");
            itemsToBuy = sc.nextInt();

            int[] itemsBought = new int[itemsToBuy];

            System.out.println("Enter product number: ");
            for(int i = 0; i < itemsToBuy; i++) {
                itemsBought[i] =  sc.nextInt();
            }

            // Display items bought
            System.out.println();
            System.out.println("Items bought: ");
            for(int i = 0; i < itemsToBuy; i++) {
                if(itemsBought[i] == 1) {
                    System.out.println("Cool           35");
                } else if (itemsBought[i] == 2) {
                    System.out.println("Toblerone    64");
                } else if (itemsBought[i] == 3) {
                    System.out.println("V-fresh       22");
                } else if (itemsBought[i] == 4) {
                    System.out.println("Champi      25");
                } else if (itemsBought[i] == 5) {
                    System.out.println("Crunch       32");
                } else if (itemsBought[i] == 6) {
                    System.out.println("Fres           37");
                } else if (itemsBought[i] == 7) {
                    System.out.println("Dairy Milk   44");
                } else if (itemsBought[i] == 8) {
                    System.out.println("Ube           32");
                } else if (itemsBought[i] == 9) {
                    System.out.println("Chubby       38");
                } else if (itemsBought[i] == 10) {
                    System.out.println("White Rabbit 27");
                }
            }
            System.out.println();

            System.out.print("Total cost: ");
            for(int i = 0; i < itemsToBuy; i++) {
                if(itemsBought[i] == 1) {
                    totalCost += 35;
                } else if (itemsBought[i] == 2) {
                    totalCost += 64;
                } else if (itemsBought[i] == 3) {
                    totalCost += 22;
                } else if (itemsBought[i] == 4) {
                    totalCost += 25;
                } else if (itemsBought[i] == 5) {
                    totalCost += 32;
                } else if (itemsBought[i] == 6) {
                    totalCost += 37;
                } else if (itemsBought[i] == 7) {
                    totalCost += 44;
                } else if (itemsBought[i] == 8 ) {
                    totalCost += 32;
                } else if (itemsBought[i] == 9) {
                    totalCost += 38;
                } else if (itemsBought[i] == 10) {
                    totalCost += 27;
                }
            }
            System.out.print(totalCost);

        }
    }

