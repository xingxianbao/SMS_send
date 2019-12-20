package utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component("sss")
public class EmailUtils {
        @Autowired
        private JavaMailSender mailSender;

        public void semdText(){
            //创建一个基本的邮件发送消息对象
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            //需要设置邮件的发送者 接收者 标题 内容
            mailMessage.setFrom("xingxianbao@yeah.net");
            mailMessage.setTo("250658406@qq.com");
            mailMessage.setSubject("最近好吗...");
            mailMessage.setText("你过得怎么样...");
            mailSender.send(mailMessage);
            System.out.println("----send ok ---邮件已经成功的发送出去了...");
        }






}
