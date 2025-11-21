// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ohos.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkNativeBufferUsageOHOS`.
/// ## Layout
/// ```
/// struct VkNativeBufferUsageOHOS {
///     VkStructureType sType;
///     void* pNext;
///     uint64_t OHOSNativeBufferUsage;
/// }
/// ```
public final class VkNativeBufferUsageOHOS extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("OHOSNativeBufferUsage")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_OHOSNativeBufferUsage = LAYOUT.byteOffset(PathElement.groupElement("OHOSNativeBufferUsage"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_OHOSNativeBufferUsage = LAYOUT.select(PathElement.groupElement("OHOSNativeBufferUsage"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_OHOSNativeBufferUsage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("OHOSNativeBufferUsage"));

    public VkNativeBufferUsageOHOS(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkNativeBufferUsageOHOS of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkNativeBufferUsageOHOS(segment, estimateCount(segment, LAYOUT)); }
    public static VkNativeBufferUsageOHOS ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkNativeBufferUsageOHOS(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkNativeBufferUsageOHOS ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkNativeBufferUsageOHOS(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkNativeBufferUsageOHOS alloc(SegmentAllocator allocator) { return new VkNativeBufferUsageOHOS(allocator.allocate(LAYOUT), 1); }
    public static VkNativeBufferUsageOHOS alloc(SegmentAllocator allocator, long count) { return new VkNativeBufferUsageOHOS(allocator.allocate(LAYOUT, count), count); }
    public static VkNativeBufferUsageOHOS allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ohos.VKOHOSExternalMemory.VK_STRUCTURE_TYPE_NATIVE_BUFFER_USAGE_OHOS); }
    public static VkNativeBufferUsageOHOS allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ohos.VKOHOSExternalMemory.VK_STRUCTURE_TYPE_NATIVE_BUFFER_USAGE_OHOS);
        return s;
    }
    public VkNativeBufferUsageOHOS copyFrom(VkNativeBufferUsageOHOS src) { this.segment().copyFrom(src.segment()); return this; }
    public VkNativeBufferUsageOHOS reinterpret(long count) { return new VkNativeBufferUsageOHOS(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkNativeBufferUsageOHOS asSlice(long index) { return new VkNativeBufferUsageOHOS(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkNativeBufferUsageOHOS asSlice(long index, long count) { return new VkNativeBufferUsageOHOS(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkNativeBufferUsageOHOS at(long index, Consumer<VkNativeBufferUsageOHOS> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long OHOSNativeBufferUsageAt(long index) { return (long) VH_OHOSNativeBufferUsage.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long OHOSNativeBufferUsage() { return (long) VH_OHOSNativeBufferUsage.get(this.segment(), 0L, 0L); }
    public VkNativeBufferUsageOHOS sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferUsageOHOS pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferUsageOHOS OHOSNativeBufferUsageAt(long index, long value) { VH_OHOSNativeBufferUsage.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferUsageOHOS sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferUsageOHOS pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferUsageOHOS OHOSNativeBufferUsage(long value) { VH_OHOSNativeBufferUsage.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkNativeBufferUsageOHOS _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkNativeBufferUsageOHOS _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkNativeBufferUsageOHOS _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkNativeBufferUsageOHOS _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _OHOSNativeBufferUsageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_OHOSNativeBufferUsage, index), LAYOUT_OHOSNativeBufferUsage); }
    public MemorySegment _OHOSNativeBufferUsage() { return _OHOSNativeBufferUsageAt(0L); }
    public VkNativeBufferUsageOHOS _OHOSNativeBufferUsageAt(long index, MemorySegment src) { _OHOSNativeBufferUsageAt(index).copyFrom(src); return this; }
    public VkNativeBufferUsageOHOS _OHOSNativeBufferUsage(MemorySegment src) { return _OHOSNativeBufferUsageAt(0L, src); }
}
