public abstract class PersonDecorator implements Person {
    private final Person person;

    public PersonDecorator(Person person) {
        this.person = person;
    }

    @Override
    public void speak() {
        person.speak();
    }
}
