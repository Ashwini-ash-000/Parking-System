import vehicle.ParkingLot;
import vehicle.ParkingSpot;
import vehicle.ParkingType;
import vehicle.Vehicle;
import vehicle.VehicleType;

public class App {
    public static void main(String[] args) throws Exception {


        // parking ticket price home work payment in hours 
        // multi level parking
        //entry and exit gate --> ticket

        ParkingLot parkingLot = new ParkingLot(1, 2, 3);

        Vehicle v1 = new Vehicle("KA-1727", VehicleType.BIKE);
        parkingLot.parkTheVehicle(v1);

        Vehicle v2 = new Vehicle("KA-1427", VehicleType.TRUCK);
        parkingLot.parkTheVehicle(v2);
    }
}
