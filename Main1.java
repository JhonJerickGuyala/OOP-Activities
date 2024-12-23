public class Main1{

    public static void main (String[] arges){
       
        System.out.println();

        Student1 s1 = new Student1();

        s1.setId(6783);
        s1.setName("Jerick");
        System.out.println("Student ID: " + s1.getId());
        System.out.println("Student Name: " + s1.getName());
        System.out.println();

  
        System.out.println();

        Book1 b1 = new Book1();

        b1.setBookNumber(18);
        b1.setAuthor("Markus Zusak");
        b1.setTitle("The Book of Theif");
        b1.setPrice(400.00);
        System.out.println("Book Number: " + b1.getBookNumber());
        System.out.println("Book Title: " + b1.getTitle());
        System.out.println("Book Author: " + b1.getAuthor());
        System.out.println("Book Price: " + b1.getPrice());
        System.out.println();
    }


}