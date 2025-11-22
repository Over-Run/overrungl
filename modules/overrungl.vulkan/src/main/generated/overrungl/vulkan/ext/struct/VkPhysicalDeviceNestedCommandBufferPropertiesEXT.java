// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceNestedCommandBufferPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceNestedCommandBufferPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxCommandBufferNestingLevel;
/// }
/// ```
public final class VkPhysicalDeviceNestedCommandBufferPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxCommandBufferNestingLevel")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxCommandBufferNestingLevel = LAYOUT.byteOffset(PathElement.groupElement("maxCommandBufferNestingLevel"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxCommandBufferNestingLevel = LAYOUT.select(PathElement.groupElement("maxCommandBufferNestingLevel"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxCommandBufferNestingLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCommandBufferNestingLevel"));

    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTNestedCommandBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_PROPERTIES_EXT); }
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTNestedCommandBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT copyFrom(VkPhysicalDeviceNestedCommandBufferPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT at(long index, Consumer<VkPhysicalDeviceNestedCommandBufferPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxCommandBufferNestingLevelAt(long index) { return (int) VH_maxCommandBufferNestingLevel.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxCommandBufferNestingLevel() { return (int) VH_maxCommandBufferNestingLevel.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT maxCommandBufferNestingLevelAt(long index, int value) { VH_maxCommandBufferNestingLevel.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT maxCommandBufferNestingLevel(int value) { VH_maxCommandBufferNestingLevel.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxCommandBufferNestingLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxCommandBufferNestingLevel, index), LAYOUT_maxCommandBufferNestingLevel); }
    public MemorySegment _maxCommandBufferNestingLevel() { return _maxCommandBufferNestingLevelAt(0L); }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT _maxCommandBufferNestingLevelAt(long index, MemorySegment src) { _maxCommandBufferNestingLevelAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT _maxCommandBufferNestingLevel(MemorySegment src) { return _maxCommandBufferNestingLevelAt(0L, src); }
}
