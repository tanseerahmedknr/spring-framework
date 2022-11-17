package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")

public class Doctor implements Staff , BeanNameAware {

//                      Scope of the beans SINGLETON / PROTOTYPE

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    private String qualification;

    public void assist(){
        System.out.println("Doctor is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean Method is called");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post construct method is called");
    }




//    private String qualification;
//
////                          Constructor Injection
//
//    public Doctor(String qualification) {
//        this.qualification = qualification;
//    }
//
//    public void assist(){
//        System.out.println("Doctor is assisting");
//    }
//
////                          Getter & Setter Injection
//
//    public String getQualification() {
//        return qualification;
//    }
//
//    public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }


}
