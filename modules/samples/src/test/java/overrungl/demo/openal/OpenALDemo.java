/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package overrungl.demo.openal;

import overrungl.util.MemoryUtil;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.util.Scanner;

import static overrungl.openal.AL.*;
import static overrungl.openal.ALC.*;
import static overrungl.stb.STBVorbis.*;

/**
 * @author squid233
 * @since 0.1.0
 */
public final class OpenALDemo {
    private static void init() {
        MemorySegment device = alcOpenDevice(MemorySegment.NULL);
        MemorySegment context = alcCreateContext(device, MemorySegment.NULL);
        alcMakeContextCurrent(context);
    }

    private static void dispose() {
        MemorySegment context = alcGetCurrentContext();
        MemorySegment device = alcGetContextsDevice(context);
        alcMakeContextCurrent(MemorySegment.NULL);
        alcDestroyContext(context);
        alcCloseDevice(device);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename of an .ogg file: ");
        String filename = sc.nextLine();
        System.out.print("Enter the volume (0.0 ~ 1.0, default 0.5): ");
        String line = sc.nextLine();
        float volume = line.isBlank() ? 0.5f : Float.parseFloat(line);
        System.out.print("Enter the pitch (a positive number, default 1.0): ");
        line = sc.nextLine();
        float pitch = line.isBlank() ? 1.0f : Float.parseFloat(line);

        try {
            init();

            int buffer = alGenBuffers();
            try (FileChannel channel = FileChannel.open(Path.of(filename));
                 Arena arena = Arena.ofConfined()) {
                MemorySegment fileData = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size(), arena);
                MemorySegment pChannels = arena.allocate(ValueLayout.JAVA_INT);
                MemorySegment pSampleRate = arena.allocate(ValueLayout.JAVA_INT);
                MemorySegment pOutput = arena.allocate(ValueLayout.ADDRESS);

                int samples = stb_vorbis_decode_memory(fileData,
                    (int) fileData.byteSize(),
                    pChannels,
                    pSampleRate,
                    pOutput
                );
                if (samples == -1) {
                    System.out.println("Couldn't decode file " + filename);
                    return;
                }

                int channels = pChannels.get(ValueLayout.JAVA_INT, 0);
                int sampleRate = pSampleRate.get(ValueLayout.JAVA_INT, 0);
                MemorySegment output = pOutput.get(ValueLayout.ADDRESS, 0);
                System.out.println("Channels: " + channels);
                System.out.println("Sample rate: " + sampleRate);
                System.out.println("Samples: " + samples);

                int format = channels > 1 ? AL_FORMAT_STEREO16 : AL_FORMAT_MONO16;
                alBufferData(buffer,
                    format,
                    output,
                    samples * (channels > 1 ? 4 : 2),
                    sampleRate);

                MemoryUtil.free(output);
            }

            int source = alGenSources();
            alSourcei(source, AL_BUFFER, buffer);
            alSourcef(source, AL_PITCH, pitch);
            alSourcef(source, AL_GAIN, volume);
            alSource3f(source, AL_POSITION, 0, 0, 0);
            alSource3f(source, AL_VELOCITY, 0, 0, 0);
            alSourcei(source, AL_LOOPING, AL_TRUE);

            alSourcePlay(source);
            System.out.println("Press ENTER to exit.");
            sc.nextLine();
            alSourceStop(source);

            alDeleteSources(source);
            alDeleteBuffers(buffer);
        } finally {
            dispose();
        }
    }
}
