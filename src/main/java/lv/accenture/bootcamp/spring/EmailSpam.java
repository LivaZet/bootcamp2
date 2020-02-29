package lv.accenture.bootcamp.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emailSpam")
public class EmailSpam implements NotificationChannel {

    @Value("${notification.email.from}")
    private String senderEmail;

    @Override
    public void notifyUser(User user) {
        System.out.println(user.getFullName() + " is notified by e-mail " + senderEmail);
    }
}
