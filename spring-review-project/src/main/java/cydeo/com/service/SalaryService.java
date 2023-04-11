package cydeo.com.service;

import cydeo.com.repository.EmployeeRepository;
import cydeo.com.repository.HoursRepository;
import cydeo.com.repository.OverTimeHours;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {
  private final   EmployeeRepository employeeRepository;
   private final HoursRepository hoursRepository;
   private final OverTimeHours overTimeHours;
   public SalaryService(EmployeeRepository employeeRepository, @Qualifier("regularHours") HoursRepository hoursRepository, OverTimeHours overTimeHours) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
        this.overTimeHours = overTimeHours;
    }
        public void calculateRegularSalary(){
            System.out.println(employeeRepository.getHourlyRate()* hoursRepository.getHours());
           // System.out.println(employeeRepository.getHourlyRate()* hoursRepository.getHours()* overTimeHours.getHours());
        }
}



