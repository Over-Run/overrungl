// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkWriteIndirectExecutionSetShaderEXT`.
/// ## Layout
/// ```
/// struct VkWriteIndirectExecutionSetShaderEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t index;
///     VkShaderEXT shader;
/// }
/// ```
public final class VkWriteIndirectExecutionSetShaderEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("index"),
        ValueLayout.JAVA_LONG.withName("shader")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_index = LAYOUT.byteOffset(PathElement.groupElement("index"));
    public static final long OFFSET_shader = LAYOUT.byteOffset(PathElement.groupElement("shader"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_index = LAYOUT.select(PathElement.groupElement("index"));
    public static final MemoryLayout LAYOUT_shader = LAYOUT.select(PathElement.groupElement("shader"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_index = LAYOUT.arrayElementVarHandle(PathElement.groupElement("index"));
    public static final VarHandle VH_shader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shader"));

    public VkWriteIndirectExecutionSetShaderEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkWriteIndirectExecutionSetShaderEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteIndirectExecutionSetShaderEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkWriteIndirectExecutionSetShaderEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteIndirectExecutionSetShaderEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkWriteIndirectExecutionSetShaderEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteIndirectExecutionSetShaderEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkWriteIndirectExecutionSetShaderEXT alloc(SegmentAllocator allocator) { return new VkWriteIndirectExecutionSetShaderEXT(allocator.allocate(LAYOUT), 1); }
    public static VkWriteIndirectExecutionSetShaderEXT alloc(SegmentAllocator allocator, long count) { return new VkWriteIndirectExecutionSetShaderEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkWriteIndirectExecutionSetShaderEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT); }
    public static VkWriteIndirectExecutionSetShaderEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT);
        return s;
    }
    public VkWriteIndirectExecutionSetShaderEXT copyFrom(VkWriteIndirectExecutionSetShaderEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkWriteIndirectExecutionSetShaderEXT reinterpret(long count) { return new VkWriteIndirectExecutionSetShaderEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkWriteIndirectExecutionSetShaderEXT asSlice(long index) { return new VkWriteIndirectExecutionSetShaderEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkWriteIndirectExecutionSetShaderEXT asSlice(long index, long count) { return new VkWriteIndirectExecutionSetShaderEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkWriteIndirectExecutionSetShaderEXT at(long index, Consumer<VkWriteIndirectExecutionSetShaderEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int indexAt(long index) { return (int) VH_index.get(this.segment(), 0L, index); }
    public long shaderAt(long index) { return (long) VH_shader.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int index() { return (int) VH_index.get(this.segment(), 0L, 0L); }
    public long shader() { return (long) VH_shader.get(this.segment(), 0L, 0L); }
    public VkWriteIndirectExecutionSetShaderEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkWriteIndirectExecutionSetShaderEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkWriteIndirectExecutionSetShaderEXT indexAt(long index, int value) { VH_index.set(this.segment(), 0L, index, value); return this; }
    public VkWriteIndirectExecutionSetShaderEXT shaderAt(long index, long value) { VH_shader.set(this.segment(), 0L, index, value); return this; }
    public VkWriteIndirectExecutionSetShaderEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteIndirectExecutionSetShaderEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteIndirectExecutionSetShaderEXT index(int value) { VH_index.set(this.segment(), 0L, 0L, value); return this; }
    public VkWriteIndirectExecutionSetShaderEXT shader(long value) { VH_shader.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkWriteIndirectExecutionSetShaderEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkWriteIndirectExecutionSetShaderEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkWriteIndirectExecutionSetShaderEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkWriteIndirectExecutionSetShaderEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _indexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_index, index), LAYOUT_index); }
    public MemorySegment _index() { return _indexAt(0L); }
    public VkWriteIndirectExecutionSetShaderEXT _indexAt(long index, MemorySegment src) { _indexAt(index).copyFrom(src); return this; }
    public VkWriteIndirectExecutionSetShaderEXT _index(MemorySegment src) { return _indexAt(0L, src); }
    public MemorySegment _shaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shader, index), LAYOUT_shader); }
    public MemorySegment _shader() { return _shaderAt(0L); }
    public VkWriteIndirectExecutionSetShaderEXT _shaderAt(long index, MemorySegment src) { _shaderAt(index).copyFrom(src); return this; }
    public VkWriteIndirectExecutionSetShaderEXT _shader(MemorySegment src) { return _shaderAt(0L, src); }
}
