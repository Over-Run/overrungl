// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineTessellationDomainOriginStateCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkPipelineTessellationDomainOriginStateCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkTessellationDomainOrigin domainOrigin;
/// }
/// ```
public final class VkPipelineTessellationDomainOriginStateCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("domainOrigin")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_domainOrigin = LAYOUT.byteOffset(PathElement.groupElement("domainOrigin"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_domainOrigin = LAYOUT.select(PathElement.groupElement("domainOrigin"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_domainOrigin = LAYOUT.arrayElementVarHandle(PathElement.groupElement("domainOrigin"));

    public VkPipelineTessellationDomainOriginStateCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineTessellationDomainOriginStateCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineTessellationDomainOriginStateCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineTessellationDomainOriginStateCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO); }
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO);
        return s;
    }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR copyFrom(VkPipelineTessellationDomainOriginStateCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR reinterpret(long count) { return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR asSlice(long index) { return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR asSlice(long index, long count) { return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR at(long index, Consumer<VkPipelineTessellationDomainOriginStateCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int domainOriginAt(long index) { return (int) VH_domainOrigin.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int domainOrigin() { return (int) VH_domainOrigin.get(this.segment(), 0L, 0L); }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR domainOriginAt(long index, int value) { VH_domainOrigin.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR domainOrigin(int value) { VH_domainOrigin.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _domainOriginAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_domainOrigin, index), LAYOUT_domainOrigin); }
    public MemorySegment _domainOrigin() { return _domainOriginAt(0L); }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR _domainOriginAt(long index, MemorySegment src) { _domainOriginAt(index).copyFrom(src); return this; }
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR _domainOrigin(MemorySegment src) { return _domainOriginAt(0L, src); }
}
