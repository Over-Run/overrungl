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
 * <h3>defaultName</h3>
 * <p>{@linkplain #defaultName() Getter} - {@linkplain #defaultName(MemorySegment) Setter}
 *
 * <h3>parentWindow$type</h3>
 * <p>{@linkplain #parentWindow$type() Getter} - {@linkplain #parentWindow$type(long) Setter}
 *
 * <h3>parentWindow$handle</h3>
 * <p>{@linkplain #parentWindow$handle() Getter} - {@linkplain #parentWindow$handle(MemorySegment) Setter}
 *
 * <h2>Layout</h2>
 * {@snippet lang=c:
 * typedef struct nfdsavedialogu8args_t {
 *     const nfdu8filteritem_t* filterList; // @link substring="filterList" target=#filterList()
 *     nfdfiltersize_t filterCount; // @link substring="filterCount" target=#filterCount()
 *     const nfdu8char_t* defaultPath; // @link substring="defaultPath" target=#defaultPath()
 *     const nfdu8char_t* defaultName; // @link substring="defaultName" target=#defaultName()
 *     nfdwindowhandle_t parentWindow;
 * } NFDSaveDialogU8Args;
 * }
 */
public interface NFDSaveDialogU8Args extends Struct<NFDSaveDialogU8Args> {
  /**
   * The struct allocator.
   */
  StructAllocator<NFDSaveDialogU8Args> OF = new StructAllocator<>(MethodHandles.lookup(), LayoutBuilder.struct()
      .add(ValueLayout.ADDRESS, "filterList").add(ValueLayout.JAVA_INT, "filterCount")
      .add(Unmarshal.STR_LAYOUT, "defaultPath").add(Unmarshal.STR_LAYOUT, "defaultName")
      .add(NFDWindowHandle.OF.layout(), "parentWindow").build());

  @Override
  NFDSaveDialogU8Args slice(long index, long count);

  @Override
  NFDSaveDialogU8Args slice(long index);

  /**
   * {@return {@code filterList}}
   */
  @CType("const nfdu8filteritem_t*")
  MemorySegment filterList();

  /**
   * Sets {@code filterList} with the given value.
   * @return {@code this}
   * @param filterList the value
   */
  NFDSaveDialogU8Args filterList(@CType("const nfdu8filteritem_t*") MemorySegment filterList);

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
  NFDSaveDialogU8Args filterCount(@CType("nfdfiltersize_t") int filterCount);

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
  NFDSaveDialogU8Args defaultPath(@CType("const nfdu8char_t*") MemorySegment defaultPath);

  /**
   * {@return {@code defaultName}}
   */
  @CType("const nfdu8char_t*")
  MemorySegment defaultName();

  /**
   * Sets {@code defaultName} with the given value.
   * @return {@code this}
   * @param defaultName the value
   */
  NFDSaveDialogU8Args defaultName(@CType("const nfdu8char_t*") MemorySegment defaultName);

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
  NFDSaveDialogU8Args parentWindow$type(@CType("size_t") long parentWindow$type);

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
  NFDSaveDialogU8Args parentWindow$handle(@CType("void*") MemorySegment parentWindow$handle);
}
