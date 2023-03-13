import com.autowireannotation.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWire19 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext19.xml");
        Emp emp=context.getBean("emp",Emp.class);
        System.out.println(emp);

    }
}
