// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkWin32KeyedMutexAcquireReleaseInfoKHR`.
/// ## Layout
/// ```
/// struct VkWin32KeyedMutexAcquireReleaseInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t acquireCount;
///     const VkDeviceMemory* pAcquireSyncs;
///     const uint64_t* pAcquireKeys;
///     const uint32_t* pAcquireTimeouts;
///     uint32_t releaseCount;
///     const VkDeviceMemory* pReleaseSyncs;
///     const uint64_t* pReleaseKeys;
/// }
/// ```
public final class VkWin32KeyedMutexAcquireReleaseInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("acquireCount"),
        ValueLayout.ADDRESS.withName("pAcquireSyncs"),
        ValueLayout.ADDRESS.withName("pAcquireKeys"),
        ValueLayout.ADDRESS.withName("pAcquireTimeouts"),
        ValueLayout.JAVA_INT.withName("releaseCount"),
        ValueLayout.ADDRESS.withName("pReleaseSyncs"),
        ValueLayout.ADDRESS.withName("pReleaseKeys")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_acquireCount = LAYOUT.byteOffset(PathElement.groupElement("acquireCount"));
    public static final long OFFSET_pAcquireSyncs = LAYOUT.byteOffset(PathElement.groupElement("pAcquireSyncs"));
    public static final long OFFSET_pAcquireKeys = LAYOUT.byteOffset(PathElement.groupElement("pAcquireKeys"));
    public static final long OFFSET_pAcquireTimeouts = LAYOUT.byteOffset(PathElement.groupElement("pAcquireTimeouts"));
    public static final long OFFSET_releaseCount = LAYOUT.byteOffset(PathElement.groupElement("releaseCount"));
    public static final long OFFSET_pReleaseSyncs = LAYOUT.byteOffset(PathElement.groupElement("pReleaseSyncs"));
    public static final long OFFSET_pReleaseKeys = LAYOUT.byteOffset(PathElement.groupElement("pReleaseKeys"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_acquireCount = LAYOUT.select(PathElement.groupElement("acquireCount"));
    public static final MemoryLayout LAYOUT_pAcquireSyncs = LAYOUT.select(PathElement.groupElement("pAcquireSyncs"));
    public static final MemoryLayout LAYOUT_pAcquireKeys = LAYOUT.select(PathElement.groupElement("pAcquireKeys"));
    public static final MemoryLayout LAYOUT_pAcquireTimeouts = LAYOUT.select(PathElement.groupElement("pAcquireTimeouts"));
    public static final MemoryLayout LAYOUT_releaseCount = LAYOUT.select(PathElement.groupElement("releaseCount"));
    public static final MemoryLayout LAYOUT_pReleaseSyncs = LAYOUT.select(PathElement.groupElement("pReleaseSyncs"));
    public static final MemoryLayout LAYOUT_pReleaseKeys = LAYOUT.select(PathElement.groupElement("pReleaseKeys"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_acquireCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("acquireCount"));
    public static final VarHandle VH_pAcquireSyncs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAcquireSyncs"));
    public static final VarHandle VH_pAcquireKeys = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAcquireKeys"));
    public static final VarHandle VH_pAcquireTimeouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAcquireTimeouts"));
    public static final VarHandle VH_releaseCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("releaseCount"));
    public static final VarHandle VH_pReleaseSyncs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReleaseSyncs"));
    public static final VarHandle VH_pReleaseKeys = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pReleaseKeys"));

    public VkWin32KeyedMutexAcquireReleaseInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWin32KeyedMutexAcquireReleaseInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWin32KeyedMutexAcquireReleaseInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWin32KeyedMutexAcquireReleaseInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR alloc(SegmentAllocator allocator) { return new VkWin32KeyedMutexAcquireReleaseInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkWin32KeyedMutexAcquireReleaseInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRWin32KeyedMutex.VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR); }
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRWin32KeyedMutex.VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR);
        return s;
    }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR copyFrom(VkWin32KeyedMutexAcquireReleaseInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR reinterpret(long count) { return new VkWin32KeyedMutexAcquireReleaseInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR asSlice(long index) { return new VkWin32KeyedMutexAcquireReleaseInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR asSlice(long index, long count) { return new VkWin32KeyedMutexAcquireReleaseInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR at(long index, Consumer<VkWin32KeyedMutexAcquireReleaseInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int acquireCountAt(long index) { return (int) VH_acquireCount.get(this.segment(), 0L, index); }
    public MemorySegment pAcquireSyncsAt(long index) { return (MemorySegment) VH_pAcquireSyncs.get(this.segment(), 0L, index); }
    public MemorySegment pAcquireKeysAt(long index) { return (MemorySegment) VH_pAcquireKeys.get(this.segment(), 0L, index); }
    public MemorySegment pAcquireTimeoutsAt(long index) { return (MemorySegment) VH_pAcquireTimeouts.get(this.segment(), 0L, index); }
    public int releaseCountAt(long index) { return (int) VH_releaseCount.get(this.segment(), 0L, index); }
    public MemorySegment pReleaseSyncsAt(long index) { return (MemorySegment) VH_pReleaseSyncs.get(this.segment(), 0L, index); }
    public MemorySegment pReleaseKeysAt(long index) { return (MemorySegment) VH_pReleaseKeys.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int acquireCount() { return (int) VH_acquireCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pAcquireSyncs() { return (MemorySegment) VH_pAcquireSyncs.get(this.segment(), 0L, 0L); }
    public MemorySegment pAcquireKeys() { return (MemorySegment) VH_pAcquireKeys.get(this.segment(), 0L, 0L); }
    public MemorySegment pAcquireTimeouts() { return (MemorySegment) VH_pAcquireTimeouts.get(this.segment(), 0L, 0L); }
    public int releaseCount() { return (int) VH_releaseCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pReleaseSyncs() { return (MemorySegment) VH_pReleaseSyncs.get(this.segment(), 0L, 0L); }
    public MemorySegment pReleaseKeys() { return (MemorySegment) VH_pReleaseKeys.get(this.segment(), 0L, 0L); }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR acquireCountAt(long index, int value) { VH_acquireCount.set(this.segment(), 0L, index, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pAcquireSyncsAt(long index, MemorySegment value) { VH_pAcquireSyncs.set(this.segment(), 0L, index, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pAcquireKeysAt(long index, MemorySegment value) { VH_pAcquireKeys.set(this.segment(), 0L, index, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pAcquireTimeoutsAt(long index, MemorySegment value) { VH_pAcquireTimeouts.set(this.segment(), 0L, index, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR releaseCountAt(long index, int value) { VH_releaseCount.set(this.segment(), 0L, index, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pReleaseSyncsAt(long index, MemorySegment value) { VH_pReleaseSyncs.set(this.segment(), 0L, index, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pReleaseKeysAt(long index, MemorySegment value) { VH_pReleaseKeys.set(this.segment(), 0L, index, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR acquireCount(int value) { VH_acquireCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pAcquireSyncs(MemorySegment value) { VH_pAcquireSyncs.set(this.segment(), 0L, 0L, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pAcquireKeys(MemorySegment value) { VH_pAcquireKeys.set(this.segment(), 0L, 0L, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pAcquireTimeouts(MemorySegment value) { VH_pAcquireTimeouts.set(this.segment(), 0L, 0L, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR releaseCount(int value) { VH_releaseCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pReleaseSyncs(MemorySegment value) { VH_pReleaseSyncs.set(this.segment(), 0L, 0L, value); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pReleaseKeys(MemorySegment value) { VH_pReleaseKeys.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _acquireCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_acquireCount, index), LAYOUT_acquireCount); }
    public MemorySegment _acquireCount() { return _acquireCountAt(0L); }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _acquireCountAt(long index, MemorySegment src) { _acquireCountAt(index).copyFrom(src); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _acquireCount(MemorySegment src) { return _acquireCountAt(0L, src); }
    public MemorySegment _pAcquireSyncsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAcquireSyncs, index), LAYOUT_pAcquireSyncs); }
    public MemorySegment _pAcquireSyncs() { return _pAcquireSyncsAt(0L); }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _pAcquireSyncsAt(long index, MemorySegment src) { _pAcquireSyncsAt(index).copyFrom(src); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _pAcquireSyncs(MemorySegment src) { return _pAcquireSyncsAt(0L, src); }
    public MemorySegment _pAcquireKeysAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAcquireKeys, index), LAYOUT_pAcquireKeys); }
    public MemorySegment _pAcquireKeys() { return _pAcquireKeysAt(0L); }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _pAcquireKeysAt(long index, MemorySegment src) { _pAcquireKeysAt(index).copyFrom(src); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _pAcquireKeys(MemorySegment src) { return _pAcquireKeysAt(0L, src); }
    public MemorySegment _pAcquireTimeoutsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pAcquireTimeouts, index), LAYOUT_pAcquireTimeouts); }
    public MemorySegment _pAcquireTimeouts() { return _pAcquireTimeoutsAt(0L); }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _pAcquireTimeoutsAt(long index, MemorySegment src) { _pAcquireTimeoutsAt(index).copyFrom(src); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _pAcquireTimeouts(MemorySegment src) { return _pAcquireTimeoutsAt(0L, src); }
    public MemorySegment _releaseCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_releaseCount, index), LAYOUT_releaseCount); }
    public MemorySegment _releaseCount() { return _releaseCountAt(0L); }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _releaseCountAt(long index, MemorySegment src) { _releaseCountAt(index).copyFrom(src); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _releaseCount(MemorySegment src) { return _releaseCountAt(0L, src); }
    public MemorySegment _pReleaseSyncsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pReleaseSyncs, index), LAYOUT_pReleaseSyncs); }
    public MemorySegment _pReleaseSyncs() { return _pReleaseSyncsAt(0L); }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _pReleaseSyncsAt(long index, MemorySegment src) { _pReleaseSyncsAt(index).copyFrom(src); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _pReleaseSyncs(MemorySegment src) { return _pReleaseSyncsAt(0L, src); }
    public MemorySegment _pReleaseKeysAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pReleaseKeys, index), LAYOUT_pReleaseKeys); }
    public MemorySegment _pReleaseKeys() { return _pReleaseKeysAt(0L); }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _pReleaseKeysAt(long index, MemorySegment src) { _pReleaseKeysAt(index).copyFrom(src); return this; }
    public VkWin32KeyedMutexAcquireReleaseInfoKHR _pReleaseKeys(MemorySegment src) { return _pReleaseKeysAt(0L, src); }
}
