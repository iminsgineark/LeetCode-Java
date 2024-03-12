package Arrays;

public class OOPSRevision {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Iker";
        person.age = 42;
        System.out.println(person.name + " " + person.age);
        person.walk(34);

    }
    static class Person{
        String name;
        int age;

        Person(){
            System.out.println("It's a Constructor");
        }
        void walk(){
            System.out.println("Walking");
        }
        void eating(){
            System.out.println("Eating");
        }
        void walk(int stpes){
            System.out.println(name + " walked " + stpes);
        }
    }
}
