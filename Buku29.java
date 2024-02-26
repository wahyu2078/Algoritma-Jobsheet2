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

    public void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            if (stok < 0) {
            }
        } else {
            System.out.println("Stok sudah habis!");
        }
    }

    public void restock(int jml) {
        stok += jml;
    }

    public void gantiHarga(int hrg) {
        harga = hrg;
    }
}
