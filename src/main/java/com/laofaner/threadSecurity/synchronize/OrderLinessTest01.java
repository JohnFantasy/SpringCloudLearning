package com.laofaner.threadSecurity.synchronize;


import org.openjdk.jcstress.annotations.*;
import org.openjdk.jcstress.infra.results.I_Result;

/**
 * 演示有序性：
 */

@JCStressTest
@Outcome(id = {"1", "4"}, expect = Expect.ACCEPTABLE, desc = "ok")
@Outcome(id = "0", expect = Expect.ACCEPTABLE_INTERESTING, desc = "danger")
@State
public class OrderLinessTest01 {

    int num = 0;
    boolean ready = false;
    private static final Object obj = new Object();

    @Actor
    public void actor1(I_Result r) {
        synchronized (obj) {
            if (ready) {
                r.r1 = num + num;
            } else {
                r.r1 = 1;
            }
        }
    }

    @Actor
    public void actor2(I_Result r) {
        synchronized (obj) {
            num = 2;
            ready = true;
        }
    }
}
