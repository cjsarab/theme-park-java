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

    public boolean isAllowedTo(Visitor visitor) {
        int age = visitor.getAge();
        if (age < 16) {
            return true;
        }
        return false;
    }

}
