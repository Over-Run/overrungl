// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyMicromapToMemoryInfoEXT`.
/// ## Layout
/// ```
/// struct VkCopyMicromapToMemoryInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkMicromapEXT src;
///     VkDeviceOrHostAddressKHR dst;
///     VkCopyMicromapModeEXT mode;
/// }
/// ```
public final class VkCopyMicromapToMemoryInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("src"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR.LAYOUT.withName("dst"),
        ValueLayout.JAVA_INT.withName("mode")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_src = LAYOUT.byteOffset(PathElement.groupElement("src"));
    public static final long OFFSET_dst = LAYOUT.byteOffset(PathElement.groupElement("dst"));
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_src = LAYOUT.select(PathElement.groupElement("src"));
    public static final MemoryLayout LAYOUT_dst = LAYOUT.select(PathElement.groupElement("dst"));
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_src = LAYOUT.arrayElementVarHandle(PathElement.groupElement("src"));
    public static final VarHandle VH_dst$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dst"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_dst$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dst"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));

    public VkCopyMicromapToMemoryInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCopyMicromapToMemoryInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMicromapToMemoryInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkCopyMicromapToMemoryInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMicromapToMemoryInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCopyMicromapToMemoryInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMicromapToMemoryInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCopyMicromapToMemoryInfoEXT alloc(SegmentAllocator allocator) { return new VkCopyMicromapToMemoryInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkCopyMicromapToMemoryInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkCopyMicromapToMemoryInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkCopyMicromapToMemoryInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT); }
    public static VkCopyMicromapToMemoryInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT);
        return s;
    }
    public VkCopyMicromapToMemoryInfoEXT copyFrom(VkCopyMicromapToMemoryInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCopyMicromapToMemoryInfoEXT reinterpret(long count) { return new VkCopyMicromapToMemoryInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCopyMicromapToMemoryInfoEXT asSlice(long index) { return new VkCopyMicromapToMemoryInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCopyMicromapToMemoryInfoEXT asSlice(long index, long count) { return new VkCopyMicromapToMemoryInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCopyMicromapToMemoryInfoEXT at(long index, Consumer<VkCopyMicromapToMemoryInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long srcAt(long index) { return (long) VH_src.get(this.segment(), 0L, index); }
    public long dst$deviceAddressAt(long index) { return (long) VH_dst$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment dst$hostAddressAt(long index) { return (MemorySegment) VH_dst$hostAddress.get(this.segment(), 0L, index); }
    public int modeAt(long index) { return (int) VH_mode.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long src() { return (long) VH_src.get(this.segment(), 0L, 0L); }
    public long dst$deviceAddress() { return (long) VH_dst$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment dst$hostAddress() { return (MemorySegment) VH_dst$hostAddress.get(this.segment(), 0L, 0L); }
    public int mode() { return (int) VH_mode.get(this.segment(), 0L, 0L); }
    public VkCopyMicromapToMemoryInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMicromapToMemoryInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMicromapToMemoryInfoEXT srcAt(long index, long value) { VH_src.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMicromapToMemoryInfoEXT dst$deviceAddressAt(long index, long value) { VH_dst$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMicromapToMemoryInfoEXT dst$hostAddressAt(long index, MemorySegment value) { VH_dst$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMicromapToMemoryInfoEXT modeAt(long index, int value) { VH_mode.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMicromapToMemoryInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMicromapToMemoryInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMicromapToMemoryInfoEXT src(long value) { VH_src.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMicromapToMemoryInfoEXT dst$deviceAddress(long value) { VH_dst$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMicromapToMemoryInfoEXT dst$hostAddress(MemorySegment value) { VH_dst$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMicromapToMemoryInfoEXT mode(int value) { VH_mode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCopyMicromapToMemoryInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCopyMicromapToMemoryInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCopyMicromapToMemoryInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCopyMicromapToMemoryInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_src, index), LAYOUT_src); }
    public MemorySegment _src() { return _srcAt(0L); }
    public VkCopyMicromapToMemoryInfoEXT _srcAt(long index, MemorySegment src) { _srcAt(index).copyFrom(src); return this; }
    public VkCopyMicromapToMemoryInfoEXT _src(MemorySegment src) { return _srcAt(0L, src); }
    public MemorySegment _dstAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dst, index), LAYOUT_dst); }
    public MemorySegment _dst() { return _dstAt(0L); }
    public VkCopyMicromapToMemoryInfoEXT _dstAt(long index, MemorySegment src) { _dstAt(index).copyFrom(src); return this; }
    public VkCopyMicromapToMemoryInfoEXT _dst(MemorySegment src) { return _dstAt(0L, src); }
    public MemorySegment _modeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mode, index), LAYOUT_mode); }
    public MemorySegment _mode() { return _modeAt(0L); }
    public VkCopyMicromapToMemoryInfoEXT _modeAt(long index, MemorySegment src) { _modeAt(index).copyFrom(src); return this; }
    public VkCopyMicromapToMemoryInfoEXT _mode(MemorySegment src) { return _modeAt(0L, src); }
}
