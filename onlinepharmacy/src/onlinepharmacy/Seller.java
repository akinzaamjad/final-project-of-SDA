/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinepharmacy;

/**
 *
 * @author Ahsan zafar
 */
class Seller {
  private int login_id;
  private String pwd;
   private int phone_no;
  private String address;
   public Seller(int login_id)
   {
       this.login_id=login_id;
   }

        private Seller(int i, String string, int i0, String lamabad) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
   public int getlogin_id()
   {
       return this.login_id;
   }
   
   public Seller(String pwd)
   {
       this.pwd=pwd;
   }
   public String getpwd()
   {
       return this .pwd;
   }
   
   public Seller(int phone_no)
   {
       this.phone_no=phone_no;
   }
   public int getphone_no()
   {
       return this.phone_no;
   }
   public Seller(String address)
   {
       this .address=address;
       
   }
   public String getaddress()
   {
       return this.address;
   }  

}
