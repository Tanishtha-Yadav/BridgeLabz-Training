package com.lambda.lambdaExpression.hospitalnotification;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotificationFilter {

    public static void main(String[] args) {

        List<Alert> alerts = List.of(
            new Alert("EMERGENCY", "Heart rate critical", 5),
            new Alert("MEDICATION", "Take insulin", 4),
            new Alert("APPOINTMENT", "Doctor visit tomorrow", 2),
            new Alert("EMERGENCY", "Low oxygen level", 5)
        );

     
        Predicate<Alert> emergencyOnly =
                alert -> alert.type.equals("EMERGENCY");

        Predicate<Alert> highPriority =
    	     	   alert -> alert.priority >= 4;

        
        List<Alert> filteredAlerts = alerts.stream()
                                           .filter(emergencyOnly.and(highPriority))
                                            .collect(Collectors.toList());

        filteredAlerts.forEach(System.out::println);
    }
}
