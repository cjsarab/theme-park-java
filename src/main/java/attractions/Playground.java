package attractions;

import people.Visitor;

public class Playground extends Attraction {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        double price = 0;
        return price;
    }

    public double priceFor(Visitor visitor) {
        double price = defaultPrice();
        return price;
    }

}
