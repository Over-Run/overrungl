// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.msft.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceLayeredDriverPropertiesMSFT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceLayeredDriverPropertiesMSFT {
///     VkStructureType sType;
///     void* pNext;
///     VkLayeredDriverUnderlyingApiMSFT underlyingAPI;
/// }
/// ```
public final class VkPhysicalDeviceLayeredDriverPropertiesMSFT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("underlyingAPI")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_underlyingAPI = LAYOUT.byteOffset(PathElement.groupElement("underlyingAPI"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_underlyingAPI = LAYOUT.select(PathElement.groupElement("underlyingAPI"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_underlyingAPI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("underlyingAPI"));

    public VkPhysicalDeviceLayeredDriverPropertiesMSFT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredDriverPropertiesMSFT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredDriverPropertiesMSFT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredDriverPropertiesMSFT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.msft.VKMSFTLayeredDriver.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_DRIVER_PROPERTIES_MSFT); }
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.msft.VKMSFTLayeredDriver.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_DRIVER_PROPERTIES_MSFT);
        return s;
    }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT copyFrom(VkPhysicalDeviceLayeredDriverPropertiesMSFT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT reinterpret(long count) { return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT asSlice(long index) { return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT asSlice(long index, long count) { return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT at(long index, Consumer<VkPhysicalDeviceLayeredDriverPropertiesMSFT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int underlyingAPIAt(long index) { return (int) VH_underlyingAPI.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int underlyingAPI() { return (int) VH_underlyingAPI.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT underlyingAPIAt(long index, int value) { VH_underlyingAPI.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT underlyingAPI(int value) { VH_underlyingAPI.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _underlyingAPIAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_underlyingAPI, index), LAYOUT_underlyingAPI); }
    public MemorySegment _underlyingAPI() { return _underlyingAPIAt(0L); }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT _underlyingAPIAt(long index, MemorySegment src) { _underlyingAPIAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT _underlyingAPI(MemorySegment src) { return _underlyingAPIAt(0L, src); }
}
