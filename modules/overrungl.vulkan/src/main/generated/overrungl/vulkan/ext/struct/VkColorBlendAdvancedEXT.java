// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkColorBlendAdvancedEXT`.
/// ## Layout
/// ```
/// struct VkColorBlendAdvancedEXT {
///     VkBlendOp advancedBlendOp;
///     VkBool32 srcPremultiplied;
///     VkBool32 dstPremultiplied;
///     VkBlendOverlapEXT blendOverlap;
///     VkBool32 clampResults;
/// }
/// ```
public final class VkColorBlendAdvancedEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("advancedBlendOp"),
        ValueLayout.JAVA_INT.withName("srcPremultiplied"),
        ValueLayout.JAVA_INT.withName("dstPremultiplied"),
        ValueLayout.JAVA_INT.withName("blendOverlap"),
        ValueLayout.JAVA_INT.withName("clampResults")
    );
    public static final long OFFSET_advancedBlendOp = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendOp"));
    public static final long OFFSET_srcPremultiplied = LAYOUT.byteOffset(PathElement.groupElement("srcPremultiplied"));
    public static final long OFFSET_dstPremultiplied = LAYOUT.byteOffset(PathElement.groupElement("dstPremultiplied"));
    public static final long OFFSET_blendOverlap = LAYOUT.byteOffset(PathElement.groupElement("blendOverlap"));
    public static final long OFFSET_clampResults = LAYOUT.byteOffset(PathElement.groupElement("clampResults"));
    public static final MemoryLayout LAYOUT_advancedBlendOp = LAYOUT.select(PathElement.groupElement("advancedBlendOp"));
    public static final MemoryLayout LAYOUT_srcPremultiplied = LAYOUT.select(PathElement.groupElement("srcPremultiplied"));
    public static final MemoryLayout LAYOUT_dstPremultiplied = LAYOUT.select(PathElement.groupElement("dstPremultiplied"));
    public static final MemoryLayout LAYOUT_blendOverlap = LAYOUT.select(PathElement.groupElement("blendOverlap"));
    public static final MemoryLayout LAYOUT_clampResults = LAYOUT.select(PathElement.groupElement("clampResults"));
    public static final VarHandle VH_advancedBlendOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendOp"));
    public static final VarHandle VH_srcPremultiplied = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcPremultiplied"));
    public static final VarHandle VH_dstPremultiplied = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstPremultiplied"));
    public static final VarHandle VH_blendOverlap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blendOverlap"));
    public static final VarHandle VH_clampResults = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clampResults"));

    public VkColorBlendAdvancedEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkColorBlendAdvancedEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkColorBlendAdvancedEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkColorBlendAdvancedEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkColorBlendAdvancedEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkColorBlendAdvancedEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkColorBlendAdvancedEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkColorBlendAdvancedEXT alloc(SegmentAllocator allocator) { return new VkColorBlendAdvancedEXT(allocator.allocate(LAYOUT), 1); }
    public static VkColorBlendAdvancedEXT alloc(SegmentAllocator allocator, long count) { return new VkColorBlendAdvancedEXT(allocator.allocate(LAYOUT, count), count); }
    public VkColorBlendAdvancedEXT copyFrom(VkColorBlendAdvancedEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkColorBlendAdvancedEXT reinterpret(long count) { return new VkColorBlendAdvancedEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkColorBlendAdvancedEXT asSlice(long index) { return new VkColorBlendAdvancedEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkColorBlendAdvancedEXT asSlice(long index, long count) { return new VkColorBlendAdvancedEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkColorBlendAdvancedEXT at(long index, Consumer<VkColorBlendAdvancedEXT> func) { func.accept(asSlice(index)); return this; }
    public int advancedBlendOpAt(long index) { return (int) VH_advancedBlendOp.get(this.segment(), 0L, index); }
    public int srcPremultipliedAt(long index) { return (int) VH_srcPremultiplied.get(this.segment(), 0L, index); }
    public int dstPremultipliedAt(long index) { return (int) VH_dstPremultiplied.get(this.segment(), 0L, index); }
    public int blendOverlapAt(long index) { return (int) VH_blendOverlap.get(this.segment(), 0L, index); }
    public int clampResultsAt(long index) { return (int) VH_clampResults.get(this.segment(), 0L, index); }
    public int advancedBlendOp() { return (int) VH_advancedBlendOp.get(this.segment(), 0L, 0L); }
    public int srcPremultiplied() { return (int) VH_srcPremultiplied.get(this.segment(), 0L, 0L); }
    public int dstPremultiplied() { return (int) VH_dstPremultiplied.get(this.segment(), 0L, 0L); }
    public int blendOverlap() { return (int) VH_blendOverlap.get(this.segment(), 0L, 0L); }
    public int clampResults() { return (int) VH_clampResults.get(this.segment(), 0L, 0L); }
    public VkColorBlendAdvancedEXT advancedBlendOpAt(long index, int value) { VH_advancedBlendOp.set(this.segment(), 0L, index, value); return this; }
    public VkColorBlendAdvancedEXT srcPremultipliedAt(long index, int value) { VH_srcPremultiplied.set(this.segment(), 0L, index, value); return this; }
    public VkColorBlendAdvancedEXT dstPremultipliedAt(long index, int value) { VH_dstPremultiplied.set(this.segment(), 0L, index, value); return this; }
    public VkColorBlendAdvancedEXT blendOverlapAt(long index, int value) { VH_blendOverlap.set(this.segment(), 0L, index, value); return this; }
    public VkColorBlendAdvancedEXT clampResultsAt(long index, int value) { VH_clampResults.set(this.segment(), 0L, index, value); return this; }
    public VkColorBlendAdvancedEXT advancedBlendOp(int value) { VH_advancedBlendOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkColorBlendAdvancedEXT srcPremultiplied(int value) { VH_srcPremultiplied.set(this.segment(), 0L, 0L, value); return this; }
    public VkColorBlendAdvancedEXT dstPremultiplied(int value) { VH_dstPremultiplied.set(this.segment(), 0L, 0L, value); return this; }
    public VkColorBlendAdvancedEXT blendOverlap(int value) { VH_blendOverlap.set(this.segment(), 0L, 0L, value); return this; }
    public VkColorBlendAdvancedEXT clampResults(int value) { VH_clampResults.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _advancedBlendOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_advancedBlendOp, index), LAYOUT_advancedBlendOp); }
    public MemorySegment _advancedBlendOp() { return _advancedBlendOpAt(0L); }
    public VkColorBlendAdvancedEXT _advancedBlendOpAt(long index, MemorySegment src) { _advancedBlendOpAt(index).copyFrom(src); return this; }
    public VkColorBlendAdvancedEXT _advancedBlendOp(MemorySegment src) { return _advancedBlendOpAt(0L, src); }
    public MemorySegment _srcPremultipliedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcPremultiplied, index), LAYOUT_srcPremultiplied); }
    public MemorySegment _srcPremultiplied() { return _srcPremultipliedAt(0L); }
    public VkColorBlendAdvancedEXT _srcPremultipliedAt(long index, MemorySegment src) { _srcPremultipliedAt(index).copyFrom(src); return this; }
    public VkColorBlendAdvancedEXT _srcPremultiplied(MemorySegment src) { return _srcPremultipliedAt(0L, src); }
    public MemorySegment _dstPremultipliedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstPremultiplied, index), LAYOUT_dstPremultiplied); }
    public MemorySegment _dstPremultiplied() { return _dstPremultipliedAt(0L); }
    public VkColorBlendAdvancedEXT _dstPremultipliedAt(long index, MemorySegment src) { _dstPremultipliedAt(index).copyFrom(src); return this; }
    public VkColorBlendAdvancedEXT _dstPremultiplied(MemorySegment src) { return _dstPremultipliedAt(0L, src); }
    public MemorySegment _blendOverlapAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_blendOverlap, index), LAYOUT_blendOverlap); }
    public MemorySegment _blendOverlap() { return _blendOverlapAt(0L); }
    public VkColorBlendAdvancedEXT _blendOverlapAt(long index, MemorySegment src) { _blendOverlapAt(index).copyFrom(src); return this; }
    public VkColorBlendAdvancedEXT _blendOverlap(MemorySegment src) { return _blendOverlapAt(0L, src); }
    public MemorySegment _clampResultsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clampResults, index), LAYOUT_clampResults); }
    public MemorySegment _clampResults() { return _clampResultsAt(0L); }
    public VkColorBlendAdvancedEXT _clampResultsAt(long index, MemorySegment src) { _clampResultsAt(index).copyFrom(src); return this; }
    public VkColorBlendAdvancedEXT _clampResults(MemorySegment src) { return _clampResultsAt(0L, src); }
}
