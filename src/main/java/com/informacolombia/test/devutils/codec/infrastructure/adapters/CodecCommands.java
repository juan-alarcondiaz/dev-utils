package com.informacolombia.test.devutils.codec.infrastructure.adapters;

import com.informacolombia.test.devutils.codec.application.ports.CodecPort;
import com.informacolombia.test.devutils.codec.domain.CodecType;
import com.informacolombia.test.devutils.shared.ContentType;
import com.informacolombia.test.devutils.shared.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.command.annotation.Option;

@Command
@RequiredArgsConstructor
public class CodecCommands {

    private final CodecPort codecPort;

    @Command(command = "encode")
    public void encode(@Option(longNames = "type", shortNames = 't') CodecType codecType,
                       @Option(longNames = "content-type", shortNames = 'c') ContentType contentType,
                       @Option(longNames = "data", shortNames = 'd') String data) {
        System.out.println(this.codecPort.encode(new Data(contentType, data), codecType));
    }

    @Command(command = "decode")
    public void decode(@Option(longNames = "type", shortNames = 't') CodecType codecType,
                       @Option(longNames = "content-type", shortNames = 'c') ContentType contentType,
                       @Option(longNames = "data", shortNames = 'd') String data) {
        System.out.println(this.codecPort.decode(new Data(contentType, data), codecType));
    }
}
