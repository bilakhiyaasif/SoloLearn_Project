import java.util.Random;

public interface character {
    public String weapon = "character";
    public void attack();
    public void heal();

}


public class enemy implements character {

    public enemy() {

    }

    String base = "lightsaver";
    public void attack() {
        System.out.println("enemy attack");
    }
    public void heal() {
        System.out.println("enemy heal");
    }

}

public class hero implements character {
    public hero() {

    }
    public String weapon = "";
    @Override
    public void attack() {
        System.out.println("hero attack");
    }
    @Override
    public void heal() {
        System.out.println("hero heal");
    }
}





public class Interface1 {

    public static character sumonchar() {
        Random r = new Random();
        if (Math.abs(r.nextInt()) % 2 == 0)

        {
            return new enemy();
        } else {
            return new hero();
        }
    }
    public static void main(String[] args) {
        enemy e = new enemy();
        hero h = new hero();
        e.attack();
        h.attack();
        e.heal();
        h.heal();
        character c = sumonchar();
        c.attack();
        c.heal();
        System.out.println(sumonchar());





    }

}
