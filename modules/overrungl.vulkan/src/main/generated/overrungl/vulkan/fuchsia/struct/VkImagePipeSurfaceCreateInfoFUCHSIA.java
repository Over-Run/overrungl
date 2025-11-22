// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.fuchsia.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImagePipeSurfaceCreateInfoFUCHSIA`.
/// ## Layout
/// ```
/// struct VkImagePipeSurfaceCreateInfoFUCHSIA {
///     VkStructureType sType;
///     const void* pNext;
///     VkImagePipeSurfaceCreateFlagsFUCHSIA flags;
///     zx_handle_t imagePipeHandle;
/// }
/// ```
public final class VkImagePipeSurfaceCreateInfoFUCHSIA extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("imagePipeHandle")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_imagePipeHandle = LAYOUT.byteOffset(PathElement.groupElement("imagePipeHandle"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_imagePipeHandle = LAYOUT.select(PathElement.groupElement("imagePipeHandle"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_imagePipeHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imagePipeHandle"));

    public VkImagePipeSurfaceCreateInfoFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImagePipeSurfaceCreateInfoFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImagePipeSurfaceCreateInfoFUCHSIA(segment, estimateCount(segment, LAYOUT)); }
    public static VkImagePipeSurfaceCreateInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImagePipeSurfaceCreateInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImagePipeSurfaceCreateInfoFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImagePipeSurfaceCreateInfoFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImagePipeSurfaceCreateInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkImagePipeSurfaceCreateInfoFUCHSIA(allocator.allocate(LAYOUT), 1); }
    public static VkImagePipeSurfaceCreateInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkImagePipeSurfaceCreateInfoFUCHSIA(allocator.allocate(LAYOUT, count), count); }
    public static VkImagePipeSurfaceCreateInfoFUCHSIA allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.fuchsia.VKFUCHSIAImagepipeSurface.VK_STRUCTURE_TYPE_IMAGEPIPE_SURFACE_CREATE_INFO_FUCHSIA); }
    public static VkImagePipeSurfaceCreateInfoFUCHSIA allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.fuchsia.VKFUCHSIAImagepipeSurface.VK_STRUCTURE_TYPE_IMAGEPIPE_SURFACE_CREATE_INFO_FUCHSIA);
        return s;
    }
    public VkImagePipeSurfaceCreateInfoFUCHSIA copyFrom(VkImagePipeSurfaceCreateInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImagePipeSurfaceCreateInfoFUCHSIA reinterpret(long count) { return new VkImagePipeSurfaceCreateInfoFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImagePipeSurfaceCreateInfoFUCHSIA asSlice(long index) { return new VkImagePipeSurfaceCreateInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImagePipeSurfaceCreateInfoFUCHSIA asSlice(long index, long count) { return new VkImagePipeSurfaceCreateInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImagePipeSurfaceCreateInfoFUCHSIA at(long index, Consumer<VkImagePipeSurfaceCreateInfoFUCHSIA> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int imagePipeHandleAt(long index) { return (int) VH_imagePipeHandle.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int imagePipeHandle() { return (int) VH_imagePipeHandle.get(this.segment(), 0L, 0L); }
    public VkImagePipeSurfaceCreateInfoFUCHSIA sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImagePipeSurfaceCreateInfoFUCHSIA pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImagePipeSurfaceCreateInfoFUCHSIA flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkImagePipeSurfaceCreateInfoFUCHSIA imagePipeHandleAt(long index, int value) { VH_imagePipeHandle.set(this.segment(), 0L, index, value); return this; }
    public VkImagePipeSurfaceCreateInfoFUCHSIA sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImagePipeSurfaceCreateInfoFUCHSIA pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImagePipeSurfaceCreateInfoFUCHSIA flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkImagePipeSurfaceCreateInfoFUCHSIA imagePipeHandle(int value) { VH_imagePipeHandle.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImagePipeSurfaceCreateInfoFUCHSIA _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImagePipeSurfaceCreateInfoFUCHSIA _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImagePipeSurfaceCreateInfoFUCHSIA _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImagePipeSurfaceCreateInfoFUCHSIA _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkImagePipeSurfaceCreateInfoFUCHSIA _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkImagePipeSurfaceCreateInfoFUCHSIA _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _imagePipeHandleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imagePipeHandle, index), LAYOUT_imagePipeHandle); }
    public MemorySegment _imagePipeHandle() { return _imagePipeHandleAt(0L); }
    public VkImagePipeSurfaceCreateInfoFUCHSIA _imagePipeHandleAt(long index, MemorySegment src) { _imagePipeHandleAt(index).copyFrom(src); return this; }
    public VkImagePipeSurfaceCreateInfoFUCHSIA _imagePipeHandle(MemorySegment src) { return _imagePipeHandleAt(0L, src); }
}
