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

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/// @since 0.1.0
public interface FileProvider {
    static FileSystemFileProvider ofFileSystem(FileSystem fileSystem, boolean implicitlyCloseFS) {
        return new FileSystemFileProviderImpl(fileSystem, implicitlyCloseFS);
    }

    static FileProvider ofLocal() {
        final class Holder {
            static final FileProvider instance = ofFileSystem(FileSystems.getDefault(), false);
        }
        return Holder.instance;
    }

    static FileSystemFileProvider ofZip(Path zipFile) throws IOException {
        return ofFileSystem(FileSystems.newFileSystem(zipFile), true);
    }

    static FileProvider ofClassLoader(ClassLoader classLoader) {
        return new ClassLoaderFileProvider(classLoader);
    }

    static FileProvider ofClasspath() {
        final class Holder {
            static final FileProvider instance = ofClassLoader(ClassLoader.getSystemClassLoader());
        }
        return Holder.instance;
    }

    static ReadWriteFile localFile(String filename) {
        return ofLocal().readWrite(filename);
    }

    static ReadonlyFile classpathFile(String filename) {
        return ofClasspath().readonly(filename);
    }

    ReadonlyFile readonly(String filename);

    ReadWriteFile readWrite(String filename);
}
