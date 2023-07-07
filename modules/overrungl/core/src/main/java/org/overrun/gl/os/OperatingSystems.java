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

package org.overrun.gl.os;

import org.overrun.gl.os.OperatingSystem.*;

import java.util.Locale;

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
     * {@return the arch in native library path}
     */
    public static String getNativeLibArch() {
        var os = OperatingSystem.current();
        var arch = System.getProperty("os.arch").toLowerCase(Locale.ROOT);
        if (os == LINUX) {
            return arch.startsWith("arm") || arch.startsWith("aarch64") ?
                (arch.contains("64") || arch.startsWith("armv8") ? "arm64" : "arm32") :
                "x64";
        }
        if (os == MAC_OS) {
            return arch.startsWith("aarch64") ? "arm64" : "x64";
        }
        if (os == WINDOWS) {
            if (arch.contains("64")) return arch.startsWith("aarch64") ? "arm64" : "x64";
        }
        throw new IllegalStateException(STR."Doesn't support to os \{os} or arch \{arch}; only support to Linux, macOS and Windows");
    }
}
