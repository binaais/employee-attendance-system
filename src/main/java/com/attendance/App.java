package main.java.com.attendance;

public class App {
    public static void main(String[] args) {
        AppService appService = new AppService();

        // Shembull: krijo një punëtor dhe regjistro hyrjen
        Employee emp = new Employee(1, "Blina Islamaj");
        appService.registerEntry(emp);
    }
}