// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSRTDataNV`.
/// ## Layout
/// ```
/// struct VkSRTDataNV {
///     float sx;
///     float a;
///     float b;
///     float pvx;
///     float sy;
///     float c;
///     float pvy;
///     float sz;
///     float pvz;
///     float qx;
///     float qy;
///     float qz;
///     float qw;
///     float tx;
///     float ty;
///     float tz;
/// };
/// ```
public final class VkSRTDataNV extends GroupType {
    /// The struct layout of `VkSRTDataNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("sx"),
        ValueLayout.JAVA_FLOAT.withName("a"),
        ValueLayout.JAVA_FLOAT.withName("b"),
        ValueLayout.JAVA_FLOAT.withName("pvx"),
        ValueLayout.JAVA_FLOAT.withName("sy"),
        ValueLayout.JAVA_FLOAT.withName("c"),
        ValueLayout.JAVA_FLOAT.withName("pvy"),
        ValueLayout.JAVA_FLOAT.withName("sz"),
        ValueLayout.JAVA_FLOAT.withName("pvz"),
        ValueLayout.JAVA_FLOAT.withName("qx"),
        ValueLayout.JAVA_FLOAT.withName("qy"),
        ValueLayout.JAVA_FLOAT.withName("qz"),
        ValueLayout.JAVA_FLOAT.withName("qw"),
        ValueLayout.JAVA_FLOAT.withName("tx"),
        ValueLayout.JAVA_FLOAT.withName("ty"),
        ValueLayout.JAVA_FLOAT.withName("tz")
    );
    /// The byte offset of `sx`.
    public static final long OFFSET_sx = LAYOUT.byteOffset(PathElement.groupElement("sx"));
    /// The memory layout of `sx`.
    public static final MemoryLayout LAYOUT_sx = LAYOUT.select(PathElement.groupElement("sx"));
    /// The [VarHandle] of `sx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sx = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sx")));
    /// The byte offset of `a`.
    public static final long OFFSET_a = LAYOUT.byteOffset(PathElement.groupElement("a"));
    /// The memory layout of `a`.
    public static final MemoryLayout LAYOUT_a = LAYOUT.select(PathElement.groupElement("a"));
    /// The [VarHandle] of `a` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_a = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("a")));
    /// The byte offset of `b`.
    public static final long OFFSET_b = LAYOUT.byteOffset(PathElement.groupElement("b"));
    /// The memory layout of `b`.
    public static final MemoryLayout LAYOUT_b = LAYOUT.select(PathElement.groupElement("b"));
    /// The [VarHandle] of `b` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_b = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("b")));
    /// The byte offset of `pvx`.
    public static final long OFFSET_pvx = LAYOUT.byteOffset(PathElement.groupElement("pvx"));
    /// The memory layout of `pvx`.
    public static final MemoryLayout LAYOUT_pvx = LAYOUT.select(PathElement.groupElement("pvx"));
    /// The [VarHandle] of `pvx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pvx = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pvx")));
    /// The byte offset of `sy`.
    public static final long OFFSET_sy = LAYOUT.byteOffset(PathElement.groupElement("sy"));
    /// The memory layout of `sy`.
    public static final MemoryLayout LAYOUT_sy = LAYOUT.select(PathElement.groupElement("sy"));
    /// The [VarHandle] of `sy` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sy = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sy")));
    /// The byte offset of `c`.
    public static final long OFFSET_c = LAYOUT.byteOffset(PathElement.groupElement("c"));
    /// The memory layout of `c`.
    public static final MemoryLayout LAYOUT_c = LAYOUT.select(PathElement.groupElement("c"));
    /// The [VarHandle] of `c` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_c = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("c")));
    /// The byte offset of `pvy`.
    public static final long OFFSET_pvy = LAYOUT.byteOffset(PathElement.groupElement("pvy"));
    /// The memory layout of `pvy`.
    public static final MemoryLayout LAYOUT_pvy = LAYOUT.select(PathElement.groupElement("pvy"));
    /// The [VarHandle] of `pvy` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pvy = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pvy")));
    /// The byte offset of `sz`.
    public static final long OFFSET_sz = LAYOUT.byteOffset(PathElement.groupElement("sz"));
    /// The memory layout of `sz`.
    public static final MemoryLayout LAYOUT_sz = LAYOUT.select(PathElement.groupElement("sz"));
    /// The [VarHandle] of `sz` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sz = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sz")));
    /// The byte offset of `pvz`.
    public static final long OFFSET_pvz = LAYOUT.byteOffset(PathElement.groupElement("pvz"));
    /// The memory layout of `pvz`.
    public static final MemoryLayout LAYOUT_pvz = LAYOUT.select(PathElement.groupElement("pvz"));
    /// The [VarHandle] of `pvz` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pvz = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pvz")));
    /// The byte offset of `qx`.
    public static final long OFFSET_qx = LAYOUT.byteOffset(PathElement.groupElement("qx"));
    /// The memory layout of `qx`.
    public static final MemoryLayout LAYOUT_qx = LAYOUT.select(PathElement.groupElement("qx"));
    /// The [VarHandle] of `qx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_qx = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("qx")));
    /// The byte offset of `qy`.
    public static final long OFFSET_qy = LAYOUT.byteOffset(PathElement.groupElement("qy"));
    /// The memory layout of `qy`.
    public static final MemoryLayout LAYOUT_qy = LAYOUT.select(PathElement.groupElement("qy"));
    /// The [VarHandle] of `qy` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_qy = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("qy")));
    /// The byte offset of `qz`.
    public static final long OFFSET_qz = LAYOUT.byteOffset(PathElement.groupElement("qz"));
    /// The memory layout of `qz`.
    public static final MemoryLayout LAYOUT_qz = LAYOUT.select(PathElement.groupElement("qz"));
    /// The [VarHandle] of `qz` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_qz = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("qz")));
    /// The byte offset of `qw`.
    public static final long OFFSET_qw = LAYOUT.byteOffset(PathElement.groupElement("qw"));
    /// The memory layout of `qw`.
    public static final MemoryLayout LAYOUT_qw = LAYOUT.select(PathElement.groupElement("qw"));
    /// The [VarHandle] of `qw` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_qw = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("qw")));
    /// The byte offset of `tx`.
    public static final long OFFSET_tx = LAYOUT.byteOffset(PathElement.groupElement("tx"));
    /// The memory layout of `tx`.
    public static final MemoryLayout LAYOUT_tx = LAYOUT.select(PathElement.groupElement("tx"));
    /// The [VarHandle] of `tx` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_tx = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("tx")));
    /// The byte offset of `ty`.
    public static final long OFFSET_ty = LAYOUT.byteOffset(PathElement.groupElement("ty"));
    /// The memory layout of `ty`.
    public static final MemoryLayout LAYOUT_ty = LAYOUT.select(PathElement.groupElement("ty"));
    /// The [VarHandle] of `ty` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_ty = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("ty")));
    /// The byte offset of `tz`.
    public static final long OFFSET_tz = LAYOUT.byteOffset(PathElement.groupElement("tz"));
    /// The memory layout of `tz`.
    public static final MemoryLayout LAYOUT_tz = LAYOUT.select(PathElement.groupElement("tz"));
    /// The [VarHandle] of `tz` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_tz = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("tz")));

    /// Creates `VkSRTDataNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSRTDataNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSRTDataNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSRTDataNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSRTDataNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSRTDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSRTDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSRTDataNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSRTDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSRTDataNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSRTDataNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSRTDataNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSRTDataNV`
    public static VkSRTDataNV alloc(SegmentAllocator allocator) { return new VkSRTDataNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSRTDataNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSRTDataNV`
    public static VkSRTDataNV alloc(SegmentAllocator allocator, long count) { return new VkSRTDataNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSRTDataNV copyFrom(VkSRTDataNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSRTDataNV reinterpret(long count) { return new VkSRTDataNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float sx(MemorySegment segment, long index) { return (float) VH_sx.get().get(segment, 0L, index); }
    /// {@return `sx`}
    public float sx() { return sx(this.segment(), 0L); }
    /// Sets `sx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sx(MemorySegment segment, long index, float value) { VH_sx.get().set(segment, 0L, index, value); }
    /// Sets `sx` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV sx(float value) { sx(this.segment(), 0L, value); return this; }

    /// {@return `a` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float a(MemorySegment segment, long index) { return (float) VH_a.get().get(segment, 0L, index); }
    /// {@return `a`}
    public float a() { return a(this.segment(), 0L); }
    /// Sets `a` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void a(MemorySegment segment, long index, float value) { VH_a.get().set(segment, 0L, index, value); }
    /// Sets `a` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV a(float value) { a(this.segment(), 0L, value); return this; }

    /// {@return `b` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float b(MemorySegment segment, long index) { return (float) VH_b.get().get(segment, 0L, index); }
    /// {@return `b`}
    public float b() { return b(this.segment(), 0L); }
    /// Sets `b` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void b(MemorySegment segment, long index, float value) { VH_b.get().set(segment, 0L, index, value); }
    /// Sets `b` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV b(float value) { b(this.segment(), 0L, value); return this; }

    /// {@return `pvx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float pvx(MemorySegment segment, long index) { return (float) VH_pvx.get().get(segment, 0L, index); }
    /// {@return `pvx`}
    public float pvx() { return pvx(this.segment(), 0L); }
    /// Sets `pvx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pvx(MemorySegment segment, long index, float value) { VH_pvx.get().set(segment, 0L, index, value); }
    /// Sets `pvx` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV pvx(float value) { pvx(this.segment(), 0L, value); return this; }

    /// {@return `sy` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float sy(MemorySegment segment, long index) { return (float) VH_sy.get().get(segment, 0L, index); }
    /// {@return `sy`}
    public float sy() { return sy(this.segment(), 0L); }
    /// Sets `sy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sy(MemorySegment segment, long index, float value) { VH_sy.get().set(segment, 0L, index, value); }
    /// Sets `sy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV sy(float value) { sy(this.segment(), 0L, value); return this; }

    /// {@return `c` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float c(MemorySegment segment, long index) { return (float) VH_c.get().get(segment, 0L, index); }
    /// {@return `c`}
    public float c() { return c(this.segment(), 0L); }
    /// Sets `c` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void c(MemorySegment segment, long index, float value) { VH_c.get().set(segment, 0L, index, value); }
    /// Sets `c` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV c(float value) { c(this.segment(), 0L, value); return this; }

    /// {@return `pvy` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float pvy(MemorySegment segment, long index) { return (float) VH_pvy.get().get(segment, 0L, index); }
    /// {@return `pvy`}
    public float pvy() { return pvy(this.segment(), 0L); }
    /// Sets `pvy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pvy(MemorySegment segment, long index, float value) { VH_pvy.get().set(segment, 0L, index, value); }
    /// Sets `pvy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV pvy(float value) { pvy(this.segment(), 0L, value); return this; }

    /// {@return `sz` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float sz(MemorySegment segment, long index) { return (float) VH_sz.get().get(segment, 0L, index); }
    /// {@return `sz`}
    public float sz() { return sz(this.segment(), 0L); }
    /// Sets `sz` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sz(MemorySegment segment, long index, float value) { VH_sz.get().set(segment, 0L, index, value); }
    /// Sets `sz` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV sz(float value) { sz(this.segment(), 0L, value); return this; }

    /// {@return `pvz` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float pvz(MemorySegment segment, long index) { return (float) VH_pvz.get().get(segment, 0L, index); }
    /// {@return `pvz`}
    public float pvz() { return pvz(this.segment(), 0L); }
    /// Sets `pvz` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pvz(MemorySegment segment, long index, float value) { VH_pvz.get().set(segment, 0L, index, value); }
    /// Sets `pvz` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV pvz(float value) { pvz(this.segment(), 0L, value); return this; }

    /// {@return `qx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float qx(MemorySegment segment, long index) { return (float) VH_qx.get().get(segment, 0L, index); }
    /// {@return `qx`}
    public float qx() { return qx(this.segment(), 0L); }
    /// Sets `qx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void qx(MemorySegment segment, long index, float value) { VH_qx.get().set(segment, 0L, index, value); }
    /// Sets `qx` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qx(float value) { qx(this.segment(), 0L, value); return this; }

    /// {@return `qy` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float qy(MemorySegment segment, long index) { return (float) VH_qy.get().get(segment, 0L, index); }
    /// {@return `qy`}
    public float qy() { return qy(this.segment(), 0L); }
    /// Sets `qy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void qy(MemorySegment segment, long index, float value) { VH_qy.get().set(segment, 0L, index, value); }
    /// Sets `qy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qy(float value) { qy(this.segment(), 0L, value); return this; }

    /// {@return `qz` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float qz(MemorySegment segment, long index) { return (float) VH_qz.get().get(segment, 0L, index); }
    /// {@return `qz`}
    public float qz() { return qz(this.segment(), 0L); }
    /// Sets `qz` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void qz(MemorySegment segment, long index, float value) { VH_qz.get().set(segment, 0L, index, value); }
    /// Sets `qz` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qz(float value) { qz(this.segment(), 0L, value); return this; }

    /// {@return `qw` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float qw(MemorySegment segment, long index) { return (float) VH_qw.get().get(segment, 0L, index); }
    /// {@return `qw`}
    public float qw() { return qw(this.segment(), 0L); }
    /// Sets `qw` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void qw(MemorySegment segment, long index, float value) { VH_qw.get().set(segment, 0L, index, value); }
    /// Sets `qw` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qw(float value) { qw(this.segment(), 0L, value); return this; }

    /// {@return `tx` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float tx(MemorySegment segment, long index) { return (float) VH_tx.get().get(segment, 0L, index); }
    /// {@return `tx`}
    public float tx() { return tx(this.segment(), 0L); }
    /// Sets `tx` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tx(MemorySegment segment, long index, float value) { VH_tx.get().set(segment, 0L, index, value); }
    /// Sets `tx` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV tx(float value) { tx(this.segment(), 0L, value); return this; }

    /// {@return `ty` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float ty(MemorySegment segment, long index) { return (float) VH_ty.get().get(segment, 0L, index); }
    /// {@return `ty`}
    public float ty() { return ty(this.segment(), 0L); }
    /// Sets `ty` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ty(MemorySegment segment, long index, float value) { VH_ty.get().set(segment, 0L, index, value); }
    /// Sets `ty` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV ty(float value) { ty(this.segment(), 0L, value); return this; }

    /// {@return `tz` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float tz(MemorySegment segment, long index) { return (float) VH_tz.get().get(segment, 0L, index); }
    /// {@return `tz`}
    public float tz() { return tz(this.segment(), 0L); }
    /// Sets `tz` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tz(MemorySegment segment, long index, float value) { VH_tz.get().set(segment, 0L, index, value); }
    /// Sets `tz` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV tz(float value) { tz(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSRTDataNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSRTDataNV`
    public VkSRTDataNV asSlice(long index) { return new VkSRTDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSRTDataNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSRTDataNV`
    public VkSRTDataNV asSlice(long index, long count) { return new VkSRTDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSRTDataNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSRTDataNV at(long index, Consumer<VkSRTDataNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sx` at the given index}
    /// @param index the index of the struct buffer
    public float sxAt(long index) { return sx(this.segment(), index); }
    /// Sets `sx` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV sxAt(long index, float value) { sx(this.segment(), index, value); return this; }

    /// {@return `a` at the given index}
    /// @param index the index of the struct buffer
    public float aAt(long index) { return a(this.segment(), index); }
    /// Sets `a` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV aAt(long index, float value) { a(this.segment(), index, value); return this; }

    /// {@return `b` at the given index}
    /// @param index the index of the struct buffer
    public float bAt(long index) { return b(this.segment(), index); }
    /// Sets `b` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV bAt(long index, float value) { b(this.segment(), index, value); return this; }

    /// {@return `pvx` at the given index}
    /// @param index the index of the struct buffer
    public float pvxAt(long index) { return pvx(this.segment(), index); }
    /// Sets `pvx` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV pvxAt(long index, float value) { pvx(this.segment(), index, value); return this; }

    /// {@return `sy` at the given index}
    /// @param index the index of the struct buffer
    public float syAt(long index) { return sy(this.segment(), index); }
    /// Sets `sy` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV syAt(long index, float value) { sy(this.segment(), index, value); return this; }

    /// {@return `c` at the given index}
    /// @param index the index of the struct buffer
    public float cAt(long index) { return c(this.segment(), index); }
    /// Sets `c` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV cAt(long index, float value) { c(this.segment(), index, value); return this; }

    /// {@return `pvy` at the given index}
    /// @param index the index of the struct buffer
    public float pvyAt(long index) { return pvy(this.segment(), index); }
    /// Sets `pvy` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV pvyAt(long index, float value) { pvy(this.segment(), index, value); return this; }

    /// {@return `sz` at the given index}
    /// @param index the index of the struct buffer
    public float szAt(long index) { return sz(this.segment(), index); }
    /// Sets `sz` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV szAt(long index, float value) { sz(this.segment(), index, value); return this; }

    /// {@return `pvz` at the given index}
    /// @param index the index of the struct buffer
    public float pvzAt(long index) { return pvz(this.segment(), index); }
    /// Sets `pvz` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV pvzAt(long index, float value) { pvz(this.segment(), index, value); return this; }

    /// {@return `qx` at the given index}
    /// @param index the index of the struct buffer
    public float qxAt(long index) { return qx(this.segment(), index); }
    /// Sets `qx` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qxAt(long index, float value) { qx(this.segment(), index, value); return this; }

    /// {@return `qy` at the given index}
    /// @param index the index of the struct buffer
    public float qyAt(long index) { return qy(this.segment(), index); }
    /// Sets `qy` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qyAt(long index, float value) { qy(this.segment(), index, value); return this; }

    /// {@return `qz` at the given index}
    /// @param index the index of the struct buffer
    public float qzAt(long index) { return qz(this.segment(), index); }
    /// Sets `qz` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qzAt(long index, float value) { qz(this.segment(), index, value); return this; }

    /// {@return `qw` at the given index}
    /// @param index the index of the struct buffer
    public float qwAt(long index) { return qw(this.segment(), index); }
    /// Sets `qw` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV qwAt(long index, float value) { qw(this.segment(), index, value); return this; }

    /// {@return `tx` at the given index}
    /// @param index the index of the struct buffer
    public float txAt(long index) { return tx(this.segment(), index); }
    /// Sets `tx` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV txAt(long index, float value) { tx(this.segment(), index, value); return this; }

    /// {@return `ty` at the given index}
    /// @param index the index of the struct buffer
    public float tyAt(long index) { return ty(this.segment(), index); }
    /// Sets `ty` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV tyAt(long index, float value) { ty(this.segment(), index, value); return this; }

    /// {@return `tz` at the given index}
    /// @param index the index of the struct buffer
    public float tzAt(long index) { return tz(this.segment(), index); }
    /// Sets `tz` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSRTDataNV tzAt(long index, float value) { tz(this.segment(), index, value); return this; }

}
