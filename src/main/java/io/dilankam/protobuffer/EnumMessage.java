package io.dilankam.protobuffer;

import io.dilankam.protobuff.EnumExample;

/**
 * @author DilankaM
 * @created 04/11/2021 - 15:18
 */
public class EnumMessage {
    public static void main(String[] args) {
        EnumExample.EnumMessage.Builder enumBuider = EnumExample.EnumMessage.newBuilder();

        enumBuider.setId(12).setDayOfTheWeek(EnumExample.DayOfTheWeek.FRIDAY);

        EnumExample.EnumMessage message  = enumBuider.build();
        System.out.println(enumBuider.toString());
        System.out.println(message.getDayOfTheWeek().toString());

    }
}
