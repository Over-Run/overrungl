// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectCommandsExecutionSetTokenEXT`.
/// ## Layout
/// ```
/// struct VkIndirectCommandsExecutionSetTokenEXT {
///     VkIndirectExecutionSetInfoTypeEXT type;
///     VkShaderStageFlags shaderStages;
/// }
/// ```
public final class VkIndirectCommandsExecutionSetTokenEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("shaderStages")
    );
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_shaderStages = LAYOUT.byteOffset(PathElement.groupElement("shaderStages"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_shaderStages = LAYOUT.select(PathElement.groupElement("shaderStages"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_shaderStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStages"));

    public VkIndirectCommandsExecutionSetTokenEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkIndirectCommandsExecutionSetTokenEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsExecutionSetTokenEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkIndirectCommandsExecutionSetTokenEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsExecutionSetTokenEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkIndirectCommandsExecutionSetTokenEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsExecutionSetTokenEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkIndirectCommandsExecutionSetTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsExecutionSetTokenEXT(allocator.allocate(LAYOUT), 1); }
    public static VkIndirectCommandsExecutionSetTokenEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsExecutionSetTokenEXT(allocator.allocate(LAYOUT, count), count); }
    public VkIndirectCommandsExecutionSetTokenEXT copyFrom(VkIndirectCommandsExecutionSetTokenEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkIndirectCommandsExecutionSetTokenEXT reinterpret(long count) { return new VkIndirectCommandsExecutionSetTokenEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkIndirectCommandsExecutionSetTokenEXT asSlice(long index) { return new VkIndirectCommandsExecutionSetTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkIndirectCommandsExecutionSetTokenEXT asSlice(long index, long count) { return new VkIndirectCommandsExecutionSetTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkIndirectCommandsExecutionSetTokenEXT at(long index, Consumer<VkIndirectCommandsExecutionSetTokenEXT> func) { func.accept(asSlice(index)); return this; }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public int shaderStagesAt(long index) { return (int) VH_shaderStages.get(this.segment(), 0L, index); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public int shaderStages() { return (int) VH_shaderStages.get(this.segment(), 0L, 0L); }
    public VkIndirectCommandsExecutionSetTokenEXT typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsExecutionSetTokenEXT shaderStagesAt(long index, int value) { VH_shaderStages.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsExecutionSetTokenEXT type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsExecutionSetTokenEXT shaderStages(int value) { VH_shaderStages.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkIndirectCommandsExecutionSetTokenEXT _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsExecutionSetTokenEXT _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _shaderStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStages, index), LAYOUT_shaderStages); }
    public MemorySegment _shaderStages() { return _shaderStagesAt(0L); }
    public VkIndirectCommandsExecutionSetTokenEXT _shaderStagesAt(long index, MemorySegment src) { _shaderStagesAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsExecutionSetTokenEXT _shaderStages(MemorySegment src) { return _shaderStagesAt(0L, src); }
}
