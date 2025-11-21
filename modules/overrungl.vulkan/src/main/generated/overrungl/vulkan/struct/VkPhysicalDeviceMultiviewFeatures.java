// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMultiviewFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMultiviewFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 multiview;
///     VkBool32 multiviewGeometryShader;
///     VkBool32 multiviewTessellationShader;
/// }
/// ```
public final class VkPhysicalDeviceMultiviewFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multiview"),
        ValueLayout.JAVA_INT.withName("multiviewGeometryShader"),
        ValueLayout.JAVA_INT.withName("multiviewTessellationShader")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_multiview = LAYOUT.byteOffset(PathElement.groupElement("multiview"));
    public static final long OFFSET_multiviewGeometryShader = LAYOUT.byteOffset(PathElement.groupElement("multiviewGeometryShader"));
    public static final long OFFSET_multiviewTessellationShader = LAYOUT.byteOffset(PathElement.groupElement("multiviewTessellationShader"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_multiview = LAYOUT.select(PathElement.groupElement("multiview"));
    public static final MemoryLayout LAYOUT_multiviewGeometryShader = LAYOUT.select(PathElement.groupElement("multiviewGeometryShader"));
    public static final MemoryLayout LAYOUT_multiviewTessellationShader = LAYOUT.select(PathElement.groupElement("multiviewTessellationShader"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_multiview = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiview"));
    public static final VarHandle VH_multiviewGeometryShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewGeometryShader"));
    public static final VarHandle VH_multiviewTessellationShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewTessellationShader"));

    public VkPhysicalDeviceMultiviewFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMultiviewFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMultiviewFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMultiviewFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMultiviewFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiviewFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMultiviewFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMultiviewFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMultiviewFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES); }
    public static VkPhysicalDeviceMultiviewFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES);
        return s;
    }
    public VkPhysicalDeviceMultiviewFeatures copyFrom(VkPhysicalDeviceMultiviewFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMultiviewFeatures reinterpret(long count) { return new VkPhysicalDeviceMultiviewFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMultiviewFeatures asSlice(long index) { return new VkPhysicalDeviceMultiviewFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMultiviewFeatures asSlice(long index, long count) { return new VkPhysicalDeviceMultiviewFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMultiviewFeatures at(long index, Consumer<VkPhysicalDeviceMultiviewFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int multiviewAt(long index) { return (int) VH_multiview.get(this.segment(), 0L, index); }
    public int multiviewGeometryShaderAt(long index) { return (int) VH_multiviewGeometryShader.get(this.segment(), 0L, index); }
    public int multiviewTessellationShaderAt(long index) { return (int) VH_multiviewTessellationShader.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int multiview() { return (int) VH_multiview.get(this.segment(), 0L, 0L); }
    public int multiviewGeometryShader() { return (int) VH_multiviewGeometryShader.get(this.segment(), 0L, 0L); }
    public int multiviewTessellationShader() { return (int) VH_multiviewTessellationShader.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMultiviewFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewFeatures multiviewAt(long index, int value) { VH_multiview.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewFeatures multiviewGeometryShaderAt(long index, int value) { VH_multiviewGeometryShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewFeatures multiviewTessellationShaderAt(long index, int value) { VH_multiviewTessellationShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultiviewFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewFeatures multiview(int value) { VH_multiview.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewFeatures multiviewGeometryShader(int value) { VH_multiviewGeometryShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultiviewFeatures multiviewTessellationShader(int value) { VH_multiviewTessellationShader.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMultiviewFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMultiviewFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _multiviewAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multiview, index), LAYOUT_multiview); }
    public MemorySegment _multiview() { return _multiviewAt(0L); }
    public VkPhysicalDeviceMultiviewFeatures _multiviewAt(long index, MemorySegment src) { _multiviewAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewFeatures _multiview(MemorySegment src) { return _multiviewAt(0L, src); }
    public MemorySegment _multiviewGeometryShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multiviewGeometryShader, index), LAYOUT_multiviewGeometryShader); }
    public MemorySegment _multiviewGeometryShader() { return _multiviewGeometryShaderAt(0L); }
    public VkPhysicalDeviceMultiviewFeatures _multiviewGeometryShaderAt(long index, MemorySegment src) { _multiviewGeometryShaderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewFeatures _multiviewGeometryShader(MemorySegment src) { return _multiviewGeometryShaderAt(0L, src); }
    public MemorySegment _multiviewTessellationShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multiviewTessellationShader, index), LAYOUT_multiviewTessellationShader); }
    public MemorySegment _multiviewTessellationShader() { return _multiviewTessellationShaderAt(0L); }
    public VkPhysicalDeviceMultiviewFeatures _multiviewTessellationShaderAt(long index, MemorySegment src) { _multiviewTessellationShaderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultiviewFeatures _multiviewTessellationShader(MemorySegment src) { return _multiviewTessellationShaderAt(0L, src); }
}
