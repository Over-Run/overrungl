// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindPipelineIndirectCommandNV`.
/// ## Layout
/// ```
/// struct VkBindPipelineIndirectCommandNV {
///     VkDeviceAddress pipelineAddress;
/// }
/// ```
public final class VkBindPipelineIndirectCommandNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("pipelineAddress")
    );
    public static final long OFFSET_pipelineAddress = LAYOUT.byteOffset(PathElement.groupElement("pipelineAddress"));
    public static final MemoryLayout LAYOUT_pipelineAddress = LAYOUT.select(PathElement.groupElement("pipelineAddress"));
    public static final VarHandle VH_pipelineAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineAddress"));

    public VkBindPipelineIndirectCommandNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindPipelineIndirectCommandNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindPipelineIndirectCommandNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindPipelineIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindPipelineIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindPipelineIndirectCommandNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindPipelineIndirectCommandNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindPipelineIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkBindPipelineIndirectCommandNV(allocator.allocate(LAYOUT), 1); }
    public static VkBindPipelineIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkBindPipelineIndirectCommandNV(allocator.allocate(LAYOUT, count), count); }
    public VkBindPipelineIndirectCommandNV copyFrom(VkBindPipelineIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindPipelineIndirectCommandNV reinterpret(long count) { return new VkBindPipelineIndirectCommandNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindPipelineIndirectCommandNV asSlice(long index) { return new VkBindPipelineIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindPipelineIndirectCommandNV asSlice(long index, long count) { return new VkBindPipelineIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindPipelineIndirectCommandNV at(long index, Consumer<VkBindPipelineIndirectCommandNV> func) { func.accept(asSlice(index)); return this; }
    public long pipelineAddressAt(long index) { return (long) VH_pipelineAddress.get(this.segment(), 0L, index); }
    public long pipelineAddress() { return (long) VH_pipelineAddress.get(this.segment(), 0L, 0L); }
    public VkBindPipelineIndirectCommandNV pipelineAddressAt(long index, long value) { VH_pipelineAddress.set(this.segment(), 0L, index, value); return this; }
    public VkBindPipelineIndirectCommandNV pipelineAddress(long value) { VH_pipelineAddress.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _pipelineAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineAddress, index), LAYOUT_pipelineAddress); }
    public MemorySegment _pipelineAddress() { return _pipelineAddressAt(0L); }
    public VkBindPipelineIndirectCommandNV _pipelineAddressAt(long index, MemorySegment src) { _pipelineAddressAt(index).copyFrom(src); return this; }
    public VkBindPipelineIndirectCommandNV _pipelineAddress(MemorySegment src) { return _pipelineAddressAt(0L, src); }
}
