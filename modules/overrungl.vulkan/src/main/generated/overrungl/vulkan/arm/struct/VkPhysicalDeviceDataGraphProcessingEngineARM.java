// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDataGraphProcessingEngineARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDataGraphProcessingEngineARM {
///     VkPhysicalDeviceDataGraphProcessingEngineTypeARM type;
///     VkBool32 isForeign;
/// }
/// ```
public final class VkPhysicalDeviceDataGraphProcessingEngineARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("isForeign")
    );
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_isForeign = LAYOUT.byteOffset(PathElement.groupElement("isForeign"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_isForeign = LAYOUT.select(PathElement.groupElement("isForeign"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_isForeign = LAYOUT.arrayElementVarHandle(PathElement.groupElement("isForeign"));

    public VkPhysicalDeviceDataGraphProcessingEngineARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDataGraphProcessingEngineARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphProcessingEngineARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDataGraphProcessingEngineARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphProcessingEngineARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDataGraphProcessingEngineARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphProcessingEngineARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDataGraphProcessingEngineARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDataGraphProcessingEngineARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDataGraphProcessingEngineARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDataGraphProcessingEngineARM(allocator.allocate(LAYOUT, count), count); }
    public VkPhysicalDeviceDataGraphProcessingEngineARM copyFrom(VkPhysicalDeviceDataGraphProcessingEngineARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDataGraphProcessingEngineARM reinterpret(long count) { return new VkPhysicalDeviceDataGraphProcessingEngineARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDataGraphProcessingEngineARM asSlice(long index) { return new VkPhysicalDeviceDataGraphProcessingEngineARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDataGraphProcessingEngineARM asSlice(long index, long count) { return new VkPhysicalDeviceDataGraphProcessingEngineARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDataGraphProcessingEngineARM at(long index, Consumer<VkPhysicalDeviceDataGraphProcessingEngineARM> func) { func.accept(asSlice(index)); return this; }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public int isForeignAt(long index) { return (int) VH_isForeign.get(this.segment(), 0L, index); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public int isForeign() { return (int) VH_isForeign.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDataGraphProcessingEngineARM typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDataGraphProcessingEngineARM isForeignAt(long index, int value) { VH_isForeign.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDataGraphProcessingEngineARM type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDataGraphProcessingEngineARM isForeign(int value) { VH_isForeign.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkPhysicalDeviceDataGraphProcessingEngineARM _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDataGraphProcessingEngineARM _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _isForeignAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_isForeign, index), LAYOUT_isForeign); }
    public MemorySegment _isForeign() { return _isForeignAt(0L); }
    public VkPhysicalDeviceDataGraphProcessingEngineARM _isForeignAt(long index, MemorySegment src) { _isForeignAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDataGraphProcessingEngineARM _isForeign(MemorySegment src) { return _isForeignAt(0L, src); }
}
