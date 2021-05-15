//package lowLevelDesign;
//
//import java.util.*;
//
//public class parkingLotService {
//
//    List<Floor> floorList;
//    List<Gate> EntryGates;//yeh bahut saare honge
//    List<Gate> ExitGates;// yeh bhi
//
//    Gate EntranceGate;//building ka gate
//    Gate ExitGate;//building ka gate
//
//    BookMyShow.Address address;
//
//    String parkingLotName;
//
//    public boolean isParkingSpaceAvailableForVehicle() {
//    }
//
//    ;
//
//    public boolean updateParkingAttendant() {
//    }
//
//    ;
//
//
//    boolean issueParkingTicket() {
//
//    }
//
//    public class Floor {
//
//        int levelId;
//        int floorCapacity;
//        int occupiedSpots;
//
//        public Floor(int levelId, int floorCapacity, int occupiedSpots, Person parkingAttedant,
//                     DisplayBoard displayBoard, Gate entranceGate, Gate exitGate, Map<VehicleType,
//                Integer> layoutDetails) {
//            this.levelId = levelId;
//            this.floorCapacity = floorCapacity;
//            this.occupiedSpots = occupiedSpots;
//            this.parkingAttedant = parkingAttedant;
//            this.displayBoard = displayBoard;
//            this.entranceGate = entranceGate;
//            this.exitGate = exitGate;
//            this.parkingLayout = new HashMap<>();
//
//            for (VehicleType key : layoutDetails.keySet()){
//                int size = layoutDetails.get(key);
//                List<ParkingSpot> lst = new ArrayList<>();
//                for(int i=0; i<size; i++){
//                    if (key == VehicleType.TWO_WHEELER){//factory design patterns
//                        lst.add(new TwoWheelerParkingSpot());
//                    } else if (key == VehicleType.FOUR_WHEELER){
//                        lst.add(new FourWheelerParkingSpot());
//                    } else if(key == VehicleType.THREE_WHEELER ){
//                        lst.add(new TruckParkingSpot()){
//
//                        }
//                    }
//
//                }
//            }
//        }
//
//        public boolean isFull(){
//            return floorCapacity - occupiedSpots == 0;
//        }
//        public void markOutOfOrder(){};
//        Person parkingAttedant;
//        DisplayBoard displayBoard;
//        Gate entranceGate;//floor ka entrance gate
//        Gate exitGate;//floor ka exit gate
//        Map<VehicleType, List<ParkingSpot>> parkingLayout; //this is susbcriber of floor, smth happens on floor, this will be told.
//
//    }
//
//    public class Person {
//
//        int UID;
//        int name;
//        BookMyShow.Address address;
//        int floorId;
//    }
//
//
//    public class ParkingSpot {
//        int parkingSpotId;
//        int customerId;
//        Floor floor;
//        boolean isFree;
//        Vehicle vehicle;
//        double costPerHour;
//        Date entryTime;
//        Date exitTime;
//    }
//
//    public class TwoWheelerParkingSpot extends ParkingSpot {//here it is , IS_A_relationship, TwoWheelerParkingSpot is a
//        //ParkingSpot.
//        private int CAPACITY = 1;
//
//    }
//    public class FourWheelerParkingSpot extends ParkingSpot {
//        private int CAPACITY = 2;
//    }
//    public class TruckParkingSpot extends ParkingSpot {
//        private int CAPACITY = 3;
//
//    }
//
//    ;
//    //open closed principle, cycle aa gayi toh.physically handicaped people walon ki gadi.
//    //
//
//    public class Gate {
//
//        int gateId = 0;
//        Person parkingAttendent = null;
//
//        boolean isOpen;
//        boolean isCLosed;
//
//        void hasEntrance() {
//
//        }
//
//        void hasExit() {
//
//        }
//
//    }
//
//    public class Entrance extends Gate {
//        //EntranceGate is a type of Gate
//        List<Gate> EntranceGate;
//
//    }
//
//    public class Exit extends Gate {
//        List<Gate> ExitGate;
//
//        int processPaymentTicket(ParkingTicket parkingTicket, int paymentAmount) {
//            return 0;
//        }
//    }
//
//    public class ParkingTicket {
//        int parkingTicketId;
//        int floorId;
//        int ParkingSpaceId;
//        Date VehicleEntryDate;
//        Date VehicleExitDate;
//        ParkingSpot parkingSpot;
//        double totalCost;
//        ParkingTicketStatus parkingTicketStatus;
//
//
//    }
//
//    public class DisplayBoard {
//        Map<ParkingSpot, Integer> freeSpotAvailable;//is display board pe saari parking space se related details
//        //hongi.
//        int displayFloorBoardId;
//
//        public void updateFreeSpotAvailable(ParkingSpot parkingSpot, int spaces) {
//        }
//
//        ;//then will update the space
//
//    }
//
//    public class Vehicle {
//        int id;
//        int plateNumber;
//        VehicleType vehicleType;
//    }
//
//    public class parkingTicket {
//
//        int parkingTicketId;
//        int floorId;
//        ParkingSpot parkingSpot;
//        VehicleType vehicleType;
//        int vehicleNumber;
//        int totalCost;
//        ParkingTicketStatus parkingTicketStatus;
//        Person allotedPerson;
//
//    }
//
//    public enum VehicleType {
//        FOUR_WHEELER, TWO_WHEELER, THREE_WHEELER;
//
//    }
//
//    public enum ParkingTicketStatus {
//        ACTIVE, PAID;
//    }
//
//    public class Payment {
//        PaymentInfo makePayment(PaymentType paymentType) {
//        }
//
//        ;
//        PaymentType paymentType;
//
//    }
//
//    public class PaymentInfo {
//        double amount;
//        Date dateOfthePayment;
//        PaymentType paymentMode;
//        PaymentStatus paymentStatus;
//        double transactionId;
//
//    }
//
//    public enum PaymentStatus {
//        UNPAID, PENDING, TRANSACTION_SUCCESS, TRANSACTION_FAILED,
//    }
//
//    public enum PaymentType {
//        CREDIT, DEBIT, CASH;
//    }
//
//    public class Account {
//        int employeeID;
//        String name;
//        String email;
//        String password;
//        BookMyShow.Address address;
//    }
//
//    public class Admin extends Account {
//        void allotParking(VehicleType vehicleType, ParkingSpot parkingSpot, Floor parkingFloor) {
//        }
//
//
//        void updateParkingLot() {
//        }
//
//        ;
//
//        void addParkingSpace(Floor floor, ParkingSpot parkingSpot) {
//        }
//
//        ;
//    }
//
//    public class ParkingAttendant extends Account {
//
//        Payment paymentService;
//
//    }
//
//    void processPayment(ParkingTicket parkingTicket, PaymentType paymentType) {
//
//
//    }
//
//
//
//}
