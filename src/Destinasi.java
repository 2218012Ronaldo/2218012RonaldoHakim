/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 62821
 */
// Kelas abstract Destinasi
public abstract class Destinasi {
    private String namaDestinasi;
    private String lokasi;

    public Destinasi(String namaDestinasi, String lokasi) throws IllegalArgumentException {
        if (namaDestinasi == null || lokasi == null || namaDestinasi.isEmpty() || lokasi.isEmpty()) {
            throw new IllegalArgumentException("Nama destinasi dan lokasi tidak boleh kosong");
        }

        this.namaDestinasi = namaDestinasi;
        this.lokasi = lokasi;
    }

    public String getNamaDestinasi() {
        return namaDestinasi;
    }

    public void setNamaDestinasi(String namaDestinasi) {
        this.namaDestinasi = namaDestinasi;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public abstract void aturInputNamaDanLokasi();

    public void informasiDestinasi() {
        System.out.println("Destinasi " + namaDestinasi + " berlokasi di " + lokasi);
    }
}

