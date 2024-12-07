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
import java.lang.SafeVarargs;
import java.lang.String;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import overrun.marshal.LayoutBuilder;
import overrun.marshal.Marshal;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.CType;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

/**
 * UTF-16 Filter Item
 * <h2>Members</h2>
 *
 * <h3>name</h3>
 * <p>{@linkplain #name() Getter} - {@linkplain #name(MemorySegment) Setter}
 *
 * <h3>spec</h3>
 * <p>{@linkplain #spec() Getter} - {@linkplain #spec(MemorySegment) Setter}
 *
 * <h2>Layout</h2>
 * {@snippet lang=c:
 * typedef struct nfdnfilteritem_t {
 *     const nfdnchar_t* name; // @link substring="name" target=#name()
 *     const nfdnchar_t* spec; // @link substring="spec" target=#spec()
 * } NFDNFilterItem;
 * }
 */
public interface NFDNFilterItem extends Struct<NFDNFilterItem> {
  /**
   * The struct allocator.
   */
  StructAllocator<NFDNFilterItem> OF = new StructAllocator<>(MethodHandles.lookup(), LayoutBuilder.struct()
      .add(Unmarshal.STR_LAYOUT, "name").add(Unmarshal.STR_LAYOUT, "spec").build());

  @Override
  NFDNFilterItem slice(long index, long count);

  @Override
  NFDNFilterItem slice(long index);

  /**
   * {@return {@code name}}
   */
  @CType("const nfdnchar_t*")
  MemorySegment name();

  /**
   * Sets {@code name} with the given value.
   * @return {@code this}
   * @param name the value
   */
  NFDNFilterItem name(@CType("const nfdnchar_t*") MemorySegment name);

  /**
   * {@return {@code spec}}
   */
  @CType("const nfdnchar_t*")
  MemorySegment spec();

  /**
   * Sets {@code spec} with the given value.
   * @return {@code this}
   * @param spec the value
   */
  NFDNFilterItem spec(@CType("const nfdnchar_t*") MemorySegment spec);

  static NFDNFilterItem create(SegmentAllocator allocator, String name, String spec) {
    return NFDNFilterItem.OF.of(allocator).name(Marshal.marshal(allocator, name, NFDInternal.nfdCharset)).spec(Marshal.marshal(allocator, spec, NFDInternal.nfdCharset));
  }

  @SafeVarargs
  static NFDNFilterItem create(SegmentAllocator allocator, Map.Entry<String, String>... entries) {
    var of = NFDNFilterItem.OF.of(allocator, entries.length);
    for (int i = 0; i < entries.length; i++) {
      var e = entries[i];
      of.slice(i).name(Marshal.marshal(allocator, e.getKey(), NFDInternal.nfdCharset)).spec(Marshal.marshal(allocator, e.getValue(), NFDInternal.nfdCharset));
    }
    return of;
  }
}
