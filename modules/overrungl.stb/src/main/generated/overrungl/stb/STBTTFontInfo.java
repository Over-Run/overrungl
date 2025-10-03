// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `STBTTFontInfo`.
/// ## Layout
/// ```
/// struct STBTTFontInfo {
///     void* userdata;
///     unsigned char* data;
///     int fontstart;
///     int numGlyphs;
///     int loca;
///     int head;
///     int glyf;
///     int hhea;
///     int hmtx;
///     int kern;
///     int gpos;
///     int svg;
///     int index_map;
///     int indexToLocFormat;
///     (struct STBTT__buf) stbtt__buf cff;
///     (struct STBTT__buf) stbtt__buf charstrings;
///     (struct STBTT__buf) stbtt__buf gsubrs;
///     (struct STBTT__buf) stbtt__buf subrs;
///     (struct STBTT__buf) stbtt__buf fontdicts;
///     (struct STBTT__buf) stbtt__buf fdselect;
/// };
/// ```
public final class STBTTFontInfo extends GroupType {
    /// The struct layout of `STBTTFontInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("userdata"),
        ValueLayout.ADDRESS.withName("data"),
        ValueLayout.JAVA_INT.withName("fontstart"),
        ValueLayout.JAVA_INT.withName("numGlyphs"),
        ValueLayout.JAVA_INT.withName("loca"),
        ValueLayout.JAVA_INT.withName("head"),
        ValueLayout.JAVA_INT.withName("glyf"),
        ValueLayout.JAVA_INT.withName("hhea"),
        ValueLayout.JAVA_INT.withName("hmtx"),
        ValueLayout.JAVA_INT.withName("kern"),
        ValueLayout.JAVA_INT.withName("gpos"),
        ValueLayout.JAVA_INT.withName("svg"),
        ValueLayout.JAVA_INT.withName("index_map"),
        ValueLayout.JAVA_INT.withName("indexToLocFormat"),
        STBTT__buf.LAYOUT.withName("cff"),
        STBTT__buf.LAYOUT.withName("charstrings"),
        STBTT__buf.LAYOUT.withName("gsubrs"),
        STBTT__buf.LAYOUT.withName("subrs"),
        STBTT__buf.LAYOUT.withName("fontdicts"),
        STBTT__buf.LAYOUT.withName("fdselect")
    );
    /// The byte offset of `userdata`.
    public static final long OFFSET_userdata = LAYOUT.byteOffset(PathElement.groupElement("userdata"));
    /// The memory layout of `userdata`.
    public static final MemoryLayout LAYOUT_userdata = LAYOUT.select(PathElement.groupElement("userdata"));
    /// The [VarHandle] of `userdata` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_userdata = LAYOUT.arrayElementVarHandle(PathElement.groupElement("userdata"));
    /// The byte offset of `data`.
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    /// The memory layout of `data`.
    public static final MemoryLayout LAYOUT_data = LAYOUT.select(PathElement.groupElement("data"));
    /// The [VarHandle] of `data` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_data = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"));
    /// The byte offset of `fontstart`.
    public static final long OFFSET_fontstart = LAYOUT.byteOffset(PathElement.groupElement("fontstart"));
    /// The memory layout of `fontstart`.
    public static final MemoryLayout LAYOUT_fontstart = LAYOUT.select(PathElement.groupElement("fontstart"));
    /// The [VarHandle] of `fontstart` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fontstart = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fontstart"));
    /// The byte offset of `numGlyphs`.
    public static final long OFFSET_numGlyphs = LAYOUT.byteOffset(PathElement.groupElement("numGlyphs"));
    /// The memory layout of `numGlyphs`.
    public static final MemoryLayout LAYOUT_numGlyphs = LAYOUT.select(PathElement.groupElement("numGlyphs"));
    /// The [VarHandle] of `numGlyphs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_numGlyphs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numGlyphs"));
    /// The byte offset of `loca`.
    public static final long OFFSET_loca = LAYOUT.byteOffset(PathElement.groupElement("loca"));
    /// The memory layout of `loca`.
    public static final MemoryLayout LAYOUT_loca = LAYOUT.select(PathElement.groupElement("loca"));
    /// The [VarHandle] of `loca` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_loca = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loca"));
    /// The byte offset of `head`.
    public static final long OFFSET_head = LAYOUT.byteOffset(PathElement.groupElement("head"));
    /// The memory layout of `head`.
    public static final MemoryLayout LAYOUT_head = LAYOUT.select(PathElement.groupElement("head"));
    /// The [VarHandle] of `head` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_head = LAYOUT.arrayElementVarHandle(PathElement.groupElement("head"));
    /// The byte offset of `glyf`.
    public static final long OFFSET_glyf = LAYOUT.byteOffset(PathElement.groupElement("glyf"));
    /// The memory layout of `glyf`.
    public static final MemoryLayout LAYOUT_glyf = LAYOUT.select(PathElement.groupElement("glyf"));
    /// The [VarHandle] of `glyf` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_glyf = LAYOUT.arrayElementVarHandle(PathElement.groupElement("glyf"));
    /// The byte offset of `hhea`.
    public static final long OFFSET_hhea = LAYOUT.byteOffset(PathElement.groupElement("hhea"));
    /// The memory layout of `hhea`.
    public static final MemoryLayout LAYOUT_hhea = LAYOUT.select(PathElement.groupElement("hhea"));
    /// The [VarHandle] of `hhea` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hhea = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hhea"));
    /// The byte offset of `hmtx`.
    public static final long OFFSET_hmtx = LAYOUT.byteOffset(PathElement.groupElement("hmtx"));
    /// The memory layout of `hmtx`.
    public static final MemoryLayout LAYOUT_hmtx = LAYOUT.select(PathElement.groupElement("hmtx"));
    /// The [VarHandle] of `hmtx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hmtx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hmtx"));
    /// The byte offset of `kern`.
    public static final long OFFSET_kern = LAYOUT.byteOffset(PathElement.groupElement("kern"));
    /// The memory layout of `kern`.
    public static final MemoryLayout LAYOUT_kern = LAYOUT.select(PathElement.groupElement("kern"));
    /// The [VarHandle] of `kern` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_kern = LAYOUT.arrayElementVarHandle(PathElement.groupElement("kern"));
    /// The byte offset of `gpos`.
    public static final long OFFSET_gpos = LAYOUT.byteOffset(PathElement.groupElement("gpos"));
    /// The memory layout of `gpos`.
    public static final MemoryLayout LAYOUT_gpos = LAYOUT.select(PathElement.groupElement("gpos"));
    /// The [VarHandle] of `gpos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_gpos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gpos"));
    /// The byte offset of `svg`.
    public static final long OFFSET_svg = LAYOUT.byteOffset(PathElement.groupElement("svg"));
    /// The memory layout of `svg`.
    public static final MemoryLayout LAYOUT_svg = LAYOUT.select(PathElement.groupElement("svg"));
    /// The [VarHandle] of `svg` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_svg = LAYOUT.arrayElementVarHandle(PathElement.groupElement("svg"));
    /// The byte offset of `index_map`.
    public static final long OFFSET_index_map = LAYOUT.byteOffset(PathElement.groupElement("index_map"));
    /// The memory layout of `index_map`.
    public static final MemoryLayout LAYOUT_index_map = LAYOUT.select(PathElement.groupElement("index_map"));
    /// The [VarHandle] of `index_map` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_index_map = LAYOUT.arrayElementVarHandle(PathElement.groupElement("index_map"));
    /// The byte offset of `indexToLocFormat`.
    public static final long OFFSET_indexToLocFormat = LAYOUT.byteOffset(PathElement.groupElement("indexToLocFormat"));
    /// The memory layout of `indexToLocFormat`.
    public static final MemoryLayout LAYOUT_indexToLocFormat = LAYOUT.select(PathElement.groupElement("indexToLocFormat"));
    /// The [VarHandle] of `indexToLocFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexToLocFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexToLocFormat"));
    /// The byte offset of `cff`.
    public static final long OFFSET_cff = LAYOUT.byteOffset(PathElement.groupElement("cff"));
    /// The memory layout of `cff`.
    public static final MemoryLayout LAYOUT_cff = LAYOUT.select(PathElement.groupElement("cff"));
    /// The byte offset of `charstrings`.
    public static final long OFFSET_charstrings = LAYOUT.byteOffset(PathElement.groupElement("charstrings"));
    /// The memory layout of `charstrings`.
    public static final MemoryLayout LAYOUT_charstrings = LAYOUT.select(PathElement.groupElement("charstrings"));
    /// The byte offset of `gsubrs`.
    public static final long OFFSET_gsubrs = LAYOUT.byteOffset(PathElement.groupElement("gsubrs"));
    /// The memory layout of `gsubrs`.
    public static final MemoryLayout LAYOUT_gsubrs = LAYOUT.select(PathElement.groupElement("gsubrs"));
    /// The byte offset of `subrs`.
    public static final long OFFSET_subrs = LAYOUT.byteOffset(PathElement.groupElement("subrs"));
    /// The memory layout of `subrs`.
    public static final MemoryLayout LAYOUT_subrs = LAYOUT.select(PathElement.groupElement("subrs"));
    /// The byte offset of `fontdicts`.
    public static final long OFFSET_fontdicts = LAYOUT.byteOffset(PathElement.groupElement("fontdicts"));
    /// The memory layout of `fontdicts`.
    public static final MemoryLayout LAYOUT_fontdicts = LAYOUT.select(PathElement.groupElement("fontdicts"));
    /// The byte offset of `fdselect`.
    public static final long OFFSET_fdselect = LAYOUT.byteOffset(PathElement.groupElement("fdselect"));
    /// The memory layout of `fdselect`.
    public static final MemoryLayout LAYOUT_fdselect = LAYOUT.select(PathElement.groupElement("fdselect"));

    /// Creates `STBTTFontInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public STBTTFontInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `STBTTFontInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTFontInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTFontInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `STBTTFontInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTFontInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTFontInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `STBTTFontInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static STBTTFontInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new STBTTFontInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `STBTTFontInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `STBTTFontInfo`
    public static STBTTFontInfo alloc(SegmentAllocator allocator) { return new STBTTFontInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `STBTTFontInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `STBTTFontInfo`
    public static STBTTFontInfo alloc(SegmentAllocator allocator, long count) { return new STBTTFontInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public STBTTFontInfo copyFrom(STBTTFontInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public STBTTFontInfo reinterpret(long count) { return new STBTTFontInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `userdata` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment userdata(MemorySegment segment, long index) { return (MemorySegment) VH_userdata.get(segment, 0L, index); }
    /// {@return `userdata`}
    public MemorySegment userdata() { return userdata(this.segment(), 0L); }
    /// Sets `userdata` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void userdata(MemorySegment segment, long index, MemorySegment value) { VH_userdata.set(segment, 0L, index, value); }
    /// Sets `userdata` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo userdata(MemorySegment value) { userdata(this.segment(), 0L, value); return this; }

    /// {@return `data` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment data(MemorySegment segment, long index) { return (MemorySegment) VH_data.get(segment, 0L, index); }
    /// {@return `data`}
    public MemorySegment data() { return data(this.segment(), 0L); }
    /// Sets `data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void data(MemorySegment segment, long index, MemorySegment value) { VH_data.set(segment, 0L, index, value); }
    /// Sets `data` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo data(MemorySegment value) { data(this.segment(), 0L, value); return this; }

    /// {@return `fontstart` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fontstart(MemorySegment segment, long index) { return (int) VH_fontstart.get(segment, 0L, index); }
    /// {@return `fontstart`}
    public int fontstart() { return fontstart(this.segment(), 0L); }
    /// Sets `fontstart` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fontstart(MemorySegment segment, long index, int value) { VH_fontstart.set(segment, 0L, index, value); }
    /// Sets `fontstart` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo fontstart(int value) { fontstart(this.segment(), 0L, value); return this; }

    /// {@return `numGlyphs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numGlyphs(MemorySegment segment, long index) { return (int) VH_numGlyphs.get(segment, 0L, index); }
    /// {@return `numGlyphs`}
    public int numGlyphs() { return numGlyphs(this.segment(), 0L); }
    /// Sets `numGlyphs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numGlyphs(MemorySegment segment, long index, int value) { VH_numGlyphs.set(segment, 0L, index, value); }
    /// Sets `numGlyphs` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo numGlyphs(int value) { numGlyphs(this.segment(), 0L, value); return this; }

    /// {@return `loca` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int loca(MemorySegment segment, long index) { return (int) VH_loca.get(segment, 0L, index); }
    /// {@return `loca`}
    public int loca() { return loca(this.segment(), 0L); }
    /// Sets `loca` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void loca(MemorySegment segment, long index, int value) { VH_loca.set(segment, 0L, index, value); }
    /// Sets `loca` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo loca(int value) { loca(this.segment(), 0L, value); return this; }

    /// {@return `head` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int head(MemorySegment segment, long index) { return (int) VH_head.get(segment, 0L, index); }
    /// {@return `head`}
    public int head() { return head(this.segment(), 0L); }
    /// Sets `head` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void head(MemorySegment segment, long index, int value) { VH_head.set(segment, 0L, index, value); }
    /// Sets `head` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo head(int value) { head(this.segment(), 0L, value); return this; }

    /// {@return `glyf` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int glyf(MemorySegment segment, long index) { return (int) VH_glyf.get(segment, 0L, index); }
    /// {@return `glyf`}
    public int glyf() { return glyf(this.segment(), 0L); }
    /// Sets `glyf` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void glyf(MemorySegment segment, long index, int value) { VH_glyf.set(segment, 0L, index, value); }
    /// Sets `glyf` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo glyf(int value) { glyf(this.segment(), 0L, value); return this; }

    /// {@return `hhea` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int hhea(MemorySegment segment, long index) { return (int) VH_hhea.get(segment, 0L, index); }
    /// {@return `hhea`}
    public int hhea() { return hhea(this.segment(), 0L); }
    /// Sets `hhea` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hhea(MemorySegment segment, long index, int value) { VH_hhea.set(segment, 0L, index, value); }
    /// Sets `hhea` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo hhea(int value) { hhea(this.segment(), 0L, value); return this; }

    /// {@return `hmtx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int hmtx(MemorySegment segment, long index) { return (int) VH_hmtx.get(segment, 0L, index); }
    /// {@return `hmtx`}
    public int hmtx() { return hmtx(this.segment(), 0L); }
    /// Sets `hmtx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hmtx(MemorySegment segment, long index, int value) { VH_hmtx.set(segment, 0L, index, value); }
    /// Sets `hmtx` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo hmtx(int value) { hmtx(this.segment(), 0L, value); return this; }

    /// {@return `kern` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int kern(MemorySegment segment, long index) { return (int) VH_kern.get(segment, 0L, index); }
    /// {@return `kern`}
    public int kern() { return kern(this.segment(), 0L); }
    /// Sets `kern` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void kern(MemorySegment segment, long index, int value) { VH_kern.set(segment, 0L, index, value); }
    /// Sets `kern` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo kern(int value) { kern(this.segment(), 0L, value); return this; }

    /// {@return `gpos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int gpos(MemorySegment segment, long index) { return (int) VH_gpos.get(segment, 0L, index); }
    /// {@return `gpos`}
    public int gpos() { return gpos(this.segment(), 0L); }
    /// Sets `gpos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gpos(MemorySegment segment, long index, int value) { VH_gpos.set(segment, 0L, index, value); }
    /// Sets `gpos` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo gpos(int value) { gpos(this.segment(), 0L, value); return this; }

    /// {@return `svg` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int svg(MemorySegment segment, long index) { return (int) VH_svg.get(segment, 0L, index); }
    /// {@return `svg`}
    public int svg() { return svg(this.segment(), 0L); }
    /// Sets `svg` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void svg(MemorySegment segment, long index, int value) { VH_svg.set(segment, 0L, index, value); }
    /// Sets `svg` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo svg(int value) { svg(this.segment(), 0L, value); return this; }

    /// {@return `index_map` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int index_map(MemorySegment segment, long index) { return (int) VH_index_map.get(segment, 0L, index); }
    /// {@return `index_map`}
    public int index_map() { return index_map(this.segment(), 0L); }
    /// Sets `index_map` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void index_map(MemorySegment segment, long index, int value) { VH_index_map.set(segment, 0L, index, value); }
    /// Sets `index_map` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo index_map(int value) { index_map(this.segment(), 0L, value); return this; }

    /// {@return `indexToLocFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int indexToLocFormat(MemorySegment segment, long index) { return (int) VH_indexToLocFormat.get(segment, 0L, index); }
    /// {@return `indexToLocFormat`}
    public int indexToLocFormat() { return indexToLocFormat(this.segment(), 0L); }
    /// Sets `indexToLocFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexToLocFormat(MemorySegment segment, long index, int value) { VH_indexToLocFormat.set(segment, 0L, index, value); }
    /// Sets `indexToLocFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo indexToLocFormat(int value) { indexToLocFormat(this.segment(), 0L, value); return this; }

    /// {@return `cff` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment cff(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_cff, index), LAYOUT_cff); }
    /// {@return `cff`}
    public MemorySegment cff() { return cff(this.segment(), 0L); }
    /// Sets `cff` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cff(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_cff, index), LAYOUT_cff.byteSize()); }
    /// Sets `cff` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo cff(MemorySegment value) { cff(this.segment(), 0L, value); return this; }
    /// Accepts `cff` with the given function.
    /// @param func the function
    /// @return `this`
    public STBTTFontInfo cff(Consumer<STBTT__buf> func) { func.accept(STBTT__buf.of(cff())); return this; }

    /// {@return `charstrings` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment charstrings(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_charstrings, index), LAYOUT_charstrings); }
    /// {@return `charstrings`}
    public MemorySegment charstrings() { return charstrings(this.segment(), 0L); }
    /// Sets `charstrings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void charstrings(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_charstrings, index), LAYOUT_charstrings.byteSize()); }
    /// Sets `charstrings` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo charstrings(MemorySegment value) { charstrings(this.segment(), 0L, value); return this; }
    /// Accepts `charstrings` with the given function.
    /// @param func the function
    /// @return `this`
    public STBTTFontInfo charstrings(Consumer<STBTT__buf> func) { func.accept(STBTT__buf.of(charstrings())); return this; }

    /// {@return `gsubrs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment gsubrs(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_gsubrs, index), LAYOUT_gsubrs); }
    /// {@return `gsubrs`}
    public MemorySegment gsubrs() { return gsubrs(this.segment(), 0L); }
    /// Sets `gsubrs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void gsubrs(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_gsubrs, index), LAYOUT_gsubrs.byteSize()); }
    /// Sets `gsubrs` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo gsubrs(MemorySegment value) { gsubrs(this.segment(), 0L, value); return this; }
    /// Accepts `gsubrs` with the given function.
    /// @param func the function
    /// @return `this`
    public STBTTFontInfo gsubrs(Consumer<STBTT__buf> func) { func.accept(STBTT__buf.of(gsubrs())); return this; }

    /// {@return `subrs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment subrs(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_subrs, index), LAYOUT_subrs); }
    /// {@return `subrs`}
    public MemorySegment subrs() { return subrs(this.segment(), 0L); }
    /// Sets `subrs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subrs(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_subrs, index), LAYOUT_subrs.byteSize()); }
    /// Sets `subrs` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo subrs(MemorySegment value) { subrs(this.segment(), 0L, value); return this; }
    /// Accepts `subrs` with the given function.
    /// @param func the function
    /// @return `this`
    public STBTTFontInfo subrs(Consumer<STBTT__buf> func) { func.accept(STBTT__buf.of(subrs())); return this; }

    /// {@return `fontdicts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment fontdicts(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_fontdicts, index), LAYOUT_fontdicts); }
    /// {@return `fontdicts`}
    public MemorySegment fontdicts() { return fontdicts(this.segment(), 0L); }
    /// Sets `fontdicts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fontdicts(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_fontdicts, index), LAYOUT_fontdicts.byteSize()); }
    /// Sets `fontdicts` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo fontdicts(MemorySegment value) { fontdicts(this.segment(), 0L, value); return this; }
    /// Accepts `fontdicts` with the given function.
    /// @param func the function
    /// @return `this`
    public STBTTFontInfo fontdicts(Consumer<STBTT__buf> func) { func.accept(STBTT__buf.of(fontdicts())); return this; }

    /// {@return `fdselect` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment fdselect(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_fdselect, index), LAYOUT_fdselect); }
    /// {@return `fdselect`}
    public MemorySegment fdselect() { return fdselect(this.segment(), 0L); }
    /// Sets `fdselect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fdselect(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_fdselect, index), LAYOUT_fdselect.byteSize()); }
    /// Sets `fdselect` with the given value.
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo fdselect(MemorySegment value) { fdselect(this.segment(), 0L, value); return this; }
    /// Accepts `fdselect` with the given function.
    /// @param func the function
    /// @return `this`
    public STBTTFontInfo fdselect(Consumer<STBTT__buf> func) { func.accept(STBTT__buf.of(fdselect())); return this; }

    /// Creates a slice of `STBTTFontInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `STBTTFontInfo`
    public STBTTFontInfo asSlice(long index) { return new STBTTFontInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `STBTTFontInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `STBTTFontInfo`
    public STBTTFontInfo asSlice(long index, long count) { return new STBTTFontInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `STBTTFontInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public STBTTFontInfo at(long index, Consumer<STBTTFontInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `userdata` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment userdataAt(long index) { return userdata(this.segment(), index); }
    /// Sets `userdata` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo userdataAt(long index, MemorySegment value) { userdata(this.segment(), index, value); return this; }

    /// {@return `data` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment dataAt(long index) { return data(this.segment(), index); }
    /// Sets `data` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo dataAt(long index, MemorySegment value) { data(this.segment(), index, value); return this; }

    /// {@return `fontstart` at the given index}
    /// @param index the index of the struct buffer
    public int fontstartAt(long index) { return fontstart(this.segment(), index); }
    /// Sets `fontstart` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo fontstartAt(long index, int value) { fontstart(this.segment(), index, value); return this; }

    /// {@return `numGlyphs` at the given index}
    /// @param index the index of the struct buffer
    public int numGlyphsAt(long index) { return numGlyphs(this.segment(), index); }
    /// Sets `numGlyphs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo numGlyphsAt(long index, int value) { numGlyphs(this.segment(), index, value); return this; }

    /// {@return `loca` at the given index}
    /// @param index the index of the struct buffer
    public int locaAt(long index) { return loca(this.segment(), index); }
    /// Sets `loca` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo locaAt(long index, int value) { loca(this.segment(), index, value); return this; }

    /// {@return `head` at the given index}
    /// @param index the index of the struct buffer
    public int headAt(long index) { return head(this.segment(), index); }
    /// Sets `head` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo headAt(long index, int value) { head(this.segment(), index, value); return this; }

    /// {@return `glyf` at the given index}
    /// @param index the index of the struct buffer
    public int glyfAt(long index) { return glyf(this.segment(), index); }
    /// Sets `glyf` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo glyfAt(long index, int value) { glyf(this.segment(), index, value); return this; }

    /// {@return `hhea` at the given index}
    /// @param index the index of the struct buffer
    public int hheaAt(long index) { return hhea(this.segment(), index); }
    /// Sets `hhea` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo hheaAt(long index, int value) { hhea(this.segment(), index, value); return this; }

    /// {@return `hmtx` at the given index}
    /// @param index the index of the struct buffer
    public int hmtxAt(long index) { return hmtx(this.segment(), index); }
    /// Sets `hmtx` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo hmtxAt(long index, int value) { hmtx(this.segment(), index, value); return this; }

    /// {@return `kern` at the given index}
    /// @param index the index of the struct buffer
    public int kernAt(long index) { return kern(this.segment(), index); }
    /// Sets `kern` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo kernAt(long index, int value) { kern(this.segment(), index, value); return this; }

    /// {@return `gpos` at the given index}
    /// @param index the index of the struct buffer
    public int gposAt(long index) { return gpos(this.segment(), index); }
    /// Sets `gpos` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo gposAt(long index, int value) { gpos(this.segment(), index, value); return this; }

    /// {@return `svg` at the given index}
    /// @param index the index of the struct buffer
    public int svgAt(long index) { return svg(this.segment(), index); }
    /// Sets `svg` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo svgAt(long index, int value) { svg(this.segment(), index, value); return this; }

    /// {@return `index_map` at the given index}
    /// @param index the index of the struct buffer
    public int index_mapAt(long index) { return index_map(this.segment(), index); }
    /// Sets `index_map` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo index_mapAt(long index, int value) { index_map(this.segment(), index, value); return this; }

    /// {@return `indexToLocFormat` at the given index}
    /// @param index the index of the struct buffer
    public int indexToLocFormatAt(long index) { return indexToLocFormat(this.segment(), index); }
    /// Sets `indexToLocFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo indexToLocFormatAt(long index, int value) { indexToLocFormat(this.segment(), index, value); return this; }

    /// {@return `cff` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment cffAt(long index) { return cff(this.segment(), index); }
    /// Sets `cff` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo cffAt(long index, MemorySegment value) { cff(this.segment(), index, value); return this; }
    /// Accepts `cff` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public STBTTFontInfo cffAt(long index, Consumer<STBTT__buf> func) { func.accept(STBTT__buf.of(cffAt(index))); return this; }

    /// {@return `charstrings` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment charstringsAt(long index) { return charstrings(this.segment(), index); }
    /// Sets `charstrings` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo charstringsAt(long index, MemorySegment value) { charstrings(this.segment(), index, value); return this; }
    /// Accepts `charstrings` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public STBTTFontInfo charstringsAt(long index, Consumer<STBTT__buf> func) { func.accept(STBTT__buf.of(charstringsAt(index))); return this; }

    /// {@return `gsubrs` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment gsubrsAt(long index) { return gsubrs(this.segment(), index); }
    /// Sets `gsubrs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo gsubrsAt(long index, MemorySegment value) { gsubrs(this.segment(), index, value); return this; }
    /// Accepts `gsubrs` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public STBTTFontInfo gsubrsAt(long index, Consumer<STBTT__buf> func) { func.accept(STBTT__buf.of(gsubrsAt(index))); return this; }

    /// {@return `subrs` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment subrsAt(long index) { return subrs(this.segment(), index); }
    /// Sets `subrs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo subrsAt(long index, MemorySegment value) { subrs(this.segment(), index, value); return this; }
    /// Accepts `subrs` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public STBTTFontInfo subrsAt(long index, Consumer<STBTT__buf> func) { func.accept(STBTT__buf.of(subrsAt(index))); return this; }

    /// {@return `fontdicts` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment fontdictsAt(long index) { return fontdicts(this.segment(), index); }
    /// Sets `fontdicts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo fontdictsAt(long index, MemorySegment value) { fontdicts(this.segment(), index, value); return this; }
    /// Accepts `fontdicts` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public STBTTFontInfo fontdictsAt(long index, Consumer<STBTT__buf> func) { func.accept(STBTT__buf.of(fontdictsAt(index))); return this; }

    /// {@return `fdselect` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment fdselectAt(long index) { return fdselect(this.segment(), index); }
    /// Sets `fdselect` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public STBTTFontInfo fdselectAt(long index, MemorySegment value) { fdselect(this.segment(), index, value); return this; }
    /// Accepts `fdselect` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public STBTTFontInfo fdselectAt(long index, Consumer<STBTT__buf> func) { func.accept(STBTT__buf.of(fdselectAt(index))); return this; }

}
