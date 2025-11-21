// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineColorWriteCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineColorWriteCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t attachmentCount;
///     const VkBool32* pColorWriteEnables;
/// }
/// ```
public final class VkPipelineColorWriteCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withName("pColorWriteEnables")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_attachmentCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentCount"));
    public static final long OFFSET_pColorWriteEnables = LAYOUT.byteOffset(PathElement.groupElement("pColorWriteEnables"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_attachmentCount = LAYOUT.select(PathElement.groupElement("attachmentCount"));
    public static final MemoryLayout LAYOUT_pColorWriteEnables = LAYOUT.select(PathElement.groupElement("pColorWriteEnables"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_attachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentCount"));
    public static final VarHandle VH_pColorWriteEnables = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorWriteEnables"));

    public VkPipelineColorWriteCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineColorWriteCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorWriteCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineColorWriteCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorWriteCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineColorWriteCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineColorWriteCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineColorWriteCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineColorWriteCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineColorWriteCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineColorWriteCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineColorWriteCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTColorWriteEnable.VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT); }
    public static VkPipelineColorWriteCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTColorWriteEnable.VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT);
        return s;
    }
    public VkPipelineColorWriteCreateInfoEXT copyFrom(VkPipelineColorWriteCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineColorWriteCreateInfoEXT reinterpret(long count) { return new VkPipelineColorWriteCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineColorWriteCreateInfoEXT asSlice(long index) { return new VkPipelineColorWriteCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineColorWriteCreateInfoEXT asSlice(long index, long count) { return new VkPipelineColorWriteCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineColorWriteCreateInfoEXT at(long index, Consumer<VkPipelineColorWriteCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int attachmentCountAt(long index) { return (int) VH_attachmentCount.get(this.segment(), 0L, index); }
    public MemorySegment pColorWriteEnablesAt(long index) { return (MemorySegment) VH_pColorWriteEnables.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int attachmentCount() { return (int) VH_attachmentCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pColorWriteEnables() { return (MemorySegment) VH_pColorWriteEnables.get(this.segment(), 0L, 0L); }
    public VkPipelineColorWriteCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorWriteCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorWriteCreateInfoEXT attachmentCountAt(long index, int value) { VH_attachmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorWriteCreateInfoEXT pColorWriteEnablesAt(long index, MemorySegment value) { VH_pColorWriteEnables.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineColorWriteCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorWriteCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorWriteCreateInfoEXT attachmentCount(int value) { VH_attachmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineColorWriteCreateInfoEXT pColorWriteEnables(MemorySegment value) { VH_pColorWriteEnables.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineColorWriteCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineColorWriteCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineColorWriteCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineColorWriteCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _attachmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_attachmentCount, index), LAYOUT_attachmentCount); }
    public MemorySegment _attachmentCount() { return _attachmentCountAt(0L); }
    public VkPipelineColorWriteCreateInfoEXT _attachmentCountAt(long index, MemorySegment src) { _attachmentCountAt(index).copyFrom(src); return this; }
    public VkPipelineColorWriteCreateInfoEXT _attachmentCount(MemorySegment src) { return _attachmentCountAt(0L, src); }
    public MemorySegment _pColorWriteEnablesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pColorWriteEnables, index), LAYOUT_pColorWriteEnables); }
    public MemorySegment _pColorWriteEnables() { return _pColorWriteEnablesAt(0L); }
    public VkPipelineColorWriteCreateInfoEXT _pColorWriteEnablesAt(long index, MemorySegment src) { _pColorWriteEnablesAt(index).copyFrom(src); return this; }
    public VkPipelineColorWriteCreateInfoEXT _pColorWriteEnables(MemorySegment src) { return _pColorWriteEnablesAt(0L, src); }
}
