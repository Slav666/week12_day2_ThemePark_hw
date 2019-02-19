public abstract class Stall implements IReviewed{

    private String name;
    private String ownerName;
    private String parkingSpot;
    private int rating;


    public Stall(String name, String ownerName, String parkingSpot){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;

    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public int getRating(){
        return rating;
    }
}
