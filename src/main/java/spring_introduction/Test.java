package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Cat myCat = context.getBean("cat", Cat.class);
        Cat yourCat = context.getBean("cat", Cat.class);

        System.out.println("переменные ссылаются на один и тот же объект?\n" + (myCat==yourCat ));

        System.out.println(myCat);
        System.out.println(yourCat);

        context.close();
    }
}
