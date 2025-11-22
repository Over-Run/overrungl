// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceLineRasterizationProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceLineRasterizationProperties {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t lineSubPixelPrecisionBits;
/// }
/// ```
public final class VkPhysicalDeviceLineRasterizationProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lineSubPixelPrecisionBits")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_lineSubPixelPrecisionBits = LAYOUT.byteOffset(PathElement.groupElement("lineSubPixelPrecisionBits"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_lineSubPixelPrecisionBits = LAYOUT.select(PathElement.groupElement("lineSubPixelPrecisionBits"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_lineSubPixelPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineSubPixelPrecisionBits"));

    public VkPhysicalDeviceLineRasterizationProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceLineRasterizationProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceLineRasterizationProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceLineRasterizationProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceLineRasterizationProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLineRasterizationProperties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceLineRasterizationProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLineRasterizationProperties(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceLineRasterizationProperties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES); }
    public static VkPhysicalDeviceLineRasterizationProperties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceLineRasterizationProperties copyFrom(VkPhysicalDeviceLineRasterizationProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceLineRasterizationProperties reinterpret(long count) { return new VkPhysicalDeviceLineRasterizationProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceLineRasterizationProperties asSlice(long index) { return new VkPhysicalDeviceLineRasterizationProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceLineRasterizationProperties asSlice(long index, long count) { return new VkPhysicalDeviceLineRasterizationProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceLineRasterizationProperties at(long index, Consumer<VkPhysicalDeviceLineRasterizationProperties> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int lineSubPixelPrecisionBitsAt(long index) { return (int) VH_lineSubPixelPrecisionBits.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int lineSubPixelPrecisionBits() { return (int) VH_lineSubPixelPrecisionBits.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceLineRasterizationProperties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLineRasterizationProperties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLineRasterizationProperties lineSubPixelPrecisionBitsAt(long index, int value) { VH_lineSubPixelPrecisionBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLineRasterizationProperties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLineRasterizationProperties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLineRasterizationProperties lineSubPixelPrecisionBits(int value) { VH_lineSubPixelPrecisionBits.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceLineRasterizationProperties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLineRasterizationProperties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceLineRasterizationProperties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLineRasterizationProperties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _lineSubPixelPrecisionBitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_lineSubPixelPrecisionBits, index), LAYOUT_lineSubPixelPrecisionBits); }
    public MemorySegment _lineSubPixelPrecisionBits() { return _lineSubPixelPrecisionBitsAt(0L); }
    public VkPhysicalDeviceLineRasterizationProperties _lineSubPixelPrecisionBitsAt(long index, MemorySegment src) { _lineSubPixelPrecisionBitsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLineRasterizationProperties _lineSubPixelPrecisionBits(MemorySegment src) { return _lineSubPixelPrecisionBitsAt(0L, src); }
}
