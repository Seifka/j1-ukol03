package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.



        Disk mujdisk = new Disk();
        mujdisk.setKapacita(52_566_962_000L);
        mujdisk.setVyuziteMisto(10_000_000_000L);


        Pamet mojepamet = new Pamet();
        mojepamet.setKapacita(15_530_000_000L);

        Procesor mujprocesor = new Procesor();
        mujprocesor.setRychlost (2_350_000_000_000L);
        mujprocesor.setVyrobce("Intel");

        Pocitac mujpocitac = new Pocitac();
        mujpocitac.jeZapnuty();
        mujpocitac.setCpu(mujprocesor);
        mujpocitac.setRam(mojepamet);
        mujpocitac.setPevnyDisk(mujdisk);

        mujpocitac.zapniSe(); //počítač se zapíná
        mujpocitac.zapniSe(); //měla by být chybová hláška
        System.out.println(mujpocitac.toString());
        mujpocitac.vypniSe(); //počítač se vypnul

        mujpocitac.vypniSe();
        mujpocitac.vypniSe(); // opakované volání ignoruje

        mujpocitac.vytvorSouborOVelikosti(100_100_000_000L);
        mujpocitac.vymazSouboryOVelikosti(9_500_350L);




        System.out.println("Program spuštěn.");
    }

}
