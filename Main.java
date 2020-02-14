class Main {
  public static void main(String[] args) {
    //Sample.sample();
    testMyHashMap();
  }

  public static void testMyHashMap() {
   // MySimpleHashMap map = new MySimpleHashMap();
    MyHashMap map = new MyHashMap();
    map.put("Sailesh", 65);
    map.put("Test", 90);
    System.out.println(map);
    System.out.println(map.get("Sailesh"));
  }
}