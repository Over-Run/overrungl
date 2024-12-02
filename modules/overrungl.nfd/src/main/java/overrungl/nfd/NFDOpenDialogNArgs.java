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
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.CType;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

/**
 *
 * <h2>Members</h2>
 *
 * <h3>filterList</h3>
 * <p>{@linkplain #filterList() Getter} - {@linkplain #filterList(MemorySegment) Setter}
 *
 * <h3>filterCount</h3>
 * <p>{@linkplain #filterCount() Getter} - {@linkplain #filterCount(int) Setter}
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
 * typedef struct nfdopendialognargs_t {
 *     const nfdnfilteritem_t* filterList; // @link substring="filterList" target=#filterList()
 *     nfdfiltersize_t filterCount; // @link substring="filterCount" target=#filterCount()
 *     const nfdnchar_t* defaultPath; // @link substring="defaultPath" target=#defaultPath()
 *     nfdwindowhandle_t parentWindow;
 * } NFDOpenDialogNArgs;
 * }
 */
public interface NFDOpenDialogNArgs extends Struct<NFDOpenDialogNArgs> {
  /**
   * The struct allocator.
   */
  StructAllocator<NFDOpenDialogNArgs> OF = new StructAllocator<>(MethodHandles.lookup(), LayoutBuilder.struct()
      .add(ValueLayout.ADDRESS, "filterList").add(ValueLayout.JAVA_INT, "filterCount")
      .add(Unmarshal.STR_LAYOUT, "defaultPath").add(NFDWindowHandle.OF.layout(), "parentWindow")
      .build());

  @Override
  NFDOpenDialogNArgs slice(long index, long count);

  @Override
  NFDOpenDialogNArgs slice(long index);

  /**
   * {@return {@code filterList}}
   */
  @CType("const nfdnfilteritem_t*")
  MemorySegment filterList();

  /**
   * Sets {@code filterList} with the given value.
   * @return {@code this}
   * @param filterList the value
   */
  NFDOpenDialogNArgs filterList(@CType("const nfdnfilteritem_t*") MemorySegment filterList);

  /**
   * {@return {@code filterCount}}
   */
  @CType("nfdfiltersize_t")
  int filterCount();

  /**
   * Sets {@code filterCount} with the given value.
   * @return {@code this}
   * @param filterCount the value
   */
  NFDOpenDialogNArgs filterCount(@CType("nfdfiltersize_t") int filterCount);

  /**
   * {@return {@code defaultPath}}
   */
  @CType("const nfdnchar_t*")
  MemorySegment defaultPath();

  /**
   * Sets {@code defaultPath} with the given value.
   * @return {@code this}
   * @param defaultPath the value
   */
  NFDOpenDialogNArgs defaultPath(@CType("const nfdnchar_t*") MemorySegment defaultPath);

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
  NFDOpenDialogNArgs parentWindow$type(@CType("size_t") long parentWindow$type);

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
  NFDOpenDialogNArgs parentWindow$handle(@CType("void*") MemorySegment parentWindow$handle);
}
