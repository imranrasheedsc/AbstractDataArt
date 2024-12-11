import org.code.theater.*;
import org.code.media.*;

/**
 * The DataScene class used to hold the methods
 * for the NBA All-Time Scoring List
 */
public class DataScene extends Scene {

  private Player[] people;      // 1D array of Player objects

  /** Non parameterized constructor */
  public DataScene() {
    people = createPeople();
  }

  /* Returns a 1D array of Player objects 
   * using the names, points, and position text files */
  public Player[] createPeople() {
    String[] namesArray = FileReader.toStringArray("names.txt");
    String[] positionArray = FileReader.toStringArray("positions.txt");
    int[] pointsArray = FileReader.toIntArray("points.txt");
    
    Player[] players = new Player[namesArray.length];
    for (int i = 0; i < players.length; i++) {
      players[i] = new Player(namesArray[i], positionArray[i], pointsArray[i]);
    }

    return players;
  }


  /* drawScene method that loops through the Player class objects
   * Uses the accesor methods of the player class objects to return 
   * necessary information
   */
  public void drawScene() {
    for (Player p : people) {
      drawText("NBA All-time Scoring List",95,20);
      System.out.println(p.getName());
      displayImage(p.getPosition());
      displayInformation(p.getName(), p.getPosition(), p.getPoints());
      int randomNumber = (int)(Math.random() * 10) + 20;
      setTextHeight(randomNumber);
      playSound("Ding.wav");
      pause(0.5);
      clear("white");
    }
  }
  
  /* Displays the text based on the information from the Player.java class
   * Positions them under each other
   */
  public void displayInformation(String name, String position, int points) {
    drawText(name, 100, 300);
    drawText(position, 100, 400);
    drawText("Points: "+points, 100, 350);
  }
  /*Displays the image information and
   *loads an image based on the position argument
   */
  public void displayImage(String position) {
    drawImage(position+".jpg", 100,50,200);
  }
}