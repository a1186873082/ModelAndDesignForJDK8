package com.in.g.test;

import com.in.g.impl.*;
import com.in.g.model.Validator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class TestController {

    public static void main(String[] args) {
        //策略模式
//        Validator validator = new Validator(new IsNumberic());
//        System.out.println(validator.validate("a"));
//        Validator validator1 = new Validator(new IsAllLowerCase());
//        System.out.println(validator1.validate("1"));
//
//        Validator validator2 = new Validator((p) -> p.matches("[a-z]+"));
//        System.out.println(validator2.validate("a"));
//        Validator validator3 = new Validator((p) -> p.matches("\\d+"));
//        System.out.println(validator3.validate("1"));
          //觀察者模式
//        Feed f = new Feed();
//        f.registerObserver(new NYTimes());
//        f.registerObserver(new Guardian());
//        f.registerObserver(new LeMonde());
//        f.notifyOfObserver("The queen said her favourite book is Java 8 in Action!");
//        Feed f = new Feed();
//        f.registerObserver((String sweet) -> {
//            if (sweet != null && sweet.contains("queen")) {
//                System.out.println("Yet another news in London..." + sweet);
//            }
//        });
//        f.registerObserver((String sweet) -> {
//            if(sweet != null && sweet.contains("wine")){
//                System.out.println("Today cheese, wine and news! " + sweet);
//            }
//        });
//        f.notifyOfObserver("The queen said her favourite book is Java 8 in Action!");
//        //責任鏈模式
//        ProcessingObj<String> p1 = new HeaderTestProssing();
//        ProcessingObj<String> p2 = new SpellCheckerProcessing();
//        p1.setSuccessObj(p2);
//
//        String result = p1.handler("Aren't labdas really sexy?!!");
//        System.out.println(result);
        //使用lambda表達式
        UnaryOperator<String> headerProcessing = (String test) -> "From Raoul,Mario and Alain:" + test;
        UnaryOperator<String> spellCheckerProcessing = (String test) -> test.replaceAll("labda", "lambda");
        Function<String, String> pipeline = headerProcessing.andThen(spellCheckerProcessing);
        String result = pipeline.apply("Aren't labdas really sexy?!!");
        System.out.println(result);
    }
}
