public class LazyPerson extends PersonDecorator{
    public LazyPerson(Person person) {
        super(person);
    }

    @Override
    public void speak() {
        System.out.print("Lazy ");
        super.speak();
    }
}
