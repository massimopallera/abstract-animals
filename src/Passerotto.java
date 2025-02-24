import interfaces.Volatile;

public class Passerotto extends AbstractAnimale implements Volatile{
    
    public void verso(){
        System.out.println("Tipico verso da passerotto");
    }

    public void mangia(){
        System.out.println("Sta mangiando cibo da passerotto");
    }

    public void vola(){
        System.out.println("Sta volando");
    }
}
