/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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

package overrungl.nfd;

import io.github.overrun.platform.Platform;
import overrun.marshal.Downcall;
import overrun.marshal.DowncallOption;
import overrungl.Configurations;
import overrungl.OverrunGL;
import overrungl.internal.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.function.Supplier;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static overrungl.nfd.NFD.PATH_SET_SIZE;

/**
 * internal
 *
 * @author squid233
 * @since 0.1.0
 */
final class NFDInternal {
    static final SymbolLookup LOOKUP;
    static final NFD instance;

    static {
        final Supplier<SymbolLookup> lib = () -> RuntimeHelper.load("nfd", "nfd", OverrunGL.NFD_VERSION);
        final var function = Configurations.NFD_SYMBOL_LOOKUP.get();
        LOOKUP = function != null ? function.apply(lib) : lib.get();
        instance = Downcall.load(MethodHandles.lookup(), NFDInternal.LOOKUP, DowncallOption.descriptors(Map.of(
            "NFD_PathSet_GetPathN", FunctionDescriptor.of(JAVA_INT, ADDRESS, PATH_SET_SIZE, ADDRESS),
            "NFD_PathSet_GetPathU8", FunctionDescriptor.of(JAVA_INT, ADDRESS, PATH_SET_SIZE, ADDRESS)
        )));
    }

    static final Platform os = Platform.current();
    static final boolean isOsWin = os instanceof Platform.Windows;
    static final boolean isOsWinOrApple = isOsWin || os instanceof Platform.MacOS;
    static final Charset nfdCharset = isOsWin ? StandardCharsets.UTF_16LE : StandardCharsets.UTF_8;
}
