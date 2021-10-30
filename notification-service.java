//  The Factory Method Pattern defines an interface
// for creating an object, but lets subclasses decide which
// class to instantiate. Factory Method lets a class defer
// instantiation to subclasses.


// In The Factory Method Pattern , we create object without exposing the creation logic to the client and refer to newly created object using a common interface.
public class NotificationService {

	// Use the Factory to get object of concrete class by passing an information such as type.
	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("sms");
		notification.notifyUser();
	}
}

// Create a Factory to generate object of concrete class based on given information.

public class NotificationFactory {
	public class Notification createNotification(String type) {
		if(type == null || type.isEmpty() {
			return null;
		} 
		switch(type) {
			case 'sms':
				return new SMSNotification();
			case 'push':
				return new PushNotification();
			case 'email':
				return new EmailNotification();
		}
		return null;
	} 
}

// Create an interface
public interface Notification {
	void notifyUser();
}

		   
// Create concrete classes implementing the Notification interface.

public class SMSNotification implements Notification {
	@Override
	void notifyUser() {
		System.out.println("Sending SMS Notification");
	}
}

public class EmailNotification implements Notification {
	@Override
	void notifyUser() {
		System.out.println("Sending Email Notification");
	}
}

public class PushNotification implements Notification {
	@Override
	void notifyUser() {
		System.out.println("Sending Push Notification");
	}
}

