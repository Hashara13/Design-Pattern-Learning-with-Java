/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Movie_Directory;

/**
 *
 * @author Hashara
 */
public class Factory {

    public static Movie_Directory getMovie(String movieTitle) {
        if (movieTitle == null) {
            return null;
        } else if (movieTitle.equalsIgnoreCase("English")) {
            return new English();
        } else if (movieTitle.equalsIgnoreCase("Indian")) {
            return new Indian();
        } else {
            return null;
        }
    }
}
