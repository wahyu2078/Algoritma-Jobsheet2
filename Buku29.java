public class Buku29 {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku29(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    public void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    public int hitungHargaTotal(int jumlahTerjual) {
        return harga * jumlahTerjual;
    }

    public double hitungDiskon(int hargaTotal) {
        double diskon = 0.0;

        if (hargaTotal > 150000) {
            diskon = 0.12; 
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = 0.05; 
        }

        return diskon;
    }

    public double hitungHargaBayar(int jumlahTerjual) {
        int hargaTotal = hitungHargaTotal(jumlahTerjual);
        double diskon = hitungDiskon(hargaTotal);
        
        return hargaTotal - (hargaTotal * diskon);
    }

    void terjual(int jm1) {
        stok -= jm1;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

}
