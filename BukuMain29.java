class Buku {
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Halaman: " + halaman);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);
        System.out.println();
    }

    void terjual(int jm1) {
        stok -= jm1;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
}

public class BukuMain29 {
    public static void main(String[] args) {
        Buku bk1 = new Buku();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();

        bk1.terjual(5);
        bk1.gantiHarga(60000);

        bk1.tampilInformasi();

        Buku29 bk2 = new Buku29("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

    }
}
