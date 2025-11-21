// This file is auto-generated. DO NOT EDIT!
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
/// }
/// ```
public final class VkSRTDataNV extends GroupType {
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
    public static final long OFFSET_sx = LAYOUT.byteOffset(PathElement.groupElement("sx"));
    public static final long OFFSET_a = LAYOUT.byteOffset(PathElement.groupElement("a"));
    public static final long OFFSET_b = LAYOUT.byteOffset(PathElement.groupElement("b"));
    public static final long OFFSET_pvx = LAYOUT.byteOffset(PathElement.groupElement("pvx"));
    public static final long OFFSET_sy = LAYOUT.byteOffset(PathElement.groupElement("sy"));
    public static final long OFFSET_c = LAYOUT.byteOffset(PathElement.groupElement("c"));
    public static final long OFFSET_pvy = LAYOUT.byteOffset(PathElement.groupElement("pvy"));
    public static final long OFFSET_sz = LAYOUT.byteOffset(PathElement.groupElement("sz"));
    public static final long OFFSET_pvz = LAYOUT.byteOffset(PathElement.groupElement("pvz"));
    public static final long OFFSET_qx = LAYOUT.byteOffset(PathElement.groupElement("qx"));
    public static final long OFFSET_qy = LAYOUT.byteOffset(PathElement.groupElement("qy"));
    public static final long OFFSET_qz = LAYOUT.byteOffset(PathElement.groupElement("qz"));
    public static final long OFFSET_qw = LAYOUT.byteOffset(PathElement.groupElement("qw"));
    public static final long OFFSET_tx = LAYOUT.byteOffset(PathElement.groupElement("tx"));
    public static final long OFFSET_ty = LAYOUT.byteOffset(PathElement.groupElement("ty"));
    public static final long OFFSET_tz = LAYOUT.byteOffset(PathElement.groupElement("tz"));
    public static final MemoryLayout LAYOUT_sx = LAYOUT.select(PathElement.groupElement("sx"));
    public static final MemoryLayout LAYOUT_a = LAYOUT.select(PathElement.groupElement("a"));
    public static final MemoryLayout LAYOUT_b = LAYOUT.select(PathElement.groupElement("b"));
    public static final MemoryLayout LAYOUT_pvx = LAYOUT.select(PathElement.groupElement("pvx"));
    public static final MemoryLayout LAYOUT_sy = LAYOUT.select(PathElement.groupElement("sy"));
    public static final MemoryLayout LAYOUT_c = LAYOUT.select(PathElement.groupElement("c"));
    public static final MemoryLayout LAYOUT_pvy = LAYOUT.select(PathElement.groupElement("pvy"));
    public static final MemoryLayout LAYOUT_sz = LAYOUT.select(PathElement.groupElement("sz"));
    public static final MemoryLayout LAYOUT_pvz = LAYOUT.select(PathElement.groupElement("pvz"));
    public static final MemoryLayout LAYOUT_qx = LAYOUT.select(PathElement.groupElement("qx"));
    public static final MemoryLayout LAYOUT_qy = LAYOUT.select(PathElement.groupElement("qy"));
    public static final MemoryLayout LAYOUT_qz = LAYOUT.select(PathElement.groupElement("qz"));
    public static final MemoryLayout LAYOUT_qw = LAYOUT.select(PathElement.groupElement("qw"));
    public static final MemoryLayout LAYOUT_tx = LAYOUT.select(PathElement.groupElement("tx"));
    public static final MemoryLayout LAYOUT_ty = LAYOUT.select(PathElement.groupElement("ty"));
    public static final MemoryLayout LAYOUT_tz = LAYOUT.select(PathElement.groupElement("tz"));
    public static final VarHandle VH_sx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sx"));
    public static final VarHandle VH_a = LAYOUT.arrayElementVarHandle(PathElement.groupElement("a"));
    public static final VarHandle VH_b = LAYOUT.arrayElementVarHandle(PathElement.groupElement("b"));
    public static final VarHandle VH_pvx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pvx"));
    public static final VarHandle VH_sy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sy"));
    public static final VarHandle VH_c = LAYOUT.arrayElementVarHandle(PathElement.groupElement("c"));
    public static final VarHandle VH_pvy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pvy"));
    public static final VarHandle VH_sz = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sz"));
    public static final VarHandle VH_pvz = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pvz"));
    public static final VarHandle VH_qx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qx"));
    public static final VarHandle VH_qy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qy"));
    public static final VarHandle VH_qz = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qz"));
    public static final VarHandle VH_qw = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qw"));
    public static final VarHandle VH_tx = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tx"));
    public static final VarHandle VH_ty = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ty"));
    public static final VarHandle VH_tz = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tz"));

