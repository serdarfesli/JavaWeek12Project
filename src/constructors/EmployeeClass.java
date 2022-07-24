package constructors;

public class EmployeeClass {
   public String name;
   public String jobTitle;
   public int ID;
   public double salary;

   public EmployeeClass() {
   }
   public EmployeeClass(String name) {
      this.name = name;
   }
   public EmployeeClass(String name, String jobTitle) {
      this.name = name;
      this.jobTitle = jobTitle;
   }
   public EmployeeClass(String name, String jobTitle, int ID) {
      this.name = name;
      this.jobTitle = jobTitle;
      this.ID = ID;
   }
   public EmployeeClass(String name, String jobTitle, int ID, double salary) {
      this.name = name;
      this.jobTitle = jobTitle;
      this.ID = ID;
      this.salary = salary;
   }

   public String toString() {
      return "EmployeeClass{" +
              "name='" + name + '\'' +
              ", jobTitle='" + jobTitle + '\'' +
              ", ID=" + ID +
              ", salary=" + salary +
              '}';
   }
}
