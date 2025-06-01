package com.informacolombia.test.devutils.hash.infrastructure.adapters;

import com.informacolombia.test.devutils.hash.application.ports.HashPort;
import com.informacolombia.test.devutils.hash.domain.HashType;
import com.informacolombia.test.devutils.shared.ContentType;
import com.informacolombia.test.devutils.shared.Data;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.command.annotation.Option;

@Command
@RequiredArgsConstructor
public class HashCommands {

    private final HashPort hashPort;

    @Command(command = "hash")
    public void hash(@Option(longNames = "type", shortNames = 't') HashType hashType,
                     @Option(longNames = "content-type", shortNames = 'c', defaultValue = "text") ContentType contentType,
                     @Option(longNames = "data", shortNames = 'd') @NotNull String data) {
        System.out.println(this.hashPort.hash(new Data(contentType, data), hashType));
    }
}
