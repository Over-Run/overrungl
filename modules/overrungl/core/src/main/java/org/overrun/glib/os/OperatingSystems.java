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

package org.overrun.glib.os;

import org.overrun.glib.os.OperatingSystem.*;

/**
 * The operating systems.
 *
 * @author squid233
 * @see OperatingSystem
 * @since 0.1.0
 */
public final class OperatingSystems {
    public static final Windows WINDOWS = new Windows();
    public static final MacOs MAC_OS = new MacOs();
    public static final Solaris SOLARIS = new Solaris();
    public static final Linux LINUX = new Linux();
    public static final FreeBSD FREE_BSD = new FreeBSD();
    public static final Unix UNIX = new Unix();

    /**
     * Gets the native library path arch.
     *
     * @return the arch in native library path
     */
    public static String getNativeLibArch() {
        var os = OperatingSystem.current();
        var arch = System.getProperty("os.arch").toLowerCase();
        if (os == LINUX) {
            if (arch.startsWith("arm") || arch.startsWith("aarch64")) {
                if (arch.contains("64") || arch.startsWith("armv8")) {
                    return "arm64";
                }
                return "arm32";
            }
            return "x64";
        } else if (os == MAC_OS) {
            if (arch.startsWith("aarch64")) {
                return "arm64";
            }
            return "x64";
        } else if (os == WINDOWS) {
            if (arch.contains("64")) {
                if (arch.startsWith("aarch64")) {
                    return "arm64";
                }
                return "x64";
            }
            return "x86";
        }
        throw new IllegalStateException("Doesn't support to os " + os + "; only support to Linux, macOS and Windows");
    }
}
