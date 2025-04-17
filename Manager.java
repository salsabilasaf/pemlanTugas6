public class Manager extends Pekerja{
    private String departemen;

    Manager(String departemen, double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, hari, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public String getDepartemen(){
        return departemen;
    }

    public void setDepartemen(String dep){
        departemen = dep;
    }

    @Override
    public double getPendapatan(){
        return super.getPendapatan() + (getGaji() * 0.10);
    }

    @Override
    public String toString() {
        return super.toString() + "Departemen: " + getDepartemen();
    }
}