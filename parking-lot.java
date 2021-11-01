// Parking Lot design
// Based on : https://www.youtube.com/watch?v=V9NEOLpt3tg

public class ParkingLot {

	List<ParkingFloor> floors;
	List<Entrance> entrances;
	List<Exit> exits;
	public Address address;
	String name parkingLotName;
	
	public boolean isParkingSpaceAvailable(Vehicle vehicle);
	public boolean updateAttendant(ParkingAttendant attendant, int gateId);
}

public class ParkingFloor {
	int levelId;
	boolean isFull;
	List<ParkingSpot> parkingSpots;
	ParkingDisplayBoard parkingDisplayBoard;

}

public class DisplayBoard {
	private Integer availableSpots;
	private ParkingFloor parkingFloor;
}

public class Gate {
	Integer gateId;
	ParkingAttendant parkingAttendant;
}

public class Entrance extends Gate {
	public ParkingTicket issueParkingTicket(Vehicle vehicle);
}

public class Exit extends Gate {
	public ParkingTicket payForParkingTicket(ParkingTicket parkingTicket);
}

class ParkingTicket {
	
	int ticketId;
	int levelId;
	int spaceId;
	Date vehicleEntryDateTime;
	Date vehicleExitDateTime;
	ParkingSpotType parkingSpaceType;
	double totalCost;
	ParkingTicketStatus parkingTicketStatus;

	public void updateTotalCost();
	public void updateVehicleExitTime(Date vehicleExitDateTime);

} 

public enum ParkingTicketStatus {
	PAID, 
	ACTIVE,
	INACTIVE
}

public class Address {
	private String country;
	private Street state;
	private String city;
	private Street street;
	private String pinCode;
}

public class Account {
	private String empId;
	private String name;
	private String email;
	private String password;
	private Address address;
	private Role role;
}

public class Admin extends Account {

	public boolean addParkingSpot(ParkingSpot spot, ParkingFloor floor);
	public boolean addParkingFloor(ParkingFloor floor, ParkingLot lot);
	public boolean addDisplayBoard(DisplayBoard displayBoard, ParkingFloor floor);


}


public class ParkingAttendant extends Account {
	PaymentService payment;
	private Boolean processVehicle(Vehicle vehicle);
	private PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType paymentType);
}

public class Vehicle {
	private String licenseNumber;
	private VehicleType vehicleType;
	private ParkingTicket parkingTicket;
	private PaymentInfo paymentInfo;

}

public class PaymentInfo {

	double amount;
	Date paymentDate;
	int transactionId;
	ParkingTicket parkingTicket;
	PaymentStatus paymentStatus;

}


public  class ParkingSpot {
	private Integer spotId;
	private boolean isFree;
	private Double costPerHour;
	private Vehicle vehicle;
	private ParkingSpotType type;
}

public class ParkingDisplayBoard {

	private Map<ParkingSpotType, Integer> availableSpots;
	
	private void updateAvailability(ParkingSpotType parkingSpaceType, Integer availableSpots);

}


public enum ParkingSpotType {
	CAR_PARKING,
	BIKE_PARKING,
	TRUCK_PARKING
}

public enum Vehicle {
	BIKE,
	CAR,
	TRUCK
}



public enum PaymentStatus {
	UNPAID,
	PENDING,
	COMPLETED,
	DECLINED,
	CANCELLED, 
	REFUNDED
}

public enum PaymentType {
	CASH,
	CREDIT_CARD,
	NET_BANKING,
	DEBIT_CARD,
	UPI
}

class Payment {

	public PaymentInfo makePayment(ParkingTicket parkingTicket, PaymentType paymentType);
}
