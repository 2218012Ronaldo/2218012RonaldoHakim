/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author 62821
 */
// Kelas turunan DestinasiWisata
public class DestinasiWisata extends Destinasi {
    private String jenisWisata;

    // Konstruktor dengan parameter untuk DestinasiWisata
public DestinasiWisata(String namaDestinasi, String lokasi, String jenisWisata) {
    super(namaDestinasi, lokasi);
    this.jenisWisata = jenisWisata;
}


    // Getter dan setter untuk enkapsulasi
    public String getJenisWisata() {
        return jenisWisata;
    }

    public void setJenisWisata(String jenisWisata) {
        this.jenisWisata = jenisWisata;
    }

    // Implementasi metode abstract untuk mengatur input nama destinasi dan lokasi
    @Override
    public void aturInputNamaDanLokasi() {
        // Implementasi sesuai kebutuhan, misalnya menggunakan input dialog
        setNamaDestinasi(JOptionPane.showInputDialog("Masukkan Nama Destinasi Wisata: "));
        setLokasi(JOptionPane.showInputDialog("Masukkan Lokasi Destinasi Wisata: "));
    }
    
    // Metode yang spesifik untuk DestinasiWisata
    public void metodeDestinasiWisata() {
        // Implementasi metode khusus DestinasiWisata
        System.out.println("Metode khusus untuk DestinasiWisata");
    }
}

