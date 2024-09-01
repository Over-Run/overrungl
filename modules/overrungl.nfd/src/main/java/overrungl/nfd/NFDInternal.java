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
import overrungl.Configurations;
import overrungl.OverrunGL;
import overrungl.internal.RuntimeHelper;

import java.lang.foreign.SymbolLookup;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

import static overrun.marshal.gen.processor.ProcessorTypes.registerStruct;

/**
 * internal
 *
 * @author squid233
 * @since 0.1.0
 */
final class NFDInternal {
    static final SymbolLookup LOOKUP;

    static {
        registerStruct(NFDNFilterItem.class, NFDNFilterItem.OF);
        registerStruct(NFDNFilterItem.Mutable.class, NFDNFilterItem.Mutable.OF);
        registerStruct(NFDOpenDialogNArgs.class, NFDOpenDialogNArgs.OF);
        registerStruct(NFDOpenDialogU8Args.class, NFDOpenDialogU8Args.OF);
        registerStruct(NFDPickFolderNArgs.class, NFDPickFolderNArgs.OF);
        registerStruct(NFDPickFolderU8Args.class, NFDPickFolderU8Args.OF);
        registerStruct(NFDSaveDialogNArgs.class, NFDSaveDialogNArgs.OF);
        registerStruct(NFDSaveDialogU8Args.class, NFDSaveDialogU8Args.OF);
        registerStruct(NFDU8FilterItem.class, NFDU8FilterItem.OF);
        registerStruct(NFDU8FilterItem.Mutable.class, NFDU8FilterItem.Mutable.OF);
        registerStruct(NFDWindowHandle.class, NFDWindowHandle.OF);

        final Supplier<SymbolLookup> lib = () -> RuntimeHelper.load("nfd", "nfd", OverrunGL.NFD_VERSION);
        final var function = Configurations.NFD_SYMBOL_LOOKUP.get();
        LOOKUP = function != null ? function.apply(lib) : lib.get();
    }

    static final Platform os = Platform.current();
    static final boolean isOsWin = os instanceof Platform.Windows;
    static final boolean isOsWinOrApple = isOsWin || os instanceof Platform.MacOS;
    static final Charset nfdCharset = isOsWin ? StandardCharsets.UTF_16LE : StandardCharsets.UTF_8;
}
