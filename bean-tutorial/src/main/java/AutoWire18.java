import com.autowire.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWire18 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext18.xml");
        Emp emp=context.getBean("emp",Emp.class);
        System.out.println(emp);
        System.out.println("****************************");
        Emp emp1=context.getBean("emp1",Emp.class);
        System.out.println(emp1);

        System.out.println("*******************************");
        Emp emp2=context.getBean("emp2",Emp.class);
        System.out.println(emp2);
    }
}
