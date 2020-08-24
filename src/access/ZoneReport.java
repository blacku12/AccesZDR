package access;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class ZoneReport {

    Map<Location, Duration> report;
    List<PersonAcces> errors;
    List<PersonAcces> filteredList;

    public ZoneReport(Map<Location, Duration> report, List<PersonAcces> errors, List<PersonAcces> filteredList) {
        this.report = report;
        this.errors = errors;
        this.filteredList = filteredList;
    }

    public Map<Location, Duration> getReport() {
        return report;
    }

    public List<PersonAcces> getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        return "report: " + report + ", errors " + errors;
    }



    
}
