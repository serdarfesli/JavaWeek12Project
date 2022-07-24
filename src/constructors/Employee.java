package constructors;

public class Employee {
   public String name;
   public String jobTitle;
   public int ID;
   public double salary;
   public static String companyName ="Microsoft";

   public Employee() {
      salary=10000;
   }
   public Employee(String name) {
      this.name = name;
   }
   public Employee(String name, String jobTitle) {
      this.name = name;
      this.jobTitle = jobTitle;
   }
   public Employee(String name, String jobTitle, int ID) {
      this.name = name;
      this.jobTitle = jobTitle;
      this.ID = ID;
   }
   public Employee(String name, String jobTitle, int ID, double salary) {
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
              " ,company Name=" + companyName +
              '}';
   }
}
