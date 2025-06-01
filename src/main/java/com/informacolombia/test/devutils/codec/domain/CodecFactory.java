package com.informacolombia.test.devutils.codec.domain;

import com.informacolombia.test.devutils.codec.domain.exceptions.CodecInstantiationFailureException;
import org.jetbrains.annotations.NotNull;

public class CodecFactory {

    public static @NotNull Codec getCodec(CodecType codecType) {
        try {
            return codecType.getCodecClass().getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new CodecInstantiationFailureException("Failure to instantiate codec");
        }
    }
}
