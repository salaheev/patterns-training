package org.patterns.builder;

public class Demo {

    public static void main(String[] args) {

        var user = User.builder().id(100).name("Dan").address("Moscow").image(new byte[100]).build();

        System.out.println(user);
    }

}
