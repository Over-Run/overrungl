// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH265SessionParametersGetInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH265SessionParametersGetInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 writeStdVPS;
///     VkBool32 writeStdSPS;
///     VkBool32 writeStdPPS;
///     uint32_t stdVPSId;
///     uint32_t stdSPSId;
///     uint32_t stdPPSId;
/// }
/// ```
public final class VkVideoEncodeH265SessionParametersGetInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("writeStdVPS"),
        ValueLayout.JAVA_INT.withName("writeStdSPS"),
        ValueLayout.JAVA_INT.withName("writeStdPPS"),
        ValueLayout.JAVA_INT.withName("stdVPSId"),
        ValueLayout.JAVA_INT.withName("stdSPSId"),
        ValueLayout.JAVA_INT.withName("stdPPSId")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_writeStdVPS = LAYOUT.byteOffset(PathElement.groupElement("writeStdVPS"));
    public static final long OFFSET_writeStdSPS = LAYOUT.byteOffset(PathElement.groupElement("writeStdSPS"));
    public static final long OFFSET_writeStdPPS = LAYOUT.byteOffset(PathElement.groupElement("writeStdPPS"));
    public static final long OFFSET_stdVPSId = LAYOUT.byteOffset(PathElement.groupElement("stdVPSId"));
    public static final long OFFSET_stdSPSId = LAYOUT.byteOffset(PathElement.groupElement("stdSPSId"));
    public static final long OFFSET_stdPPSId = LAYOUT.byteOffset(PathElement.groupElement("stdPPSId"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_writeStdVPS = LAYOUT.select(PathElement.groupElement("writeStdVPS"));
    public static final MemoryLayout LAYOUT_writeStdSPS = LAYOUT.select(PathElement.groupElement("writeStdSPS"));
    public static final MemoryLayout LAYOUT_writeStdPPS = LAYOUT.select(PathElement.groupElement("writeStdPPS"));
    public static final MemoryLayout LAYOUT_stdVPSId = LAYOUT.select(PathElement.groupElement("stdVPSId"));
    public static final MemoryLayout LAYOUT_stdSPSId = LAYOUT.select(PathElement.groupElement("stdSPSId"));
    public static final MemoryLayout LAYOUT_stdPPSId = LAYOUT.select(PathElement.groupElement("stdPPSId"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_writeStdVPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("writeStdVPS"));
    public static final VarHandle VH_writeStdSPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("writeStdSPS"));
    public static final VarHandle VH_writeStdPPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("writeStdPPS"));
    public static final VarHandle VH_stdVPSId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdVPSId"));
    public static final VarHandle VH_stdSPSId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSPSId"));
    public static final VarHandle VH_stdPPSId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdPPSId"));

    public VkVideoEncodeH265SessionParametersGetInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoEncodeH265SessionParametersGetInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersGetInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoEncodeH265SessionParametersGetInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersGetInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoEncodeH265SessionParametersGetInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersGetInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoEncodeH265SessionParametersGetInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265SessionParametersGetInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoEncodeH265SessionParametersGetInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265SessionParametersGetInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoEncodeH265SessionParametersGetInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR); }
    public static VkVideoEncodeH265SessionParametersGetInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR);
        return s;
    }
    public VkVideoEncodeH265SessionParametersGetInfoKHR copyFrom(VkVideoEncodeH265SessionParametersGetInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR reinterpret(long count) { return new VkVideoEncodeH265SessionParametersGetInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoEncodeH265SessionParametersGetInfoKHR asSlice(long index) { return new VkVideoEncodeH265SessionParametersGetInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoEncodeH265SessionParametersGetInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH265SessionParametersGetInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoEncodeH265SessionParametersGetInfoKHR at(long index, Consumer<VkVideoEncodeH265SessionParametersGetInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int writeStdVPSAt(long index) { return (int) VH_writeStdVPS.get(this.segment(), 0L, index); }
    public int writeStdSPSAt(long index) { return (int) VH_writeStdSPS.get(this.segment(), 0L, index); }
    public int writeStdPPSAt(long index) { return (int) VH_writeStdPPS.get(this.segment(), 0L, index); }
    public int stdVPSIdAt(long index) { return (int) VH_stdVPSId.get(this.segment(), 0L, index); }
    public int stdSPSIdAt(long index) { return (int) VH_stdSPSId.get(this.segment(), 0L, index); }
    public int stdPPSIdAt(long index) { return (int) VH_stdPPSId.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int writeStdVPS() { return (int) VH_writeStdVPS.get(this.segment(), 0L, 0L); }
    public int writeStdSPS() { return (int) VH_writeStdSPS.get(this.segment(), 0L, 0L); }
    public int writeStdPPS() { return (int) VH_writeStdPPS.get(this.segment(), 0L, 0L); }
    public int stdVPSId() { return (int) VH_stdVPSId.get(this.segment(), 0L, 0L); }
    public int stdSPSId() { return (int) VH_stdSPSId.get(this.segment(), 0L, 0L); }
    public int stdPPSId() { return (int) VH_stdPPSId.get(this.segment(), 0L, 0L); }
    public VkVideoEncodeH265SessionParametersGetInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdVPSAt(long index, int value) { VH_writeStdVPS.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdSPSAt(long index, int value) { VH_writeStdSPS.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdPPSAt(long index, int value) { VH_writeStdPPS.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdVPSIdAt(long index, int value) { VH_stdVPSId.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdSPSIdAt(long index, int value) { VH_stdSPSId.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdPPSIdAt(long index, int value) { VH_stdPPSId.set(this.segment(), 0L, index, value); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdVPS(int value) { VH_writeStdVPS.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdSPS(int value) { VH_writeStdSPS.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdPPS(int value) { VH_writeStdPPS.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdVPSId(int value) { VH_stdVPSId.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdSPSId(int value) { VH_stdSPSId.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR stdPPSId(int value) { VH_stdPPSId.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _writeStdVPSAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_writeStdVPS, index), LAYOUT_writeStdVPS); }
    public MemorySegment _writeStdVPS() { return _writeStdVPSAt(0L); }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _writeStdVPSAt(long index, MemorySegment src) { _writeStdVPSAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _writeStdVPS(MemorySegment src) { return _writeStdVPSAt(0L, src); }
    public MemorySegment _writeStdSPSAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_writeStdSPS, index), LAYOUT_writeStdSPS); }
    public MemorySegment _writeStdSPS() { return _writeStdSPSAt(0L); }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _writeStdSPSAt(long index, MemorySegment src) { _writeStdSPSAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _writeStdSPS(MemorySegment src) { return _writeStdSPSAt(0L, src); }
    public MemorySegment _writeStdPPSAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_writeStdPPS, index), LAYOUT_writeStdPPS); }
    public MemorySegment _writeStdPPS() { return _writeStdPPSAt(0L); }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _writeStdPPSAt(long index, MemorySegment src) { _writeStdPPSAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _writeStdPPS(MemorySegment src) { return _writeStdPPSAt(0L, src); }
    public MemorySegment _stdVPSIdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdVPSId, index), LAYOUT_stdVPSId); }
    public MemorySegment _stdVPSId() { return _stdVPSIdAt(0L); }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _stdVPSIdAt(long index, MemorySegment src) { _stdVPSIdAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _stdVPSId(MemorySegment src) { return _stdVPSIdAt(0L, src); }
    public MemorySegment _stdSPSIdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdSPSId, index), LAYOUT_stdSPSId); }
    public MemorySegment _stdSPSId() { return _stdSPSIdAt(0L); }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _stdSPSIdAt(long index, MemorySegment src) { _stdSPSIdAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _stdSPSId(MemorySegment src) { return _stdSPSIdAt(0L, src); }
    public MemorySegment _stdPPSIdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdPPSId, index), LAYOUT_stdPPSId); }
    public MemorySegment _stdPPSId() { return _stdPPSIdAt(0L); }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _stdPPSIdAt(long index, MemorySegment src) { _stdPPSIdAt(index).copyFrom(src); return this; }
    public VkVideoEncodeH265SessionParametersGetInfoKHR _stdPPSId(MemorySegment src) { return _stdPPSIdAt(0L, src); }
}
