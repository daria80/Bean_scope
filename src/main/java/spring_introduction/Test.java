package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Cat myCat = context.getBean("cat", Cat.class);
        myCat.setName("Nicksik");
        Cat yourCat = context.getBean("cat", Cat.class);
        yourCat.setName("Nicolas");

        System.out.println(myCat.getName());
        System.out.println(yourCat.getName());

        System.out.println("переменные ссылаются на один и тот же объект?\n" + (myCat==yourCat ));
        System.out.println(myCat);
        System.out.println(yourCat + "\n");

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.setName("Belka");
        Dog yourDog = context.getBean("dog", Dog.class);
        yourDog.setName("Strelka");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

        System.out.println("переменные ссылаются на один и тот же объект?\n" + (myDog==yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);

        context.close();

    }
}
