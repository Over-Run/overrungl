// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ohos.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExternalFormatOHOS`.
/// ## Layout
/// ```
/// struct VkExternalFormatOHOS {
///     VkStructureType sType;
///     void* pNext;
///     uint64_t externalFormat;
/// }
/// ```
public final class VkExternalFormatOHOS extends GroupType {
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

    public VkExternalFormatOHOS(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExternalFormatOHOS of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalFormatOHOS(segment, estimateCount(segment, LAYOUT)); }
    public static VkExternalFormatOHOS ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalFormatOHOS(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExternalFormatOHOS ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalFormatOHOS(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExternalFormatOHOS alloc(SegmentAllocator allocator) { return new VkExternalFormatOHOS(allocator.allocate(LAYOUT), 1); }
    public static VkExternalFormatOHOS alloc(SegmentAllocator allocator, long count) { return new VkExternalFormatOHOS(allocator.allocate(LAYOUT, count), count); }
    public static VkExternalFormatOHOS allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ohos.VKOHOSExternalMemory.VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_OHOS); }
    public static VkExternalFormatOHOS allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ohos.VKOHOSExternalMemory.VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_OHOS);
        return s;
    }
    public VkExternalFormatOHOS copyFrom(VkExternalFormatOHOS src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExternalFormatOHOS reinterpret(long count) { return new VkExternalFormatOHOS(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExternalFormatOHOS asSlice(long index) { return new VkExternalFormatOHOS(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExternalFormatOHOS asSlice(long index, long count) { return new VkExternalFormatOHOS(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExternalFormatOHOS at(long index, Consumer<VkExternalFormatOHOS> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long externalFormatAt(long index) { return (long) VH_externalFormat.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long externalFormat() { return (long) VH_externalFormat.get(this.segment(), 0L, 0L); }
    public VkExternalFormatOHOS sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExternalFormatOHOS pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExternalFormatOHOS externalFormatAt(long index, long value) { VH_externalFormat.set(this.segment(), 0L, index, value); return this; }
    public VkExternalFormatOHOS sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalFormatOHOS pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalFormatOHOS externalFormat(long value) { VH_externalFormat.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExternalFormatOHOS _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExternalFormatOHOS _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExternalFormatOHOS _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExternalFormatOHOS _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _externalFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalFormat, index), LAYOUT_externalFormat); }
    public MemorySegment _externalFormat() { return _externalFormatAt(0L); }
    public VkExternalFormatOHOS _externalFormatAt(long index, MemorySegment src) { _externalFormatAt(index).copyFrom(src); return this; }
    public VkExternalFormatOHOS _externalFormat(MemorySegment src) { return _externalFormatAt(0L, src); }
}
