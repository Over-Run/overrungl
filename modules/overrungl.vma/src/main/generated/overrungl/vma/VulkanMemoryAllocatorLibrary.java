/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
package overrungl.vma;
import overrungl.OverrunGL;
import overrungl.internal.RuntimeHelper;
import java.lang.foreign.SymbolLookup;
import java.util.function.Supplier;

/// Accessor of symbol lookup of module `vma`.
public final class VulkanMemoryAllocatorLibrary {
    private static SymbolLookup customLookup;
    private VulkanMemoryAllocatorLibrary() {}

    /// {@return a supplier of the default symbol lookup which tries loading from local and classpath}
    ///
    /// The returned supplier tries loading each time when invoking `get`.
    public static Supplier<SymbolLookup> defaultLookupSupplier() {
        return () -> RuntimeHelper.load("vma", "VulkanMemoryAllocator", OverrunGL.VMA_VERSION);
    }

    /// Sets a custom symbol lookup for module `vma`.
    ///
    /// This doesn't take effect after `VulkanMemoryAllocatorLibrary::lookup()` had invoked.
    /// @param the custom symbol lookup
    public static void useLookup(SymbolLookup lookup) { customLookup = lookup; }

    /// {@return the symbol lookup to be used for module `vma`}
    public static SymbolLookup lookup() {
        final class Holder {
            static final SymbolLookup lookup = customLookup != null ? customLookup : defaultLookupSupplier().get();
        }
        return Holder.lookup;
    }
}
