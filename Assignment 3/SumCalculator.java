import java.util.Scanner;

class SumCalculator {

   
    public static int calculateSum(int N) {

        int sum = 0;
        
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        
        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        
        if (N < 1) {

            System.out.println("Please enter a positive integer greater than 0.");

        } else {
            
            int result = calculateSum(N);
           
            System.out.println("The sum of numbers from 1 to " + N + " is: " + result);
        }
        
        scanner.close();
    }
}