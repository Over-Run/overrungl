// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExternalMemoryAcquireUnmodifiedEXT`.
/// ## Layout
/// ```
/// struct VkExternalMemoryAcquireUnmodifiedEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 acquireUnmodifiedMemory;
/// }
/// ```
public final class VkExternalMemoryAcquireUnmodifiedEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("acquireUnmodifiedMemory")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_acquireUnmodifiedMemory = LAYOUT.byteOffset(PathElement.groupElement("acquireUnmodifiedMemory"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_acquireUnmodifiedMemory = LAYOUT.select(PathElement.groupElement("acquireUnmodifiedMemory"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_acquireUnmodifiedMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("acquireUnmodifiedMemory"));

    public VkExternalMemoryAcquireUnmodifiedEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExternalMemoryAcquireUnmodifiedEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryAcquireUnmodifiedEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkExternalMemoryAcquireUnmodifiedEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryAcquireUnmodifiedEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExternalMemoryAcquireUnmodifiedEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryAcquireUnmodifiedEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExternalMemoryAcquireUnmodifiedEXT alloc(SegmentAllocator allocator) { return new VkExternalMemoryAcquireUnmodifiedEXT(allocator.allocate(LAYOUT), 1); }
    public static VkExternalMemoryAcquireUnmodifiedEXT alloc(SegmentAllocator allocator, long count) { return new VkExternalMemoryAcquireUnmodifiedEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkExternalMemoryAcquireUnmodifiedEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTExternalMemoryAcquireUnmodified.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT); }
    public static VkExternalMemoryAcquireUnmodifiedEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTExternalMemoryAcquireUnmodified.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_ACQUIRE_UNMODIFIED_EXT);
        return s;
    }
    public VkExternalMemoryAcquireUnmodifiedEXT copyFrom(VkExternalMemoryAcquireUnmodifiedEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExternalMemoryAcquireUnmodifiedEXT reinterpret(long count) { return new VkExternalMemoryAcquireUnmodifiedEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExternalMemoryAcquireUnmodifiedEXT asSlice(long index) { return new VkExternalMemoryAcquireUnmodifiedEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExternalMemoryAcquireUnmodifiedEXT asSlice(long index, long count) { return new VkExternalMemoryAcquireUnmodifiedEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExternalMemoryAcquireUnmodifiedEXT at(long index, Consumer<VkExternalMemoryAcquireUnmodifiedEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int acquireUnmodifiedMemoryAt(long index) { return (int) VH_acquireUnmodifiedMemory.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int acquireUnmodifiedMemory() { return (int) VH_acquireUnmodifiedMemory.get(this.segment(), 0L, 0L); }
    public VkExternalMemoryAcquireUnmodifiedEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExternalMemoryAcquireUnmodifiedEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExternalMemoryAcquireUnmodifiedEXT acquireUnmodifiedMemoryAt(long index, int value) { VH_acquireUnmodifiedMemory.set(this.segment(), 0L, index, value); return this; }
    public VkExternalMemoryAcquireUnmodifiedEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalMemoryAcquireUnmodifiedEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalMemoryAcquireUnmodifiedEXT acquireUnmodifiedMemory(int value) { VH_acquireUnmodifiedMemory.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExternalMemoryAcquireUnmodifiedEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExternalMemoryAcquireUnmodifiedEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExternalMemoryAcquireUnmodifiedEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExternalMemoryAcquireUnmodifiedEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _acquireUnmodifiedMemoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_acquireUnmodifiedMemory, index), LAYOUT_acquireUnmodifiedMemory); }
    public MemorySegment _acquireUnmodifiedMemory() { return _acquireUnmodifiedMemoryAt(0L); }
    public VkExternalMemoryAcquireUnmodifiedEXT _acquireUnmodifiedMemoryAt(long index, MemorySegment src) { _acquireUnmodifiedMemoryAt(index).copyFrom(src); return this; }
    public VkExternalMemoryAcquireUnmodifiedEXT _acquireUnmodifiedMemory(MemorySegment src) { return _acquireUnmodifiedMemoryAt(0L, src); }
}
