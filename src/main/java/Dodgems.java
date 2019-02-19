

public class Dodgems extends Attraction implements ITicketed{

    private double defaultPrice;

    public Dodgems(String name) {
        super(name);
        defaultPrice = 3;

    }

    public double defaultPrice() {
        return this.defaultPrice;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12){
            return this.defaultPrice/2;
        }
        return this.defaultPrice;
    }
}
