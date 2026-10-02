import java.util.Scanner;

public class Rebecca {
    
    

    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);


            //Uppgift1
            System.out.println("Välj ett alternativ:");
            System.out.println("1: Hej!");
            System.out.println("2: God morgon!");

            System.out.println("Ogiltigt val!");


            // Uppgift 2
            int min = 1;
            int max = 100;
            int range = max - min + 1;

            int randomNumber = (int) (Math.random() * range) + min;

            System.out.println("Ditt slumpmässiga tal är: " + randomNumber);
        }

    }



                //Uppgift3

                System.out.println("Skriv in ett tal:");
    private Scanner scan;
    double number = scan.nextDouble();
double square = Math.pow(number, 2);
double sqrt = Math.sqrt(number);
int rounded = (int) Math.round(number);
                    System.out.println("Kvadraten: " + square);
                    System.out.println("Kvadratroten: " + sqrt);
                    System.out.println("Avrundat " + rounded);

                    //Uppgift4
                    //1. Slumpmässigt tal - Math.random()
                    //2. Kvadrat - Math.pow()
                    //3. Kvadratrot - Math.sqrt()
                    //4. Avrunda - Math.round()
                    //5. Avsluta

                    System.out.println("Välj ett alternativ:");
                    System.out.println("1: Slumpmässigt tal");
                    System.out.println("2: Kvadrat");
                    System.out.println("3: Kvadratrot");
                    System.out.println("4: Avrunda");
                    System.out.println("5: Avsluta");

                    int menuChoice = scan.nextInt();
                    switch (menuChoice) {

                        case 1:
                            int randomMenuNumber = (int) (Math.random() * range) + min;
                            System.out.println("Slumpmässigt tal: " + randomMenuNumber);
                            break;

                        case 2:
                            System.out.println("Skriv in ett tal:");
                            Scanner scan = null;
                            double numberForSquare = scan.nextDouble();

                            double squareResult = Math.pow(numberForSquare, 2);
                            //Nya variabelnamn för att jag hade liknande i uppgift 3.

                            System.out.println("Kvadraten är: " + squareResult);
                            break;

                        case 3:
                            System.out.println("Skriv in ett tal:");
                            double numberForSquareRoot = scan.nextDouble();

                            double squareRootResult = Math.sqrt(numberForSquareRoot);

                            System.out.println("Kvadratroten är: " + squareRootResult);
                            break;

                        case 4:
                            System.out.println("Skriv in ett tal:");
                            double numberForRound = scan.nextDouble();

                            int roundedResult = (int) Math.round(numberForRound);

                            System.out.println("Avrundat: " + roundedResult);
                            break;

                        case 5:
                            System.out.println("Programmet avslutas.");
                            break;

                        default:
                            System.out.println("Ogiltigt val.");
                    }

                }

            }

