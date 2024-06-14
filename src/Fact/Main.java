/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fact;

/**
 *
 * @author Hashara
 */

interface Movie {

  void show_title();
}

class HorrorMovies implements Movie {

  @Override
  public void show_title() {
    System.out.println("Name: Get Out (2017)");  
  }
}

class AdventureMovies implements Movie {

  @Override
  public void show_title() {
    System.out.println("Name: Into the Wild (2017)");  
  }
}

class Factory {

  public static Movie getMovie(String movieType) {
    if (movieType == null) {
      return null;
    } else if (movieType.equalsIgnoreCase("Horror")) {
      return new HorrorMovies();
    } else if (movieType.equalsIgnoreCase("Adventure")) {
      return new AdventureMovies();
    } else {
      return null;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Movie movie01 = Factory.getMovie("Horror");
    movie01.show_title();

    Movie movie02 = Factory.getMovie("Adventure");
    movie02.show_title();
  }
}
