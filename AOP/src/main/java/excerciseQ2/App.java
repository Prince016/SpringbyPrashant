package excerciseQ2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
        Performance perobj =  ac.getBean("performance",Performance.class);
        perobj.logic();
    }
}