// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCustomBorderColorFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCustomBorderColorFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 customBorderColors;
///     VkBool32 customBorderColorWithoutFormat;
/// }
/// ```
public final class VkPhysicalDeviceCustomBorderColorFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("customBorderColors"),
        ValueLayout.JAVA_INT.withName("customBorderColorWithoutFormat")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_customBorderColors = LAYOUT.byteOffset(PathElement.groupElement("customBorderColors"));
    public static final long OFFSET_customBorderColorWithoutFormat = LAYOUT.byteOffset(PathElement.groupElement("customBorderColorWithoutFormat"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_customBorderColors = LAYOUT.select(PathElement.groupElement("customBorderColors"));
    public static final MemoryLayout LAYOUT_customBorderColorWithoutFormat = LAYOUT.select(PathElement.groupElement("customBorderColorWithoutFormat"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_customBorderColors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("customBorderColors"));
    public static final VarHandle VH_customBorderColorWithoutFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("customBorderColorWithoutFormat"));

    public VkPhysicalDeviceCustomBorderColorFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCustomBorderColorFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCustomBorderColorFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCustomBorderColorFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTCustomBorderColor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT); }
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTCustomBorderColor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT copyFrom(VkPhysicalDeviceCustomBorderColorFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT at(long index, Consumer<VkPhysicalDeviceCustomBorderColorFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int customBorderColorsAt(long index) { return (int) VH_customBorderColors.get(this.segment(), 0L, index); }
    public int customBorderColorWithoutFormatAt(long index) { return (int) VH_customBorderColorWithoutFormat.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int customBorderColors() { return (int) VH_customBorderColors.get(this.segment(), 0L, 0L); }
    public int customBorderColorWithoutFormat() { return (int) VH_customBorderColorWithoutFormat.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColorsAt(long index, int value) { VH_customBorderColors.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColorWithoutFormatAt(long index, int value) { VH_customBorderColorWithoutFormat.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColors(int value) { VH_customBorderColors.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColorWithoutFormat(int value) { VH_customBorderColorWithoutFormat.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _customBorderColorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_customBorderColors, index), LAYOUT_customBorderColors); }
    public MemorySegment _customBorderColors() { return _customBorderColorsAt(0L); }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT _customBorderColorsAt(long index, MemorySegment src) { _customBorderColorsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT _customBorderColors(MemorySegment src) { return _customBorderColorsAt(0L, src); }
    public MemorySegment _customBorderColorWithoutFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_customBorderColorWithoutFormat, index), LAYOUT_customBorderColorWithoutFormat); }
    public MemorySegment _customBorderColorWithoutFormat() { return _customBorderColorWithoutFormatAt(0L); }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT _customBorderColorWithoutFormatAt(long index, MemorySegment src) { _customBorderColorWithoutFormatAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT _customBorderColorWithoutFormat(MemorySegment src) { return _customBorderColorWithoutFormatAt(0L, src); }
}
