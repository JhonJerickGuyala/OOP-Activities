class Dog{
    String name;
    boolean isMale;
    int numPuppies;
    String listofPuppies[] = new String[4];

    public void setName(String isName){
        isName = name;
    }

    public String showName(String isName){
        return isName;
    }

    public String bark(){
        return "woof woof";
    }

}