// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSurfacePresentScalingCapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkSurfacePresentScalingCapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkPresentScalingFlagsKHR supportedPresentScaling;
///     VkPresentGravityFlagsKHR supportedPresentGravityX;
///     VkPresentGravityFlagsKHR supportedPresentGravityY;
///     VkExtent2D minScaledImageExtent;
///     VkExtent2D maxScaledImageExtent;
/// }
/// ```
public final class VkSurfacePresentScalingCapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedPresentScaling"),
        ValueLayout.JAVA_INT.withName("supportedPresentGravityX"),
        ValueLayout.JAVA_INT.withName("supportedPresentGravityY"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minScaledImageExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxScaledImageExtent")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_supportedPresentScaling = LAYOUT.byteOffset(PathElement.groupElement("supportedPresentScaling"));
    public static final long OFFSET_supportedPresentGravityX = LAYOUT.byteOffset(PathElement.groupElement("supportedPresentGravityX"));
    public static final long OFFSET_supportedPresentGravityY = LAYOUT.byteOffset(PathElement.groupElement("supportedPresentGravityY"));
    public static final long OFFSET_minScaledImageExtent = LAYOUT.byteOffset(PathElement.groupElement("minScaledImageExtent"));
    public static final long OFFSET_maxScaledImageExtent = LAYOUT.byteOffset(PathElement.groupElement("maxScaledImageExtent"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_supportedPresentScaling = LAYOUT.select(PathElement.groupElement("supportedPresentScaling"));
    public static final MemoryLayout LAYOUT_supportedPresentGravityX = LAYOUT.select(PathElement.groupElement("supportedPresentGravityX"));
    public static final MemoryLayout LAYOUT_supportedPresentGravityY = LAYOUT.select(PathElement.groupElement("supportedPresentGravityY"));
    public static final MemoryLayout LAYOUT_minScaledImageExtent = LAYOUT.select(PathElement.groupElement("minScaledImageExtent"));
    public static final MemoryLayout LAYOUT_maxScaledImageExtent = LAYOUT.select(PathElement.groupElement("maxScaledImageExtent"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_supportedPresentScaling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedPresentScaling"));
    public static final VarHandle VH_supportedPresentGravityX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedPresentGravityX"));
    public static final VarHandle VH_supportedPresentGravityY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedPresentGravityY"));
    public static final VarHandle VH_minScaledImageExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minScaledImageExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_minScaledImageExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minScaledImageExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxScaledImageExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxScaledImageExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxScaledImageExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxScaledImageExtent"), PathElement.groupElement("height"));

    public VkSurfacePresentScalingCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSurfacePresentScalingCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentScalingCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSurfacePresentScalingCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentScalingCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSurfacePresentScalingCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentScalingCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSurfacePresentScalingCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkSurfacePresentScalingCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSurfacePresentScalingCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkSurfacePresentScalingCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSurfacePresentScalingCapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR); }
    public static VkSurfacePresentScalingCapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR);
        return s;
    }
    public VkSurfacePresentScalingCapabilitiesKHR copyFrom(VkSurfacePresentScalingCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR reinterpret(long count) { return new VkSurfacePresentScalingCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSurfacePresentScalingCapabilitiesKHR asSlice(long index) { return new VkSurfacePresentScalingCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSurfacePresentScalingCapabilitiesKHR asSlice(long index, long count) { return new VkSurfacePresentScalingCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSurfacePresentScalingCapabilitiesKHR at(long index, Consumer<VkSurfacePresentScalingCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int supportedPresentScalingAt(long index) { return (int) VH_supportedPresentScaling.get(this.segment(), 0L, index); }
    public int supportedPresentGravityXAt(long index) { return (int) VH_supportedPresentGravityX.get(this.segment(), 0L, index); }
    public int supportedPresentGravityYAt(long index) { return (int) VH_supportedPresentGravityY.get(this.segment(), 0L, index); }
    public int minScaledImageExtent$widthAt(long index) { return (int) VH_minScaledImageExtent$width.get(this.segment(), 0L, index); }
    public int minScaledImageExtent$heightAt(long index) { return (int) VH_minScaledImageExtent$height.get(this.segment(), 0L, index); }
    public int maxScaledImageExtent$widthAt(long index) { return (int) VH_maxScaledImageExtent$width.get(this.segment(), 0L, index); }
    public int maxScaledImageExtent$heightAt(long index) { return (int) VH_maxScaledImageExtent$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int supportedPresentScaling() { return (int) VH_supportedPresentScaling.get(this.segment(), 0L, 0L); }
    public int supportedPresentGravityX() { return (int) VH_supportedPresentGravityX.get(this.segment(), 0L, 0L); }
    public int supportedPresentGravityY() { return (int) VH_supportedPresentGravityY.get(this.segment(), 0L, 0L); }
    public int minScaledImageExtent$width() { return (int) VH_minScaledImageExtent$width.get(this.segment(), 0L, 0L); }
    public int minScaledImageExtent$height() { return (int) VH_minScaledImageExtent$height.get(this.segment(), 0L, 0L); }
    public int maxScaledImageExtent$width() { return (int) VH_maxScaledImageExtent$width.get(this.segment(), 0L, 0L); }
    public int maxScaledImageExtent$height() { return (int) VH_maxScaledImageExtent$height.get(this.segment(), 0L, 0L); }
    public VkSurfacePresentScalingCapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR supportedPresentScalingAt(long index, int value) { VH_supportedPresentScaling.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR supportedPresentGravityXAt(long index, int value) { VH_supportedPresentGravityX.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR supportedPresentGravityYAt(long index, int value) { VH_supportedPresentGravityY.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR minScaledImageExtent$widthAt(long index, int value) { VH_minScaledImageExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR minScaledImageExtent$heightAt(long index, int value) { VH_minScaledImageExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR maxScaledImageExtent$widthAt(long index, int value) { VH_maxScaledImageExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR maxScaledImageExtent$heightAt(long index, int value) { VH_maxScaledImageExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR supportedPresentScaling(int value) { VH_supportedPresentScaling.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR supportedPresentGravityX(int value) { VH_supportedPresentGravityX.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR supportedPresentGravityY(int value) { VH_supportedPresentGravityY.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR minScaledImageExtent$width(int value) { VH_minScaledImageExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR minScaledImageExtent$height(int value) { VH_minScaledImageExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR maxScaledImageExtent$width(int value) { VH_maxScaledImageExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR maxScaledImageExtent$height(int value) { VH_maxScaledImageExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSurfacePresentScalingCapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSurfacePresentScalingCapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _supportedPresentScalingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedPresentScaling, index), LAYOUT_supportedPresentScaling); }
    public MemorySegment _supportedPresentScaling() { return _supportedPresentScalingAt(0L); }
    public VkSurfacePresentScalingCapabilitiesKHR _supportedPresentScalingAt(long index, MemorySegment src) { _supportedPresentScalingAt(index).copyFrom(src); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR _supportedPresentScaling(MemorySegment src) { return _supportedPresentScalingAt(0L, src); }
    public MemorySegment _supportedPresentGravityXAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedPresentGravityX, index), LAYOUT_supportedPresentGravityX); }
    public MemorySegment _supportedPresentGravityX() { return _supportedPresentGravityXAt(0L); }
    public VkSurfacePresentScalingCapabilitiesKHR _supportedPresentGravityXAt(long index, MemorySegment src) { _supportedPresentGravityXAt(index).copyFrom(src); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR _supportedPresentGravityX(MemorySegment src) { return _supportedPresentGravityXAt(0L, src); }
    public MemorySegment _supportedPresentGravityYAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedPresentGravityY, index), LAYOUT_supportedPresentGravityY); }
    public MemorySegment _supportedPresentGravityY() { return _supportedPresentGravityYAt(0L); }
    public VkSurfacePresentScalingCapabilitiesKHR _supportedPresentGravityYAt(long index, MemorySegment src) { _supportedPresentGravityYAt(index).copyFrom(src); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR _supportedPresentGravityY(MemorySegment src) { return _supportedPresentGravityYAt(0L, src); }
    public MemorySegment _minScaledImageExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minScaledImageExtent, index), LAYOUT_minScaledImageExtent); }
    public MemorySegment _minScaledImageExtent() { return _minScaledImageExtentAt(0L); }
    public VkSurfacePresentScalingCapabilitiesKHR _minScaledImageExtentAt(long index, MemorySegment src) { _minScaledImageExtentAt(index).copyFrom(src); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR _minScaledImageExtent(MemorySegment src) { return _minScaledImageExtentAt(0L, src); }
    public MemorySegment _maxScaledImageExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxScaledImageExtent, index), LAYOUT_maxScaledImageExtent); }
    public MemorySegment _maxScaledImageExtent() { return _maxScaledImageExtentAt(0L); }
    public VkSurfacePresentScalingCapabilitiesKHR _maxScaledImageExtentAt(long index, MemorySegment src) { _maxScaledImageExtentAt(index).copyFrom(src); return this; }
    public VkSurfacePresentScalingCapabilitiesKHR _maxScaledImageExtent(MemorySegment src) { return _maxScaledImageExtentAt(0L, src); }
}
