// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkLatencySleepModeInfoNV`.
/// ## Layout
/// ```
/// struct VkLatencySleepModeInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 lowLatencyMode;
///     VkBool32 lowLatencyBoost;
///     uint32_t minimumIntervalUs;
/// }
/// ```
public final class VkLatencySleepModeInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lowLatencyMode"),
        ValueLayout.JAVA_INT.withName("lowLatencyBoost"),
        ValueLayout.JAVA_INT.withName("minimumIntervalUs")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_lowLatencyMode = LAYOUT.byteOffset(PathElement.groupElement("lowLatencyMode"));
    public static final long OFFSET_lowLatencyBoost = LAYOUT.byteOffset(PathElement.groupElement("lowLatencyBoost"));
    public static final long OFFSET_minimumIntervalUs = LAYOUT.byteOffset(PathElement.groupElement("minimumIntervalUs"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_lowLatencyMode = LAYOUT.select(PathElement.groupElement("lowLatencyMode"));
    public static final MemoryLayout LAYOUT_lowLatencyBoost = LAYOUT.select(PathElement.groupElement("lowLatencyBoost"));
    public static final MemoryLayout LAYOUT_minimumIntervalUs = LAYOUT.select(PathElement.groupElement("minimumIntervalUs"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_lowLatencyMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lowLatencyMode"));
    public static final VarHandle VH_lowLatencyBoost = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lowLatencyBoost"));
    public static final VarHandle VH_minimumIntervalUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minimumIntervalUs"));

    public VkLatencySleepModeInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkLatencySleepModeInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySleepModeInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkLatencySleepModeInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySleepModeInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkLatencySleepModeInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySleepModeInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkLatencySleepModeInfoNV alloc(SegmentAllocator allocator) { return new VkLatencySleepModeInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkLatencySleepModeInfoNV alloc(SegmentAllocator allocator, long count) { return new VkLatencySleepModeInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkLatencySleepModeInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV); }
    public static VkLatencySleepModeInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV);
        return s;
    }
    public VkLatencySleepModeInfoNV copyFrom(VkLatencySleepModeInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkLatencySleepModeInfoNV reinterpret(long count) { return new VkLatencySleepModeInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkLatencySleepModeInfoNV asSlice(long index) { return new VkLatencySleepModeInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkLatencySleepModeInfoNV asSlice(long index, long count) { return new VkLatencySleepModeInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkLatencySleepModeInfoNV at(long index, Consumer<VkLatencySleepModeInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int lowLatencyModeAt(long index) { return (int) VH_lowLatencyMode.get(this.segment(), 0L, index); }
    public int lowLatencyBoostAt(long index) { return (int) VH_lowLatencyBoost.get(this.segment(), 0L, index); }
    public int minimumIntervalUsAt(long index) { return (int) VH_minimumIntervalUs.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int lowLatencyMode() { return (int) VH_lowLatencyMode.get(this.segment(), 0L, 0L); }
    public int lowLatencyBoost() { return (int) VH_lowLatencyBoost.get(this.segment(), 0L, 0L); }
    public int minimumIntervalUs() { return (int) VH_minimumIntervalUs.get(this.segment(), 0L, 0L); }
    public VkLatencySleepModeInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkLatencySleepModeInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkLatencySleepModeInfoNV lowLatencyModeAt(long index, int value) { VH_lowLatencyMode.set(this.segment(), 0L, index, value); return this; }
    public VkLatencySleepModeInfoNV lowLatencyBoostAt(long index, int value) { VH_lowLatencyBoost.set(this.segment(), 0L, index, value); return this; }
    public VkLatencySleepModeInfoNV minimumIntervalUsAt(long index, int value) { VH_minimumIntervalUs.set(this.segment(), 0L, index, value); return this; }
    public VkLatencySleepModeInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencySleepModeInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencySleepModeInfoNV lowLatencyMode(int value) { VH_lowLatencyMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencySleepModeInfoNV lowLatencyBoost(int value) { VH_lowLatencyBoost.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencySleepModeInfoNV minimumIntervalUs(int value) { VH_minimumIntervalUs.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkLatencySleepModeInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkLatencySleepModeInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkLatencySleepModeInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkLatencySleepModeInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _lowLatencyModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_lowLatencyMode, index), LAYOUT_lowLatencyMode); }
    public MemorySegment _lowLatencyMode() { return _lowLatencyModeAt(0L); }
    public VkLatencySleepModeInfoNV _lowLatencyModeAt(long index, MemorySegment src) { _lowLatencyModeAt(index).copyFrom(src); return this; }
    public VkLatencySleepModeInfoNV _lowLatencyMode(MemorySegment src) { return _lowLatencyModeAt(0L, src); }
    public MemorySegment _lowLatencyBoostAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_lowLatencyBoost, index), LAYOUT_lowLatencyBoost); }
    public MemorySegment _lowLatencyBoost() { return _lowLatencyBoostAt(0L); }
    public VkLatencySleepModeInfoNV _lowLatencyBoostAt(long index, MemorySegment src) { _lowLatencyBoostAt(index).copyFrom(src); return this; }
    public VkLatencySleepModeInfoNV _lowLatencyBoost(MemorySegment src) { return _lowLatencyBoostAt(0L, src); }
    public MemorySegment _minimumIntervalUsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minimumIntervalUs, index), LAYOUT_minimumIntervalUs); }
    public MemorySegment _minimumIntervalUs() { return _minimumIntervalUsAt(0L); }
    public VkLatencySleepModeInfoNV _minimumIntervalUsAt(long index, MemorySegment src) { _minimumIntervalUsAt(index).copyFrom(src); return this; }
    public VkLatencySleepModeInfoNV _minimumIntervalUs(MemorySegment src) { return _minimumIntervalUsAt(0L, src); }
}
