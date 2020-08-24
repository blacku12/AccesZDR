package access;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFile {

    private List<PersonAcces> accesList = new ArrayList<>();
    public static final List<Location> filter = Arrays.asList(new Location("ET5", "RECEPTIE"), new Location("ET4", "RECEPTIE"));

//TODO: IOException daca nu poate citi fisierul de input
    public List<PersonAcces> readFile(File f) throws FileNotFoundException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            String line = reader.readLine();
            while (line != null) {
                accesList.add(parseLine(line));
                line = reader.readLine();
            }
        }
        return accesList;
    }

    private PersonAcces parseLine(String line) {
        String date = line.substring(0, 10);
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate ld = LocalDate.parse(date, tf);
        String time = line.substring(12, 20);
        DateTimeFormatter tf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime lt = LocalTime.parse(time, tf2);
        String zonaLevelType = line.substring(23, 56).trim();
        String[] location = parseLocaton(zonaLevelType);
        String name = line.substring(56, 90).trim();
        PersonAcces ap = new PersonAcces();
        ap.setDate(ld);
        ap.setTime(lt);
        ap.setName(name);
        ap.setZone(location[0]);
        ap.setLevel(location[1]);
        ap.setAccess(location[2]);
        return ap;
    }

    private String[] parseLocaton(String s) {
        String[] location = s.split(" ");
        String[] location1 = new String[3];
        if (location[0].equals("ZID")) {
            location1 = location;
        } else if (location[0].equals("RECEPTIE")) {

            if (location[location.length - 1].equals("B")) {
                location1[0] = location[0];
                location1[1] = location[1] + location[2];
                location1[2] = "OUT";
            } else {
                location1[0] = location[0];
                location1[1] = location[1] + location[2];
                location1[2] = "IN";
            }
        } else {
            location1[0] = "ZONE";
            location1[1] = "LEVEL";
            location1[2] = "IN/OUT";
        }
        return location1;
    }

    public List<PersonAcces> filterList(List<PersonAcces> x, List<Location> filter) {
        return x.stream().filter(k -> !filter.contains(k.getLocation())).collect(Collectors.toList());
    }

}
