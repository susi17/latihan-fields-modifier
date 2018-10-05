
public class Bank {
    public static void main(String[] args) {
        final String namaBank=" Bank A";
        System.out.println(" Nama Bank = " + namaBank);
        System.out.println();
        Nasabah nasabah1 = new Nasabah();
        nasabah1.dataNasabah("Raja Ade Susian");
        System.out.println("Tabungan Ente : " + nasabah1.tabungan(700000));
        nasabah1.narikUang(200000);
        nasabah1.narikUang(100000," Duit Buat Bayar Hutang");

        System.out.println("Sisa Saldo Ente : " + nasabah1.getSaldo());
        System.out.println("Sisa Saldo Ente : " + nasabah1.getSaldo() + "  " + nasabah1.getPesan());

        System.out.println();
        Nasabah nasabah2 = new Nasabah();
        nasabah2.dataNasabah("Fajar");
        System.out.println("Tabungan Ente : " + nasabah2.tabungan(10000000));
        nasabah2.narikUang(300000);
        nasabah2.narikUang(30000);

        System.out.println("Sisa Saldo Ente : " + nasabah2.getSaldo());

        System.out.println();
        Nasabah nasabah3 = new Nasabah();
        nasabah3.dataNasabah("Jafar");
        System.out.println("Tabungan Ente : " + nasabah3.tabungan(500000));
        nasabah3.narikUang(400000);
        nasabah3.narikUang(200000);

        System.out.println("Sisa Saldo Ente : " + nasabah3.getSaldo());
        
        System.out.println("\n Jumlah Transaksi Di Bank A : " + nasabah1.nomorUrutan+" Kali");
        
    }
    
}
