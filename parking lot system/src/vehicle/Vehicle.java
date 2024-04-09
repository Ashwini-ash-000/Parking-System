package vehicle;

public class Vehicle {
    private String vehicleNo;
    private VehicleType  vehicleType;
    private ParkingSpot parkingSpot;

    public Vehicle(String vehicleNo, VehicleType vehicleType) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNo()
    {
        return this.vehicleNo;
    }

    public VehicleType getVehicleType()
    {
        return this.vehicleType;
    }

    public ParkingSpot getParkingSpot()
    {
        return this.parkingSpot;
    }

    public void setVehicleNo(String vehicleNo)
    {
        this.vehicleNo=vehicleNo;
    }

    public void setVehicleType(VehicleType vehicleType)
    {
        this.vehicleType=vehicleType;
    }

    public void setParkingSpot(ParkingSpot parkingSpot)
    {
        this.parkingSpot = parkingSpot;
    }

    public void getVehicleDetails()
    {
        System.out.println("vehicle No : "+vehicleNo);
        System.out.println("vehicle type is : "+vehicleType);
        System.out.println("vehicle parking spot : "+parkingSpot);
    }
}
