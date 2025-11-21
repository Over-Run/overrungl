// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkResolveImageModeInfoKHR`.
/// ## Layout
/// ```
/// struct VkResolveImageModeInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkResolveImageFlagsKHR flags;
///     VkResolveModeFlagBits resolveMode;
///     VkResolveModeFlagBits stencilResolveMode;
/// }
/// ```
public final class VkResolveImageModeInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("resolveMode"),
        ValueLayout.JAVA_INT.withName("stencilResolveMode")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_resolveMode = LAYOUT.byteOffset(PathElement.groupElement("resolveMode"));
    public static final long OFFSET_stencilResolveMode = LAYOUT.byteOffset(PathElement.groupElement("stencilResolveMode"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_resolveMode = LAYOUT.select(PathElement.groupElement("resolveMode"));
    public static final MemoryLayout LAYOUT_stencilResolveMode = LAYOUT.select(PathElement.groupElement("stencilResolveMode"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_resolveMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resolveMode"));
    public static final VarHandle VH_stencilResolveMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilResolveMode"));

    public VkResolveImageModeInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkResolveImageModeInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkResolveImageModeInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkResolveImageModeInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkResolveImageModeInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkResolveImageModeInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkResolveImageModeInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkResolveImageModeInfoKHR alloc(SegmentAllocator allocator) { return new VkResolveImageModeInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkResolveImageModeInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkResolveImageModeInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkResolveImageModeInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRMaintenance10.VK_STRUCTURE_TYPE_RESOLVE_IMAGE_MODE_INFO_KHR); }
    public static VkResolveImageModeInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRMaintenance10.VK_STRUCTURE_TYPE_RESOLVE_IMAGE_MODE_INFO_KHR);
        return s;
    }
    public VkResolveImageModeInfoKHR copyFrom(VkResolveImageModeInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkResolveImageModeInfoKHR reinterpret(long count) { return new VkResolveImageModeInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkResolveImageModeInfoKHR asSlice(long index) { return new VkResolveImageModeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkResolveImageModeInfoKHR asSlice(long index, long count) { return new VkResolveImageModeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkResolveImageModeInfoKHR at(long index, Consumer<VkResolveImageModeInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int resolveModeAt(long index) { return (int) VH_resolveMode.get(this.segment(), 0L, index); }
    public int stencilResolveModeAt(long index) { return (int) VH_stencilResolveMode.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int resolveMode() { return (int) VH_resolveMode.get(this.segment(), 0L, 0L); }
    public int stencilResolveMode() { return (int) VH_stencilResolveMode.get(this.segment(), 0L, 0L); }
    public VkResolveImageModeInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkResolveImageModeInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkResolveImageModeInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkResolveImageModeInfoKHR resolveModeAt(long index, int value) { VH_resolveMode.set(this.segment(), 0L, index, value); return this; }
    public VkResolveImageModeInfoKHR stencilResolveModeAt(long index, int value) { VH_stencilResolveMode.set(this.segment(), 0L, index, value); return this; }
    public VkResolveImageModeInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkResolveImageModeInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkResolveImageModeInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkResolveImageModeInfoKHR resolveMode(int value) { VH_resolveMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkResolveImageModeInfoKHR stencilResolveMode(int value) { VH_stencilResolveMode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkResolveImageModeInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkResolveImageModeInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkResolveImageModeInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkResolveImageModeInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkResolveImageModeInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkResolveImageModeInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _resolveModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_resolveMode, index), LAYOUT_resolveMode); }
    public MemorySegment _resolveMode() { return _resolveModeAt(0L); }
    public VkResolveImageModeInfoKHR _resolveModeAt(long index, MemorySegment src) { _resolveModeAt(index).copyFrom(src); return this; }
    public VkResolveImageModeInfoKHR _resolveMode(MemorySegment src) { return _resolveModeAt(0L, src); }
    public MemorySegment _stencilResolveModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stencilResolveMode, index), LAYOUT_stencilResolveMode); }
    public MemorySegment _stencilResolveMode() { return _stencilResolveModeAt(0L); }
    public VkResolveImageModeInfoKHR _stencilResolveModeAt(long index, MemorySegment src) { _stencilResolveModeAt(index).copyFrom(src); return this; }
    public VkResolveImageModeInfoKHR _stencilResolveMode(MemorySegment src) { return _stencilResolveModeAt(0L, src); }
}
