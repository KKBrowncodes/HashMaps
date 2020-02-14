class MapEntry {
  public String name;
  public int grade;
  
  public MapEntry(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }

  public void setGrade(int newGrade) {
    this.grade = newGrade;
  }
  public int hashCode(String name) {
   return name.length() % 5;
  }
}