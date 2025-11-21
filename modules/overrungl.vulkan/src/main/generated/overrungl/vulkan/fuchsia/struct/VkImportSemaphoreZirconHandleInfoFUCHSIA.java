// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImportSemaphoreZirconHandleInfoFUCHSIA`.
/// ## Layout
/// ```
/// struct VkImportSemaphoreZirconHandleInfoFUCHSIA {
///     VkStructureType sType;
///     const void* pNext;
///     VkSemaphore semaphore;
///     VkSemaphoreImportFlags flags;
///     VkExternalSemaphoreHandleTypeFlagBits handleType;
///     zx_handle_t zirconHandle;
/// }
/// ```
public final class VkImportSemaphoreZirconHandleInfoFUCHSIA extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("semaphore"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.JAVA_INT.withName("zirconHandle")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_semaphore = LAYOUT.byteOffset(PathElement.groupElement("semaphore"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    public static final long OFFSET_zirconHandle = LAYOUT.byteOffset(PathElement.groupElement("zirconHandle"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_semaphore = LAYOUT.select(PathElement.groupElement("semaphore"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    public static final MemoryLayout LAYOUT_zirconHandle = LAYOUT.select(PathElement.groupElement("zirconHandle"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));
    public static final VarHandle VH_zirconHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("zirconHandle"));

    public VkImportSemaphoreZirconHandleInfoFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImportSemaphoreZirconHandleInfoFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportSemaphoreZirconHandleInfoFUCHSIA(segment, estimateCount(segment, LAYOUT)); }
    public static VkImportSemaphoreZirconHandleInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportSemaphoreZirconHandleInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImportSemaphoreZirconHandleInfoFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportSemaphoreZirconHandleInfoFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImportSemaphoreZirconHandleInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkImportSemaphoreZirconHandleInfoFUCHSIA(allocator.allocate(LAYOUT), 1); }
    public static VkImportSemaphoreZirconHandleInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkImportSemaphoreZirconHandleInfoFUCHSIA(allocator.allocate(LAYOUT, count), count); }
    public static VkImportSemaphoreZirconHandleInfoFUCHSIA allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.fuchsia.VKFUCHSIAExternalSemaphore.VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_ZIRCON_HANDLE_INFO_FUCHSIA); }
    public static VkImportSemaphoreZirconHandleInfoFUCHSIA allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.fuchsia.VKFUCHSIAExternalSemaphore.VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_ZIRCON_HANDLE_INFO_FUCHSIA);
        return s;
    }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA copyFrom(VkImportSemaphoreZirconHandleInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA reinterpret(long count) { return new VkImportSemaphoreZirconHandleInfoFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA asSlice(long index) { return new VkImportSemaphoreZirconHandleInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA asSlice(long index, long count) { return new VkImportSemaphoreZirconHandleInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA at(long index, Consumer<VkImportSemaphoreZirconHandleInfoFUCHSIA> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long semaphoreAt(long index) { return (long) VH_semaphore.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int handleTypeAt(long index) { return (int) VH_handleType.get(this.segment(), 0L, index); }
    public int zirconHandleAt(long index) { return (int) VH_zirconHandle.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long semaphore() { return (long) VH_semaphore.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int handleType() { return (int) VH_handleType.get(this.segment(), 0L, 0L); }
    public int zirconHandle() { return (int) VH_zirconHandle.get(this.segment(), 0L, 0L); }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA semaphoreAt(long index, long value) { VH_semaphore.set(this.segment(), 0L, index, value); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA handleTypeAt(long index, int value) { VH_handleType.set(this.segment(), 0L, index, value); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA zirconHandleAt(long index, int value) { VH_zirconHandle.set(this.segment(), 0L, index, value); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA semaphore(long value) { VH_semaphore.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA handleType(int value) { VH_handleType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA zirconHandle(int value) { VH_zirconHandle.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _semaphoreAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_semaphore, index), LAYOUT_semaphore); }
    public MemorySegment _semaphore() { return _semaphoreAt(0L); }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA _semaphoreAt(long index, MemorySegment src) { _semaphoreAt(index).copyFrom(src); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA _semaphore(MemorySegment src) { return _semaphoreAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _handleTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handleType, index), LAYOUT_handleType); }
    public MemorySegment _handleType() { return _handleTypeAt(0L); }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA _handleTypeAt(long index, MemorySegment src) { _handleTypeAt(index).copyFrom(src); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA _handleType(MemorySegment src) { return _handleTypeAt(0L, src); }
    public MemorySegment _zirconHandleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_zirconHandle, index), LAYOUT_zirconHandle); }
    public MemorySegment _zirconHandle() { return _zirconHandleAt(0L); }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA _zirconHandleAt(long index, MemorySegment src) { _zirconHandleAt(index).copyFrom(src); return this; }
    public VkImportSemaphoreZirconHandleInfoFUCHSIA _zirconHandle(MemorySegment src) { return _zirconHandleAt(0L, src); }
}
