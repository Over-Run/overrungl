// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 representativeFragmentTest;
/// }
/// ```
public final class VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("representativeFragmentTest")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_representativeFragmentTest = LAYOUT.byteOffset(PathElement.groupElement("representativeFragmentTest"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_representativeFragmentTest = LAYOUT.select(PathElement.groupElement("representativeFragmentTest"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_representativeFragmentTest = LAYOUT.arrayElementVarHandle(PathElement.groupElement("representativeFragmentTest"));

    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRepresentativeFragmentTest.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV); }
    public static VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRepresentativeFragmentTest.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV copyFrom(VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV asSlice(long index) { return new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV at(long index, Consumer<VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int representativeFragmentTestAt(long index) { return (int) VH_representativeFragmentTest.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int representativeFragmentTest() { return (int) VH_representativeFragmentTest.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV representativeFragmentTestAt(long index, int value) { VH_representativeFragmentTest.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV representativeFragmentTest(int value) { VH_representativeFragmentTest.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _representativeFragmentTestAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_representativeFragmentTest, index), LAYOUT_representativeFragmentTest); }
    public MemorySegment _representativeFragmentTest() { return _representativeFragmentTestAt(0L); }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV _representativeFragmentTestAt(long index, MemorySegment src) { _representativeFragmentTestAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV _representativeFragmentTest(MemorySegment src) { return _representativeFragmentTestAt(0L, src); }
}
