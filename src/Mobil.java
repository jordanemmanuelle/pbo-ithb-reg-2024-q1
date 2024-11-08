abstract public class Mobil {
    int durasiSewa; // satuan hari
    int hargaPerHari;
    int deposito; 

    public Mobil (int durasiSewa, int hargaPerHari) {
        this.durasiSewa = durasiSewa;
        this.deposito = deposito * 7; // 700% dari harga sewa per hari
    }

    public int getDurasiSewa () {
        return durasiSewa;
    }
    public void setDurasiSewa (int durasiSewa) {
        this.durasiSewa = durasiSewa;
    }

    public int getDeposito () {
        return deposito;
    }
    public void setDeposito (int deposito) {
        this.deposito = deposito;
    }
    
    public abstract double hitungBiayaSewa ();

    public double hitungDepo () {
        return deposito;
    }

    public abstract String getTipe ();
}