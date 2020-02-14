import java.util.*;

public class MyHashMap {
  private ArrayList<LinkedList<MapEntry>> entries;

  public MyHashMap() {
    entries = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      LinkedList<MapEntry> emptyList = new LinkedList<>();
      entries.add(emptyList);
    }
  }

  public void put(String name, int grade) {
    MapEntry entry = new MapEntry(name, grade);
    int index = entry.hashCode();
    entries.get(index).add(entry);
  }

  // Return null if you don't find anything
  public Integer get(String name) {
   int index =name.length() % 5;
   return index;

  }

  public String toString() {
    String s = "";
    for (int i = 0; i < entries.size(); i++) {
      LinkedList<MapEntry> entryList = entries.get(i);
      s += "Index: " + i + "- ";
      for (MapEntry entry : entryList) {
        s += entry.name + ": " + entry.grade + " ";
      }
      s += "\n";
    }

    return s;
  }
  
}