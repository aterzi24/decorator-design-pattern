public class StupidPerson extends PersonDecorator {
    public StupidPerson(Person person) {
        super(person);
    }

    @Override
    public void speak() {
        System.out.print("Stupid ");
        super.speak();
    }
}
