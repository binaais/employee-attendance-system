package main.java.com.attendance;

import java.time.LocalDateTime;

public class Attendance {
    private Employee employee;
    private LocalDateTime time;
    private String type; // "IN" ose "OUT"

    public Attendance(Employee employee, String type) {
        this.employee = employee;
        this.time = LocalDateTime.now();
        this.type = type;
    }

    public String toString() {
        return employee.getName() + " - " + type + " @ " + time.toString();
    }
}