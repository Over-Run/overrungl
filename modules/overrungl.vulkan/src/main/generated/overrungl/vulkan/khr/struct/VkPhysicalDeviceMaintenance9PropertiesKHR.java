// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMaintenance9PropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMaintenance9PropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 image2DViewOf3DSparse;
///     VkDefaultVertexAttributeValueKHR defaultVertexAttributeValue;
/// }
/// ```
public final class VkPhysicalDeviceMaintenance9PropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("image2DViewOf3DSparse"),
        ValueLayout.JAVA_INT.withName("defaultVertexAttributeValue")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_image2DViewOf3DSparse = LAYOUT.byteOffset(PathElement.groupElement("image2DViewOf3DSparse"));
    public static final long OFFSET_defaultVertexAttributeValue = LAYOUT.byteOffset(PathElement.groupElement("defaultVertexAttributeValue"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_image2DViewOf3DSparse = LAYOUT.select(PathElement.groupElement("image2DViewOf3DSparse"));
    public static final MemoryLayout LAYOUT_defaultVertexAttributeValue = LAYOUT.select(PathElement.groupElement("defaultVertexAttributeValue"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_image2DViewOf3DSparse = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image2DViewOf3DSparse"));
    public static final VarHandle VH_defaultVertexAttributeValue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultVertexAttributeValue"));

    public VkPhysicalDeviceMaintenance9PropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMaintenance9PropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance9PropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMaintenance9PropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance9PropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMaintenance9PropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance9PropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMaintenance9PropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance9PropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMaintenance9PropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance9PropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMaintenance9PropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRMaintenance9.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_9_PROPERTIES_KHR); }
    public static VkPhysicalDeviceMaintenance9PropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRMaintenance9.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_9_PROPERTIES_KHR);
        return s;
    }
    public VkPhysicalDeviceMaintenance9PropertiesKHR copyFrom(VkPhysicalDeviceMaintenance9PropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMaintenance9PropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceMaintenance9PropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMaintenance9PropertiesKHR asSlice(long index) { return new VkPhysicalDeviceMaintenance9PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMaintenance9PropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance9PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMaintenance9PropertiesKHR at(long index, Consumer<VkPhysicalDeviceMaintenance9PropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int image2DViewOf3DSparseAt(long index) { return (int) VH_image2DViewOf3DSparse.get(this.segment(), 0L, index); }
    public int defaultVertexAttributeValueAt(long index) { return (int) VH_defaultVertexAttributeValue.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int image2DViewOf3DSparse() { return (int) VH_image2DViewOf3DSparse.get(this.segment(), 0L, 0L); }
    public int defaultVertexAttributeValue() { return (int) VH_defaultVertexAttributeValue.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMaintenance9PropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance9PropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance9PropertiesKHR image2DViewOf3DSparseAt(long index, int value) { VH_image2DViewOf3DSparse.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance9PropertiesKHR defaultVertexAttributeValueAt(long index, int value) { VH_defaultVertexAttributeValue.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMaintenance9PropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance9PropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance9PropertiesKHR image2DViewOf3DSparse(int value) { VH_image2DViewOf3DSparse.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMaintenance9PropertiesKHR defaultVertexAttributeValue(int value) { VH_defaultVertexAttributeValue.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMaintenance9PropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance9PropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMaintenance9PropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance9PropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _image2DViewOf3DSparseAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_image2DViewOf3DSparse, index), LAYOUT_image2DViewOf3DSparse); }
    public MemorySegment _image2DViewOf3DSparse() { return _image2DViewOf3DSparseAt(0L); }
    public VkPhysicalDeviceMaintenance9PropertiesKHR _image2DViewOf3DSparseAt(long index, MemorySegment src) { _image2DViewOf3DSparseAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance9PropertiesKHR _image2DViewOf3DSparse(MemorySegment src) { return _image2DViewOf3DSparseAt(0L, src); }
    public MemorySegment _defaultVertexAttributeValueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_defaultVertexAttributeValue, index), LAYOUT_defaultVertexAttributeValue); }
    public MemorySegment _defaultVertexAttributeValue() { return _defaultVertexAttributeValueAt(0L); }
    public VkPhysicalDeviceMaintenance9PropertiesKHR _defaultVertexAttributeValueAt(long index, MemorySegment src) { _defaultVertexAttributeValueAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMaintenance9PropertiesKHR _defaultVertexAttributeValue(MemorySegment src) { return _defaultVertexAttributeValueAt(0L, src); }
}
