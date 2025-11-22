// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDepthBiasRepresentationInfoEXT`.
/// ## Layout
/// ```
/// struct VkDepthBiasRepresentationInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDepthBiasRepresentationEXT depthBiasRepresentation;
///     VkBool32 depthBiasExact;
/// }
/// ```
public final class VkDepthBiasRepresentationInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthBiasRepresentation"),
        ValueLayout.JAVA_INT.withName("depthBiasExact")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_depthBiasRepresentation = LAYOUT.byteOffset(PathElement.groupElement("depthBiasRepresentation"));
    public static final long OFFSET_depthBiasExact = LAYOUT.byteOffset(PathElement.groupElement("depthBiasExact"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_depthBiasRepresentation = LAYOUT.select(PathElement.groupElement("depthBiasRepresentation"));
    public static final MemoryLayout LAYOUT_depthBiasExact = LAYOUT.select(PathElement.groupElement("depthBiasExact"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_depthBiasRepresentation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasRepresentation"));
    public static final VarHandle VH_depthBiasExact = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasExact"));

    public VkDepthBiasRepresentationInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDepthBiasRepresentationInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDepthBiasRepresentationInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDepthBiasRepresentationInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDepthBiasRepresentationInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDepthBiasRepresentationInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDepthBiasRepresentationInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDepthBiasRepresentationInfoEXT alloc(SegmentAllocator allocator) { return new VkDepthBiasRepresentationInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDepthBiasRepresentationInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDepthBiasRepresentationInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDepthBiasRepresentationInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDepthBiasControl.VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT); }
    public static VkDepthBiasRepresentationInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDepthBiasControl.VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT);
        return s;
    }
    public VkDepthBiasRepresentationInfoEXT copyFrom(VkDepthBiasRepresentationInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDepthBiasRepresentationInfoEXT reinterpret(long count) { return new VkDepthBiasRepresentationInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDepthBiasRepresentationInfoEXT asSlice(long index) { return new VkDepthBiasRepresentationInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDepthBiasRepresentationInfoEXT asSlice(long index, long count) { return new VkDepthBiasRepresentationInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDepthBiasRepresentationInfoEXT at(long index, Consumer<VkDepthBiasRepresentationInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int depthBiasRepresentationAt(long index) { return (int) VH_depthBiasRepresentation.get(this.segment(), 0L, index); }
    public int depthBiasExactAt(long index) { return (int) VH_depthBiasExact.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int depthBiasRepresentation() { return (int) VH_depthBiasRepresentation.get(this.segment(), 0L, 0L); }
    public int depthBiasExact() { return (int) VH_depthBiasExact.get(this.segment(), 0L, 0L); }
    public VkDepthBiasRepresentationInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDepthBiasRepresentationInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDepthBiasRepresentationInfoEXT depthBiasRepresentationAt(long index, int value) { VH_depthBiasRepresentation.set(this.segment(), 0L, index, value); return this; }
    public VkDepthBiasRepresentationInfoEXT depthBiasExactAt(long index, int value) { VH_depthBiasExact.set(this.segment(), 0L, index, value); return this; }
    public VkDepthBiasRepresentationInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDepthBiasRepresentationInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDepthBiasRepresentationInfoEXT depthBiasRepresentation(int value) { VH_depthBiasRepresentation.set(this.segment(), 0L, 0L, value); return this; }
    public VkDepthBiasRepresentationInfoEXT depthBiasExact(int value) { VH_depthBiasExact.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDepthBiasRepresentationInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDepthBiasRepresentationInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDepthBiasRepresentationInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDepthBiasRepresentationInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _depthBiasRepresentationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthBiasRepresentation, index), LAYOUT_depthBiasRepresentation); }
    public MemorySegment _depthBiasRepresentation() { return _depthBiasRepresentationAt(0L); }
    public VkDepthBiasRepresentationInfoEXT _depthBiasRepresentationAt(long index, MemorySegment src) { _depthBiasRepresentationAt(index).copyFrom(src); return this; }
    public VkDepthBiasRepresentationInfoEXT _depthBiasRepresentation(MemorySegment src) { return _depthBiasRepresentationAt(0L, src); }
    public MemorySegment _depthBiasExactAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthBiasExact, index), LAYOUT_depthBiasExact); }
    public MemorySegment _depthBiasExact() { return _depthBiasExactAt(0L); }
    public VkDepthBiasRepresentationInfoEXT _depthBiasExactAt(long index, MemorySegment src) { _depthBiasExactAt(index).copyFrom(src); return this; }
    public VkDepthBiasRepresentationInfoEXT _depthBiasExact(MemorySegment src) { return _depthBiasExactAt(0L, src); }
}
