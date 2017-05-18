package com.huang.http.client;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by huang on 2017/5/17.
 */
public class InetAddressTest {
    @Test
    public void test() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getAddress().toString());
    }
}
