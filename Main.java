public class Main {
    public static void main(String[] args) {
        Manusia a = new Manusia("A", "111", true, true);
        System.out.println(a);

        MahasiswaFILKOM b = new MahasiswaFILKOM("165150300111100", 4.0, "B", "111", false, false);
        System.out.println(b);

        Pekerja c = new Pekerja(1000, 2016,3, 2, 4, "C", "111", true, true);
        System.out.println(c);

        Manager d = new Manager("HRD", 1000, 2017, 1, 2, 3, "D", "111", true, true);
        System.out.println(d);

        System.out.println();
        System.out.println("================TESTCASE MANUSIA==================");
        Manusia M1 = new Manusia("Jake", "222", true, true);
        System.out.println(M1);

        Manusia F1 = new Manusia("IU", "333", false, true);
        System.out.println(F1);

        Manusia M2 = new Manusia("Junghwan", "444", true, false);
        System.out.println(M2);

        Manusia F2 = new Manusia("Rei", "555", false, false);
        System.out.println(F2);

        System.out.println("================TESTCASE MAHASISWA==================");
        MahasiswaFILKOM mf = new MahasiswaFILKOM("245150707111046", 3.5, "salsa", "666", false, false);
        System.out.println(mf);

        System.out.println("================TESTCASE PEKERJA==================");
        Pekerja p1 = new Pekerja(1500, 2023, 4, 17, 2, "yoshi", "777", true, true);
        System.out.println(p1);

        Pekerja p2 = new Pekerja(20000, 2016, 3, 10, 0, "roe", "888", false, false);
        System.out.println(p2);

        Pekerja p3 = new Pekerja(4000, 2005, 1, 23, 10, "david", "999", true, true);
        System.out.println(p3);

        System.out.println("================TESTCASE MANAGER==================");
        Manager mg1 = new Manager("Marketing", 2000, 2010, 3, 11, 1, "julie", "123", false, true);
        System.out.println(mg1);
    }
}