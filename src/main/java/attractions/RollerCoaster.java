package attractions;

import people.Visitor;

public class RollerCoaster  extends Attraction {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        double price = this.getRating()*3;
        return price;
    }

    public double priceFor(Visitor visitor) {
        double price = defaultPrice();
        double height = visitor.getHeight();
        if (height > 200) {
            price = price*2;
        }
        return price;
    }
}
