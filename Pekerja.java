import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    Pekerja(double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, hari);
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus(){
        long lamaKerja = ChronoUnit.YEARS.between(tahunMasuk, LocalDate.now());
        if(lamaKerja <= 5){
            return 0.05 * gaji;
        } else if (lamaKerja <= 10){
            return 0.10 * gaji;
        } else {
            return 0.15 * gaji;
        }
    }

    public double getGaji(){
        return gaji;
    }

    public double getTunjanganAnak(){
        return jumlahAnak >= 1 ? jumlahAnak * 20 : 0;
    }

    @Override
    public double getPendapatan(){
        return super.getPendapatan() + gaji + getBonus() + getTunjanganAnak();
    }
    
    @Override
    public String toString(){
        return super.toString() +
                "tahun masuk : " + tahunMasuk.getDayOfMonth() + " " +
                tahunMasuk.getMonthValue() + " " + tahunMasuk.getYear() +
                "\njumlah anak : " + jumlahAnak +
                "\ngaji : " + gaji + "\n";
    }
}