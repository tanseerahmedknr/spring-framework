package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

//                               XML Based Configuration

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.assist();

//        Nurse nurse = (Nurse) context.getBean("nurse");
//        nurse.assist();
//
//        Doctor staff = context.getBean(Doctor.class);
//        staff.assist();
//        System.out.println(staff.getQualification() );

//        Staff staff = context.getBean(Doctor.class);
//        staff.assist();


//                              Bean Configuration Class.java

        ApplicationContext context
               = new AnnotationConfigApplicationContext(BeanConfig.class);

//        Staff staff = context.getBean(Doctor.class);
//        staff.assist();

//                      Scope of the beans Singleton / Prototype and 3 More

//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.assist();
//        doctor.setQualification("MBBS");
//        System.out.println(doctor);
//
//        Doctor doctor1 = context.getBean(Doctor.class);
//        doctor1.setQualification("UnderGrad");
//        System.out.println(doctor1);

//                                  Bean Life Cycle

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS");
    }
}

