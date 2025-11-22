// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAntiLagDataAMD`.
/// ## Layout
/// ```
/// struct VkAntiLagDataAMD {
///     VkStructureType sType;
///     const void* pNext;
///     VkAntiLagModeAMD mode;
///     uint32_t maxFPS;
///     const VkAntiLagPresentationInfoAMD* pPresentationInfo;
/// }
/// ```
public final class VkAntiLagDataAMD extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_INT.withName("maxFPS"),
        ValueLayout.ADDRESS.withName("pPresentationInfo")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    public static final long OFFSET_maxFPS = LAYOUT.byteOffset(PathElement.groupElement("maxFPS"));
    public static final long OFFSET_pPresentationInfo = LAYOUT.byteOffset(PathElement.groupElement("pPresentationInfo"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    public static final MemoryLayout LAYOUT_maxFPS = LAYOUT.select(PathElement.groupElement("maxFPS"));
    public static final MemoryLayout LAYOUT_pPresentationInfo = LAYOUT.select(PathElement.groupElement("pPresentationInfo"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));
    public static final VarHandle VH_maxFPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFPS"));
    public static final VarHandle VH_pPresentationInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPresentationInfo"));

    public VkAntiLagDataAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAntiLagDataAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAntiLagDataAMD(segment, estimateCount(segment, LAYOUT)); }
    public static VkAntiLagDataAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAntiLagDataAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAntiLagDataAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAntiLagDataAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAntiLagDataAMD alloc(SegmentAllocator allocator) { return new VkAntiLagDataAMD(allocator.allocate(LAYOUT), 1); }
    public static VkAntiLagDataAMD alloc(SegmentAllocator allocator, long count) { return new VkAntiLagDataAMD(allocator.allocate(LAYOUT, count), count); }
    public static VkAntiLagDataAMD allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amd.VKAMDAntiLag.VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD); }
    public static VkAntiLagDataAMD allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amd.VKAMDAntiLag.VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD);
        return s;
    }
    public VkAntiLagDataAMD copyFrom(VkAntiLagDataAMD src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAntiLagDataAMD reinterpret(long count) { return new VkAntiLagDataAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAntiLagDataAMD asSlice(long index) { return new VkAntiLagDataAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAntiLagDataAMD asSlice(long index, long count) { return new VkAntiLagDataAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAntiLagDataAMD at(long index, Consumer<VkAntiLagDataAMD> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int modeAt(long index) { return (int) VH_mode.get(this.segment(), 0L, index); }
    public int maxFPSAt(long index) { return (int) VH_maxFPS.get(this.segment(), 0L, index); }
    public MemorySegment pPresentationInfoAt(long index) { return (MemorySegment) VH_pPresentationInfo.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int mode() { return (int) VH_mode.get(this.segment(), 0L, 0L); }
    public int maxFPS() { return (int) VH_maxFPS.get(this.segment(), 0L, 0L); }
    public MemorySegment pPresentationInfo() { return (MemorySegment) VH_pPresentationInfo.get(this.segment(), 0L, 0L); }
    public VkAntiLagDataAMD sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAntiLagDataAMD pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAntiLagDataAMD modeAt(long index, int value) { VH_mode.set(this.segment(), 0L, index, value); return this; }
    public VkAntiLagDataAMD maxFPSAt(long index, int value) { VH_maxFPS.set(this.segment(), 0L, index, value); return this; }
    public VkAntiLagDataAMD pPresentationInfoAt(long index, MemorySegment value) { VH_pPresentationInfo.set(this.segment(), 0L, index, value); return this; }
    public VkAntiLagDataAMD sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAntiLagDataAMD pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAntiLagDataAMD mode(int value) { VH_mode.set(this.segment(), 0L, 0L, value); return this; }
    public VkAntiLagDataAMD maxFPS(int value) { VH_maxFPS.set(this.segment(), 0L, 0L, value); return this; }
    public VkAntiLagDataAMD pPresentationInfo(MemorySegment value) { VH_pPresentationInfo.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAntiLagDataAMD _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAntiLagDataAMD _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAntiLagDataAMD _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAntiLagDataAMD _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _modeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mode, index), LAYOUT_mode); }
    public MemorySegment _mode() { return _modeAt(0L); }
    public VkAntiLagDataAMD _modeAt(long index, MemorySegment src) { _modeAt(index).copyFrom(src); return this; }
    public VkAntiLagDataAMD _mode(MemorySegment src) { return _modeAt(0L, src); }
    public MemorySegment _maxFPSAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFPS, index), LAYOUT_maxFPS); }
    public MemorySegment _maxFPS() { return _maxFPSAt(0L); }
    public VkAntiLagDataAMD _maxFPSAt(long index, MemorySegment src) { _maxFPSAt(index).copyFrom(src); return this; }
    public VkAntiLagDataAMD _maxFPS(MemorySegment src) { return _maxFPSAt(0L, src); }
    public MemorySegment _pPresentationInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPresentationInfo, index), LAYOUT_pPresentationInfo); }
    public MemorySegment _pPresentationInfo() { return _pPresentationInfoAt(0L); }
    public VkAntiLagDataAMD _pPresentationInfoAt(long index, MemorySegment src) { _pPresentationInfoAt(index).copyFrom(src); return this; }
    public VkAntiLagDataAMD _pPresentationInfo(MemorySegment src) { return _pPresentationInfoAt(0L, src); }
}
