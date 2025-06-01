package com.informacolombia.test.devutils.shared;

import org.jetbrains.annotations.NotNull;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class StringToContentTypeConverter implements Converter<String, ContentType> {

    @Override
    public ContentType convert(@NotNull String source) {
        try {
            return ContentType.valueOf(source.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid contentType: '" + source + "'. Allowed values are: " +
                    Arrays.toString(ContentType.values()), e);
        }
    }
}
