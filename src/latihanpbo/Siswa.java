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
public class Siswa {
private String nama, alamat, kelas;

public Siswa(String nama, String alamat, String kelas){
    this.nama=nama;
    this.alamat=alamat;
    this.kelas=kelas;
}

public String getNama(){
    return nama;
}

public String getAlamat(){
    return alamat;
}

public String getKelas(){
    return kelas;
}
}
