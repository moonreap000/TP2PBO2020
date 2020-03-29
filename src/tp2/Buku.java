/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author Dhimas
 */
class Buku {
    //set dan get untuk class Buku untuk database
    //set data
    private int kode_buku;
    private String nama_buku, nama_peminjam, tanggal_pinjam, tanggal_pengembalian;
    public Buku(int kode_buku, String nama_buku, String nama_peminjam, String tanggal_pinjam, String tanggal_pengembalian){
        this.kode_buku=kode_buku;
        this.nama_buku=nama_buku;
        this.nama_peminjam=nama_peminjam;
        this.tanggal_pinjam=tanggal_pinjam;
        this.tanggal_pengembalian=tanggal_pengembalian;
    }
    //get data
    public int getkode_buku(){
        return kode_buku;
    }
    public String getnama_buku(){
        return nama_buku;
    }
    public String getnama_peminjam(){
        return nama_peminjam;
    }
    public String gettanggal_pinjam(){
        return tanggal_pinjam;
    }
    public String gettanggal_pengembalian(){
        return tanggal_pengembalian;
    }
    
}
