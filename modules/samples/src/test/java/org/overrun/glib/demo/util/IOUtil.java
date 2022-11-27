/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.demo.util;

import java.io.IOException;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * IO utilities
 *
 * @author squid233
 * @since 0.1.0
 */
public final class IOUtil {
    private IOUtil() {
    }

    private static MemorySegment resizeSegment(MemorySession scope, MemorySegment segment, int newCapacity) {
        return MemorySegment.allocateNative(newCapacity, scope).copyFrom(segment);
    }


    /**
     * Reads the specified resource and returns the raw data as a MemorySegment.
     *
     * @param arena       the arena
     * @param resource    the resource to read
     * @param segmentSize the initial segment size
     * @return the resource data
     * @throws IOException if an IO error occurs
     */
    public static MemorySegment ioResourceToSegment(MemorySession arena, String resource, int segmentSize) throws IOException {
        MemorySegment segment;

        var path = Path.of(resource);
        if (Files.isReadable(path)) {
            try (var fc = FileChannel.open(path)) {
                segment = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size(), arena);
            }
        } else {
            try (var is = IOUtil.class.getClassLoader().getResourceAsStream(resource);
                 var rbc = Channels.newChannel(is)) {
                segment = MemorySegment.allocateNative(segmentSize, arena);
                var buffer = segment.asByteBuffer();
                while (true) {
                    int bytes = rbc.read(buffer);
                    if (bytes == -1) {
                        break;
                    }
                    if (buffer.remaining() == 0) {
                        segment = resizeSegment(arena, segment, buffer.capacity() * 3 / 2); // 50%
                        buffer = segment.asByteBuffer();
                    }
                }
            }
        }

        return segment;
    }
}
