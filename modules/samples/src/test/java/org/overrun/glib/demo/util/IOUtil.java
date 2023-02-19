/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

package org.overrun.glib.demo.util;

import java.io.IOException;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentScope;
import java.lang.foreign.ValueLayout;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

/**
 * IO utilities
 *
 * @author squid233
 * @since 0.1.0
 */
public final class IOUtil {
    private IOUtil() {
    }

    private static MemorySegment resizeSegment(SegmentScope scope, MemorySegment segment, long newCapacity) {
        return MemorySegment.allocateNative(newCapacity, scope).copyFrom(segment);
    }

    /**
     * Reads the specified resource and returns the raw data as a {@link MemorySegment}.
     *
     * @param scope       the segment scope. must be {@link SegmentScope#isAlive() alive} until the data is no longer used.
     * @param resource    the resource to read.
     * @param segmentSize the initial segment size.
     * @param bufferSize  the buffer size for reading file.
     * @return the resource data.
     * @throws IOException if an IO error occurs.
     */
    public static MemorySegment ioResourceToSegment(SegmentScope scope, String resource, long segmentSize, int bufferSize) throws IOException {
        final Path path = Path.of(resource);

        // Check whether on local
        if (Files.isReadable(path)) {
            try (var fc = FileChannel.open(path)) {
                return fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size(), scope);
            }
        }

        // On classpath
        try (var is = IOUtil.class.getClassLoader().getResourceAsStream(resource)) {
            Objects.requireNonNull(is, "Failed to load resource '" + resource + "'!");
            MemorySegment segment = MemorySegment.allocateNative(segmentSize, scope);

            // Creates a byte array to avoid creating it per loop
            final byte[] bytes = new byte[bufferSize];
            long pos = 0;
            int count;
            while ((count = is.read(bytes)) > 0) {
                if (pos >= segment.byteSize()) {
                    segment = resizeSegment(scope, segment, Math.ceilDiv(segment.byteSize() * 3, 2)); // 50%
                }
                MemorySegment.copy(bytes, 0, segment, ValueLayout.JAVA_BYTE, pos, count);
                pos += count;
            }
            return segment;
        }
    }

    /**
     * Reads the specified resource and returns the raw data as a {@link MemorySegment}.
     *
     * @param scope       the segment scope. must be {@link SegmentScope#isAlive() alive} until the data is no longer used.
     * @param resource    the resource to read.
     * @param segmentSize the initial segment size.
     * @return the resource data.
     * @throws IOException if an IO error occurs.
     */
    public static MemorySegment ioResourceToSegment(SegmentScope scope, String resource, long segmentSize) throws IOException {
        return ioResourceToSegment(scope, resource, segmentSize, 8192);
    }
}
