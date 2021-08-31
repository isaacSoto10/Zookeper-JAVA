package ZooKeeper;

public class GorillaTest {
    public static void main(String args[]){
        gorilla g = new gorilla();
        
        g.throwSomething("Rock");
        g.throwSomething("banana");
        g.throwSomething("human");
        g.eatBananas();
        g.eatBananas();
        g.climb();
        g.displayEnergy();
        
        bat b = new bat();
        
        b.fly();
        b.fly();
        b.eatHumans();
        b.eatHumans();
        b.attackTown();
        b.eatHumans();
        b.eatHumans();
        b.eatHumans();
        b.displayEnergy();
        
    }
}