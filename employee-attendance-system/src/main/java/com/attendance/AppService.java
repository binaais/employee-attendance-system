package main.java.com.attendance;


public class AppService {
    private AppRepository repo = new AppRepository();

    public void registerEntry(Employee emp) {
        Attendance entry = new Attendance(emp, "IN");
        repo.save(entry);
        System.out.println("Regjistruar: " + entry);
    }

    public void registerExit(Employee emp) {
        Attendance exit = new Attendance(emp, "OUT");
        repo.save(exit);
        System.out.println("Regjistruar: " + exit);
    }
}