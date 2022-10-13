public class MyMelody extends Sanrio {
    //Attribute
    String color;

    public MyMelody(String name, String species, String birthday){
        super(name, species, birthday);
    }

    //This method overrides Sanrio's greet method
    public void greet(){
        //super.greet(); *calls the parent greeting too
        System.out.println("I love pink!");
    }
}