// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceDiagnosticsConfigCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkDeviceDiagnosticsConfigCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceDiagnosticsConfigFlagsNV flags;
/// }
/// ```
public final class VkDeviceDiagnosticsConfigCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    public VkDeviceDiagnosticsConfigCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceDiagnosticsConfigCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceDiagnosticsConfigCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceDiagnosticsConfigCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceDiagnosticsConfigCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceDiagnosticsConfigCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceDiagnosticsConfigCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceDiagnosticsConfigCreateInfoNV alloc(SegmentAllocator allocator) { return new VkDeviceDiagnosticsConfigCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceDiagnosticsConfigCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkDeviceDiagnosticsConfigCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceDiagnosticsConfigCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDeviceDiagnosticsConfig.VK_STRUCTURE_TYPE_DEVICE_DIAGNOSTICS_CONFIG_CREATE_INFO_NV); }
    public static VkDeviceDiagnosticsConfigCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDeviceDiagnosticsConfig.VK_STRUCTURE_TYPE_DEVICE_DIAGNOSTICS_CONFIG_CREATE_INFO_NV);
        return s;
    }
    public VkDeviceDiagnosticsConfigCreateInfoNV copyFrom(VkDeviceDiagnosticsConfigCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceDiagnosticsConfigCreateInfoNV reinterpret(long count) { return new VkDeviceDiagnosticsConfigCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceDiagnosticsConfigCreateInfoNV asSlice(long index) { return new VkDeviceDiagnosticsConfigCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceDiagnosticsConfigCreateInfoNV asSlice(long index, long count) { return new VkDeviceDiagnosticsConfigCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceDiagnosticsConfigCreateInfoNV at(long index, Consumer<VkDeviceDiagnosticsConfigCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public VkDeviceDiagnosticsConfigCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceDiagnosticsConfigCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceDiagnosticsConfigCreateInfoNV flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceDiagnosticsConfigCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceDiagnosticsConfigCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceDiagnosticsConfigCreateInfoNV flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceDiagnosticsConfigCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceDiagnosticsConfigCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceDiagnosticsConfigCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceDiagnosticsConfigCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkDeviceDiagnosticsConfigCreateInfoNV _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkDeviceDiagnosticsConfigCreateInfoNV _flags(MemorySegment src) { return _flagsAt(0L, src); }
}
