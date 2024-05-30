public class DecoratorExample {
    public static void main(String[] args) {
        Person person1 = new NormalPerson();
        Person person2 = new CleverPerson(new NormalPerson());
        Person person3 = new LazyPerson(new NormalPerson());
        Person person4 = new CleverPerson(new LazyPerson(new NormalPerson()));
        Person person5 = new LazyPerson(new CleverPerson(new NormalPerson()));
        Person person6 = new StupidPerson(new LazyPerson(new NormalPerson()));

        person1.speak();
        person2.speak();
        person3.speak();
        person4.speak();
        person5.speak();
        person6.speak();
    }
}
