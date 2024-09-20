public class Activity {
    
    public static void main(String arges[]){

    Dog doggie = new Dog();

    //Set the value of name
    doggie.setName("KriKa");

    //Return the value of name
    System.out.println(doggie.showName());
    System.out.println();

    //Prints "Woof! Woof!"
    doggie.bark();

    //Print isMale
    doggie.isMale = true;
    System.out.println();
    System.out.println(doggie.showName() + " is Male:  " + doggie.isMale);

    //Set the value of list puppies
    doggie._setPuppies(new String[] {"Mica", "Jerick", "Christine", "Johnrey"}); 
    System.out.println();

    // Set the number of Puppies
    doggie._SetnumOfpuppies(5);
    
    //Return the number of Puppies
    System.out.println("Number of Puppies: " + doggie._showNumofPuppies());
    System.out.println();

    //Print all the names of Puppies
    System.out.println("Names of Puppies: ");
    doggie._showPuppies();
    
    }
 }
