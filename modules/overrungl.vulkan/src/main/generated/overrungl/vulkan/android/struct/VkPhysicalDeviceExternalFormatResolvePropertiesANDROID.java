// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.android.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExternalFormatResolvePropertiesANDROID`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExternalFormatResolvePropertiesANDROID {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 nullColorAttachmentWithExternalFormatResolve;
///     VkChromaLocation externalFormatResolveChromaOffsetX;
///     VkChromaLocation externalFormatResolveChromaOffsetY;
/// }
/// ```
public final class VkPhysicalDeviceExternalFormatResolvePropertiesANDROID extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("nullColorAttachmentWithExternalFormatResolve"),
        ValueLayout.JAVA_INT.withName("externalFormatResolveChromaOffsetX"),
        ValueLayout.JAVA_INT.withName("externalFormatResolveChromaOffsetY")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_nullColorAttachmentWithExternalFormatResolve = LAYOUT.byteOffset(PathElement.groupElement("nullColorAttachmentWithExternalFormatResolve"));
    public static final long OFFSET_externalFormatResolveChromaOffsetX = LAYOUT.byteOffset(PathElement.groupElement("externalFormatResolveChromaOffsetX"));
    public static final long OFFSET_externalFormatResolveChromaOffsetY = LAYOUT.byteOffset(PathElement.groupElement("externalFormatResolveChromaOffsetY"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_nullColorAttachmentWithExternalFormatResolve = LAYOUT.select(PathElement.groupElement("nullColorAttachmentWithExternalFormatResolve"));
    public static final MemoryLayout LAYOUT_externalFormatResolveChromaOffsetX = LAYOUT.select(PathElement.groupElement("externalFormatResolveChromaOffsetX"));
    public static final MemoryLayout LAYOUT_externalFormatResolveChromaOffsetY = LAYOUT.select(PathElement.groupElement("externalFormatResolveChromaOffsetY"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_nullColorAttachmentWithExternalFormatResolve = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nullColorAttachmentWithExternalFormatResolve"));
    public static final VarHandle VH_externalFormatResolveChromaOffsetX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormatResolveChromaOffsetX"));
    public static final VarHandle VH_externalFormatResolveChromaOffsetY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormatResolveChromaOffsetY"));

    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.android.VKANDROIDExternalFormatResolve.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_PROPERTIES_ANDROID); }
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.android.VKANDROIDExternalFormatResolve.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_PROPERTIES_ANDROID);
        return s;
    }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID copyFrom(VkPhysicalDeviceExternalFormatResolvePropertiesANDROID src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID reinterpret(long count) { return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID asSlice(long index) { return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID asSlice(long index, long count) { return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID at(long index, Consumer<VkPhysicalDeviceExternalFormatResolvePropertiesANDROID> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int nullColorAttachmentWithExternalFormatResolveAt(long index) { return (int) VH_nullColorAttachmentWithExternalFormatResolve.get(this.segment(), 0L, index); }
    public int externalFormatResolveChromaOffsetXAt(long index) { return (int) VH_externalFormatResolveChromaOffsetX.get(this.segment(), 0L, index); }
    public int externalFormatResolveChromaOffsetYAt(long index) { return (int) VH_externalFormatResolveChromaOffsetY.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int nullColorAttachmentWithExternalFormatResolve() { return (int) VH_nullColorAttachmentWithExternalFormatResolve.get(this.segment(), 0L, 0L); }
    public int externalFormatResolveChromaOffsetX() { return (int) VH_externalFormatResolveChromaOffsetX.get(this.segment(), 0L, 0L); }
    public int externalFormatResolveChromaOffsetY() { return (int) VH_externalFormatResolveChromaOffsetY.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID nullColorAttachmentWithExternalFormatResolveAt(long index, int value) { VH_nullColorAttachmentWithExternalFormatResolve.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID externalFormatResolveChromaOffsetXAt(long index, int value) { VH_externalFormatResolveChromaOffsetX.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID externalFormatResolveChromaOffsetYAt(long index, int value) { VH_externalFormatResolveChromaOffsetY.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID nullColorAttachmentWithExternalFormatResolve(int value) { VH_nullColorAttachmentWithExternalFormatResolve.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID externalFormatResolveChromaOffsetX(int value) { VH_externalFormatResolveChromaOffsetX.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID externalFormatResolveChromaOffsetY(int value) { VH_externalFormatResolveChromaOffsetY.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _nullColorAttachmentWithExternalFormatResolveAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_nullColorAttachmentWithExternalFormatResolve, index), LAYOUT_nullColorAttachmentWithExternalFormatResolve); }
    public MemorySegment _nullColorAttachmentWithExternalFormatResolve() { return _nullColorAttachmentWithExternalFormatResolveAt(0L); }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID _nullColorAttachmentWithExternalFormatResolveAt(long index, MemorySegment src) { _nullColorAttachmentWithExternalFormatResolveAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID _nullColorAttachmentWithExternalFormatResolve(MemorySegment src) { return _nullColorAttachmentWithExternalFormatResolveAt(0L, src); }
    public MemorySegment _externalFormatResolveChromaOffsetXAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalFormatResolveChromaOffsetX, index), LAYOUT_externalFormatResolveChromaOffsetX); }
    public MemorySegment _externalFormatResolveChromaOffsetX() { return _externalFormatResolveChromaOffsetXAt(0L); }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID _externalFormatResolveChromaOffsetXAt(long index, MemorySegment src) { _externalFormatResolveChromaOffsetXAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID _externalFormatResolveChromaOffsetX(MemorySegment src) { return _externalFormatResolveChromaOffsetXAt(0L, src); }
    public MemorySegment _externalFormatResolveChromaOffsetYAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalFormatResolveChromaOffsetY, index), LAYOUT_externalFormatResolveChromaOffsetY); }
    public MemorySegment _externalFormatResolveChromaOffsetY() { return _externalFormatResolveChromaOffsetYAt(0L); }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID _externalFormatResolveChromaOffsetYAt(long index, MemorySegment src) { _externalFormatResolveChromaOffsetYAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID _externalFormatResolveChromaOffsetY(MemorySegment src) { return _externalFormatResolveChromaOffsetYAt(0L, src); }
}
