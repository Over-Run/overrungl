/*
 * MIT License
 *
 * Copyright (c) 2023-2024 Overrun Organization
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

import overrun.marshal.*;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.SizedSeg;
import overrun.marshal.gen.Skip;
import overrungl.NativeType;
import overrungl.util.value.Tuple2;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

import static java.lang.foreign.ValueLayout.*;

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
 *     var nfd = NFD.INSTANCE;
 *     nfd.init();
 *
 *     try (MemoryStack stack = MemoryStack.stackPush()) {
 *         String[] outPath = new String[1];
 *         var filterItem = NFDNFilterItem.create(stack,
 *             new Pair<>("Source code", "java"),
 *             new Pair<>("Image file", "png,jpg"));
 *         var result = nfd.openDialogN(outPath, filterItem, null);
 *         switch (result) {
 *             case ERROR -> System.err.println(STR."Error: \{nfd.getError()}");
 *             case OKAY -> System.out.println(STR."Success! \{outPath[0]}");
 *             case CANCEL -> System.out.println("User pressed cancel.");
 *         }
 *     }
 *
 *     nfd.quit();
 * }}
 *
 * <h3>File Filter Syntax</h3>
 * Files can be filtered by file extension groups:
 * {@snippet lang = java:
 * var filterItem = NFDNFilterItem.create(allocator,
 *     new Pair<>("Source code", "java"),
 *     new Pair<>("Image file", "png,jpg"));
 *}
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
public interface NFD extends DirectAccess {
    /**
     * The type of the path-set size ({@code long} for Windows and Mac OS X, {@code int} for others).
     */
    ValueLayout PATH_SET_SIZE = NFDInternal.isOsWinOrApple ? JAVA_LONG : JAVA_INT;
    /**
     * The instance of NFD.
     */
    NFD INSTANCE = Downcall.load(MethodHandles.lookup(), NFDInternal.LOOKUP, DowncallOption.descriptors(Map.of(
        "NFD_PathSet_GetPathN", FunctionDescriptor.of(JAVA_INT, ADDRESS, PATH_SET_SIZE, ADDRESS),
        "NFD_PathSet_FreePathN", FunctionDescriptor.ofVoid(ADDRESS),
        "NFD_FreePathU8", FunctionDescriptor.ofVoid(ADDRESS),
        "NFD_OpenDialogU8", FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS, JAVA_INT, ADDRESS),
        "NFD_OpenDialogMultipleU8", FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS, JAVA_INT, ADDRESS),
        "NFD_SaveDialogU8", FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS, JAVA_INT, ADDRESS, ADDRESS),
        "NFD_PickFolderU8", FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS),
        "NFD_PathSet_GetPathU8", FunctionDescriptor.of(JAVA_INT, ADDRESS, PATH_SET_SIZE, ADDRESS),
        "NFD_PathSet_EnumNextU8", FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS)
    )));

    /**
     * {@return NFD_PathSet_GetPathN}
     */
    MethodHandle NFD_PathSet_GetPathN();

    /**
     * {@return NFD_PathSet_FreePathN}
     */
    default MethodHandle NFD_PathSet_FreePathN() {
        return null;
    }

    /**
     * {@return NFD_FreePathU8}
     */
    default MethodHandle NFD_FreePathU8() {
        return null;
    }

    /**
     * {@return NFD_OpenDialogU8}
     */
    default MethodHandle NFD_OpenDialogU8() {
        return null;
    }

    /**
     * {@return NFD_OpenDialogMultipleU8}
     */
    default MethodHandle NFD_OpenDialogMultipleU8() {
        return null;
    }

    /**
     * {@return NFD_SaveDialogU8}
     */
    default MethodHandle NFD_SaveDialogU8() {
        return null;
    }

    /**
     * {@return NFD_PickFolderU8}
     */
    default MethodHandle NFD_PickFolderU8() {
        return null;
    }

    /**
     * {@return NFD_PathSet_GetPathU8}
     */
    default MethodHandle NFD_PathSet_GetPathU8() {
        return null;
    }

    /**
     * {@return NFD_PathSet_EnumNextU8}
     */
    default MethodHandle NFD_PathSet_EnumNextU8() {
        return null;
    }

    /**
     * free a file path that was returned by the dialogs
     * <p>
     * Note: use {@code NFD::pathSetFreePath} to free path from path-set instead of this function
     *
     * @param filePath the file path
     */
    @Entrypoint("NFD_FreePathN")
    void freePathN(@NativeType("nfdnchar_t*") MemorySegment filePath);

    /**
     * initialize NFD - call this for every thread that might use NFD, before calling any other NFD
     * functions on that thread
     *
     * @return the result
     */
    @Entrypoint("NFD_Init")
    NFDResult init();

    /**
     * call this to de-initialize NFD, if {@link #init} returned {@link NFDResult#OKAY}
     */
    @Entrypoint("NFD_Quit")
    void quit();

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
    @Entrypoint("NFD_OpenDialogN")
    NFDResult nopenDialogN(@NativeType("nfdnchar_t**") MemorySegment outPath, NFDNFilterItem filterList, int filterCount, @NativeType("const nfdnchar_t*") MemorySegment defaultPath);


    /**
     * single file open dialog
     *
     * @param outPath     the out path
     * @param filterList  the filter list
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     * @see #nopenDialogN(MemorySegment, NFDNFilterItem, int, MemorySegment) nopenDialogN
     */
    @Skip
    default NFDResult openDialogN(String[] outPath, NFDNFilterItem filterList, String defaultPath) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            final MemorySegment seg = Marshal.marshal(stack, outPath);
            final NFDResult result = nopenDialogN(seg,
                filterList,
                filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
                Marshal.marshal(stack, defaultPath, NFDInternal.nfdCharset));
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(Unmarshal.STR_LAYOUT, 0L);
                outPath[0] = path.getString(0L, NFDInternal.nfdCharset);
                freePathN(path);
            }
            return result;
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
    @Entrypoint("NFD_OpenDialogMultipleN")
    NFDResult nopenDialogMultipleN(@NativeType("const nfdpathset_t**") MemorySegment outPaths, NFDNFilterItem filterList, int filterCount, @NativeType("const nfdnchar_t*") MemorySegment defaultPath);

    /**
     * multiple file open dialog
     *
     * @param outPaths    It is the caller's responsibility to free <i>{@code *outPaths}</i>
     *                    via {@link #pathSetFree} if this function returns {@link NFDResult#OKAY}
     * @param filterList  the filter list
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     * @see #nopenDialogMultipleN(MemorySegment, NFDNFilterItem, int, MemorySegment) nopenDialogMultipleN
     */
    @Skip
    default NFDResult openDialogMultipleN(@NativeType("const nfdpathset_t**") MemorySegment outPaths, NFDNFilterItem filterList, String defaultPath) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            return nopenDialogMultipleN(outPaths,
                filterList,
                filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
                Marshal.marshal(stack, defaultPath, NFDInternal.nfdCharset));
        }
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
    @Entrypoint("NFD_SaveDialogN")
    NFDResult nsaveDialogN(@NativeType("nfdnchar_t**") MemorySegment outPath, NFDNFilterItem filterList, int filterCount, @NativeType("const nfdnchar_t*") MemorySegment defaultPath, @NativeType("const nfdnchar_t*") MemorySegment defaultName);

    /**
     * save dialog
     *
     * @param outPath     the out path
     * @param filterList  the filter list
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @param defaultName the default name of the file
     * @return the result
     * @see #nsaveDialogN(MemorySegment, NFDNFilterItem, int, MemorySegment, MemorySegment) nsaveDialogN
     */
    @Skip
    default NFDResult saveDialogN(String[] outPath, NFDNFilterItem filterList, String defaultPath, String defaultName) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            final MemorySegment seg = Marshal.marshal(stack, outPath);
            final NFDResult result = nsaveDialogN(seg,
                filterList,
                filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
                Marshal.marshal(stack, defaultPath, NFDInternal.nfdCharset),
                Marshal.marshal(stack, defaultName, NFDInternal.nfdCharset));
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(Unmarshal.STR_LAYOUT, 0L);
                outPath[0] = path.getString(0L, NFDInternal.nfdCharset);
                freePathN(path);
            }
            return result;
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
    @Entrypoint("NFD_PickFolderN")
    NFDResult npickFolderN(@NativeType("nfdnchar_t**") MemorySegment outPath, @NativeType("const nfdnchar_t*") MemorySegment defaultPath);

    /**
     * select folder dialog
     *
     * @param outPath     the out path
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     * @see #npickFolderN(MemorySegment, MemorySegment) npickFolderN
     */
    @Skip
    default NFDResult pickFolderN(String[] outPath, String defaultPath) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            final MemorySegment seg = Marshal.marshal(stack, outPath);
            final NFDResult result = npickFolderN(seg, Marshal.marshal(stack, defaultPath, NFDInternal.nfdCharset));
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(Unmarshal.STR_LAYOUT, 0);
                outPath[0] = path.getString(0, NFDInternal.nfdCharset);
                freePathN(path);
            }
            return result;
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
    @Entrypoint("NFD_GetError")
    @NativeType("const char*")
    MemorySegment ngetError();

    /**
     * Get last error -- set when {@link NFDResult} returns {@link NFDResult#ERROR}
     *
     * @return the last error that was set, or NULL if there is no error.
     * @see #ngetError() ngetError
     */
    @Entrypoint("NFD_GetError")
    @SizedSeg(Unmarshal.STR_SIZE)
    String getError();

    /**
     * clear the error
     */
    @Entrypoint("NFD_ClearError")
    void clearError();

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
    @Entrypoint("NFD_PathSet_GetCount")
    NFDResult npathSetGetCount(@NativeType("const nfdpathset_t*") MemorySegment pathSet, @NativeType("nfdpathsetsize_t*") MemorySegment count);

    /**
     * Gets the number of entries stored in pathSet
     *
     * @param pathSet the path-set
     * @param count   the count
     * @return the result
     * @see #npathSetGetCount(MemorySegment, MemorySegment) npathSetGetCount
     */
    @Skip
    default NFDResult pathSetGetCount(@NativeType("const nfdpathset_t*") MemorySegment pathSet, long[] count) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            final MemorySegment seg = stack.allocate(PATH_SET_SIZE);
            final NFDResult result = npathSetGetCount(pathSet, seg);
            count[0] = switch (PATH_SET_SIZE) {
                case ValueLayout.OfLong layout -> seg.get(layout, 0);
                case ValueLayout.OfInt layout -> Integer.toUnsignedLong(seg.get(layout, 0));
                default -> throw new AssertionError("should not reach here");
            };
            return result;
        }
    }

    /**
     * Gets the number of entries stored in pathSet
     *
     * @param pathSet the path-set
     * @return the result and the count
     * @see #npathSetGetCount(MemorySegment, MemorySegment) npathSetGetCount
     */
    @Skip
    default Tuple2.OfObjLong<NFDResult> pathSetGetCount(@NativeType("const nfdpathset_t*") MemorySegment pathSet) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            final MemorySegment seg = stack.allocate(PATH_SET_SIZE);
            final NFDResult result = npathSetGetCount(pathSet, seg);
            return new Tuple2.OfObjLong<>(result, switch (PATH_SET_SIZE) {
                case ValueLayout.OfLong layout -> seg.get(layout, 0);
                case ValueLayout.OfInt layout -> Integer.toUnsignedLong(seg.get(layout, 0));
                default -> throw new AssertionError("should not reach here");
            });
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
    @Skip
    default NFDResult npathSetGetPathN(@NativeType("const nfdpathset_t*") MemorySegment pathSet, long index, @NativeType("nfdnchar_t**") MemorySegment outPath) {
        try {
            return switch (PATH_SET_SIZE) {
                case OfLong _ -> NFDResult.of((int) NFD_PathSet_GetPathN().invokeExact(pathSet, index, outPath));
                case OfInt _ ->
                    NFDResult.of((int) NFD_PathSet_GetPathN().invokeExact(pathSet, Math.toIntExact(index), outPath));
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
    @Skip
    default NFDResult pathSetGetPathN(@NativeType("const nfdpathset_t*") MemorySegment pathSet, long index, String[] outPath) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            final MemorySegment seg = Marshal.marshal(stack, outPath);
            final NFDResult result = npathSetGetPathN(pathSet, index, seg);
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(Unmarshal.STR_LAYOUT, 0);
                outPath[0] = path.getString(0, NFDInternal.nfdCharset);
                pathSetFreePathN(path);
            }
            return result;
        }
    }

    /**
     * Free the path gotten by {@link #pathSetGetPathN}
     *
     * @param filePath the path
     */
    @Skip
    default void pathSetFreePathN(@NativeType("const nfdnchar_t*") MemorySegment filePath) {
        if (NFDInternal.isOsWinOrApple) {
            freePathN(filePath);
        } else try {
            NFD_PathSet_FreePathN().invokeExact(filePath);
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
    @Entrypoint("NFD_PathSet_GetEnum")
    NFDResult pathSetGetEnum(@NativeType("const nfdpathset_t*") MemorySegment pathSet, @NativeType("nfdpathsetenum_t*") MemorySegment outEnumerator);

    /**
     * Frees an enumerator of the path set.
     *
     * @param enumerator the enumerator
     */
    @Entrypoint("NFD_PathSet_FreeEnum")
    void pathSetFreeEnum(@NativeType("nfdpathsetenum_t*") MemorySegment enumerator);

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
    @Entrypoint("NFD_PathSet_EnumNextN")
    NFDResult npathSetEnumNextN(@NativeType("nfdpathsetenum_t*") MemorySegment enumerator, @NativeType("nfdnchar_t**") MemorySegment outPath);

    /**
     * Gets the next item from the path set enumerator.
     *
     * @param enumerator the enumerator
     * @param outPath    the out path
     * @return the result
     * @see #npathSetEnumNextN(MemorySegment, MemorySegment) npathSetEnumNextN
     */
    @Skip
    default NFDResult pathSetEnumNextN(@NativeType("nfdpathsetenum_t*") MemorySegment enumerator, String[] outPath) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            final MemorySegment seg = Marshal.marshal(stack, outPath);
            final NFDResult result = npathSetEnumNextN(enumerator, seg);
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(Unmarshal.STR_LAYOUT, 0);
                if (!Unmarshal.isNullPointer(path)) {
                    outPath[0] = path.getString(0L, NFDInternal.nfdCharset);
                    pathSetFreePathN(path);
                }
            }
            return result;
        }
    }

    /**
     * Free the pathSet
     *
     * @param pathSet the pathSet
     */
    @Entrypoint("NFD_PathSet_Free")
    void pathSetFree(@NativeType("const nfdpathset_t*") MemorySegment pathSet);

    /**
     * free a file path that was returned
     *
     * @param filePath the file path
     */
    @Skip
    default void freePathU8(@NativeType("nfdu8char_t*") MemorySegment filePath) {
        if (NFDInternal.isOsWin) {
            try {
                NFD_FreePathU8().invokeExact(filePath);
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
    @Skip
    default NFDResult nopenDialogU8(@NativeType("nfdu8char_t**") MemorySegment outPath, NFDU8FilterItem filterList, int filterCount, @NativeType("const nfdu8char_t*") MemorySegment defaultPath) {
        if (NFDInternal.isOsWin) {
            try {
                return NFDResult.of((int) NFD_OpenDialogU8().invokeExact(outPath, Marshal.marshal(filterList), filterCount, defaultPath));
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else return nopenDialogN(outPath, new NFDNFilterItem(filterList.segment()), filterCount, defaultPath);
    }

    /**
     * single file open dialog
     *
     * @param outPath     the out path
     * @param filterList  the filter list
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     * @see #nopenDialogU8(MemorySegment, NFDU8FilterItem, int, MemorySegment) nopenDialogU8
     */
    @Skip
    default NFDResult openDialogU8(String[] outPath, NFDU8FilterItem filterList, String defaultPath) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            final MemorySegment seg = Marshal.marshal(stack, outPath);
            final NFDResult result = nopenDialogU8(seg,
                filterList,
                filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
                Marshal.marshal(stack, defaultPath));
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(Unmarshal.STR_LAYOUT, 0);
                outPath[0] = path.getString(0L);
                freePathU8(path);
            }
            return result;
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
    @Skip
    default NFDResult nopenDialogMultipleU8(@NativeType("const nfdpathset_t**") MemorySegment outPaths, NFDU8FilterItem filterList, int filterCount, @NativeType("const nfdu8char_t*") MemorySegment defaultPath) {
        if (NFDInternal.isOsWin) {
            try {
                return NFDResult.of((int) NFD_OpenDialogMultipleU8().invokeExact(outPaths, Marshal.marshal(filterList), filterCount, defaultPath));
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else
            return nopenDialogMultipleN(outPaths, new NFDNFilterItem(filterList.segment()), filterCount, defaultPath);
    }

    /**
     * multiple file open dialog
     *
     * @param outPaths    It is the caller's responsibility to free <i>{@code *outPaths}</i>
     *                    via {@link #pathSetFree} if this function returns {@link NFDResult#OKAY}
     * @param filterList  the filter list
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @return the result
     * @see #nopenDialogMultipleU8(MemorySegment, NFDU8FilterItem, int, MemorySegment) nopenDialogMultipleU8
     */
    @Skip
    default NFDResult openDialogMultipleU8(@NativeType("const nfdpathset_t**") MemorySegment outPaths, NFDU8FilterItem filterList, String defaultPath) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            return nopenDialogMultipleU8(outPaths,
                filterList,
                filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
                Marshal.marshal(stack, defaultPath));
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
    @Skip
    default NFDResult nsaveDialogU8(@NativeType("nfdu8char_t**") MemorySegment outPath, NFDU8FilterItem filterList, int filterCount, @NativeType("const nfdu8char_t*") MemorySegment defaultPath, @NativeType("const nfdu8char_t*") MemorySegment defaultName) {
        if (NFDInternal.isOsWin) {
            try {
                return NFDResult.of((int) NFD_SaveDialogU8().invokeExact(outPath, Marshal.marshal(filterList), filterCount, defaultPath, defaultName));
            } catch (Throwable e) {
                throw new AssertionError("should not reach here", e);
            }
        } else
            return nsaveDialogN(outPath, new NFDNFilterItem(filterList.segment()), filterCount, defaultPath, defaultName);
    }

    /**
     * save dialog
     *
     * @param outPath     the out path
     * @param filterList  the filter list
     * @param defaultPath If defaultPath is NULL, the operating system will decide
     * @param defaultName the default name of the file
     * @return the result
     * @see #nopenDialogMultipleU8(MemorySegment, NFDU8FilterItem, int, MemorySegment) nopenDialogMultipleU8
     */
    @Skip
    default NFDResult saveDialogU8(String[] outPath, NFDU8FilterItem filterList, String defaultPath, String defaultName) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            final MemorySegment seg = Marshal.marshal(stack, outPath);
            final NFDResult result = nsaveDialogU8(seg,
                filterList,
                filterList != null ? Math.toIntExact(filterList.elementCount()) : 0,
                Marshal.marshal(stack, defaultPath),
                Marshal.marshal(stack, defaultName));
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(Unmarshal.STR_LAYOUT, 0);
                outPath[0] = path.getString(0L);
                freePathU8(path);
            }
            return result;
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
    @Skip
    default NFDResult npickFolderU8(@NativeType("nfdu8char_t**") MemorySegment outPath, @NativeType("const nfdu8char_t*") MemorySegment defaultPath) {
        if (NFDInternal.isOsWin) {
            try {
                return NFDResult.of((int) NFD_PickFolderU8().invokeExact(outPath, defaultPath));
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
    @Skip
    default NFDResult pickFolderU8(String[] outPath, String defaultPath) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            final MemorySegment seg = Marshal.marshal(stack, outPath);
            final NFDResult result = npickFolderU8(seg, Marshal.marshal(stack, defaultPath));
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(Unmarshal.STR_LAYOUT, 0);
                outPath[0] = path.getString(0L);
                freePathU8(path);
            }
            return result;
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
    @Skip
    default NFDResult npathSetGetPathU8(@NativeType("const nfdpathset_t*") MemorySegment pathSet, long index, @NativeType("nfdu8char_t**") MemorySegment outPath) {
        if (NFDInternal.isOsWin) {
            try {
                return switch (PATH_SET_SIZE) {
                    case OfLong _ -> NFDResult.of((int) NFD_PathSet_GetPathU8().invokeExact(pathSet, index, outPath));
                    case OfInt _ ->
                        NFDResult.of((int) NFD_PathSet_GetPathU8().invokeExact(pathSet, Math.toIntExact(index), outPath));
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
    @Skip
    default NFDResult pathSetGetPathU8(@NativeType("const nfdpathset_t*") MemorySegment pathSet, long index, String[] outPath) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            final MemorySegment seg = Marshal.marshal(stack, outPath);
            final NFDResult result = npathSetGetPathU8(pathSet, index, seg);
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(Unmarshal.STR_LAYOUT, 0);
                outPath[0] = path.getString(0L);
                pathSetFreePathU8(path);
            }
            return result;
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
    @Skip
    default NFDResult npathSetEnumNextU8(@NativeType("nfdpathsetenum_t*") MemorySegment enumerator, @NativeType("nfdu8char_t**") MemorySegment outPath) {
        if (NFDInternal.isOsWin) {
            try {
                return NFDResult.of((int) NFD_PathSet_EnumNextU8().invokeExact(enumerator, outPath));
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
    @Skip
    default NFDResult pathSetEnumNextU8(@NativeType("nfdpathsetenum_t*") MemorySegment enumerator, String[] outPath) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            final MemorySegment seg = Marshal.marshal(stack, outPath);
            final NFDResult result = npathSetEnumNextU8(enumerator, seg);
            if (result == NFDResult.OKAY) {
                final MemorySegment path = seg.get(Unmarshal.STR_LAYOUT, 0);
                if (!Unmarshal.isNullPointer(path)) {
                    outPath[0] = path.getString(0L);
                    pathSetFreePathU8(path);
                }
            }
            return result;
        }
    }

    /**
     * Free the path gotten by {@link #pathSetGetPathU8}
     *
     * @param filePath the path
     */
    @Skip
    default void pathSetFreePathU8(MemorySegment filePath) {
        if (NFDInternal.isOsWin) freePathU8(filePath);
        else pathSetFreePathN(filePath);
    }
}
