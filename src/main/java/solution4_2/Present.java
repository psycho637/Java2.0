package solution4_2;

public class Present {
    public static void main(String[] args) {
        Double allprice = 0.0, allweight = 0.0;
        Candy mars = new Candy("Mars", 200.2, 45.2, "Шоколадная");
        Candy chup = new Candy("Chupa-chups", 30.4, 32.2, "Сосательная");
        Candy pop = new Candy("Шипучка", 10.1, 3.5, "Шипучая");
        Candy sour = new Candy("Кислинка", 12.0, 5.0, "Кислая");
        Jellybean bear = new Jellybean("Мармеладные мишки", 250.0, 67.7, "Разноцветные");
        Jellybean fish = new Jellybean("Мармеладные рыбки", 300.0, 58.6, "Синие");
        Cookies circle = new Cookies("Овсяное", 40.3, 15.2, 140.3);
        Cookies square = new Cookies("Крекер", 50.0, 61.5, 213.9);
        Marshmallow marshmallow = new Marshmallow("Маршмэллоу", 120.2, 150.6, "Цилиндрики");
        Sweetness[] present = {mars, chup, pop, sour, bear, fish, circle, square, marshmallow};

        for (Sweetness someSweetness : present) {
            System.out.println(someSweetness.toString());
        }

        for (Sweetness someSweetness2 : present) {
            allprice += someSweetness2.getPrice();
            allweight += someSweetness2.getWeight();
        }

        System.out.println("");
        System.out.println("Масса всего подарка = " + allweight);
        System.out.println("Стоимость всего подарка = " + allprice);
    }
}
