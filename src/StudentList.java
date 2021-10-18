import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class StudentList {
    private List<Student> listStudents;

    public void setListStudents(List<Student> list) {
        this.listStudents = new ArrayList<Student>(list);
    }

    public List<Student> getListStudents() {
        return new ArrayList<Student>(this.listStudents);
    }

    public static void main(String[] args) {
        StudentList stList = new StudentList();

        List<Student> list1 = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);

        ZoneId defaultZoneId = ZoneId.systemDefault();

        int i = 0;

        while (true) {
            System.out.println("Enter a Y to continue, N will stop: ");
            String res = scanner.nextLine();
            if (res.equals("N")) {
                break;
            } else if (res.equals("Y")) {
                System.out.print("Enter the student ID: ");
                String id = scanner.nextLine();

                System.out.print("Enter a name: ");
                String name = scanner.nextLine();

                System.out.print("Enter the DOB: ");
                String dobString = scanner.nextLine();

                LocalDate dobLocal = LocalDate.parse(dobString);
                Date dob = Date.from(dobLocal.atStartOfDay(defaultZoneId).toInstant());
                System.out.println(dob);

                System.out.print("Enter the gender: ");
                String gender = scanner.nextLine();

                list1.add(new Student(name, id, dob, gender));

            }

        }

        stList.setListStudents(list1);

        for (Student S : list1) {
            String sname = "";
            if (S.getGender().equals("Male") || S.getGender().equals("male")) {
                sname = "Mr";
            } else if (S.getGender().equals("Female") || S.getGender().equals("female")) {
                sname = "Miss";
            } else {
                sname = "---";
            }
            System.out.println(sname + " " + S.getId() + " " + S.getName() + " " + S.getDob() + " " + S.getGender());
        }
    }
}
