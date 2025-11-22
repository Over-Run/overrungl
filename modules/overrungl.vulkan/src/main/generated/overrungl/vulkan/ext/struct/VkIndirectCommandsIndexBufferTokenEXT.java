// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectCommandsIndexBufferTokenEXT`.
/// ## Layout
/// ```
/// struct VkIndirectCommandsIndexBufferTokenEXT {
///     VkIndirectCommandsInputModeFlagBitsEXT mode;
/// }
/// ```
public final class VkIndirectCommandsIndexBufferTokenEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("mode")
    );
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));

    public VkIndirectCommandsIndexBufferTokenEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkIndirectCommandsIndexBufferTokenEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsIndexBufferTokenEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkIndirectCommandsIndexBufferTokenEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsIndexBufferTokenEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkIndirectCommandsIndexBufferTokenEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsIndexBufferTokenEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkIndirectCommandsIndexBufferTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsIndexBufferTokenEXT(allocator.allocate(LAYOUT), 1); }
    public static VkIndirectCommandsIndexBufferTokenEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsIndexBufferTokenEXT(allocator.allocate(LAYOUT, count), count); }
    public VkIndirectCommandsIndexBufferTokenEXT copyFrom(VkIndirectCommandsIndexBufferTokenEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkIndirectCommandsIndexBufferTokenEXT reinterpret(long count) { return new VkIndirectCommandsIndexBufferTokenEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkIndirectCommandsIndexBufferTokenEXT asSlice(long index) { return new VkIndirectCommandsIndexBufferTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkIndirectCommandsIndexBufferTokenEXT asSlice(long index, long count) { return new VkIndirectCommandsIndexBufferTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkIndirectCommandsIndexBufferTokenEXT at(long index, Consumer<VkIndirectCommandsIndexBufferTokenEXT> func) { func.accept(asSlice(index)); return this; }
    public int modeAt(long index) { return (int) VH_mode.get(this.segment(), 0L, index); }
    public int mode() { return (int) VH_mode.get(this.segment(), 0L, 0L); }
    public VkIndirectCommandsIndexBufferTokenEXT modeAt(long index, int value) { VH_mode.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsIndexBufferTokenEXT mode(int value) { VH_mode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _modeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mode, index), LAYOUT_mode); }
    public MemorySegment _mode() { return _modeAt(0L); }
    public VkIndirectCommandsIndexBufferTokenEXT _modeAt(long index, MemorySegment src) { _modeAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsIndexBufferTokenEXT _mode(MemorySegment src) { return _modeAt(0L, src); }
}
