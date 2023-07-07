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
import org.overrun.gl.NativeType;
import org.overrun.gl.RuntimeHelper;
import org.overrun.gl.os.OperatingSystem;
import org.overrun.gl.util.MemoryStack;
import org.overrun.gl.util.value.Tuple2;

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
    private static final OperatingSystem os = OperatingSystem.current();
    private static final boolean isOsWin = os.isWindows();
    private static final boolean isOsWinOrApple = os.isWindows() || os.isMacOsX();
    public static final ValueLayout PATH_SET_SIZE;

    static {
        PATH_SET_SIZE = isOsWinOrApple ? JAVA_LONG : JAVA_INT;
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
        if (isOsWin) return RuntimeHelper.allocateUtf16LEString(allocator, str);
        return allocator.allocateUtf8String(str);
    }

    static String getString(MemorySegment segment, long offset) {
        if (isOsWin) return RuntimeHelper.getUtf16LEString(segment, offset);
        return segment.getUtf8String(offset);
    }

    public static void freePathN(@NativeType("nfdnchar_t*") MemorySegment filePath) {
        try {
            NFD_FreePathN.invokeExact(filePath);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
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

    public static NFDResult nopenDialogN(@NativeType("nfdnchar_t**") MemorySegment outPath, @NativeType("const nfdnfilteritem_t*") MemorySegment filterList, int filterCount, @NativeType("const nfdnchar_t*") MemorySegment defaultPath) {
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
                final MemorySegment path = seg.get(RuntimeHelper.ADDRESS_UNBOUNDED, 0);
                outPath[0] = getString(path, 0);
                freePathN(path);
            }
            return result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static NFDResult nopenDialogMultipleN(@NativeType("const nfdpathset_t**") MemorySegment outPaths, @NativeType("const nfdnfilteritem_t*") MemorySegment filterList, int filterCount, @NativeType("const nfdnchar_t*") MemorySegment defaultPath) {
        try {
            return NFDResult.of((int) NFD_OpenDialogMultipleN.invokeExact(outPaths, filterList, filterCount, defaultPath));
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static NFDResult openDialogMultipleN(SegmentAllocator allocator, @NativeType("const nfdpathset_t**") MemorySegment outPaths, NFDNFilterItem.Buffer filterList, String defaultPath) {
        return nopenDialogMultipleN(outPaths,
            filterList != null ? filterList.address() : MemorySegment.NULL,
            filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
            defaultPath != null ? allocateString(allocator, defaultPath) : MemorySegment.NULL);
    }

    public static NFDResult nsaveDialogN(@NativeType("nfdnchar_t**") MemorySegment outPath, @NativeType("const nfdnfilteritem_t*") MemorySegment filterList, int filterCount, @NativeType("const nfdnchar_t*") MemorySegment defaultPath, @NativeType("const nfdnchar_t*") MemorySegment defaultName) {
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
                final MemorySegment path = seg.get(RuntimeHelper.ADDRESS_UNBOUNDED, 0);
                outPath[0] = getString(path, 0);
                freePathN(path);
            }
            return result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static NFDResult npickFolderN(@NativeType("nfdnchar_t**") MemorySegment outPath, @NativeType("const nfdnchar_t*") MemorySegment defaultPath) {
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
                final MemorySegment path = seg.get(RuntimeHelper.ADDRESS_UNBOUNDED, 0);
                outPath[0] = getString(path, 0);
                freePathN(path);
            }
            return result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static @NativeType("const char*") MemorySegment ngetError() {
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

    public static NFDResult npathSetGetCount(@NativeType("const nfdpathset_t*") MemorySegment pathSet, @NativeType("nfdpathsetsize_t*") MemorySegment count) {
        try {
            return NFDResult.of((int) NFD_PathSet_GetCount.invokeExact(pathSet, count));
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static NFDResult pathSetGetCount(@NativeType("const nfdpathset_t*") MemorySegment pathSet, long[] count) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(PATH_SET_SIZE);
            final NFDResult result = npathSetGetCount(pathSet, seg);
            count[0] = switch (PATH_SET_SIZE) {
                case ValueLayout.OfLong layout -> seg.get(layout, 0);
                case ValueLayout.OfInt layout -> Integer.toUnsignedLong(seg.get(layout, 0));
                default -> throw new AssertionError("should not reach here");
            };
            return result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static Tuple2.OfObjLong<NFDResult> pathSetGetCount(@NativeType("const nfdpathset_t*") MemorySegment pathSet) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(PATH_SET_SIZE);
            final NFDResult result = npathSetGetCount(pathSet, seg);
            return new Tuple2.OfObjLong<>(result, switch (PATH_SET_SIZE) {
                case ValueLayout.OfLong layout -> seg.get(layout, 0);
                case ValueLayout.OfInt layout -> Integer.toUnsignedLong(seg.get(layout, 0));
                default -> throw new AssertionError("should not reach here");
            });
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static NFDResult npathSetGetPathN(@NativeType("const nfdpathset_t*") MemorySegment pathSet, long index, @NativeType("nfdnchar_t**") MemorySegment outPath) {
        try {
            return switch (PATH_SET_SIZE) {
                case OfLong _ -> NFDResult.of((int) NFD_PathSet_GetPathN.invokeExact(pathSet, index, outPath));
                case OfInt _ ->
                    NFDResult.of((int) NFD_PathSet_GetPathN.invokeExact(pathSet, Math.toIntExact(index), outPath));
                default -> throw new AssertionError("should not reach here");
            };
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static NFDResult pathSetGetPathN(@NativeType("const nfdpathset_t*") MemorySegment pathSet, long index, String[] outPath) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = npathSetGetPathN(pathSet, index, seg);
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(RuntimeHelper.ADDRESS_UNBOUNDED, 0);
                outPath[0] = getString(path, 0);
                pathSetFreePathN(path);
            }
            return result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void pathSetFreePathN(@NativeType("const nfdnchar_t*") MemorySegment filePath) {
        if (isOsWinOrApple) {
            freePathN(filePath);
        } else try {
            NFD_PathSet_FreePathN.invokeExact(filePath);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static NFDResult pathSetGetEnum(@NativeType("const nfdpathset_t*") MemorySegment pathSet, @NativeType("nfdpathsetenum_t*") MemorySegment outEnumerator) {
        try {
            return NFDResult.of((int) NFD_PathSet_GetEnum.invokeExact(pathSet, outEnumerator));
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pathSetFreeEnum(@NativeType("nfdpathsetenum_t*") MemorySegment enumerator) {
        try {
            NFD_PathSet_FreeEnum.invokeExact(enumerator);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static NFDResult npathSetEnumNextN(@NativeType("nfdpathsetenum_t*") MemorySegment enumerator, @NativeType("nfdnchar_t**") MemorySegment outPath) {
        try {
            return NFDResult.of((int) NFD_PathSet_EnumNextN.invokeExact(enumerator, outPath));
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static NFDResult pathSetEnumNextN(@NativeType("nfdpathsetenum_t*") MemorySegment enumerator, String[] outPath) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = npathSetEnumNextN(enumerator, seg);
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(RuntimeHelper.ADDRESS_UNBOUNDED, 0);
                if (!RuntimeHelper.isNullptr(path)) {
                    outPath[0] = getString(path, 0);
                    pathSetFreePathN(path);
                }
            }
            return result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void pathSetFree(@NativeType("const nfdpathset_t*") MemorySegment pathSet) {
        try {
            NFD_PathSet_Free.invokeExact(pathSet);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void freePathU8(@NativeType("nfdu8char_t*") MemorySegment filePath) {
        if (isOsWin) {
            try {
                NFD_FreePathU8.invokeExact(filePath);
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else freePathN(filePath);
    }

    public static NFDResult nopenDialogU8(@NativeType("nfdu8char_t**") MemorySegment outPath, @NativeType("const nfdu8filteritem_t*") MemorySegment filterList, int filterCount, @NativeType("const nfdu8char_t*") MemorySegment defaultPath) {
        if (isOsWin) {
            try {
                return NFDResult.of((int) NFD_OpenDialogU8.invokeExact(outPath, filterList, filterCount, defaultPath));
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else return nopenDialogN(outPath, filterList, filterCount, defaultPath);
    }

    public static NFDResult openDialogU8(SegmentAllocator allocator, String[] outPath, NFDU8FilterItem.Buffer filterList, String defaultPath) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = nopenDialogU8(seg,
                filterList != null ? filterList.address() : MemorySegment.NULL,
                filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
                defaultPath != null ? allocator.allocateUtf8String(defaultPath) : MemorySegment.NULL);
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(RuntimeHelper.ADDRESS_UNBOUNDED, 0);
                outPath[0] = path.getUtf8String(0);
                freePathU8(path);
            }
            return result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static NFDResult nopenDialogMultipleU8(@NativeType("const nfdpathset_t**") MemorySegment outPaths, @NativeType("const nfdu8filteritem_t*") MemorySegment filterList, int filterCount, @NativeType("const nfdu8char_t*") MemorySegment defaultPath) {
        if (isOsWin) {
            try {
                return NFDResult.of((int) NFD_OpenDialogMultipleU8.invokeExact(outPaths, filterList, filterCount, defaultPath));
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else return nopenDialogMultipleN(outPaths, filterList, filterCount, defaultPath);
    }

    public static NFDResult openDialogMultipleU8(SegmentAllocator allocator, @NativeType("const nfdpathset_t**") MemorySegment outPaths, NFDU8FilterItem.Buffer filterList, String defaultPath) {
        return nopenDialogMultipleU8(outPaths,
            filterList != null ? filterList.address() : MemorySegment.NULL,
            filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
            defaultPath != null ? allocator.allocateUtf8String(defaultPath) : MemorySegment.NULL);
    }

    public static NFDResult nsaveDialogU8(@NativeType("nfdu8char_t**") MemorySegment outPath, @NativeType("const nfdu8filteritem_t*") MemorySegment filterList, int filterCount, @NativeType("const nfdu8char_t*") MemorySegment defaultPath, @NativeType("const nfdu8char_t*") MemorySegment defaultName) {
        if (isOsWin) {
            try {
                return NFDResult.of((int) NFD_SaveDialogU8.invokeExact(outPath, filterList, filterCount, defaultPath, defaultName));
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else return nsaveDialogN(outPath, filterList, filterCount, defaultPath, defaultName);
    }

    public static NFDResult saveDialogU8(SegmentAllocator allocator, String[] outPath, NFDU8FilterItem.Buffer filterList, String defaultPath, String defaultName) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = nsaveDialogU8(seg,
                filterList != null ? filterList.address() : MemorySegment.NULL,
                filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
                defaultPath != null ? allocator.allocateUtf8String(defaultPath) : MemorySegment.NULL,
                defaultName != null ? allocator.allocateUtf8String(defaultName) : MemorySegment.NULL);
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(RuntimeHelper.ADDRESS_UNBOUNDED, 0);
                outPath[0] = path.getUtf8String(0);
                freePathU8(path);
            }
            return result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static NFDResult npickFolderU8(@NativeType("nfdu8char_t**") MemorySegment outPath, @NativeType("const nfdu8char_t*") MemorySegment defaultPath) {
        if (isOsWin) {
            try {
                return NFDResult.of((int) NFD_PickFolderU8.invokeExact(outPath, defaultPath));
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else return npickFolderN(outPath, defaultPath);
    }

    public static NFDResult pickFolderU8(SegmentAllocator allocator, String[] outPath, String defaultPath) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = npickFolderU8(seg, defaultPath != null ? allocator.allocateUtf8String(defaultPath) : MemorySegment.NULL);
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(RuntimeHelper.ADDRESS_UNBOUNDED, 0);
                outPath[0] = path.getUtf8String(0);
                freePathU8(path);
            }
            return result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static NFDResult npathSetGetPathU8(@NativeType("const nfdpathset_t*") MemorySegment pathSet, long index, @NativeType("nfdu8char_t**") MemorySegment outPath) {
        if (isOsWin) {
            try {
                return switch (PATH_SET_SIZE) {
                    case OfLong _ -> NFDResult.of((int) NFD_PathSet_GetPathU8.invokeExact(pathSet, index, outPath));
                    case OfInt _ ->
                        NFDResult.of((int) NFD_PathSet_GetPathU8.invokeExact(pathSet, Math.toIntExact(index), outPath));
                    default -> throw new AssertionError("should not reach here");
                };
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else return npathSetGetPathN(pathSet, index, outPath);
    }

    public static NFDResult pathSetGetPathU8(@NativeType("const nfdpathset_t*") MemorySegment pathSet, long index, String[] outPath) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = npathSetGetPathU8(pathSet, index, seg);
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(RuntimeHelper.ADDRESS_UNBOUNDED, 0);
                outPath[0] = path.getUtf8String(0);
                pathSetFreePathU8(path);
            }
            return result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static NFDResult npathSetEnumNextU8(@NativeType("nfdpathsetenum_t*") MemorySegment enumerator, @NativeType("nfdu8char_t**") MemorySegment outPath) {
        if (isOsWin) {
            try {
                return NFDResult.of((int) NFD_PathSet_EnumNextU8.invokeExact(enumerator, outPath));
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else return npathSetEnumNextN(enumerator, outPath);
    }

    public static NFDResult pathSetEnumNextU8(@NativeType("nfdpathsetenum_t*") MemorySegment enumerator, String[] outPath) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = npathSetEnumNextU8(enumerator, seg);
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(RuntimeHelper.ADDRESS_UNBOUNDED, 0);
                if (!RuntimeHelper.isNullptr(path)) {
                    outPath[0] = path.getUtf8String(0);
                    pathSetFreePathU8(path);
                }
            }
            return result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void pathSetFreePathU8(MemorySegment filePath) {
        if (isOsWin) freePathU8(filePath);
        else pathSetFreePathN(filePath);
    }
}
