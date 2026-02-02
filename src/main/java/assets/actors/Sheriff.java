
package assets.actors;

import java.awt.Image;


public class Sheriff extends Enemy{

    //Definition der (besonderen) Eigenschaften des Sheriffs
    int deaths = 0;
    int trouble = 0;
    int healthpoints;
    int damage;
    int movespeed;

    //Klasse des Sheriffs
    public Sheriff(int x, int y, Image img, String name, boolean inside) {
        super(x, y, img, name);
        
        movespeed = 2;
        //wenn der Sheriff jemanden trifft dann ist er aus dem Spiel
        damage = 10000;
        //der Sheriff läuft auf den Straßen mit seinem Pferd, das ihn schneller macht
        while(inside == false){
            this.Image = imghorse;
            movespeed = 5;
        }
        
    }
    //Alternative, bisher unbenutzte Klasse des Sherrifs
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
    
    //der Sheriff soll zu bestimmten Momenten einfach in der Nähe des Spielers auftauchen
    void teleport(int[] arr){
        setX(arr[0]);
        setY(arr[1]);
    }
    
    //wenn zu oft gegen "das Gesetz" verstoßen wird, erscheint der Sheriff beim Spieler
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

    //wenn der Spieler den Sheriff tötet, verdoppelt sich seine Anzahl
    if(healthpoints == 0){
        deaths = deaths++;
        for(i = 0 , i < math.pow(2,deaths) , i++){
            generate(Sheriff);}
    }
    
}
