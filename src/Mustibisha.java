public class Mustibisha extends Mobil {
    private boolean banSerep; // if yes tambah 5% dari harga sewa /hari

    public Mustibisha (int durasiSewa, boolean banSerep) {
        super(durasiSewa, 3000);
        this.banSerep = banSerep;
    }

    public boolean getBanSerep () {
        return banSerep;
    }
    public void setBanSerep (boolean banSerep) {
        this.banSerep = banSerep;
    }

    @Override
    public double hitungBiayaSewa () {
        double total = durasiSewa * 3000;
        if (banSerep) {
            total += total * (3000 * 0.05);
        }
        return total;
    }

    public String getTipe () {
        return "Mustibisha";
    }
}