package com.informacolombia.test.devutils.codec.domain;

public interface Codec {

    String encode(byte[] data);

    byte[] decode(String data);
}
