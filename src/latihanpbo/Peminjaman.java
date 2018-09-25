/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

/**
 *
 * @author Farrel
 */
public class Peminjaman {
    private Siswa siswa;
    int maxPinjam = 10;
    private Buku[] list_buku = new Buku[maxPinjam];
    private int jumlah_buku;
    
    public Peminjaman(){
        jumlah_buku=0;
    }
    
    public Peminjaman(Siswa siswa, Buku book){
        jumlah_buku = 0;
        this.siswa=siswa;
        list_buku[jumlah_buku]=book;
        jumlah_buku++;
    }
    
    public void setSiswa(Siswa siswa){
        this.siswa= siswa;
    }
    
    public void addBuku(Buku book){
        list_buku[jumlah_buku]=book;
        jumlah_buku++;
    }
    
    public void tampilIdentitasPeminjam(){
        System.out.println("Nama Peminjaman : "+ siswa.getNama());
        System.out.println("kelas : "+ siswa.getKelas());
        System.out.println("Alamat peminjaman : "+ siswa.getAlamat());
    }
    
    public void tampilBuku(){
        System.out.println("----------------------------------------");
        System.out.println("List buku");
        System.out.println("----------------------------------------");
        for(int i=0;i<jumlah_buku;i++){
            System.out.println((i+1)+". "+ list_buku[i].getJudul_buku()
            +"[Category : "+list_buku[i].getKategori()+ "]");           
        }
    }
    
    public double getBiaya(){
        double nominal;
        if(siswa instanceof Anggota){
            nominal = 500;
        }else{
            nominal=1000;
        }
        
        double biaya = nominal * jumlah_buku;
        return biaya;
    }
}
