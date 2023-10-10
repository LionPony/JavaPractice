package ProblemsLv0;

public class AntCorp {
    public int howMany(int hp){
        Ant general = new GeneralAnt();
        Ant soldier = new SoldierAnt();
        Ant worker = new WorkerAnt();

        int generalCount = 0;
        int soldierCount = 0;
        int workerCount = 0;

        if(hp > 0) {
            generalCount = hp / general.getAttack();
            hp %= general.getAttack();
        }
        if(hp > 0) {
            soldierCount = hp / soldier.getAttack();
            hp %= soldier.getAttack();
        }
        if(hp > 0) {
            workerCount = hp / worker.getAttack();
            hp %= worker.getAttack();
        }
        return generalCount+soldierCount+workerCount;
    }
public class Ant{
    int attack;
    public Ant(int attack){
        this.attack = attack;
    }
    public int getAttack(){
        return attack;
    }
}
public class GeneralAnt extends Ant {
    public GeneralAnt(){
        super(5);
    }
}
public class SoldierAnt extends Ant{
    public SoldierAnt(){
        super(3);
    }
}
public class WorkerAnt extends Ant{
    public WorkerAnt(){
        super(1);
    }
}
}
