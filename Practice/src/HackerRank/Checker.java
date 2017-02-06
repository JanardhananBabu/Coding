package HackerRank;

import java.util.Comparator;

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
class Checker implements Comparator<Player>{
	
    public int compare(Player obj1, Player obj2){
        if(obj2.score!=obj1.score)
            return Integer.compare(obj2.score,obj1.score);
        else
            return obj1.name.compareTo(obj2.name);
    }
}