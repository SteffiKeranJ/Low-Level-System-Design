//  The Factory Method Pattern defi nes an interface
// for creating an object, but lets subclasses decide which
// class to instantiate. Factory Method lets a class defer
// instantiation to subclasses.

public class NotificationService {

	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("sms");
		notification.notifyUser();
	}
}


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

public interface Notification {
	void notifyUser();
}
       

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

