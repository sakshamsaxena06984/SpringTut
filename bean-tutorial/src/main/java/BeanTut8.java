import com.objects.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTut8 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext1.xml");
        Emp emp= (Emp) context.getBean("emp1");
        System.out.println(emp);

    }
}
