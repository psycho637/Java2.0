package solution4_2;

public class Cookies extends Sweetness {
    private Double calories;

    public Cookies(String name, Double weight, Double price, Double calories) {
        super(name, weight, price);
        this.calories = calories;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Печенюшка " + super.toString() + " содержит " + calories + " калориев";
    }
}
