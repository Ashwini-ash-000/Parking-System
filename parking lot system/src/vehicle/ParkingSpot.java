package vehicle;

public class ParkingSpot {
    private ParkingType parkingType;
    private Boolean isFree;
    private Vehicle vehicle;

    public ParkingSpot(ParkingType parkingType)
    {
        this.parkingType = parkingType;
    }

    public ParkingType getParkingType()
    {
        return this.parkingType;
    }

    public Boolean getIsFree()
    {
        return this.isFree;
    }

    public Vehicle getVehicle()
    {
        return this.vehicle;
    }

    public void setParkingType(ParkingType parkingType)
    {
        this.parkingType = parkingType;
    }

    public void setIsFree(Boolean isFree)
    {
        this.isFree = isFree;
    }

    public void setVehicle(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }
}
