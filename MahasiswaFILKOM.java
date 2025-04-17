public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;

    MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk; 
    }

    public String getStatus(){
        String angkatan = "20" + nim.substring(0, 2);
        char programStudi = nim.charAt(6);
        String prodi = "";
        switch (programStudi) {
            case '2': prodi = "Teknik Informatika"; 
            break;
            case '3': prodi = "Teknik Komputer"; 
            break;
            case '4': prodi = "Sistem Informasi"; 
            break;
            case '6': prodi = "Pendidikan Teknologi Informasi"; 
            break;
            case '7': prodi = "Teknologi Informasi"; 
            break;
            default: prodi = "Prodi tidak diketahui";
        }
        return prodi + ", " + angkatan;
    }

    public double getBeasiswa(){
        if(ipk >= 3.0 && ipk < 3.5){
            return 50;
        } else if(ipk >= 3.5 && ipk <= 4.0){
            return 75;
        } else {
            return 0;
        }
    }

    @Override
    public double getPendapatan(){
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString(){
        return super.toString() + "NIM: " + nim + "\nIPK: " + ipk +
        "\nStatus: " + getStatus() + "\n";
    }
}