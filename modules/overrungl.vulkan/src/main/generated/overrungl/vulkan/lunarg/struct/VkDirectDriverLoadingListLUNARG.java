// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.lunarg.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDirectDriverLoadingListLUNARG`.
/// ## Layout
/// ```
/// struct VkDirectDriverLoadingListLUNARG {
///     VkStructureType sType;
///     const void* pNext;
///     VkDirectDriverLoadingModeLUNARG mode;
///     uint32_t driverCount;
///     const VkDirectDriverLoadingInfoLUNARG* pDrivers;
/// }
/// ```
public final class VkDirectDriverLoadingListLUNARG extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_INT.withName("driverCount"),
        ValueLayout.ADDRESS.withName("pDrivers")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    public static final long OFFSET_driverCount = LAYOUT.byteOffset(PathElement.groupElement("driverCount"));
    public static final long OFFSET_pDrivers = LAYOUT.byteOffset(PathElement.groupElement("pDrivers"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    public static final MemoryLayout LAYOUT_driverCount = LAYOUT.select(PathElement.groupElement("driverCount"));
    public static final MemoryLayout LAYOUT_pDrivers = LAYOUT.select(PathElement.groupElement("pDrivers"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));
    public static final VarHandle VH_driverCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverCount"));
    public static final VarHandle VH_pDrivers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDrivers"));

    public VkDirectDriverLoadingListLUNARG(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDirectDriverLoadingListLUNARG of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDirectDriverLoadingListLUNARG(segment, estimateCount(segment, LAYOUT)); }
    public static VkDirectDriverLoadingListLUNARG ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDirectDriverLoadingListLUNARG(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDirectDriverLoadingListLUNARG ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDirectDriverLoadingListLUNARG(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDirectDriverLoadingListLUNARG alloc(SegmentAllocator allocator) { return new VkDirectDriverLoadingListLUNARG(allocator.allocate(LAYOUT), 1); }
    public static VkDirectDriverLoadingListLUNARG alloc(SegmentAllocator allocator, long count) { return new VkDirectDriverLoadingListLUNARG(allocator.allocate(LAYOUT, count), count); }
    public static VkDirectDriverLoadingListLUNARG allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.lunarg.VKLUNARGDirectDriverLoading.VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG); }
    public static VkDirectDriverLoadingListLUNARG allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.lunarg.VKLUNARGDirectDriverLoading.VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG);
        return s;
    }
    public VkDirectDriverLoadingListLUNARG copyFrom(VkDirectDriverLoadingListLUNARG src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDirectDriverLoadingListLUNARG reinterpret(long count) { return new VkDirectDriverLoadingListLUNARG(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDirectDriverLoadingListLUNARG asSlice(long index) { return new VkDirectDriverLoadingListLUNARG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDirectDriverLoadingListLUNARG asSlice(long index, long count) { return new VkDirectDriverLoadingListLUNARG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDirectDriverLoadingListLUNARG at(long index, Consumer<VkDirectDriverLoadingListLUNARG> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int modeAt(long index) { return (int) VH_mode.get(this.segment(), 0L, index); }
    public int driverCountAt(long index) { return (int) VH_driverCount.get(this.segment(), 0L, index); }
    public MemorySegment pDriversAt(long index) { return (MemorySegment) VH_pDrivers.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int mode() { return (int) VH_mode.get(this.segment(), 0L, 0L); }
    public int driverCount() { return (int) VH_driverCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDrivers() { return (MemorySegment) VH_pDrivers.get(this.segment(), 0L, 0L); }
    public VkDirectDriverLoadingListLUNARG sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDirectDriverLoadingListLUNARG pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDirectDriverLoadingListLUNARG modeAt(long index, int value) { VH_mode.set(this.segment(), 0L, index, value); return this; }
    public VkDirectDriverLoadingListLUNARG driverCountAt(long index, int value) { VH_driverCount.set(this.segment(), 0L, index, value); return this; }
    public VkDirectDriverLoadingListLUNARG pDriversAt(long index, MemorySegment value) { VH_pDrivers.set(this.segment(), 0L, index, value); return this; }
    public VkDirectDriverLoadingListLUNARG sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDirectDriverLoadingListLUNARG pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDirectDriverLoadingListLUNARG mode(int value) { VH_mode.set(this.segment(), 0L, 0L, value); return this; }
    public VkDirectDriverLoadingListLUNARG driverCount(int value) { VH_driverCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDirectDriverLoadingListLUNARG pDrivers(MemorySegment value) { VH_pDrivers.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDirectDriverLoadingListLUNARG _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDirectDriverLoadingListLUNARG _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDirectDriverLoadingListLUNARG _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDirectDriverLoadingListLUNARG _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _modeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mode, index), LAYOUT_mode); }
    public MemorySegment _mode() { return _modeAt(0L); }
    public VkDirectDriverLoadingListLUNARG _modeAt(long index, MemorySegment src) { _modeAt(index).copyFrom(src); return this; }
    public VkDirectDriverLoadingListLUNARG _mode(MemorySegment src) { return _modeAt(0L, src); }
    public MemorySegment _driverCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_driverCount, index), LAYOUT_driverCount); }
    public MemorySegment _driverCount() { return _driverCountAt(0L); }
    public VkDirectDriverLoadingListLUNARG _driverCountAt(long index, MemorySegment src) { _driverCountAt(index).copyFrom(src); return this; }
    public VkDirectDriverLoadingListLUNARG _driverCount(MemorySegment src) { return _driverCountAt(0L, src); }
    public MemorySegment _pDriversAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDrivers, index), LAYOUT_pDrivers); }
    public MemorySegment _pDrivers() { return _pDriversAt(0L); }
    public VkDirectDriverLoadingListLUNARG _pDriversAt(long index, MemorySegment src) { _pDriversAt(index).copyFrom(src); return this; }
    public VkDirectDriverLoadingListLUNARG _pDrivers(MemorySegment src) { return _pDriversAt(0L, src); }
}
