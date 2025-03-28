class Student{
    int id;
    String name;
    int[] grades = {70, 50, 99, 70, 67, 40};

    void calculateAverageGrade()
    {
        var average = 0;
        for(int grade: this.grades)
        {
            average += grade;
        }
        average /= 6;
        System.out.println("Average grade is "+ average);
    }
    void displayInformation()
    {
        System.out.println("Student Information: \n \t ID: "+ this.id +" Name : "+this.name );
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Student stud = new Student();
        stud.name = "Vaishnavi";
        stud.id = 30;
        stud.calculateAverageGrade();
        stud.displayInformation();
    }
}