import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> menu = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Додати справу");
            System.out.println("2. Переглянути список справ");
            System.out.println("3. Видалити справу");
            System.out.println("4.Exit");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1: {
                    System.out.println("Vedit spravu");
                    String work = scanner.nextLine();
                    menu.add(work);
                    System.out.println("Sprava dodana");
                    break;
                }
                case 2: {
                    for (String s : menu) {
                        System.out.println((menu.indexOf(s) + 1) + "." + s);


                    }
                    break;
                }
                case 3: {
                    System.out.println("Vedit spravu jaku vydalyty");
                    int numberOfWork = scanner.nextInt();
                    if (numberOfWork > 0 && numberOfWork <= menu.size()) {
                        menu.remove(numberOfWork - 1);
                        System.out.println("Sprava vydalena");
                    } else {
                        System.out.println("False number");
                    }
                    break;
                }
                case 4: {
                    System.exit(0);
                }
            }
        }
    }
}
