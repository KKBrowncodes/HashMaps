import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Sample {
  public static void sample() {
    // Create the map
    Map<String, List<String>> lateStudents = new HashMap<>();

    // Create the entry for Olga
    List<String> olgaLateDays = new ArrayList<>();
    olgaLateDays.add("2019-01-02");
    olgaLateDays.add("2019-01-04");
    olgaLateDays.add("2019-01-09");
    lateStudents.put("Olga", olgaLateDays);

    // Create the entry for Sailesh
    lateStudents.put("Sailesh", new ArrayList<String>());

    // Create the entry for Raj
    List<String> rajLateDays = new ArrayList<>();
    rajLateDays.add("2019-02-23");
    lateStudents.put("Raj", rajLateDays);

    // add a new late day for Raj
    rajLateDays.add("2020-01-01");

    // print the map
    System.out.println(lateStudents);

    // update Raj's entry to be blank, and print the new map
    lateStudents.put("Raj", new ArrayList<String>());
    System.out.println(lateStudents);

    // remove Raj's entry
    lateStudents.remove("Raj");
    System.out.println(lateStudents);

    // print Olgas's late days
    System.out.println(lateStudents.get("Olga"));
  }
}