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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.file;

import java.io.*;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

/// @since 0.1.0
final class ClassLoaderFile implements ReadonlyFile {
    private final String filename;
    private final ClassLoader classLoader;

    ClassLoaderFile(String filename, ClassLoader classLoader) {
        this.filename = filename;
        this.classLoader = classLoader;
    }

    @Override
    public String filename() {
        return filename;
    }

    @Override
    public boolean readonly() {
        return true;
    }

    @Override
    public String readText() throws IOException {
        InputStream resource = createInputStream();
        try (var stream = new BufferedReader(new InputStreamReader(resource))) {
            return stream.readAllAsString();
        }
    }

    @Override
    public MemorySegment readBinary(Arena arena) throws IOException {
        InputStream resource = createInputStream();
        try (var stream = new BufferedInputStream(resource)) {
            return arena.allocateFrom(ValueLayout.JAVA_BYTE, stream.readAllBytes());
        }
    }

    private InputStream createInputStream() throws IOException {
        InputStream resource = classLoader.getResourceAsStream(filename);
        if (resource == null) {
            throw new IOException("file not found on classpath: " + filename);
        }
        return resource;
    }
}
