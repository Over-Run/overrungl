// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH264SessionParametersGetInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH264SessionParametersGetInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 writeStdSPS;
///     VkBool32 writeStdPPS;
///     uint32_t stdSPSId;
///     uint32_t stdPPSId;
/// }
/// ```
public final class VkVideoEncodeH264SessionParametersGetInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("writeStdSPS"),
        ValueLayout.JAVA_INT.withName("writeStdPPS"),
        ValueLayout.JAVA_INT.withName("stdSPSId"),
        ValueLayout.JAVA_INT.withName("stdPPSId")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_writeStdSPS = LAYOUT.byteOffset(PathElement.groupElement("writeStdSPS"));
    public static final long OFFSET_writeStdPPS = LAYOUT.byteOffset(PathElement.groupElement("writeStdPPS"));
    public static final long OFFSET_stdSPSId = LAYOUT.byteOffset(PathElement.groupElement("stdSPSId"));
    public static final long OFFSET_stdPPSId = LAYOUT.byteOffset(PathElement.groupElement("stdPPSId"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_writeStdSPS = LAYOUT.select(PathElement.groupElement("writeStdSPS"));
    public static final MemoryLayout LAYOUT_writeStdPPS = LAYOUT.select(PathElement.groupElement("writeStdPPS"));
    public static final MemoryLayout LAYOUT_stdSPSId = LAYOUT.select(PathElement.groupElement("stdSPSId"));
    public static final MemoryLayout LAYOUT_stdPPSId = LAYOUT.select(PathElement.groupElement("stdPPSId"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_writeStdSPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("writeStdSPS"));
    public static final VarHandle VH_writeStdPPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("writeStdPPS"));
    public static final VarHandle VH_stdSPSId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSPSId"));
    public static final VarHandle VH_stdPPSId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdPPSId"));

    public VkVideoEncodeH264SessionParametersGetInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH264SessionParametersGetInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersGetInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH264SessionParametersGetInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersGetInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH264SessionParametersGetInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersGetInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH264SessionParametersGetInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264SessionParametersGetInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH264SessionParametersGetInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264SessionParametersGetInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH264SessionParametersGetInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_KHR); }
    public static VkVideoEncodeH264SessionParametersGetInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeH264.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_KHR);
        return s;
    }
    public VkVideoEncodeH264SessionParametersGetInfoKHR copyFrom(VkVideoEncodeH264SessionParametersGetInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR reinterpret(long count) { return new VkVideoEncodeH264SessionParametersGetInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH264SessionParametersGetInfoKHR asSlice(long index) { return new VkVideoEncodeH264SessionParametersGetInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH264SessionParametersGetInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH264SessionParametersGetInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH264SessionParametersGetInfoKHR at(long index, Consumer<VkVideoEncodeH264SessionParametersGetInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int writeStdSPSAt(long index) { return (int) VH_writeStdSPS.get(this.segment(), 0L, index); }
    public int writeStdPPSAt(long index) { return (int) VH_writeStdPPS.get(this.segment(), 0L, index); }
    public int stdSPSIdAt(long index) { return (int) VH_stdSPSId.get(this.segment(), 0L, index); }
    public int stdPPSIdAt(long index) { return (int) VH_stdPPSId.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int writeStdSPS() { return (int) VH_writeStdSPS.get(this.segment(), 0L, 0L); }
    public int writeStdPPS() { return (int) VH_writeStdPPS.get(this.segment(), 0L, 0L); }
    public int stdSPSId() { return (int) VH_stdSPSId.get(this.segment(), 0L, 0L); }
    public int stdPPSId() { return (int) VH_stdPPSId.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH264SessionParametersGetInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR writeStdSPSAt(long index, int value) { VH_writeStdSPS.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR writeStdPPSAt(long index, int value) { VH_writeStdPPS.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR stdSPSIdAt(long index, int value) { VH_stdSPSId.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR stdPPSIdAt(long index, int value) { VH_stdPPSId.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR writeStdSPS(int value) { VH_writeStdSPS.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR writeStdPPS(int value) { VH_writeStdPPS.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR stdSPSId(int value) { VH_stdSPSId.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR stdPPSId(int value) { VH_stdPPSId.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH264SessionParametersGetInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH264SessionParametersGetInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _writeStdSPSAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_writeStdSPS, index), LAYOUT_writeStdSPS); }
    public MemorySegment _writeStdSPS() { return _writeStdSPSAt(0L); }
    public VkVideoEncodeH264SessionParametersGetInfoKHR _writeStdSPSAt(long index, MemorySegment src) { _writeStdSPSAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR _writeStdSPS(MemorySegment src) { return _writeStdSPSAt(0L, src); }
    public MemorySegment _writeStdPPSAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_writeStdPPS, index), LAYOUT_writeStdPPS); }
    public MemorySegment _writeStdPPS() { return _writeStdPPSAt(0L); }
    public VkVideoEncodeH264SessionParametersGetInfoKHR _writeStdPPSAt(long index, MemorySegment src) { _writeStdPPSAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR _writeStdPPS(MemorySegment src) { return _writeStdPPSAt(0L, src); }
    public MemorySegment _stdSPSIdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdSPSId, index), LAYOUT_stdSPSId); }
    public MemorySegment _stdSPSId() { return _stdSPSIdAt(0L); }
    public VkVideoEncodeH264SessionParametersGetInfoKHR _stdSPSIdAt(long index, MemorySegment src) { _stdSPSIdAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR _stdSPSId(MemorySegment src) { return _stdSPSIdAt(0L, src); }
    public MemorySegment _stdPPSIdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdPPSId, index), LAYOUT_stdPPSId); }
    public MemorySegment _stdPPSId() { return _stdPPSIdAt(0L); }
    public VkVideoEncodeH264SessionParametersGetInfoKHR _stdPPSIdAt(long index, MemorySegment src) { _stdPPSIdAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH264SessionParametersGetInfoKHR _stdPPSId(MemorySegment src) { return _stdPPSIdAt(0L, src); }
}
