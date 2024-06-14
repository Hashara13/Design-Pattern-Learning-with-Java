/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package design.patterns;

/**
 *
 * @author Hashara
 */

// Facade Design Pattern

interface PickMe{
    void Pickup_Cost();
}
  
class Ride implements PickMe{
    @Override
    public void Pickup_Cost(){
        System.out.println("LKR 615/= for a car");
    }
     public void Passengers_Count(){
        System.out.println("3 Persons");
    }
}

class Food implements PickMe{
    @Override
    public void Pickup_Cost(){
        System.out.println("LKR 3200/= for your meal ");
    }
     public void DistanceToOutlet(){
        System.out.println("1.5 KM");
    }
}

class Delivery{
    Ride getRide;
    Food getFood;
    
    public Delivery(){
      getRide=new Ride();
      getFood=new Food();
    }
    
    public void ride(){
        getRide.Pickup_Cost();
        getRide.Passengers_Count();
    }
    
      public void food(){
        getFood.Pickup_Cost();
        getFood.DistanceToOutlet();
    }
    
}

public class DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Delivery obj=new Delivery();
        obj.ride();
        System.out.println();
        obj.food();
    }
    
}
