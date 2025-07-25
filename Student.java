import java.util.ArrayList;

public class Student {
    private ArrayList<String> students;
   
    public Student(){
        students = new ArrayList<>();
            students.add("Eljhon");
            students.add("Josh");
            students.add("Joselle");
            students.add("Jamelle");
    }
    
    //add a student
    public void Addstudent(String name){
        students.add(name);
        System.out.println("\nStudent succesfully added: " + name);
    }
    
    //remove a student
    public void removestudent(String name){
        if (students.remove(name)){
            System.out.println("\n" + name + " has been removed");
        } else {
            System.out.println("\nStudent " + name + " is not on the list");
        }
    }
    
    //replacing a student
    public void replacestudent (int index, String New_name){
        if (index >= 0 && index < students.size()){
            String old_name = students.set(index, New_name);
            System.out.println("\nStudent " + old_name + " has been replaced by: " + New_name);
        } else {
            System.out.println("\ninvalid index");
        }
    }
    
    //display list of the students
    public void displaystudent(){
        System.out.println("\nStudents list: ");
        for (int i = 0; i < students.size(); i++){
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }
}


