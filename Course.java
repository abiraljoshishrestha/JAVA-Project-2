public class Course
{
    String courseName;
    String instructorName;
    String studentName;
    int totalHours;
    public Course(String courseName, String instructorName, int totalHours)
    {
        studentName="";
        this.courseName=courseName;
        this.instructorName=instructorName;
        this.totalHours=totalHours;
    }
    public String getcourseName()
    {
        return courseName;
    }
    public String getinstructorName()
    {
        return instructorName;
    }
    public String getstudentName()
    {
        return studentName;
    }
    public int gettotalHours()
    {
        return totalHours;
    }
    public void setstudentName(String studentName)
    {
        this.studentName=studentName;
    }
    public void display()
    {
        if (studentName.length()==0)
        {
            System.out.println(" The course name is"+" "+courseName);
            System.out.println(" The instructor's name is"+" "+instructorName);
            System.out.println(" Total hours taken by the course is"+" "+totalHours);
        }
        else
        {
            System.out.println(" The course name is"+" "+courseName);
            System.out.println(" The student's name is"+" "+studentName);
            System.out.println(" The insturctor's name is"+" "+instructorName);
            System.out.println(" Total hours taken by the course is"+" "+totalHours);
        }
    }
}
