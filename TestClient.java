package springcoreex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
  public static void main(String[] args) {
    // start IOC containet
    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
System.out.println("*".repeat(40));
    Emp emp = context.getBean("emp", Emp.class);
    emp.empInfo();
    
    Student student = context.getBean("student", Student.class);
    student.stuInfo();
    context.close();
  }
}
