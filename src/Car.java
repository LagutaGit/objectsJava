public class Car {
    String model;
    int year;
    String color;

//    public  Car(String model, int year, String color) {
//        this.model = model;
//        this.year = year;
//        this.color = color;
//    }
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

}
