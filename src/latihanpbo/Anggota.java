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
public class Anggota extends Siswa {
    private String no_anggota;
    
    public String getNo_anggota(){
        return no_anggota;
    }
    public Anggota(String no_anggota, String nama, String alamat, String kelas){
        super(nama, alamat, kelas);
        this.no_anggota=no_anggota;
    }
}
