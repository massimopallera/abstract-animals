import interfaces.Nuotante;

public class Delfino extends Animale implements Nuotante{
    
    public void verso(){
        System.out.println("Verso delfino");
    }

    public void mangia(){
        System.out.println("Sta mangiando cibo tipico dei delfini");
    }

    public void nuota(){
        System.out.println("Sta nuotando");
    }

}
