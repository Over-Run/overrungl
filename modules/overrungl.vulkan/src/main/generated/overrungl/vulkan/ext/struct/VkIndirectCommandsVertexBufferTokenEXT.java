// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectCommandsVertexBufferTokenEXT`.
/// ## Layout
/// ```
/// struct VkIndirectCommandsVertexBufferTokenEXT {
///     uint32_t vertexBindingUnit;
/// }
/// ```
public final class VkIndirectCommandsVertexBufferTokenEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("vertexBindingUnit")
    );
    public static final long OFFSET_vertexBindingUnit = LAYOUT.byteOffset(PathElement.groupElement("vertexBindingUnit"));
    public static final MemoryLayout LAYOUT_vertexBindingUnit = LAYOUT.select(PathElement.groupElement("vertexBindingUnit"));
    public static final VarHandle VH_vertexBindingUnit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexBindingUnit"));

    public VkIndirectCommandsVertexBufferTokenEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkIndirectCommandsVertexBufferTokenEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsVertexBufferTokenEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkIndirectCommandsVertexBufferTokenEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsVertexBufferTokenEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkIndirectCommandsVertexBufferTokenEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsVertexBufferTokenEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkIndirectCommandsVertexBufferTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsVertexBufferTokenEXT(allocator.allocate(LAYOUT), 1); }
    public static VkIndirectCommandsVertexBufferTokenEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsVertexBufferTokenEXT(allocator.allocate(LAYOUT, count), count); }
    public VkIndirectCommandsVertexBufferTokenEXT copyFrom(VkIndirectCommandsVertexBufferTokenEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkIndirectCommandsVertexBufferTokenEXT reinterpret(long count) { return new VkIndirectCommandsVertexBufferTokenEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkIndirectCommandsVertexBufferTokenEXT asSlice(long index) { return new VkIndirectCommandsVertexBufferTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkIndirectCommandsVertexBufferTokenEXT asSlice(long index, long count) { return new VkIndirectCommandsVertexBufferTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkIndirectCommandsVertexBufferTokenEXT at(long index, Consumer<VkIndirectCommandsVertexBufferTokenEXT> func) { func.accept(asSlice(index)); return this; }
    public int vertexBindingUnitAt(long index) { return (int) VH_vertexBindingUnit.get(this.segment(), 0L, index); }
    public int vertexBindingUnit() { return (int) VH_vertexBindingUnit.get(this.segment(), 0L, 0L); }
    public VkIndirectCommandsVertexBufferTokenEXT vertexBindingUnitAt(long index, int value) { VH_vertexBindingUnit.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsVertexBufferTokenEXT vertexBindingUnit(int value) { VH_vertexBindingUnit.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _vertexBindingUnitAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexBindingUnit, index), LAYOUT_vertexBindingUnit); }
    public MemorySegment _vertexBindingUnit() { return _vertexBindingUnitAt(0L); }
    public VkIndirectCommandsVertexBufferTokenEXT _vertexBindingUnitAt(long index, MemorySegment src) { _vertexBindingUnitAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsVertexBufferTokenEXT _vertexBindingUnit(MemorySegment src) { return _vertexBindingUnitAt(0L, src); }
}
