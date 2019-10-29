package com.in.g.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 验证模板模式
 */
public class ModelDesignor {
    public static List<Customer> customerList;

    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer("老王 ", "1234"));
    }

    public void processCustomer(int id, Consumer<Customer> makeCustomerHappy) {
        Customer customer = customerList.get(id);
        makeCustomerHappy.accept(customer);
    }

    public static void main(String[] args) {
        new ModelDesignor().processCustomer(0, (Customer c) -> System.out.println("hello:"+c.getCustomerName()));
    }
}
