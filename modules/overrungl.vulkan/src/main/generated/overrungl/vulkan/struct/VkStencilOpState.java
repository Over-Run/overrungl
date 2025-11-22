// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkStencilOpState`.
/// ## Layout
/// ```
/// struct VkStencilOpState {
///     VkStencilOp failOp;
///     VkStencilOp passOp;
///     VkStencilOp depthFailOp;
///     VkCompareOp compareOp;
///     uint32_t compareMask;
///     uint32_t writeMask;
///     uint32_t reference;
/// }
/// ```
public final class VkStencilOpState extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("failOp"),
        ValueLayout.JAVA_INT.withName("passOp"),
        ValueLayout.JAVA_INT.withName("depthFailOp"),
        ValueLayout.JAVA_INT.withName("compareOp"),
        ValueLayout.JAVA_INT.withName("compareMask"),
        ValueLayout.JAVA_INT.withName("writeMask"),
        ValueLayout.JAVA_INT.withName("reference")
    );
    public static final long OFFSET_failOp = LAYOUT.byteOffset(PathElement.groupElement("failOp"));
    public static final long OFFSET_passOp = LAYOUT.byteOffset(PathElement.groupElement("passOp"));
    public static final long OFFSET_depthFailOp = LAYOUT.byteOffset(PathElement.groupElement("depthFailOp"));
    public static final long OFFSET_compareOp = LAYOUT.byteOffset(PathElement.groupElement("compareOp"));
    public static final long OFFSET_compareMask = LAYOUT.byteOffset(PathElement.groupElement("compareMask"));
    public static final long OFFSET_writeMask = LAYOUT.byteOffset(PathElement.groupElement("writeMask"));
    public static final long OFFSET_reference = LAYOUT.byteOffset(PathElement.groupElement("reference"));
    public static final MemoryLayout LAYOUT_failOp = LAYOUT.select(PathElement.groupElement("failOp"));
    public static final MemoryLayout LAYOUT_passOp = LAYOUT.select(PathElement.groupElement("passOp"));
    public static final MemoryLayout LAYOUT_depthFailOp = LAYOUT.select(PathElement.groupElement("depthFailOp"));
    public static final MemoryLayout LAYOUT_compareOp = LAYOUT.select(PathElement.groupElement("compareOp"));
    public static final MemoryLayout LAYOUT_compareMask = LAYOUT.select(PathElement.groupElement("compareMask"));
    public static final MemoryLayout LAYOUT_writeMask = LAYOUT.select(PathElement.groupElement("writeMask"));
    public static final MemoryLayout LAYOUT_reference = LAYOUT.select(PathElement.groupElement("reference"));
    public static final VarHandle VH_failOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("failOp"));
    public static final VarHandle VH_passOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("passOp"));
    public static final VarHandle VH_depthFailOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthFailOp"));
    public static final VarHandle VH_compareOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compareOp"));
    public static final VarHandle VH_compareMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compareMask"));
    public static final VarHandle VH_writeMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("writeMask"));
    public static final VarHandle VH_reference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reference"));

    public VkStencilOpState(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkStencilOpState of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStencilOpState(segment, estimateCount(segment, LAYOUT)); }
    public static VkStencilOpState ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStencilOpState(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkStencilOpState ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkStencilOpState(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkStencilOpState alloc(SegmentAllocator allocator) { return new VkStencilOpState(allocator.allocate(LAYOUT), 1); }
    public static VkStencilOpState alloc(SegmentAllocator allocator, long count) { return new VkStencilOpState(allocator.allocate(LAYOUT, count), count); }
    public VkStencilOpState copyFrom(VkStencilOpState src) { this.segment().copyFrom(src.segment()); return this; }
    public VkStencilOpState reinterpret(long count) { return new VkStencilOpState(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkStencilOpState asSlice(long index) { return new VkStencilOpState(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkStencilOpState asSlice(long index, long count) { return new VkStencilOpState(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkStencilOpState at(long index, Consumer<VkStencilOpState> func) { func.accept(asSlice(index)); return this; }
    public int failOpAt(long index) { return (int) VH_failOp.get(this.segment(), 0L, index); }
    public int passOpAt(long index) { return (int) VH_passOp.get(this.segment(), 0L, index); }
    public int depthFailOpAt(long index) { return (int) VH_depthFailOp.get(this.segment(), 0L, index); }
    public int compareOpAt(long index) { return (int) VH_compareOp.get(this.segment(), 0L, index); }
    public int compareMaskAt(long index) { return (int) VH_compareMask.get(this.segment(), 0L, index); }
    public int writeMaskAt(long index) { return (int) VH_writeMask.get(this.segment(), 0L, index); }
    public int referenceAt(long index) { return (int) VH_reference.get(this.segment(), 0L, index); }
    public int failOp() { return (int) VH_failOp.get(this.segment(), 0L, 0L); }
    public int passOp() { return (int) VH_passOp.get(this.segment(), 0L, 0L); }
    public int depthFailOp() { return (int) VH_depthFailOp.get(this.segment(), 0L, 0L); }
    public int compareOp() { return (int) VH_compareOp.get(this.segment(), 0L, 0L); }
    public int compareMask() { return (int) VH_compareMask.get(this.segment(), 0L, 0L); }
    public int writeMask() { return (int) VH_writeMask.get(this.segment(), 0L, 0L); }
    public int reference() { return (int) VH_reference.get(this.segment(), 0L, 0L); }
    public VkStencilOpState failOpAt(long index, int value) { VH_failOp.set(this.segment(), 0L, index, value); return this; }
    public VkStencilOpState passOpAt(long index, int value) { VH_passOp.set(this.segment(), 0L, index, value); return this; }
    public VkStencilOpState depthFailOpAt(long index, int value) { VH_depthFailOp.set(this.segment(), 0L, index, value); return this; }
    public VkStencilOpState compareOpAt(long index, int value) { VH_compareOp.set(this.segment(), 0L, index, value); return this; }
    public VkStencilOpState compareMaskAt(long index, int value) { VH_compareMask.set(this.segment(), 0L, index, value); return this; }
    public VkStencilOpState writeMaskAt(long index, int value) { VH_writeMask.set(this.segment(), 0L, index, value); return this; }
    public VkStencilOpState referenceAt(long index, int value) { VH_reference.set(this.segment(), 0L, index, value); return this; }
    public VkStencilOpState failOp(int value) { VH_failOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkStencilOpState passOp(int value) { VH_passOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkStencilOpState depthFailOp(int value) { VH_depthFailOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkStencilOpState compareOp(int value) { VH_compareOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkStencilOpState compareMask(int value) { VH_compareMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkStencilOpState writeMask(int value) { VH_writeMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkStencilOpState reference(int value) { VH_reference.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _failOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_failOp, index), LAYOUT_failOp); }
    public MemorySegment _failOp() { return _failOpAt(0L); }
    public VkStencilOpState _failOpAt(long index, MemorySegment src) { _failOpAt(index).copyFrom(src); return this; }
    public VkStencilOpState _failOp(MemorySegment src) { return _failOpAt(0L, src); }
    public MemorySegment _passOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_passOp, index), LAYOUT_passOp); }
    public MemorySegment _passOp() { return _passOpAt(0L); }
    public VkStencilOpState _passOpAt(long index, MemorySegment src) { _passOpAt(index).copyFrom(src); return this; }
    public VkStencilOpState _passOp(MemorySegment src) { return _passOpAt(0L, src); }
    public MemorySegment _depthFailOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthFailOp, index), LAYOUT_depthFailOp); }
    public MemorySegment _depthFailOp() { return _depthFailOpAt(0L); }
    public VkStencilOpState _depthFailOpAt(long index, MemorySegment src) { _depthFailOpAt(index).copyFrom(src); return this; }
    public VkStencilOpState _depthFailOp(MemorySegment src) { return _depthFailOpAt(0L, src); }
    public MemorySegment _compareOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compareOp, index), LAYOUT_compareOp); }
    public MemorySegment _compareOp() { return _compareOpAt(0L); }
    public VkStencilOpState _compareOpAt(long index, MemorySegment src) { _compareOpAt(index).copyFrom(src); return this; }
    public VkStencilOpState _compareOp(MemorySegment src) { return _compareOpAt(0L, src); }
    public MemorySegment _compareMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compareMask, index), LAYOUT_compareMask); }
    public MemorySegment _compareMask() { return _compareMaskAt(0L); }
    public VkStencilOpState _compareMaskAt(long index, MemorySegment src) { _compareMaskAt(index).copyFrom(src); return this; }
    public VkStencilOpState _compareMask(MemorySegment src) { return _compareMaskAt(0L, src); }
    public MemorySegment _writeMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_writeMask, index), LAYOUT_writeMask); }
    public MemorySegment _writeMask() { return _writeMaskAt(0L); }
    public VkStencilOpState _writeMaskAt(long index, MemorySegment src) { _writeMaskAt(index).copyFrom(src); return this; }
    public VkStencilOpState _writeMask(MemorySegment src) { return _writeMaskAt(0L, src); }
    public MemorySegment _referenceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_reference, index), LAYOUT_reference); }
    public MemorySegment _reference() { return _referenceAt(0L); }
    public VkStencilOpState _referenceAt(long index, MemorySegment src) { _referenceAt(index).copyFrom(src); return this; }
    public VkStencilOpState _reference(MemorySegment src) { return _referenceAt(0L, src); }
}
