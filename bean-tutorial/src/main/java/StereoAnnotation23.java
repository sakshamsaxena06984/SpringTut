import com.stereotypeannotation.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoAnnotation23 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext23.xml");
        Student student=context.getBean("stu",Student.class);
        System.out.println(student);
        System.out.println(student.hashCode());

        Student student1=context.getBean("stu",Student.class);
        System.out.println(student1);
        System.out.println(student1.hashCode());

    }
}
