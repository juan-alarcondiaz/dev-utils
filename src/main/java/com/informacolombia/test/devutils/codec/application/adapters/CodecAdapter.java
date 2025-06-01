package com.informacolombia.test.devutils.codec.application.adapters;

import com.informacolombia.test.devutils.codec.application.ports.CodecPort;
import com.informacolombia.test.devutils.codec.domain.CodecFactory;
import com.informacolombia.test.devutils.codec.domain.CodecType;
import com.informacolombia.test.devutils.shared.Data;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
@RequiredArgsConstructor
public class CodecAdapter implements CodecPort {

    @Override
    public String encode(@NotNull Data data, CodecType type) {
        return CodecFactory.getCodec(type).encode(data.data().getBytes());
    }

    @Override
    public String decode(@NotNull Data data, CodecType type) {
        byte[] decode = CodecFactory.getCodec(type).decode(data.data());
        return new String(decode, StandardCharsets.UTF_8);
    }
}
