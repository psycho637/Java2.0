package solution4_2;

public class Jellybean extends Sweetness {
    private String color;

    public Jellybean(String name, Double weight, Double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Мармеладка " + super.toString() + color;
    }
}
