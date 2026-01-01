/*
 * MIT License
 *
 * Copyright (c) 2025-2026 Overrun Organization
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

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/// @since 0.1.0
final class FileSystemFile implements ReadWriteFile {
    private final String filename;
    private final Path path;
    private final boolean readonly;

    FileSystemFile(FileSystem fileSystem, String filename, boolean readonly) {
        this.filename = filename;
        this.path = fileSystem.getPath(filename);
        this.readonly = readonly;
    }

    @Override
    public String filename() {
        return filename;
    }

    @Override
    public boolean readonly() {
        return readonly;
    }

    @Override
    public ReadWriteFile createDirectories() throws IOException {
        Files.createDirectories(path);
        return this;
    }

    @Override
    public ReadWriteFile createParentDirectories() throws IOException {
        Files.createDirectories(path.getParent());
        return this;
    }

    @Override
    public String readText() throws IOException {
        return Files.readString(path);
    }

    @Override
    public MemorySegment readBinary(Arena arena) throws IOException {
        try (FileChannel open = FileChannel.open(path);
             Arena arena1 = Arena.ofConfined()) {
            MemorySegment segment = open.map(FileChannel.MapMode.READ_ONLY, 0, open.size(), arena1);
            return arena.allocateFrom(ValueLayout.JAVA_BYTE, segment, ValueLayout.JAVA_BYTE, 0, segment.byteSize());
        }
    }

    @Override
    public void writeText(String text) throws IOException {
        checkWritable();
        Files.writeString(path, text);
    }

    @Override
    public void writeBinary(MemorySegment segment) throws IOException {
        checkWritable();
        try (FileChannel open = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
             Arena arena = Arena.ofConfined()) {
            MemorySegment mapped = open.map(FileChannel.MapMode.READ_WRITE, 0, segment.byteSize(), arena);
            mapped.copyFrom(segment);
            mapped.force();
        }
    }

    private void checkWritable() {
        if (readonly) {
            throw new IllegalStateException("Couldn't write to local file '" + filename + "' created with FileProvider::readonly");
        }
    }
}
