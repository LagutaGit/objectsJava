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

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.age;
    }

    //    Если хотим поменять возраст, то используются setterы
    public void increaseAge(int increaseAge) {


//        Делаем проверку на отрицательный возраст
        if (increaseAge < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }

        this.age = age + increaseAge;

    }

//    Проверка на то есть ли 18

    public boolean isAdult() {
        return this.getYear() > 18;
    }
//    Если печатать объект то это ВАЖНО!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public String toString(){
        return "Имя " + this.name + " возраст " + this.age;
    }

}
