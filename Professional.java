public class Professional extends Course
{
    private String enrolDate;
    private String roomNo;
    private int courseFee;
    private int dailyHour;
    private int downPayment;
    private boolean start;
    private boolean complete;
    public Professional( String courseName, String instructorName, int courseFee, int totalHours, int dailyHour)
    {
        super( courseName, instructorName, totalHours);
        this.courseFee=courseFee;
        this.dailyHour=dailyHour;
        downPayment=0;
        enrolDate="";
        roomNo="";
        start=false;
        complete=false;
    }
    public String getenrolDate()
    {
        return enrolDate;
    }
    public String getroomNo()
    {
        return roomNo;
    }
    public int getcourseFee()
    {
        return courseFee;
    }
    public int getdailyHour()
    {
        return dailyHour;
    }
    public int getdownPayment()
    {
        return downPayment;
    }
    public boolean getstart()
    {
        return start;
    }
    public boolean getcomplete()
    {
        return complete;
    }
    public void setcourseFee( int courseFee)
    {
        this.courseFee=courseFee;
    }
    public void setdailyHour( int dailyHour)
    {
        this.dailyHour=dailyHour;
    }
    public void enrolStudent( String studentName, String enrolDate, int downPayment, String roomNo)
    {
        if (start==false)
        {
            super.setstudentName( studentName);
            this.enrolDate=enrolDate;
            this.roomNo=roomNo;
            this.downPayment=downPayment;
            start=true;
            complete=false;
        }
        else
        {
            super.getinstructorName();
            System.out.println("This class has already been started and taken by"+" "+instructorName+" "+"in room number"+" "+roomNo+".");;
        }
    }
    public void courseCompletion()
    {
        if (complete=true)
        {
            System.out.println("The course has been completed.");
        }
        else
        {
            super.setstudentName("");
            enrolDate="";
            roomNo="";
            downPayment=0;
            start=false;
            complete=true;
        }
    }
    public void printing( String courseName, String instructorName, int courseFee)
    {
        super.getcourseName();
        System.out.println("The course name is " +courseName);
        System.out.println("The instructor's name is " +instructorName);
        System.out.println("The course fee is " +courseFee);
    }
    public void display()
    {
        super.display();
        if (start=true)
        {
            System.out.println(" The course isn't complete.");
            System.out.println(" The enrol date is " +enrolDate);
            System.out.println(" The downpaymnet is " +downPayment);
        }
    }
}
