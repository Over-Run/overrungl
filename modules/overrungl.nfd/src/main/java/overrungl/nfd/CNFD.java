// MIT License
//
// Copyright (c) 2022-2024 Overrun Organization
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// This file is auto-generated. DO NOT EDIT!
package overrungl.nfd;

import java.lang.String;
import java.lang.foreign.MemorySegment;
import overrun.marshal.DirectAccess;
import overrun.marshal.gen.CType;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Ref;
import overrun.marshal.gen.Skip;

/**
 * Base functions of {@link NFD}.
 */
public interface CNFD extends DirectAccess {
  /**
   * Programmatic error
   */
  int NFD_ERROR = 0;

  /**
   * User pressed okay, or successful return
   */
  int NFD_OKAY = 1;

  /**
   * User pressed cancel
   */
  int NFD_CANCEL = 2;

  /**
   * The native window handle type.
   */
  int NFD_WINDOW_HANDLE_TYPE_UNSET = 0;

  /**
   * Windows: handle is HWND (the Windows API typedefs this to void*)
   */
  int NFD_WINDOW_HANDLE_TYPE_WINDOWS = 1;

  /**
   * Cocoa: handle is NSWindow*
   */
  int NFD_WINDOW_HANDLE_TYPE_COCOA = 2;

  /**
   * X11: handle is Window
   */
  int NFD_WINDOW_HANDLE_TYPE_X11 = 3;

  /**
   * This is a unique identifier tagged to all the NFD_*With() function calls, for backward
   * compatibility purposes. <p>There is usually no need to use this directly, unless you want to use
   * NFD differently depending on the version you're building with.
   */
  int NFD_INTERFACE_VERSION = 1;

  /**
   * Free a file path that was returned by the dialogs.
   * <p>
   * Note: use {@link #NFD_PathSet_FreePathN} to free path from pathset instead of this function.
   */
  @Entrypoint("NFD_FreePathN")
  void NFD_FreePathN(@CType("nfdnchar_t*") MemorySegment filePath);

  /**
   * Overloads {@link #NFD_FreePathN(java.lang.foreign.MemorySegment)}
   */
  @Entrypoint("NFD_FreePathN")
  @Skip
  default void NFD_FreePath(@CType("nfdnchar_t*") MemorySegment filePath) {
    this.NFD_FreePathN(filePath);
  }

  /**
   * Free a file path that was returned by the dialogs.
   * <p>
   * Note: use {@link #NFD_PathSet_FreePathU8} to free path from pathset instead of this function.
   */
  @Entrypoint("NFD_FreePathU8")
  void NFD_FreePathU8(@CType("nfdu8char_t*") MemorySegment filePath);

  /**
   * Initialize NFD. Call this for every thread that might use NFD, before calling any other NFD
   * functions on that thread.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_Init")
  int NFD_Init();

  /**
   * Call this to de-initialize NFD, if {@link #NFD_Init()} returned NFD_OKAY.
   */
  @Entrypoint("NFD_Quit")
  void NFD_Quit();

