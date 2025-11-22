// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceASTCDecodeFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceASTCDecodeFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 decodeModeSharedExponent;
/// }
/// ```
public final class VkPhysicalDeviceASTCDecodeFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("decodeModeSharedExponent")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_decodeModeSharedExponent = LAYOUT.byteOffset(PathElement.groupElement("decodeModeSharedExponent"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_decodeModeSharedExponent = LAYOUT.select(PathElement.groupElement("decodeModeSharedExponent"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_decodeModeSharedExponent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("decodeModeSharedExponent"));

    public VkPhysicalDeviceASTCDecodeFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceASTCDecodeFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceASTCDecodeFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceASTCDecodeFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceASTCDecodeFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceASTCDecodeFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTAstcDecodeMode.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ASTC_DECODE_FEATURES_EXT); }
    public static VkPhysicalDeviceASTCDecodeFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTAstcDecodeMode.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ASTC_DECODE_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT copyFrom(VkPhysicalDeviceASTCDecodeFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceASTCDecodeFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceASTCDecodeFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceASTCDecodeFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT at(long index, Consumer<VkPhysicalDeviceASTCDecodeFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int decodeModeSharedExponentAt(long index) { return (int) VH_decodeModeSharedExponent.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int decodeModeSharedExponent() { return (int) VH_decodeModeSharedExponent.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT decodeModeSharedExponentAt(long index, int value) { VH_decodeModeSharedExponent.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT decodeModeSharedExponent(int value) { VH_decodeModeSharedExponent.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _decodeModeSharedExponentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_decodeModeSharedExponent, index), LAYOUT_decodeModeSharedExponent); }
    public MemorySegment _decodeModeSharedExponent() { return _decodeModeSharedExponentAt(0L); }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT _decodeModeSharedExponentAt(long index, MemorySegment src) { _decodeModeSharedExponentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceASTCDecodeFeaturesEXT _decodeModeSharedExponent(MemorySegment src) { return _decodeModeSharedExponentAt(0L, src); }
}
