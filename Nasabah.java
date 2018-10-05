
public class Nasabah {
    private int IsiSaldo;
    private String pesan;
    static int nomorUrutan=0;
    private String namaNasabah;
    
    public void dataNasabah(String nama)
        {
        namaNasabah=nama;
        System.out.println(" Nama Nasabah = " + namaNasabah);
        }
    public int tabungan(int jumlah){
        return IsiSaldo=IsiSaldo+jumlah;
    }
     public int getSaldo(){
        return IsiSaldo;
    }
     public String getPesan(){
         return pesan;
     }
    public int narikUang(int uang){
        if(IsiSaldo- uang < 50000 ){
            System.out.println(" Saldonya Nggak Cukup Cuy !");
            return IsiSaldo;
        }else{
            System.out.println(" Ente Ngambil Duit = " + uang);
            nomorUrutan++;
           return IsiSaldo-=uang;
        }
        
    }
     public int narikUang(int uang, String isi){
        if(IsiSaldo - uang < 50000 ){
            System.out.println(" Saldonya Nggak Cukup Cuy !");
            return IsiSaldo;
        }else{
            System.out.println(" Ente Ngambil Duit  = " + uang);
            nomorUrutan++;
            pesan=isi;
           return IsiSaldo-=uang;
           
        }
        
    }
   
}
