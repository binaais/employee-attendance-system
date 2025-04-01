package main.java.com.attendance;
import java.util.ArrayList;
import java.util.List;

public class AppRepository {
    private List<Attendance> records = new ArrayList<>();

    public void save(Attendance record) {
        records.add(record);
    }

    public List<Attendance> getAll() {
        return records;
    }
}