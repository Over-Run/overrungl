// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkConformanceVersionKHR`.
/// ## Layout
/// ```
/// struct VkConformanceVersionKHR {
///     uint8_t major;
///     uint8_t minor;
///     uint8_t subminor;
///     uint8_t patch;
/// }
/// ```
public final class VkConformanceVersionKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("major"),
        ValueLayout.JAVA_BYTE.withName("minor"),
        ValueLayout.JAVA_BYTE.withName("subminor"),
        ValueLayout.JAVA_BYTE.withName("patch")
    );
    public static final long OFFSET_major = LAYOUT.byteOffset(PathElement.groupElement("major"));
    public static final long OFFSET_minor = LAYOUT.byteOffset(PathElement.groupElement("minor"));
    public static final long OFFSET_subminor = LAYOUT.byteOffset(PathElement.groupElement("subminor"));
    public static final long OFFSET_patch = LAYOUT.byteOffset(PathElement.groupElement("patch"));
    public static final MemoryLayout LAYOUT_major = LAYOUT.select(PathElement.groupElement("major"));
    public static final MemoryLayout LAYOUT_minor = LAYOUT.select(PathElement.groupElement("minor"));
    public static final MemoryLayout LAYOUT_subminor = LAYOUT.select(PathElement.groupElement("subminor"));
    public static final MemoryLayout LAYOUT_patch = LAYOUT.select(PathElement.groupElement("patch"));
    public static final VarHandle VH_major = LAYOUT.arrayElementVarHandle(PathElement.groupElement("major"));
    public static final VarHandle VH_minor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minor"));
    public static final VarHandle VH_subminor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subminor"));
    public static final VarHandle VH_patch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("patch"));

    public VkConformanceVersionKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkConformanceVersionKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkConformanceVersionKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkConformanceVersionKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkConformanceVersionKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkConformanceVersionKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkConformanceVersionKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkConformanceVersionKHR alloc(SegmentAllocator allocator) { return new VkConformanceVersionKHR(allocator.allocate(LAYOUT), 1); }
    public static VkConformanceVersionKHR alloc(SegmentAllocator allocator, long count) { return new VkConformanceVersionKHR(allocator.allocate(LAYOUT, count), count); }
    public VkConformanceVersionKHR copyFrom(VkConformanceVersionKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkConformanceVersionKHR reinterpret(long count) { return new VkConformanceVersionKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkConformanceVersionKHR asSlice(long index) { return new VkConformanceVersionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkConformanceVersionKHR asSlice(long index, long count) { return new VkConformanceVersionKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkConformanceVersionKHR at(long index, Consumer<VkConformanceVersionKHR> func) { func.accept(asSlice(index)); return this; }
    public byte majorAt(long index) { return (byte) VH_major.get(this.segment(), 0L, index); }
    public byte minorAt(long index) { return (byte) VH_minor.get(this.segment(), 0L, index); }
    public byte subminorAt(long index) { return (byte) VH_subminor.get(this.segment(), 0L, index); }
    public byte patchAt(long index) { return (byte) VH_patch.get(this.segment(), 0L, index); }
    public byte major() { return (byte) VH_major.get(this.segment(), 0L, 0L); }
    public byte minor() { return (byte) VH_minor.get(this.segment(), 0L, 0L); }
    public byte subminor() { return (byte) VH_subminor.get(this.segment(), 0L, 0L); }
    public byte patch() { return (byte) VH_patch.get(this.segment(), 0L, 0L); }
    public VkConformanceVersionKHR majorAt(long index, byte value) { VH_major.set(this.segment(), 0L, index, value); return this; }
    public VkConformanceVersionKHR minorAt(long index, byte value) { VH_minor.set(this.segment(), 0L, index, value); return this; }
    public VkConformanceVersionKHR subminorAt(long index, byte value) { VH_subminor.set(this.segment(), 0L, index, value); return this; }
    public VkConformanceVersionKHR patchAt(long index, byte value) { VH_patch.set(this.segment(), 0L, index, value); return this; }
    public VkConformanceVersionKHR major(byte value) { VH_major.set(this.segment(), 0L, 0L, value); return this; }
    public VkConformanceVersionKHR minor(byte value) { VH_minor.set(this.segment(), 0L, 0L, value); return this; }
    public VkConformanceVersionKHR subminor(byte value) { VH_subminor.set(this.segment(), 0L, 0L, value); return this; }
    public VkConformanceVersionKHR patch(byte value) { VH_patch.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _majorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_major, index), LAYOUT_major); }
    public MemorySegment _major() { return _majorAt(0L); }
    public VkConformanceVersionKHR _majorAt(long index, MemorySegment src) { _majorAt(index).copyFrom(src); return this; }
    public VkConformanceVersionKHR _major(MemorySegment src) { return _majorAt(0L, src); }
    public MemorySegment _minorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minor, index), LAYOUT_minor); }
    public MemorySegment _minor() { return _minorAt(0L); }
    public VkConformanceVersionKHR _minorAt(long index, MemorySegment src) { _minorAt(index).copyFrom(src); return this; }
    public VkConformanceVersionKHR _minor(MemorySegment src) { return _minorAt(0L, src); }
    public MemorySegment _subminorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subminor, index), LAYOUT_subminor); }
    public MemorySegment _subminor() { return _subminorAt(0L); }
    public VkConformanceVersionKHR _subminorAt(long index, MemorySegment src) { _subminorAt(index).copyFrom(src); return this; }
    public VkConformanceVersionKHR _subminor(MemorySegment src) { return _subminorAt(0L, src); }
    public MemorySegment _patchAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_patch, index), LAYOUT_patch); }
    public MemorySegment _patch() { return _patchAt(0L); }
    public VkConformanceVersionKHR _patchAt(long index, MemorySegment src) { _patchAt(index).copyFrom(src); return this; }
    public VkConformanceVersionKHR _patch(MemorySegment src) { return _patchAt(0L, src); }
}
