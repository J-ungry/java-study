package ch7;

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        DropShip dropShip = new DropShip();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropShip);
    }
}
interface Repairable{} //1개의 인터페이스

class Unit{
    int hitPoint;
    final int MAX_HP;
    Unit(int hp){
        MAX_HP = hp;
    }
}
class GroundUnit extends Unit{
    GroundUnit(int hp){
        super(hp);
    }
}
class AirUnit extends Unit{
    AirUnit(int hp){
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable{
    Tank(){
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString(){return "Tank";}
}
class DropShip extends  AirUnit implements Repairable{
    DropShip(){
        super(125);
        hitPoint =MAX_HP;
    }
    public String toString(){return "DropShip";}
}
class SCV extends GroundUnit implements Repairable{
    SCV(){
        super(60);
        hitPoint = MAX_HP;
    }
    void repair(Repairable r){
        if (r instanceof Unit){ //만약 r이 Unit에 자손이라면
            Unit u = (Unit) r;
            while (u.hitPoint != u.MAX_HP){
                u.hitPoint++;
            }
            System.out.println(u.toString()+"수리 끝 !!");
        }
    }
}
