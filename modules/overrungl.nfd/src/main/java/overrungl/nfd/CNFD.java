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
//TODO
@Deprecated
public interface CNFD extends DirectAccess {
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
}
