// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayPowerInfoEXT`.
/// ## Layout
/// ```
/// struct VkDisplayPowerInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDisplayPowerStateEXT powerState;
/// }
/// ```
public final class VkDisplayPowerInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("powerState")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_powerState = LAYOUT.byteOffset(PathElement.groupElement("powerState"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_powerState = LAYOUT.select(PathElement.groupElement("powerState"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_powerState = LAYOUT.arrayElementVarHandle(PathElement.groupElement("powerState"));

    public VkDisplayPowerInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDisplayPowerInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPowerInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDisplayPowerInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPowerInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDisplayPowerInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPowerInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDisplayPowerInfoEXT alloc(SegmentAllocator allocator) { return new VkDisplayPowerInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDisplayPowerInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDisplayPowerInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDisplayPowerInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDisplayControl.VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT); }
    public static VkDisplayPowerInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDisplayControl.VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT);
        return s;
    }
    public VkDisplayPowerInfoEXT copyFrom(VkDisplayPowerInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDisplayPowerInfoEXT reinterpret(long count) { return new VkDisplayPowerInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDisplayPowerInfoEXT asSlice(long index) { return new VkDisplayPowerInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDisplayPowerInfoEXT asSlice(long index, long count) { return new VkDisplayPowerInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDisplayPowerInfoEXT at(long index, Consumer<VkDisplayPowerInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int powerStateAt(long index) { return (int) VH_powerState.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int powerState() { return (int) VH_powerState.get(this.segment(), 0L, 0L); }
    public VkDisplayPowerInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPowerInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPowerInfoEXT powerStateAt(long index, int value) { VH_powerState.set(this.segment(), 0L, index, value); return this; }
    public VkDisplayPowerInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPowerInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDisplayPowerInfoEXT powerState(int value) { VH_powerState.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDisplayPowerInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDisplayPowerInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDisplayPowerInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDisplayPowerInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _powerStateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_powerState, index), LAYOUT_powerState); }
    public MemorySegment _powerState() { return _powerStateAt(0L); }
    public VkDisplayPowerInfoEXT _powerStateAt(long index, MemorySegment src) { _powerStateAt(index).copyFrom(src); return this; }
    public VkDisplayPowerInfoEXT _powerState(MemorySegment src) { return _powerStateAt(0L, src); }
}
