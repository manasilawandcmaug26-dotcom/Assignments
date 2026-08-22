ass StudentMarks{

    public static void main(String args[]){
    
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
           }

}

