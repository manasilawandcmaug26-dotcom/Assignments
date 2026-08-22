class EvenNumbers {

       public static void printEvenNumbers() {
        
        int number = 1;

        while (number <= 50) {
           
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
            
            number++;
        }
        System.out.println(); 
    }

  
       public static void main(String[] args) {
             printEvenNumbers();
    }
}