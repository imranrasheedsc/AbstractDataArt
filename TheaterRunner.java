import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Initalize Scene Object
    DataScene scene = new DataScene();
    
    // Call any DataScene methods to diplay
    scene.drawScene();
    
    // Play the DataScene in the theater
    Theater.playScenes(scene);

    
  }
}