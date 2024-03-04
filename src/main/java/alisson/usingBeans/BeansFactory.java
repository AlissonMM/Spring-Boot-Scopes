package alisson.usingBeans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansFactory {

    @Bean
    @Scope("prototype")
    public Sender sender(){
        System.out.println("CREATING SENDER OBJECT");
        Sender sender = new Sender();
        sender.setEmail("noreply@dio.com.br");
        sender.setName("DIO");
        return sender;
    }
}
