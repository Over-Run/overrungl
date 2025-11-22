// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.android.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExternalFormatANDROID`.
/// ## Layout
/// ```
/// struct VkExternalFormatANDROID {
///     VkStructureType sType;
///     void* pNext;
///     uint64_t externalFormat;
/// }
/// ```
public final class VkExternalFormatANDROID extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("externalFormat")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_externalFormat = LAYOUT.byteOffset(PathElement.groupElement("externalFormat"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_externalFormat = LAYOUT.select(PathElement.groupElement("externalFormat"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_externalFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormat"));

    public VkExternalFormatANDROID(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExternalFormatANDROID of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalFormatANDROID(segment, estimateCount(segment, LAYOUT)); }
    public static VkExternalFormatANDROID ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalFormatANDROID(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExternalFormatANDROID ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalFormatANDROID(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExternalFormatANDROID alloc(SegmentAllocator allocator) { return new VkExternalFormatANDROID(allocator.allocate(LAYOUT), 1); }
    public static VkExternalFormatANDROID alloc(SegmentAllocator allocator, long count) { return new VkExternalFormatANDROID(allocator.allocate(LAYOUT, count), count); }
    public static VkExternalFormatANDROID allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.android.VKANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID); }
    public static VkExternalFormatANDROID allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.android.VKANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID);
        return s;
    }
    public VkExternalFormatANDROID copyFrom(VkExternalFormatANDROID src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExternalFormatANDROID reinterpret(long count) { return new VkExternalFormatANDROID(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExternalFormatANDROID asSlice(long index) { return new VkExternalFormatANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExternalFormatANDROID asSlice(long index, long count) { return new VkExternalFormatANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExternalFormatANDROID at(long index, Consumer<VkExternalFormatANDROID> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long externalFormatAt(long index) { return (long) VH_externalFormat.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long externalFormat() { return (long) VH_externalFormat.get(this.segment(), 0L, 0L); }
    public VkExternalFormatANDROID sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExternalFormatANDROID pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExternalFormatANDROID externalFormatAt(long index, long value) { VH_externalFormat.set(this.segment(), 0L, index, value); return this; }
    public VkExternalFormatANDROID sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalFormatANDROID pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalFormatANDROID externalFormat(long value) { VH_externalFormat.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExternalFormatANDROID _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExternalFormatANDROID _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExternalFormatANDROID _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExternalFormatANDROID _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _externalFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalFormat, index), LAYOUT_externalFormat); }
    public MemorySegment _externalFormat() { return _externalFormatAt(0L); }
    public VkExternalFormatANDROID _externalFormatAt(long index, MemorySegment src) { _externalFormatAt(index).copyFrom(src); return this; }
    public VkExternalFormatANDROID _externalFormat(MemorySegment src) { return _externalFormatAt(0L, src); }
}
