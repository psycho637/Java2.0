package solution4_2;

public class Marshmallow extends Sweetness {
    private String form;

    public Marshmallow(String name, Double weight, Double price, String form) {
        super(name, weight, price);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Зефирка " + super.toString() + " формой " + form;
    }
}
