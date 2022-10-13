
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        System.out.println("Hi! This is an empty project./nYour code will start running from Main.java./nIt may be daunting to start a project from scratch, but try to have fun with it! :)");

        // Use this space to test your code, or actually run your project

        //Create an object of Scanner
        Scanner input = new Scanner(System.in); 

        while(true){

            //Create custom character with user input
            System.out.print("Enter your character's name: ");
            String name = input.nextLine();    

            System.out.print("Enter your character's species: ");
            String species = input.nextLine();

            System.out.print("Enter your character's birthday: ");
            String birthday = input.nextLine();

            System.out.print("Select a character: m - MyMelody, k - Kuromi, or press enter: ");
            String character = input.nextLine();

            if(character.equals("m")){
                //For subclass MyMelody
                Sanrio melody = new MyMelody(name, species, birthday);
                melody.greet();
            }
            else if(character.equals("k")){
                //For subclass Kuromi
                Kuromi kuromi = new Kuromi(name, species, birthday);
                kuromi.isHappy(true);
                kuromi.greet();
                kuromi.sayAge("I am 16 years old.");
            }
            else{
                Sanrio mySanrio = new Sanrio(name, species, birthday);
                System.out.println(mySanrio);
            }
            System.out.println("Would you like to continue? y - Yes");
            String choice = input.nextLine();

            if(!choice.equals("y")){
                break;
            }
        }
        //Closes the scanner
        input.close();
    }
}