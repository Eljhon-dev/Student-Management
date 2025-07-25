import java.util.Scanner;

public class Admin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student manage = new Student();
       
        
        int choice;
       
        
        while (true){
            System.out.println("Select: ");
            System.out.println("1. Add a Student");
            System.out.println("2. Remove a Student");
            System.out.println("3. Replace a Student");
            System.out.println("4. Dispay all Student");
            System.out.println("5. Exit");
            
            choice = sc.nextInt();
        
           
            switch (choice){
                
                case 1: {
                    System.out.println("Enter the new Student name: ");
                    String name = sc.next();
                    manage.Addstudent(name);
                }
                break;
                
                case 2:{
                    manage.displaystudent();

                    System.out.println("\nEnter the Student name to remove: ");
                    String name = sc.next();
                    manage.removestudent(name);
                }
                break;
            
                case 3:{
                    manage.displaystudent();

                    System.out.println("\nEnter the Student number and name to replaced: ");
                    int number = sc.nextInt();
                    String name = sc.next();
                    manage.replacestudent(number, name);
                }
                break;
            
                case 4: 
                    System.out.println("List of the Students: ");
                    manage.displaystudent();
                
                break;
                
                case 5:
                    System.out.println("Exiting the program: ");
                break;
                
                default:
                    System.out.println("Select again");
                break;
            }
            if (choice == 5){
                break;
            }
        }
        
    }
}
