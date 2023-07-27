/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitri.model;

/**
 *
 * @author USER
 */
public class anggota {
    private String kodeanggota;
    private String namaangota;
    private String alamat;
    private String jeniskelamin;

    public anggota(String kodeanggota, String namaangota, String alamat, String jeniskelamin) {
        this.kodeanggota = kodeanggota;
        this.namaangota = namaangota;
        this.alamat = alamat;
        this.jeniskelamin = jeniskelamin;
    }

    public String getKodeanggota() {
        return kodeanggota;
    }

    public void setKodeanggota(String kodeanggota) {
        this.kodeanggota = kodeanggota;
    }

    public String getNamaangota() {
        return namaangota;
    }

    public void setNamaangota(String namaangota) {
        this.namaangota = namaangota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }
}
