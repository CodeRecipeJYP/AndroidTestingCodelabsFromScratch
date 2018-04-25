package com.asuscomm.yangyinetwork.testingcodelabs.utils;

public class NullUtils {
    public static <T> T checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }
}
