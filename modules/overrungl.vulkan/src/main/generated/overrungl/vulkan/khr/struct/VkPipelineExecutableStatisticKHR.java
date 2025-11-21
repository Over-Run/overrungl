// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineExecutableStatisticKHR`.
/// ## Layout
/// ```
/// struct VkPipelineExecutableStatisticKHR {
///     VkStructureType sType;
///     void* pNext;
///     char name[VK_MAX_DESCRIPTION_SIZE];
///     char description[VK_MAX_DESCRIPTION_SIZE];
///     VkPipelineExecutableStatisticFormatKHR format;
///     VkPipelineExecutableStatisticValueKHR value;
/// }
/// ```
public final class VkPipelineExecutableStatisticKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_INT.withName("format"),
        overrungl.vulkan.khr.union.VkPipelineExecutableStatisticValueKHR.LAYOUT.withName("value")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final long OFFSET_value = LAYOUT.byteOffset(PathElement.groupElement("value"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_name = LAYOUT.select(PathElement.groupElement("name"));
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_value = LAYOUT.select(PathElement.groupElement("value"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    public static final VarHandle VH_value$b32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"), PathElement.groupElement("b32"));
    public static final VarHandle VH_value$i64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"), PathElement.groupElement("i64"));
    public static final VarHandle VH_value$u64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"), PathElement.groupElement("u64"));
    public static final VarHandle VH_value$f64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"), PathElement.groupElement("f64"));

    public VkPipelineExecutableStatisticKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineExecutableStatisticKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineExecutableStatisticKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineExecutableStatisticKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableStatisticKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineExecutableStatisticKHR alloc(SegmentAllocator allocator) { return new VkPipelineExecutableStatisticKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineExecutableStatisticKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineExecutableStatisticKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineExecutableStatisticKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR); }
    public static VkPipelineExecutableStatisticKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR);
        return s;
    }
    public VkPipelineExecutableStatisticKHR copyFrom(VkPipelineExecutableStatisticKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineExecutableStatisticKHR reinterpret(long count) { return new VkPipelineExecutableStatisticKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineExecutableStatisticKHR asSlice(long index) { return new VkPipelineExecutableStatisticKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineExecutableStatisticKHR asSlice(long index, long count) { return new VkPipelineExecutableStatisticKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineExecutableStatisticKHR at(long index, Consumer<VkPipelineExecutableStatisticKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public byte nameAt(long index, long index0) { return (byte) VH_name.get(this.segment(), 0L, index, index0); }
    public byte descriptionAt(long index, long index0) { return (byte) VH_description.get(this.segment(), 0L, index, index0); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int value$b32At(long index) { return (int) VH_value$b32.get(this.segment(), 0L, index); }
    public long value$i64At(long index) { return (long) VH_value$i64.get(this.segment(), 0L, index); }
    public long value$u64At(long index) { return (long) VH_value$u64.get(this.segment(), 0L, index); }
    public double value$f64At(long index) { return (double) VH_value$f64.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public byte name(long index0) { return (byte) VH_name.get(this.segment(), 0L, 0L, index0); }
    public byte description(long index0) { return (byte) VH_description.get(this.segment(), 0L, 0L, index0); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public int value$b32() { return (int) VH_value$b32.get(this.segment(), 0L, 0L); }
    public long value$i64() { return (long) VH_value$i64.get(this.segment(), 0L, 0L); }
    public long value$u64() { return (long) VH_value$u64.get(this.segment(), 0L, 0L); }
    public double value$f64() { return (double) VH_value$f64.get(this.segment(), 0L, 0L); }
    public VkPipelineExecutableStatisticKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableStatisticKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableStatisticKHR nameAt(long index, long index0, byte value) { VH_name.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPipelineExecutableStatisticKHR descriptionAt(long index, long index0, byte value) { VH_description.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPipelineExecutableStatisticKHR formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableStatisticKHR value$b32At(long index, int value) { VH_value$b32.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableStatisticKHR value$i64At(long index, long value) { VH_value$i64.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableStatisticKHR value$u64At(long index, long value) { VH_value$u64.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableStatisticKHR value$f64At(long index, double value) { VH_value$f64.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableStatisticKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableStatisticKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableStatisticKHR name(long index0, byte value) { VH_name.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPipelineExecutableStatisticKHR description(long index0, byte value) { VH_description.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPipelineExecutableStatisticKHR format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableStatisticKHR value$b32(int value) { VH_value$b32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableStatisticKHR value$i64(long value) { VH_value$i64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableStatisticKHR value$u64(long value) { VH_value$u64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableStatisticKHR value$f64(double value) { VH_value$f64.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineExecutableStatisticKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableStatisticKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineExecutableStatisticKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableStatisticKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _nameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_name, index), LAYOUT_name); }
    public MemorySegment _name() { return _nameAt(0L); }
    public VkPipelineExecutableStatisticKHR _nameAt(long index, MemorySegment src) { _nameAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableStatisticKHR _name(MemorySegment src) { return _nameAt(0L, src); }
    public MemorySegment _descriptionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    public MemorySegment _description() { return _descriptionAt(0L); }
    public VkPipelineExecutableStatisticKHR _descriptionAt(long index, MemorySegment src) { _descriptionAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableStatisticKHR _description(MemorySegment src) { return _descriptionAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkPipelineExecutableStatisticKHR _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableStatisticKHR _format(MemorySegment src) { return _formatAt(0L, src); }
    public MemorySegment _valueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_value, index), LAYOUT_value); }
    public MemorySegment _value() { return _valueAt(0L); }
    public VkPipelineExecutableStatisticKHR _valueAt(long index, MemorySegment src) { _valueAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableStatisticKHR _value(MemorySegment src) { return _valueAt(0L, src); }
}
