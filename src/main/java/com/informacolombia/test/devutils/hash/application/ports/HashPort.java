package com.informacolombia.test.devutils.hash.application.ports;

import com.informacolombia.test.devutils.hash.domain.HashType;
import com.informacolombia.test.devutils.shared.Data;

public interface HashPort {

    String hash(Data data, HashType hashType);
}
