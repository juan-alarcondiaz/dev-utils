package com.informacolombia.test.devutils.hash.application.adapters;

import com.informacolombia.test.devutils.hash.application.ports.HashPort;
import com.informacolombia.test.devutils.hash.domain.HashFactory;
import com.informacolombia.test.devutils.hash.domain.HashType;
import com.informacolombia.test.devutils.shared.Data;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class HashAdapter implements HashPort {

    @Override
    public String hash(@NotNull Data data, HashType hashType) {
        return HashFactory.getHasher(hashType).hash(data.data().getBytes());
    }
}
