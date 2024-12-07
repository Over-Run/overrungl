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
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandles;
import overrun.marshal.LayoutBuilder;
import overrun.marshal.gen.CType;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

/**
 * The native window handle. <p>If using a platform abstraction framework (e.g. SDL2), this should be
 * obtained using the corresponding NFD glue header (e.g. nfd_sdl2.h).
 * <h2>Members</h2>
 *
 * <h3>type</h3>
 * <p>{@linkplain #type() Getter} - {@linkplain #type(long) Setter}
 *
 * <h3>handle</h3>
 * <p>{@linkplain #handle() Getter} - {@linkplain #handle(MemorySegment) Setter}
 *
 * <h2>Layout</h2>
 * {@snippet lang=c:
 * typedef struct nfdwindowhandle_t {
 *     size_t type; // @link substring="type" target=#type()
 *     void* handle; // @link substring="handle" target=#handle()
 * } NFDWindowHandle;
 * }
 */
public interface NFDWindowHandle extends Struct<NFDWindowHandle> {
  /**
   * The struct allocator.
   */
  StructAllocator<NFDWindowHandle> OF = new StructAllocator<>(MethodHandles.lookup(), LayoutBuilder.struct()
      .add(ValueLayout.JAVA_LONG, "type").add(ValueLayout.ADDRESS, "handle").build());

  @Override
  NFDWindowHandle slice(long index, long count);

  @Override
  NFDWindowHandle slice(long index);

  /**
   * {@return {@code type}}
   */
  @CType("size_t")
  long type();

  /**
   * Sets {@code type} with the given value.
   * @return {@code this}
   * @param type the value
   */
  NFDWindowHandle type(@CType("size_t") long type);

  /**
   * {@return {@code handle}}
   */
  @CType("void*")
  MemorySegment handle();

  /**
   * Sets {@code handle} with the given value.
   * @return {@code this}
   * @param handle the value
   */
  NFDWindowHandle handle(@CType("void*") MemorySegment handle);
}
