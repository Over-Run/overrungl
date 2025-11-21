// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayNativeHdrSurfaceCapabilitiesAMD`.
/// ## Layout
/// ```
/// struct VkDisplayNativeHdrSurfaceCapabilitiesAMD {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 localDimmingSupport;
/// }
/// ```
public final class VkDisplayNativeHdrSurfaceCapabilitiesAMD extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("localDimmingSupport")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_localDimmingSupport = LAYOUT.byteOffset(PathElement.groupElement("localDimmingSupport"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_localDimmingSupport = LAYOUT.select(PathElement.groupElement("localDimmingSupport"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_localDimmingSupport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("localDimmingSupport"));

    public VkDisplayNativeHdrSurfaceCapabilitiesAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayNativeHdrSurfaceCapabilitiesAMD(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayNativeHdrSurfaceCapabilitiesAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayNativeHdrSurfaceCapabilitiesAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD alloc(SegmentAllocator allocator) { return new VkDisplayNativeHdrSurfaceCapabilitiesAMD(allocator.allocate(LAYOUT), 1); }
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD alloc(SegmentAllocator allocator, long count) { return new VkDisplayNativeHdrSurfaceCapabilitiesAMD(allocator.allocate(LAYOUT, count), count); }
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amd.VKAMDDisplayNativeHdr.VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD); }
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amd.VKAMDDisplayNativeHdr.VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD);
        return s;
    }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD copyFrom(VkDisplayNativeHdrSurfaceCapabilitiesAMD src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD reinterpret(long count) { return new VkDisplayNativeHdrSurfaceCapabilitiesAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD asSlice(long index) { return new VkDisplayNativeHdrSurfaceCapabilitiesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD asSlice(long index, long count) { return new VkDisplayNativeHdrSurfaceCapabilitiesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD at(long index, Consumer<VkDisplayNativeHdrSurfaceCapabilitiesAMD> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int localDimmingSupportAt(long index) { return (int) VH_localDimmingSupport.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int localDimmingSupport() { return (int) VH_localDimmingSupport.get(this.segment(), 0L, 0L); }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD localDimmingSupportAt(long index, int value) { VH_localDimmingSupport.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD localDimmingSupport(int value) { VH_localDimmingSupport.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _localDimmingSupportAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_localDimmingSupport, index), LAYOUT_localDimmingSupport); }
    public MemorySegment _localDimmingSupport() { return _localDimmingSupportAt(0L); }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD _localDimmingSupportAt(long index, MemorySegment src) { _localDimmingSupportAt(index).copyFrom(src); return this; }
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD _localDimmingSupport(MemorySegment src) { return _localDimmingSupportAt(0L, src); }
}
