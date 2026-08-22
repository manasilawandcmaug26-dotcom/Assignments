import java.util.Scanner;

class MenuDrivenProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
          
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Identify Default Values of Variables");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n[Problem 1: Grade Evaluation System]");
                    int maths = 90;
                    int science = 80;
                    int history = 70;
          
                    String grade;

                    int totalmarks= maths + science + history;
                    int avgmarks = totalmarks / 3;
                
                    if (avgmarks >= 90) {
                      grade = "A";

                    }else if (avgmarks >= 70 && avgmarks <= 89) {
                      grade = "B";
                    } 
                    else if (avgmarks >= 50 && avgmarks <= 69) {
                      grade = "C";
                    } 
                    else if (avgmarks >= 30 && avgmarks <= 49) {
                      grade = "D";
                    }
                    else  {
                      grade = "Fail";
                    }

         
                    System.out.println("Average Marks:" + avgmarks);
                    System.out.println("Grade: "  + grade);
          
                break;

                case 2:

                    System.out.println("\n[Problem 2: Leap Year Check]");

                    int year = 2023;

                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

                    System.out.println(year + " is a Leap Year");

                    } else {

                    System.out.println(year + " is Not a Leap Year");
                    }


                    year = 2028;

                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

                    System.out.println(year + " is a Leap Year");

                    } else {

                    System.out.println(year + " is Not a Leap Year");
                    }
            
                    
                break;

                case 3:
                    System.out.println("\n[Problem 3: Day of the Week]");
                    int daynumber = 3;

                    switch (daynumber) {
                    case 1:
                    System.out.println("The day is Monday");
                    break;
                    case 2:
                    System.out.println("The day is Tuesday");
                    break;
                    case 3:
                    System.out.println("The day is Wednesday");
                    break;
                    case 4:
                    System.out.println("The day is Thursday");
                    break;
                    case 5:
                    System.out.println("The day is Friday");
                    break;
                    case 6:
                    System.out.println("The day is Saturday");
                    break;
                    case 7:
                    System.out.println("The day is Sunday");
                    break;
                    default:
                    System.out.println("Invalid day number");
                    break;
                    }

                    
                break;

                case 4:
                    System.out.println("\n[Problem 4: Identify Default Values of Variables]");
                    byte a = 0;
                    short b = 0;
                    int c = 0;     
                    long d = 0L;
                    float e = 0.0f;
                    double f = 00.00;
                    char g = 'D';
                    boolean h = false;


                    System.out.println("byte a:" +a);
                    System.out.println("short b:" +b);
                    System.out.println("int c:" +c);
                    System.out.println("long d:" +d);
                    System.out.println("float e:" +e);
                    System.out.println("double f:" +f);
                    System.out.println("char g:" +g);
                    System.out.println("boolean h:" +h);
           
                    
                break;

                case 5:
                    System.out.println("Exiting the program");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid selection!");
            }
        }
    }
}