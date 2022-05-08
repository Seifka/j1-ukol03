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
        return "Pocitac{" +
                "jeZapnuty=" + jeZapnuty +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnyDisk=" + pevnyDisk +
                '}';
    }

    public Boolean jeZapntuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty) {
            System.err.println("Počítač je již zapnutý");
        } else {
            System.out.println("Počítač je vypnutý, ale zapíná se.");
        }
        if (cpu == null || ram == null || pevnyDisk == null) {
            System.err.println("Počítač nelze zapnout, chybí CPU, RAM a pevný disk.");
        } else {
            jeZapnuty = true;
            System.out.println("Počítač je zapnutý.");

        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
        } else {
            System.out.println("Počítač se vypnul");
        }


    }

}

