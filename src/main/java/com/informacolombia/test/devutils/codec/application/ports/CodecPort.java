package com.informacolombia.test.devutils.codec.application.ports;

import com.informacolombia.test.devutils.shared.Data;
import com.informacolombia.test.devutils.codec.domain.CodecType;

public interface CodecPort {

    String encode(Data data, CodecType type);

    String decode(Data data, CodecType type);
}
