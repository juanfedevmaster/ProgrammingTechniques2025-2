import java.util.ArrayList;

import models.Defense;
import models.GoalKeeper;
import models.Player;

public class App {
    public static void main(String[] args) throws Exception {
        GoalKeeper goalKeeper = new GoalKeeper("David Ospina",1,"Diestro");
        
        goalKeeper.playWithHands();

        System.out.println(goalKeeper.getAbleLeg());
        
        
        Player defense = new Defense();

        ArrayList<Player> players = new ArrayList<>();
        players.add(defense);
        players.add(goalKeeper); 

        /*for (Player player : players) {
            player.entrenamiento();
            player.posicionDeJuego();
        }*/
    }
}
