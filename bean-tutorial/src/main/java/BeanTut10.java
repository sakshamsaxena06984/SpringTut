import com.ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTut10 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");
        A objectA= (A) context.getBean("aref");
        System.out.println(objectA);
        System.out.println(objectA.getOb());

        A objectA1= (A) context.getBean("aaref");
        System.out.println(objectA1);
        System.out.println(objectA1.getOb());
    }
}