  /**
   * Single file open dialog
   * <p>
   * It's the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathN} if this function returns
   * NFD_OKAY.
   * @param filterCount If zero, filterList is ignored (you can use null).
   * @param defaultPath If null, the operating system will decide.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogN")
  int NFD_OpenDialogN(@CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdnfilteritem_t*") MemorySegment filterList,
      @CType("nfdfiltersize_t") int filterCount,
      @CType("const nfdnchar_t*") MemorySegment defaultPath);

  /**
   * Overloads {@link #NFD_OpenDialogN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment, int, java.lang.foreign.MemorySegment)}
   * @param filterCount If zero, filterList is ignored (you can use null).
   * @param defaultPath If null, the operating system will decide.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogN")
  @Skip
  default int NFD_OpenDialog(@CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdnfilteritem_t*") MemorySegment filterList,
      @CType("nfdfiltersize_t") int filterCount,
      @CType("const nfdnchar_t*") MemorySegment defaultPath) {
    return this.NFD_OpenDialogN(outPath, filterList, filterCount, defaultPath);
  }

  /**
   * Single file open dialog
   * <p>
   * It's the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathU8} if this function returns
   * NFD_OKAY.
   * @param filterCount If zero, filterList is ignored (you can use null).
   * @param defaultPath If null, the operating system will decide.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogU8")
  int NFD_OpenDialogU8(@CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdu8filteritem_t*") MemorySegment filterList,
      @CType("nfdfiltersize_t") int filterCount,
      @CType("const nfdu8char_t*") MemorySegment defaultPath);

  /**
   * This function is a library implementation detail.  Please use {@link #NFD_OpenDialogN_With} instead.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogN_With_Impl")
  int NFD_OpenDialogN_With_Impl(@CType("nfdversion_t") long version,
      @CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdopendialognargs_t*") MemorySegment args);

  /**
   * Single file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathN} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogNArgs} for details.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogN_With")
  @Skip
  default int NFD_OpenDialogN_With(@CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdopendialognargs_t*") MemorySegment args) {
    return NFD_OpenDialogN_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
  }

  /**
   * This function is a library implementation detail.  Please use {@link #NFD_OpenDialogU8_With} instead.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogU8_With_Impl")
  int NFD_OpenDialogU8_With_Impl(@CType("nfdversion_t") long version,
      @CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdopendialogu8args_t*") MemorySegment args);

  /**
   * Single file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathU8} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogU8Args} for details.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogU8_With")
  @Skip
  default int NFD_OpenDialogU8_With(@CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdopendialogu8args_t*") MemorySegment args) {
    return NFD_OpenDialogU8_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
  }

  /**
   * Multiple file open dialog
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
   * returns NFD_OKAY.
   * @param filterCount If zero, filterList is ignored (you can use null).
   * @param defaultPath If null, the operating system will decide.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogMultipleN")
  int NFD_OpenDialogMultipleN(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdnfilteritem_t*") MemorySegment filterList,
      @CType("nfdfiltersize_t") int filterCount,
      @CType("const nfdnchar_t*") MemorySegment defaultPath);

  /**
   * Overloads {@link #NFD_OpenDialogMultipleN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment, int, java.lang.foreign.MemorySegment)}
   * @param filterCount If zero, filterList is ignored (you can use null).
   * @param defaultPath If null, the operating system will decide.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogMultipleN")
  @Skip
  default int NFD_OpenDialogMultiple(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdnfilteritem_t*") MemorySegment filterList,
      @CType("nfdfiltersize_t") int filterCount,
      @CType("const nfdnchar_t*") MemorySegment defaultPath) {
    return this.NFD_OpenDialogMultipleN(outPaths, filterList, filterCount, defaultPath);
  }

  /**
   * Multiple file open dialog
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
   * returns NFD_OKAY.
   * @param filterCount If zero, filterList is ignored (you can use null).
   * @param defaultPath If null, the operating system will decide.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogMultipleU8")
  int NFD_OpenDialogMultipleU8(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdu8filteritem_t*") MemorySegment filterList,
      @CType("nfdfiltersize_t") int filterCount,
      @CType("const nfdu8char_t*") MemorySegment defaultPath);

  /**
   * This function is a library implementation detail.  Please use {@link #NFD_OpenDialogMultipleN_With}
   * instead.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogMultipleN_With_Impl")
  int NFD_OpenDialogMultipleN_With_Impl(@CType("nfdversion_t") long version,
      @CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdopendialognargs_t*") MemorySegment args);

  /**
   * Multiple file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogNArgs} for details.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogMultipleN_With")
  @Skip
  default int NFD_OpenDialogMultipleN_With(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdopendialognargs_t*") MemorySegment args) {
    return NFD_OpenDialogMultipleN_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);
  }

  /**
   * This function is a library implementation detail.  Please use {@link #NFD_OpenDialogMultipleU8_With}
   * instead.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogMultipleU8_With_Impl")
  int NFD_OpenDialogMultipleU8_With_Impl(@CType("nfdversion_t") long version,
      @CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdopendialogu8args_t*") MemorySegment args);

  /**
   * Multiple file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogU8Args} for details.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogMultipleU8_With")
  @Skip
  default int NFD_OpenDialogMultipleU8_With(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdopendialogu8args_t*") MemorySegment args) {
    return NFD_OpenDialogMultipleU8_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);
  }

  /**
   * Save dialog
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathN} if this function returns
   * NFD_OKAY.
   * @param filterCount If zero, filterList is ignored (you can use null).
   * @param defaultPath If null, the operating system will decide.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_SaveDialogN")
  int NFD_SaveDialogN(@CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdnfilteritem_t*") MemorySegment filterList,
      @CType("nfdfiltersize_t") int filterCount,
      @CType("const nfdnchar_t*") MemorySegment defaultPath,
      @CType("const nfdnchar_t*") MemorySegment defaultName);

  /**
   * Overloads {@link #NFD_SaveDialogN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment, int, java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment)}
   * @param filterCount If zero, filterList is ignored (you can use null).
   * @param defaultPath If null, the operating system will decide.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_SaveDialogN")
  @Skip
  default int NFD_SaveDialog(@CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdnfilteritem_t*") MemorySegment filterList,
      @CType("nfdfiltersize_t") int filterCount,
      @CType("const nfdnchar_t*") MemorySegment defaultPath,
      @CType("const nfdnchar_t*") MemorySegment defaultName) {
    return this.NFD_SaveDialogN(outPath, filterList, filterCount, defaultPath, defaultName);
  }

  /**
   * Save dialog
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathU8} if this function returns
   * NFD_OKAY.
   * @param filterCount If zero, filterList is ignored (you can use null).
   * @param defaultPath If null, the operating system will decide.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_SaveDialogU8")
  int NFD_SaveDialogU8(@CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdu8filteritem_t*") MemorySegment filterList,
      @CType("nfdfiltersize_t") int filterCount,
      @CType("const nfdu8char_t*") MemorySegment defaultPath,
      @CType("const nfdu8char_t*") MemorySegment defaultName);

  /**
   * This function is a library implementation detail.  Please use {@link #NFD_SaveDialogN_With} instead.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_SaveDialogN_With_Impl")
  int NFD_SaveDialogN_WithImpl(@CType("nfdversion_t") long version,
      @CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdsavedialognargs_t*") MemorySegment args);

  /**
   * Single file save dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathN} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDSaveDialogNArgs} for details.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_SaveDialogN_With")
  @Skip
  default int NFD_SaveDialogN_With(@CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdsavedialognargs_t*") MemorySegment args) {
    return NFD_SaveDialogN_WithImpl(NFD_INTERFACE_VERSION, outPath, args);
  }

  /**
   * This function is a library implementation detail.  Please use {@link #NFD_SaveDialogU8_With} instead.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_SaveDialogU8_With_Impl")
  int NFD_SaveDialogU8_WithImpl(@CType("nfdversion_t") long version,
      @CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdsavedialogu8args_t*") MemorySegment args);

  /**
   * Single file save dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathU8} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDSaveDialogU8Args} for details.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_SaveDialogU8_With")
  @Skip
  default int NFD_SaveDialogU8_With(@CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdsavedialogu8args_t*") MemorySegment args) {
    return NFD_SaveDialogU8_WithImpl(NFD_INTERFACE_VERSION, outPath, args);
  }

  /**
   * Select single folder dialog
   * <p>
   * It's the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathN} if this function returns
   * NFD_OKAY.
   * @param defaultPath If null, the operating system will decide.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderN")
  int NFD_PickFolderN(@CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdnchar_t*") MemorySegment defaultPath);

  /**
   * Overloads {@link #NFD_PickFolderN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment)}
   * @param defaultPath If null, the operating system will decide.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderN")
  @Skip
  default int NFD_PickFolder(@CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdnchar_t*") MemorySegment defaultPath) {
    return this.NFD_PickFolderN(outPath, defaultPath);
  }

  /**
   * Select single folder dialog
   * <p>
   * It's the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathU8} if this function returns
   * NFD_OKAY.
   * @param defaultPath If null, the operating system will decide.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderU8")
  int NFD_PickFolderU8(@CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdu8char_t*") MemorySegment defaultPath);

  /**
   * This function is a library implementation detail.  Please use {@link #NFD_PickFolderN_With} instead.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderN_With_Impl")
  int NFD_PickFolderN_With_Impl(@CType("nfdversion_t") long version,
      @CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdpickfoldernargs_t*") MemorySegment args);

  /**
   * Single file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathN} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDPickFolderNArgs} for details.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderN_With")
  @Skip
  default int NFD_PickFolderN_With(@CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdpickfoldernargs_t*") MemorySegment args) {
    return NFD_PickFolderN_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
  }

  /**
   * This function is a library implementation detail.  Please use {@link #NFD_PickFolderU8_With} instead.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderU8_With_Impl")
  int NFD_PickFolderU8_With_Impl(@CType("nfdversion_t") long version,
      @CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdpickfolderu8args_t*") MemorySegment args);

  /**
   * Single file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #NFD_FreePathU8} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDPickFolderU8Args} for details.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderU8_With")
  @Skip
  default int NFD_PickFolderU8_With(@CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdpickfolderu8args_t*") MemorySegment args) {
    return NFD_PickFolderU8_With_Impl(NFD_INTERFACE_VERSION, outPath, args);
  }

  /**
   * Select multiple folder dialog
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
   * returns NFD_OKAY.
   * @param defaultPath If null, the operating system will decide.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderMultipleN")
  int NFD_PickFolderMultipleN(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdnchar_t*") MemorySegment defaultPath);

  /**
   * Overloads {@link #NFD_PickFolderMultipleN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment)}
   * @param defaultPath If null, the operating system will decide.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderMultipleN")
  @Skip
  default int NFD_PickFolderMultiple(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdnchar_t*") MemorySegment defaultPath) {
    return this.NFD_PickFolderMultipleN(outPaths, defaultPath);
  }

  /**
   * Select multiple folder dialog
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
   * returns NFD_OKAY.
   * @param defaultPath If null, the operating system will decide.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderMultipleU8")
  int NFD_PickFolderMultipleU8(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdu8char_t*") MemorySegment defaultPath);

  /**
   * This function is a library implementation detail.  Please use {@link #NFD_PickFolderMultipleN_With}
   * instead.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderMultipleN_With_Impl")
  int NFD_PickFolderMultipleN_With_Impl(@CType("nfdversion_t") long version,
      @CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdpickfoldernargs_t*") MemorySegment args);

  /**
   * Multiple file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDPickFolderNArgs} for details.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderMultipleN_With")
  @Skip
  default int NFD_PickFolderMultipleN_With(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdpickfoldernargs_t*") MemorySegment args) {
    return NFD_PickFolderMultipleN_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);
  }

  /**
   * This function is a library implementation detail.  Please use {@link #NFD_PickFolderMultipleU8_With}
   * instead.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderMultipleU8_With_Impl")
  int NFD_PickFolderMultipleU8_With_Impl(@CType("nfdversion_t") long version,
      @CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdpickfolderu8args_t*") MemorySegment args);

  /**
   * Multiple file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #NFD_PathSet_Free} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDPickFolderU8Args} for details.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderMultipleU8_With")
  @Skip
  default int NFD_PickFolderMultipleU8_With(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdpickfolderu8args_t*") MemorySegment args) {
    return NFD_PickFolderMultipleU8_With_Impl(NFD_INTERFACE_VERSION, outPaths, args);
  }

  /**
   * Get the last error
   * <p>
   * This is set when a function returns NFD_ERROR.
   * The memory is owned by NFD and should not be freed by user code.
   * This is <strong>always</strong> ASCII printable characters, so it can be interpreted as UTF-8 without any
   * conversion.
   * @return The last error that was set, or null if there is no error.
   */
  @CType("const char*")
  @Entrypoint("NFD_GetError")
  MemorySegment NFD_GetError_();

