public class Main2{

    public static void main (String[] args){

        Student2 student = new Student2("Jerick", "Brgy 10", "BSIT", 2);
        

        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Program: " + student.getProgram());
        System.out.println("Year: " + student.getYear());

        
        Staff2 staff = new Staff2("Raniel", "Brgy. San Piro", "BSU-Balayan", 30000.0);

        
        System.out.println("\nStaff Details:");
        System.out.println("Name: " + staff.getName());
        System.out.println("Address: " + staff.getAddress());
        System.out.println("School: " + staff.getSchool());
        System.out.println("Salary: " + staff.getSalary());
    }
}

