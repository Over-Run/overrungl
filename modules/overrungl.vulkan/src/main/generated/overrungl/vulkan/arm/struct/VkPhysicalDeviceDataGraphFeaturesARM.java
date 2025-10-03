// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDataGraphFeaturesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDataGraphFeaturesARM {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 dataGraph;
///     (uint32_t) VkBool32 dataGraphUpdateAfterBind;
///     (uint32_t) VkBool32 dataGraphSpecializationConstants;
///     (uint32_t) VkBool32 dataGraphDescriptorBuffer;
///     (uint32_t) VkBool32 dataGraphShaderModule;
/// };
/// ```
public final class VkPhysicalDeviceDataGraphFeaturesARM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDataGraphFeaturesARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dataGraph"),
        ValueLayout.JAVA_INT.withName("dataGraphUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("dataGraphSpecializationConstants"),
        ValueLayout.JAVA_INT.withName("dataGraphDescriptorBuffer"),
        ValueLayout.JAVA_INT.withName("dataGraphShaderModule")
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
    /// The byte offset of `dataGraph`.
    public static final long OFFSET_dataGraph = LAYOUT.byteOffset(PathElement.groupElement("dataGraph"));
    /// The memory layout of `dataGraph`.
    public static final MemoryLayout LAYOUT_dataGraph = LAYOUT.select(PathElement.groupElement("dataGraph"));
    /// The [VarHandle] of `dataGraph` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dataGraph = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataGraph")));
    /// The byte offset of `dataGraphUpdateAfterBind`.
    public static final long OFFSET_dataGraphUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("dataGraphUpdateAfterBind"));
    /// The memory layout of `dataGraphUpdateAfterBind`.
    public static final MemoryLayout LAYOUT_dataGraphUpdateAfterBind = LAYOUT.select(PathElement.groupElement("dataGraphUpdateAfterBind"));
    /// The [VarHandle] of `dataGraphUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dataGraphUpdateAfterBind = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataGraphUpdateAfterBind")));
    /// The byte offset of `dataGraphSpecializationConstants`.
    public static final long OFFSET_dataGraphSpecializationConstants = LAYOUT.byteOffset(PathElement.groupElement("dataGraphSpecializationConstants"));
    /// The memory layout of `dataGraphSpecializationConstants`.
    public static final MemoryLayout LAYOUT_dataGraphSpecializationConstants = LAYOUT.select(PathElement.groupElement("dataGraphSpecializationConstants"));
    /// The [VarHandle] of `dataGraphSpecializationConstants` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dataGraphSpecializationConstants = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataGraphSpecializationConstants")));
    /// The byte offset of `dataGraphDescriptorBuffer`.
    public static final long OFFSET_dataGraphDescriptorBuffer = LAYOUT.byteOffset(PathElement.groupElement("dataGraphDescriptorBuffer"));
    /// The memory layout of `dataGraphDescriptorBuffer`.
    public static final MemoryLayout LAYOUT_dataGraphDescriptorBuffer = LAYOUT.select(PathElement.groupElement("dataGraphDescriptorBuffer"));
    /// The [VarHandle] of `dataGraphDescriptorBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dataGraphDescriptorBuffer = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataGraphDescriptorBuffer")));
    /// The byte offset of `dataGraphShaderModule`.
    public static final long OFFSET_dataGraphShaderModule = LAYOUT.byteOffset(PathElement.groupElement("dataGraphShaderModule"));
    /// The memory layout of `dataGraphShaderModule`.
    public static final MemoryLayout LAYOUT_dataGraphShaderModule = LAYOUT.select(PathElement.groupElement("dataGraphShaderModule"));
    /// The [VarHandle] of `dataGraphShaderModule` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dataGraphShaderModule = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataGraphShaderModule")));

    /// Creates `VkPhysicalDeviceDataGraphFeaturesARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceDataGraphFeaturesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceDataGraphFeaturesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDataGraphFeaturesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphFeaturesARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDataGraphFeaturesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDataGraphFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphFeaturesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceDataGraphFeaturesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDataGraphFeaturesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphFeaturesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDataGraphFeaturesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDataGraphFeaturesARM`
    public static VkPhysicalDeviceDataGraphFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDataGraphFeaturesARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceDataGraphFeaturesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDataGraphFeaturesARM`
    public static VkPhysicalDeviceDataGraphFeaturesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDataGraphFeaturesARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDataGraphFeaturesARM copyFrom(VkPhysicalDeviceDataGraphFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceDataGraphFeaturesARM reinterpret(long count) { return new VkPhysicalDeviceDataGraphFeaturesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceDataGraphFeaturesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDataGraphFeaturesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `dataGraph` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dataGraph(MemorySegment segment, long index) { return (int) VH_dataGraph.get().get(segment, 0L, index); }
    /// {@return `dataGraph`}
    public int dataGraph() { return dataGraph(this.segment(), 0L); }
    /// Sets `dataGraph` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dataGraph(MemorySegment segment, long index, int value) { VH_dataGraph.get().set(segment, 0L, index, value); }
    /// Sets `dataGraph` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraph(int value) { dataGraph(this.segment(), 0L, value); return this; }

    /// {@return `dataGraphUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dataGraphUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_dataGraphUpdateAfterBind.get().get(segment, 0L, index); }
    /// {@return `dataGraphUpdateAfterBind`}
    public int dataGraphUpdateAfterBind() { return dataGraphUpdateAfterBind(this.segment(), 0L); }
    /// Sets `dataGraphUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dataGraphUpdateAfterBind(MemorySegment segment, long index, int value) { VH_dataGraphUpdateAfterBind.get().set(segment, 0L, index, value); }
    /// Sets `dataGraphUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphUpdateAfterBind(int value) { dataGraphUpdateAfterBind(this.segment(), 0L, value); return this; }

    /// {@return `dataGraphSpecializationConstants` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dataGraphSpecializationConstants(MemorySegment segment, long index) { return (int) VH_dataGraphSpecializationConstants.get().get(segment, 0L, index); }
    /// {@return `dataGraphSpecializationConstants`}
    public int dataGraphSpecializationConstants() { return dataGraphSpecializationConstants(this.segment(), 0L); }
    /// Sets `dataGraphSpecializationConstants` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dataGraphSpecializationConstants(MemorySegment segment, long index, int value) { VH_dataGraphSpecializationConstants.get().set(segment, 0L, index, value); }
    /// Sets `dataGraphSpecializationConstants` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphSpecializationConstants(int value) { dataGraphSpecializationConstants(this.segment(), 0L, value); return this; }

    /// {@return `dataGraphDescriptorBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dataGraphDescriptorBuffer(MemorySegment segment, long index) { return (int) VH_dataGraphDescriptorBuffer.get().get(segment, 0L, index); }
    /// {@return `dataGraphDescriptorBuffer`}
    public int dataGraphDescriptorBuffer() { return dataGraphDescriptorBuffer(this.segment(), 0L); }
    /// Sets `dataGraphDescriptorBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dataGraphDescriptorBuffer(MemorySegment segment, long index, int value) { VH_dataGraphDescriptorBuffer.get().set(segment, 0L, index, value); }
    /// Sets `dataGraphDescriptorBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphDescriptorBuffer(int value) { dataGraphDescriptorBuffer(this.segment(), 0L, value); return this; }

    /// {@return `dataGraphShaderModule` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dataGraphShaderModule(MemorySegment segment, long index) { return (int) VH_dataGraphShaderModule.get().get(segment, 0L, index); }
    /// {@return `dataGraphShaderModule`}
    public int dataGraphShaderModule() { return dataGraphShaderModule(this.segment(), 0L); }
    /// Sets `dataGraphShaderModule` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dataGraphShaderModule(MemorySegment segment, long index, int value) { VH_dataGraphShaderModule.get().set(segment, 0L, index, value); }
    /// Sets `dataGraphShaderModule` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphShaderModule(int value) { dataGraphShaderModule(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceDataGraphFeaturesARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceDataGraphFeaturesARM`
    public VkPhysicalDeviceDataGraphFeaturesARM asSlice(long index) { return new VkPhysicalDeviceDataGraphFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceDataGraphFeaturesARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceDataGraphFeaturesARM`
    public VkPhysicalDeviceDataGraphFeaturesARM asSlice(long index, long count) { return new VkPhysicalDeviceDataGraphFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceDataGraphFeaturesARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceDataGraphFeaturesARM at(long index, Consumer<VkPhysicalDeviceDataGraphFeaturesARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphFeaturesARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphFeaturesARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `dataGraph` at the given index}
    /// @param index the index of the struct buffer
    public int dataGraphAt(long index) { return dataGraph(this.segment(), index); }
    /// Sets `dataGraph` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphAt(long index, int value) { dataGraph(this.segment(), index, value); return this; }

    /// {@return `dataGraphUpdateAfterBind` at the given index}
    /// @param index the index of the struct buffer
    public int dataGraphUpdateAfterBindAt(long index) { return dataGraphUpdateAfterBind(this.segment(), index); }
    /// Sets `dataGraphUpdateAfterBind` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphUpdateAfterBindAt(long index, int value) { dataGraphUpdateAfterBind(this.segment(), index, value); return this; }

    /// {@return `dataGraphSpecializationConstants` at the given index}
    /// @param index the index of the struct buffer
    public int dataGraphSpecializationConstantsAt(long index) { return dataGraphSpecializationConstants(this.segment(), index); }
    /// Sets `dataGraphSpecializationConstants` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphSpecializationConstantsAt(long index, int value) { dataGraphSpecializationConstants(this.segment(), index, value); return this; }

    /// {@return `dataGraphDescriptorBuffer` at the given index}
    /// @param index the index of the struct buffer
    public int dataGraphDescriptorBufferAt(long index) { return dataGraphDescriptorBuffer(this.segment(), index); }
    /// Sets `dataGraphDescriptorBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphDescriptorBufferAt(long index, int value) { dataGraphDescriptorBuffer(this.segment(), index, value); return this; }

    /// {@return `dataGraphShaderModule` at the given index}
    /// @param index the index of the struct buffer
    public int dataGraphShaderModuleAt(long index) { return dataGraphShaderModule(this.segment(), index); }
    /// Sets `dataGraphShaderModule` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphShaderModuleAt(long index, int value) { dataGraphShaderModule(this.segment(), index, value); return this; }

}
