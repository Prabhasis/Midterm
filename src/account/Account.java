/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Sivagama
 */
public class Account {

    
        private double balance;
        private final double interestRate=0.23;
        private final String user;
        private double deposit;
 
     /**constructor that takes the initial balance
      * @param initialBalance 
     * @param givenUser 
      */
        public Account(double initialBalance,String givenUser)
        {
            this.user=givenUser;
            if (50 >= balance)
          this.balance=initialBalance;
            
            //Note that the initial balance must be greater than 50.       
        }

     /**The method for depositing amount and
     * @param depositAmount */
        
         public void deposit(double depositAmount)      {                                                                
       if (depositAmount < 50.0) // if the depositAmount is valid 
           
       {System.out.println("This InitiaL balance should be greater than 50");}
            balance = balance + depositAmount; // add it to the balance
      }     
     // * updating balance
        public void credit(double amount)
        {
            balance=getBalance()+ amount * getInterestRate();
           
        }

     /**The method for debit(withdrawing amount) and 
      * updating balance */
               
     /**The getter for the balance
     * @return the balance
     */
        public double getBalance() 
        {
        return balance;
        }

    /**The getter for InterestRate
     * @return the interestRate
     */
        public double getInterestRate() 
        {
            return interestRate;
        }

    /**user is the read only field
     * @return the user
     */
    public String getUser() {
        return user;
    }
    
    
}//class end
