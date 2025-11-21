// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ohos.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkNativeBufferOHOS`.
/// ## Layout
/// ```
/// struct VkNativeBufferOHOS {
///     VkStructureType sType;
///     const void* pNext;
///     struct OHBufferHandle* handle;
/// }
/// ```
public final class VkNativeBufferOHOS extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("handle")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_handle = LAYOUT.byteOffset(PathElement.groupElement("handle"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_handle = LAYOUT.select(PathElement.groupElement("handle"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_handle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handle"));

    public VkNativeBufferOHOS(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkNativeBufferOHOS of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkNativeBufferOHOS(segment, estimateCount(segment, LAYOUT)); }
    public static VkNativeBufferOHOS ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkNativeBufferOHOS(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkNativeBufferOHOS ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkNativeBufferOHOS(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkNativeBufferOHOS alloc(SegmentAllocator allocator) { return new VkNativeBufferOHOS(allocator.allocate(LAYOUT), 1); }
    public static VkNativeBufferOHOS alloc(SegmentAllocator allocator, long count) { return new VkNativeBufferOHOS(allocator.allocate(LAYOUT, count), count); }
    public static VkNativeBufferOHOS allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ohos.VKOHOSNativeBuffer.VK_STRUCTURE_TYPE_NATIVE_BUFFER_OHOS); }
    public static VkNativeBufferOHOS allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ohos.VKOHOSNativeBuffer.VK_STRUCTURE_TYPE_NATIVE_BUFFER_OHOS);
        return s;
    }
    public VkNativeBufferOHOS copyFrom(VkNativeBufferOHOS src) { this.segment().copyFrom(src.segment()); return this; }
    public VkNativeBufferOHOS reinterpret(long count) { return new VkNativeBufferOHOS(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkNativeBufferOHOS asSlice(long index) { return new VkNativeBufferOHOS(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkNativeBufferOHOS asSlice(long index, long count) { return new VkNativeBufferOHOS(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkNativeBufferOHOS at(long index, Consumer<VkNativeBufferOHOS> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment handleAt(long index) { return (MemorySegment) VH_handle.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment handle() { return (MemorySegment) VH_handle.get(this.segment(), 0L, 0L); }
    public VkNativeBufferOHOS sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferOHOS pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferOHOS handleAt(long index, MemorySegment value) { VH_handle.set(this.segment(), 0L, index, value); return this; }
    public VkNativeBufferOHOS sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferOHOS pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkNativeBufferOHOS handle(MemorySegment value) { VH_handle.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkNativeBufferOHOS _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkNativeBufferOHOS _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkNativeBufferOHOS _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkNativeBufferOHOS _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _handleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handle, index), LAYOUT_handle); }
    public MemorySegment _handle() { return _handleAt(0L); }
    public VkNativeBufferOHOS _handleAt(long index, MemorySegment src) { _handleAt(index).copyFrom(src); return this; }
    public VkNativeBufferOHOS _handle(MemorySegment src) { return _handleAt(0L, src); }
}
