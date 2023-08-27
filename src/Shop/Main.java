package Shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> shop = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add products");
            System.out.println("2.Get all products ");
            System.out.println("3.Get  products by Id");
            System.out.println("4.Exit");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1: {
                    System.out.println("Write products :");
                    System.out.println("Name,");
                    System.out.println("Price.");
                    String products = scanner.nextLine();
                    shop.add(products);
                    System.out.println("Products has been add");
                    break;
                }
                case 2: {
                    for (String p : shop) {
                        System.out.println((shop.indexOf(p) + 1) + "." + p);
                        System.out.println("-------------------");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Write ID");
                    int idOfProducts = scanner.nextInt();
                    if (idOfProducts > 0 && idOfProducts <= shop.size()) {
                        System.out.println(shop.get(idOfProducts - 1));
                        System.out.println("Your product");
                    }
                    break;
                }
                case 4: {
                    System.out.println("You have finished your shopping");
                    System.exit(0);
                }
            }
        }
    }
}