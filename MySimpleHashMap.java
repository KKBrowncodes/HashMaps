import java.util.*;

// Just an example - don't change me!
public class MySimpleHashMap {
  private ArrayList<MapEntry> entries;

  public MySimpleHashMap() {
    entries = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      entries.add(null);
    }
  }

  public void put(String name, int grade) {
    MapEntry entry = new MapEntry(name, grade);
    int index = entry.hashCode();
    entries.set(index, entry);
  }

  public String toString() {
    String s = "";
    for (MapEntry entry : entries) {
      if (entry != null) {
        s += entry.name + ": " + entry.grade;
      }
    }
    return s;
  }
}