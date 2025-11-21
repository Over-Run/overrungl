// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDepthBiasInfoEXT`.
/// ## Layout
/// ```
/// struct VkDepthBiasInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     float depthBiasConstantFactor;
///     float depthBiasClamp;
///     float depthBiasSlopeFactor;
/// }
/// ```
public final class VkDepthBiasInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasConstantFactor"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasClamp"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasSlopeFactor")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_depthBiasConstantFactor = LAYOUT.byteOffset(PathElement.groupElement("depthBiasConstantFactor"));
    public static final long OFFSET_depthBiasClamp = LAYOUT.byteOffset(PathElement.groupElement("depthBiasClamp"));
    public static final long OFFSET_depthBiasSlopeFactor = LAYOUT.byteOffset(PathElement.groupElement("depthBiasSlopeFactor"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_depthBiasConstantFactor = LAYOUT.select(PathElement.groupElement("depthBiasConstantFactor"));
    public static final MemoryLayout LAYOUT_depthBiasClamp = LAYOUT.select(PathElement.groupElement("depthBiasClamp"));
    public static final MemoryLayout LAYOUT_depthBiasSlopeFactor = LAYOUT.select(PathElement.groupElement("depthBiasSlopeFactor"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_depthBiasConstantFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasConstantFactor"));
    public static final VarHandle VH_depthBiasClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasClamp"));
    public static final VarHandle VH_depthBiasSlopeFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasSlopeFactor"));

    public VkDepthBiasInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDepthBiasInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDepthBiasInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDepthBiasInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDepthBiasInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDepthBiasInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDepthBiasInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDepthBiasInfoEXT alloc(SegmentAllocator allocator) { return new VkDepthBiasInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDepthBiasInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDepthBiasInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDepthBiasInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDepthBiasControl.VK_STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT); }
    public static VkDepthBiasInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDepthBiasControl.VK_STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT);
        return s;
    }
    public VkDepthBiasInfoEXT copyFrom(VkDepthBiasInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDepthBiasInfoEXT reinterpret(long count) { return new VkDepthBiasInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDepthBiasInfoEXT asSlice(long index) { return new VkDepthBiasInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDepthBiasInfoEXT asSlice(long index, long count) { return new VkDepthBiasInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDepthBiasInfoEXT at(long index, Consumer<VkDepthBiasInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public float depthBiasConstantFactorAt(long index) { return (float) VH_depthBiasConstantFactor.get(this.segment(), 0L, index); }
    public float depthBiasClampAt(long index) { return (float) VH_depthBiasClamp.get(this.segment(), 0L, index); }
    public float depthBiasSlopeFactorAt(long index) { return (float) VH_depthBiasSlopeFactor.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public float depthBiasConstantFactor() { return (float) VH_depthBiasConstantFactor.get(this.segment(), 0L, 0L); }
    public float depthBiasClamp() { return (float) VH_depthBiasClamp.get(this.segment(), 0L, 0L); }
    public float depthBiasSlopeFactor() { return (float) VH_depthBiasSlopeFactor.get(this.segment(), 0L, 0L); }
    public VkDepthBiasInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDepthBiasInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDepthBiasInfoEXT depthBiasConstantFactorAt(long index, float value) { VH_depthBiasConstantFactor.set(this.segment(), 0L, index, value); return this; }
    public VkDepthBiasInfoEXT depthBiasClampAt(long index, float value) { VH_depthBiasClamp.set(this.segment(), 0L, index, value); return this; }
    public VkDepthBiasInfoEXT depthBiasSlopeFactorAt(long index, float value) { VH_depthBiasSlopeFactor.set(this.segment(), 0L, index, value); return this; }
    public VkDepthBiasInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDepthBiasInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDepthBiasInfoEXT depthBiasConstantFactor(float value) { VH_depthBiasConstantFactor.set(this.segment(), 0L, 0L, value); return this; }
    public VkDepthBiasInfoEXT depthBiasClamp(float value) { VH_depthBiasClamp.set(this.segment(), 0L, 0L, value); return this; }
    public VkDepthBiasInfoEXT depthBiasSlopeFactor(float value) { VH_depthBiasSlopeFactor.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDepthBiasInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDepthBiasInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDepthBiasInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDepthBiasInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _depthBiasConstantFactorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthBiasConstantFactor, index), LAYOUT_depthBiasConstantFactor); }
    public MemorySegment _depthBiasConstantFactor() { return _depthBiasConstantFactorAt(0L); }
    public VkDepthBiasInfoEXT _depthBiasConstantFactorAt(long index, MemorySegment src) { _depthBiasConstantFactorAt(index).copyFrom(src); return this; }
    public VkDepthBiasInfoEXT _depthBiasConstantFactor(MemorySegment src) { return _depthBiasConstantFactorAt(0L, src); }
    public MemorySegment _depthBiasClampAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthBiasClamp, index), LAYOUT_depthBiasClamp); }
    public MemorySegment _depthBiasClamp() { return _depthBiasClampAt(0L); }
    public VkDepthBiasInfoEXT _depthBiasClampAt(long index, MemorySegment src) { _depthBiasClampAt(index).copyFrom(src); return this; }
    public VkDepthBiasInfoEXT _depthBiasClamp(MemorySegment src) { return _depthBiasClampAt(0L, src); }
    public MemorySegment _depthBiasSlopeFactorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthBiasSlopeFactor, index), LAYOUT_depthBiasSlopeFactor); }
    public MemorySegment _depthBiasSlopeFactor() { return _depthBiasSlopeFactorAt(0L); }
    public VkDepthBiasInfoEXT _depthBiasSlopeFactorAt(long index, MemorySegment src) { _depthBiasSlopeFactorAt(index).copyFrom(src); return this; }
    public VkDepthBiasInfoEXT _depthBiasSlopeFactor(MemorySegment src) { return _depthBiasSlopeFactorAt(0L, src); }
}
