public class Toyomba extends Mobil {
    private boolean banSerep;
    private boolean supir;

    public Toyomba (int durasiSewa, boolean banSerep, boolean supir) {
        super(durasiSewa, 4500);
        this.banSerep = banSerep;
        this.supir = supir;
    }

    public boolean getBanSerep () {
        return banSerep;
    }
    public void setBanSerep (boolean banSerep) {
        this.banSerep = banSerep;
    }

    public boolean getSupir () {
        return supir;
    }
    public void setSupir (boolean supir) {
        this.supir = supir;
    }

    @Override
    public double hitungBiayaSewa () {
        double total = durasiSewa * 4500;
        if (banSerep) {
            total += total * (4500 * 0.03);
        }
        if (supir) {
            total += total * (4500 * 0.08); 
        }
        if (durasiSewa > 5) {
            total -= total * (4500 * 0.07); 
        }
        return total;
    }
    public String getTipe () {
        return "Toyomba";
    }
}
