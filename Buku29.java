public class Buku29 {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku29(String judul, String pengarang, int halaman, int stok, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
    }

    public void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    public void terjual(int jml) {
        stok -= jml;
    }

    public void restock(int jml) {
        stok += jml;
    }

    public void gantiHarga(int hrg) {
        harga = hrg;
    }
}
