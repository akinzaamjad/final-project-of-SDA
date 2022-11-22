/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payments;

/**
 *
 * @author cbt
 */
class payment {

   //create an object of SingleObject
   private static payment instance = new payment();

   //make the constructor private so that this class cannot be
   //instantiated
   private payment(){}

   //Get the only object available
   public static payment getInstance(){
      return instance;
   }

   public void Displaypayment(){
      System.out.println("PAYED");
   }
}
public class PAYMENTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          payment object = payment.getInstance();

      //show the message
      object.Displaypayment();
    }
    
}

