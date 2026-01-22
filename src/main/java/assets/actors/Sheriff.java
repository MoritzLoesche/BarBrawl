
package assets.actors;

import java.awt.Image;


public class Sheriff extends Enemy{

    int deaths;
    int trouble;
    
    int moves;
    
    public Sheriff(int x, int y, Image img, String name) {
        super(x, y, img, name);
        moves = 3;
    }
    
    public Sheriff(int x, int y, Image img, String name, int damage, int attack, int moves) {
        super(x, y, img, name, damage, attack);
        this.moves = moves;
    }
    
    public int getAttack() {
        if (moves == 0) {
            return attack*2;
        }
        return attack;
    }

    void teleport(int[] arr){
        setX(arr[0]);
        setY(arr[1]);
    }

    if(health == 0){
        deaths = deaths++;
        for(i = 0 , i < math.pow(2,deaths) , i++){
            generate(sherrif);
        }
}

    if(NPC getsDamage){
        trouble = trouble + 1;
    }
    if(NPC alive == false){
        trouble = trouble + 20;
    }
    if(trouble >= 40){
        teleport(entrance);
        trouble = 0;
    }
    
}
