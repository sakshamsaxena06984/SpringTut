import com.ci.Addition;
import com.ci.Person1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTut11 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext11.xml");
        Person1 person1= (Person1) context.getBean("person1");
        System.out.println(person1);

        Addition addition= (Addition) context.getBean("addition1");
        addition.doSum();
    }
}
