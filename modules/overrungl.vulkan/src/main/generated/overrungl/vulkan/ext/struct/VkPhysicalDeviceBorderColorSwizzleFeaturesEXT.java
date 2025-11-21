// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceBorderColorSwizzleFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 borderColorSwizzle;
///     VkBool32 borderColorSwizzleFromImage;
/// }
/// ```
public final class VkPhysicalDeviceBorderColorSwizzleFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("borderColorSwizzle"),
        ValueLayout.JAVA_INT.withName("borderColorSwizzleFromImage")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_borderColorSwizzle = LAYOUT.byteOffset(PathElement.groupElement("borderColorSwizzle"));
    public static final long OFFSET_borderColorSwizzleFromImage = LAYOUT.byteOffset(PathElement.groupElement("borderColorSwizzleFromImage"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_borderColorSwizzle = LAYOUT.select(PathElement.groupElement("borderColorSwizzle"));
    public static final MemoryLayout LAYOUT_borderColorSwizzleFromImage = LAYOUT.select(PathElement.groupElement("borderColorSwizzleFromImage"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_borderColorSwizzle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("borderColorSwizzle"));
    public static final VarHandle VH_borderColorSwizzleFromImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("borderColorSwizzleFromImage"));

    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTBorderColorSwizzle.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT); }
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTBorderColorSwizzle.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT copyFrom(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT at(long index, Consumer<VkPhysicalDeviceBorderColorSwizzleFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int borderColorSwizzleAt(long index) { return (int) VH_borderColorSwizzle.get(this.segment(), 0L, index); }
    public int borderColorSwizzleFromImageAt(long index) { return (int) VH_borderColorSwizzleFromImage.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int borderColorSwizzle() { return (int) VH_borderColorSwizzle.get(this.segment(), 0L, 0L); }
    public int borderColorSwizzleFromImage() { return (int) VH_borderColorSwizzleFromImage.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzleAt(long index, int value) { VH_borderColorSwizzle.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzleFromImageAt(long index, int value) { VH_borderColorSwizzleFromImage.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzle(int value) { VH_borderColorSwizzle.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzleFromImage(int value) { VH_borderColorSwizzleFromImage.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _borderColorSwizzleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_borderColorSwizzle, index), LAYOUT_borderColorSwizzle); }
    public MemorySegment _borderColorSwizzle() { return _borderColorSwizzleAt(0L); }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT _borderColorSwizzleAt(long index, MemorySegment src) { _borderColorSwizzleAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT _borderColorSwizzle(MemorySegment src) { return _borderColorSwizzleAt(0L, src); }
    public MemorySegment _borderColorSwizzleFromImageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_borderColorSwizzleFromImage, index), LAYOUT_borderColorSwizzleFromImage); }
    public MemorySegment _borderColorSwizzleFromImage() { return _borderColorSwizzleFromImageAt(0L); }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT _borderColorSwizzleFromImageAt(long index, MemorySegment src) { _borderColorSwizzleFromImageAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT _borderColorSwizzleFromImage(MemorySegment src) { return _borderColorSwizzleFromImageAt(0L, src); }
}
