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

/// Provides utilities to access files.
///
/// ## File Providers
///
/// [**File providers**][overrungl.file.FileProvider]
/// allow creating an object containing the path and loading method.
///
/// The file providers allow accessing:
///
/// - [files on specified file system][overrungl.file.FileProvider#ofFileSystem(java.nio.file.FileSystem, boolean)]
/// - [files on local][overrungl.file.FileProvider#ofLocal()]
/// - [files on classpath][overrungl.file.FileProvider#ofClassLoader(java.lang.ClassLoader)]
/// - [files in zip/jar file][overrungl.file.FileProvider#ofZip(java.nio.file.Path)]
///
/// @since 0.1.0
@NullMarked
package overrungl.file;

import org.jspecify.annotations.NullMarked;
