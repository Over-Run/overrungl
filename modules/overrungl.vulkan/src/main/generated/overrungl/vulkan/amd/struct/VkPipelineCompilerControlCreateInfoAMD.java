// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineCompilerControlCreateInfoAMD`.
/// ## Layout
/// ```
/// struct VkPipelineCompilerControlCreateInfoAMD {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCompilerControlFlagsAMD compilerControlFlags;
/// }
/// ```
public final class VkPipelineCompilerControlCreateInfoAMD extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("compilerControlFlags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_compilerControlFlags = LAYOUT.byteOffset(PathElement.groupElement("compilerControlFlags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_compilerControlFlags = LAYOUT.select(PathElement.groupElement("compilerControlFlags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_compilerControlFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compilerControlFlags"));

    public VkPipelineCompilerControlCreateInfoAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineCompilerControlCreateInfoAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCompilerControlCreateInfoAMD(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineCompilerControlCreateInfoAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCompilerControlCreateInfoAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineCompilerControlCreateInfoAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCompilerControlCreateInfoAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineCompilerControlCreateInfoAMD alloc(SegmentAllocator allocator) { return new VkPipelineCompilerControlCreateInfoAMD(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineCompilerControlCreateInfoAMD alloc(SegmentAllocator allocator, long count) { return new VkPipelineCompilerControlCreateInfoAMD(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineCompilerControlCreateInfoAMD allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amd.VKAMDPipelineCompilerControl.VK_STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD); }
    public static VkPipelineCompilerControlCreateInfoAMD allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amd.VKAMDPipelineCompilerControl.VK_STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD);
        return s;
    }
    public VkPipelineCompilerControlCreateInfoAMD copyFrom(VkPipelineCompilerControlCreateInfoAMD src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineCompilerControlCreateInfoAMD reinterpret(long count) { return new VkPipelineCompilerControlCreateInfoAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineCompilerControlCreateInfoAMD asSlice(long index) { return new VkPipelineCompilerControlCreateInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineCompilerControlCreateInfoAMD asSlice(long index, long count) { return new VkPipelineCompilerControlCreateInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineCompilerControlCreateInfoAMD at(long index, Consumer<VkPipelineCompilerControlCreateInfoAMD> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int compilerControlFlagsAt(long index) { return (int) VH_compilerControlFlags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int compilerControlFlags() { return (int) VH_compilerControlFlags.get(this.segment(), 0L, 0L); }
    public VkPipelineCompilerControlCreateInfoAMD sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCompilerControlCreateInfoAMD pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCompilerControlCreateInfoAMD compilerControlFlagsAt(long index, int value) { VH_compilerControlFlags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCompilerControlCreateInfoAMD sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCompilerControlCreateInfoAMD pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCompilerControlCreateInfoAMD compilerControlFlags(int value) { VH_compilerControlFlags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineCompilerControlCreateInfoAMD _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineCompilerControlCreateInfoAMD _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineCompilerControlCreateInfoAMD _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineCompilerControlCreateInfoAMD _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _compilerControlFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compilerControlFlags, index), LAYOUT_compilerControlFlags); }
    public MemorySegment _compilerControlFlags() { return _compilerControlFlagsAt(0L); }
    public VkPipelineCompilerControlCreateInfoAMD _compilerControlFlagsAt(long index, MemorySegment src) { _compilerControlFlagsAt(index).copyFrom(src); return this; }
    public VkPipelineCompilerControlCreateInfoAMD _compilerControlFlags(MemorySegment src) { return _compilerControlFlagsAt(0L, src); }
}
