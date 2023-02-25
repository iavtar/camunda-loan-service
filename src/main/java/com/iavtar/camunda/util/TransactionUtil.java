package com.iavtar.camunda.util;

import java.util.UUID;

public class TransactionUtil {

    public static String getTransactionId() {
        return UUID.randomUUID().toString();
    }

}
