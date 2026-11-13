public class BankPolimorfik {

    public static void main(String[] args) {

        Tabungan ani = new Tabungan("101", "Ani", 1000000, 2.5);
        Tabungan citra = new Tabungan("102", "Citra", 300000, 2.0);
        Giro budi = new Giro("201", "Budi", 200000, 500000);

        Rekening[] semua = {ani, citra, budi};

        BerBunga[] berbunga = {ani, citra};

        System.out.println("========== REKENING AWAL ==========");

        for (Rekening r : semua) {
            r.cetakInfo();
        }

        System.out.println("\n========== AKHIR BULAN ==========");

        for (Rekening r : semua) {
            int biaya = r.potongBiayaAdmin();
            System.out.println(
                    r.getNomor() + " biaya admin : " + Rekening.formatRupiah(biaya)
            );
        }

        for (BerBunga b : berbunga) {
            int bunga = b.tambahBunga();
            System.out.println(
                    b.getNomor() + " bunga : " + Rekening.formatRupiah(bunga)
            );
        }

        System.out.println("\n========== REKENING AKHIR ==========");
        int totalDanaBank = 0;
        for (Rekening r : semua) {
            r.cetakInfo();
            totalDanaBank += r.getSaldo();
        }

        System.out.println("--------------------");
        System.out.println(
                "Total dana bank : " + Rekening.formatRupiah(totalDanaBank)
        );
    }
}
