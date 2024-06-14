/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Template.newpackage;

/**
 *
 * @author Hashara
 */
public abstract class Ride_Bike {

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
