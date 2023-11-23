public class Main {



    public static void main(String[] args) {
        //        Все объекты не обходятся без New
//          Было
//        Person sarah = Person.createPerson("Sarah", 17);
//        Стало
        Person sarah = new Person("Сара", 17);
        System.out.println("sarah.name = " + sarah.name);
        System.out.println("sarah.age = " + sarah.age);

//        Car audi = Car.createCar("Audi", 17, "black");
        Car audi = new Car("Audi", 17, "black");
        System.out.println(audi.model);

        Person john = new Person("Джон", 18);
        System.out.println(john.name);

        Car bmw = new Car("asd", 341, "black");
        System.out.println(bmw.year);

        Salon salonBmw = new Salon("Чёрный", "Мягкий");
        System.out.println(salonBmw.color);
        System.out.println(salonBmw.materialSalon);
    }


}