package stalls;

import people.Visitor;

public class TobaccoStall extends Stall {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
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
        if (age > 17) {
            return true;
        }
        return false;
    }
}
