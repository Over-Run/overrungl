// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderIntegerDotProductProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderIntegerDotProductProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 integerDotProduct8BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct8BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct8BitMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProduct4x8BitPackedUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct4x8BitPackedSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct4x8BitPackedMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProduct16BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct16BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct16BitMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProduct32BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct32BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct32BitMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProduct64BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct64BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct64BitMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating8BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating8BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating16BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating16BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating32BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating32BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating64BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating64BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated;
/// };
/// ```
public final class VkPhysicalDeviceShaderIntegerDotProductProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderIntegerDotProductProperties`.
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
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType")));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pNext = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext")));
    /// The byte offset of `integerDotProduct8BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProduct8BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProduct8BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct8BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct8BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct8BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProduct8BitSignedAccelerated`.
    public static final long OFFSET_integerDotProduct8BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
    /// The memory layout of `integerDotProduct8BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct8BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct8BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct8BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitSignedAccelerated")));
    /// The byte offset of `integerDotProduct8BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProduct8BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProduct8BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct8BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct8BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct8BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProduct4x8BitPackedUnsignedAccelerated`.
    public static final long OFFSET_integerDotProduct4x8BitPackedUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
    /// The memory layout of `integerDotProduct4x8BitPackedUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct4x8BitPackedUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct4x8BitPackedUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct4x8BitPackedUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated")));
    /// The byte offset of `integerDotProduct4x8BitPackedSignedAccelerated`.
    public static final long OFFSET_integerDotProduct4x8BitPackedSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
    /// The memory layout of `integerDotProduct4x8BitPackedSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct4x8BitPackedSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct4x8BitPackedSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct4x8BitPackedSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated")));
    /// The byte offset of `integerDotProduct4x8BitPackedMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProduct4x8BitPackedMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProduct4x8BitPackedMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct4x8BitPackedMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct4x8BitPackedMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProduct16BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProduct16BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProduct16BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct16BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct16BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct16BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProduct16BitSignedAccelerated`.
    public static final long OFFSET_integerDotProduct16BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
    /// The memory layout of `integerDotProduct16BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct16BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct16BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct16BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitSignedAccelerated")));
    /// The byte offset of `integerDotProduct16BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProduct16BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProduct16BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct16BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct16BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct16BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProduct32BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProduct32BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProduct32BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct32BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct32BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct32BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProduct32BitSignedAccelerated`.
    public static final long OFFSET_integerDotProduct32BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
    /// The memory layout of `integerDotProduct32BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct32BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct32BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct32BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitSignedAccelerated")));
    /// The byte offset of `integerDotProduct32BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProduct32BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProduct32BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct32BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct32BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct32BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProduct64BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProduct64BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProduct64BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct64BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct64BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct64BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProduct64BitSignedAccelerated`.
    public static final long OFFSET_integerDotProduct64BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
    /// The memory layout of `integerDotProduct64BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct64BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct64BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct64BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitSignedAccelerated")));
    /// The byte offset of `integerDotProduct64BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProduct64BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProduct64BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct64BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct64BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct64BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating8BitSignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating8BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating8BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating8BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating8BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating16BitSignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating16BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating16BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating16BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating16BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating32BitSignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating32BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating32BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating32BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating32BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating64BitSignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating64BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating64BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating64BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating64BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated")));

    /// Creates `VkPhysicalDeviceShaderIntegerDotProductProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderIntegerDotProductProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderIntegerDotProductProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderIntegerDotProductProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderIntegerDotProductProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderIntegerDotProductProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderIntegerDotProductProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderIntegerDotProductProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderIntegerDotProductProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderIntegerDotProductProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderIntegerDotProductProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderIntegerDotProductProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderIntegerDotProductProperties`
    public static VkPhysicalDeviceShaderIntegerDotProductProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderIntegerDotProductProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderIntegerDotProductProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderIntegerDotProductProperties`
    public static VkPhysicalDeviceShaderIntegerDotProductProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderIntegerDotProductProperties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties copyFrom(VkPhysicalDeviceShaderIntegerDotProductProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderIntegerDotProductProperties reinterpret(long count) { return new VkPhysicalDeviceShaderIntegerDotProductProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get().get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.get().set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get().get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.get().set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct8BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct8BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct8BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct8BitUnsignedAccelerated`}
    public int integerDotProduct8BitUnsignedAccelerated() { return integerDotProduct8BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct8BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct8BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct8BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct8BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct8BitUnsignedAccelerated(int value) { integerDotProduct8BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct8BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct8BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct8BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct8BitSignedAccelerated`}
    public int integerDotProduct8BitSignedAccelerated() { return integerDotProduct8BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct8BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct8BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct8BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct8BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct8BitSignedAccelerated(int value) { integerDotProduct8BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct8BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct8BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct8BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct8BitMixedSignednessAccelerated`}
    public int integerDotProduct8BitMixedSignednessAccelerated() { return integerDotProduct8BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct8BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct8BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct8BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct8BitMixedSignednessAccelerated(int value) { integerDotProduct8BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct4x8BitPackedUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct4x8BitPackedUnsignedAccelerated`}
    public int integerDotProduct4x8BitPackedUnsignedAccelerated() { return integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct4x8BitPackedUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct4x8BitPackedUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct4x8BitPackedUnsignedAccelerated(int value) { integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct4x8BitPackedSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct4x8BitPackedSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct4x8BitPackedSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct4x8BitPackedSignedAccelerated`}
    public int integerDotProduct4x8BitPackedSignedAccelerated() { return integerDotProduct4x8BitPackedSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct4x8BitPackedSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct4x8BitPackedSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct4x8BitPackedSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct4x8BitPackedSignedAccelerated(int value) { integerDotProduct4x8BitPackedSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct4x8BitPackedMixedSignednessAccelerated`}
    public int integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct4x8BitPackedMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct4x8BitPackedMixedSignednessAccelerated(int value) { integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct16BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct16BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct16BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct16BitUnsignedAccelerated`}
    public int integerDotProduct16BitUnsignedAccelerated() { return integerDotProduct16BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct16BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct16BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct16BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct16BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct16BitUnsignedAccelerated(int value) { integerDotProduct16BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct16BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct16BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct16BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct16BitSignedAccelerated`}
    public int integerDotProduct16BitSignedAccelerated() { return integerDotProduct16BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct16BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct16BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct16BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct16BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct16BitSignedAccelerated(int value) { integerDotProduct16BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct16BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct16BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct16BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct16BitMixedSignednessAccelerated`}
    public int integerDotProduct16BitMixedSignednessAccelerated() { return integerDotProduct16BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct16BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct16BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct16BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct16BitMixedSignednessAccelerated(int value) { integerDotProduct16BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct32BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct32BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct32BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct32BitUnsignedAccelerated`}
    public int integerDotProduct32BitUnsignedAccelerated() { return integerDotProduct32BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct32BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct32BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct32BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct32BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct32BitUnsignedAccelerated(int value) { integerDotProduct32BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct32BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct32BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct32BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct32BitSignedAccelerated`}
    public int integerDotProduct32BitSignedAccelerated() { return integerDotProduct32BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct32BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct32BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct32BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct32BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct32BitSignedAccelerated(int value) { integerDotProduct32BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct32BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct32BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct32BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct32BitMixedSignednessAccelerated`}
    public int integerDotProduct32BitMixedSignednessAccelerated() { return integerDotProduct32BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct32BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct32BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct32BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct32BitMixedSignednessAccelerated(int value) { integerDotProduct32BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct64BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct64BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct64BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct64BitUnsignedAccelerated`}
    public int integerDotProduct64BitUnsignedAccelerated() { return integerDotProduct64BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct64BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct64BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct64BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct64BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct64BitUnsignedAccelerated(int value) { integerDotProduct64BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct64BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct64BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct64BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct64BitSignedAccelerated`}
    public int integerDotProduct64BitSignedAccelerated() { return integerDotProduct64BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct64BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct64BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct64BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct64BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct64BitSignedAccelerated(int value) { integerDotProduct64BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct64BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct64BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct64BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct64BitMixedSignednessAccelerated`}
    public int integerDotProduct64BitMixedSignednessAccelerated() { return integerDotProduct64BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct64BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct64BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct64BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct64BitMixedSignednessAccelerated(int value) { integerDotProduct64BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated`}
    public int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(int value) { integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating8BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitSignedAccelerated`}
    public int integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating8BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating8BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating8BitSignedAccelerated(int value) { integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated`}
    public int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(int value) { integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated`}
    public int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(int value) { integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated`}
    public int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(int value) { integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated`}
    public int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(int value) { integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated`}
    public int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(int value) { integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating16BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitSignedAccelerated`}
    public int integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating16BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating16BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating16BitSignedAccelerated(int value) { integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated`}
    public int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(int value) { integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated`}
    public int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(int value) { integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating32BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitSignedAccelerated`}
    public int integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating32BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating32BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating32BitSignedAccelerated(int value) { integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated`}
    public int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(int value) { integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated`}
    public int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(int value) { integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating64BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitSignedAccelerated`}
    public int integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating64BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating64BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating64BitSignedAccelerated(int value) { integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated`}
    public int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(int value) { integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderIntegerDotProductProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderIntegerDotProductProperties`
    public VkPhysicalDeviceShaderIntegerDotProductProperties asSlice(long index) { return new VkPhysicalDeviceShaderIntegerDotProductProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderIntegerDotProductProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderIntegerDotProductProperties`
    public VkPhysicalDeviceShaderIntegerDotProductProperties asSlice(long index, long count) { return new VkPhysicalDeviceShaderIntegerDotProductProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderIntegerDotProductProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties at(long index, Consumer<VkPhysicalDeviceShaderIntegerDotProductProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct8BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct8BitUnsignedAcceleratedAt(long index) { return integerDotProduct8BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct8BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct8BitUnsignedAcceleratedAt(long index, int value) { integerDotProduct8BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct8BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct8BitSignedAcceleratedAt(long index) { return integerDotProduct8BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct8BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct8BitSignedAcceleratedAt(long index, int value) { integerDotProduct8BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct8BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct8BitMixedSignednessAcceleratedAt(long index) { return integerDotProduct8BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct8BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProduct8BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index) { return integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index, int value) { integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct4x8BitPackedSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct4x8BitPackedSignedAcceleratedAt(long index) { return integerDotProduct4x8BitPackedSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct4x8BitPackedSignedAcceleratedAt(long index, int value) { integerDotProduct4x8BitPackedSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index) { return integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index, int value) { integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct16BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct16BitUnsignedAcceleratedAt(long index) { return integerDotProduct16BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct16BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct16BitUnsignedAcceleratedAt(long index, int value) { integerDotProduct16BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct16BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct16BitSignedAcceleratedAt(long index) { return integerDotProduct16BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct16BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct16BitSignedAcceleratedAt(long index, int value) { integerDotProduct16BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct16BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct16BitMixedSignednessAcceleratedAt(long index) { return integerDotProduct16BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct16BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProduct16BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct32BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct32BitUnsignedAcceleratedAt(long index) { return integerDotProduct32BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct32BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct32BitUnsignedAcceleratedAt(long index, int value) { integerDotProduct32BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct32BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct32BitSignedAcceleratedAt(long index) { return integerDotProduct32BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct32BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct32BitSignedAcceleratedAt(long index, int value) { integerDotProduct32BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct32BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct32BitMixedSignednessAcceleratedAt(long index) { return integerDotProduct32BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct32BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProduct32BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct64BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct64BitUnsignedAcceleratedAt(long index) { return integerDotProduct64BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct64BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct64BitUnsignedAcceleratedAt(long index, int value) { integerDotProduct64BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct64BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct64BitSignedAcceleratedAt(long index) { return integerDotProduct64BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct64BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct64BitSignedAcceleratedAt(long index, int value) { integerDotProduct64BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct64BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct64BitMixedSignednessAcceleratedAt(long index) { return integerDotProduct64BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct64BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProduct64BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating8BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating16BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating32BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating64BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

}
