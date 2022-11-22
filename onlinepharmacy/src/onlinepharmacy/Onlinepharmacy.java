/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlinepharmacy;

/**
 *
 * @author Ahsan zafar
 */

import java.util.*;
import static javax.swing.text.html.HTML.Tag.S;
// concept of composition
class User
{
   int login_id;
   String pwd;
   int phone_no;
   String address;
   ArrayList<patient> patientList;
     
     // login_id  
   public void setpatient_login_id(int login_id)
   {
       this.login_id=login_id;
   }
   
   public int getpatient_login_id()
   {
       return this.login_id;
   }
   
   //password
   public void setpatient_pwd(String pwd)
   {
       this.pwd=pwd;
   }
   
   public String getpatient_pwd()
   {
       return this.pwd;
   }
   // phone no.
   public void setpatient_phone_no(int phone_no)
   {
       this.phone_no=phone_no;
   }
   
   public int getpatient_phone_no()
   {
       return this.phone_no;
   }
   // Address
   public void setpatient_address(String adress)
   {
       this.address=address;
   }
  
   public String getpatient_address()
   {
       return this.address;
   }
   
 
   public void setpatientList()
   {
   // create patient object
   patient patient1=new patient(201313,"kinzaamjad@gmail.com",012345345,"shakargarh"); //(login,pwd,phone no,address)
   ArrayList<patient> B=new ArrayList<>();
   B.add(patient1);
   this.patientList=B;
   }
   
   public List<String> getpatientList()
    {
        List<patient> B=this.patientList;
        List<String> detail=new ArrayList<>();
        for(patient buy:B)
        {
            detail.add(buy.getlogin_id());
            detail.add(buy.getpwd());
            detail.add(buy.getaddress());
            detail.add(buy.getphone_no());
            
        }
        return detail;
    }

ArrayList<Seller> SellerList;
   
     // login_id  
   public void setSeller_login_id(int login_id)
   {
       this.login_id=login_id;
   }
   
   public int getSeller_login_id()
   {
       return this.login_id;
   }
   
   //password
   public void setSeller_pwd(String pwd)
   {
       this.pwd=pwd;
   }
   
   public String getSeller_pwd()
   {
       return this.pwd;
   }
   // phone no.
   public void setSeller_phone_no(int phone_no)
   {
       this.phone_no=phone_no;
   }
   
   public int getSeller_phone_no()
   {
       return this.phone_no;
   }
   // Address
   public void setSeller_address(String adress)
   {
       this.address=address;
   }
  
   public String getSeller_address()
   {
       return this.address;
   }
    public void setSellerList()
   {
   // create Seller object
   Seller Seller1=new Seller(201313,"23054",012345678,"shakargarh"); //(login,pwd,phone no,address)
   ArrayList<Seller> S=new ArrayList<>();
   S.add(Seller1);
   this.SellerList=S;
   }
   public List<String> getSellerList()
    {
        List<Seller> c=this.SellerList;
        List<String> detail=new ArrayList<>();
        for(Seller sell:S)
        {
            detail.add(sell.getlogin_id());
            detail.add(sell.getpwd());
            detail.add(sell.getaddress());
            detail.add(sell.getphone_no());
            
        }
        return detail;
    }
   
   
   
   





public class Onlinepharmacy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User user1=new User();
        user1.setpatientList();
        user1.setSellerList();
        System.out.println("Buyer details are:"+user1.getpatientList());
        System.out.println("Buyer details are:"+user1.getSellerList());
    }
}
