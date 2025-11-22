// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePrivateDataFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePrivateDataFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 privateData;
/// }
/// ```
public final class VkPhysicalDevicePrivateDataFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("privateData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_privateData = LAYOUT.byteOffset(PathElement.groupElement("privateData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_privateData = LAYOUT.select(PathElement.groupElement("privateData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_privateData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("privateData"));

    public VkPhysicalDevicePrivateDataFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePrivateDataFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePrivateDataFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePrivateDataFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePrivateDataFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePrivateDataFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePrivateDataFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePrivateDataFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePrivateDataFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePrivateDataFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePrivateDataFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePrivateDataFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES); }
    public static VkPhysicalDevicePrivateDataFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES);
        return s;
    }
    public VkPhysicalDevicePrivateDataFeaturesEXT copyFrom(VkPhysicalDevicePrivateDataFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePrivateDataFeaturesEXT reinterpret(long count) { return new VkPhysicalDevicePrivateDataFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePrivateDataFeaturesEXT asSlice(long index) { return new VkPhysicalDevicePrivateDataFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePrivateDataFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDevicePrivateDataFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePrivateDataFeaturesEXT at(long index, Consumer<VkPhysicalDevicePrivateDataFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int privateDataAt(long index) { return (int) VH_privateData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int privateData() { return (int) VH_privateData.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePrivateDataFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePrivateDataFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePrivateDataFeaturesEXT privateDataAt(long index, int value) { VH_privateData.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePrivateDataFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePrivateDataFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePrivateDataFeaturesEXT privateData(int value) { VH_privateData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePrivateDataFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePrivateDataFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePrivateDataFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePrivateDataFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _privateDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_privateData, index), LAYOUT_privateData); }
    public MemorySegment _privateData() { return _privateDataAt(0L); }
    public VkPhysicalDevicePrivateDataFeaturesEXT _privateDataAt(long index, MemorySegment src) { _privateDataAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePrivateDataFeaturesEXT _privateData(MemorySegment src) { return _privateDataAt(0L, src); }
}
