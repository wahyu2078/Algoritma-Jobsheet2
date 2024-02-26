public class BukuMain29 {
    public static void main(String[] args) {
        Buku29 bk1 = new Buku29("Today Ends Tomorrow Comes", "Denanda Pratiwi", 198, 13, 71000);

        bk1.tampilInformasi();

        bk1.terjual(5);
        bk1.gantiHarga(60000);

        bk1.tampilInformasi();

        Buku29 bk2 = new Buku29("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku29 bukuWahyu = new Buku29("Judul Buku Wahyu", "Pengarang Wahyu", 200, 50, 75000);
        bukuWahyu.tampilInformasi();
        int jumlahTerjual = 8;
        int hargaTotal = bukuWahyu.hitungHargaTotal(jumlahTerjual);
        double diskon = bukuWahyu.hitungDiskon(hargaTotal);
        double hargaBayar = bukuWahyu.hitungHargaBayar(jumlahTerjual);
    }
}
