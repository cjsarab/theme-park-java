package attractions;

import people.Visitor;

public class Park extends Attraction {

    public Park(String name, int rating) {
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
