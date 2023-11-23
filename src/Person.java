public class Person {
    private String name;
    private int age;
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

    public String getName(){
        return this.name;
    }

    public int getYear() {
        return this.age;
    }

    //    Если хотим поменять возраст, то используются setterы
    public void setAge(int age) {
        this.age = age;
    }

}
