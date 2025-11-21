// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ohos.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImportNativeBufferInfoOHOS`.
/// ## Layout
/// ```
/// struct VkImportNativeBufferInfoOHOS {
///     VkStructureType sType;
///     const void* pNext;
///     struct OH_NativeBuffer* buffer;
/// }
/// ```
public final class VkImportNativeBufferInfoOHOS extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("buffer")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_buffer = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_buffer = LAYOUT.select(PathElement.groupElement("buffer"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));

    public VkImportNativeBufferInfoOHOS(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImportNativeBufferInfoOHOS of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportNativeBufferInfoOHOS(segment, estimateCount(segment, LAYOUT)); }
    public static VkImportNativeBufferInfoOHOS ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportNativeBufferInfoOHOS(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImportNativeBufferInfoOHOS ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportNativeBufferInfoOHOS(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImportNativeBufferInfoOHOS alloc(SegmentAllocator allocator) { return new VkImportNativeBufferInfoOHOS(allocator.allocate(LAYOUT), 1); }
    public static VkImportNativeBufferInfoOHOS alloc(SegmentAllocator allocator, long count) { return new VkImportNativeBufferInfoOHOS(allocator.allocate(LAYOUT, count), count); }
    public static VkImportNativeBufferInfoOHOS allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ohos.VKOHOSExternalMemory.VK_STRUCTURE_TYPE_IMPORT_NATIVE_BUFFER_INFO_OHOS); }
    public static VkImportNativeBufferInfoOHOS allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ohos.VKOHOSExternalMemory.VK_STRUCTURE_TYPE_IMPORT_NATIVE_BUFFER_INFO_OHOS);
        return s;
    }
    public VkImportNativeBufferInfoOHOS copyFrom(VkImportNativeBufferInfoOHOS src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImportNativeBufferInfoOHOS reinterpret(long count) { return new VkImportNativeBufferInfoOHOS(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImportNativeBufferInfoOHOS asSlice(long index) { return new VkImportNativeBufferInfoOHOS(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImportNativeBufferInfoOHOS asSlice(long index, long count) { return new VkImportNativeBufferInfoOHOS(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImportNativeBufferInfoOHOS at(long index, Consumer<VkImportNativeBufferInfoOHOS> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment bufferAt(long index) { return (MemorySegment) VH_buffer.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment buffer() { return (MemorySegment) VH_buffer.get(this.segment(), 0L, 0L); }
    public VkImportNativeBufferInfoOHOS sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImportNativeBufferInfoOHOS pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImportNativeBufferInfoOHOS bufferAt(long index, MemorySegment value) { VH_buffer.set(this.segment(), 0L, index, value); return this; }
    public VkImportNativeBufferInfoOHOS sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportNativeBufferInfoOHOS pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportNativeBufferInfoOHOS buffer(MemorySegment value) { VH_buffer.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImportNativeBufferInfoOHOS _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImportNativeBufferInfoOHOS _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImportNativeBufferInfoOHOS _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImportNativeBufferInfoOHOS _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _bufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_buffer, index), LAYOUT_buffer); }
    public MemorySegment _buffer() { return _bufferAt(0L); }
    public VkImportNativeBufferInfoOHOS _bufferAt(long index, MemorySegment src) { _bufferAt(index).copyFrom(src); return this; }
    public VkImportNativeBufferInfoOHOS _buffer(MemorySegment src) { return _bufferAt(0L, src); }
}
