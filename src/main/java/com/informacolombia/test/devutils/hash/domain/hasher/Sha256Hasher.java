package com.informacolombia.test.devutils.hash.domain.hasher;

import com.informacolombia.test.devutils.hash.domain.Hasher;
import org.apache.commons.codec.binary.Hex;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class Sha256Hasher implements Hasher {

    private final MessageDigest digest;

    public Sha256Hasher() {
        try {
            this.digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Failure to create SHA256Hasher");
        }
    }

    @Override
    public String hash(byte[] data) {
        byte[] hashBytes = this.digest.digest(data);
        return Hex.encodeHexString(hashBytes);
    }
}
