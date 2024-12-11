/**
 * Player class with name, position, and points instance variables
 */
public class Player {

  private String name;
  private String position; 
  private int points;

  /** Constructor */
  public Player(String name, String position, int points) {
    this.name = name;
    this.position = position;
    this.points = points;
  }

  /*Accessor Method
   *Player name 
   */
  public String getName() {
    return name;
  }
  
   /*Accessor Method
    *Position on the court 
    */
  public String getPosition() {
    return position;
  }
  
  /*Accessor Method
    *Returns the points of the player. 
    */
  public int getPoints() {
    return points;
  }
  
  /** toString Method override */
  public String toString() {
    return name + "\n" + position + "\n" + "Points: " + points;
  }
  
}