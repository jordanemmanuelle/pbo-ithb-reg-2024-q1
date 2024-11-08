public class Lempergember extends Mobil {
    private boolean supirBiasa;
    private boolean supirPro;
    private boolean pengiriman;

    public Lempergember (int durasiSewa, boolean supirBiasa, boolean supirPro, boolean pengiriman) {
        super(durasiSewa, 5000);
        this.supirBiasa = supirBiasa;
        this.supirPro = supirPro;
        this.pengiriman = pengiriman;
    }

    public boolean getSupirBiasa () {
        return supirBiasa;
    }
    public void setSupirBiasa (boolean supirBiasa) {
        this.supirBiasa = supirBiasa;
    }

    public boolean getSupirPro () {
        return supirPro;
    }
    public void setSupirPro (boolean supriPro) {
        this.supirPro = supriPro;
    }

    public boolean getPengiriman () {
        return pengiriman;
    }
    public void setPengiriman (boolean pengiriman) {
        this.pengiriman = pengiriman;
    }

    @Override
    public double hitungBiayaSewa () {
        double total = durasiSewa * 5000;
        if (supirBiasa) {
            total += total * (5000 * 0.07);
        }
        if (supirPro) {
            total += total * (5000 * 0.1);
        }
        if (durasiSewa > 5 && pengiriman) {
            total = 300;
        }
        return total;
    }

    public String getTipe () {
        return "Lempergember";
    }
}
