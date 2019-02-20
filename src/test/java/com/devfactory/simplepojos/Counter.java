package com.devfactory.simplepojos;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private static final AtomicInteger counter = new AtomicInteger();
    private static ServerSocket myssock;
    private static int myid;

    static {
        try {
            myssock = new ServerSocket(0);
            myid = myssock.getLocalPort();
            System.out.println("Started " + myid);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void increment(String reason) {
        int cnt = counter.incrementAndGet();
        System.out.println("Increment " + myid + " to " + cnt + " for " + reason);
    }

    public static void decrement(String reason) {
        int cnt = counter.decrementAndGet();
        System.out.println("Decrement " + myid + " to " + cnt + " for " + reason);
    }
}
