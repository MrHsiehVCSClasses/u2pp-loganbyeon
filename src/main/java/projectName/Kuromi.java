public class Kuromi extends Sanrio {
    //Attribute
    boolean mood;

    public Kuromi(String name, String species, String birthday){
        super(name, species, birthday);
    }

    //This method overrides Sanrio's greet method
    public void greet(){
        //super.greet(); *calls the parent greeting too
        System.out.println("I am a rebel >:]");
    }

    //Method overloading
    public void sayAge(String age){
        System.out.println(age);
    }

    public void isHappy(boolean mood){
        if(mood == true){
            System.out.println("I am happy :)");
        }
        else{
            System.out.println("I am sad :(");
        }
    }
}