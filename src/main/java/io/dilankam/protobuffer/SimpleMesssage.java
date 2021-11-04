package io.dilankam.protobuffer;

import io.dilankam.protobuff.Simple;

import java.util.Arrays;

/**
 * @author DilankaM
 * @created 04/11/2021 - 15:17
 */
public class SimpleMesssage {

    public static void main(String[] args) {
        System.out.println("hello world");
        Simple.SimpleMessage.Builder builder = Simple.SimpleMessage.newBuilder();
        builder.setId(23).setIsSimple(true).setName("my simple message");

        builder.addSampleList(1).addSampleList(2).addSampleList(3);
        builder.addAllSampleList(Arrays.asList(4,5,6));

        Simple.SimpleMessage message = builder.build();
        System.out.println(message.getId());
        System.out.println(message.getName());
    }
}
