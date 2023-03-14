import com.removingconfig.JavaConfigBean;
import com.removingconfig.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RemovingConfig28 {
    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext28.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigBean.class);


        Student student=context.getBean("student",Student.class);
        student.study();
    }
}
