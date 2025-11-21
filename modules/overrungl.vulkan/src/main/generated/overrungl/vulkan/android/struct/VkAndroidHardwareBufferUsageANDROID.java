// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.android.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAndroidHardwareBufferUsageANDROID`.
/// ## Layout
/// ```
/// struct VkAndroidHardwareBufferUsageANDROID {
///     VkStructureType sType;
///     void* pNext;
///     uint64_t androidHardwareBufferUsage;
/// }
/// ```
public final class VkAndroidHardwareBufferUsageANDROID extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("androidHardwareBufferUsage")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_androidHardwareBufferUsage = LAYOUT.byteOffset(PathElement.groupElement("androidHardwareBufferUsage"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_androidHardwareBufferUsage = LAYOUT.select(PathElement.groupElement("androidHardwareBufferUsage"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_androidHardwareBufferUsage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("androidHardwareBufferUsage"));

    public VkAndroidHardwareBufferUsageANDROID(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAndroidHardwareBufferUsageANDROID of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferUsageANDROID(segment, estimateCount(segment, LAYOUT)); }
    public static VkAndroidHardwareBufferUsageANDROID ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferUsageANDROID(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAndroidHardwareBufferUsageANDROID ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferUsageANDROID(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAndroidHardwareBufferUsageANDROID alloc(SegmentAllocator allocator) { return new VkAndroidHardwareBufferUsageANDROID(allocator.allocate(LAYOUT), 1); }
    public static VkAndroidHardwareBufferUsageANDROID alloc(SegmentAllocator allocator, long count) { return new VkAndroidHardwareBufferUsageANDROID(allocator.allocate(LAYOUT, count), count); }
    public static VkAndroidHardwareBufferUsageANDROID allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.android.VKANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID); }
    public static VkAndroidHardwareBufferUsageANDROID allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.android.VKANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID);
        return s;
    }
    public VkAndroidHardwareBufferUsageANDROID copyFrom(VkAndroidHardwareBufferUsageANDROID src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAndroidHardwareBufferUsageANDROID reinterpret(long count) { return new VkAndroidHardwareBufferUsageANDROID(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAndroidHardwareBufferUsageANDROID asSlice(long index) { return new VkAndroidHardwareBufferUsageANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAndroidHardwareBufferUsageANDROID asSlice(long index, long count) { return new VkAndroidHardwareBufferUsageANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAndroidHardwareBufferUsageANDROID at(long index, Consumer<VkAndroidHardwareBufferUsageANDROID> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long androidHardwareBufferUsageAt(long index) { return (long) VH_androidHardwareBufferUsage.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long androidHardwareBufferUsage() { return (long) VH_androidHardwareBufferUsage.get(this.segment(), 0L, 0L); }
    public VkAndroidHardwareBufferUsageANDROID sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAndroidHardwareBufferUsageANDROID pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAndroidHardwareBufferUsageANDROID androidHardwareBufferUsageAt(long index, long value) { VH_androidHardwareBufferUsage.set(this.segment(), 0L, index, value); return this; }
    public VkAndroidHardwareBufferUsageANDROID sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAndroidHardwareBufferUsageANDROID pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAndroidHardwareBufferUsageANDROID androidHardwareBufferUsage(long value) { VH_androidHardwareBufferUsage.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAndroidHardwareBufferUsageANDROID _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAndroidHardwareBufferUsageANDROID _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAndroidHardwareBufferUsageANDROID _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAndroidHardwareBufferUsageANDROID _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _androidHardwareBufferUsageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_androidHardwareBufferUsage, index), LAYOUT_androidHardwareBufferUsage); }
    public MemorySegment _androidHardwareBufferUsage() { return _androidHardwareBufferUsageAt(0L); }
    public VkAndroidHardwareBufferUsageANDROID _androidHardwareBufferUsageAt(long index, MemorySegment src) { _androidHardwareBufferUsageAt(index).copyFrom(src); return this; }
    public VkAndroidHardwareBufferUsageANDROID _androidHardwareBufferUsage(MemorySegment src) { return _androidHardwareBufferUsageAt(0L, src); }
}
