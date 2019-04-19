package com.svitlana;

import com.svitlana.decorator.Resource;
import com.svitlana.decorator.ResourceDecorator;
import com.svitlana.decorator.ResourceImpl;
import com.svitlana.singleton.CorrectSingleton;
import com.svitlana.strategy.*;
import com.svitlana.template_method.MostPopularRanking;
import com.svitlana.template_method.NewestSorting;
import com.svitlana.template_method.RankingComponent;

public class Main {


    public static void main(String[] args) {

        hiddenStaticMethodsTest();
        correctSingletonTest();

        System.out.println("===================");

        decoratorTest(new ResourceDecorator(new ResourceImpl()));

        System.out.println("===================");

        strategyTest("payPal");
        strategyTest("master");

        System.out.println("===================");

        templateMethodTest();
    }

    private static void templateMethodTest() {
        // register few Ranking components
        RankingComponent mostPopularUser = new MostPopularRanking();
        RankingComponent newestUser = new NewestSorting();

        //we pass RankingComponent to appropriate ranking implementations

        mostPopularUser.getData();
        newestUser.getData();


    }

    private static void strategyTest(final String paymentWay) {
        // DI is here with default strategy optionally
        PaymentService paymentService = new PaymentServiceImpl();
        paymentService.setMethod(getStrategy(paymentWay));
        paymentService.pay();
    }


    private static PaymentMethod getStrategy(String type) {
        // get strategy. May depends on type or some conditions. Strategy can be got from factory
        if ("payPal".equals(type)) {
            return new PayPalPaymentMethod();
        } else {
            return new MasterCardPayment();
        }
    }

    private static void decoratorTest(final Resource resource) {
        System.out.println(resource.getPath());
        System.out.println(resource.getVersion());
    }

    private static void correctSingletonTest() {
        System.out.println(CorrectSingleton.getInstance().getData());
    }

    private static void hiddenStaticMethodsTest() {
        Car car1 = new Car();
        car1.startCar();

        Car car2 = new ElectroCar();
        car2.startCar();

        ElectroCar car3 = new ElectroCar();
        car3.startCar();
    }
}