  /**
   * Get the last error
   * <p>
   * This is set when a function returns NFD_ERROR.
   * The memory is owned by NFD and should not be freed by user code.
   * This is <strong>always</strong> ASCII printable characters, so it can be interpreted as UTF-8 without any
   * conversion.
   * @return The last error that was set, or null if there is no error.
   */
  @CType("const char*")
  @Entrypoint("NFD_GetError")
  String NFD_GetError();

  /**
   * Clear the error.
   */
  @Entrypoint("NFD_ClearError")
  void NFD_ClearError();

  /**
   * Get the number of entries stored in pathSet.
   * <p>
   * Note: some paths might be invalid (NFD_ERROR will be returned by NFD_PathSet_GetPath),
   * so we might not actually have this number of usable paths.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PathSet_GetCount")
  int NFD_PathSet_GetCount(@CType("const nfdpathset_t*") MemorySegment pathSet,
      @CType("nfdpathsetsize_t*") MemorySegment count);

  /**
   * Get the number of entries stored in pathSet.
   * <p>
   * Note: some paths might be invalid (NFD_ERROR will be returned by NFD_PathSet_GetPath),
   * so we might not actually have this number of usable paths.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PathSet_GetCount")
  int NFD_PathSet_GetCount(@CType("const nfdpathset_t*") MemorySegment pathSet,
      @CType("nfdpathsetsize_t*") @Ref long[] count);

  /**
   * Get the native path at offset index.
   * <p>
   * It is the caller's responsibility to free `outPath` via {@link #NFD_PathSet_FreePathN} if this function
   * returns NFD_OKAY.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PathSet_GetPathN")
  int NFD_PathSet_GetPathN(@CType("const nfdpathset_t*") MemorySegment pathSet,
      @CType("nfdpathsetsize_t") long index, @CType("nfdnchar_t**") MemorySegment outPath);

  /**
   * Overloads {@link #NFD_PathSet_GetPathN(java.lang.foreign.MemorySegment, long, java.lang.foreign.MemorySegment)}
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PathSet_GetPathN")
  @Skip
  default int NFD_PathSet_GetPath(@CType("const nfdpathset_t*") MemorySegment pathSet,
      @CType("nfdpathsetsize_t") long index, @CType("nfdnchar_t**") MemorySegment outPath) {
    return this.NFD_PathSet_GetPathN(pathSet, index, outPath);
  }

  /**
   * Get the UTF-8 path at offset index.
   * <p>
   * It is the caller's responsibility to free `outPath` via {@link #NFD_PathSet_FreePathU8} if this function
   * returns NFD_OKAY.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PathSet_GetPathU8")
  int NFD_PathSet_GetPathU8(@CType("const nfdpathset_t*") MemorySegment pathSet,
      @CType("nfdpathsetsize_t") long index, @CType("nfdu8char_t**") MemorySegment outPath);

  /**
   * Free the path gotten by {@link #NFD_PathSet_GetPathN}.
   */
  @Entrypoint("NFD_PathSet_FreePathN")
  void NFD_PathSet_FreePathN(@CType("const nfdnchar_t*") MemorySegment filePath);

