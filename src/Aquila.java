import interfaces.Volatile;

public class Aquila extends AbstractAnimale implements Volatile{

    public void verso(){
        System.out.println("Verso aquila");
    }

    public void mangia(){
        System.out.println("Sta mangiando cibo da aquila");
    }
    
    public void vola(){ 
        System.out.println( "Sta volando");
    }

}