// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceBufferMemoryRequirementsKHR`.
/// ## Layout
/// ```
/// struct VkDeviceBufferMemoryRequirementsKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const VkBufferCreateInfo* pCreateInfo;
/// }
/// ```
public final class VkDeviceBufferMemoryRequirementsKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pCreateInfo")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pCreateInfo = LAYOUT.byteOffset(PathElement.groupElement("pCreateInfo"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pCreateInfo = LAYOUT.select(PathElement.groupElement("pCreateInfo"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pCreateInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCreateInfo"));

    public VkDeviceBufferMemoryRequirementsKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceBufferMemoryRequirementsKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceBufferMemoryRequirementsKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceBufferMemoryRequirementsKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceBufferMemoryRequirementsKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceBufferMemoryRequirementsKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceBufferMemoryRequirementsKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceBufferMemoryRequirementsKHR alloc(SegmentAllocator allocator) { return new VkDeviceBufferMemoryRequirementsKHR(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceBufferMemoryRequirementsKHR alloc(SegmentAllocator allocator, long count) { return new VkDeviceBufferMemoryRequirementsKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceBufferMemoryRequirementsKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS); }
    public static VkDeviceBufferMemoryRequirementsKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS);
        return s;
    }
    public VkDeviceBufferMemoryRequirementsKHR copyFrom(VkDeviceBufferMemoryRequirementsKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceBufferMemoryRequirementsKHR reinterpret(long count) { return new VkDeviceBufferMemoryRequirementsKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceBufferMemoryRequirementsKHR asSlice(long index) { return new VkDeviceBufferMemoryRequirementsKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceBufferMemoryRequirementsKHR asSlice(long index, long count) { return new VkDeviceBufferMemoryRequirementsKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceBufferMemoryRequirementsKHR at(long index, Consumer<VkDeviceBufferMemoryRequirementsKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pCreateInfoAt(long index) { return (MemorySegment) VH_pCreateInfo.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pCreateInfo() { return (MemorySegment) VH_pCreateInfo.get(this.segment(), 0L, 0L); }
    public VkDeviceBufferMemoryRequirementsKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceBufferMemoryRequirementsKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceBufferMemoryRequirementsKHR pCreateInfoAt(long index, MemorySegment value) { VH_pCreateInfo.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceBufferMemoryRequirementsKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceBufferMemoryRequirementsKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceBufferMemoryRequirementsKHR pCreateInfo(MemorySegment value) { VH_pCreateInfo.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceBufferMemoryRequirementsKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceBufferMemoryRequirementsKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceBufferMemoryRequirementsKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceBufferMemoryRequirementsKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pCreateInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCreateInfo, index), LAYOUT_pCreateInfo); }
    public MemorySegment _pCreateInfo() { return _pCreateInfoAt(0L); }
    public VkDeviceBufferMemoryRequirementsKHR _pCreateInfoAt(long index, MemorySegment src) { _pCreateInfoAt(index).copyFrom(src); return this; }
    public VkDeviceBufferMemoryRequirementsKHR _pCreateInfo(MemorySegment src) { return _pCreateInfoAt(0L, src); }
}
