public class Person {
    String name;
    int age;
//    public static Person createPerson(String name, int age) {
//        Person person = new Person();
//        person.name = name;
//        person.age = age;
//        return person;
//    }

    //    Можно без статик так даже лучше
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
