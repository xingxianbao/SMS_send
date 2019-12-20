import org.springframework.context.support.ClassPathXmlApplicationContext;
import utils.EmailUtils;

public class EmailTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-mail.xml");

        EmailUtils emailUtils = (EmailUtils) context.getBean("sss");

        emailUtils.semdText();
    }

}
