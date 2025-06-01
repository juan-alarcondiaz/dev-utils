package com.informacolombia.test.devutils.codec.domain.codec;

import com.informacolombia.test.devutils.codec.domain.Codec;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.springframework.stereotype.Service;

@Service
public class HexCodec implements Codec {

    @Override
    public String encode(byte[] data) {
        return Hex.encodeHexString(data);
    }

    @Override
    public byte[] decode(String data) {
        try {
            return Hex.decodeHex(data);
        } catch (DecoderException e) {
            throw new RuntimeException("Failure to decode");
        }
    }
}
