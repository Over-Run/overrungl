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
import overrun.marshal.gen.CanonicalType;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Skip;

/**
 * Base functions of {@link NFD}.
 */
public interface CNFD extends DirectAccess {
  /**
   * Programmatic error
   */
  int ERROR = 0;

  /**
   * User pressed okay, or successful return
   */
  int OKAY = 1;

  /**
   * User pressed cancel
   */
  int CANCEL = 2;

  /**
   * The native window handle type.
   */
  int WINDOW_HANDLE_TYPE_UNSET = 0;

  /**
   * Windows: handle is HWND (the Windows API typedefs this to void*)
   */
  int WINDOW_HANDLE_TYPE_WINDOWS = 1;

  /**
   * Cocoa: handle is NSWindow*
   */
  int WINDOW_HANDLE_TYPE_COCOA = 2;

  /**
   * X11: handle is Window
   */
  int WINDOW_HANDLE_TYPE_X11 = 3;

  /**
   * This is a unique identifier tagged to all the NFD_*With() function calls, for backward
   * compatibility purposes. <p>There is usually no need to use this directly, unless you want to use
   * NFD differently depending on the version you're building with.
   */
  int INTERFACE_VERSION = 1;

  /**
   * Free a file path that was returned by the dialogs.
   * <p>
   * Note: use {@link #pathSetFreePathN} to free path from pathset instead of this function.
   */
  @Entrypoint("NFD_FreePathN")
  void freePathN(@CType("nfdnchar_t*") MemorySegment filePath);

  /**
   * Free a file path that was returned by the dialogs.
   * <p>
   * Note: use {@link #pathSetFreePathU8} to free path from pathset instead of this function.
   */
  @Entrypoint("NFD_FreePathU8")
  void freePathU8(@CType("nfdu8char_t*") MemorySegment filePath);

  /**
   * Initialize NFD. Call this for every thread that might use NFD, before calling any other NFD
   * functions on that thread.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_Init")
  int init();

  /**
   * Call this to de-initialize NFD, if {@link #init()} returned NFD_OKAY.
   */
  @Entrypoint("NFD_Quit")
  void quit();

