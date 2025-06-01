package com.informacolombia.test.devutils.hash.infrastructure.config;

import com.informacolombia.test.devutils.hash.domain.HashType;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class StringToHashTypeConverter implements Converter<String, HashType> {

    @Override
    public HashType convert(@NotNull String source) {
        try {
            return HashType.valueOf(source.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid hash: '" + source + "'. Allowed values are: " +
                    Arrays.toString(HashType.values()), e);
        }
    }
}
