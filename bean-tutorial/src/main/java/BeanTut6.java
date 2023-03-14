import com.objects.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTut6 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person= (Person) context.getBean("Person1");
        System.out.println(person);

        Person person1= (Person) context.getBean("Person2");
        System.out.println(person1);

//        using p-schema of bean
        Person person2= (Person) context.getBean("Person3");
        System.out.println(person2);
    }
}
