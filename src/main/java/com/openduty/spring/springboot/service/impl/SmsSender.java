package com.openduty.spring.springboot.service.impl;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "AC514d2acea4e6c50902ca32203457afb0";
    public static final String AUTH_TOKEN =
            "3455cc0d4ed487b43c6f721fb681757c";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+34623183933"), // to
                         new PhoneNumber("+441618503994"), // from
                        "You got a new incident")
                .create();

        System.out.println(message.getSid());
    }

}
