package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App {
    private static final String NAME = "John Smith";

    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "scopes.xml"
        );
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        applicationContext.getBean("favouriteAnimal", Person.class);


//        Person person1 = context.getBean("favouriteAnimal", Person.class);
//        person1.setName("Kunzaada");
//        person1.setAge(25);
//        person1.setAnimal(new Cat("Eli","brown",1));
//        System.out.println("person-1: " + person1);
//
//        Person person2 = context.getBean("favouriteAnimal", Person.class);
//        person2.setName("Bekzhan");
//        person2.setAge(49);
//        person2.setAnimal(new Dog("Bim-bom","white",3));
//        System.out.println("person-2: " + person2);
//        System.out.println(person1.equals(person2));


        Person person1 = context.getBean("favouriteAnimal", Person.class);
        System.out.println("person-1: " + person1);

        Person person2 = context.getBean("favouriteAnimal1", Person.class);
        System.out.println("person-2: " + person2);

        context.close();
    }

}
