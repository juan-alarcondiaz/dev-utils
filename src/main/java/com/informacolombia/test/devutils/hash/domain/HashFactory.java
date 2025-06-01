package com.informacolombia.test.devutils.hash.domain;

import com.informacolombia.test.devutils.hash.domain.exception.HasherInstantiationFailureException;
import org.jetbrains.annotations.NotNull;

public class HashFactory {

    public static @NotNull Hasher getHasher(HashType hashType) {
        try {
            return hashType.getHasherClass().getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new HasherInstantiationFailureException("Failure to instantiate hasher");
        }
    }
}
