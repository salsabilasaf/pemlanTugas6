public class Manusia{
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public double getTunjangan(){
        if(menikah){
            return jenisKelamin ? 25: 20;
        } else {
            return 15;
        }
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String toString(){
        String jk = jenisKelamin? "Laki-laki" : "Perempuan";
        return "Nama : " + nama + "\nNIK : " + nik + 
        "\njenis kelamin : " + jk + "\nPendapatan : " + getPendapatan() + "\n";
    }
}