import java.util.Scanner;

class AgeChecker {

    public static void checkAgeCategory(int age) {
     
        if (age < 18) {
            System.out.println("You are a minor");
        } else if (age < 65) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a senior citizen");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        checkAgeCategory(age);

        
    }
}