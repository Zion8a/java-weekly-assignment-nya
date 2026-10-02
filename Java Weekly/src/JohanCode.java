import java.util.Scanner;

public class JohanCode {
    public static void main(String[] args) {
        System.out.println("=== Java Övningar ===");

        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    // Övning 1: Läs in ett val och använd switch
    public static void exercise1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Övning 1: Switch ===");
        System.out.println("Välj ett alternativ:");
        System.out.println("1. Hej");
        System.out.println("2. God morgon");
        System.out.println("3. God kväll");
        System.out.print("Ditt val: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hej!");
                break;
            case 2:
                System.out.println("God morgon!");
                break;
            case 3:
                System.out.println("God kväll!");
                break;
            default:
                System.out.println("Ogiltigt val!");
        }
    }

    // Övning 2: Slumpa ett heltal mellan 1 och 100
    public static void exercise2() {
        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("\n=== Övning 2: Slumpmässigt tal ===");
        System.out.println("Ditt slumpmässiga tal är: " + randomNumber);
    }

    // Övning 3: Beräkna kvadrat, kvadratrot och avrundning
    public static void exercise3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Övning 3: Math ===");
        System.out.print("Skriv in ett tal: ");
        double number = sc.nextDouble();

        System.out.println("Kvadrat: " + Math.pow(number, 2));
        System.out.println("Kvadratrot: " + Math.sqrt(number));
        System.out.println("Avrundat: " + Math.round(number));
    }

    // Övning 4: Visa en meny tills användaren väljer att avsluta
    public static void exercise4() {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Övning 4: Meny ===");
            System.out.println("Välj ett alternativ:");
            System.out.println("1. Slumpmässigt tal");
            System.out.println("2. Kvadrat");
            System.out.println("3. Kvadratrot");
            System.out.println("4. Avrunda");
            System.out.println("5. Avsluta");
            System.out.print("Ditt val: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    exercise2();
                    break;
                case 2:
                    System.out.print("Skriv in ett tal: ");
                    double squareNumber = sc.nextDouble();
                    System.out.println("Kvadrat: " + Math.pow(squareNumber, 2));
                    break;
                case 3:
                    System.out.print("Skriv in ett tal: ");
                    double rootNumber = sc.nextDouble();
                    System.out.println("Kvadratrot: " + Math.sqrt(rootNumber));
                    break;
                case 4:
                    System.out.print("Skriv in ett tal: ");
                    double roundNumber = sc.nextDouble();
                    System.out.println("Avrundat: " + Math.round(roundNumber));
                    break;
                case 5:
                    running = false;
                    System.out.println("Programmet avslutat!");
                    break;
                default:
                    System.out.println("Ogiltigt val!");
            }
        }
    }
}