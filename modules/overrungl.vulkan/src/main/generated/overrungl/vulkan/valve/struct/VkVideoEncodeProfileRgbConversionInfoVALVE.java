// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.valve.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeProfileRgbConversionInfoVALVE`.
/// ## Layout
/// ```
/// struct VkVideoEncodeProfileRgbConversionInfoVALVE {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 performEncodeRgbConversion;
/// }
/// ```
public final class VkVideoEncodeProfileRgbConversionInfoVALVE extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("performEncodeRgbConversion")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_performEncodeRgbConversion = LAYOUT.byteOffset(PathElement.groupElement("performEncodeRgbConversion"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_performEncodeRgbConversion = LAYOUT.select(PathElement.groupElement("performEncodeRgbConversion"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_performEncodeRgbConversion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("performEncodeRgbConversion"));

    public VkVideoEncodeProfileRgbConversionInfoVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeProfileRgbConversionInfoVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeProfileRgbConversionInfoVALVE(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeProfileRgbConversionInfoVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeProfileRgbConversionInfoVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeProfileRgbConversionInfoVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeProfileRgbConversionInfoVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeProfileRgbConversionInfoVALVE alloc(SegmentAllocator allocator) { return new VkVideoEncodeProfileRgbConversionInfoVALVE(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeProfileRgbConversionInfoVALVE alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeProfileRgbConversionInfoVALVE(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeProfileRgbConversionInfoVALVE allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.valve.VKVALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_PROFILE_RGB_CONVERSION_INFO_VALVE); }
    public static VkVideoEncodeProfileRgbConversionInfoVALVE allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.valve.VKVALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_PROFILE_RGB_CONVERSION_INFO_VALVE);
        return s;
    }
    public VkVideoEncodeProfileRgbConversionInfoVALVE copyFrom(VkVideoEncodeProfileRgbConversionInfoVALVE src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeProfileRgbConversionInfoVALVE reinterpret(long count) { return new VkVideoEncodeProfileRgbConversionInfoVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeProfileRgbConversionInfoVALVE asSlice(long index) { return new VkVideoEncodeProfileRgbConversionInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeProfileRgbConversionInfoVALVE asSlice(long index, long count) { return new VkVideoEncodeProfileRgbConversionInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeProfileRgbConversionInfoVALVE at(long index, Consumer<VkVideoEncodeProfileRgbConversionInfoVALVE> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int performEncodeRgbConversionAt(long index) { return (int) VH_performEncodeRgbConversion.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int performEncodeRgbConversion() { return (int) VH_performEncodeRgbConversion.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeProfileRgbConversionInfoVALVE sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeProfileRgbConversionInfoVALVE pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeProfileRgbConversionInfoVALVE performEncodeRgbConversionAt(long index, int value) { VH_performEncodeRgbConversion.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeProfileRgbConversionInfoVALVE sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeProfileRgbConversionInfoVALVE pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeProfileRgbConversionInfoVALVE performEncodeRgbConversion(int value) { VH_performEncodeRgbConversion.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeProfileRgbConversionInfoVALVE _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeProfileRgbConversionInfoVALVE _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeProfileRgbConversionInfoVALVE _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeProfileRgbConversionInfoVALVE _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _performEncodeRgbConversionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_performEncodeRgbConversion, index), LAYOUT_performEncodeRgbConversion); }
    public MemorySegment _performEncodeRgbConversion() { return _performEncodeRgbConversionAt(0L); }
    public VkVideoEncodeProfileRgbConversionInfoVALVE _performEncodeRgbConversionAt(long index, MemorySegment src) { _performEncodeRgbConversionAt(index).copyFrom(src); return this; }
    public VkVideoEncodeProfileRgbConversionInfoVALVE _performEncodeRgbConversion(MemorySegment src) { return _performEncodeRgbConversionAt(0L, src); }
}
