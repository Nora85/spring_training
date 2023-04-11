package cydeo.com;

import cydeo.com.config.SalaryConfig;
import cydeo.com.service.SalaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SalaryApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(SalaryConfig.class);

        SalaryService salaryService = container.getBean(SalaryService.class);
        salaryService.calculateRegularSalary();

        SalaryService salaryService1 = container.getBean(SalaryService.class);
        salaryService1.calculateRegularSalary();
    }


}
