// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentDensityMapPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent2D minFragmentDensityTexelSize;
///     VkExtent2D maxFragmentDensityTexelSize;
///     VkBool32 fragmentDensityInvocations;
/// }
/// ```
public final class VkPhysicalDeviceFragmentDensityMapPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minFragmentDensityTexelSize"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxFragmentDensityTexelSize"),
        ValueLayout.JAVA_INT.withName("fragmentDensityInvocations")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_minFragmentDensityTexelSize = LAYOUT.byteOffset(PathElement.groupElement("minFragmentDensityTexelSize"));
    public static final long OFFSET_maxFragmentDensityTexelSize = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentDensityTexelSize"));
    public static final long OFFSET_fragmentDensityInvocations = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityInvocations"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_minFragmentDensityTexelSize = LAYOUT.select(PathElement.groupElement("minFragmentDensityTexelSize"));
    public static final MemoryLayout LAYOUT_maxFragmentDensityTexelSize = LAYOUT.select(PathElement.groupElement("maxFragmentDensityTexelSize"));
    public static final MemoryLayout LAYOUT_fragmentDensityInvocations = LAYOUT.select(PathElement.groupElement("fragmentDensityInvocations"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_minFragmentDensityTexelSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minFragmentDensityTexelSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_minFragmentDensityTexelSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minFragmentDensityTexelSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxFragmentDensityTexelSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentDensityTexelSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxFragmentDensityTexelSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentDensityTexelSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_fragmentDensityInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityInvocations"));

    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFragmentDensityMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT); }
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFragmentDensityMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT copyFrom(VkPhysicalDeviceFragmentDensityMapPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT at(long index, Consumer<VkPhysicalDeviceFragmentDensityMapPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int minFragmentDensityTexelSize$widthAt(long index) { return (int) VH_minFragmentDensityTexelSize$width.get(this.segment(), 0L, index); }
    public int minFragmentDensityTexelSize$heightAt(long index) { return (int) VH_minFragmentDensityTexelSize$height.get(this.segment(), 0L, index); }
    public int maxFragmentDensityTexelSize$widthAt(long index) { return (int) VH_maxFragmentDensityTexelSize$width.get(this.segment(), 0L, index); }
    public int maxFragmentDensityTexelSize$heightAt(long index) { return (int) VH_maxFragmentDensityTexelSize$height.get(this.segment(), 0L, index); }
    public int fragmentDensityInvocationsAt(long index) { return (int) VH_fragmentDensityInvocations.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int minFragmentDensityTexelSize$width() { return (int) VH_minFragmentDensityTexelSize$width.get(this.segment(), 0L, 0L); }
    public int minFragmentDensityTexelSize$height() { return (int) VH_minFragmentDensityTexelSize$height.get(this.segment(), 0L, 0L); }
    public int maxFragmentDensityTexelSize$width() { return (int) VH_maxFragmentDensityTexelSize$width.get(this.segment(), 0L, 0L); }
    public int maxFragmentDensityTexelSize$height() { return (int) VH_maxFragmentDensityTexelSize$height.get(this.segment(), 0L, 0L); }
    public int fragmentDensityInvocations() { return (int) VH_fragmentDensityInvocations.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT minFragmentDensityTexelSize$widthAt(long index, int value) { VH_minFragmentDensityTexelSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT minFragmentDensityTexelSize$heightAt(long index, int value) { VH_minFragmentDensityTexelSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT maxFragmentDensityTexelSize$widthAt(long index, int value) { VH_maxFragmentDensityTexelSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT maxFragmentDensityTexelSize$heightAt(long index, int value) { VH_maxFragmentDensityTexelSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT fragmentDensityInvocationsAt(long index, int value) { VH_fragmentDensityInvocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT minFragmentDensityTexelSize$width(int value) { VH_minFragmentDensityTexelSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT minFragmentDensityTexelSize$height(int value) { VH_minFragmentDensityTexelSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT maxFragmentDensityTexelSize$width(int value) { VH_maxFragmentDensityTexelSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT maxFragmentDensityTexelSize$height(int value) { VH_maxFragmentDensityTexelSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT fragmentDensityInvocations(int value) { VH_fragmentDensityInvocations.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _minFragmentDensityTexelSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minFragmentDensityTexelSize, index), LAYOUT_minFragmentDensityTexelSize); }
    public MemorySegment _minFragmentDensityTexelSize() { return _minFragmentDensityTexelSizeAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT _minFragmentDensityTexelSizeAt(long index, MemorySegment src) { _minFragmentDensityTexelSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT _minFragmentDensityTexelSize(MemorySegment src) { return _minFragmentDensityTexelSizeAt(0L, src); }
    public MemorySegment _maxFragmentDensityTexelSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFragmentDensityTexelSize, index), LAYOUT_maxFragmentDensityTexelSize); }
    public MemorySegment _maxFragmentDensityTexelSize() { return _maxFragmentDensityTexelSizeAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT _maxFragmentDensityTexelSizeAt(long index, MemorySegment src) { _maxFragmentDensityTexelSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT _maxFragmentDensityTexelSize(MemorySegment src) { return _maxFragmentDensityTexelSizeAt(0L, src); }
    public MemorySegment _fragmentDensityInvocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentDensityInvocations, index), LAYOUT_fragmentDensityInvocations); }
    public MemorySegment _fragmentDensityInvocations() { return _fragmentDensityInvocationsAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT _fragmentDensityInvocationsAt(long index, MemorySegment src) { _fragmentDensityInvocationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT _fragmentDensityInvocations(MemorySegment src) { return _fragmentDensityInvocationsAt(0L, src); }
}
