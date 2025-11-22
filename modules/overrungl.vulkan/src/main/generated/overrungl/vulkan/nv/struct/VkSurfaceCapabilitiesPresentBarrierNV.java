// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSurfaceCapabilitiesPresentBarrierNV`.
/// ## Layout
/// ```
/// struct VkSurfaceCapabilitiesPresentBarrierNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 presentBarrierSupported;
/// }
/// ```
public final class VkSurfaceCapabilitiesPresentBarrierNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentBarrierSupported")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentBarrierSupported = LAYOUT.byteOffset(PathElement.groupElement("presentBarrierSupported"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentBarrierSupported = LAYOUT.select(PathElement.groupElement("presentBarrierSupported"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentBarrierSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentBarrierSupported"));

    public VkSurfaceCapabilitiesPresentBarrierNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSurfaceCapabilitiesPresentBarrierNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesPresentBarrierNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkSurfaceCapabilitiesPresentBarrierNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesPresentBarrierNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSurfaceCapabilitiesPresentBarrierNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesPresentBarrierNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSurfaceCapabilitiesPresentBarrierNV alloc(SegmentAllocator allocator) { return new VkSurfaceCapabilitiesPresentBarrierNV(allocator.allocate(LAYOUT), 1); }
    public static VkSurfaceCapabilitiesPresentBarrierNV alloc(SegmentAllocator allocator, long count) { return new VkSurfaceCapabilitiesPresentBarrierNV(allocator.allocate(LAYOUT, count), count); }
    public static VkSurfaceCapabilitiesPresentBarrierNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVPresentBarrier.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_BARRIER_NV); }
    public static VkSurfaceCapabilitiesPresentBarrierNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVPresentBarrier.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_BARRIER_NV);
        return s;
    }
    public VkSurfaceCapabilitiesPresentBarrierNV copyFrom(VkSurfaceCapabilitiesPresentBarrierNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSurfaceCapabilitiesPresentBarrierNV reinterpret(long count) { return new VkSurfaceCapabilitiesPresentBarrierNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSurfaceCapabilitiesPresentBarrierNV asSlice(long index) { return new VkSurfaceCapabilitiesPresentBarrierNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSurfaceCapabilitiesPresentBarrierNV asSlice(long index, long count) { return new VkSurfaceCapabilitiesPresentBarrierNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSurfaceCapabilitiesPresentBarrierNV at(long index, Consumer<VkSurfaceCapabilitiesPresentBarrierNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int presentBarrierSupportedAt(long index) { return (int) VH_presentBarrierSupported.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int presentBarrierSupported() { return (int) VH_presentBarrierSupported.get(this.segment(), 0L, 0L); }
    public VkSurfaceCapabilitiesPresentBarrierNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesPresentBarrierNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesPresentBarrierNV presentBarrierSupportedAt(long index, int value) { VH_presentBarrierSupported.set(this.segment(), 0L, index, value); return this; }
    public VkSurfaceCapabilitiesPresentBarrierNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesPresentBarrierNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSurfaceCapabilitiesPresentBarrierNV presentBarrierSupported(int value) { VH_presentBarrierSupported.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSurfaceCapabilitiesPresentBarrierNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesPresentBarrierNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSurfaceCapabilitiesPresentBarrierNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesPresentBarrierNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentBarrierSupportedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentBarrierSupported, index), LAYOUT_presentBarrierSupported); }
    public MemorySegment _presentBarrierSupported() { return _presentBarrierSupportedAt(0L); }
    public VkSurfaceCapabilitiesPresentBarrierNV _presentBarrierSupportedAt(long index, MemorySegment src) { _presentBarrierSupportedAt(index).copyFrom(src); return this; }
    public VkSurfaceCapabilitiesPresentBarrierNV _presentBarrierSupported(MemorySegment src) { return _presentBarrierSupportedAt(0L, src); }
}
