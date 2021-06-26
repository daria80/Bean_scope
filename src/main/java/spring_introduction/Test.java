package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person  = context.getBean("person", Person.class);

        person.callMyPet();
        System.out.println(person.getSurname() + " " + person.getAge());
    }
}
