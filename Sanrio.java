public class Sanrio {
    //Attributes
    String name;
    String species;
    String birthday;
    
    //Constructor,, has parameters
    public Sanrio(String name, String species, String birthday){
        //Setting initial value for class attribute name, species, & birthday
        //Get user input to make a custom character
        this.name = name;
        this.species = species;
        this.birthday = birthday;
    }
    //Methods
    public String getName(){
        return name;
    }
    public String getSpecies(){
        return species;
    }
    public String getBirthday(){
        return birthday;
    }
    public void greet(){
        System.out.println("Hello, friend!");
    }
    public void sayAge(int age){
        System.out.println(age);
    }

    public String toString(){
        String n = "Your character's name is: " + name;
        String s = "Your character's species is: " + species;
        String b = "Your character's birthday is: " + birthday;

        return n + "\n" + s + "\n" + b;
    }
}