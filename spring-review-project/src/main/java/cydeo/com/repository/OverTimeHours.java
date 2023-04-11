package cydeo.com.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OverTimeHours implements HoursRepository {



    @Override
    public Integer getHours() {
        return 40;
    }
}
