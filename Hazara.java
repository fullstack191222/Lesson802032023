import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Hazara HW task 4
       /*Dog doggy1 = createDog();
       Dog doggy2 = createDog();
       Dog doggy3 = new Dog();
       doggy1.name = "doggy1";
       doggy2.name = "doggy2";
       doggy1.bark();
       doggy1.race = "labrador";
       doggy2.bark();
       System.out.println(doggy1.race);
       System.out.println(doggy2.race);*/

        String[] players = {"Messi", "Ronaldo", "Kourtua", "Ramos",
                "Pike", "Van Deik", "Neymar", "Mbappe",
                "Fernandes", "Modric", "De Breune"};
        FootballTeam dreamTeam = new FootballTeam("Dream Team", "World", 1000, players);
        dreamTeam.printTeam();
        dreamTeam.changePlayers("Neymar", "Saka");
        dreamTeam.printTeam();
        dreamTeam.changePlayers("Kourtua", "Noier");
        dreamTeam.printTeam();

        FootballTeam barca = new FootballTeam("Barca","Spain");


    }

    /*static Dog createDog() {
        Dog myDog = new Dog();
        return myDog;
    }

    static Dog create2Dogs() {
        Dog myDog = new Dog();
        Dog myDog2 = new Dog();
        return myDog;
    }*/


    static void printDog() {
        //create dog by calling new .. Dog doggy1 = new Dog();
        //print all attributesSystem.out.println(doggy.name + );
    }

}
