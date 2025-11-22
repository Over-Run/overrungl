// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.android.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAndroidHardwareBufferPropertiesANDROID`.
/// ## Layout
/// ```
/// struct VkAndroidHardwareBufferPropertiesANDROID {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize allocationSize;
///     uint32_t memoryTypeBits;
/// }
/// ```
public final class VkAndroidHardwareBufferPropertiesANDROID extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("allocationSize"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_allocationSize = LAYOUT.byteOffset(PathElement.groupElement("allocationSize"));
    public static final long OFFSET_memoryTypeBits = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeBits"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_allocationSize = LAYOUT.select(PathElement.groupElement("allocationSize"));
    public static final MemoryLayout LAYOUT_memoryTypeBits = LAYOUT.select(PathElement.groupElement("memoryTypeBits"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_allocationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allocationSize"));
    public static final VarHandle VH_memoryTypeBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeBits"));

    public VkAndroidHardwareBufferPropertiesANDROID(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAndroidHardwareBufferPropertiesANDROID of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferPropertiesANDROID(segment, estimateCount(segment, LAYOUT)); }
    public static VkAndroidHardwareBufferPropertiesANDROID ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferPropertiesANDROID(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAndroidHardwareBufferPropertiesANDROID ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferPropertiesANDROID(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAndroidHardwareBufferPropertiesANDROID alloc(SegmentAllocator allocator) { return new VkAndroidHardwareBufferPropertiesANDROID(allocator.allocate(LAYOUT), 1); }
    public static VkAndroidHardwareBufferPropertiesANDROID alloc(SegmentAllocator allocator, long count) { return new VkAndroidHardwareBufferPropertiesANDROID(allocator.allocate(LAYOUT, count), count); }
    public static VkAndroidHardwareBufferPropertiesANDROID allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.android.VKANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID); }
    public static VkAndroidHardwareBufferPropertiesANDROID allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.android.VKANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID);
        return s;
    }
    public VkAndroidHardwareBufferPropertiesANDROID copyFrom(VkAndroidHardwareBufferPropertiesANDROID src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAndroidHardwareBufferPropertiesANDROID reinterpret(long count) { return new VkAndroidHardwareBufferPropertiesANDROID(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAndroidHardwareBufferPropertiesANDROID asSlice(long index) { return new VkAndroidHardwareBufferPropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAndroidHardwareBufferPropertiesANDROID asSlice(long index, long count) { return new VkAndroidHardwareBufferPropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAndroidHardwareBufferPropertiesANDROID at(long index, Consumer<VkAndroidHardwareBufferPropertiesANDROID> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long allocationSizeAt(long index) { return (long) VH_allocationSize.get(this.segment(), 0L, index); }
    public int memoryTypeBitsAt(long index) { return (int) VH_memoryTypeBits.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long allocationSize() { return (long) VH_allocationSize.get(this.segment(), 0L, 0L); }
    public int memoryTypeBits() { return (int) VH_memoryTypeBits.get(this.segment(), 0L, 0L); }
    public VkAndroidHardwareBufferPropertiesANDROID sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAndroidHardwareBufferPropertiesANDROID pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAndroidHardwareBufferPropertiesANDROID allocationSizeAt(long index, long value) { VH_allocationSize.set(this.segment(), 0L, index, value); return this; }
    public VkAndroidHardwareBufferPropertiesANDROID memoryTypeBitsAt(long index, int value) { VH_memoryTypeBits.set(this.segment(), 0L, index, value); return this; }
    public VkAndroidHardwareBufferPropertiesANDROID sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAndroidHardwareBufferPropertiesANDROID pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAndroidHardwareBufferPropertiesANDROID allocationSize(long value) { VH_allocationSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkAndroidHardwareBufferPropertiesANDROID memoryTypeBits(int value) { VH_memoryTypeBits.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAndroidHardwareBufferPropertiesANDROID _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAndroidHardwareBufferPropertiesANDROID _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAndroidHardwareBufferPropertiesANDROID _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAndroidHardwareBufferPropertiesANDROID _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _allocationSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_allocationSize, index), LAYOUT_allocationSize); }
    public MemorySegment _allocationSize() { return _allocationSizeAt(0L); }
    public VkAndroidHardwareBufferPropertiesANDROID _allocationSizeAt(long index, MemorySegment src) { _allocationSizeAt(index).copyFrom(src); return this; }
    public VkAndroidHardwareBufferPropertiesANDROID _allocationSize(MemorySegment src) { return _allocationSizeAt(0L, src); }
    public MemorySegment _memoryTypeBitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryTypeBits, index), LAYOUT_memoryTypeBits); }
    public MemorySegment _memoryTypeBits() { return _memoryTypeBitsAt(0L); }
    public VkAndroidHardwareBufferPropertiesANDROID _memoryTypeBitsAt(long index, MemorySegment src) { _memoryTypeBitsAt(index).copyFrom(src); return this; }
    public VkAndroidHardwareBufferPropertiesANDROID _memoryTypeBits(MemorySegment src) { return _memoryTypeBitsAt(0L, src); }
}
