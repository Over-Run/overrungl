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
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/// **File providers** allow creating an object
/// holding the path and providing methods to read/write.
/// The file providers provide access to files:
///
/// - [on specified file system][overrungl.file.FileProvider#ofFileSystem(java.nio.file.FileSystem, boolean)]
/// - [on local][overrungl.file.FileProvider#ofLocal()]
/// - [on classpath][overrungl.file.FileProvider#ofClassLoader(java.lang.ClassLoader)]
/// - [in zip/jar file][overrungl.file.FileProvider#ofZip(java.nio.file.Path)]
///
/// ## Examples
///
/// ```java
/// // Read the text of a local file
/// var text = FileProvider.localFile("example.txt").readText()
/// try (var arena = Arena.ofConfined()) {
///     // Read binary file on classpath
///     var data = FileProvider.classpathFile("example.png").readBinary(arena);
/// }
/// ```
///
/// @since 0.1.0
public interface FileProvider {
    /// Creates a file provider with the given file system.
    ///
    /// @param fileSystem        the file system where files are accessed. **should** be explicitly closed if `implicitlyCloseFS` is false
    /// @param implicitlyCloseFS closes the `fileSystem` when closing the file provider if `true`; otherwise `false`
    /// @return the file provider
    static FileSystemFileProvider ofFileSystem(FileSystem fileSystem, boolean implicitlyCloseFS) {
        return new FileSystemFileProviderImpl(fileSystem, implicitlyCloseFS);
    }

    /// Creates a file provider which accesses files on local.
    ///
    /// @return the file provider
    static FileProvider ofLocal() {
        final class Holder {
            static final FileProvider instance = ofFileSystem(FileSystems.getDefault(), false);
        }
        return Holder.instance;
    }

    /// Creates a file provider which accesses files in the zip file.
    ///
    /// @param zipFile the path of the zip file
    /// @return the file provider
    static FileSystemFileProvider ofZip(Path zipFile) throws IOException {
        return ofFileSystem(FileSystems.newFileSystem(zipFile), true);
    }

    /// Creates a file provider which finds files from the given class loader.
    ///
    /// @param classLoader the class loader
    /// @return the file provider
    static FileProvider ofClassLoader(ClassLoader classLoader) {
        return new ClassLoaderFileProvider(classLoader);
    }

    /// Creates a file provider which finds files from the [system class loader][ClassLoader#getSystemClassLoader()].
    ///
    /// @return the file provider
    static FileProvider ofClasspath() {
        final class Holder {
            static final FileProvider instance = ofClassLoader(ClassLoader.getSystemClassLoader());
        }
        return Holder.instance;
    }

    /// Creates a local file with the given filename.
    ///
    /// This is an equivalent to:
    /// ```java
    /// FileProvider.ofLocal().readWrite(filename)
    /// ```
    ///
    /// @param filename the name of the file
    /// @return the file
    static ReadWriteFile localFile(String filename) {
        return ofLocal().readWrite(filename);
    }

    /// Creates a file on the classpath with the given filename.
    ///
    /// This is an equivalent to:
    /// ```java
    /// FileProvider.ofClasspath().readonly(filename)
    /// ```
    ///
    /// @param filename the name of the file
    /// @return the file
    static ReadonlyFile classpathFile(String filename) {
        return ofClasspath().readonly(filename);
    }

    /// Creates a readonly file with the given filename.
    ///
    /// @param filename the name of the file
    /// @return the file
    ReadonlyFile readonly(String filename);

    /// Creates a file with read/write operations with the given filename.
    ///
    /// @param filename the name of the file
    /// @return the file
    /// @throws UnsupportedOperationException if this file provider does not support writing files
    ReadWriteFile readWrite(String filename);
}
