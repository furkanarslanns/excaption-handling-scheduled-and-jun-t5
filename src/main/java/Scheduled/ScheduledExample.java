package Scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {


    @Scheduled(cron = "* * * * * * ")
public void birdenOna() {
    for( int i= 1 ;i<=10 ; i++) {

        System.out.print(i + "");
    }

}


}
