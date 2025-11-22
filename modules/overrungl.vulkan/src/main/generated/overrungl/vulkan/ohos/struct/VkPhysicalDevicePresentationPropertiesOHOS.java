// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ohos.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePresentationPropertiesOHOS`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePresentationPropertiesOHOS {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 sharedImage;
/// }
/// ```
public final class VkPhysicalDevicePresentationPropertiesOHOS extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sharedImage")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_sharedImage = LAYOUT.byteOffset(PathElement.groupElement("sharedImage"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_sharedImage = LAYOUT.select(PathElement.groupElement("sharedImage"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_sharedImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharedImage"));

    public VkPhysicalDevicePresentationPropertiesOHOS(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePresentationPropertiesOHOS of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentationPropertiesOHOS(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePresentationPropertiesOHOS ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentationPropertiesOHOS(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePresentationPropertiesOHOS ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentationPropertiesOHOS(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePresentationPropertiesOHOS alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePresentationPropertiesOHOS(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePresentationPropertiesOHOS alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePresentationPropertiesOHOS(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePresentationPropertiesOHOS allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ohos.VKOHOSNativeBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENTATION_PROPERTIES_OHOS); }
    public static VkPhysicalDevicePresentationPropertiesOHOS allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ohos.VKOHOSNativeBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENTATION_PROPERTIES_OHOS);
        return s;
    }
    public VkPhysicalDevicePresentationPropertiesOHOS copyFrom(VkPhysicalDevicePresentationPropertiesOHOS src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePresentationPropertiesOHOS reinterpret(long count) { return new VkPhysicalDevicePresentationPropertiesOHOS(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePresentationPropertiesOHOS asSlice(long index) { return new VkPhysicalDevicePresentationPropertiesOHOS(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePresentationPropertiesOHOS asSlice(long index, long count) { return new VkPhysicalDevicePresentationPropertiesOHOS(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePresentationPropertiesOHOS at(long index, Consumer<VkPhysicalDevicePresentationPropertiesOHOS> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int sharedImageAt(long index) { return (int) VH_sharedImage.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int sharedImage() { return (int) VH_sharedImage.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePresentationPropertiesOHOS sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentationPropertiesOHOS pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentationPropertiesOHOS sharedImageAt(long index, int value) { VH_sharedImage.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePresentationPropertiesOHOS sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentationPropertiesOHOS pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePresentationPropertiesOHOS sharedImage(int value) { VH_sharedImage.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePresentationPropertiesOHOS _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentationPropertiesOHOS _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePresentationPropertiesOHOS _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentationPropertiesOHOS _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _sharedImageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sharedImage, index), LAYOUT_sharedImage); }
    public MemorySegment _sharedImage() { return _sharedImageAt(0L); }
    public VkPhysicalDevicePresentationPropertiesOHOS _sharedImageAt(long index, MemorySegment src) { _sharedImageAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePresentationPropertiesOHOS _sharedImage(MemorySegment src) { return _sharedImageAt(0L, src); }
}
