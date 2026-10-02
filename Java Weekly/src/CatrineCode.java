import java.util.Scanner;

public class CatrineCode {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Välj ett alternativ: ");
        System.out.println("1. Hej");
        System.out.println("2. God morgon");
        System.out.println("3. God kväll");
        int message = scan.nextInt();

        switch (message) {
            case 1:
                System.out.println("Hej");
                break;
            case 2:
                System.out.println("God morgon");
                break;
            case 3:
                System.out.println("God kväll");
                break;

            default:
                System.out.println("Ogiltigt val! ");
        }

        int number = (int) (Math.random() * 100) + 1;
        System.out.println("Ditt slumpmässiga tal är: " + number);

        System.out.println("Skriv in ett tal");
        double inputNumber = scan.nextDouble();

        double square = Math.pow(inputNumber, 2);
        System.out.println("Kvadraten är: " + square);

        double squareRoot = Math.sqrt(inputNumber);
        System.out.println("Kvadratroten är: " + squareRoot);

        System.out.println("Avrundat: " + Math.round(inputNumber));


        System.out.println("Välj ett alternativ: ");
        System.out.println("1. Slumpmässigt tal");
        System.out.println("2. Kvadrat");
        System.out.println("3. Kvadratrot");
        System.out.println("4. Avrunda");
        System.out.println("5. Avsluta");
        int userChoice = scan.nextInt();

        switch (userChoice) {
            case 1:
                int randomNumber = (int) (Math.random() * 100) + 1;
                System.out.println("Slumpmässigt tal: " + randomNumber);
                break;
            case 2:
                System.out.println("Skriv in ett tal");
                double squareNumber = scan.nextDouble();
                double squareResult = Math.pow(squareNumber, 2);
                System.out.println("Kvadraten är: " + squareResult);
                break;
            case 3:
                System.out.println("Skriv in ett tal");
                double squareRootNumber = scan.nextDouble();
                double squareRootResult = Math.sqrt(squareRootNumber);
                System.out.println("Kvadratroten är: " + squareRootResult);
                break;
            case 4:
                System.out.println("Skriv in ett tal");
                double roundNumber = scan.nextDouble();
                System.out.println("Avrundat: " + Math.round(roundNumber));
                break;
            case 5:
                System.out.println("Programmet avslutas");
                break;

            default:
                System.out.println("Ogiltigt val! ");

        }
    }
}
