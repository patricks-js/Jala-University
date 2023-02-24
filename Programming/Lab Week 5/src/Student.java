import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private String email;
    private String course;
    private int phone;
    private String address;
    private int absences;
    private int[] grades;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAbsences() {
        return absences;
    }

    public void setAbsences(int absences) {
        this.absences = absences;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void throwAbsences() {
        System.out.println("\nYou have " + this.getAbsences() + " absences\n");
    }

    public void throwGrades() {
        int absences = this.getAbsences();

        int[] grades = this.getGrades();

        int totalGrade = 0;

        for (int grade : grades) {
            totalGrade += grade;
        }

        int average = totalGrade / grades.length;

        String message = "Grades: " + Arrays.toString(grades) + "\n\n" + "Average: " + average + "\n\n";

        if (average >= 70 && absences <= 15) {
            message += "Approved";
        } else if (average >= 50 && average < 70 && absences <= 15) {
            message += "Take exam";
        } else if (absences > 15 && average >= 50) {
            message += "Failed due to absence";
        } else if (absences <= 15 && average < 50) {
            message += "Failed due to grade";
        } else {
            message += "Reproved";
        }

        System.out.println(message);
    }
}
