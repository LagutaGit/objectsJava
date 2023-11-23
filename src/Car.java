public class Car {
    private String model;
    private int year;
    private String color;

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

    public String toString() {
        return "Модель " + this.model + " год выпуска " + this.year + " цвета " + this.color;
    }

}
