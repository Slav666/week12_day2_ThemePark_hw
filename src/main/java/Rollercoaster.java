public class Rollercoaster extends Attraction implements ITicketed, ISecurity{

    double price;

    public Rollercoaster(String name, int rating, double price) {

        super(name, rating);
        this.price = price;
    }

    @Override
    public double defaultPrice() {
        return price;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge()>=12 && visitor.getHeight()>= 145){
            return true;
        }
        return false;
    }



}