    public VkSRTDataNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSRTDataNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSRTDataNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkSRTDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSRTDataNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSRTDataNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSRTDataNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSRTDataNV alloc(SegmentAllocator allocator) { return new VkSRTDataNV(allocator.allocate(LAYOUT), 1); }
    public static VkSRTDataNV alloc(SegmentAllocator allocator, long count) { return new VkSRTDataNV(allocator.allocate(LAYOUT, count), count); }
    public VkSRTDataNV copyFrom(VkSRTDataNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSRTDataNV reinterpret(long count) { return new VkSRTDataNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSRTDataNV asSlice(long index) { return new VkSRTDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSRTDataNV asSlice(long index, long count) { return new VkSRTDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSRTDataNV at(long index, Consumer<VkSRTDataNV> func) { func.accept(asSlice(index)); return this; }
    public float sxAt(long index) { return (float) VH_sx.get(this.segment(), 0L, index); }
    public float aAt(long index) { return (float) VH_a.get(this.segment(), 0L, index); }
    public float bAt(long index) { return (float) VH_b.get(this.segment(), 0L, index); }
    public float pvxAt(long index) { return (float) VH_pvx.get(this.segment(), 0L, index); }
    public float syAt(long index) { return (float) VH_sy.get(this.segment(), 0L, index); }
    public float cAt(long index) { return (float) VH_c.get(this.segment(), 0L, index); }
    public float pvyAt(long index) { return (float) VH_pvy.get(this.segment(), 0L, index); }
    public float szAt(long index) { return (float) VH_sz.get(this.segment(), 0L, index); }
    public float pvzAt(long index) { return (float) VH_pvz.get(this.segment(), 0L, index); }
    public float qxAt(long index) { return (float) VH_qx.get(this.segment(), 0L, index); }
    public float qyAt(long index) { return (float) VH_qy.get(this.segment(), 0L, index); }
    public float qzAt(long index) { return (float) VH_qz.get(this.segment(), 0L, index); }
    public float qwAt(long index) { return (float) VH_qw.get(this.segment(), 0L, index); }
    public float txAt(long index) { return (float) VH_tx.get(this.segment(), 0L, index); }
    public float tyAt(long index) { return (float) VH_ty.get(this.segment(), 0L, index); }
    public float tzAt(long index) { return (float) VH_tz.get(this.segment(), 0L, index); }
    public float sx() { return (float) VH_sx.get(this.segment(), 0L, 0L); }
    public float a() { return (float) VH_a.get(this.segment(), 0L, 0L); }
    public float b() { return (float) VH_b.get(this.segment(), 0L, 0L); }
    public float pvx() { return (float) VH_pvx.get(this.segment(), 0L, 0L); }
    public float sy() { return (float) VH_sy.get(this.segment(), 0L, 0L); }
    public float c() { return (float) VH_c.get(this.segment(), 0L, 0L); }
    public float pvy() { return (float) VH_pvy.get(this.segment(), 0L, 0L); }
    public float sz() { return (float) VH_sz.get(this.segment(), 0L, 0L); }
    public float pvz() { return (float) VH_pvz.get(this.segment(), 0L, 0L); }
    public float qx() { return (float) VH_qx.get(this.segment(), 0L, 0L); }
    public float qy() { return (float) VH_qy.get(this.segment(), 0L, 0L); }
    public float qz() { return (float) VH_qz.get(this.segment(), 0L, 0L); }
    public float qw() { return (float) VH_qw.get(this.segment(), 0L, 0L); }
    public float tx() { return (float) VH_tx.get(this.segment(), 0L, 0L); }
    public float ty() { return (float) VH_ty.get(this.segment(), 0L, 0L); }
    public float tz() { return (float) VH_tz.get(this.segment(), 0L, 0L); }
    public VkSRTDataNV sxAt(long index, float value) { VH_sx.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV aAt(long index, float value) { VH_a.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV bAt(long index, float value) { VH_b.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV pvxAt(long index, float value) { VH_pvx.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV syAt(long index, float value) { VH_sy.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV cAt(long index, float value) { VH_c.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV pvyAt(long index, float value) { VH_pvy.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV szAt(long index, float value) { VH_sz.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV pvzAt(long index, float value) { VH_pvz.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV qxAt(long index, float value) { VH_qx.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV qyAt(long index, float value) { VH_qy.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV qzAt(long index, float value) { VH_qz.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV qwAt(long index, float value) { VH_qw.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV txAt(long index, float value) { VH_tx.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV tyAt(long index, float value) { VH_ty.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV tzAt(long index, float value) { VH_tz.set(this.segment(), 0L, index, value); return this; }
    public VkSRTDataNV sx(float value) { VH_sx.set(this.segment(), 0L, 0L, value); return this; }
    public VkSRTDataNV a(float value) { VH_a.set(this.segment(), 0L, 0L, value); return this; }
    public VkSRTDataNV b(float value) { VH_b.set(this.segment(), 0L, 0L, value); return this; }
    public VkSRTDataNV pvx(float value) { VH_pvx.set(this.segment(), 0L, 0L, value); return this; }
    public VkSRTDataNV sy(float value) { VH_sy.set(this.segment(), 0L, 0L, value); return this; }
    public VkSRTDataNV c(float value) { VH_c.set(this.segment(), 0L, 0L, value); return this; }
    public VkSRTDataNV pvy(float value) { VH_pvy.set(this.segment(), 0L, 0L, value); return this; }
    public VkSRTDataNV sz(float value) { VH_sz.set(this.segment(), 0L, 0L, value); return this; }
    public VkSRTDataNV pvz(float value) { VH_pvz.set(this.segment(), 0L, 0L, value); return this; }
    public VkSRTDataNV qx(float value) { VH_qx.set(this.segment(), 0L, 0L, value); return this; }
    public VkSRTDataNV qy(float value) { VH_qy.set(this.segment(), 0L, 0L, value); return this; }
    public VkSRTDataNV qz(float value) { VH_qz.set(this.segment(), 0L, 0L, value); return this; }
    public VkSRTDataNV qw(float value) { VH_qw.set(this.segment(), 0L, 0L, value); return this; }
    public VkSRTDataNV tx(float value) { VH_tx.set(this.segment(), 0L, 0L, value); return this; }
    public VkSRTDataNV ty(float value) { VH_ty.set(this.segment(), 0L, 0L, value); return this; }
    public VkSRTDataNV tz(float value) { VH_tz.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sxAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sx, index), LAYOUT_sx); }
    public MemorySegment _sx() { return _sxAt(0L); }
    public VkSRTDataNV _sxAt(long index, MemorySegment src) { _sxAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _sx(MemorySegment src) { return _sxAt(0L, src); }
    public MemorySegment _aAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_a, index), LAYOUT_a); }
    public MemorySegment _a() { return _aAt(0L); }
    public VkSRTDataNV _aAt(long index, MemorySegment src) { _aAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _a(MemorySegment src) { return _aAt(0L, src); }
    public MemorySegment _bAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_b, index), LAYOUT_b); }
    public MemorySegment _b() { return _bAt(0L); }
    public VkSRTDataNV _bAt(long index, MemorySegment src) { _bAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _b(MemorySegment src) { return _bAt(0L, src); }
    public MemorySegment _pvxAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pvx, index), LAYOUT_pvx); }
    public MemorySegment _pvx() { return _pvxAt(0L); }
    public VkSRTDataNV _pvxAt(long index, MemorySegment src) { _pvxAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _pvx(MemorySegment src) { return _pvxAt(0L, src); }
    public MemorySegment _syAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sy, index), LAYOUT_sy); }
    public MemorySegment _sy() { return _syAt(0L); }
    public VkSRTDataNV _syAt(long index, MemorySegment src) { _syAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _sy(MemorySegment src) { return _syAt(0L, src); }
    public MemorySegment _cAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_c, index), LAYOUT_c); }
    public MemorySegment _c() { return _cAt(0L); }
    public VkSRTDataNV _cAt(long index, MemorySegment src) { _cAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _c(MemorySegment src) { return _cAt(0L, src); }
    public MemorySegment _pvyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pvy, index), LAYOUT_pvy); }
    public MemorySegment _pvy() { return _pvyAt(0L); }
    public VkSRTDataNV _pvyAt(long index, MemorySegment src) { _pvyAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _pvy(MemorySegment src) { return _pvyAt(0L, src); }
    public MemorySegment _szAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sz, index), LAYOUT_sz); }
    public MemorySegment _sz() { return _szAt(0L); }
    public VkSRTDataNV _szAt(long index, MemorySegment src) { _szAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _sz(MemorySegment src) { return _szAt(0L, src); }
    public MemorySegment _pvzAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pvz, index), LAYOUT_pvz); }
    public MemorySegment _pvz() { return _pvzAt(0L); }
    public VkSRTDataNV _pvzAt(long index, MemorySegment src) { _pvzAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _pvz(MemorySegment src) { return _pvzAt(0L, src); }
    public MemorySegment _qxAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_qx, index), LAYOUT_qx); }
    public MemorySegment _qx() { return _qxAt(0L); }
    public VkSRTDataNV _qxAt(long index, MemorySegment src) { _qxAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _qx(MemorySegment src) { return _qxAt(0L, src); }
    public MemorySegment _qyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_qy, index), LAYOUT_qy); }
    public MemorySegment _qy() { return _qyAt(0L); }
    public VkSRTDataNV _qyAt(long index, MemorySegment src) { _qyAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _qy(MemorySegment src) { return _qyAt(0L, src); }
    public MemorySegment _qzAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_qz, index), LAYOUT_qz); }
    public MemorySegment _qz() { return _qzAt(0L); }
    public VkSRTDataNV _qzAt(long index, MemorySegment src) { _qzAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _qz(MemorySegment src) { return _qzAt(0L, src); }
    public MemorySegment _qwAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_qw, index), LAYOUT_qw); }
    public MemorySegment _qw() { return _qwAt(0L); }
    public VkSRTDataNV _qwAt(long index, MemorySegment src) { _qwAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _qw(MemorySegment src) { return _qwAt(0L, src); }
    public MemorySegment _txAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tx, index), LAYOUT_tx); }
    public MemorySegment _tx() { return _txAt(0L); }
    public VkSRTDataNV _txAt(long index, MemorySegment src) { _txAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _tx(MemorySegment src) { return _txAt(0L, src); }
    public MemorySegment _tyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ty, index), LAYOUT_ty); }
    public MemorySegment _ty() { return _tyAt(0L); }
    public VkSRTDataNV _tyAt(long index, MemorySegment src) { _tyAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _ty(MemorySegment src) { return _tyAt(0L, src); }
    public MemorySegment _tzAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tz, index), LAYOUT_tz); }
    public MemorySegment _tz() { return _tzAt(0L); }
    public VkSRTDataNV _tzAt(long index, MemorySegment src) { _tzAt(index).copyFrom(src); return this; }
    public VkSRTDataNV _tz(MemorySegment src) { return _tzAt(0L, src); }
}
