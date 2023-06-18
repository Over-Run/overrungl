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

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.FunctionDescriptors;
import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;

/**
 * The Native File Dialog binding.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class NativeFileDialog {
    private static final SymbolLookup LOOKUP = RuntimeHelper.load("nativefiledialog", "nativefiledialog", "0.1.0");
    private static final MethodHandle
        NFD_OpenDialog = downcall("NFD_OpenDialog", PPPI),
        NFD_OpenDialogMultiple = downcall("NFD_OpenDialogMultiple", PPPI),
        NFD_SaveDialog = downcall("NFD_SaveDialog", PPPI),
        NFD_PickFolder = downcall("NFD_PickFolder", PPI),
        NFD_GetError = downcall("NFD_GetError", p),
        NFD_PathSet_GetCount = downcall("NFD_PathSet_GetCount", PJ),
        NFD_PathSet_GetPath = downcall("NFD_PathSet_GetPath", PJp),
        NFD_PathSet_Free = downcall("NFD_PathSet_Free", PV);
    public static final StructLayout PATH_SET_LAYOUT = MemoryLayout.structLayout(ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(JAVA_BYTE)).withName("buf"),
        ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(JAVA_LONG)).withName("indices"),
        JAVA_LONG.withName("count"));

    private static MethodHandle downcall(String name, FunctionDescriptors function) {
        return RuntimeHelper.downcallThrow(LOOKUP.find(name), function);
    }

    public static int nopenDialog(MemorySegment filterList, MemorySegment defaultPath, MemorySegment outPath) {
        try {
            return (int) NFD_OpenDialog.invokeExact(filterList, defaultPath, outPath);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static NFDResult openDialog(SegmentAllocator allocator, @Nullable String filterList, @Nullable String defaultPath, String[] outPath) {
        final MemorySegment seg = allocator.allocate(ADDRESS);
        final NFDResult result = NFDResult.of(nopenDialog(filterList == null ? MemorySegment.NULL : allocator.allocateUtf8String(filterList),
            defaultPath == null ? MemorySegment.NULL : allocator.allocateUtf8String(defaultPath),
            seg));
        if (result == NFDResult.OKAY) {
            outPath[0] = seg.get(RuntimeHelper.ADDRESS_UNBOUNDED, 0).getUtf8String(0);
        }
        return result;
    }

    public static int nopenDialogMultiple(MemorySegment filterList, MemorySegment defaultPath, MemorySegment outPaths) {
        try {
            return (int) NFD_OpenDialogMultiple.invokeExact(filterList, defaultPath, outPaths);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static NFDResult openDialogMultiple(SegmentAllocator allocator, @Nullable String filterList, @Nullable String defaultPath, MemorySegment outPaths) {
        return NFDResult.of(nopenDialogMultiple(filterList == null ? MemorySegment.NULL : allocator.allocateUtf8String(filterList),
            defaultPath == null ? MemorySegment.NULL : allocator.allocateUtf8String(defaultPath),
            outPaths));
    }

    public static int nsaveDialog(MemorySegment filterList, MemorySegment defaultPath, MemorySegment outPath) {
        try {
            return (int) NFD_SaveDialog.invokeExact(filterList, defaultPath, outPath);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static NFDResult saveDialog(SegmentAllocator allocator, @Nullable String filterList, @Nullable String defaultPath, String[] outPath) {
        final MemorySegment seg = allocator.allocate(ADDRESS);
        final NFDResult result = NFDResult.of(nsaveDialog(filterList == null ? MemorySegment.NULL : allocator.allocateUtf8String(filterList),
            defaultPath == null ? MemorySegment.NULL : allocator.allocateUtf8String(defaultPath),
            seg));
        if (result == NFDResult.OKAY) {
            outPath[0] = seg.get(RuntimeHelper.ADDRESS_UNBOUNDED, 0).getUtf8String(0);
        }
        return result;
    }

    public static int npickFolder(MemorySegment defaultPath, MemorySegment outPath) {
        try {
            return (int) NFD_PickFolder.invokeExact(defaultPath, outPath);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static NFDResult pickFolder(SegmentAllocator allocator, @Nullable String defaultPath, String[] outPath) {
        final MemorySegment seg = allocator.allocate(ADDRESS);
        final NFDResult result = NFDResult.of(npickFolder(defaultPath == null ? MemorySegment.NULL : allocator.allocateUtf8String(defaultPath),
            seg));
        if (result == NFDResult.OKAY) {
            outPath[0] = seg.get(RuntimeHelper.ADDRESS_UNBOUNDED, 0).getUtf8String(0);
        }
        return result;
    }

    public static MemorySegment ngetError() {
        try {
            return (MemorySegment) NFD_GetError.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String getError() {
        return ngetError().getUtf8String(0);
    }

    public static long pathSetGetCount(MemorySegment pathSet) {
        try {
            return (long) NFD_PathSet_GetCount.invokeExact(pathSet);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment npathSetGetPath(MemorySegment pathSet, long index) {
        try {
            return (MemorySegment) NFD_PathSet_GetPath.invokeExact(pathSet, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String pathSetGetPath(MemorySegment pathSet, long index) {
        return npathSetGetPath(pathSet, index).getUtf8String(0);
    }

    public static void pathSetFree(MemorySegment pathSet) {
        try {
            NFD_PathSet_Free.invokeExact(pathSet);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
