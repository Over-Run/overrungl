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

package org.overrun.gl.nfd;

import org.overrun.gl.FunctionDescriptors;
import org.overrun.gl.RuntimeHelper;
import org.overrun.gl.os.OperatingSystem;
import org.overrun.gl.util.MemoryStack;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.gl.FunctionDescriptors.*;

/**
 * The Native File Dialog binding.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class NFD {
    private static final SymbolLookup LOOKUP = RuntimeHelper.load("nfd", "nfd", "0.1.0");
    public static final ValueLayout PATH_SET_SIZE;

    static {
        final OperatingSystem os = OperatingSystem.current();
        PATH_SET_SIZE = (os.isWindows() || os.isMacOsX()) ? JAVA_LONG : JAVA_INT;
    }

    private static final MethodHandle
        NFD_FreePathN = downcall("NFD_FreePathN", PV),
        NFD_Init = downcall("NFD_Init", I),
        NFD_Quit = downcall("NFD_Quit", V),
        NFD_OpenDialogN = downcall("NFD_OpenDialogN", PPIPI),
        NFD_OpenDialogMultipleN = downcall("NFD_OpenDialogMultipleN", PPIPI),
        NFD_SaveDialogN = downcall("NFD_SaveDialogN", PPIPPI),
        NFD_PickFolderN = downcall("NFD_PickFolderN", PPI),
        NFD_GetError = downcall("NFD_GetError", p),
        NFD_ClearError = downcall("NFD_ClearError", V),
        NFD_PathSet_GetCount = downcall("NFD_PathSet_GetCount", PPI),
        NFD_PathSet_GetPathN = downcall("NFD_PathSet_GetPathN", FunctionDescriptor.of(JAVA_INT, ADDRESS, PATH_SET_SIZE, ADDRESS)),
        NFD_PathSet_FreePathN = downcallSafe("NFD_PathSet_FreePathN", PV),
        NFD_PathSet_GetEnum = downcall("NFD_PathSet_GetEnum", PPI),
        NFD_PathSet_FreeEnum = downcall("NFD_PathSet_FreeEnum", PV),
        NFD_PathSet_EnumNextN = downcall("NFD_PathSet_EnumNextN", PPI),
        NFD_PathSet_Free = downcall("NFD_PathSet_Free", PV),
        NFD_FreePathU8 = downcallSafe("NFD_FreePathU8", PV),
        NFD_OpenDialogU8 = downcallSafe("NFD_OpenDialogU8", PPIPI),
        NFD_OpenDialogMultipleU8 = downcallSafe("NFD_OpenDialogMultipleU8", PPIPI),
        NFD_SaveDialogU8 = downcallSafe("NFD_SaveDialogU8", PPIPPI),
        NFD_PickFolderU8 = downcallSafe("NFD_PickFolderU8", PPI),
        NFD_PathSet_GetPathU8 = downcallSafe("NFD_PathSet_GetPathU8", FunctionDescriptor.of(JAVA_INT, ADDRESS, PATH_SET_SIZE, ADDRESS)),
        NFD_PathSet_EnumNextU8 = downcallSafe("NFD_PathSet_EnumNextU8", PPI);
    public static final StructLayout PATH_SET_ENUM = MemoryLayout.structLayout(ADDRESS.withName("ptr"));

    private static MethodHandle downcall(String name, FunctionDescriptors function) {
        return RuntimeHelper.downcallThrow(LOOKUP.find(name), function);
    }

    private static MethodHandle downcall(String name, FunctionDescriptor function) {
        return RuntimeHelper.downcallThrow(LOOKUP.find(name), function);
    }

    private static MethodHandle downcallSafe(String name, FunctionDescriptors function) {
        return RuntimeHelper.downcallSafe(LOOKUP.find(name).orElse(MemorySegment.NULL), function);
    }

    private static MethodHandle downcallSafe(String name, FunctionDescriptor function) {
        return RuntimeHelper.downcallSafe(LOOKUP.find(name).orElse(MemorySegment.NULL), function);
    }

    static MemorySegment allocateString(SegmentAllocator allocator, String str) {
        if (OperatingSystem.current().isWindows()) return RuntimeHelper.allocateUtf16String(allocator, str);
        return allocator.allocateUtf8String(str);
    }

    static String getString(MemorySegment segment, long offset) {
        if (OperatingSystem.current().isWindows()) return RuntimeHelper.getUtf16String(segment, offset);
        return segment.getUtf8String(offset);
    }

    public static void nfreePathN(MemorySegment filePath) {
        try {
            NFD_FreePathN.invokeExact(filePath);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void freePathN(SegmentAllocator allocator, String filePath) {
        nfreePathN(allocateString(allocator, filePath));
    }

    public static NFDResult init() {
        try {
            return NFDResult.of((int) NFD_Init.invokeExact());
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void quit() {
        try {
            NFD_Quit.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static NFDResult nopenDialogN(MemorySegment outPath, MemorySegment filterList, int filterCount, MemorySegment defaultPath) {
        try {
            return NFDResult.of((int) NFD_OpenDialogN.invokeExact(outPath, filterList, filterCount, defaultPath));
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static NFDResult openDialogN(SegmentAllocator allocator, String[] outPath, NFDNFilterItem.Buffer filterList, String defaultPath) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = nopenDialogN(seg,
                filterList != null ? filterList.address() : MemorySegment.NULL,
                filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
                defaultPath != null ? allocateString(allocator, defaultPath) : MemorySegment.NULL);
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(ADDRESS.withTargetLayout(ADDRESS_UNALIGNED), 0);
                outPath[0] = getString(path, 0);
                nfreePathN(path);
            }
            return result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static NFDResult nopenDialogMultipleN(MemorySegment outPaths, MemorySegment filterList, int filterCount, MemorySegment defaultPath) {
        try {
            return NFDResult.of((int) NFD_OpenDialogMultipleN.invokeExact(outPaths, filterList, filterCount, defaultPath));
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static NFDResult openDialogMultipleN(SegmentAllocator allocator, MemorySegment outPaths, NFDNFilterItem.Buffer filterList, String defaultPath) {
        return nopenDialogMultipleN(outPaths,
            filterList != null ? filterList.address() : MemorySegment.NULL,
            filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
            defaultPath != null ? allocateString(allocator, defaultPath) : MemorySegment.NULL);
    }

    public static NFDResult nsaveDialogN(MemorySegment outPath, MemorySegment filterList, int filterCount, MemorySegment defaultPath, MemorySegment defaultName) {
        try {
            return NFDResult.of((int) NFD_SaveDialogN.invokeExact(outPath, filterList, filterCount, defaultPath, defaultName));
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static NFDResult saveDialogN(SegmentAllocator allocator, String[] outPath, NFDNFilterItem.Buffer filterList, String defaultPath, String defaultName) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = nsaveDialogN(seg,
                filterList != null ? filterList.address() : MemorySegment.NULL,
                filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
                defaultPath != null ? allocateString(allocator, defaultPath) : MemorySegment.NULL,
                defaultName != null ? allocateString(allocator, defaultName) : MemorySegment.NULL);
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(ADDRESS.withTargetLayout(ADDRESS_UNALIGNED), 0);
                outPath[0] = getString(path, 0);
                nfreePathN(path);
            }
            return result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static NFDResult npickFolderN(MemorySegment outPath, MemorySegment defaultPath) {
        try {
            return NFDResult.of((int) NFD_PickFolderN.invokeExact(outPath, defaultPath));
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static NFDResult pickFolderN(SegmentAllocator allocator, String[] outPath, String defaultPath) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = npickFolderN(seg, defaultPath != null ? allocateString(allocator, defaultPath) : MemorySegment.NULL);
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(ADDRESS.withTargetLayout(ADDRESS_UNALIGNED), 0);
                outPath[0] = getString(path, 0);
                nfreePathN(path);
            }
            return result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemorySegment ngetError() {
        try {
            return (MemorySegment) NFD_GetError.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String getError() {
        final MemorySegment seg = ngetError();
        return RuntimeHelper.isNullptr(seg) ? null : seg.getUtf8String(0);
    }

    public static void clearError() {
        try {
            NFD_ClearError.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
