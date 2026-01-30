package com.lambda.lambdaExpression.smarthome;

public class SmartHome {

    public static void main(String[] args) {

        LightAction motionAction = () ->
                System.out.println("Motion detected : Lights ON");
        motionAction.execute();

        LightAction eveningAction = () ->
                System.out.println("Evening time : Warm lights ON");
        eveningAction.execute();

        LightAction voiceAction = () ->
                System.out.println("Voice command : lights ON");
        voiceAction.execute();
    }
}
