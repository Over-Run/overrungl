// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDiagnosticsConfigFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDiagnosticsConfigFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 diagnosticsConfig;
/// }
/// ```
public final class VkPhysicalDeviceDiagnosticsConfigFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("diagnosticsConfig")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_diagnosticsConfig = LAYOUT.byteOffset(PathElement.groupElement("diagnosticsConfig"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_diagnosticsConfig = LAYOUT.select(PathElement.groupElement("diagnosticsConfig"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_diagnosticsConfig = LAYOUT.arrayElementVarHandle(PathElement.groupElement("diagnosticsConfig"));

    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDeviceDiagnosticsConfig.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV); }
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDeviceDiagnosticsConfig.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV copyFrom(VkPhysicalDeviceDiagnosticsConfigFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV asSlice(long index) { return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV at(long index, Consumer<VkPhysicalDeviceDiagnosticsConfigFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int diagnosticsConfigAt(long index) { return (int) VH_diagnosticsConfig.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int diagnosticsConfig() { return (int) VH_diagnosticsConfig.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV diagnosticsConfigAt(long index, int value) { VH_diagnosticsConfig.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV diagnosticsConfig(int value) { VH_diagnosticsConfig.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _diagnosticsConfigAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_diagnosticsConfig, index), LAYOUT_diagnosticsConfig); }
    public MemorySegment _diagnosticsConfig() { return _diagnosticsConfigAt(0L); }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV _diagnosticsConfigAt(long index, MemorySegment src) { _diagnosticsConfigAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV _diagnosticsConfig(MemorySegment src) { return _diagnosticsConfigAt(0L, src); }
}
