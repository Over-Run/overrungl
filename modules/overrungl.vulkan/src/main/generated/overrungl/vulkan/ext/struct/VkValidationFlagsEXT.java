// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkValidationFlagsEXT`.
/// ## Layout
/// ```
/// struct VkValidationFlagsEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t disabledValidationCheckCount;
///     const VkValidationCheckEXT* pDisabledValidationChecks;
/// }
/// ```
public final class VkValidationFlagsEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("disabledValidationCheckCount"),
        ValueLayout.ADDRESS.withName("pDisabledValidationChecks")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_disabledValidationCheckCount = LAYOUT.byteOffset(PathElement.groupElement("disabledValidationCheckCount"));
    public static final long OFFSET_pDisabledValidationChecks = LAYOUT.byteOffset(PathElement.groupElement("pDisabledValidationChecks"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_disabledValidationCheckCount = LAYOUT.select(PathElement.groupElement("disabledValidationCheckCount"));
    public static final MemoryLayout LAYOUT_pDisabledValidationChecks = LAYOUT.select(PathElement.groupElement("pDisabledValidationChecks"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_disabledValidationCheckCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("disabledValidationCheckCount"));
    public static final VarHandle VH_pDisabledValidationChecks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDisabledValidationChecks"));

    public VkValidationFlagsEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkValidationFlagsEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkValidationFlagsEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkValidationFlagsEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkValidationFlagsEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkValidationFlagsEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkValidationFlagsEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkValidationFlagsEXT alloc(SegmentAllocator allocator) { return new VkValidationFlagsEXT(allocator.allocate(LAYOUT), 1); }
    public static VkValidationFlagsEXT alloc(SegmentAllocator allocator, long count) { return new VkValidationFlagsEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkValidationFlagsEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTValidationFlags.VK_STRUCTURE_TYPE_VALIDATION_FLAGS_EXT); }
    public static VkValidationFlagsEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTValidationFlags.VK_STRUCTURE_TYPE_VALIDATION_FLAGS_EXT);
        return s;
    }
    public VkValidationFlagsEXT copyFrom(VkValidationFlagsEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkValidationFlagsEXT reinterpret(long count) { return new VkValidationFlagsEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkValidationFlagsEXT asSlice(long index) { return new VkValidationFlagsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkValidationFlagsEXT asSlice(long index, long count) { return new VkValidationFlagsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkValidationFlagsEXT at(long index, Consumer<VkValidationFlagsEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int disabledValidationCheckCountAt(long index) { return (int) VH_disabledValidationCheckCount.get(this.segment(), 0L, index); }
    public MemorySegment pDisabledValidationChecksAt(long index) { return (MemorySegment) VH_pDisabledValidationChecks.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int disabledValidationCheckCount() { return (int) VH_disabledValidationCheckCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDisabledValidationChecks() { return (MemorySegment) VH_pDisabledValidationChecks.get(this.segment(), 0L, 0L); }
    public VkValidationFlagsEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkValidationFlagsEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkValidationFlagsEXT disabledValidationCheckCountAt(long index, int value) { VH_disabledValidationCheckCount.set(this.segment(), 0L, index, value); return this; }
    public VkValidationFlagsEXT pDisabledValidationChecksAt(long index, MemorySegment value) { VH_pDisabledValidationChecks.set(this.segment(), 0L, index, value); return this; }
    public VkValidationFlagsEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkValidationFlagsEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkValidationFlagsEXT disabledValidationCheckCount(int value) { VH_disabledValidationCheckCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkValidationFlagsEXT pDisabledValidationChecks(MemorySegment value) { VH_pDisabledValidationChecks.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkValidationFlagsEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkValidationFlagsEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkValidationFlagsEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkValidationFlagsEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _disabledValidationCheckCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_disabledValidationCheckCount, index), LAYOUT_disabledValidationCheckCount); }
    public MemorySegment _disabledValidationCheckCount() { return _disabledValidationCheckCountAt(0L); }
    public VkValidationFlagsEXT _disabledValidationCheckCountAt(long index, MemorySegment src) { _disabledValidationCheckCountAt(index).copyFrom(src); return this; }
    public VkValidationFlagsEXT _disabledValidationCheckCount(MemorySegment src) { return _disabledValidationCheckCountAt(0L, src); }
    public MemorySegment _pDisabledValidationChecksAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDisabledValidationChecks, index), LAYOUT_pDisabledValidationChecks); }
    public MemorySegment _pDisabledValidationChecks() { return _pDisabledValidationChecksAt(0L); }
    public VkValidationFlagsEXT _pDisabledValidationChecksAt(long index, MemorySegment src) { _pDisabledValidationChecksAt(index).copyFrom(src); return this; }
    public VkValidationFlagsEXT _pDisabledValidationChecks(MemorySegment src) { return _pDisabledValidationChecksAt(0L, src); }
}
