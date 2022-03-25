import java.util.Scanner;

class IncrementCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary,increment=0;
        double rating;

        System.out.println("Enter the salary");
        salary = scanner.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        rating = scanner.nextDouble();
        
        if (salary <= 0 || rating < 1 || rating > 5) {
            System.out.println("Invalid Input");
        } 
        
        else {
            
            if (rating <= 3) {
                increment = salary * 10 / 100;    
            } else if (rating <= 4) {
                increment = salary * 25 / 100;
            } else if (rating <= 5) {
                increment = salary * 30 / 100;
            }
            
            salary += increment;
            System.out.println(salary);
        }
    }
}
