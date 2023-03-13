import com.dao.StudentDao;
import com.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationConfig.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);

//        Student student=new Student(666,"Saksham","New-York");
//        int insert = studentDao.insert(student);
//        System.out.println("no of records: "+insert);
        System.out.println("*********************        WELCOME          ***********************************");
        boolean flag=true;
       while (true){
           try{
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               System.out.println("PRESS 1 FOR ADDING STUDENT");
               System.out.println("PRESS 2 FOR GETTING ONE STUDENT");
               System.out.println("PRESS 3 FOR GETTING ALL STUDENT");
               System.out.println("PRESS 4 FOR DELETING STUDENT");
               System.out.println("PRESS 5 FOR UPDATING STUDENT");
               System.out.println("PRESS 6 EXISTING FROM PROGRAM");
               int input=Integer.parseInt(br.readLine());
               switch (input){
                   case 1:
                       System.out.println("enter the student id");
                       int sid=Integer.parseInt(br.readLine());
                       System.out.println("enter the student name");
                       String name=br.readLine();
                       System.out.println("enter the student city");
                       String city=br.readLine();
                       Student student=new Student(sid,name,city);
                       System.out.println("Adding result in DB : "+studentDao.insert(student));
                       break;
                   case 2:
                       System.out.println("Enter the fetching student record ID");
                       int id=Integer.parseInt(br.readLine());
                       Student student1 = studentDao.getStudent(id);
                       System.out.println(student1.getStudentId()+" "+student1.getStudentCity()+" "+student1.getStudentName());
                       break;
                   case 3:
                       System.out.println("Getting all student records");
                       List<Student> allStudent = studentDao.getAllStudent();
                       allStudent.stream().forEach(e->{
                           System.out.println(e.getStudentId()+ " "+e.getStudentName()+" "+e.getStudentCity());
                       });
                       break;
                   case 4:
                       System.out.println("Enter the student id which you want to delete");
                       int dstid=Integer.parseInt(br.readLine());
                       studentDao.deleteStudent(dstid);
                       break;
                   case 5:
                       System.out.println("Enter the information of the update student {id must be same}");
                       int uid=Integer.parseInt(br.readLine());
                       System.out.println("enter the student name");
                       String uname=br.readLine();
                       System.out.println("enter the student city");
                       String ucity=br.readLine();
                       Student Ustudent=new Student(uid,uname,ucity);
                       studentDao.updateStudent(Ustudent);
                       break;
                   case 6:
                       flag=false;
                       break;



               }

           }catch (Exception e){
               System.out.println("INVALID INPUT "+e.getMessage());
           }
           System.out.println("-------------------------------------------");
           if (flag==false) {
               break;
           }
       }
        System.out.println("---------- Thanks For Using -------------");

    }
}
