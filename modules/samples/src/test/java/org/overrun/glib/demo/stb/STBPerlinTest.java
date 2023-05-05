/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

package org.overrun.glib.demo.stb;

import org.overrun.glib.stb.STBImage;
import org.overrun.glib.stb.STBImageWrite;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static org.overrun.glib.stb.STBPerlin.*;

/**
 * Tests STBPerlin and STBImageWrite
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBPerlinTest {
    private static final int WIDTH = 256;
    private static final int HEIGHT = 256;

    private static void write(Arena arena, float[][] noise, String fileName) {
        final MemorySegment buf = arena.allocate(WIDTH * HEIGHT);
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                buf.set(ValueLayout.JAVA_BYTE, y * HEIGHT + x, (byte) ((noise[y][x] + 1f) * .5f * 255f));
            }
        }
        try (MemoryStack stack = MemoryStack.stackPush()) {
            STBImageWrite.png(stack, fileName, WIDTH, HEIGHT, STBImage.GREY, buf, WIDTH);
        }
    }

    public static void main(String[] args) {
        try (Arena arena = Arena.ofConfined()) {
            float[][] noise3 = new float[HEIGHT][WIDTH];
            float[][] noise3seed = new float[HEIGHT][WIDTH];
            float[][] fbmNoise3 = new float[HEIGHT][WIDTH];
            float[][] ridgeNoise3 = new float[HEIGHT][WIDTH];
            float[][] turbulenceNoise3 = new float[HEIGHT][WIDTH];
            for (int y = 0; y < HEIGHT; y++) {
                for (int x = 0; x < WIDTH; x++) {
                    noise3[y][x] = noise3(x / 256f, y / 256f, 0, 0, 0, 0);
                    noise3seed[y][x] = noise3seed(x / 256f, y / 256f, 0, 0, 0, 0, 0b10101010);
                    fbmNoise3[y][x] = fbmNoise3(x / 256f, y / 256f, 0, 2.0f, 0.5f, 6);
                    ridgeNoise3[y][x] = ridgeNoise3(x / 256f, y / 256f, 0, 2.0f, 0.5f, 1.0f, 6);
                    turbulenceNoise3[y][x] = turbulenceNoise3(x / 256f, y / 256f, 0, 2.0f, 0.5f, 6);
                }
            }
            write(arena, noise3, "noise3.png");
            write(arena, noise3seed, "noise3seed.png");
            write(arena, fbmNoise3, "noise3Fbm.png");
            write(arena, ridgeNoise3, "noise3Ridge.png");
            write(arena, turbulenceNoise3, "noise3Turbulence.png");
        }
    }
}
