// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyMemoryToMicromapInfoEXT`.
/// ## Layout
/// ```
/// struct VkCopyMemoryToMicromapInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceOrHostAddressConstKHR src;
///     VkMicromapEXT dst;
///     VkCopyMicromapModeEXT mode;
/// }
/// ```
public final class VkCopyMemoryToMicromapInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("src"),
        ValueLayout.JAVA_LONG.withName("dst"),
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
    public static final VarHandle VH_src$deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("src"), PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_src$hostAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("src"), PathElement.groupElement("hostAddress"));
    public static final VarHandle VH_dst = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dst"));
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));

    public VkCopyMemoryToMicromapInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCopyMemoryToMicromapInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToMicromapInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkCopyMemoryToMicromapInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToMicromapInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCopyMemoryToMicromapInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToMicromapInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCopyMemoryToMicromapInfoEXT alloc(SegmentAllocator allocator) { return new VkCopyMemoryToMicromapInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkCopyMemoryToMicromapInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkCopyMemoryToMicromapInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkCopyMemoryToMicromapInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT); }
    public static VkCopyMemoryToMicromapInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT);
        return s;
    }
    public VkCopyMemoryToMicromapInfoEXT copyFrom(VkCopyMemoryToMicromapInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCopyMemoryToMicromapInfoEXT reinterpret(long count) { return new VkCopyMemoryToMicromapInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCopyMemoryToMicromapInfoEXT asSlice(long index) { return new VkCopyMemoryToMicromapInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCopyMemoryToMicromapInfoEXT asSlice(long index, long count) { return new VkCopyMemoryToMicromapInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCopyMemoryToMicromapInfoEXT at(long index, Consumer<VkCopyMemoryToMicromapInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long src$deviceAddressAt(long index) { return (long) VH_src$deviceAddress.get(this.segment(), 0L, index); }
    public MemorySegment src$hostAddressAt(long index) { return (MemorySegment) VH_src$hostAddress.get(this.segment(), 0L, index); }
    public long dstAt(long index) { return (long) VH_dst.get(this.segment(), 0L, index); }
    public int modeAt(long index) { return (int) VH_mode.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long src$deviceAddress() { return (long) VH_src$deviceAddress.get(this.segment(), 0L, 0L); }
    public MemorySegment src$hostAddress() { return (MemorySegment) VH_src$hostAddress.get(this.segment(), 0L, 0L); }
    public long dst() { return (long) VH_dst.get(this.segment(), 0L, 0L); }
    public int mode() { return (int) VH_mode.get(this.segment(), 0L, 0L); }
    public VkCopyMemoryToMicromapInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToMicromapInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToMicromapInfoEXT src$deviceAddressAt(long index, long value) { VH_src$deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToMicromapInfoEXT src$hostAddressAt(long index, MemorySegment value) { VH_src$hostAddress.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToMicromapInfoEXT dstAt(long index, long value) { VH_dst.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToMicromapInfoEXT modeAt(long index, int value) { VH_mode.set(this.segment(), 0L, index, value); return this; }
    public VkCopyMemoryToMicromapInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToMicromapInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToMicromapInfoEXT src$deviceAddress(long value) { VH_src$deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToMicromapInfoEXT src$hostAddress(MemorySegment value) { VH_src$hostAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToMicromapInfoEXT dst(long value) { VH_dst.set(this.segment(), 0L, 0L, value); return this; }
    public VkCopyMemoryToMicromapInfoEXT mode(int value) { VH_mode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCopyMemoryToMicromapInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToMicromapInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCopyMemoryToMicromapInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToMicromapInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _srcAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_src, index), LAYOUT_src); }
    public MemorySegment _src() { return _srcAt(0L); }
    public VkCopyMemoryToMicromapInfoEXT _srcAt(long index, MemorySegment src) { _srcAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToMicromapInfoEXT _src(MemorySegment src) { return _srcAt(0L, src); }
    public MemorySegment _dstAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dst, index), LAYOUT_dst); }
    public MemorySegment _dst() { return _dstAt(0L); }
    public VkCopyMemoryToMicromapInfoEXT _dstAt(long index, MemorySegment src) { _dstAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToMicromapInfoEXT _dst(MemorySegment src) { return _dstAt(0L, src); }
    public MemorySegment _modeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mode, index), LAYOUT_mode); }
    public MemorySegment _mode() { return _modeAt(0L); }
    public VkCopyMemoryToMicromapInfoEXT _modeAt(long index, MemorySegment src) { _modeAt(index).copyFrom(src); return this; }
    public VkCopyMemoryToMicromapInfoEXT _mode(MemorySegment src) { return _modeAt(0L, src); }
}
