// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorSetVariableDescriptorCountLayoutSupport`.
/// ## Layout
/// ```
/// struct VkDescriptorSetVariableDescriptorCountLayoutSupport {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxVariableDescriptorCount;
/// }
/// ```
public final class VkDescriptorSetVariableDescriptorCountLayoutSupport extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxVariableDescriptorCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxVariableDescriptorCount = LAYOUT.byteOffset(PathElement.groupElement("maxVariableDescriptorCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxVariableDescriptorCount = LAYOUT.select(PathElement.groupElement("maxVariableDescriptorCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxVariableDescriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVariableDescriptorCount"));

    public VkDescriptorSetVariableDescriptorCountLayoutSupport(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetVariableDescriptorCountLayoutSupport(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetVariableDescriptorCountLayoutSupport(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetVariableDescriptorCountLayoutSupport(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport alloc(SegmentAllocator allocator) { return new VkDescriptorSetVariableDescriptorCountLayoutSupport(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetVariableDescriptorCountLayoutSupport(allocator.allocate(LAYOUT, count), count); }
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT); }
    public static VkDescriptorSetVariableDescriptorCountLayoutSupport allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT);
        return s;
    }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport copyFrom(VkDescriptorSetVariableDescriptorCountLayoutSupport src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport reinterpret(long count) { return new VkDescriptorSetVariableDescriptorCountLayoutSupport(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport asSlice(long index) { return new VkDescriptorSetVariableDescriptorCountLayoutSupport(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport asSlice(long index, long count) { return new VkDescriptorSetVariableDescriptorCountLayoutSupport(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport at(long index, Consumer<VkDescriptorSetVariableDescriptorCountLayoutSupport> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxVariableDescriptorCountAt(long index) { return (int) VH_maxVariableDescriptorCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxVariableDescriptorCount() { return (int) VH_maxVariableDescriptorCount.get(this.segment(), 0L, 0L); }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport maxVariableDescriptorCountAt(long index, int value) { VH_maxVariableDescriptorCount.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport maxVariableDescriptorCount(int value) { VH_maxVariableDescriptorCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxVariableDescriptorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxVariableDescriptorCount, index), LAYOUT_maxVariableDescriptorCount); }
    public MemorySegment _maxVariableDescriptorCount() { return _maxVariableDescriptorCountAt(0L); }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport _maxVariableDescriptorCountAt(long index, MemorySegment src) { _maxVariableDescriptorCountAt(index).copyFrom(src); return this; }
    public VkDescriptorSetVariableDescriptorCountLayoutSupport _maxVariableDescriptorCount(MemorySegment src) { return _maxVariableDescriptorCountAt(0L, src); }
}
