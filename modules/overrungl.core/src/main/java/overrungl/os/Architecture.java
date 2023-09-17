/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

package overrungl.os;

import overrungl.internal.Exceptions;

import java.util.Locale;

/**
 * The architecture of the {@link Platform}.
 *
 * @author squid233
 * @since 0.1.0
 */
public enum Architecture {
    X64,
    ARM64,
    ARM32;

    private final String toStringValue = name().toLowerCase(Locale.ROOT);

    /**
     * {@return the current architecture of the current {@linkplain Platform platform}}
     */
    public static Architecture current() {
        class Holder {
            private static final Architecture CURRENT;

            static {
                final Platform platform = Platform.current();
                final String arch = System.getProperty("os.arch").toLowerCase(Locale.ROOT);
                CURRENT = switch (platform) {
                    case Platform.Linux _ -> arch.startsWith("arm") || arch.startsWith("aarch64") ?
                        (arch.contains("64") || arch.startsWith("armv8") ? ARM64 : ARM32) :
                        X64;
                    case Platform.MacOSX _ -> arch.startsWith("aarch64") ? ARM64 : X64;
                    case Platform.Windows _ when arch.contains("64") -> arch.startsWith("aarch64") ? ARM64 : X64;
                    default -> throw Exceptions.ISE. "Unrecognized or unsupported architecture: \{ arch }" ;
                };
            }
        }
        return Holder.CURRENT;
    }

    @Override
    public String toString() {
        return toStringValue;
    }
}
