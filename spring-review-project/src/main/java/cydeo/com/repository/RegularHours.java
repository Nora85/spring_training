package cydeo.com.repository;

import org.springframework.stereotype.Component;
@Component

public class RegularHours  implements HoursRepository{

    @Override
    public Integer getHours() {
        return 40;
    }
}
