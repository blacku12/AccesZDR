package access;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import static access.PersonAcces.Access.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class Reports {

    public static ZoneReport buildZonesReport(List<PersonAcces> lst, String name,
            LocalDate startDate, LocalDate endDate) {
        List<PersonAcces> filteredList = lst.stream()
                .filter(k -> k.getDate().isAfter(startDate.minusDays(1)) && k.getDate().isBefore(endDate.plusDays(1)))
                .collect(Collectors.toList());
        return buildDailyZonesReport(filteredList, name);
    }

    public static ZoneReport buildDailyZonesReport(List<PersonAcces> lst, String name) {
        List<PersonAcces> errors = new ArrayList<>();
        List<PersonAcces> filteredList = lst.stream().filter(k -> k.getName().equals(name)).collect(Collectors.toList());
        Map<Location, Duration> dict = new LinkedHashMap<>();
        for (int i = 0; i < filteredList.size(); i++) {
            PersonAcces l1 = filteredList.get(i);
            if (i == filteredList.size() - 1) {
                errors.add(l1);
                break;
            }
            PersonAcces l2 = filteredList.get(i + 1);
            if (l1.getAccess().equals(IN) && l2.getAccess().equals(OUT) && l1.getLocation().equals(l2.getLocation())) {
                Duration d = dif(l1.getTime(), l2.getTime());
                i++;
                if (dict.containsKey(l1.getLocation())) {
                    Duration newValue = dict.get(l1.getLocation()).plus(d);
                    dict.put(l1.getLocation(), newValue);
                } else {
                    dict.put(l1.getLocation(), d);
                }
            } else {
                errors.add(l1);
            }
        }
        return new ZoneReport(dict, errors, filteredList);
    }

    private static Duration dif(LocalTime lt1, LocalTime lt2) {
        return Duration.between(lt1, lt2);
    }

}
