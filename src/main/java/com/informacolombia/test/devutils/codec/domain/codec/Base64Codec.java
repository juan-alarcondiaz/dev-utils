package com.informacolombia.test.devutils.codec.domain.codec;


import com.informacolombia.test.devutils.codec.domain.Codec;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class Base64Codec implements Codec {

    @Override
    public String encode(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }

    @Override
    public byte[] decode(String data) {
        return Base64.getDecoder().decode(data);
    }
}
