package access;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PersonAcces {
    
    private LocalDate date;
    private LocalTime time;
    private Access access;
    private Location location = new Location();
    private String name;
    
    enum Access {
        IN, OUT
    };
    
    public LocalDate getDate() {
        return date;
    }
    
    public PersonAcces setDate(LocalDate ld) {
        this.date = ld;
        return this;
    }
    
    public LocalTime getTime() {
        return time;
    }
    
    public PersonAcces setTime(LocalTime lt) {
        this.time = lt;
        return this;
    }
    
    public Access getAccess() {
        return access;
    }
    
    public PersonAcces setAccess(String x) {
        this.access = Access.valueOf(x);
        return this;
    }
    
    public String getLevel() {
        return location.getLevel();
    }
    
    public PersonAcces setLevel(String level) {
        location.setLevel(level);
        return this;
    }
    
    public String getZone() {
        return location.getZone();
    }
    
    public PersonAcces setZone(String zone) {
        location.setZone(zone);
        return this;
    }
    
    public String getName() {
        return name;
    }
    
    public PersonAcces setName(String name) {
        this.name = name;
        return this;
    }
    
    public Location getLocation() {
        return location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    
    @Override
    public String toString() {
        return "date " + date + ", time " + time.format(DateTimeFormatter.ISO_TIME) + ", access " + access + ", location " + location + ", name " + name;
    }
    
}
