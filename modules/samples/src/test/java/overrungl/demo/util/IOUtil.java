/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

package overrungl.demo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.net.URI;
import java.net.URISyntaxException;
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

    /**
     * Reads the specified resource and returns the raw data as a {@link MemorySegment}.
     *
     * @param arena    the arena. must be {@link MemorySegment.Scope#isAlive() alive} until the data is no longer used.
     * @param resource the resource to read.
     * @return the resource data.
     * @throws IOException if an IO error occurs.
     */
    public static MemorySegment ioResourceToSegment(Arena arena, String resource) throws IOException {
        final boolean isHttp = resource.startsWith("http");
        final Path path = isHttp ? null : Path.of(resource);

        // Check if the path is on local
        if (path != null && Files.isReadable(path)) {
            try (var fc = FileChannel.open(path)) {
                return fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size(), arena);
            }
        }

        // On classpath
        try (
            var is = isHttp ?
                new URI(resource).toURL().openStream() :
                Objects.requireNonNull(IOUtil.class.getClassLoader().getResourceAsStream(resource),
                    "Failed to load resource '" + resource + "'!")
        ) {
            return arena.allocateFrom(ValueLayout.JAVA_BYTE, is.readAllBytes());
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Illegal URI: " + resource, e);
        }
    }

    /// Read text from file on classpath.
    ///
    /// @param filename the filename
    /// @return the content of the file
    /// @since 0.2.0
    public static String readClasspath(String filename) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(IOUtil.class.getClassLoader().getResourceAsStream(filename))))) {
            return reader.readAllAsString();
        } catch (Exception e) {
            throw new RuntimeException("failed to read file on classpath: " + filename, e);
        }
    }
}