  /**
   * Single file open dialog
   * <p>
   * It's the caller's responsibility to free {@code outPath} via {@link #freePathN} if this function returns
   * NFD_OKAY.
   * @param filterCount If zero, filterList is ignored (you can use null).@param defaultPath If null, the operating system will decide.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogN")
  int openDialogN(@CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdnfilteritem_t*") MemorySegment filterList,
      @CanonicalType("int") @CType("nfdfiltersize_t") int filterCount,
      @CType("const nfdnchar_t*") MemorySegment defaultPath);

  /**
   * Single file open dialog
   * <p>
   * It's the caller's responsibility to free {@code outPath} via {@link #freePathU8} if this function returns
   * NFD_OKAY.
   * @param filterCount If zero, filterList is ignored (you can use null).@param defaultPath If null, the operating system will decide.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogU8")
  int openDialogU8(@CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdu8filteritem_t*") MemorySegment filterList,
      @CanonicalType("int") @CType("nfdfiltersize_t") int filterCount,
      @CType("const nfdu8char_t*") MemorySegment defaultPath);

  /**
   * This function is a library implementation detail.  Please use {@link #openDialogNWith} instead.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogN_With_Impl")
  int openDialogNWithImpl(@CanonicalType("size_t") @CType("nfdversion_t") long version,
      @CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdopendialognargs_t*") MemorySegment args);

  /**
   * Single file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #freePathN} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogNArgs} for details.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogN_With")
  @Skip
  default int openDialogNWith(@CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdopendialognargs_t*") MemorySegment args) {
    return openDialogNWithImpl(INTERFACE_VERSION, outPath, args);
  }

  /**
   * This function is a library implementation detail.  Please use {@link #openDialogU8With} instead.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogU8_With_Impl")
  int openDialogU8WithImpl(@CanonicalType("size_t") @CType("nfdversion_t") long version,
      @CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdopendialogu8args_t*") MemorySegment args);

  /**
   * Single file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #freePathU8} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogU8Args} for details.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogU8_With")
  @Skip
  default int openDialogU8With(@CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdopendialogu8args_t*") MemorySegment args) {
    return openDialogU8WithImpl(INTERFACE_VERSION, outPath, args);
  }

  /**
   * Multiple file open dialog
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFreeN} if this function
   * returns NFD_OKAY.
   * @param filterCount If zero, filterList is ignored (you can use null).@param defaultPath If null, the operating system will decide.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogMultipleN")
  int openDialogMultipleN(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdnfilteritem_t*") MemorySegment filterList,
      @CanonicalType("int") @CType("nfdfiltersize_t") int filterCount,
      @CType("const nfdnchar_t*") MemorySegment defaultPath);

  /**
   * Multiple file open dialog
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFreeU8} if this function
   * returns NFD_OKAY.
   * @param filterCount If zero, filterList is ignored (you can use null).@param defaultPath If null, the operating system will decide.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogMultipleU8")
  int openDialogMultipleU8(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdu8filteritem_t*") MemorySegment filterList,
      @CanonicalType("int") @CType("nfdfiltersize_t") int filterCount,
      @CType("const nfdu8char_t*") MemorySegment defaultPath);

  /**
   * This function is a library implementation detail.  Please use {@link #openDialogMultipleNWith}
   * instead.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogMultipleN_With_Impl")
  int openDialogMultipleNWithImpl(@CanonicalType("size_t") @CType("nfdversion_t") long version,
      @CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdopendialognargs_t*") MemorySegment args);

  /**
   * Multiple file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFreeN} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogNArgs} for details.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogMultipleN_With")
  @Skip
  default int openDialogMultipleNWith(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdopendialognargs_t*") MemorySegment args) {
    return openDialogMultipleNWithImpl(INTERFACE_VERSION, outPaths, args);
  }

  /**
   * This function is a library implementation detail.  Please use {@link #openDialogMultipleU8With}
   * instead.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogMultipleU8_With_Impl")
  int openDialogMultipleU8WithImpl(@CanonicalType("size_t") @CType("nfdversion_t") long version,
      @CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdopendialogu8args_t*") MemorySegment args);

  /**
   * Multiple file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFreeU8} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDOpenDialogU8Args} for details.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_OpenDialogMultipleU8_With")
  @Skip
  default int openDialogMultipleU8With(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdopendialogu8args_t*") MemorySegment args) {
    return openDialogMultipleU8WithImpl(INTERFACE_VERSION, outPaths, args);
  }

  /**
   * Save dialog
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #freePathN} if this function returns
   * NFD_OKAY.
   * @param filterCount If zero, filterList is ignored (you can use null).@param defaultPath If null, the operating system will decide.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_SaveDialogN")
  int saveDialogN(@CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdnfilteritem_t*") MemorySegment filterList,
      @CanonicalType("int") @CType("nfdfiltersize_t") int filterCount,
      @CType("const nfdnchar_t*") MemorySegment defaultPath,
      @CType("const nfdnchar_t*") MemorySegment defaultName);

  /**
   * Save dialog
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #freePathU8} if this function returns
   * NFD_OKAY.
   * @param filterCount If zero, filterList is ignored (you can use null).@param defaultPath If null, the operating system will decide.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_SaveDialogU8")
  int saveDialogU8(@CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdu8filteritem_t*") MemorySegment filterList,
      @CanonicalType("int") @CType("nfdfiltersize_t") int filterCount,
      @CType("const nfdu8char_t*") MemorySegment defaultPath,
      @CType("const nfdu8char_t*") MemorySegment defaultName);

  /**
   * This function is a library implementation detail.  Please use {@link #saveDialogNWith} instead.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_SaveDialogN_With_Impl")
  int saveDialogNWithImpl(@CanonicalType("size_t") @CType("nfdversion_t") long version,
      @CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdsavedialognargs_t*") MemorySegment args);

  /**
   * Single file save dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #freePathN} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDSaveDialogNArgs} for details.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_SaveDialogN_With")
  @Skip
  default int saveDialogNWith(@CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdsavedialognargs_t*") MemorySegment args) {
    return saveDialogNWithImpl(INTERFACE_VERSION, outPath, args);
  }

  /**
   * This function is a library implementation detail.  Please use {@link #saveDialogU8With} instead.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_SaveDialogU8_With_Impl")
  int saveDialogU8WithImpl(@CanonicalType("size_t") @CType("nfdversion_t") long version,
      @CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdsavedialogu8args_t*") MemorySegment args);

  /**
   * Single file save dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #freePathU8} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDSaveDialogU8Args} for details.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_SaveDialogU8_With")
  @Skip
  default int saveDialogU8With(@CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdsavedialogu8args_t*") MemorySegment args) {
    return saveDialogU8WithImpl(INTERFACE_VERSION, outPath, args);
  }

  /**
   * Select single folder dialog
   * <p>
   * It's the caller's responsibility to free {@code outPath} via {@link #freePathN} if this function returns
   * NFD_OKAY.
   * @param defaultPath If null, the operating system will decide.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderN")
  int pickFolderN(@CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdnchar_t*") MemorySegment defaultPath);

  /**
   * Select single folder dialog
   * <p>
   * It's the caller's responsibility to free {@code outPath} via {@link #freePathU8} if this function returns
   * NFD_OKAY.
   * @param defaultPath If null, the operating system will decide.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderU8")
  int pickFolderU8(@CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdu8char_t*") MemorySegment defaultPath);

  /**
   * This function is a library implementation detail.  Please use {@link #pickFolderNWith} instead.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderN_With_Impl")
  int pickFolderNWithImpl(@CanonicalType("size_t") @CType("nfdversion_t") long version,
      @CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdpickfoldernargs_t*") MemorySegment args);

  /**
   * Single file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #freePathN} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDPickFolderNArgs} for details.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderN_With")
  @Skip
  default int pickFolderNWith(@CType("nfdnchar_t**") MemorySegment outPath,
      @CType("const nfdpickfoldernargs_t*") MemorySegment args) {
    return pickFolderNWithImpl(INTERFACE_VERSION, outPath, args);
  }

  /**
   * This function is a library implementation detail.  Please use {@link #pickFolderU8With} instead.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderU8_With_Impl")
  int pickFolderU8WithImpl(@CanonicalType("size_t") @CType("nfdversion_t") long version,
      @CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdpickfolderu8args_t*") MemorySegment args);

  /**
   * Single file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPath} via {@link #freePathU8} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDPickFolderU8Args} for details.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderU8_With")
  @Skip
  default int pickFolderU8With(@CType("nfdu8char_t**") MemorySegment outPath,
      @CType("const nfdpickfolderu8args_t*") MemorySegment args) {
    return pickFolderU8WithImpl(INTERFACE_VERSION, outPath, args);
  }

  /**
   * Select multiple folder dialog
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFreeN} if this function
   * returns NFD_OKAY.
   * @param defaultPath If null, the operating system will decide.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderMultipleN")
  int pickFolderMultipleN(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdnchar_t*") MemorySegment defaultPath);

  /**
   * Select multiple folder dialog
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFreeU8} if this function
   * returns NFD_OKAY.
   * @param defaultPath If null, the operating system will decide.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderMultipleU8")
  int pickFolderMultipleU8(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdu8char_t*") MemorySegment defaultPath);

  /**
   * This function is a library implementation detail.  Please use {@link #pickFolderMultipleNWith}
   * instead.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderMultipleN_With_Impl")
  int pickFolderMultipleNWithImpl(@CanonicalType("size_t") @CType("nfdversion_t") long version,
      @CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdpickfoldernargs_t*") MemorySegment args);

  /**
   * Multiple file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFreeN} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDPickFolderNArgs} for details.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderMultipleN_With")
  @Skip
  default int pickFolderMultipleNWith(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdpickfoldernargs_t*") MemorySegment args) {
    return pickFolderMultipleNWithImpl(INTERFACE_VERSION, outPaths, args);
  }

  /**
   * This function is a library implementation detail.  Please use {@link #pickFolderMultipleU8With}
   * instead.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderMultipleU8_With_Impl")
  int pickFolderMultipleU8WithImpl(@CanonicalType("size_t") @CType("nfdversion_t") long version,
      @CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdpickfolderu8args_t*") MemorySegment args);

  /**
   * Multiple file open dialog, with additional parameters.
   * <p>
   * It is the caller's responsibility to free {@code outPaths} via {@link #pathSetFreeU8} if this function
   * returns NFD_OKAY.  See documentation of {@link NFDPickFolderU8Args} for details.
   */
  @CanonicalType("int")
  @CType("nfdresult_t")
  @Entrypoint("NFD_PickFolderMultipleU8_With")
  @Skip
  default int pickFolderMultipleU8With(@CType("const nfdpathset_t**") MemorySegment outPaths,
      @CType("const nfdpickfolderu8args_t*") MemorySegment args) {
    return pickFolderMultipleU8WithImpl(INTERFACE_VERSION, outPaths, args);
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
  MemorySegment getError_();

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
  String getError();

  /**
   * Clear the error.
   */
  @Entrypoint("NFD_ClearError")
  void clearError();
}
