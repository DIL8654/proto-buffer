package io.dilankam.protobuffer;

import io.dilankam.protobuff.Complex;

import java.util.Arrays;

/**
 * @author DilankaM
 * @created 04/11/2021 - 23:02
 */
public class ComplexMessage {
    public static void main(String[] args) {
        System.out.println("Complex example");

        Complex.DummyMessage.Builder dummyMessageBuilder = Complex.DummyMessage.newBuilder();

        Complex.DummyMessage dummyMessage = dummyMessageBuilder.setName("Dummy message").setId(123).build();

        Complex.ComplexMessage.Builder complexBuilder = Complex.ComplexMessage.newBuilder();
        complexBuilder.setOneDummy(getDummyMessage("one dummy",123));
        complexBuilder.addMultipleDummy(getDummyMessage("one dummy",1));
        complexBuilder.addMultipleDummy(getDummyMessage("two dummy",2));
        complexBuilder.addMultipleDummy(getDummyMessage("tree dummy",3));

        complexBuilder.addAllMultipleDummy(Arrays.asList(
                getDummyMessage("xxx dummy",4),
                getDummyMessage("yyy dummy",5),
                getDummyMessage("zzz dummy",6)
        ));

        Complex.ComplexMessage complexMsg = complexBuilder.build();
        System.out.println(complexMsg.toString());
    }

    public static Complex.DummyMessage getDummyMessage(String message, int id)
    {
        Complex.DummyMessage.Builder dummyMessageBuilder = Complex.DummyMessage.newBuilder().setId(id).setName(message);
        return dummyMessageBuilder.build();
    }
}