  /**
   * Overloads {@link #NFD_PathSet_FreePathN(java.lang.foreign.MemorySegment)}
   */
  @Entrypoint("NFD_PathSet_FreePathN")
  @Skip
  default void NFD_PathSet_FreePath(@CType("const nfdnchar_t*") MemorySegment filePath) {
    this.NFD_PathSet_FreePathN(filePath);
  }

  /**
   * Free the path gotten by {@link #NFD_PathSet_GetPathU8}.
   */
  @Entrypoint("NFD_PathSet_FreePathU8")
  void NFD_PathSet_FreePathU8(@CType("const nfdu8char_t*") MemorySegment filePath);

  /**
   * Gets an enumerator of the path set.
   * <p>
   * It is the caller's responsibility to free {@code enumerator} via {@link #NFD_PathSet_FreeEnum}
   * if this function returns NFD_OKAY, and it should be freed before freeing the pathset.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PathSet_GetEnum")
  int NFD_PathSet_GetEnum(@CType("const nfdpathset_t*") MemorySegment pathSet,
      @CType("nfdpathsetenum_t*") MemorySegment outEnumerator);

  /**
   * Frees an enumerator of the path set.
   */
  @Entrypoint("NFD_PathSet_FreeEnum")
  void NFD_PathSet_FreeEnum(@CType("nfdpathsetenum_t*") MemorySegment enumerator);

