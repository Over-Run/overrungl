// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineViewportDepthClampControlCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineViewportDepthClampControlCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDepthClampModeEXT depthClampMode;
///     const VkDepthClampRangeEXT* pDepthClampRange;
/// }
/// ```
public final class VkPipelineViewportDepthClampControlCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthClampMode"),
        ValueLayout.ADDRESS.withName("pDepthClampRange")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_depthClampMode = LAYOUT.byteOffset(PathElement.groupElement("depthClampMode"));
    public static final long OFFSET_pDepthClampRange = LAYOUT.byteOffset(PathElement.groupElement("pDepthClampRange"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_depthClampMode = LAYOUT.select(PathElement.groupElement("depthClampMode"));
    public static final MemoryLayout LAYOUT_pDepthClampRange = LAYOUT.select(PathElement.groupElement("pDepthClampRange"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_depthClampMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthClampMode"));
    public static final VarHandle VH_pDepthClampRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthClampRange"));

    public VkPipelineViewportDepthClampControlCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineViewportDepthClampControlCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportDepthClampControlCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineViewportDepthClampControlCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportDepthClampControlCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineViewportDepthClampControlCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportDepthClampControlCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineViewportDepthClampControlCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineViewportDepthClampControlCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineViewportDepthClampControlCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportDepthClampControlCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineViewportDepthClampControlCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDepthClampControl.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT); }
    public static VkPipelineViewportDepthClampControlCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDepthClampControl.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT);
        return s;
    }
    public VkPipelineViewportDepthClampControlCreateInfoEXT copyFrom(VkPipelineViewportDepthClampControlCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineViewportDepthClampControlCreateInfoEXT reinterpret(long count) { return new VkPipelineViewportDepthClampControlCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineViewportDepthClampControlCreateInfoEXT asSlice(long index) { return new VkPipelineViewportDepthClampControlCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineViewportDepthClampControlCreateInfoEXT asSlice(long index, long count) { return new VkPipelineViewportDepthClampControlCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineViewportDepthClampControlCreateInfoEXT at(long index, Consumer<VkPipelineViewportDepthClampControlCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int depthClampModeAt(long index) { return (int) VH_depthClampMode.get(this.segment(), 0L, index); }
    public MemorySegment pDepthClampRangeAt(long index) { return (MemorySegment) VH_pDepthClampRange.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int depthClampMode() { return (int) VH_depthClampMode.get(this.segment(), 0L, 0L); }
    public MemorySegment pDepthClampRange() { return (MemorySegment) VH_pDepthClampRange.get(this.segment(), 0L, 0L); }
    public VkPipelineViewportDepthClampControlCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportDepthClampControlCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportDepthClampControlCreateInfoEXT depthClampModeAt(long index, int value) { VH_depthClampMode.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportDepthClampControlCreateInfoEXT pDepthClampRangeAt(long index, MemorySegment value) { VH_pDepthClampRange.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineViewportDepthClampControlCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportDepthClampControlCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportDepthClampControlCreateInfoEXT depthClampMode(int value) { VH_depthClampMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineViewportDepthClampControlCreateInfoEXT pDepthClampRange(MemorySegment value) { VH_pDepthClampRange.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineViewportDepthClampControlCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineViewportDepthClampControlCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineViewportDepthClampControlCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineViewportDepthClampControlCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _depthClampModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthClampMode, index), LAYOUT_depthClampMode); }
    public MemorySegment _depthClampMode() { return _depthClampModeAt(0L); }
    public VkPipelineViewportDepthClampControlCreateInfoEXT _depthClampModeAt(long index, MemorySegment src) { _depthClampModeAt(index).copyFrom(src); return this; }
    public VkPipelineViewportDepthClampControlCreateInfoEXT _depthClampMode(MemorySegment src) { return _depthClampModeAt(0L, src); }
    public MemorySegment _pDepthClampRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDepthClampRange, index), LAYOUT_pDepthClampRange); }
    public MemorySegment _pDepthClampRange() { return _pDepthClampRangeAt(0L); }
    public VkPipelineViewportDepthClampControlCreateInfoEXT _pDepthClampRangeAt(long index, MemorySegment src) { _pDepthClampRangeAt(index).copyFrom(src); return this; }
    public VkPipelineViewportDepthClampControlCreateInfoEXT _pDepthClampRange(MemorySegment src) { return _pDepthClampRangeAt(0L, src); }
}
