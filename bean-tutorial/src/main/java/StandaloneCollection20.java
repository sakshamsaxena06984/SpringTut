import com.standalonecollection.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneCollection20 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext20.xml");
        Person p=context.getBean("person",Person.class);
        System.out.println(p);

    }
}
