package com.informacolombia.test.devutils.codec.domain;

import com.informacolombia.test.devutils.codec.domain.codec.Base64Codec;
import com.informacolombia.test.devutils.codec.domain.codec.HexCodec;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CodecType {
    BASE64(Base64Codec.class),
    HEX(HexCodec.class);

    private final Class<? extends Codec> codecClass;
}
