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

import java.lang.Override;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandles;
import overrun.marshal.LayoutBuilder;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.CType;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

/**
 *
 * <h2>Members</h2>
 *
 * <h3>defaultPath</h3>
 * <p>{@linkplain #defaultPath() Getter} - {@linkplain #defaultPath(MemorySegment) Setter}
 *
 * <h3>parentWindow$type</h3>
 * <p>{@linkplain #parentWindow$type() Getter} - {@linkplain #parentWindow$type(long) Setter}
 *
 * <h3>parentWindow$handle</h3>
 * <p>{@linkplain #parentWindow$handle() Getter} - {@linkplain #parentWindow$handle(MemorySegment) Setter}
 *
 * <h2>Layout</h2>
 * {@snippet lang=c:
 * typedef struct nfdpickfolderu8args_t {
 *     const nfdu8char_t* defaultPath; // @link substring="defaultPath" target=#defaultPath()
 *     nfdwindowhandle_t parentWindow;
 * } NFDPickFolderU8Args;
 * }
 */
public interface NFDPickFolderU8Args extends Struct<NFDPickFolderU8Args> {
  /**
   * The struct allocator.
   */
  StructAllocator<NFDPickFolderU8Args> OF = new StructAllocator<>(MethodHandles.lookup(), LayoutBuilder.struct()
      .add(Unmarshal.STR_LAYOUT, "defaultPath").add(NFDWindowHandle.OF.layout(), "parentWindow")
      .build());

  @Override
  NFDPickFolderU8Args slice(long index, long count);

  @Override
  NFDPickFolderU8Args slice(long index);

  /**
   * {@return {@code defaultPath}}
   */
  @CType("const nfdu8char_t*")
  MemorySegment defaultPath();

  /**
   * Sets {@code defaultPath} with the given value.
   * @return {@code this}
   * @param defaultPath the value
   */
  NFDPickFolderU8Args defaultPath(@CType("const nfdu8char_t*") MemorySegment defaultPath);

  /**
   * {@return {@code parentWindow$type}}
   */
  @CType("size_t")
  long parentWindow$type();

  /**
   * Sets {@code parentWindow$type} with the given value.
   * @return {@code this}
   * @param parentWindow$type the value
   */
  NFDPickFolderU8Args parentWindow$type(@CType("size_t") long parentWindow$type);

  /**
   * {@return {@code parentWindow$handle}}
   */
  @CType("void*")
  MemorySegment parentWindow$handle();

  /**
   * Sets {@code parentWindow$handle} with the given value.
   * @return {@code this}
   * @param parentWindow$handle the value
   */
  NFDPickFolderU8Args parentWindow$handle(@CType("void*") MemorySegment parentWindow$handle);
}
