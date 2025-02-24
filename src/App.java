import interfaces.Nuotante;
import interfaces.Volatile;

public class App {
    
    public static void faiVolare(Volatile animale){
        System.out.println("Sta volando");
    }
    public static void faiNuotare(Nuotante animale){
        System.out.println("Sta nuotando");
    }

    public static void main(String[] args) {


        Cane cane = new Cane();
        cane.verso();
        cane.mangia();
        System.out.println();

        Aquila aquila = new Aquila();
        aquila.verso();
        aquila.mangia();
        System.out.println();

        Delfino delfino = new Delfino();
        delfino.verso();
        delfino.mangia();
        System.out.println();

        Passerotto passerotto = new Passerotto();
        passerotto.verso();
        passerotto.mangia();
        System.out.println();

        passerotto.dormi();
        delfino.dormi();
        cane.dormi();
        aquila.dormi();


        faiNuotare(delfino);
        faiVolare(aquila);
    }
}
