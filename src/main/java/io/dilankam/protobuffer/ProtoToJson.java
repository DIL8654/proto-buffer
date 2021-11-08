package io.dilankam.protobuffer;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import io.dilankam.protobuff.Simple;

import java.util.Arrays;

/**
 * @author DilankaM
 * @created 04/11/2021 - 23:44
 */
public class ProtoToJson {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        Simple.SimpleMessage.Builder builder = Simple.SimpleMessage.newBuilder();
        builder.setId(23).setIsSimple(true).setName("my simple message");

        builder.addSampleList(1).addSampleList(2).addSampleList(3);
        builder.addAllSampleList(Arrays.asList(4,5,6));

        Simple.SimpleMessage message = builder.build();
        String json = JsonFormat.printer().print(message);
        System.out.println(json);
        
        Simple.SimpleMessage.Builder builder2 = Simple.SimpleMessage.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(json, builder2);
        System.out.println(builder2);
    }
}
