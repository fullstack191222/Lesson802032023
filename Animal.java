package zoo;

 public class Animal {
    private int age;
    private int weight;
    private String name;

    public Animal(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;

    }

     public void printAll() {

         System.out.println("Name: " + this.name + " age: " + this.age + " weight: " + weight);
     }


     public String toString() {
         return "Name: " + this.name + " age: " + this.age + " weight: " + weight;
     }

     public int getWeight() {
         return weight;
     }

     public void setWeight(int weight) {
         this.weight = weight;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
        //you can write the logic to get the field
        return this.age;
    }

    public void setAge(int otherAge) {
        this.age = otherAge;
    }


     public void saySomething() {
         System.out.println("I am just animal");
     }

}
