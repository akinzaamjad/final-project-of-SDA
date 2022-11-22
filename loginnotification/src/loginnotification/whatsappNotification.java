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

public class whatsappNotification extends Notification {

    public whatsappNotification(String string, Object o, long l) {
        super(string, o, l);
    }

    whatsappNotification() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 public void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending an e-mail notification");
    }
}