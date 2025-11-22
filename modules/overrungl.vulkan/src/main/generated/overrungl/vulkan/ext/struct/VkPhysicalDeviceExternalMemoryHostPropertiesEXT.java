// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExternalMemoryHostPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExternalMemoryHostPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize minImportedHostPointerAlignment;
/// }
/// ```
public final class VkPhysicalDeviceExternalMemoryHostPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("minImportedHostPointerAlignment")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_minImportedHostPointerAlignment = LAYOUT.byteOffset(PathElement.groupElement("minImportedHostPointerAlignment"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_minImportedHostPointerAlignment = LAYOUT.select(PathElement.groupElement("minImportedHostPointerAlignment"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_minImportedHostPointerAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minImportedHostPointerAlignment"));

    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTExternalMemoryHost.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT); }
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTExternalMemoryHost.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT copyFrom(VkPhysicalDeviceExternalMemoryHostPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT at(long index, Consumer<VkPhysicalDeviceExternalMemoryHostPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long minImportedHostPointerAlignmentAt(long index) { return (long) VH_minImportedHostPointerAlignment.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long minImportedHostPointerAlignment() { return (long) VH_minImportedHostPointerAlignment.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT minImportedHostPointerAlignmentAt(long index, long value) { VH_minImportedHostPointerAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT minImportedHostPointerAlignment(long value) { VH_minImportedHostPointerAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _minImportedHostPointerAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minImportedHostPointerAlignment, index), LAYOUT_minImportedHostPointerAlignment); }
    public MemorySegment _minImportedHostPointerAlignment() { return _minImportedHostPointerAlignmentAt(0L); }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT _minImportedHostPointerAlignmentAt(long index, MemorySegment src) { _minImportedHostPointerAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT _minImportedHostPointerAlignment(MemorySegment src) { return _minImportedHostPointerAlignmentAt(0L, src); }
}
