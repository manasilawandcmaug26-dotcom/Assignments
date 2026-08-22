import java.util.Scanner; 

class Sum {

    public static int sumOfTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstnum = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondnum = scanner.nextInt();

        int result = sumOfTwoNumbers(firstnum, secondnum);

        System.out.println("The sum of " + firstnum + " and " + secondnum + " is " + result + ".");

       	 scanner.close();
    }
}