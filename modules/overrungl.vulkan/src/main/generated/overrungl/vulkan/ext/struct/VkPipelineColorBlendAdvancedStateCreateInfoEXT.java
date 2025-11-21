// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineColorBlendAdvancedStateCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineColorBlendAdvancedStateCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 srcPremultiplied;
///     VkBool32 dstPremultiplied;
///     VkBlendOverlapEXT blendOverlap;
/// }
/// ```
public final class VkPipelineColorBlendAdvancedStateCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcPremultiplied"),
        ValueLayout.JAVA_INT.withName("dstPremultiplied"),
        ValueLayout.JAVA_INT.withName("blendOverlap")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_srcPremultiplied = LAYOUT.byteOffset(PathElement.groupElement("srcPremultiplied"));
    public static final long OFFSET_dstPremultiplied = LAYOUT.byteOffset(PathElement.groupElement("dstPremultiplied"));
    public static final long OFFSET_blendOverlap = LAYOUT.byteOffset(PathElement.groupElement("blendOverlap"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_srcPremultiplied = LAYOUT.select(PathElement.groupElement("srcPremultiplied"));
    public static final MemoryLayout LAYOUT_dstPremultiplied = LAYOUT.select(PathElement.groupElement("dstPremultiplied"));
    public static final MemoryLayout LAYOUT_blendOverlap = LAYOUT.select(PathElement.groupElement("blendOverlap"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_srcPremultiplied = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcPremultiplied"));
    public static final VarHandle VH_dstPremultiplied = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstPremultiplied"));
    public static final VarHandle VH_blendOverlap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blendOverlap"));

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendAdvancedStateCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendAdvancedStateCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorBlendAdvancedStateCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTBlendOperationAdvanced.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT); }
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTBlendOperationAdvanced.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT);
        return s;
    }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT copyFrom(VkPipelineColorBlendAdvancedStateCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT reinterpret(long count) { return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT asSlice(long index) { return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT asSlice(long index, long count) { return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT at(long index, Consumer<VkPipelineColorBlendAdvancedStateCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int srcPremultipliedAt(long index) { return (int) VH_srcPremultiplied.get(this.segment(), 0L, index); }
    public int dstPremultipliedAt(long index) { return (int) VH_dstPremultiplied.get(this.segment(), 0L, index); }
    public int blendOverlapAt(long index) { return (int) VH_blendOverlap.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int srcPremultiplied() { return (int) VH_srcPremultiplied.get(this.segment(), 0L, 0L); }
    public int dstPremultiplied() { return (int) VH_dstPremultiplied.get(this.segment(), 0L, 0L); }
    public int blendOverlap() { return (int) VH_blendOverlap.get(this.segment(), 0L, 0L); }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT srcPremultipliedAt(long index, int value) { VH_srcPremultiplied.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT dstPremultipliedAt(long index, int value) { VH_dstPremultiplied.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT blendOverlapAt(long index, int value) { VH_blendOverlap.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT srcPremultiplied(int value) { VH_srcPremultiplied.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT dstPremultiplied(int value) { VH_dstPremultiplied.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT blendOverlap(int value) { VH_blendOverlap.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcPremultipliedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_srcPremultiplied, index), LAYOUT_srcPremultiplied); }
    public MemorySegment _srcPremultiplied() { return _srcPremultipliedAt(0L); }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT _srcPremultipliedAt(long index, MemorySegment src) { _srcPremultipliedAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT _srcPremultiplied(MemorySegment src) { return _srcPremultipliedAt(0L, src); }
    public MemorySegment _dstPremultipliedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dstPremultiplied, index), LAYOUT_dstPremultiplied); }
    public MemorySegment _dstPremultiplied() { return _dstPremultipliedAt(0L); }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT _dstPremultipliedAt(long index, MemorySegment src) { _dstPremultipliedAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT _dstPremultiplied(MemorySegment src) { return _dstPremultipliedAt(0L, src); }
    public MemorySegment _blendOverlapAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_blendOverlap, index), LAYOUT_blendOverlap); }
    public MemorySegment _blendOverlap() { return _blendOverlapAt(0L); }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT _blendOverlapAt(long index, MemorySegment src) { _blendOverlapAt(index).copyFrom(src); return this; }
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT _blendOverlap(MemorySegment src) { return _blendOverlapAt(0L, src); }
}
