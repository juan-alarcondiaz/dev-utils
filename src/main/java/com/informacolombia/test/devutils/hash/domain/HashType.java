package com.informacolombia.test.devutils.hash.domain;

import com.informacolombia.test.devutils.hash.domain.hasher.Sha256Hasher;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum HashType {
    SHA256(Sha256Hasher.class);

    private final Class<? extends Hasher> hasherClass;
}
