/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashara
 */


abstract class Ride_Bike {

    abstract void start_action();

    void release_gas() {
        System.out.println("Release the Gas as much you need");
    }

    void insert_key() {
        System.out.println("Inserting key and turning it to 'On' position");
    }

    void put_Helmet() {
        System.out.println("Putting on helmet");
    }

    public void ride() {
        put_Helmet();
        insert_key();
        start_action();
        release_gas();
    }
}

class Mannual extends Ride_Bike {

    public Mannual() {
        super();
    }

    @Override
    void start_action() {
        System.out.println("Apply the gear ");    }
    
}

 class Scooter extends Ride_Bike {

    public Scooter() {
        super();
    }

    @Override
    void start_action() {
        System.out.println("Press the break and ready to release gas");    }
    
}

public class TemplateMethod {
     public static void main(String[] args) {
        Ride_Bike obj1=new Mannual();
        Ride_Bike obj2=new Scooter();
        
        obj1.ride();
        System.out.println();
        obj2.ride();
        
    }
}
