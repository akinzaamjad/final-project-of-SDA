/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginnotification;

import javax.management.Notification;

/**
 *
 * @author cbt
 */
public class NotificationFactory {
    
	public Notification createNotification(String channel)
	{
		if (channel == null || channel.isEmpty())
			return null;
		switch (channel) {
		case "SMS":
			return new SMSNotification();
		case "EMAIL":
			return new EmailNotification();
		case "PUSH":
			return new PushNotification();
	default:
            throw new IllegalArgumentException("Unknown channel "+channel);	
		
    
}
}
}
