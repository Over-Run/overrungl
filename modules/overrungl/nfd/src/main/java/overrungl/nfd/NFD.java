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

package overrungl.nfd;

import overrungl.FunctionDescriptors;
import overrungl.NativeType;
import overrungl.RuntimeHelper;
import overrungl.os.OperatingSystem;
import overrungl.util.MemoryStack;
import overrungl.util.value.Tuple2;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;

/**
 * <h2>Native File Dialog Extended</h2>
 * <p>
 * A small C library with that portably invokes native file open, folder select and file save dialogs.
 * Write dialog code once and have it pop up native dialogs on all supported platforms.
 * Avoid linking large dependencies like wxWidgets and Qt.
 * <p>
 * Features:
 * <ul>
 *     <li>Supports Windows, MacOS, and Linux</li>
 *     <li>Friendly names for filters (e.g. {@code Java Source files (*.java;*.kt)} instead of {@code (*.java;*.kt)}) on platforms that support it</li>
 *     <li>Automatically append file extension on platforms where users expect it</li>
 *     <li>Support for setting a default folder path</li>
 *     <li>Support for setting a default file name (e.g. {@code Untitled.java})</li>
 *     <li>Consistent UTF-8 support on all platforms</li>
 *     <li>Native character set (UTF-16LE) support on Windows</li>
 *     <li>Initialization and de-initialization of platform library (e.g. COM (Windows) / GTK (Linux GTK) / D-Bus (Linux portal)) decoupled from dialog functions, so applications can choose when to initialize/de-initialize</li>
 *     <li>Multiple file selection support (for file open dialog)</li>
 *     <li>No third party dependencies</li>
 * </ul>
 *
 * <h3>Basic Usages</h3>
 * {@snippet lang = java:
 * import overrungl.util.value.Pair;
 * void main() {
 *     NFD.init();
 *
 *     try (MemoryStack stack = MemoryStack.stackPush()) {
 *         String[] outPath = new String[1];
 *         var filterItem = NFDNFilterItem.create(stack,
 *             new Pair<>("Source code", "java"),
 *             new Pair<>("Image file", "png,jpg"));
 *         var result = NFD.openDialogN(outPath, filterItem, null);
 *         switch (result) {
 *             case ERROR -> System.err.println("Error: " + NFD.getError());
 *             case OKAY -> System.out.println("Success! " + outPath[0]);
 *             case CANCEL -> System.out.println("User pressed cancel.");
 *         }
 *     }
 *
 *     NFD.quit();
 * }}
 *
 * <h3>File Filter Syntax</h3>
 * Files can be filtered by file extension groups:
 * <pre>{@code
 * var filterItem = NFDNFilterItem.create(allocator,
 *     new Pair<>("Source code", "java"),
 *     new Pair<>("Image file", "png,jpg"));}</pre>
 * <p>
 * A file filter is a pair of strings comprising the friendly name and the specification
 * (multiple file extensions are comma-separated).
 * <p>
 * A list of file filters can be passed as an argument when invoking the library.
 * <p>
 * A wildcard filter is always added to every dialog.
 * <p>
 * <i>Note: On MacOS, the file dialogs do not have friendly names and there is no way to switch between filters, so the filter specifications are combined (e.g. "java,kt,png,jpg"). The filter specification is also never explicitly shown to the user. This is usual MacOS behaviour and users expect it.</i>
 * <p>
 * <i>Note 2: You must ensure that the specification string is non-empty and that every file extension has at least one character. Otherwise, bad things might ensue (i.e. undefined behaviour).</i>
 * <p>
 * <i>Note 3: On Linux, the file extension is appended (if missing) when the user presses down the "Save" button. The appended file extension will remain visible to the user, even if an overwrite prompt is shown and the user then presses "Cancel".</i>
 * <p>
 * <i>Note 4: On Windows, the default folder parameter is only used if there is no recently used folder available. Otherwise, the default folder will be the folder that was last used. Internally, the Windows implementation calls <a href="https://docs.microsoft.com/en-us/windows/desktop/api/shobjidl_core/nf-shobjidl_core-ifiledialog-setdefaultfolder">IFileDialog::SetDefaultFolder(IShellItem)</a>. This is usual Windows behaviour and users expect it.</i>
 *
 * <h3>Iterating Over PathSets</h3>
 * A file open dialog that supports multiple selection produces a PathSet,
 * which is a thin abstraction over the platform-specific collection.
 * There are two ways to iterate over a PathSet:
 *
 * <h4>Accessing by index</h4>
 * This method does array-like access on the PathSet, and is the easiest to use.
 * However, on certain platforms (Linux, and possibly Windows),
 * it takes O(N²) time in total to iterate the entire PathSet,
 * because the underlying platform-specific implementation uses a linked list.
 *
 * <h4>Using an enumerator (experimental)</h4>
 * This method uses an enumerator object to iterate the paths in the PathSet.
 * It is guaranteed to take O(N) time in total to iterate the entire PathSet.
 * <p>
 * See {@link NFDEnumerator}.
 * <p>
 * This API is experimental, and subject to change.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class NFD {
    private static final SymbolLookup LOOKUP = RuntimeHelper.load("nfd", "nfd", "0.1.0");
    private static final OperatingSystem os = OperatingSystem.current();
    private static final boolean isOsWin = os.isWindows();
    private static final boolean isOsWinOrApple = os.isWindows() || os.isMacOsX();
    /**
     * The type of the path-set size ({@code long} for Windows and Mac OS X, {@code int} for others).
     */
    public static final ValueLayout PATH_SET_SIZE;

    static {
        PATH_SET_SIZE = isOsWinOrApple ? JAVA_LONG : JAVA_INT;
    }

    private static final MethodHandle
        NFD_FreePathN = downcallTrivial("NFD_FreePathN", PV),
        NFD_Init = downcall("NFD_Init", I),
        NFD_Quit = downcall("NFD_Quit", V),
        NFD_OpenDialogN = downcall("NFD_OpenDialogN", PPIPI),
        NFD_OpenDialogMultipleN = downcall("NFD_OpenDialogMultipleN", PPIPI),
        NFD_SaveDialogN = downcall("NFD_SaveDialogN", PPIPPI),
        NFD_PickFolderN = downcall("NFD_PickFolderN", PPI),
        NFD_GetError = downcallTrivial("NFD_GetError", p),
        NFD_ClearError = downcallTrivial("NFD_ClearError", V),
        NFD_PathSet_GetCount = downcall("NFD_PathSet_GetCount", PPI),
        NFD_PathSet_GetPathN = downcall("NFD_PathSet_GetPathN", FunctionDescriptor.of(JAVA_INT, ADDRESS, PATH_SET_SIZE, ADDRESS)),
        NFD_PathSet_FreePathN = downcallSafeTrivial("NFD_PathSet_FreePathN", PV),
        NFD_PathSet_GetEnum = downcall("NFD_PathSet_GetEnum", PPI),
        NFD_PathSet_FreeEnum = downcall("NFD_PathSet_FreeEnum", PV),
        NFD_PathSet_EnumNextN = downcall("NFD_PathSet_EnumNextN", PPI),
        NFD_PathSet_Free = downcallTrivial("NFD_PathSet_Free", PV),
        NFD_FreePathU8 = downcallSafeTrivial("NFD_FreePathU8", PV),
        NFD_OpenDialogU8 = downcallSafe("NFD_OpenDialogU8", PPIPI),
        NFD_OpenDialogMultipleU8 = downcallSafe("NFD_OpenDialogMultipleU8", PPIPI),
        NFD_SaveDialogU8 = downcallSafe("NFD_SaveDialogU8", PPIPPI),
        NFD_PickFolderU8 = downcallSafe("NFD_PickFolderU8", PPI),
        NFD_PathSet_GetPathU8 = downcallSafe("NFD_PathSet_GetPathU8", FunctionDescriptor.of(JAVA_INT, ADDRESS, PATH_SET_SIZE, ADDRESS)),
        NFD_PathSet_EnumNextU8 = downcallSafe("NFD_PathSet_EnumNextU8", PPI);

    private NFD() {
        //no instance
    }

    private static MethodHandle downcall(String name, FunctionDescriptors function, Linker.Option... options) {
        return RuntimeHelper.downcallThrow(LOOKUP.find(name), function, options);
    }

    private static MethodHandle downcallTrivial(String name, FunctionDescriptors function) {
        return downcall(name, function, Linker.Option.isTrivial());
    }

    private static MethodHandle downcall(String name, FunctionDescriptor function) {
        return RuntimeHelper.downcallThrow(LOOKUP.find(name), function);
    }

    private static MethodHandle downcallSafe(String name, FunctionDescriptors function, Linker.Option... options) {
        return RuntimeHelper.downcallSafe(LOOKUP.find(name).orElse(MemorySegment.NULL), function, options);
    }

    private static MethodHandle downcallSafeTrivial(String name, FunctionDescriptors function) {
        return downcallSafe(name, function, Linker.Option.isTrivial());
    }

    private static MethodHandle downcallSafe(String name, FunctionDescriptor function) {
        return RuntimeHelper.downcallSafe(LOOKUP.find(name).orElse(MemorySegment.NULL), function);
    }

    static MemorySegment allocateString(String str) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            if (isOsWin) return RuntimeHelper.allocateUtf16LEString(stack, str);
            return stack.allocateUtf8String(str);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    static String getString(MemorySegment segment, long offset) {
        if (isOsWin) return RuntimeHelper.getUtf16LEString(segment, offset);
        return segment.getUtf8String(offset);
    }

    /**
     * free a file path that was returned by the dialogs
     * <p>
     * Note: use {@code NFD::pathSetFreePath} to free path from path-set instead of this function
     *
     * @param filePath the file path
     */
    public static void freePathN(@NativeType("nfdnchar_t*") MemorySegment filePath) {
        try {
            NFD_FreePathN.invokeExact(filePath);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * initialize NFD - call this for every thread that might use NFD, before calling any other NFD
     * functions on that thread
     *
     * @return the result
     */
    public static NFDResult init() {
        try {
            return NFDResult.of((int) NFD_Init.invokeExact());
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * call this to de-initialize NFD, if {@link #init} returned {@link NFDResult#OKAY}
     */
    public static void quit() {
        try {
            NFD_Quit.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * single file open dialog
     *
     * @param outPath     It is the caller's responsibility to free <i>{@code *outPath}</i>
     *                    via {@link #freePathN} if this function returns {@link NFDResult#OKAY}
     * @param filterList  the filter list
     * @param filterCount If filterCount is zero, filterList is ignored (you can use NULL)
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     */
    public static NFDResult nopenDialogN(@NativeType("nfdnchar_t**") MemorySegment outPath, @NativeType("const nfdnfilteritem_t*") MemorySegment filterList, int filterCount, @NativeType("const nfdnchar_t*") MemorySegment defaultPath) {
        try {
            return NFDResult.of((int) NFD_OpenDialogN.invokeExact(outPath, filterList, filterCount, defaultPath));
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * single file open dialog
     *
     * @param outPath     the out path
     * @param filterList  the filter list
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     * @see #nopenDialogN(MemorySegment, MemorySegment, int, MemorySegment) nopenDialogN
     */
    public static NFDResult openDialogN(String[] outPath, NFDNFilterItem.Buffer filterList, String defaultPath) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = nopenDialogN(seg,
                filterList != null ? filterList.address() : MemorySegment.NULL,
                filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
                defaultPath != null ? allocateString(defaultPath) : MemorySegment.NULL);
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

    /**
     * multiple file open dialog
     *
     * @param outPaths    It is the caller's responsibility to free <i>{@code *outPaths}</i>
     *                    via {@link #pathSetFree} if this function returns {@link NFDResult#OKAY}
     * @param filterList  the filter list
     * @param filterCount If filterCount is zero, filterList is ignored (you can use NULL)
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     */
    public static NFDResult nopenDialogMultipleN(@NativeType("const nfdpathset_t**") MemorySegment outPaths, @NativeType("const nfdnfilteritem_t*") MemorySegment filterList, int filterCount, @NativeType("const nfdnchar_t*") MemorySegment defaultPath) {
        try {
            return NFDResult.of((int) NFD_OpenDialogMultipleN.invokeExact(outPaths, filterList, filterCount, defaultPath));
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * multiple file open dialog
     *
     * @param outPaths    It is the caller's responsibility to free <i>{@code *outPaths}</i>
     *                    via {@link #pathSetFree} if this function returns {@link NFDResult#OKAY}
     * @param filterList  the filter list
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     * @see #nopenDialogMultipleN(MemorySegment, MemorySegment, int, MemorySegment) nopenDialogMultipleN
     */
    public static NFDResult openDialogMultipleN(@NativeType("const nfdpathset_t**") MemorySegment outPaths, NFDNFilterItem.Buffer filterList, String defaultPath) {
        return nopenDialogMultipleN(outPaths,
            filterList != null ? filterList.address() : MemorySegment.NULL,
            filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
            defaultPath != null ? allocateString(defaultPath) : MemorySegment.NULL);
    }

    /**
     * save dialog
     *
     * @param outPath     It is the caller's responsibility to free <i>{@code *outPath}</i>
     *                    via {@link #freePathN} if this function returns {@link NFDResult#OKAY}
     * @param filterList  the filter list
     * @param filterCount If filterCount is zero, filterList is ignored (you can use NULL)
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @param defaultName the default name of the file
     * @return the result
     */
    public static NFDResult nsaveDialogN(@NativeType("nfdnchar_t**") MemorySegment outPath, @NativeType("const nfdnfilteritem_t*") MemorySegment filterList, int filterCount, @NativeType("const nfdnchar_t*") MemorySegment defaultPath, @NativeType("const nfdnchar_t*") MemorySegment defaultName) {
        try {
            return NFDResult.of((int) NFD_SaveDialogN.invokeExact(outPath, filterList, filterCount, defaultPath, defaultName));
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * save dialog
     *
     * @param outPath     the out path
     * @param filterList  the filter list
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @param defaultName the default name of the file
     * @return the result
     * @see #nopenDialogMultipleN(MemorySegment, MemorySegment, int, MemorySegment) nopenDialogMultipleN
     */
    public static NFDResult saveDialogN(String[] outPath, NFDNFilterItem.Buffer filterList, String defaultPath, String defaultName) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = nsaveDialogN(seg,
                filterList != null ? filterList.address() : MemorySegment.NULL,
                filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
                defaultPath != null ? allocateString(defaultPath) : MemorySegment.NULL,
                defaultName != null ? allocateString(defaultName) : MemorySegment.NULL);
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

    /**
     * select folder dialog
     *
     * @param outPath     It is the caller's responsibility to free <i>{@code *outPath}</i>
     *                    via {@link #freePathN} if this function returns {@link NFDResult#OKAY}
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     */
    public static NFDResult npickFolderN(@NativeType("nfdnchar_t**") MemorySegment outPath, @NativeType("const nfdnchar_t*") MemorySegment defaultPath) {
        try {
            return NFDResult.of((int) NFD_PickFolderN.invokeExact(outPath, defaultPath));
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * select folder dialog
     *
     * @param outPath     the out path
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     * @see #npickFolderN(MemorySegment, MemorySegment) npickFolderN
     */
    public static NFDResult pickFolderN(String[] outPath, String defaultPath) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = npickFolderN(seg, defaultPath != null ? allocateString(defaultPath) : MemorySegment.NULL);
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

    /**
     * Get last error -- set when {@link NFDResult} returns {@link NFDResult#ERROR}
     * <p>
     * The memory is owned by NFD and should not be freed by user code.
     * <p>
     * This is <b>always</b> ASCII printable characters, so it can be interpreted as UTF-8 without any conversion.
     *
     * @return the last error that was set, or NULL if there is no error.
     */
    public static @NativeType("const char*") MemorySegment ngetError() {
        try {
            return (MemorySegment) NFD_GetError.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Get last error -- set when {@link NFDResult} returns {@link NFDResult#ERROR}
     *
     * @return the last error that was set, or NULL if there is no error.
     * @see #ngetError() ngetError
     */
    public static String getError() {
        final MemorySegment seg = ngetError();
        return RuntimeHelper.isNullptr(seg) ? null : seg.getUtf8String(0);
    }

    /**
     * clear the error
     */
    public static void clearError() {
        try {
            NFD_ClearError.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Gets the number of entries stored in pathSet
     * <p>
     * note that some paths might be invalid (NFD_ERROR will be returned by NFD_PathSet_GetPath),
     * so we might not actually have this number of usable paths
     *
     * @param pathSet the path-set
     * @param count   the count
     * @return the result
     */
    public static NFDResult npathSetGetCount(@NativeType("const nfdpathset_t*") MemorySegment pathSet, @NativeType("nfdpathsetsize_t*") MemorySegment count) {
        try {
            return NFDResult.of((int) NFD_PathSet_GetCount.invokeExact(pathSet, count));
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Gets the number of entries stored in pathSet
     *
     * @param pathSet the path-set
     * @param count   the count
     * @return the result
     * @see #npathSetGetCount(MemorySegment, MemorySegment) npathSetGetCount
     */
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

    /**
     * Gets the number of entries stored in pathSet
     *
     * @param pathSet the path-set
     * @return the result and the count
     * @see #npathSetGetCount(MemorySegment, MemorySegment) npathSetGetCount
     */
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

    /**
     * Gets the UTF-8 path at offset index
     *
     * @param pathSet the path-set
     * @param index   the index
     * @param outPath It is the caller's responsibility to free <i>{@code *outPath}</i>
     *                via {@link #pathSetFreePathN} if this function returns {@link NFDResult#OKAY}
     * @return the result
     */
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

    /**
     * Gets the UTF-8 path at offset index
     *
     * @param pathSet the path-set
     * @param index   the index
     * @param outPath the out path
     * @return the result
     * @see #npathSetGetPathN(MemorySegment, long, MemorySegment) npathSetGetPathN
     */
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

    /**
     * Free the path gotten by {@link #pathSetGetPathN}
     *
     * @param filePath the path
     */
    public static void pathSetFreePathN(@NativeType("const nfdnchar_t*") MemorySegment filePath) {
        if (isOsWinOrApple) {
            freePathN(filePath);
        } else try {
            NFD_PathSet_FreePathN.invokeExact(filePath);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Gets an enumerator of the path set.
     *
     * @param pathSet       the path set
     * @param outEnumerator It is the caller's responsibility to free <i>{@code enumerator}</i>
     *                      via {@link #pathSetFreeEnum} if this function returns {@link NFDResult#OKAY},
     *                      and it should be freed before freeing the path-set.
     * @return the result
     */
    public static NFDResult pathSetGetEnum(@NativeType("const nfdpathset_t*") MemorySegment pathSet, @NativeType("nfdpathsetenum_t*") MemorySegment outEnumerator) {
        try {
            return NFDResult.of((int) NFD_PathSet_GetEnum.invokeExact(pathSet, outEnumerator));
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Frees an enumerator of the path set.
     *
     * @param enumerator the enumerator
     */
    public static void pathSetFreeEnum(@NativeType("nfdpathsetenum_t*") MemorySegment enumerator) {
        try {
            NFD_PathSet_FreeEnum.invokeExact(enumerator);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Gets the next item from the path set enumerator.
     * <p>
     * If there are no more items, then *outPaths will be set to NULL.
     *
     * @param enumerator the enumerator
     * @param outPath    It is the caller's responsibility
     *                   to free <i>{@code *outPath}</i> via {@link #pathSetFreePathN}
     *                   if this function returns {@link NFDResult#OKAY} and <i>{@code *outPath}</i> is not null
     * @return the result
     */
    public static NFDResult npathSetEnumNextN(@NativeType("nfdpathsetenum_t*") MemorySegment enumerator, @NativeType("nfdnchar_t**") MemorySegment outPath) {
        try {
            return NFDResult.of((int) NFD_PathSet_EnumNextN.invokeExact(enumerator, outPath));
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Gets the next item from the path set enumerator.
     *
     * @param enumerator the enumerator
     * @param outPath    the out path
     * @return the result
     * @see #npathSetEnumNextN(MemorySegment, MemorySegment) npathSetEnumNextN
     */
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

    /**
     * Free the pathSet
     *
     * @param pathSet the pathSet
     */
    public static void pathSetFree(@NativeType("const nfdpathset_t*") MemorySegment pathSet) {
        try {
            NFD_PathSet_Free.invokeExact(pathSet);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * free a file path that was returned
     *
     * @param filePath the file path
     */
    public static void freePathU8(@NativeType("nfdu8char_t*") MemorySegment filePath) {
        if (isOsWin) {
            try {
                NFD_FreePathU8.invokeExact(filePath);
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else freePathN(filePath);
    }

    /**
     * single file open dialog
     *
     * @param outPath     It is the caller's responsibility to free <i>{@code *outPath}</i>
     *                    via {@link #freePathU8} if this function returns {@link NFDResult#OKAY}
     * @param filterList  the filter list
     * @param filterCount If filterCount is zero, filterList is ignored (you can use NULL)
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     */
    public static NFDResult nopenDialogU8(@NativeType("nfdu8char_t**") MemorySegment outPath, @NativeType("const nfdu8filteritem_t*") MemorySegment filterList, int filterCount, @NativeType("const nfdu8char_t*") MemorySegment defaultPath) {
        if (isOsWin) {
            try {
                return NFDResult.of((int) NFD_OpenDialogU8.invokeExact(outPath, filterList, filterCount, defaultPath));
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else return nopenDialogN(outPath, filterList, filterCount, defaultPath);
    }

    /**
     * single file open dialog
     *
     * @param outPath     the out path
     * @param filterList  the filter list
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     * @see #nopenDialogU8(MemorySegment, MemorySegment, int, MemorySegment) nopenDialogU8
     */
    public static NFDResult openDialogU8(String[] outPath, NFDU8FilterItem.Buffer filterList, String defaultPath) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = nopenDialogU8(seg,
                filterList != null ? filterList.address() : MemorySegment.NULL,
                filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
                defaultPath != null ? stack.allocateUtf8String(defaultPath) : MemorySegment.NULL);
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

    /**
     * multiple file open dialog
     *
     * @param outPaths    It is the caller's responsibility to free <i>{@code *outPaths}</i>
     *                    via {@link #pathSetFree} if this function returns {@link NFDResult#OKAY}
     * @param filterList  the filter list
     * @param filterCount If filterCount is zero, filterList is ignored (you can use NULL)
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     */
    public static NFDResult nopenDialogMultipleU8(@NativeType("const nfdpathset_t**") MemorySegment outPaths, @NativeType("const nfdu8filteritem_t*") MemorySegment filterList, int filterCount, @NativeType("const nfdu8char_t*") MemorySegment defaultPath) {
        if (isOsWin) {
            try {
                return NFDResult.of((int) NFD_OpenDialogMultipleU8.invokeExact(outPaths, filterList, filterCount, defaultPath));
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else return nopenDialogMultipleN(outPaths, filterList, filterCount, defaultPath);
    }

    /**
     * multiple file open dialog
     *
     * @param outPaths    It is the caller's responsibility to free <i>{@code *outPaths}</i>
     *                    via {@link #pathSetFree} if this function returns {@link NFDResult#OKAY}
     * @param filterList  the filter list
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     * @see #nopenDialogMultipleU8(MemorySegment, MemorySegment, int, MemorySegment) nopenDialogMultipleU8
     */
    public static NFDResult openDialogMultipleU8(@NativeType("const nfdpathset_t**") MemorySegment outPaths, NFDU8FilterItem.Buffer filterList, String defaultPath) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            return nopenDialogMultipleU8(outPaths,
                filterList != null ? filterList.address() : MemorySegment.NULL,
                filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
                defaultPath != null ? stack.allocateUtf8String(defaultPath) : MemorySegment.NULL);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * save dialog
     *
     * @param outPath     It is the caller's responsibility to free <i>{@code *outPath}</i>
     *                    via {@link #freePathU8} if this function returns {@link NFDResult#OKAY}
     * @param filterList  the filter list
     * @param filterCount If filterCount is zero, filterList is ignored (you can use NULL)
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @param defaultName the default name of the file
     * @return the result
     */
    public static NFDResult nsaveDialogU8(@NativeType("nfdu8char_t**") MemorySegment outPath, @NativeType("const nfdu8filteritem_t*") MemorySegment filterList, int filterCount, @NativeType("const nfdu8char_t*") MemorySegment defaultPath, @NativeType("const nfdu8char_t*") MemorySegment defaultName) {
        if (isOsWin) {
            try {
                return NFDResult.of((int) NFD_SaveDialogU8.invokeExact(outPath, filterList, filterCount, defaultPath, defaultName));
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else return nsaveDialogN(outPath, filterList, filterCount, defaultPath, defaultName);
    }

    /**
     * save dialog
     *
     * @param outPath     the out path
     * @param filterList  the filter list
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @param defaultName the default name of the file
     * @return the result
     * @see #nopenDialogMultipleU8(MemorySegment, MemorySegment, int, MemorySegment) nopenDialogMultipleU8
     */
    public static NFDResult saveDialogU8(String[] outPath, NFDU8FilterItem.Buffer filterList, String defaultPath, String defaultName) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = nsaveDialogU8(seg,
                filterList != null ? filterList.address() : MemorySegment.NULL,
                filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
                defaultPath != null ? stack.allocateUtf8String(defaultPath) : MemorySegment.NULL,
                defaultName != null ? stack.allocateUtf8String(defaultName) : MemorySegment.NULL);
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

    /**
     * select folder dialog
     *
     * @param outPath     It is the caller's responsibility to free <i>{@code *outPath}</i>
     *                    via {@link #freePathU8} if this function returns {@link NFDResult#OKAY}
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     */
    public static NFDResult npickFolderU8(@NativeType("nfdu8char_t**") MemorySegment outPath, @NativeType("const nfdu8char_t*") MemorySegment defaultPath) {
        if (isOsWin) {
            try {
                return NFDResult.of((int) NFD_PickFolderU8.invokeExact(outPath, defaultPath));
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else return npickFolderN(outPath, defaultPath);
    }

    /**
     * select folder dialog
     *
     * @param outPath     the out path
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     * @see #npickFolderU8(MemorySegment, MemorySegment) npickFolderU8
     */
    public static NFDResult pickFolderU8(String[] outPath, String defaultPath) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(ADDRESS);
            final NFDResult result = npickFolderU8(seg, defaultPath != null ? stack.allocateUtf8String(defaultPath) : MemorySegment.NULL);
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

    /**
     * Gets the UTF-8 path at offset index
     *
     * @param pathSet the path-set
     * @param index   the index
     * @param outPath It is the caller's responsibility to free <i>{@code *outPath}</i>
     *                via {@link #pathSetFreePathU8} if this function returns {@link NFDResult#OKAY}
     * @return the result
     */
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

    /**
     * Gets the UTF-8 path at offset index
     *
     * @param pathSet the path-set
     * @param index   the index
     * @param outPath the out path
     * @return the result
     * @see #npathSetGetPathU8(MemorySegment, long, MemorySegment) npathSetGetPathU8
     */
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

    /**
     * Gets the next item from the path set enumerator.
     * <p>
     * If there are no more items, then *outPaths will be set to NULL.
     *
     * @param enumerator the enumerator
     * @param outPath    It is the caller's responsibility
     *                   to free <i>{@code *outPath}</i> via {@link #pathSetFreePathU8}
     *                   if this function returns {@link NFDResult#OKAY} and <i>{@code *outPath}</i> is not null
     * @return the result
     */
    public static NFDResult npathSetEnumNextU8(@NativeType("nfdpathsetenum_t*") MemorySegment enumerator, @NativeType("nfdu8char_t**") MemorySegment outPath) {
        if (isOsWin) {
            try {
                return NFDResult.of((int) NFD_PathSet_EnumNextU8.invokeExact(enumerator, outPath));
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else return npathSetEnumNextN(enumerator, outPath);
    }

    /**
     * Gets the next item from the path set enumerator.
     *
     * @param enumerator the enumerator
     * @param outPath    the out path
     * @return the result
     * @see #npathSetEnumNextU8(MemorySegment, MemorySegment) npathSetEnumNextU8
     */
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

    /**
     * Free the path gotten by {@link #pathSetGetPathU8}
     *
     * @param filePath the path
     */
    public static void pathSetFreePathU8(MemorySegment filePath) {
        if (isOsWin) freePathU8(filePath);
        else pathSetFreePathN(filePath);
    }
}
