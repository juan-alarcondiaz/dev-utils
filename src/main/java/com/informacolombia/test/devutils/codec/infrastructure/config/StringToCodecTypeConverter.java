package com.informacolombia.test.devutils.codec.infrastructure.config;

import com.informacolombia.test.devutils.codec.domain.CodecType;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class StringToCodecTypeConverter implements Converter<String, CodecType> {

    @Override
    public CodecType convert(@NotNull String source) {
        try {
            return CodecType.valueOf(source.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid codec: '" + source + "'. Allowed values are: " +
                    Arrays.toString(CodecType.values()), e);
        }
    }
}