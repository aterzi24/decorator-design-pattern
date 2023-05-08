public class CleverPerson extends PersonDecorator{
    public CleverPerson(Person person) {
        super(person);
    }

    @Override
    public void speak() {
        System.out.print("Clever ");
        super.speak();
    }
}
