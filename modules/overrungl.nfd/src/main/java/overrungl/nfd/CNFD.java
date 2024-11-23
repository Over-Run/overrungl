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

import overrun.marshal.DirectAccess;

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
}
