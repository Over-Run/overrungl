// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderCorePropertiesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderCorePropertiesARM {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t pixelRate;
///     uint32_t texelRate;
///     uint32_t fmaRate;
/// }
/// ```
public final class VkPhysicalDeviceShaderCorePropertiesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pixelRate"),
        ValueLayout.JAVA_INT.withName("texelRate"),
        ValueLayout.JAVA_INT.withName("fmaRate")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pixelRate = LAYOUT.byteOffset(PathElement.groupElement("pixelRate"));
    public static final long OFFSET_texelRate = LAYOUT.byteOffset(PathElement.groupElement("texelRate"));
    public static final long OFFSET_fmaRate = LAYOUT.byteOffset(PathElement.groupElement("fmaRate"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pixelRate = LAYOUT.select(PathElement.groupElement("pixelRate"));
    public static final MemoryLayout LAYOUT_texelRate = LAYOUT.select(PathElement.groupElement("texelRate"));
    public static final MemoryLayout LAYOUT_fmaRate = LAYOUT.select(PathElement.groupElement("fmaRate"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pixelRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pixelRate"));
    public static final VarHandle VH_texelRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("texelRate"));
    public static final VarHandle VH_fmaRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fmaRate"));

    public VkPhysicalDeviceShaderCorePropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderCorePropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCorePropertiesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderCorePropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCorePropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderCorePropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCorePropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderCorePropertiesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderCorePropertiesARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderCorePropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderCorePropertiesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderCorePropertiesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMShaderCoreProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM); }
    public static VkPhysicalDeviceShaderCorePropertiesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMShaderCoreProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM);
        return s;
    }
    public VkPhysicalDeviceShaderCorePropertiesARM copyFrom(VkPhysicalDeviceShaderCorePropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderCorePropertiesARM reinterpret(long count) { return new VkPhysicalDeviceShaderCorePropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderCorePropertiesARM asSlice(long index) { return new VkPhysicalDeviceShaderCorePropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderCorePropertiesARM asSlice(long index, long count) { return new VkPhysicalDeviceShaderCorePropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderCorePropertiesARM at(long index, Consumer<VkPhysicalDeviceShaderCorePropertiesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pixelRateAt(long index) { return (int) VH_pixelRate.get(this.segment(), 0L, index); }
    public int texelRateAt(long index) { return (int) VH_texelRate.get(this.segment(), 0L, index); }
    public int fmaRateAt(long index) { return (int) VH_fmaRate.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pixelRate() { return (int) VH_pixelRate.get(this.segment(), 0L, 0L); }
    public int texelRate() { return (int) VH_texelRate.get(this.segment(), 0L, 0L); }
    public int fmaRate() { return (int) VH_fmaRate.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderCorePropertiesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesARM pixelRateAt(long index, int value) { VH_pixelRate.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesARM texelRateAt(long index, int value) { VH_texelRate.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesARM fmaRateAt(long index, int value) { VH_fmaRate.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesARM pixelRate(int value) { VH_pixelRate.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesARM texelRate(int value) { VH_texelRate.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCorePropertiesARM fmaRate(int value) { VH_fmaRate.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pixelRateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pixelRate, index), LAYOUT_pixelRate); }
    public MemorySegment _pixelRate() { return _pixelRateAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesARM _pixelRateAt(long index, MemorySegment src) { _pixelRateAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesARM _pixelRate(MemorySegment src) { return _pixelRateAt(0L, src); }
    public MemorySegment _texelRateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_texelRate, index), LAYOUT_texelRate); }
    public MemorySegment _texelRate() { return _texelRateAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesARM _texelRateAt(long index, MemorySegment src) { _texelRateAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesARM _texelRate(MemorySegment src) { return _texelRateAt(0L, src); }
    public MemorySegment _fmaRateAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fmaRate, index), LAYOUT_fmaRate); }
    public MemorySegment _fmaRate() { return _fmaRateAt(0L); }
    public VkPhysicalDeviceShaderCorePropertiesARM _fmaRateAt(long index, MemorySegment src) { _fmaRateAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCorePropertiesARM _fmaRate(MemorySegment src) { return _fmaRateAt(0L, src); }
}
