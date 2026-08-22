import java.util.Scanner;

class PositiveNumber {

    public static void main(String[] args) {
        
        int validNumber = askForPositiveNumber();
       
        System.out.println("You entered a positive number: " + validNumber);
    }

    
    public static int askForPositiveNumber() {

        Scanner scanner = new Scanner(System.in);
        int number;

        do {

            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();

        } while (number <= 0);

        scanner.close();
       
        return number;
    }
}