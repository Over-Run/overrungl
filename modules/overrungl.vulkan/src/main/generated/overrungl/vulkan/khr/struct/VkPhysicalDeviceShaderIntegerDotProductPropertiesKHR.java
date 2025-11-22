// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 integerDotProduct8BitUnsignedAccelerated;
///     VkBool32 integerDotProduct8BitSignedAccelerated;
///     VkBool32 integerDotProduct8BitMixedSignednessAccelerated;
///     VkBool32 integerDotProduct4x8BitPackedUnsignedAccelerated;
///     VkBool32 integerDotProduct4x8BitPackedSignedAccelerated;
///     VkBool32 integerDotProduct4x8BitPackedMixedSignednessAccelerated;
///     VkBool32 integerDotProduct16BitUnsignedAccelerated;
///     VkBool32 integerDotProduct16BitSignedAccelerated;
///     VkBool32 integerDotProduct16BitMixedSignednessAccelerated;
///     VkBool32 integerDotProduct32BitUnsignedAccelerated;
///     VkBool32 integerDotProduct32BitSignedAccelerated;
///     VkBool32 integerDotProduct32BitMixedSignednessAccelerated;
///     VkBool32 integerDotProduct64BitUnsignedAccelerated;
///     VkBool32 integerDotProduct64BitSignedAccelerated;
///     VkBool32 integerDotProduct64BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating8BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating8BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating16BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating16BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating32BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating32BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating64BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating64BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated;
/// }
/// ```
public final class VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_integerDotProduct8BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProduct8BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
    public static final long OFFSET_integerDotProduct8BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProduct4x8BitPackedUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
    public static final long OFFSET_integerDotProduct4x8BitPackedSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
    public static final long OFFSET_integerDotProduct4x8BitPackedMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProduct16BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProduct16BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
    public static final long OFFSET_integerDotProduct16BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProduct32BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProduct32BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
    public static final long OFFSET_integerDotProduct32BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProduct64BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProduct64BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
    public static final long OFFSET_integerDotProduct64BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating8BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating16BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating32BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating64BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_integerDotProduct8BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct8BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct8BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct4x8BitPackedUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct4x8BitPackedSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct4x8BitPackedMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct16BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct16BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct16BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct32BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct32BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct32BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct64BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct64BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct64BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating8BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating16BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating32BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating64BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_integerDotProduct8BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProduct8BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProduct8BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProduct4x8BitPackedUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProduct4x8BitPackedSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
    public static final VarHandle VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProduct16BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProduct16BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProduct16BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProduct32BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProduct32BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProduct32BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProduct64BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProduct64BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProduct64BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));

    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES); }
    public static VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR copyFrom(VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR at(long index, Consumer<VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int integerDotProduct8BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProduct8BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct8BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProduct8BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct8BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProduct8BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProduct4x8BitPackedUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct4x8BitPackedSignedAcceleratedAt(long index) { return (int) VH_integerDotProduct4x8BitPackedSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct16BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProduct16BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct16BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProduct16BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct16BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProduct16BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct32BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProduct32BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct32BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProduct32BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct32BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProduct32BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct64BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProduct64BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct64BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProduct64BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct64BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProduct64BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int integerDotProduct8BitUnsignedAccelerated() { return (int) VH_integerDotProduct8BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct8BitSignedAccelerated() { return (int) VH_integerDotProduct8BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct8BitMixedSignednessAccelerated() { return (int) VH_integerDotProduct8BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct4x8BitPackedUnsignedAccelerated() { return (int) VH_integerDotProduct4x8BitPackedUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct4x8BitPackedSignedAccelerated() { return (int) VH_integerDotProduct4x8BitPackedSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return (int) VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct16BitUnsignedAccelerated() { return (int) VH_integerDotProduct16BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct16BitSignedAccelerated() { return (int) VH_integerDotProduct16BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct16BitMixedSignednessAccelerated() { return (int) VH_integerDotProduct16BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct32BitUnsignedAccelerated() { return (int) VH_integerDotProduct32BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct32BitSignedAccelerated() { return (int) VH_integerDotProduct32BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct32BitMixedSignednessAccelerated() { return (int) VH_integerDotProduct32BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct64BitUnsignedAccelerated() { return (int) VH_integerDotProduct64BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct64BitSignedAccelerated() { return (int) VH_integerDotProduct64BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct64BitMixedSignednessAccelerated() { return (int) VH_integerDotProduct64BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct8BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProduct8BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct8BitSignedAcceleratedAt(long index, int value) { VH_integerDotProduct8BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct8BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProduct8BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index, int value) { VH_integerDotProduct4x8BitPackedUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct4x8BitPackedSignedAcceleratedAt(long index, int value) { VH_integerDotProduct4x8BitPackedSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct16BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProduct16BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct16BitSignedAcceleratedAt(long index, int value) { VH_integerDotProduct16BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct16BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProduct16BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct32BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProduct32BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct32BitSignedAcceleratedAt(long index, int value) { VH_integerDotProduct32BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct32BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProduct32BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct64BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProduct64BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct64BitSignedAcceleratedAt(long index, int value) { VH_integerDotProduct64BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct64BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProduct64BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct8BitUnsignedAccelerated(int value) { VH_integerDotProduct8BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct8BitSignedAccelerated(int value) { VH_integerDotProduct8BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct8BitMixedSignednessAccelerated(int value) { VH_integerDotProduct8BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct4x8BitPackedUnsignedAccelerated(int value) { VH_integerDotProduct4x8BitPackedUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct4x8BitPackedSignedAccelerated(int value) { VH_integerDotProduct4x8BitPackedSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct4x8BitPackedMixedSignednessAccelerated(int value) { VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct16BitUnsignedAccelerated(int value) { VH_integerDotProduct16BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct16BitSignedAccelerated(int value) { VH_integerDotProduct16BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct16BitMixedSignednessAccelerated(int value) { VH_integerDotProduct16BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct32BitUnsignedAccelerated(int value) { VH_integerDotProduct32BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct32BitSignedAccelerated(int value) { VH_integerDotProduct32BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct32BitMixedSignednessAccelerated(int value) { VH_integerDotProduct32BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct64BitUnsignedAccelerated(int value) { VH_integerDotProduct64BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct64BitSignedAccelerated(int value) { VH_integerDotProduct64BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProduct64BitMixedSignednessAccelerated(int value) { VH_integerDotProduct64BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating8BitSignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(int value) { VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating16BitSignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(int value) { VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating32BitSignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(int value) { VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating64BitSignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(int value) { VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _integerDotProduct8BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct8BitUnsignedAccelerated, index), LAYOUT_integerDotProduct8BitUnsignedAccelerated); }
    public MemorySegment _integerDotProduct8BitUnsignedAccelerated() { return _integerDotProduct8BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct8BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct8BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct8BitUnsignedAccelerated(MemorySegment src) { return _integerDotProduct8BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct8BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct8BitSignedAccelerated, index), LAYOUT_integerDotProduct8BitSignedAccelerated); }
    public MemorySegment _integerDotProduct8BitSignedAccelerated() { return _integerDotProduct8BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct8BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct8BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct8BitSignedAccelerated(MemorySegment src) { return _integerDotProduct8BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct8BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct8BitMixedSignednessAccelerated, index), LAYOUT_integerDotProduct8BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProduct8BitMixedSignednessAccelerated() { return _integerDotProduct8BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct8BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProduct8BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct8BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProduct8BitMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct4x8BitPackedUnsignedAccelerated, index), LAYOUT_integerDotProduct4x8BitPackedUnsignedAccelerated); }
    public MemorySegment _integerDotProduct4x8BitPackedUnsignedAccelerated() { return _integerDotProduct4x8BitPackedUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct4x8BitPackedUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct4x8BitPackedUnsignedAccelerated(MemorySegment src) { return _integerDotProduct4x8BitPackedUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct4x8BitPackedSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct4x8BitPackedSignedAccelerated, index), LAYOUT_integerDotProduct4x8BitPackedSignedAccelerated); }
    public MemorySegment _integerDotProduct4x8BitPackedSignedAccelerated() { return _integerDotProduct4x8BitPackedSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct4x8BitPackedSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct4x8BitPackedSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct4x8BitPackedSignedAccelerated(MemorySegment src) { return _integerDotProduct4x8BitPackedSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct4x8BitPackedMixedSignednessAccelerated, index), LAYOUT_integerDotProduct4x8BitPackedMixedSignednessAccelerated); }
    public MemorySegment _integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return _integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct4x8BitPackedMixedSignednessAccelerated(MemorySegment src) { return _integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct16BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct16BitUnsignedAccelerated, index), LAYOUT_integerDotProduct16BitUnsignedAccelerated); }
    public MemorySegment _integerDotProduct16BitUnsignedAccelerated() { return _integerDotProduct16BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct16BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct16BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct16BitUnsignedAccelerated(MemorySegment src) { return _integerDotProduct16BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct16BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct16BitSignedAccelerated, index), LAYOUT_integerDotProduct16BitSignedAccelerated); }
    public MemorySegment _integerDotProduct16BitSignedAccelerated() { return _integerDotProduct16BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct16BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct16BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct16BitSignedAccelerated(MemorySegment src) { return _integerDotProduct16BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct16BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct16BitMixedSignednessAccelerated, index), LAYOUT_integerDotProduct16BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProduct16BitMixedSignednessAccelerated() { return _integerDotProduct16BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct16BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProduct16BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct16BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProduct16BitMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct32BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct32BitUnsignedAccelerated, index), LAYOUT_integerDotProduct32BitUnsignedAccelerated); }
    public MemorySegment _integerDotProduct32BitUnsignedAccelerated() { return _integerDotProduct32BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct32BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct32BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct32BitUnsignedAccelerated(MemorySegment src) { return _integerDotProduct32BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct32BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct32BitSignedAccelerated, index), LAYOUT_integerDotProduct32BitSignedAccelerated); }
    public MemorySegment _integerDotProduct32BitSignedAccelerated() { return _integerDotProduct32BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct32BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct32BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct32BitSignedAccelerated(MemorySegment src) { return _integerDotProduct32BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct32BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct32BitMixedSignednessAccelerated, index), LAYOUT_integerDotProduct32BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProduct32BitMixedSignednessAccelerated() { return _integerDotProduct32BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct32BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProduct32BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct32BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProduct32BitMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct64BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct64BitUnsignedAccelerated, index), LAYOUT_integerDotProduct64BitUnsignedAccelerated); }
    public MemorySegment _integerDotProduct64BitUnsignedAccelerated() { return _integerDotProduct64BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct64BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct64BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct64BitUnsignedAccelerated(MemorySegment src) { return _integerDotProduct64BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct64BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct64BitSignedAccelerated, index), LAYOUT_integerDotProduct64BitSignedAccelerated); }
    public MemorySegment _integerDotProduct64BitSignedAccelerated() { return _integerDotProduct64BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct64BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct64BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct64BitSignedAccelerated(MemorySegment src) { return _integerDotProduct64BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct64BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct64BitMixedSignednessAccelerated, index), LAYOUT_integerDotProduct64BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProduct64BitMixedSignednessAccelerated() { return _integerDotProduct64BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct64BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProduct64BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProduct64BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProduct64BitMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return _integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating8BitSignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating8BitSignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return _integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating8BitSignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return _integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return _integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return _integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return _integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return _integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating16BitSignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating16BitSignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return _integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating16BitSignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return _integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return _integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating32BitSignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating32BitSignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return _integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating32BitSignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return _integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return _integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating64BitSignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating64BitSignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return _integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating64BitSignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return _integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR _integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(0L, src); }
}
