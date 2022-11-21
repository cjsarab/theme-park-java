package attractions;

import people.Visitor;


public class Dodgems extends Attraction {

    Visitor visitor;

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        double price = this.getRating()*2;
        return price;
    }

    public double priceFor(Visitor visitor) {
        double price = defaultPrice();
        int age = visitor.getAge();
        if (age < 13) {
            price = price/2;
        }
        return price;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return true;
    }
}
