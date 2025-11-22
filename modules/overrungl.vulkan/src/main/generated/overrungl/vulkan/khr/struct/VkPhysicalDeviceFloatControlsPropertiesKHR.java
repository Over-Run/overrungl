// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFloatControlsPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFloatControlsPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkShaderFloatControlsIndependence denormBehaviorIndependence;
///     VkShaderFloatControlsIndependence roundingModeIndependence;
///     VkBool32 shaderSignedZeroInfNanPreserveFloat16;
///     VkBool32 shaderSignedZeroInfNanPreserveFloat32;
///     VkBool32 shaderSignedZeroInfNanPreserveFloat64;
///     VkBool32 shaderDenormPreserveFloat16;
///     VkBool32 shaderDenormPreserveFloat32;
///     VkBool32 shaderDenormPreserveFloat64;
///     VkBool32 shaderDenormFlushToZeroFloat16;
///     VkBool32 shaderDenormFlushToZeroFloat32;
///     VkBool32 shaderDenormFlushToZeroFloat64;
///     VkBool32 shaderRoundingModeRTEFloat16;
///     VkBool32 shaderRoundingModeRTEFloat32;
///     VkBool32 shaderRoundingModeRTEFloat64;
///     VkBool32 shaderRoundingModeRTZFloat16;
///     VkBool32 shaderRoundingModeRTZFloat32;
///     VkBool32 shaderRoundingModeRTZFloat64;
/// }
/// ```
public final class VkPhysicalDeviceFloatControlsPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("denormBehaviorIndependence"),
        ValueLayout.JAVA_INT.withName("roundingModeIndependence"),
        ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat16"),
        ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat32"),
        ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat64"),
        ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat16"),
        ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat32"),
        ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat64"),
        ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat16"),
        ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat32"),
        ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat64"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat16"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat32"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat64"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat16"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat32"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat64")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_denormBehaviorIndependence = LAYOUT.byteOffset(PathElement.groupElement("denormBehaviorIndependence"));
    public static final long OFFSET_roundingModeIndependence = LAYOUT.byteOffset(PathElement.groupElement("roundingModeIndependence"));
    public static final long OFFSET_shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
    public static final long OFFSET_shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
    public static final long OFFSET_shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
    public static final long OFFSET_shaderDenormPreserveFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat16"));
    public static final long OFFSET_shaderDenormPreserveFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat32"));
    public static final long OFFSET_shaderDenormPreserveFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat64"));
    public static final long OFFSET_shaderDenormFlushToZeroFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
    public static final long OFFSET_shaderDenormFlushToZeroFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
    public static final long OFFSET_shaderDenormFlushToZeroFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
    public static final long OFFSET_shaderRoundingModeRTEFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
    public static final long OFFSET_shaderRoundingModeRTEFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
    public static final long OFFSET_shaderRoundingModeRTEFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
    public static final long OFFSET_shaderRoundingModeRTZFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
    public static final long OFFSET_shaderRoundingModeRTZFloat32 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
    public static final long OFFSET_shaderRoundingModeRTZFloat64 = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat64"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_denormBehaviorIndependence = LAYOUT.select(PathElement.groupElement("denormBehaviorIndependence"));
    public static final MemoryLayout LAYOUT_roundingModeIndependence = LAYOUT.select(PathElement.groupElement("roundingModeIndependence"));
    public static final MemoryLayout LAYOUT_shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.select(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
    public static final MemoryLayout LAYOUT_shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.select(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
    public static final MemoryLayout LAYOUT_shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.select(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
    public static final MemoryLayout LAYOUT_shaderDenormPreserveFloat16 = LAYOUT.select(PathElement.groupElement("shaderDenormPreserveFloat16"));
    public static final MemoryLayout LAYOUT_shaderDenormPreserveFloat32 = LAYOUT.select(PathElement.groupElement("shaderDenormPreserveFloat32"));
    public static final MemoryLayout LAYOUT_shaderDenormPreserveFloat64 = LAYOUT.select(PathElement.groupElement("shaderDenormPreserveFloat64"));
    public static final MemoryLayout LAYOUT_shaderDenormFlushToZeroFloat16 = LAYOUT.select(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
    public static final MemoryLayout LAYOUT_shaderDenormFlushToZeroFloat32 = LAYOUT.select(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
    public static final MemoryLayout LAYOUT_shaderDenormFlushToZeroFloat64 = LAYOUT.select(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTEFloat16 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTEFloat32 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTEFloat64 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTZFloat16 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTZFloat32 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
    public static final MemoryLayout LAYOUT_shaderRoundingModeRTZFloat64 = LAYOUT.select(PathElement.groupElement("shaderRoundingModeRTZFloat64"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_denormBehaviorIndependence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("denormBehaviorIndependence"));
    public static final VarHandle VH_roundingModeIndependence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("roundingModeIndependence"));
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
    public static final VarHandle VH_shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
    public static final VarHandle VH_shaderDenormPreserveFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat16"));
    public static final VarHandle VH_shaderDenormPreserveFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat32"));
    public static final VarHandle VH_shaderDenormPreserveFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormPreserveFloat64"));
    public static final VarHandle VH_shaderDenormFlushToZeroFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
    public static final VarHandle VH_shaderDenormFlushToZeroFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
    public static final VarHandle VH_shaderDenormFlushToZeroFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
    public static final VarHandle VH_shaderRoundingModeRTEFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
    public static final VarHandle VH_shaderRoundingModeRTEFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
    public static final VarHandle VH_shaderRoundingModeRTEFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
    public static final VarHandle VH_shaderRoundingModeRTZFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
    public static final VarHandle VH_shaderRoundingModeRTZFloat32 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
    public static final VarHandle VH_shaderRoundingModeRTZFloat64 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRoundingModeRTZFloat64"));

    public VkPhysicalDeviceFloatControlsPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFloatControlsPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFloatControlsPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFloatControlsPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFloatControlsPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFloatControlsPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFloatControlsPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFloatControlsPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFloatControlsPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFloatControlsPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFloatControlsPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFloatControlsPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES); }
    public static VkPhysicalDeviceFloatControlsPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceFloatControlsPropertiesKHR copyFrom(VkPhysicalDeviceFloatControlsPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceFloatControlsPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceFloatControlsPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceFloatControlsPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR at(long index, Consumer<VkPhysicalDeviceFloatControlsPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int denormBehaviorIndependenceAt(long index) { return (int) VH_denormBehaviorIndependence.get(this.segment(), 0L, index); }
    public int roundingModeIndependenceAt(long index) { return (int) VH_roundingModeIndependence.get(this.segment(), 0L, index); }
    public int shaderSignedZeroInfNanPreserveFloat16At(long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat16.get(this.segment(), 0L, index); }
    public int shaderSignedZeroInfNanPreserveFloat32At(long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat32.get(this.segment(), 0L, index); }
    public int shaderSignedZeroInfNanPreserveFloat64At(long index) { return (int) VH_shaderSignedZeroInfNanPreserveFloat64.get(this.segment(), 0L, index); }
    public int shaderDenormPreserveFloat16At(long index) { return (int) VH_shaderDenormPreserveFloat16.get(this.segment(), 0L, index); }
    public int shaderDenormPreserveFloat32At(long index) { return (int) VH_shaderDenormPreserveFloat32.get(this.segment(), 0L, index); }
    public int shaderDenormPreserveFloat64At(long index) { return (int) VH_shaderDenormPreserveFloat64.get(this.segment(), 0L, index); }
    public int shaderDenormFlushToZeroFloat16At(long index) { return (int) VH_shaderDenormFlushToZeroFloat16.get(this.segment(), 0L, index); }
    public int shaderDenormFlushToZeroFloat32At(long index) { return (int) VH_shaderDenormFlushToZeroFloat32.get(this.segment(), 0L, index); }
    public int shaderDenormFlushToZeroFloat64At(long index) { return (int) VH_shaderDenormFlushToZeroFloat64.get(this.segment(), 0L, index); }
    public int shaderRoundingModeRTEFloat16At(long index) { return (int) VH_shaderRoundingModeRTEFloat16.get(this.segment(), 0L, index); }
    public int shaderRoundingModeRTEFloat32At(long index) { return (int) VH_shaderRoundingModeRTEFloat32.get(this.segment(), 0L, index); }
    public int shaderRoundingModeRTEFloat64At(long index) { return (int) VH_shaderRoundingModeRTEFloat64.get(this.segment(), 0L, index); }
    public int shaderRoundingModeRTZFloat16At(long index) { return (int) VH_shaderRoundingModeRTZFloat16.get(this.segment(), 0L, index); }
    public int shaderRoundingModeRTZFloat32At(long index) { return (int) VH_shaderRoundingModeRTZFloat32.get(this.segment(), 0L, index); }
    public int shaderRoundingModeRTZFloat64At(long index) { return (int) VH_shaderRoundingModeRTZFloat64.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int denormBehaviorIndependence() { return (int) VH_denormBehaviorIndependence.get(this.segment(), 0L, 0L); }
    public int roundingModeIndependence() { return (int) VH_roundingModeIndependence.get(this.segment(), 0L, 0L); }
    public int shaderSignedZeroInfNanPreserveFloat16() { return (int) VH_shaderSignedZeroInfNanPreserveFloat16.get(this.segment(), 0L, 0L); }
    public int shaderSignedZeroInfNanPreserveFloat32() { return (int) VH_shaderSignedZeroInfNanPreserveFloat32.get(this.segment(), 0L, 0L); }
    public int shaderSignedZeroInfNanPreserveFloat64() { return (int) VH_shaderSignedZeroInfNanPreserveFloat64.get(this.segment(), 0L, 0L); }
    public int shaderDenormPreserveFloat16() { return (int) VH_shaderDenormPreserveFloat16.get(this.segment(), 0L, 0L); }
    public int shaderDenormPreserveFloat32() { return (int) VH_shaderDenormPreserveFloat32.get(this.segment(), 0L, 0L); }
    public int shaderDenormPreserveFloat64() { return (int) VH_shaderDenormPreserveFloat64.get(this.segment(), 0L, 0L); }
    public int shaderDenormFlushToZeroFloat16() { return (int) VH_shaderDenormFlushToZeroFloat16.get(this.segment(), 0L, 0L); }
    public int shaderDenormFlushToZeroFloat32() { return (int) VH_shaderDenormFlushToZeroFloat32.get(this.segment(), 0L, 0L); }
    public int shaderDenormFlushToZeroFloat64() { return (int) VH_shaderDenormFlushToZeroFloat64.get(this.segment(), 0L, 0L); }
    public int shaderRoundingModeRTEFloat16() { return (int) VH_shaderRoundingModeRTEFloat16.get(this.segment(), 0L, 0L); }
    public int shaderRoundingModeRTEFloat32() { return (int) VH_shaderRoundingModeRTEFloat32.get(this.segment(), 0L, 0L); }
    public int shaderRoundingModeRTEFloat64() { return (int) VH_shaderRoundingModeRTEFloat64.get(this.segment(), 0L, 0L); }
    public int shaderRoundingModeRTZFloat16() { return (int) VH_shaderRoundingModeRTZFloat16.get(this.segment(), 0L, 0L); }
    public int shaderRoundingModeRTZFloat32() { return (int) VH_shaderRoundingModeRTZFloat32.get(this.segment(), 0L, 0L); }
    public int shaderRoundingModeRTZFloat64() { return (int) VH_shaderRoundingModeRTZFloat64.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR denormBehaviorIndependenceAt(long index, int value) { VH_denormBehaviorIndependence.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR roundingModeIndependenceAt(long index, int value) { VH_roundingModeIndependence.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderSignedZeroInfNanPreserveFloat16At(long index, int value) { VH_shaderSignedZeroInfNanPreserveFloat16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderSignedZeroInfNanPreserveFloat32At(long index, int value) { VH_shaderSignedZeroInfNanPreserveFloat32.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderSignedZeroInfNanPreserveFloat64At(long index, int value) { VH_shaderSignedZeroInfNanPreserveFloat64.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormPreserveFloat16At(long index, int value) { VH_shaderDenormPreserveFloat16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormPreserveFloat32At(long index, int value) { VH_shaderDenormPreserveFloat32.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormPreserveFloat64At(long index, int value) { VH_shaderDenormPreserveFloat64.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormFlushToZeroFloat16At(long index, int value) { VH_shaderDenormFlushToZeroFloat16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormFlushToZeroFloat32At(long index, int value) { VH_shaderDenormFlushToZeroFloat32.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormFlushToZeroFloat64At(long index, int value) { VH_shaderDenormFlushToZeroFloat64.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTEFloat16At(long index, int value) { VH_shaderRoundingModeRTEFloat16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTEFloat32At(long index, int value) { VH_shaderRoundingModeRTEFloat32.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTEFloat64At(long index, int value) { VH_shaderRoundingModeRTEFloat64.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTZFloat16At(long index, int value) { VH_shaderRoundingModeRTZFloat16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTZFloat32At(long index, int value) { VH_shaderRoundingModeRTZFloat32.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTZFloat64At(long index, int value) { VH_shaderRoundingModeRTZFloat64.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR denormBehaviorIndependence(int value) { VH_denormBehaviorIndependence.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR roundingModeIndependence(int value) { VH_roundingModeIndependence.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderSignedZeroInfNanPreserveFloat16(int value) { VH_shaderSignedZeroInfNanPreserveFloat16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderSignedZeroInfNanPreserveFloat32(int value) { VH_shaderSignedZeroInfNanPreserveFloat32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderSignedZeroInfNanPreserveFloat64(int value) { VH_shaderSignedZeroInfNanPreserveFloat64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormPreserveFloat16(int value) { VH_shaderDenormPreserveFloat16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormPreserveFloat32(int value) { VH_shaderDenormPreserveFloat32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormPreserveFloat64(int value) { VH_shaderDenormPreserveFloat64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormFlushToZeroFloat16(int value) { VH_shaderDenormFlushToZeroFloat16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormFlushToZeroFloat32(int value) { VH_shaderDenormFlushToZeroFloat32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormFlushToZeroFloat64(int value) { VH_shaderDenormFlushToZeroFloat64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTEFloat16(int value) { VH_shaderRoundingModeRTEFloat16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTEFloat32(int value) { VH_shaderRoundingModeRTEFloat32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTEFloat64(int value) { VH_shaderRoundingModeRTEFloat64.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTZFloat16(int value) { VH_shaderRoundingModeRTZFloat16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTZFloat32(int value) { VH_shaderRoundingModeRTZFloat32.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTZFloat64(int value) { VH_shaderRoundingModeRTZFloat64.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _denormBehaviorIndependenceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_denormBehaviorIndependence, index), LAYOUT_denormBehaviorIndependence); }
    public MemorySegment _denormBehaviorIndependence() { return _denormBehaviorIndependenceAt(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _denormBehaviorIndependenceAt(long index, MemorySegment src) { _denormBehaviorIndependenceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _denormBehaviorIndependence(MemorySegment src) { return _denormBehaviorIndependenceAt(0L, src); }
    public MemorySegment _roundingModeIndependenceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_roundingModeIndependence, index), LAYOUT_roundingModeIndependence); }
    public MemorySegment _roundingModeIndependence() { return _roundingModeIndependenceAt(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _roundingModeIndependenceAt(long index, MemorySegment src) { _roundingModeIndependenceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _roundingModeIndependence(MemorySegment src) { return _roundingModeIndependenceAt(0L, src); }
    public MemorySegment _shaderSignedZeroInfNanPreserveFloat16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSignedZeroInfNanPreserveFloat16, index), LAYOUT_shaderSignedZeroInfNanPreserveFloat16); }
    public MemorySegment _shaderSignedZeroInfNanPreserveFloat16() { return _shaderSignedZeroInfNanPreserveFloat16At(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderSignedZeroInfNanPreserveFloat16At(long index, MemorySegment src) { _shaderSignedZeroInfNanPreserveFloat16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderSignedZeroInfNanPreserveFloat16(MemorySegment src) { return _shaderSignedZeroInfNanPreserveFloat16At(0L, src); }
    public MemorySegment _shaderSignedZeroInfNanPreserveFloat32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSignedZeroInfNanPreserveFloat32, index), LAYOUT_shaderSignedZeroInfNanPreserveFloat32); }
    public MemorySegment _shaderSignedZeroInfNanPreserveFloat32() { return _shaderSignedZeroInfNanPreserveFloat32At(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderSignedZeroInfNanPreserveFloat32At(long index, MemorySegment src) { _shaderSignedZeroInfNanPreserveFloat32At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderSignedZeroInfNanPreserveFloat32(MemorySegment src) { return _shaderSignedZeroInfNanPreserveFloat32At(0L, src); }
    public MemorySegment _shaderSignedZeroInfNanPreserveFloat64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSignedZeroInfNanPreserveFloat64, index), LAYOUT_shaderSignedZeroInfNanPreserveFloat64); }
    public MemorySegment _shaderSignedZeroInfNanPreserveFloat64() { return _shaderSignedZeroInfNanPreserveFloat64At(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderSignedZeroInfNanPreserveFloat64At(long index, MemorySegment src) { _shaderSignedZeroInfNanPreserveFloat64At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderSignedZeroInfNanPreserveFloat64(MemorySegment src) { return _shaderSignedZeroInfNanPreserveFloat64At(0L, src); }
    public MemorySegment _shaderDenormPreserveFloat16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDenormPreserveFloat16, index), LAYOUT_shaderDenormPreserveFloat16); }
    public MemorySegment _shaderDenormPreserveFloat16() { return _shaderDenormPreserveFloat16At(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderDenormPreserveFloat16At(long index, MemorySegment src) { _shaderDenormPreserveFloat16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderDenormPreserveFloat16(MemorySegment src) { return _shaderDenormPreserveFloat16At(0L, src); }
    public MemorySegment _shaderDenormPreserveFloat32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDenormPreserveFloat32, index), LAYOUT_shaderDenormPreserveFloat32); }
    public MemorySegment _shaderDenormPreserveFloat32() { return _shaderDenormPreserveFloat32At(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderDenormPreserveFloat32At(long index, MemorySegment src) { _shaderDenormPreserveFloat32At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderDenormPreserveFloat32(MemorySegment src) { return _shaderDenormPreserveFloat32At(0L, src); }
    public MemorySegment _shaderDenormPreserveFloat64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDenormPreserveFloat64, index), LAYOUT_shaderDenormPreserveFloat64); }
    public MemorySegment _shaderDenormPreserveFloat64() { return _shaderDenormPreserveFloat64At(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderDenormPreserveFloat64At(long index, MemorySegment src) { _shaderDenormPreserveFloat64At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderDenormPreserveFloat64(MemorySegment src) { return _shaderDenormPreserveFloat64At(0L, src); }
    public MemorySegment _shaderDenormFlushToZeroFloat16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDenormFlushToZeroFloat16, index), LAYOUT_shaderDenormFlushToZeroFloat16); }
    public MemorySegment _shaderDenormFlushToZeroFloat16() { return _shaderDenormFlushToZeroFloat16At(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderDenormFlushToZeroFloat16At(long index, MemorySegment src) { _shaderDenormFlushToZeroFloat16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderDenormFlushToZeroFloat16(MemorySegment src) { return _shaderDenormFlushToZeroFloat16At(0L, src); }
    public MemorySegment _shaderDenormFlushToZeroFloat32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDenormFlushToZeroFloat32, index), LAYOUT_shaderDenormFlushToZeroFloat32); }
    public MemorySegment _shaderDenormFlushToZeroFloat32() { return _shaderDenormFlushToZeroFloat32At(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderDenormFlushToZeroFloat32At(long index, MemorySegment src) { _shaderDenormFlushToZeroFloat32At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderDenormFlushToZeroFloat32(MemorySegment src) { return _shaderDenormFlushToZeroFloat32At(0L, src); }
    public MemorySegment _shaderDenormFlushToZeroFloat64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDenormFlushToZeroFloat64, index), LAYOUT_shaderDenormFlushToZeroFloat64); }
    public MemorySegment _shaderDenormFlushToZeroFloat64() { return _shaderDenormFlushToZeroFloat64At(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderDenormFlushToZeroFloat64At(long index, MemorySegment src) { _shaderDenormFlushToZeroFloat64At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderDenormFlushToZeroFloat64(MemorySegment src) { return _shaderDenormFlushToZeroFloat64At(0L, src); }
    public MemorySegment _shaderRoundingModeRTEFloat16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderRoundingModeRTEFloat16, index), LAYOUT_shaderRoundingModeRTEFloat16); }
    public MemorySegment _shaderRoundingModeRTEFloat16() { return _shaderRoundingModeRTEFloat16At(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderRoundingModeRTEFloat16At(long index, MemorySegment src) { _shaderRoundingModeRTEFloat16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderRoundingModeRTEFloat16(MemorySegment src) { return _shaderRoundingModeRTEFloat16At(0L, src); }
    public MemorySegment _shaderRoundingModeRTEFloat32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderRoundingModeRTEFloat32, index), LAYOUT_shaderRoundingModeRTEFloat32); }
    public MemorySegment _shaderRoundingModeRTEFloat32() { return _shaderRoundingModeRTEFloat32At(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderRoundingModeRTEFloat32At(long index, MemorySegment src) { _shaderRoundingModeRTEFloat32At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderRoundingModeRTEFloat32(MemorySegment src) { return _shaderRoundingModeRTEFloat32At(0L, src); }
    public MemorySegment _shaderRoundingModeRTEFloat64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderRoundingModeRTEFloat64, index), LAYOUT_shaderRoundingModeRTEFloat64); }
    public MemorySegment _shaderRoundingModeRTEFloat64() { return _shaderRoundingModeRTEFloat64At(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderRoundingModeRTEFloat64At(long index, MemorySegment src) { _shaderRoundingModeRTEFloat64At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderRoundingModeRTEFloat64(MemorySegment src) { return _shaderRoundingModeRTEFloat64At(0L, src); }
    public MemorySegment _shaderRoundingModeRTZFloat16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderRoundingModeRTZFloat16, index), LAYOUT_shaderRoundingModeRTZFloat16); }
    public MemorySegment _shaderRoundingModeRTZFloat16() { return _shaderRoundingModeRTZFloat16At(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderRoundingModeRTZFloat16At(long index, MemorySegment src) { _shaderRoundingModeRTZFloat16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderRoundingModeRTZFloat16(MemorySegment src) { return _shaderRoundingModeRTZFloat16At(0L, src); }
    public MemorySegment _shaderRoundingModeRTZFloat32At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderRoundingModeRTZFloat32, index), LAYOUT_shaderRoundingModeRTZFloat32); }
    public MemorySegment _shaderRoundingModeRTZFloat32() { return _shaderRoundingModeRTZFloat32At(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderRoundingModeRTZFloat32At(long index, MemorySegment src) { _shaderRoundingModeRTZFloat32At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderRoundingModeRTZFloat32(MemorySegment src) { return _shaderRoundingModeRTZFloat32At(0L, src); }
    public MemorySegment _shaderRoundingModeRTZFloat64At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderRoundingModeRTZFloat64, index), LAYOUT_shaderRoundingModeRTZFloat64); }
    public MemorySegment _shaderRoundingModeRTZFloat64() { return _shaderRoundingModeRTZFloat64At(0L); }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderRoundingModeRTZFloat64At(long index, MemorySegment src) { _shaderRoundingModeRTZFloat64At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFloatControlsPropertiesKHR _shaderRoundingModeRTZFloat64(MemorySegment src) { return _shaderRoundingModeRTZFloat64At(0L, src); }
}
