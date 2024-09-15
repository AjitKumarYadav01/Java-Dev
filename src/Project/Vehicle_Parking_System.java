package Project;
    import java.util.ArrayList;
import java.util.List;

    class Vehicle {
        private String licensePlate;
        private String type;
        private int parkingTime;

        public Vehicle(String licensePlate, String type, int parkingTime) {
            this.licensePlate = licensePlate;
            this.type = type;
            this.parkingTime = parkingTime;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public String getType() {
            return type;
        }

        public int getParkingTime() {
            return parkingTime;
        }
    }

    class ParkingSlot {
        private int slotNumber;
        private Vehicle vehicle;
        private boolean isOccupied;

        public ParkingSlot(int slotNumber) {
            this.slotNumber = slotNumber;
            this.isOccupied = false;
        }

        public int getSlotNumber() {
            return slotNumber;
        }

        public boolean isOccupied() {
            return isOccupied;
        }

        public void parkVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            isOccupied = true;
            System.out.println("Vehicle with license plate " + vehicle.getLicensePlate() + " parked at slot number " + slotNumber);
        }

        public void removeVehicle() {
            System.out.println("Vehicle with license plate " + vehicle.getLicensePlate() + " removed from slot number " + slotNumber);
            vehicle = null;
            isOccupied = false;
        }

        public Vehicle getVehicle() {
            return vehicle;
        }
    }

    class ParkingLot {
        private List<ParkingSlot> parkingSlots;
        private int capacity;

        public ParkingLot(int capacity) {
            this.capacity = capacity;
            parkingSlots = new ArrayList<>();
            for (int i = 1; i <= capacity; i++) {
                parkingSlots.add(new ParkingSlot(i));
            }
        }

        public boolean parkVehicle(Vehicle vehicle) {
            ParkingSlot availableSlot = getAvailableSlot();
            if (availableSlot != null) {
                availableSlot.parkVehicle(vehicle);
                return true;
            } else {
                System.out.println("Parking lot is full. Cannot park the vehicle.");
                return false;
            }
        }

        public void removeVehicle(Vehicle vehicle) {
            for (ParkingSlot slot : parkingSlots) {
                if (slot.isOccupied() && slot.getVehicle().getLicensePlate().equals(vehicle.getLicensePlate())) {
                    slot.removeVehicle();
                    return;
                }
            }
            System.out.println("Vehicle with license plate " + vehicle.getLicensePlate() + " is not parked in this parking lot.");
        }

        public void displayAvailableSlots() {
            System.out.println("Available slots: ");
            for (ParkingSlot slot : parkingSlots) {
                if (!slot.isOccupied()) {
                    System.out.print(slot.getSlotNumber() + " ");
                }
            }
            System.out.println();
        }

        private ParkingSlot getAvailableSlot() {
            for (ParkingSlot slot : parkingSlots) {
                if (!slot.isOccupied()) {
                    return slot;
                }
            }
            return null;
        }
    }

    class BillingSystem {
        private static final int HOURLY_RATE = 10;

        public static double calculateBill(int parkingTime) {
            int hours = parkingTime / 60;
            double bill = hours * HOURLY_RATE;
            return bill;
        }
    }

public class Vehicle_Parking_System {
        public static void main(String[] args) {
            ParkingLot parkingLot = new ParkingLot(5);

            Vehicle vehicle1 = new Vehicle("ABC123", "Car", 120);
            Vehicle vehicle2 = new Vehicle("XYZ789", "Motorcycle", 90);
            Vehicle vehicle3 = new Vehicle("DEF456", "Truck", 180);
            Vehicle vehicle4 = new Vehicle("GHI789", "Car", 60);
            Vehicle vehicle5 = new Vehicle("JKL012", "Motorcycle", 150);
            Vehicle vehicle6 = new Vehicle("MNO345", "Car", 240);

            parkingLot.displayAvailableSlots();

            parkingLot.parkVehicle(vehicle1);
            parkingLot.parkVehicle(vehicle2);
            parkingLot.parkVehicle(vehicle3);
            parkingLot.parkVehicle(vehicle4);
            parkingLot.parkVehicle(vehicle5);
            parkingLot.parkVehicle(vehicle6); // This will exceed the parking lot capacity

            parkingLot.displayAvailableSlots();

            parkingLot.removeVehicle(vehicle3);
            parkingLot.removeVehicle(vehicle6); // Vehicle6 is not parked in this parking lot

            parkingLot.displayAvailableSlots();

            double bill1 = BillingSystem.calculateBill(vehicle1.getParkingTime());
            double bill2 = BillingSystem.calculateBill(vehicle2.getParkingTime());

            System.out.println("Billing amount for vehicle with license plate " + vehicle1.getLicensePlate() + ": $" + bill1);
            System.out.println("Billing amount for vehicle with license plate " + vehicle2.getLicensePlate() + ": $" + bill2);
        }
    }


