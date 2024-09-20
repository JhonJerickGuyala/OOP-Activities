class Dog{
    String Name;
    boolean isMale;
    int numPuppies;
    String list_of_Puppies[];

    public void setName(String name){
        Name = name;
    }

    public String showName(){
        return Name;
    }

    public void bark(){
        System.out.println("Woof! Woof!");
    }

    public void _SetnumOfpuppies(int numberPuppies){
        numPuppies = numberPuppies;
    }

    public int _showNumofPuppies(){
        return numPuppies;
    }

    public void _setPuppies(String[] doggie){
        list_of_Puppies = doggie;
    }

    public void _showPuppies(){
        for (int i = 0; i < list_of_Puppies.length; i++){
            System.out.println(list_of_Puppies[i]);
        }
    }
}