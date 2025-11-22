// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevice4444FormatsFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDevice4444FormatsFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 formatA4R4G4B4;
///     VkBool32 formatA4B4G4R4;
/// }
/// ```
public final class VkPhysicalDevice4444FormatsFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("formatA4R4G4B4"),
        ValueLayout.JAVA_INT.withName("formatA4B4G4R4")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_formatA4R4G4B4 = LAYOUT.byteOffset(PathElement.groupElement("formatA4R4G4B4"));
    public static final long OFFSET_formatA4B4G4R4 = LAYOUT.byteOffset(PathElement.groupElement("formatA4B4G4R4"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_formatA4R4G4B4 = LAYOUT.select(PathElement.groupElement("formatA4R4G4B4"));
    public static final MemoryLayout LAYOUT_formatA4B4G4R4 = LAYOUT.select(PathElement.groupElement("formatA4B4G4R4"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_formatA4R4G4B4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatA4R4G4B4"));
    public static final VarHandle VH_formatA4B4G4R4 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatA4B4G4R4"));

    public VkPhysicalDevice4444FormatsFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevice4444FormatsFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevice4444FormatsFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevice4444FormatsFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevice4444FormatsFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevice4444FormatsFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevice4444FormatsFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevice4444FormatsFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevice4444FormatsFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevice4444FormatsFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevice4444FormatsFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevice4444FormatsFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXT4444Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT); }
    public static VkPhysicalDevice4444FormatsFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXT4444Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDevice4444FormatsFeaturesEXT copyFrom(VkPhysicalDevice4444FormatsFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevice4444FormatsFeaturesEXT reinterpret(long count) { return new VkPhysicalDevice4444FormatsFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevice4444FormatsFeaturesEXT asSlice(long index) { return new VkPhysicalDevice4444FormatsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevice4444FormatsFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDevice4444FormatsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevice4444FormatsFeaturesEXT at(long index, Consumer<VkPhysicalDevice4444FormatsFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int formatA4R4G4B4At(long index) { return (int) VH_formatA4R4G4B4.get(this.segment(), 0L, index); }
    public int formatA4B4G4R4At(long index) { return (int) VH_formatA4B4G4R4.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int formatA4R4G4B4() { return (int) VH_formatA4R4G4B4.get(this.segment(), 0L, 0L); }
    public int formatA4B4G4R4() { return (int) VH_formatA4B4G4R4.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevice4444FormatsFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevice4444FormatsFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4R4G4B4At(long index, int value) { VH_formatA4R4G4B4.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4B4G4R4At(long index, int value) { VH_formatA4B4G4R4.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevice4444FormatsFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevice4444FormatsFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4R4G4B4(int value) { VH_formatA4R4G4B4.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4B4G4R4(int value) { VH_formatA4B4G4R4.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevice4444FormatsFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevice4444FormatsFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevice4444FormatsFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevice4444FormatsFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _formatA4R4G4B4At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_formatA4R4G4B4, index), LAYOUT_formatA4R4G4B4); }
    public MemorySegment _formatA4R4G4B4() { return _formatA4R4G4B4At(0L); }
    public VkPhysicalDevice4444FormatsFeaturesEXT _formatA4R4G4B4At(long index, MemorySegment src) { _formatA4R4G4B4At(index).copyFrom(src); return this; }
    public VkPhysicalDevice4444FormatsFeaturesEXT _formatA4R4G4B4(MemorySegment src) { return _formatA4R4G4B4At(0L, src); }
    public MemorySegment _formatA4B4G4R4At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_formatA4B4G4R4, index), LAYOUT_formatA4B4G4R4); }
    public MemorySegment _formatA4B4G4R4() { return _formatA4B4G4R4At(0L); }
    public VkPhysicalDevice4444FormatsFeaturesEXT _formatA4B4G4R4At(long index, MemorySegment src) { _formatA4B4G4R4At(index).copyFrom(src); return this; }
    public VkPhysicalDevice4444FormatsFeaturesEXT _formatA4B4G4R4(MemorySegment src) { return _formatA4B4G4R4At(0L, src); }
}
