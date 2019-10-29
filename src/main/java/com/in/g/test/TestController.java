package com.in.g.test;

import com.in.g.impl.*;
import com.in.g.model.Validator;

public class TestController {

    public static void main(String[] args) {
//        Validator validator = new Validator(new IsNumberic());
//        System.out.println(validator.validate("a"));
//        Validator validator1 = new Validator(new IsAllLowerCase());
//        System.out.println(validator1.validate("1"));
//
//        Validator validator2 = new Validator((p) -> p.matches("[a-z]+"));
//        System.out.println(validator2.validate("a"));
//        Validator validator3 = new Validator((p) -> p.matches("\\d+"));
//        System.out.println(validator3.validate("1"));

//        Feed f = new Feed();
//        f.registerObserver(new NYTimes());
//        f.registerObserver(new Guardian());
//        f.registerObserver(new LeMonde());
//        f.notifyOfObserver("The queen said her favourite book is Java 8 in Action!");
        Feed f = new Feed();
        f.registerObserver((String sweet) -> {
            if (sweet != null && sweet.contains("queen")) {
                System.out.println("Yet another news in London..." + sweet);
            }
        });
        f.registerObserver((String sweet) -> {
            if(sweet != null && sweet.contains("wine")){
                System.out.println("Today cheese, wine and news! " + sweet);
            }
        });
        f.notifyOfObserver("The queen said her favourite book is Java 8 in Action!");
    }
}
