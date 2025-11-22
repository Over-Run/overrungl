// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 ycbcr2plane444Formats;
/// }
/// ```
public final class VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("ycbcr2plane444Formats")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_ycbcr2plane444Formats = LAYOUT.byteOffset(PathElement.groupElement("ycbcr2plane444Formats"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_ycbcr2plane444Formats = LAYOUT.select(PathElement.groupElement("ycbcr2plane444Formats"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_ycbcr2plane444Formats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycbcr2plane444Formats"));

    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTYcbcr2plane444Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT); }
    public static VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTYcbcr2plane444Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT copyFrom(VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT at(long index, Consumer<VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int ycbcr2plane444FormatsAt(long index) { return (int) VH_ycbcr2plane444Formats.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int ycbcr2plane444Formats() { return (int) VH_ycbcr2plane444Formats.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ycbcr2plane444FormatsAt(long index, int value) { VH_ycbcr2plane444Formats.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT ycbcr2plane444Formats(int value) { VH_ycbcr2plane444Formats.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _ycbcr2plane444FormatsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ycbcr2plane444Formats, index), LAYOUT_ycbcr2plane444Formats); }
    public MemorySegment _ycbcr2plane444Formats() { return _ycbcr2plane444FormatsAt(0L); }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT _ycbcr2plane444FormatsAt(long index, MemorySegment src) { _ycbcr2plane444FormatsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT _ycbcr2plane444Formats(MemorySegment src) { return _ycbcr2plane444FormatsAt(0L, src); }
}
