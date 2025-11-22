// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCustomBorderColorPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCustomBorderColorPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxCustomBorderColorSamplers;
/// }
/// ```
public final class VkPhysicalDeviceCustomBorderColorPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxCustomBorderColorSamplers")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxCustomBorderColorSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxCustomBorderColorSamplers"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxCustomBorderColorSamplers = LAYOUT.select(PathElement.groupElement("maxCustomBorderColorSamplers"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxCustomBorderColorSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCustomBorderColorSamplers"));

    public VkPhysicalDeviceCustomBorderColorPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCustomBorderColorPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCustomBorderColorPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCustomBorderColorPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCustomBorderColorPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCustomBorderColorPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTCustomBorderColor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT); }
    public static VkPhysicalDeviceCustomBorderColorPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTCustomBorderColor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT copyFrom(VkPhysicalDeviceCustomBorderColorPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceCustomBorderColorPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceCustomBorderColorPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceCustomBorderColorPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT at(long index, Consumer<VkPhysicalDeviceCustomBorderColorPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxCustomBorderColorSamplersAt(long index) { return (int) VH_maxCustomBorderColorSamplers.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxCustomBorderColorSamplers() { return (int) VH_maxCustomBorderColorSamplers.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT maxCustomBorderColorSamplersAt(long index, int value) { VH_maxCustomBorderColorSamplers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT maxCustomBorderColorSamplers(int value) { VH_maxCustomBorderColorSamplers.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxCustomBorderColorSamplersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxCustomBorderColorSamplers, index), LAYOUT_maxCustomBorderColorSamplers); }
    public MemorySegment _maxCustomBorderColorSamplers() { return _maxCustomBorderColorSamplersAt(0L); }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT _maxCustomBorderColorSamplersAt(long index, MemorySegment src) { _maxCustomBorderColorSamplersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCustomBorderColorPropertiesEXT _maxCustomBorderColorSamplers(MemorySegment src) { return _maxCustomBorderColorSamplersAt(0L, src); }
}
