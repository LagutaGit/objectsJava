public class Main {
    public static void main(String[] args) {
        //        Все объекты не обходятся без New
//          Было
//        Person sarah = Person.createPerson("Sarah", 17);
//        Стало
        Person sarah = new Person("Сара", 30);
//        Старый варик
//        if (sarah.getYear() > 18) {
//            System.out.println("МОЖНА");
//        } else {
//            System.out.println("НИЗЯ");
//        }
//        Новый варик
        if (sarah.isAdult()) {
            System.out.println("МОЖНА");
        } else {
            System.out.println("НИЗЯ");
        }

        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getYear());
        System.out.println(sarah.toString());
        sarah.increaseAge(30);
        System.out.println(sarah.toString());



////        Car audi = Car.createCar("Audi", 17, "black");
//        Car audi = new Car("Audi", 17, "black");
////        System.out.println(audi.model);
//        System.out.println(audi.getModel());
//        System.out.println(audi.getColor());
//        System.out.println(audi.getYear());
//
//        Person john = new Person("Джон", 18);
//        System.out.println(john.getName());
//
//        Car bmw = new Car("asd", 341, "black");
//        System.out.println(bmw.getYear());
//        System.out.println(bmw.toString());
//
//        Salon salonBmw = new Salon("Чёрный", "Мягкий");
//        System.out.println(salonBmw.color);
//        System.out.println(salonBmw.materialSalon);
//        System.out.println(salonBmw.toString());
//        sarah.setAge(31);
//        System.out.println(sarah.getYear());
//        System.out.println(bmw.getYear());
    }

}