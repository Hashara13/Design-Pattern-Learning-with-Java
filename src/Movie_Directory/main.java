/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Movie_Directory;

/**
 *
 * @author Hashara
 */
public class main {
    public static void main(String[] args) {
        
        // call title method using movie1 var that assigned English
        Movie_Directory movie1=Factory.getMovie("English");
        movie1.title();
        Movie_Directory movie2=Factory.getMovie("Indian");
        movie2.title();
    }
}
