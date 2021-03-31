/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testdrivendevelopment;



/**
 *
 * @author Ziyaad Petersen- 219083479
 */
 public class Store {
     //intitalizing variables
    private int applePrice;
    private int bananaPrice;
    private int kiwiPrice;
    private int total;
    
//getters and setters
    public int getApplePrice() {
        return applePrice;
    }

    public void setApplePrice(int applePrice) {
        this.applePrice = applePrice;
    }

    public int getBananaPrice() {
        return bananaPrice;
    }

    public void setBananaPrice(int bananaPrice) {
        this.bananaPrice = bananaPrice;
    }

    public int getKiwiPrice() {
        return kiwiPrice;
    }

    public void setKiwiPrice(int kiwiPrice) {
        this.kiwiPrice = kiwiPrice;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
   
       
    
    //constructor
      public Store(int applePrice, int bananaPrice, int kiwiPrice){
        this.applePrice =applePrice;
        this.bananaPrice= bananaPrice;
        this.kiwiPrice= kiwiPrice; 
    }
  // running totals of bananas and kiwis
     public static void main(String[] args) {
         int kiwiPrice=5;
         int bananaPrice=10;
         int bananaAmount=5;
         int kiwiAmount= 10;
         int kiwiTotal= kiwiAmount*kiwiPrice;
         int bananaTotal= bananaPrice*bananaAmount;
         System.out.println("total price of kiwis");
         System.out.println(kiwiTotal);
         System.out.println("total price of all bananas");
         System.out.println(bananaTotal);

     }
 
    @Override
    public String toString() {
        return "Store{" + "applePrice=" + applePrice + ", bananaPrice=" + bananaPrice + ", kiwiPrice=" + kiwiPrice + ", total=" + total + '}';
    }
 }