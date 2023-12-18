/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author 62821
 */
public class DestinasiBisnis extends Destinasi implements Inputtable{
    private String jenisBisnis;

    // Konstruktor dengan parameter
    public DestinasiBisnis(String namaDestinasi, String lokasi, String jenisBisnis) {
        super(namaDestinasi, lokasi);
        this.jenisBisnis = jenisBisnis;
    }

    // Getter dan setter untuk enkapsulasi
    public String getJenisDestinasi() {
        return jenisBisnis;
    }

    public void setJenisDestinasi(String jenisBisnis) {
        this.jenisBisnis = jenisBisnis;
    }

    // Implementasi metode abstract untuk mengatur input nama destinasi dan lokasi
    @Override
    public void aturInputNamaDanLokasi() {
        // Implementasi sesuai kebutuhan, misalnya menggunakan input dialog
        setNamaDestinasi(JOptionPane.showInputDialog("Masukkan Nama Destinasi Bisnis: "));
        setLokasi(JOptionPane.showInputDialog("Masukkan Lokasi Destinasi Bisnis: "));
        setJenisDestinasi(JOptionPane.showInputDialog("Masukkan Jenis Destinasi Bisnis: "));
    }

    // Metode yang spesifik untuk DestinasiBisnis
    public void metodeDestinasiBisnis() {
        // Implementasi metode khusus untuk DestinasiBisnis
        System.out.println("Metode khusus untuk DestinasiBisnis");
    }
}

