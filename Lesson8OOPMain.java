import zoo.Animal;
import zoo.Cat;
import zoo.Dog;

public class Main {
    public static void main(String[] args) {
       /* Point point = new Point(3,2);
        Circle circle = new Circle(10, point);

        System.out.println(circle.center.axelX);
*/

        //EXERCISE
        //create package ZOO
        //Create class Animal with members : age , weight and name.
        //create constructor with 3 parameters (age weight and name)
        //create method printAll in the class Animal
        // which will print all members of the animal.
        //in the main create two animals and print them.
    /*    Animal animal1 = new Animal(2, 3, "animal1");
        Animal animal2 = new Animal(5, 8, "animal2");*/
//        System.out.println(animal2.getAge());
        //animal1.age = 10;
    /*    animal1.setAge(10);
        animal2.printAll();
        animal1.printAll();*/
     /*   Cat cat1 = new Cat(3, 5, "Fiodor", 15);
        //cat1.printAll();
        //animal1.printAll();
        *//*Dog dog1 = new Dog(13, 20, "Puppy");
        dog1.bark();
        dog1.printAll();*//*
        System.out.println(cat1.toString());*/

        Animal animal1;
        Animal animal2;
        Animal animal3;

        animal1= new Animal(15, 10, "First");
        animal2= new Cat(10, 3, "Second");
        animal3 = new Dog(13, 5, "Third");

        animal1.saySomething();
        animal2.saySomething();
        animal3.saySomething();



    }
}
