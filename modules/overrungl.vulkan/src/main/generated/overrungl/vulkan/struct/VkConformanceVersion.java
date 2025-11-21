// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkConformanceVersion`.
/// ## Layout
/// ```
/// struct VkConformanceVersion {
///     uint8_t major;
///     uint8_t minor;
///     uint8_t subminor;
///     uint8_t patch;
/// }
/// ```
public final class VkConformanceVersion extends GroupType {
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

    public VkConformanceVersion(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkConformanceVersion of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkConformanceVersion(segment, estimateCount(segment, LAYOUT)); }
    public static VkConformanceVersion ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkConformanceVersion(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkConformanceVersion ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkConformanceVersion(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkConformanceVersion alloc(SegmentAllocator allocator) { return new VkConformanceVersion(allocator.allocate(LAYOUT), 1); }
    public static VkConformanceVersion alloc(SegmentAllocator allocator, long count) { return new VkConformanceVersion(allocator.allocate(LAYOUT, count), count); }
    public VkConformanceVersion copyFrom(VkConformanceVersion src) { this.segment().copyFrom(src.segment()); return this; }
    public VkConformanceVersion reinterpret(long count) { return new VkConformanceVersion(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkConformanceVersion asSlice(long index) { return new VkConformanceVersion(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkConformanceVersion asSlice(long index, long count) { return new VkConformanceVersion(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkConformanceVersion at(long index, Consumer<VkConformanceVersion> func) { func.accept(asSlice(index)); return this; }
    public byte majorAt(long index) { return (byte) VH_major.get(this.segment(), 0L, index); }
    public byte minorAt(long index) { return (byte) VH_minor.get(this.segment(), 0L, index); }
    public byte subminorAt(long index) { return (byte) VH_subminor.get(this.segment(), 0L, index); }
    public byte patchAt(long index) { return (byte) VH_patch.get(this.segment(), 0L, index); }
    public byte major() { return (byte) VH_major.get(this.segment(), 0L, 0L); }
    public byte minor() { return (byte) VH_minor.get(this.segment(), 0L, 0L); }
    public byte subminor() { return (byte) VH_subminor.get(this.segment(), 0L, 0L); }
    public byte patch() { return (byte) VH_patch.get(this.segment(), 0L, 0L); }
    public VkConformanceVersion majorAt(long index, byte value) { VH_major.set(this.segment(), 0L, index, value); return this; }
    public VkConformanceVersion minorAt(long index, byte value) { VH_minor.set(this.segment(), 0L, index, value); return this; }
    public VkConformanceVersion subminorAt(long index, byte value) { VH_subminor.set(this.segment(), 0L, index, value); return this; }
    public VkConformanceVersion patchAt(long index, byte value) { VH_patch.set(this.segment(), 0L, index, value); return this; }
    public VkConformanceVersion major(byte value) { VH_major.set(this.segment(), 0L, 0L, value); return this; }
    public VkConformanceVersion minor(byte value) { VH_minor.set(this.segment(), 0L, 0L, value); return this; }
    public VkConformanceVersion subminor(byte value) { VH_subminor.set(this.segment(), 0L, 0L, value); return this; }
    public VkConformanceVersion patch(byte value) { VH_patch.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _majorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_major, index), LAYOUT_major); }
    public MemorySegment _major() { return _majorAt(0L); }
    public VkConformanceVersion _majorAt(long index, MemorySegment src) { _majorAt(index).copyFrom(src); return this; }
    public VkConformanceVersion _major(MemorySegment src) { return _majorAt(0L, src); }
    public MemorySegment _minorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minor, index), LAYOUT_minor); }
    public MemorySegment _minor() { return _minorAt(0L); }
    public VkConformanceVersion _minorAt(long index, MemorySegment src) { _minorAt(index).copyFrom(src); return this; }
    public VkConformanceVersion _minor(MemorySegment src) { return _minorAt(0L, src); }
    public MemorySegment _subminorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subminor, index), LAYOUT_subminor); }
    public MemorySegment _subminor() { return _subminorAt(0L); }
    public VkConformanceVersion _subminorAt(long index, MemorySegment src) { _subminorAt(index).copyFrom(src); return this; }
    public VkConformanceVersion _subminor(MemorySegment src) { return _subminorAt(0L, src); }
    public MemorySegment _patchAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_patch, index), LAYOUT_patch); }
    public MemorySegment _patch() { return _patchAt(0L); }
    public VkConformanceVersion _patchAt(long index, MemorySegment src) { _patchAt(index).copyFrom(src); return this; }
    public VkConformanceVersion _patch(MemorySegment src) { return _patchAt(0L, src); }
}
