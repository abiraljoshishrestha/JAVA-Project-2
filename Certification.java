public class Certification extends Course
{
    private int courseFee;
    private String examDate;
    private String startDate;
    private String examCenter;
    private String certificateAwardedBy;
    private String validTill;
    private boolean start;
    public Certification( String courseName, String instructorName, int totalHour, int courseFee, String certificateAwardedBy, String validTill)
    {
        super(courseName, instructorName, totalHour);
        this.courseFee=courseFee;
        this.certificateAwardedBy=certificateAwardedBy;
        this.validTill=validTill;
        startDate="";
        examDate="";
        examCenter="";
        start=false;
    }
    public int getcourseFee()
    {
        return courseFee;
    }
    public String getexamDate()
    {
        return examDate;
    }
    public String getstartDate()
    {
        return startDate;
    }
    public String getexamCenter()
    {
        return examCenter;
    }
    public String getcertificateAwardedBy()
    {
        return certificateAwardedBy;
    }
    public String getvalidTill()
    {
        return validTill;
    }
    public boolean getstart()
    {
        return start;
    }
    public void setcourseFee( int courseFee)
    {
        if (start==false)
        {
            this.courseFee=courseFee;
        }
        else
        {
            System.out.println("The fee is fixed.");
        }
    }
    public void enrolStudent( String studentName, String startDate, String examDate, String examCenter)
    {
        if (start==false)
        {
            super.setstudentName( studentName);
            start=true;
        }
        else
        {
            System.out.println(" The course has already started.");
        }
        this.startDate=startDate;
        this.examDate=examDate;
        this.examCenter=examCenter;
    }
    public void display()
    {
        super.display();
        if (start==true)
        {
            System.out.println(" The course starts from " +startDate);
            System.out.println(" The student's name is " +studentName);
            System.out.println(" The exam starts from " +examDate);
            System.out.println(" The exam center is " +examCenter);
            System.out.println(" Certificate is awarded by " +certificateAwardedBy);
            System.out.println(" The certificate is valid til " +validTill);
        }
    }
}

