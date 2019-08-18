import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
/**
 * @author (Abiral Joshi Shrestha)
 */
public class TrainingInstitute implements ActionListener
{
    JTextField txtcourseName;
    JTextField txtInstructor;
    JTextField txttotalHour;
    JTextField txtdailyHour;
    JTextField txtFees;
    JTextField txtcourseStart;
    JTextField txtcourseNo;
    JTextField txtStudent;
    JTextField txtdownPayment;
    JTextField txtEnroll;
    JTextField txtRoom;
    JTextField txtcertcourseName;
    JTextField txtcertInstructor;
    JTextField txtcerttotalHour;
    JTextField txtcertdailyHour;
    JTextField txtcertFees;
    JTextField txtAward;
    JTextField txtValid;
    JTextField txtcertStudent;
    JTextField txtexamDate;
    JTextField txtstartDate;
    JTextField txtexamCenter;
    JTextField txtcertCourseNo;
    JButton ProfAdd;
    JButton Complete;
    JButton ProfEnrol;
    JButton CertAdd;
    JButton CertEnrol;
    JButton Clear;
    JButton Display;
    
    ArrayList <Course> List;
    public void formCreate()
    {
         List=new ArrayList();
         JFrame frame = new JFrame("Form");
         JLabel lblProfessionalcourse = new JLabel("Professional Course");
         lblProfessionalcourse.setBounds(20,10,410,25);
         frame.add(lblProfessionalcourse);
         
         JLabel lblEmpty = new JLabel("________________");
         lblEmpty.setBounds(20,10,910,25);
         frame.add(lblEmpty);
         
         JLabel lblCertificationcourse = new JLabel("Certification Course");
         lblCertificationcourse.setBounds(20,360,410,25);
         frame.add(lblCertificationcourse);
         
         JLabel lblY = new JLabel("________________");
         lblY.setBounds(20,360,910,25);
         frame.add(lblY);
         
         JLabel lblcourseName = new JLabel("Course Name: ");
         lblcourseName.setBounds(30,50,110,25);
         frame.add(lblcourseName);
         
         txtcourseName = new JTextField();
         txtcourseName.setBounds(150,45,610,35);
         frame.add(txtcourseName);
         
         JLabel lblInstructor = new JLabel("Instructor Name: ");
         lblInstructor.setBounds(30,80,110,25);
         frame.add(lblInstructor);
         
         txtInstructor = new JTextField();
         txtInstructor.setBounds(150,80,610,35);
         frame.add(txtInstructor);
         
         JLabel lbltotalHour = new JLabel("Total  Hours: ");
         lbltotalHour.setBounds(30,120,110,25);
         frame.add(lbltotalHour);
         
         txttotalHour = new JTextField();
         txttotalHour.setBounds(150,115,240,35);
         frame.add(txttotalHour);
         
         JLabel lbldailyHour = new JLabel("Daily Hour: ");
         lbldailyHour.setBounds(390,120,110,25);
         frame.add(lbldailyHour);
         
         txtdailyHour = new JTextField();
         txtdailyHour.setBounds(485,115,275,35);
         frame.add(txtdailyHour);
         
         JLabel lblFees = new JLabel("Course Fee: ");
         lblFees.setBounds(30,155,110,25);
         frame.add(lblFees);
         
         txtFees = new JTextField();
         txtFees.setBounds(150,150,240,35);
         frame.add(txtFees);
         
         JLabel lblcourseNo = new JLabel("Course No.: ");
         lblcourseNo.setBounds(30,225,110,25);
         frame.add(lblcourseNo);
         
         txtcourseNo = new JTextField();
         txtcourseNo.setBounds(150,220,610,35);
         frame.add(txtcourseNo);
         
         JLabel lblStudent = new JLabel("Student Name: ");
         lblStudent.setBounds(30,260,110,25);
         frame.add(lblStudent);
         
         txtStudent = new JTextField();
         txtStudent.setBounds(150,255,210,35);
         frame.add(txtStudent);
         
         JLabel lbldownPayment = new JLabel("Down Payment: ");
         lbldownPayment.setBounds(390,260,120,25);
         frame.add(lbldownPayment);
         
         txtdownPayment = new JTextField();
         txtdownPayment.setBounds(485,255,275,35);
         frame.add(txtdownPayment);
         
         JLabel lblEnroll = new JLabel("Enroll Date: ");
         lblEnroll.setBounds(30,295,110,25);
         frame.add(lblEnroll);
         
         txtEnroll = new JTextField();
         txtEnroll.setBounds(150,290,210,35);
         frame.add(txtEnroll);
         
         JLabel lblRoom = new JLabel("Room No.: ");
         lblRoom.setBounds(390,295,110,25);
         frame.add(lblRoom);
         
         txtRoom = new JTextField();
         txtRoom.setBounds(485,290,275,35);
         frame.add(txtRoom);
         
         JLabel lblcertcourseName = new JLabel("Course Name: ");
         lblcertcourseName.setBounds(30,395,110,25);
         frame.add(lblcertcourseName);
         
         txtcertcourseName = new JTextField();
         txtcertcourseName.setBounds(150,390,610,35);
         frame.add(txtcertcourseName);
         
         JLabel lblcertInstructor = new JLabel("Instructor Name: ");
         lblcertInstructor.setBounds(30,430,110,25);
         frame.add(lblcertInstructor);
         
         txtcertInstructor = new JTextField();
         txtcertInstructor.setBounds(150,425,610,35);
         frame.add(txtcertInstructor);
         
         JLabel lblcerttotalHour = new JLabel("Total Hour: ");
         lblcerttotalHour.setBounds(30,465,110,25);
         frame.add(lblcerttotalHour);
         
         txtcerttotalHour = new JTextField();
         txtcerttotalHour.setBounds(150,460,240,35);
         frame.add(txtcerttotalHour);
         
         JLabel lblcertdailyHour = new JLabel("Daily Hour: ");
         lblcertdailyHour.setBounds(390,465,110,25);
         frame.add(lblcertdailyHour);
         
         txtcertdailyHour = new JTextField();
         txtcertdailyHour.setBounds(485,460,275,35);
         frame.add(txtcertdailyHour);
         
         JLabel lblcertFees = new JLabel("Course Fee: ");
         lblcertFees.setBounds(30,500,110,25);
         frame.add(lblcertFees);
         
         txtcertFees = new JTextField();
         txtcertFees.setBounds(150,495,240,35);
         frame.add(txtcertFees);
         
         JLabel lblAward = new JLabel("Awarded By: ");
         lblAward.setBounds(390,500,110,25);
         frame.add(lblAward);
         
         txtAward = new JTextField();
         txtAward.setBounds(485,495,275,35);
         frame.add(txtAward);
         
         JLabel lblValid = new JLabel("Valid Till: ");
         lblValid.setBounds(30,535,110,25);
         frame.add(lblValid);
         
         txtValid = new JTextField();
         txtValid.setBounds(150,530,240,35);
         frame.add(txtValid);
         
         JLabel lblcertStudent = new JLabel("Student Name: ");
         lblcertStudent.setBounds(30,605,110,25);
         frame.add(lblcertStudent);
         
         txtcertStudent = new JTextField();
         txtcertStudent.setBounds(150,600,610,35);
         frame.add(txtcertStudent);
         
         JLabel lblstartDate = new JLabel("Start Date: ");
         lblstartDate.setBounds(30,640,110,25);
         frame.add(lblstartDate);
         
         txtstartDate = new JTextField();
         txtstartDate.setBounds(150,635,240,35);
         frame.add(txtstartDate);
         
         JLabel lblexamDate = new JLabel("Exam Date: ");
         lblexamDate.setBounds(390,640,110,25);
         frame.add(lblexamDate);
         
         txtexamDate = new JTextField();
         txtexamDate.setBounds(485,635,275,35);
         frame.add(txtexamDate);
         
         JLabel lblexamCenter = new JLabel("Exam Center: ");
         lblexamCenter.setBounds(30,675,110,25);
         frame.add(lblexamCenter);
         
         txtexamCenter = new JTextField();
         txtexamCenter.setBounds(150,670,610,35);
         frame.add(txtexamCenter);
         
         JLabel lblcertCourseNo = new JLabel("Course No: ");
         lblcertCourseNo.setBounds(30,580,110,25);
         frame.add(lblcertCourseNo);
         
         txtcertCourseNo = new JTextField();
         txtcertCourseNo.setBounds(150,570,610,35);
         frame.add(txtcertCourseNo);
         
         ProfAdd = new JButton("Add");
         ProfAdd.setBounds(650,185,110,35);
         frame.add(ProfAdd);
         frame.setSize(400,400);
         ProfAdd.addActionListener(this);
         
         Complete = new JButton("Complete");
         Complete.setBounds(440,325,160,35);
         frame.add(Complete);
         frame.setSize(400,400);
         Complete.addActionListener(this);
         
         
         ProfEnrol = new JButton("Enroll Student");
         ProfEnrol.setBounds(600,325,160,35);
         frame.add(ProfEnrol);
         frame.setSize(400,400);
         ProfEnrol.addActionListener(this);
         
         CertAdd = new JButton("Add");
         CertAdd.setBounds(650,530,110,35);
         frame.add(CertAdd);
         frame.setSize(400,400);
         CertAdd.addActionListener(this);
         
         CertEnrol = new JButton("Enroll");
         CertEnrol.setBounds(600,705,160,35);
         frame.add(CertEnrol);
         frame.setSize(400,400);
         CertEnrol.addActionListener(this);
         
         Clear = new JButton("Clear");
         Clear.setBounds(600,740,160,35);
         frame.add(Clear);
         frame.setSize(400,400);
         Clear.addActionListener(this);
         
         Display = new JButton("Display All");
         Display.setBounds(440,705,160,35);
         frame.add(Display);
         frame.setSize(400,400);
         Display.addActionListener(this);
        
         frame.setSize(900,900);
         frame.setLayout(null);
         frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
       
        
        if (e.getSource()==ProfAdd)
        {
            try
            {
                String courseName= txtcourseName.getText();
                String instructorName= txtInstructor.getText();
                int courseFee= Integer.parseInt(txtFees.getText());
                int totalHours= Integer.parseInt(txttotalHour.getText());
                int dailyHours= Integer.parseInt(txtdailyHour.getText());
                
                Professional prof = new Professional(courseName, instructorName, courseFee, totalHours, dailyHours);
                
                List.add(prof);
                
                txtcourseName.setText("");
                txtInstructor.setText("");
                txtAward.setText("");
                txtValid.setText("");
                txtFees.setText("");
                txttotalHour.setText("");
                
                
                JOptionPane.showMessageDialog(null,"Added Success!");
            }
            catch(Exception exc)
            {
                JOptionPane.showMessageDialog(null,"Error, Try Again!");
            }
        }
    
        
        if (e.getSource()==CertAdd)
        {
            try
            {
            String courseName= txtcertcourseName.getText();
            String instructorName= txtcertInstructor.getText();
            int totalHour= Integer.parseInt(txtcerttotalHour.getText());
            int courseFee= Integer.parseInt(txtcertFees.getText());
            String certificateAwardedBy= txtAward.getText();
            String validTill=txtValid.getText();
            
            Certification cert = new Certification(courseName, instructorName, totalHour, courseFee, certificateAwardedBy, validTill);
            
            List.add(cert);
            
            txtcertcourseName.setText("");
            txtcertInstructor.setText("");
            txtcerttotalHour.setText("");
            txtcertFees.setText("");
            txtAward.setText("");
            txtValid.setText("");
            txtcertdailyHour.setText("");
            
            JOptionPane.showMessageDialog(null,"Added Success!");
        
        }
        
        catch(Exception exc)
        {
             JOptionPane.showMessageDialog(null,"Error!!");
        }
        }
        
        
        
        
        
        if(e.getSource()==ProfEnrol)
        {
            try
            {
                int CourseNo = Integer.parseInt(txtcourseNo.getText());
                Professional prof = (Professional) List.get(CourseNo);
                int downPayment = Integer.parseInt(txtdownPayment.getText());
                if(CourseNo >= 0|| CourseNo < List.size())
                {
                    if(List.get(CourseNo) instanceof Professional)
                    {
                        prof.enrolStudent(txtStudent.getText(),txtEnroll.getText(),downPayment,txtRoom.getText());
                        JOptionPane.showMessageDialog(null,"Student successfully enrolled!");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null," Course number not available ");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null," Course number not available ");
                }
            
            }
            catch(NumberFormatException exec)
            {
                JOptionPane.showMessageDialog(null," Enter a number ");
            }
            catch(Exception exec)
            {
                JOptionPane.showMessageDialog(null," Error ");
            }
        }
        
        
       
