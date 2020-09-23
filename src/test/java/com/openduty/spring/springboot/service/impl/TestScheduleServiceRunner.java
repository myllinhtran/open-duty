package com.openduty.spring.springboot.service.impl;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestScheduleServiceRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestScheduleService.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
