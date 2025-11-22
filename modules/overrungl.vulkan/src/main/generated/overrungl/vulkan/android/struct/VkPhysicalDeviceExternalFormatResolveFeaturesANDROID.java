// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.android.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExternalFormatResolveFeaturesANDROID`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExternalFormatResolveFeaturesANDROID {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 externalFormatResolve;
/// }
/// ```
public final class VkPhysicalDeviceExternalFormatResolveFeaturesANDROID extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("externalFormatResolve")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_externalFormatResolve = LAYOUT.byteOffset(PathElement.groupElement("externalFormatResolve"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_externalFormatResolve = LAYOUT.select(PathElement.groupElement("externalFormatResolve"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_externalFormatResolve = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormatResolve"));

    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.android.VKANDROIDExternalFormatResolve.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_FEATURES_ANDROID); }
    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.android.VKANDROIDExternalFormatResolve.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_FEATURES_ANDROID);
        return s;
    }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID copyFrom(VkPhysicalDeviceExternalFormatResolveFeaturesANDROID src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID reinterpret(long count) { return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID asSlice(long index) { return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID asSlice(long index, long count) { return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID at(long index, Consumer<VkPhysicalDeviceExternalFormatResolveFeaturesANDROID> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int externalFormatResolveAt(long index) { return (int) VH_externalFormatResolve.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int externalFormatResolve() { return (int) VH_externalFormatResolve.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID externalFormatResolveAt(long index, int value) { VH_externalFormatResolve.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID externalFormatResolve(int value) { VH_externalFormatResolve.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _externalFormatResolveAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalFormatResolve, index), LAYOUT_externalFormatResolve); }
    public MemorySegment _externalFormatResolve() { return _externalFormatResolveAt(0L); }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID _externalFormatResolveAt(long index, MemorySegment src) { _externalFormatResolveAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID _externalFormatResolve(MemorySegment src) { return _externalFormatResolveAt(0L, src); }
}
