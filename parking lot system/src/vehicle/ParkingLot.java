package vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    int largeSpotSize;
    int compactSpotSize;
    int bikeSpotSize;

    List<LargeSpot> largeParkingSpotList;
    List<CompactSpot> compactParkingSpotList;
    List<BikeSpot> bikeParkingSpotList;

    public ParkingLot(int largeSpotSize,int compactSpotSize,int bikeSpotSize){
        this.largeSpotSize = largeSpotSize;
        this.compactSpotSize = compactSpotSize;
        this.bikeSpotSize = bikeSpotSize;

        largeParkingSpotList = new ArrayList<>();
        compactParkingSpotList = new ArrayList<>();
        bikeParkingSpotList = new ArrayList<>();
    }

    public void parkTheVehicle(Vehicle vehicle){
        System.out.println("We are parking vehicle number "+ vehicle.getVehicleNo() +" " +vehicle.getVehicleType());
        if(VehicleType.TRUCK.equals(vehicle.getVehicleType())){
            if(largeSpotSize > 0){
                parkLargeVehicle(vehicle);
            } else {
                System.out.println("Large parking spot is full");
            }
        } else if (VehicleType.CAR.equals(vehicle.getVehicleType())){
            if(largeSpotSize > 0){
                parkCompactVehicle(vehicle);
            } else {
                System.out.println("Compact parking spot is full");
            }
        } else if(VehicleType.BIKE.equals(vehicle.getVehicleType())){
            if(largeSpotSize > 0){
                parkBikeVehicle(vehicle);
            } else {
                System.out.println("Compact parking spot is full");
            }
        } else {
            System.out.println("Parking Not Allowed\n");
        }
    }

    private void parkLargeVehicle(Vehicle vehicle) {
        LargeSpot largeParkingSpot = new LargeSpot(ParkingType.LARGE);
        largeParkingSpot.setIsFree(false);
        largeParkingSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(largeParkingSpot);

        largeParkingSpotList.add(largeParkingSpot);
        largeSpotSize--;
        System.out.println("TRUCK PARKED SUCCESSFULLY\n");
    }

    private void parkCompactVehicle(Vehicle vehicle) {
        CompactSpot compactParkingSpot = new CompactSpot(ParkingType.COMPACT);

        compactParkingSpot.setIsFree(false);
        compactParkingSpot.setVehicle(vehicle);

        vehicle.setParkingSpot(compactParkingSpot);

        compactParkingSpotList.add(compactParkingSpot);
        compactSpotSize--;
        System.out.println("COMPACT VEHICLE PARKED SUCCESSFULLY \n");
    }

    private void parkBikeVehicle(Vehicle vehicle) {
        BikeSpot bikeParkingSpot = new BikeSpot(ParkingType.BIKE);

        bikeParkingSpot.setIsFree(false);
        bikeParkingSpot.setVehicle(vehicle);

        vehicle.setParkingSpot(bikeParkingSpot);

        bikeParkingSpotList.add(bikeParkingSpot);
        bikeSpotSize--;
        System.out.println("BIKE PARKED SUCCESSFULLY \n");
    }

    public void unparkTheVehicle(Vehicle vehicle) {
        System.out.println("UnParking the vehicle"+vehicle.getVehicleType());

        ParkingSpot parkingSpot = vehicle.getParkingSpot();
        parkingSpot.setIsFree(true);

        if(VehicleType.BIKE.equals(vehicle.getVehicleType())){
            bikeSpotSize++;
        } else if(VehicleType.CAR.equals(vehicle.getVehicleType())) {
            compactSpotSize++;
        } else {
            compactSpotSize++;
        }

        System.out.println("Unparked the Vehicle successfully \n");
    }
}
