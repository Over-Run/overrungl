// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSurfaceProtectedCapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkSurfaceProtectedCapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 supportsProtected;
/// }
/// ```
public final class VkSurfaceProtectedCapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportsProtected")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_supportsProtected = LAYOUT.byteOffset(PathElement.groupElement("supportsProtected"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_supportsProtected = LAYOUT.select(PathElement.groupElement("supportsProtected"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_supportsProtected = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportsProtected"));

    public VkSurfaceProtectedCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSurfaceProtectedCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceProtectedCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSurfaceProtectedCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceProtectedCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSurfaceProtectedCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceProtectedCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSurfaceProtectedCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkSurfaceProtectedCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSurfaceProtectedCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkSurfaceProtectedCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSurfaceProtectedCapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRSurfaceProtectedCapabilities.VK_STRUCTURE_TYPE_SURFACE_PROTECTED_CAPABILITIES_KHR); }
    public static VkSurfaceProtectedCapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRSurfaceProtectedCapabilities.VK_STRUCTURE_TYPE_SURFACE_PROTECTED_CAPABILITIES_KHR);
        return s;
    }
    public VkSurfaceProtectedCapabilitiesKHR copyFrom(VkSurfaceProtectedCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSurfaceProtectedCapabilitiesKHR reinterpret(long count) { return new VkSurfaceProtectedCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSurfaceProtectedCapabilitiesKHR asSlice(long index) { return new VkSurfaceProtectedCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSurfaceProtectedCapabilitiesKHR asSlice(long index, long count) { return new VkSurfaceProtectedCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSurfaceProtectedCapabilitiesKHR at(long index, Consumer<VkSurfaceProtectedCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int supportsProtectedAt(long index) { return (int) VH_supportsProtected.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int supportsProtected() { return (int) VH_supportsProtected.get(this.segment(), 0L, 0L); }
    public VkSurfaceProtectedCapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceProtectedCapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceProtectedCapabilitiesKHR supportsProtectedAt(long index, int value) { VH_supportsProtected.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceProtectedCapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceProtectedCapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceProtectedCapabilitiesKHR supportsProtected(int value) { VH_supportsProtected.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSurfaceProtectedCapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSurfaceProtectedCapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSurfaceProtectedCapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSurfaceProtectedCapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _supportsProtectedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportsProtected, index), LAYOUT_supportsProtected); }
    public MemorySegment _supportsProtected() { return _supportsProtectedAt(0L); }
    public VkSurfaceProtectedCapabilitiesKHR _supportsProtectedAt(long index, MemorySegment src) { _supportsProtectedAt(index).copyFrom(src); return this; }
    public VkSurfaceProtectedCapabilitiesKHR _supportsProtected(MemorySegment src) { return _supportsProtectedAt(0L, src); }
}
