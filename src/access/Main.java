package access;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\Black\\Downloads\\stancu.txt");
        ReadFile rf = new ReadFile();
        List<PersonAcces> lst = rf.readFile(f);
        List<PersonAcces> filterLst = rf.filterList(lst, ReadFile.filter);
        for (PersonAcces p : filterLst) {
            System.out.println(p);
        }
        LocalDate ld1 = LocalDate.of(2019, 10, 21);
        LocalDate ld2 = LocalDate.of(2019, 10, 25);
        ZoneReport zr = Reports.buildZonesReport(filterLst, "STANCU,LAURENTIU", ld1, ld2);
        System.out.println(zr);

    }
}
