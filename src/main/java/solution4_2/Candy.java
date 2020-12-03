package solution4_2;

public class Candy extends Sweetness {
    private String kind; //шоколадная, сосательная, шипучка или кислая

    public Candy(String name, Double weight, Double price, String kind) {
        super(name, weight, price);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Конфета " + super.toString() + kind;
    }
}