  /**
   * Gets the next item from the path set enumerator.
   * <p>
   * If there are no more items, then *outPaths will be set to null.
   * It is the caller's responsibility to free {@code *outPath} via {@link #NFD_PathSet_FreePathN}
   * if this function returns NFD_OKAY and {@code *outPath} is not null.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PathSet_EnumNextN")
  int NFD_PathSet_EnumNextN(@CType("nfdpathsetenum_t*") MemorySegment enumerator,
      @CType("nfdnchar_t**") MemorySegment outPath);

  /**
   * Overloads {@link #NFD_PathSet_EnumNextN(java.lang.foreign.MemorySegment, java.lang.foreign.MemorySegment)}
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PathSet_EnumNextN")
  @Skip
  default int NFD_PathSet_EnumNext(@CType("nfdpathsetenum_t*") MemorySegment enumerator,
      @CType("nfdnchar_t**") MemorySegment outPath) {
    return this.NFD_PathSet_EnumNextN(enumerator, outPath);
  }

  /**
   * Gets the next item from the path set enumerator.
   * <p>
   * If there are no more items, then *outPaths will be set to null.
   * It is the caller's responsibility to free {@code *outPath} via {@link #NFD_PathSet_FreePathU8}
   * if this function returns NFD_OKAY and {@code *outPath} is not null.
   */
  @CType("nfdresult_t")
  @Entrypoint("NFD_PathSet_EnumNextU8")
  int NFD_PathSet_EnumNextU8(@CType("nfdpathsetenum_t*") MemorySegment enumerator,
      @CType("nfdu8char_t**") MemorySegment outPath);

  /**
   * Free the pathSet
   */
  @Entrypoint("NFD_PathSet_Free")
  void NFD_PathSet_Free(@CType("const nfdpathset_t*") MemorySegment pathSet);
}
