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
public class Loginnotification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // public class NotificationService {
    
        NotificationFactory notificationFactory = new NotificationFactory();
        notification notification = (notification) notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}

    
    

