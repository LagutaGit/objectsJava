public class Salon {
    String color;
    String materialSalon;

    public Salon(String color, String materialSalon) {
        this.color = color;
        this.materialSalon = materialSalon;
    }

    public String toString() {
        return "Цвет " + this.color + " материал салона" + this.materialSalon;
    }
}
