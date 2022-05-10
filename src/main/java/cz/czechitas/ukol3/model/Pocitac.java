package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    @Override
    public String toString() {
        return "Pocitac{" + "jeZapnuty=" + jeZapnuty + ", cpu=" + cpu + ", ram=" + ram + ", pevnyDisk=" + pevnyDisk + '}';
    }

    public Boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty) {
            System.err.println("Počítač je již zapnutý");
        } else {
            System.out.println("Počítač je vypnutý, ale zapíná se.");
            if (cpu == null || ram == null || pevnyDisk == null) {
                System.err.println("Počítač nelze zapnout, chybí CPU, RAM a pevný disk.");
            } else {
                jeZapnuty = true;
                System.out.println("Počítač se zapnul.");
            }
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("Počítač se vypnul");
        }
    }


    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            if (pevnyDisk.getKapacita() < (pevnyDisk.getVyuziteMisto() + velikost)) {
                System.err.println("Soubor je moc velký, nelze ho uložit na disk");
            } else {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
                System.out.println("Na disk byl přidán nový soubor, využitá kapacita disku je" + pevnyDisk.getVyuziteMisto());
            }
        } else {
            System.err.println("Soubor nelze vytvořit, počtač je vypnutý");

        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty) {
            if (pevnyDisk.getVyuziteMisto() - velikost <= 0) {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);
                System.out.println("Na disku byl smazán soubor, využitá kapacita disku je" + pevnyDisk.getVyuziteMisto());
            }
        } else {
            System.err.println("Soubor nelze smazat, počítač je vypnutý");
        }
    }
}