        if(e.getSource()==CertEnrol)
        {
            try
            {
                int courseNo1 = Integer.parseInt(txtcertCourseNo.getText());
                
                int downPayment = Integer.parseInt(txtdownPayment.getText());
                if(courseNo1 >= 0|| courseNo1 < List.size())
                {
                    if(List.get(courseNo1) instanceof Certification)
                    {
                        Certification cert = (Certification) List.get(courseNo1);
                        cert.enrolStudent(txtStudent.getText(),txtstartDate.getText(),txtEnroll.getText(),txtRoom.getText());
                        JOptionPane.showMessageDialog(null,"Student successfully enrolled!");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null," Course number not available ");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null," Course number not available ");
                }
            
            }
            catch(NumberFormatException exec)
            {
                JOptionPane.showMessageDialog(null," Enter a number ");
            }
            catch(Exception exec)
            {
                JOptionPane.showMessageDialog(null," Error ");
            }
        }
        
        if (e.getSource()==Display)
        {
            for(Course loop : List)
            {
                if (loop instanceof Professional)
                {
                    Professional prof = (Professional) loop;
                    prof.display();
                }
            }
            for(Course loop : List)
            {
                if (loop instanceof Certification)
                {
                    Certification cert = (Certification) loop;
                    cert.display();
                }
            }
        }
        
        if(e.getSource() == Complete)
        {
            try
            {
                int courseNo = Integer.parseInt(txtcourseNo.getText());
                Professional prof = (Professional)List.get(courseNo);
                if(List.get(courseNo) instanceof Professional)
                {
                    prof.courseCompletion();
                    JOptionPane.showMessageDialog(null,"The course has been completed");
                    
                    txtStudent.setText(" ");
                    txtcourseNo.setText(" ");
                    txtEnroll.setText(" ");
                    txtRoom.setText(" ");
                    txtdownPayment.setText(" ");
                
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Course number is not available");
                }
            }
            catch(NumberFormatException exec)
            {
                JOptionPane.showMessageDialog(null,"Enter a number");
            }
            catch(Exception exec)
            {
                JOptionPane.showMessageDialog(null,"Error");
            }
        }
        
        if( e.getSource() == Clear)
        {
            txtcourseName.setText("");
            txtInstructor.setText("");
            txttotalHour.setText("");
            txtdailyHour.setText("");
            txtFees.setText("");
            //txtcourseStart.setText("");
            txtcourseNo.setText("");
            txtStudent.setText("");
            txtdownPayment.setText("");
            txtEnroll.setText("");
            txtRoom.setText("");
            txtcertcourseName.setText("");
            txtcertInstructor.setText("");
            txtcerttotalHour.setText("");
            txtcertdailyHour.setText("");
            txtcertFees.setText("");
            txtAward.setText("");
            txtValid.setText("");
            txtcertStudent.setText("");
            txtexamDate.setText("");
            txtstartDate.setText("");
            txtexamCenter.setText("");
            txtcertCourseNo.setText("");
        }
    }
    
    public static void main(String args[])
        {
            new TrainingInstitute().formCreate();
        }
}

