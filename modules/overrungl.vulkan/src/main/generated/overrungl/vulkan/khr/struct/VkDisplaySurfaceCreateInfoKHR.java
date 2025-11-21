// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplaySurfaceCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkDisplaySurfaceCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkDisplaySurfaceCreateFlagsKHR flags;
///     VkDisplayModeKHR displayMode;
///     uint32_t planeIndex;
///     uint32_t planeStackIndex;
///     VkSurfaceTransformFlagBitsKHR transform;
///     float globalAlpha;
///     VkDisplayPlaneAlphaFlagBitsKHR alphaMode;
///     VkExtent2D imageExtent;
/// }
/// ```
public final class VkDisplaySurfaceCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("displayMode"),
        ValueLayout.JAVA_INT.withName("planeIndex"),
        ValueLayout.JAVA_INT.withName("planeStackIndex"),
        ValueLayout.JAVA_INT.withName("transform"),
        ValueLayout.JAVA_FLOAT.withName("globalAlpha"),
        ValueLayout.JAVA_INT.withName("alphaMode"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("imageExtent")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_displayMode = LAYOUT.byteOffset(PathElement.groupElement("displayMode"));
    public static final long OFFSET_planeIndex = LAYOUT.byteOffset(PathElement.groupElement("planeIndex"));
    public static final long OFFSET_planeStackIndex = LAYOUT.byteOffset(PathElement.groupElement("planeStackIndex"));
    public static final long OFFSET_transform = LAYOUT.byteOffset(PathElement.groupElement("transform"));
    public static final long OFFSET_globalAlpha = LAYOUT.byteOffset(PathElement.groupElement("globalAlpha"));
    public static final long OFFSET_alphaMode = LAYOUT.byteOffset(PathElement.groupElement("alphaMode"));
    public static final long OFFSET_imageExtent = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_displayMode = LAYOUT.select(PathElement.groupElement("displayMode"));
    public static final MemoryLayout LAYOUT_planeIndex = LAYOUT.select(PathElement.groupElement("planeIndex"));
    public static final MemoryLayout LAYOUT_planeStackIndex = LAYOUT.select(PathElement.groupElement("planeStackIndex"));
    public static final MemoryLayout LAYOUT_transform = LAYOUT.select(PathElement.groupElement("transform"));
    public static final MemoryLayout LAYOUT_globalAlpha = LAYOUT.select(PathElement.groupElement("globalAlpha"));
    public static final MemoryLayout LAYOUT_alphaMode = LAYOUT.select(PathElement.groupElement("alphaMode"));
    public static final MemoryLayout LAYOUT_imageExtent = LAYOUT.select(PathElement.groupElement("imageExtent"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_displayMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayMode"));
    public static final VarHandle VH_planeIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeIndex"));
    public static final VarHandle VH_planeStackIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeStackIndex"));
    public static final VarHandle VH_transform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transform"));
    public static final VarHandle VH_globalAlpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("globalAlpha"));
    public static final VarHandle VH_alphaMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaMode"));
    public static final VarHandle VH_imageExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_imageExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageExtent"), PathElement.groupElement("height"));

    public VkDisplaySurfaceCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplaySurfaceCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplaySurfaceCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplaySurfaceCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplaySurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplaySurfaceCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplaySurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplaySurfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkDisplaySurfaceCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDisplaySurfaceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplaySurfaceCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDisplaySurfaceCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRDisplay.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR); }
    public static VkDisplaySurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRDisplay.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR);
        return s;
    }
    public VkDisplaySurfaceCreateInfoKHR copyFrom(VkDisplaySurfaceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplaySurfaceCreateInfoKHR reinterpret(long count) { return new VkDisplaySurfaceCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplaySurfaceCreateInfoKHR asSlice(long index) { return new VkDisplaySurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplaySurfaceCreateInfoKHR asSlice(long index, long count) { return new VkDisplaySurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplaySurfaceCreateInfoKHR at(long index, Consumer<VkDisplaySurfaceCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long displayModeAt(long index) { return (long) VH_displayMode.get(this.segment(), 0L, index); }
    public int planeIndexAt(long index) { return (int) VH_planeIndex.get(this.segment(), 0L, index); }
    public int planeStackIndexAt(long index) { return (int) VH_planeStackIndex.get(this.segment(), 0L, index); }
    public int transformAt(long index) { return (int) VH_transform.get(this.segment(), 0L, index); }
    public float globalAlphaAt(long index) { return (float) VH_globalAlpha.get(this.segment(), 0L, index); }
    public int alphaModeAt(long index) { return (int) VH_alphaMode.get(this.segment(), 0L, index); }
    public int imageExtent$widthAt(long index) { return (int) VH_imageExtent$width.get(this.segment(), 0L, index); }
    public int imageExtent$heightAt(long index) { return (int) VH_imageExtent$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long displayMode() { return (long) VH_displayMode.get(this.segment(), 0L, 0L); }
    public int planeIndex() { return (int) VH_planeIndex.get(this.segment(), 0L, 0L); }
    public int planeStackIndex() { return (int) VH_planeStackIndex.get(this.segment(), 0L, 0L); }
    public int transform() { return (int) VH_transform.get(this.segment(), 0L, 0L); }
    public float globalAlpha() { return (float) VH_globalAlpha.get(this.segment(), 0L, 0L); }
    public int alphaMode() { return (int) VH_alphaMode.get(this.segment(), 0L, 0L); }
    public int imageExtent$width() { return (int) VH_imageExtent$width.get(this.segment(), 0L, 0L); }
    public int imageExtent$height() { return (int) VH_imageExtent$height.get(this.segment(), 0L, 0L); }
    public VkDisplaySurfaceCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR displayModeAt(long index, long value) { VH_displayMode.set(this.segment(), 0L, index, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR planeIndexAt(long index, int value) { VH_planeIndex.set(this.segment(), 0L, index, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR planeStackIndexAt(long index, int value) { VH_planeStackIndex.set(this.segment(), 0L, index, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR transformAt(long index, int value) { VH_transform.set(this.segment(), 0L, index, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR globalAlphaAt(long index, float value) { VH_globalAlpha.set(this.segment(), 0L, index, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR alphaModeAt(long index, int value) { VH_alphaMode.set(this.segment(), 0L, index, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR imageExtent$widthAt(long index, int value) { VH_imageExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR imageExtent$heightAt(long index, int value) { VH_imageExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR displayMode(long value) { VH_displayMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR planeIndex(int value) { VH_planeIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR planeStackIndex(int value) { VH_planeStackIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR transform(int value) { VH_transform.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR globalAlpha(float value) { VH_globalAlpha.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR alphaMode(int value) { VH_alphaMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR imageExtent$width(int value) { VH_imageExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplaySurfaceCreateInfoKHR imageExtent$height(int value) { VH_imageExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDisplaySurfaceCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDisplaySurfaceCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDisplaySurfaceCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDisplaySurfaceCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDisplaySurfaceCreateInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDisplaySurfaceCreateInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _displayModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_displayMode, index), LAYOUT_displayMode); }
    public MemorySegment _displayMode() { return _displayModeAt(0L); }
    public VkDisplaySurfaceCreateInfoKHR _displayModeAt(long index, MemorySegment src) { _displayModeAt(index).copyFrom(src); return this; }
    public VkDisplaySurfaceCreateInfoKHR _displayMode(MemorySegment src) { return _displayModeAt(0L, src); }
    public MemorySegment _planeIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_planeIndex, index), LAYOUT_planeIndex); }
    public MemorySegment _planeIndex() { return _planeIndexAt(0L); }
    public VkDisplaySurfaceCreateInfoKHR _planeIndexAt(long index, MemorySegment src) { _planeIndexAt(index).copyFrom(src); return this; }
    public VkDisplaySurfaceCreateInfoKHR _planeIndex(MemorySegment src) { return _planeIndexAt(0L, src); }
    public MemorySegment _planeStackIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_planeStackIndex, index), LAYOUT_planeStackIndex); }
    public MemorySegment _planeStackIndex() { return _planeStackIndexAt(0L); }
    public VkDisplaySurfaceCreateInfoKHR _planeStackIndexAt(long index, MemorySegment src) { _planeStackIndexAt(index).copyFrom(src); return this; }
    public VkDisplaySurfaceCreateInfoKHR _planeStackIndex(MemorySegment src) { return _planeStackIndexAt(0L, src); }
    public MemorySegment _transformAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transform, index), LAYOUT_transform); }
    public MemorySegment _transform() { return _transformAt(0L); }
    public VkDisplaySurfaceCreateInfoKHR _transformAt(long index, MemorySegment src) { _transformAt(index).copyFrom(src); return this; }
    public VkDisplaySurfaceCreateInfoKHR _transform(MemorySegment src) { return _transformAt(0L, src); }
    public MemorySegment _globalAlphaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_globalAlpha, index), LAYOUT_globalAlpha); }
    public MemorySegment _globalAlpha() { return _globalAlphaAt(0L); }
    public VkDisplaySurfaceCreateInfoKHR _globalAlphaAt(long index, MemorySegment src) { _globalAlphaAt(index).copyFrom(src); return this; }
    public VkDisplaySurfaceCreateInfoKHR _globalAlpha(MemorySegment src) { return _globalAlphaAt(0L, src); }
    public MemorySegment _alphaModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_alphaMode, index), LAYOUT_alphaMode); }
    public MemorySegment _alphaMode() { return _alphaModeAt(0L); }
    public VkDisplaySurfaceCreateInfoKHR _alphaModeAt(long index, MemorySegment src) { _alphaModeAt(index).copyFrom(src); return this; }
    public VkDisplaySurfaceCreateInfoKHR _alphaMode(MemorySegment src) { return _alphaModeAt(0L, src); }
    public MemorySegment _imageExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent); }
    public MemorySegment _imageExtent() { return _imageExtentAt(0L); }
    public VkDisplaySurfaceCreateInfoKHR _imageExtentAt(long index, MemorySegment src) { _imageExtentAt(index).copyFrom(src); return this; }
    public VkDisplaySurfaceCreateInfoKHR _imageExtent(MemorySegment src) { return _imageExtentAt(0L, src); }
}
