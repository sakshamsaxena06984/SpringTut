import com.lifecyle.Example;
import com.lifecyle.Pepsi;
import com.lifecyle.Samosa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
for using destroy function , we should use one shut down hook
 */
public class BeanTut13 {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext13.xml");
        Samosa s= (Samosa) context.getBean("s1");
        System.out.println(s);
        //registration of shut down hook: way of calling destroy function
        context.registerShutdownHook();

        System.out.println("**********************************************");
        Pepsi p= (Pepsi) context.getBean("p1");
        System.out.println(p);

        System.out.println("***********************************************");
        Example e= (Example) context.getBean("sub");
        System.out.println(e);

    }
}
