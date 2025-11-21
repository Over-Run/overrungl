// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentShadingRatePropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentShadingRatePropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent2D minFragmentShadingRateAttachmentTexelSize;
///     VkExtent2D maxFragmentShadingRateAttachmentTexelSize;
///     uint32_t maxFragmentShadingRateAttachmentTexelSizeAspectRatio;
///     VkBool32 primitiveFragmentShadingRateWithMultipleViewports;
///     VkBool32 layeredShadingRateAttachments;
///     VkBool32 fragmentShadingRateNonTrivialCombinerOps;
///     VkExtent2D maxFragmentSize;
///     uint32_t maxFragmentSizeAspectRatio;
///     uint32_t maxFragmentShadingRateCoverageSamples;
///     VkSampleCountFlagBits maxFragmentShadingRateRasterizationSamples;
///     VkBool32 fragmentShadingRateWithShaderDepthStencilWrites;
///     VkBool32 fragmentShadingRateWithSampleMask;
///     VkBool32 fragmentShadingRateWithShaderSampleMask;
///     VkBool32 fragmentShadingRateWithConservativeRasterization;
///     VkBool32 fragmentShadingRateWithFragmentShaderInterlock;
///     VkBool32 fragmentShadingRateWithCustomSampleLocations;
///     VkBool32 fragmentShadingRateStrictMultiplyCombiner;
/// }
/// ```
public final class VkPhysicalDeviceFragmentShadingRatePropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minFragmentShadingRateAttachmentTexelSize"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxFragmentShadingRateAttachmentTexelSize"),
        ValueLayout.JAVA_INT.withName("maxFragmentShadingRateAttachmentTexelSizeAspectRatio"),
        ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRateWithMultipleViewports"),
        ValueLayout.JAVA_INT.withName("layeredShadingRateAttachments"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateNonTrivialCombinerOps"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxFragmentSize"),
        ValueLayout.JAVA_INT.withName("maxFragmentSizeAspectRatio"),
        ValueLayout.JAVA_INT.withName("maxFragmentShadingRateCoverageSamples"),
        ValueLayout.JAVA_INT.withName("maxFragmentShadingRateRasterizationSamples"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithShaderDepthStencilWrites"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithSampleMask"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithShaderSampleMask"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithConservativeRasterization"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithFragmentShaderInterlock"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateWithCustomSampleLocations"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateStrictMultiplyCombiner")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_minFragmentShadingRateAttachmentTexelSize = LAYOUT.byteOffset(PathElement.groupElement("minFragmentShadingRateAttachmentTexelSize"));
    public static final long OFFSET_maxFragmentShadingRateAttachmentTexelSize = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSize"));
    public static final long OFFSET_maxFragmentShadingRateAttachmentTexelSizeAspectRatio = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSizeAspectRatio"));
    public static final long OFFSET_primitiveFragmentShadingRateWithMultipleViewports = LAYOUT.byteOffset(PathElement.groupElement("primitiveFragmentShadingRateWithMultipleViewports"));
    public static final long OFFSET_layeredShadingRateAttachments = LAYOUT.byteOffset(PathElement.groupElement("layeredShadingRateAttachments"));
    public static final long OFFSET_fragmentShadingRateNonTrivialCombinerOps = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateNonTrivialCombinerOps"));
    public static final long OFFSET_maxFragmentSize = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentSize"));
    public static final long OFFSET_maxFragmentSizeAspectRatio = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentSizeAspectRatio"));
    public static final long OFFSET_maxFragmentShadingRateCoverageSamples = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentShadingRateCoverageSamples"));
    public static final long OFFSET_maxFragmentShadingRateRasterizationSamples = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentShadingRateRasterizationSamples"));
    public static final long OFFSET_fragmentShadingRateWithShaderDepthStencilWrites = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithShaderDepthStencilWrites"));
    public static final long OFFSET_fragmentShadingRateWithSampleMask = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithSampleMask"));
    public static final long OFFSET_fragmentShadingRateWithShaderSampleMask = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithShaderSampleMask"));
    public static final long OFFSET_fragmentShadingRateWithConservativeRasterization = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithConservativeRasterization"));
    public static final long OFFSET_fragmentShadingRateWithFragmentShaderInterlock = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithFragmentShaderInterlock"));
    public static final long OFFSET_fragmentShadingRateWithCustomSampleLocations = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithCustomSampleLocations"));
    public static final long OFFSET_fragmentShadingRateStrictMultiplyCombiner = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateStrictMultiplyCombiner"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_minFragmentShadingRateAttachmentTexelSize = LAYOUT.select(PathElement.groupElement("minFragmentShadingRateAttachmentTexelSize"));
    public static final MemoryLayout LAYOUT_maxFragmentShadingRateAttachmentTexelSize = LAYOUT.select(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSize"));
    public static final MemoryLayout LAYOUT_maxFragmentShadingRateAttachmentTexelSizeAspectRatio = LAYOUT.select(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSizeAspectRatio"));
    public static final MemoryLayout LAYOUT_primitiveFragmentShadingRateWithMultipleViewports = LAYOUT.select(PathElement.groupElement("primitiveFragmentShadingRateWithMultipleViewports"));
    public static final MemoryLayout LAYOUT_layeredShadingRateAttachments = LAYOUT.select(PathElement.groupElement("layeredShadingRateAttachments"));
    public static final MemoryLayout LAYOUT_fragmentShadingRateNonTrivialCombinerOps = LAYOUT.select(PathElement.groupElement("fragmentShadingRateNonTrivialCombinerOps"));
    public static final MemoryLayout LAYOUT_maxFragmentSize = LAYOUT.select(PathElement.groupElement("maxFragmentSize"));
    public static final MemoryLayout LAYOUT_maxFragmentSizeAspectRatio = LAYOUT.select(PathElement.groupElement("maxFragmentSizeAspectRatio"));
    public static final MemoryLayout LAYOUT_maxFragmentShadingRateCoverageSamples = LAYOUT.select(PathElement.groupElement("maxFragmentShadingRateCoverageSamples"));
    public static final MemoryLayout LAYOUT_maxFragmentShadingRateRasterizationSamples = LAYOUT.select(PathElement.groupElement("maxFragmentShadingRateRasterizationSamples"));
    public static final MemoryLayout LAYOUT_fragmentShadingRateWithShaderDepthStencilWrites = LAYOUT.select(PathElement.groupElement("fragmentShadingRateWithShaderDepthStencilWrites"));
    public static final MemoryLayout LAYOUT_fragmentShadingRateWithSampleMask = LAYOUT.select(PathElement.groupElement("fragmentShadingRateWithSampleMask"));
    public static final MemoryLayout LAYOUT_fragmentShadingRateWithShaderSampleMask = LAYOUT.select(PathElement.groupElement("fragmentShadingRateWithShaderSampleMask"));
    public static final MemoryLayout LAYOUT_fragmentShadingRateWithConservativeRasterization = LAYOUT.select(PathElement.groupElement("fragmentShadingRateWithConservativeRasterization"));
    public static final MemoryLayout LAYOUT_fragmentShadingRateWithFragmentShaderInterlock = LAYOUT.select(PathElement.groupElement("fragmentShadingRateWithFragmentShaderInterlock"));
    public static final MemoryLayout LAYOUT_fragmentShadingRateWithCustomSampleLocations = LAYOUT.select(PathElement.groupElement("fragmentShadingRateWithCustomSampleLocations"));
    public static final MemoryLayout LAYOUT_fragmentShadingRateStrictMultiplyCombiner = LAYOUT.select(PathElement.groupElement("fragmentShadingRateStrictMultiplyCombiner"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_minFragmentShadingRateAttachmentTexelSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minFragmentShadingRateAttachmentTexelSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_minFragmentShadingRateAttachmentTexelSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minFragmentShadingRateAttachmentTexelSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxFragmentShadingRateAttachmentTexelSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxFragmentShadingRateAttachmentTexelSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxFragmentShadingRateAttachmentTexelSizeAspectRatio = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSizeAspectRatio"));
    public static final VarHandle VH_primitiveFragmentShadingRateWithMultipleViewports = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveFragmentShadingRateWithMultipleViewports"));
    public static final VarHandle VH_layeredShadingRateAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layeredShadingRateAttachments"));
    public static final VarHandle VH_fragmentShadingRateNonTrivialCombinerOps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateNonTrivialCombinerOps"));
    public static final VarHandle VH_maxFragmentSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxFragmentSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxFragmentSizeAspectRatio = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentSizeAspectRatio"));
    public static final VarHandle VH_maxFragmentShadingRateCoverageSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentShadingRateCoverageSamples"));
    public static final VarHandle VH_maxFragmentShadingRateRasterizationSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentShadingRateRasterizationSamples"));
    public static final VarHandle VH_fragmentShadingRateWithShaderDepthStencilWrites = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithShaderDepthStencilWrites"));
    public static final VarHandle VH_fragmentShadingRateWithSampleMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithSampleMask"));
    public static final VarHandle VH_fragmentShadingRateWithShaderSampleMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithShaderSampleMask"));
    public static final VarHandle VH_fragmentShadingRateWithConservativeRasterization = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithConservativeRasterization"));
    public static final VarHandle VH_fragmentShadingRateWithFragmentShaderInterlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithFragmentShaderInterlock"));
    public static final VarHandle VH_fragmentShadingRateWithCustomSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateWithCustomSampleLocations"));
    public static final VarHandle VH_fragmentShadingRateStrictMultiplyCombiner = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateStrictMultiplyCombiner"));

    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR); }
    public static VkPhysicalDeviceFragmentShadingRatePropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR);
        return s;
    }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR copyFrom(VkPhysicalDeviceFragmentShadingRatePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR asSlice(long index) { return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR at(long index, Consumer<VkPhysicalDeviceFragmentShadingRatePropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int minFragmentShadingRateAttachmentTexelSize$widthAt(long index) { return (int) VH_minFragmentShadingRateAttachmentTexelSize$width.get(this.segment(), 0L, index); }
    public int minFragmentShadingRateAttachmentTexelSize$heightAt(long index) { return (int) VH_minFragmentShadingRateAttachmentTexelSize$height.get(this.segment(), 0L, index); }
    public int maxFragmentShadingRateAttachmentTexelSize$widthAt(long index) { return (int) VH_maxFragmentShadingRateAttachmentTexelSize$width.get(this.segment(), 0L, index); }
    public int maxFragmentShadingRateAttachmentTexelSize$heightAt(long index) { return (int) VH_maxFragmentShadingRateAttachmentTexelSize$height.get(this.segment(), 0L, index); }
    public int maxFragmentShadingRateAttachmentTexelSizeAspectRatioAt(long index) { return (int) VH_maxFragmentShadingRateAttachmentTexelSizeAspectRatio.get(this.segment(), 0L, index); }
    public int primitiveFragmentShadingRateWithMultipleViewportsAt(long index) { return (int) VH_primitiveFragmentShadingRateWithMultipleViewports.get(this.segment(), 0L, index); }
    public int layeredShadingRateAttachmentsAt(long index) { return (int) VH_layeredShadingRateAttachments.get(this.segment(), 0L, index); }
    public int fragmentShadingRateNonTrivialCombinerOpsAt(long index) { return (int) VH_fragmentShadingRateNonTrivialCombinerOps.get(this.segment(), 0L, index); }
    public int maxFragmentSize$widthAt(long index) { return (int) VH_maxFragmentSize$width.get(this.segment(), 0L, index); }
    public int maxFragmentSize$heightAt(long index) { return (int) VH_maxFragmentSize$height.get(this.segment(), 0L, index); }
    public int maxFragmentSizeAspectRatioAt(long index) { return (int) VH_maxFragmentSizeAspectRatio.get(this.segment(), 0L, index); }
    public int maxFragmentShadingRateCoverageSamplesAt(long index) { return (int) VH_maxFragmentShadingRateCoverageSamples.get(this.segment(), 0L, index); }
    public int maxFragmentShadingRateRasterizationSamplesAt(long index) { return (int) VH_maxFragmentShadingRateRasterizationSamples.get(this.segment(), 0L, index); }
    public int fragmentShadingRateWithShaderDepthStencilWritesAt(long index) { return (int) VH_fragmentShadingRateWithShaderDepthStencilWrites.get(this.segment(), 0L, index); }
    public int fragmentShadingRateWithSampleMaskAt(long index) { return (int) VH_fragmentShadingRateWithSampleMask.get(this.segment(), 0L, index); }
    public int fragmentShadingRateWithShaderSampleMaskAt(long index) { return (int) VH_fragmentShadingRateWithShaderSampleMask.get(this.segment(), 0L, index); }
    public int fragmentShadingRateWithConservativeRasterizationAt(long index) { return (int) VH_fragmentShadingRateWithConservativeRasterization.get(this.segment(), 0L, index); }
    public int fragmentShadingRateWithFragmentShaderInterlockAt(long index) { return (int) VH_fragmentShadingRateWithFragmentShaderInterlock.get(this.segment(), 0L, index); }
    public int fragmentShadingRateWithCustomSampleLocationsAt(long index) { return (int) VH_fragmentShadingRateWithCustomSampleLocations.get(this.segment(), 0L, index); }
    public int fragmentShadingRateStrictMultiplyCombinerAt(long index) { return (int) VH_fragmentShadingRateStrictMultiplyCombiner.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int minFragmentShadingRateAttachmentTexelSize$width() { return (int) VH_minFragmentShadingRateAttachmentTexelSize$width.get(this.segment(), 0L, 0L); }
    public int minFragmentShadingRateAttachmentTexelSize$height() { return (int) VH_minFragmentShadingRateAttachmentTexelSize$height.get(this.segment(), 0L, 0L); }
    public int maxFragmentShadingRateAttachmentTexelSize$width() { return (int) VH_maxFragmentShadingRateAttachmentTexelSize$width.get(this.segment(), 0L, 0L); }
    public int maxFragmentShadingRateAttachmentTexelSize$height() { return (int) VH_maxFragmentShadingRateAttachmentTexelSize$height.get(this.segment(), 0L, 0L); }
    public int maxFragmentShadingRateAttachmentTexelSizeAspectRatio() { return (int) VH_maxFragmentShadingRateAttachmentTexelSizeAspectRatio.get(this.segment(), 0L, 0L); }
    public int primitiveFragmentShadingRateWithMultipleViewports() { return (int) VH_primitiveFragmentShadingRateWithMultipleViewports.get(this.segment(), 0L, 0L); }
    public int layeredShadingRateAttachments() { return (int) VH_layeredShadingRateAttachments.get(this.segment(), 0L, 0L); }
    public int fragmentShadingRateNonTrivialCombinerOps() { return (int) VH_fragmentShadingRateNonTrivialCombinerOps.get(this.segment(), 0L, 0L); }
    public int maxFragmentSize$width() { return (int) VH_maxFragmentSize$width.get(this.segment(), 0L, 0L); }
    public int maxFragmentSize$height() { return (int) VH_maxFragmentSize$height.get(this.segment(), 0L, 0L); }
    public int maxFragmentSizeAspectRatio() { return (int) VH_maxFragmentSizeAspectRatio.get(this.segment(), 0L, 0L); }
    public int maxFragmentShadingRateCoverageSamples() { return (int) VH_maxFragmentShadingRateCoverageSamples.get(this.segment(), 0L, 0L); }
    public int maxFragmentShadingRateRasterizationSamples() { return (int) VH_maxFragmentShadingRateRasterizationSamples.get(this.segment(), 0L, 0L); }
    public int fragmentShadingRateWithShaderDepthStencilWrites() { return (int) VH_fragmentShadingRateWithShaderDepthStencilWrites.get(this.segment(), 0L, 0L); }
    public int fragmentShadingRateWithSampleMask() { return (int) VH_fragmentShadingRateWithSampleMask.get(this.segment(), 0L, 0L); }
    public int fragmentShadingRateWithShaderSampleMask() { return (int) VH_fragmentShadingRateWithShaderSampleMask.get(this.segment(), 0L, 0L); }
    public int fragmentShadingRateWithConservativeRasterization() { return (int) VH_fragmentShadingRateWithConservativeRasterization.get(this.segment(), 0L, 0L); }
    public int fragmentShadingRateWithFragmentShaderInterlock() { return (int) VH_fragmentShadingRateWithFragmentShaderInterlock.get(this.segment(), 0L, 0L); }
    public int fragmentShadingRateWithCustomSampleLocations() { return (int) VH_fragmentShadingRateWithCustomSampleLocations.get(this.segment(), 0L, 0L); }
    public int fragmentShadingRateStrictMultiplyCombiner() { return (int) VH_fragmentShadingRateStrictMultiplyCombiner.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR minFragmentShadingRateAttachmentTexelSize$widthAt(long index, int value) { VH_minFragmentShadingRateAttachmentTexelSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR minFragmentShadingRateAttachmentTexelSize$heightAt(long index, int value) { VH_minFragmentShadingRateAttachmentTexelSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSize$widthAt(long index, int value) { VH_maxFragmentShadingRateAttachmentTexelSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSize$heightAt(long index, int value) { VH_maxFragmentShadingRateAttachmentTexelSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSizeAspectRatioAt(long index, int value) { VH_maxFragmentShadingRateAttachmentTexelSizeAspectRatio.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR primitiveFragmentShadingRateWithMultipleViewportsAt(long index, int value) { VH_primitiveFragmentShadingRateWithMultipleViewports.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR layeredShadingRateAttachmentsAt(long index, int value) { VH_layeredShadingRateAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateNonTrivialCombinerOpsAt(long index, int value) { VH_fragmentShadingRateNonTrivialCombinerOps.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSize$widthAt(long index, int value) { VH_maxFragmentSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSize$heightAt(long index, int value) { VH_maxFragmentSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSizeAspectRatioAt(long index, int value) { VH_maxFragmentSizeAspectRatio.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateCoverageSamplesAt(long index, int value) { VH_maxFragmentShadingRateCoverageSamples.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateRasterizationSamplesAt(long index, int value) { VH_maxFragmentShadingRateRasterizationSamples.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithShaderDepthStencilWritesAt(long index, int value) { VH_fragmentShadingRateWithShaderDepthStencilWrites.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithSampleMaskAt(long index, int value) { VH_fragmentShadingRateWithSampleMask.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithShaderSampleMaskAt(long index, int value) { VH_fragmentShadingRateWithShaderSampleMask.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithConservativeRasterizationAt(long index, int value) { VH_fragmentShadingRateWithConservativeRasterization.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithFragmentShaderInterlockAt(long index, int value) { VH_fragmentShadingRateWithFragmentShaderInterlock.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithCustomSampleLocationsAt(long index, int value) { VH_fragmentShadingRateWithCustomSampleLocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateStrictMultiplyCombinerAt(long index, int value) { VH_fragmentShadingRateStrictMultiplyCombiner.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR minFragmentShadingRateAttachmentTexelSize$width(int value) { VH_minFragmentShadingRateAttachmentTexelSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR minFragmentShadingRateAttachmentTexelSize$height(int value) { VH_minFragmentShadingRateAttachmentTexelSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSize$width(int value) { VH_maxFragmentShadingRateAttachmentTexelSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSize$height(int value) { VH_maxFragmentShadingRateAttachmentTexelSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSizeAspectRatio(int value) { VH_maxFragmentShadingRateAttachmentTexelSizeAspectRatio.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR primitiveFragmentShadingRateWithMultipleViewports(int value) { VH_primitiveFragmentShadingRateWithMultipleViewports.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR layeredShadingRateAttachments(int value) { VH_layeredShadingRateAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateNonTrivialCombinerOps(int value) { VH_fragmentShadingRateNonTrivialCombinerOps.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSize$width(int value) { VH_maxFragmentSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSize$height(int value) { VH_maxFragmentSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSizeAspectRatio(int value) { VH_maxFragmentSizeAspectRatio.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateCoverageSamples(int value) { VH_maxFragmentShadingRateCoverageSamples.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateRasterizationSamples(int value) { VH_maxFragmentShadingRateRasterizationSamples.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithShaderDepthStencilWrites(int value) { VH_fragmentShadingRateWithShaderDepthStencilWrites.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithSampleMask(int value) { VH_fragmentShadingRateWithSampleMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithShaderSampleMask(int value) { VH_fragmentShadingRateWithShaderSampleMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithConservativeRasterization(int value) { VH_fragmentShadingRateWithConservativeRasterization.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithFragmentShaderInterlock(int value) { VH_fragmentShadingRateWithFragmentShaderInterlock.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithCustomSampleLocations(int value) { VH_fragmentShadingRateWithCustomSampleLocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateStrictMultiplyCombiner(int value) { VH_fragmentShadingRateStrictMultiplyCombiner.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _minFragmentShadingRateAttachmentTexelSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minFragmentShadingRateAttachmentTexelSize, index), LAYOUT_minFragmentShadingRateAttachmentTexelSize); }
    public MemorySegment _minFragmentShadingRateAttachmentTexelSize() { return _minFragmentShadingRateAttachmentTexelSizeAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _minFragmentShadingRateAttachmentTexelSizeAt(long index, MemorySegment src) { _minFragmentShadingRateAttachmentTexelSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _minFragmentShadingRateAttachmentTexelSize(MemorySegment src) { return _minFragmentShadingRateAttachmentTexelSizeAt(0L, src); }
    public MemorySegment _maxFragmentShadingRateAttachmentTexelSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFragmentShadingRateAttachmentTexelSize, index), LAYOUT_maxFragmentShadingRateAttachmentTexelSize); }
    public MemorySegment _maxFragmentShadingRateAttachmentTexelSize() { return _maxFragmentShadingRateAttachmentTexelSizeAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _maxFragmentShadingRateAttachmentTexelSizeAt(long index, MemorySegment src) { _maxFragmentShadingRateAttachmentTexelSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _maxFragmentShadingRateAttachmentTexelSize(MemorySegment src) { return _maxFragmentShadingRateAttachmentTexelSizeAt(0L, src); }
    public MemorySegment _maxFragmentShadingRateAttachmentTexelSizeAspectRatioAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFragmentShadingRateAttachmentTexelSizeAspectRatio, index), LAYOUT_maxFragmentShadingRateAttachmentTexelSizeAspectRatio); }
    public MemorySegment _maxFragmentShadingRateAttachmentTexelSizeAspectRatio() { return _maxFragmentShadingRateAttachmentTexelSizeAspectRatioAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _maxFragmentShadingRateAttachmentTexelSizeAspectRatioAt(long index, MemorySegment src) { _maxFragmentShadingRateAttachmentTexelSizeAspectRatioAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _maxFragmentShadingRateAttachmentTexelSizeAspectRatio(MemorySegment src) { return _maxFragmentShadingRateAttachmentTexelSizeAspectRatioAt(0L, src); }
    public MemorySegment _primitiveFragmentShadingRateWithMultipleViewportsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primitiveFragmentShadingRateWithMultipleViewports, index), LAYOUT_primitiveFragmentShadingRateWithMultipleViewports); }
    public MemorySegment _primitiveFragmentShadingRateWithMultipleViewports() { return _primitiveFragmentShadingRateWithMultipleViewportsAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _primitiveFragmentShadingRateWithMultipleViewportsAt(long index, MemorySegment src) { _primitiveFragmentShadingRateWithMultipleViewportsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _primitiveFragmentShadingRateWithMultipleViewports(MemorySegment src) { return _primitiveFragmentShadingRateWithMultipleViewportsAt(0L, src); }
    public MemorySegment _layeredShadingRateAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layeredShadingRateAttachments, index), LAYOUT_layeredShadingRateAttachments); }
    public MemorySegment _layeredShadingRateAttachments() { return _layeredShadingRateAttachmentsAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _layeredShadingRateAttachmentsAt(long index, MemorySegment src) { _layeredShadingRateAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _layeredShadingRateAttachments(MemorySegment src) { return _layeredShadingRateAttachmentsAt(0L, src); }
    public MemorySegment _fragmentShadingRateNonTrivialCombinerOpsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentShadingRateNonTrivialCombinerOps, index), LAYOUT_fragmentShadingRateNonTrivialCombinerOps); }
    public MemorySegment _fragmentShadingRateNonTrivialCombinerOps() { return _fragmentShadingRateNonTrivialCombinerOpsAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateNonTrivialCombinerOpsAt(long index, MemorySegment src) { _fragmentShadingRateNonTrivialCombinerOpsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateNonTrivialCombinerOps(MemorySegment src) { return _fragmentShadingRateNonTrivialCombinerOpsAt(0L, src); }
    public MemorySegment _maxFragmentSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFragmentSize, index), LAYOUT_maxFragmentSize); }
    public MemorySegment _maxFragmentSize() { return _maxFragmentSizeAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _maxFragmentSizeAt(long index, MemorySegment src) { _maxFragmentSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _maxFragmentSize(MemorySegment src) { return _maxFragmentSizeAt(0L, src); }
    public MemorySegment _maxFragmentSizeAspectRatioAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFragmentSizeAspectRatio, index), LAYOUT_maxFragmentSizeAspectRatio); }
    public MemorySegment _maxFragmentSizeAspectRatio() { return _maxFragmentSizeAspectRatioAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _maxFragmentSizeAspectRatioAt(long index, MemorySegment src) { _maxFragmentSizeAspectRatioAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _maxFragmentSizeAspectRatio(MemorySegment src) { return _maxFragmentSizeAspectRatioAt(0L, src); }
    public MemorySegment _maxFragmentShadingRateCoverageSamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFragmentShadingRateCoverageSamples, index), LAYOUT_maxFragmentShadingRateCoverageSamples); }
    public MemorySegment _maxFragmentShadingRateCoverageSamples() { return _maxFragmentShadingRateCoverageSamplesAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _maxFragmentShadingRateCoverageSamplesAt(long index, MemorySegment src) { _maxFragmentShadingRateCoverageSamplesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _maxFragmentShadingRateCoverageSamples(MemorySegment src) { return _maxFragmentShadingRateCoverageSamplesAt(0L, src); }
    public MemorySegment _maxFragmentShadingRateRasterizationSamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFragmentShadingRateRasterizationSamples, index), LAYOUT_maxFragmentShadingRateRasterizationSamples); }
    public MemorySegment _maxFragmentShadingRateRasterizationSamples() { return _maxFragmentShadingRateRasterizationSamplesAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _maxFragmentShadingRateRasterizationSamplesAt(long index, MemorySegment src) { _maxFragmentShadingRateRasterizationSamplesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _maxFragmentShadingRateRasterizationSamples(MemorySegment src) { return _maxFragmentShadingRateRasterizationSamplesAt(0L, src); }
    public MemorySegment _fragmentShadingRateWithShaderDepthStencilWritesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentShadingRateWithShaderDepthStencilWrites, index), LAYOUT_fragmentShadingRateWithShaderDepthStencilWrites); }
    public MemorySegment _fragmentShadingRateWithShaderDepthStencilWrites() { return _fragmentShadingRateWithShaderDepthStencilWritesAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateWithShaderDepthStencilWritesAt(long index, MemorySegment src) { _fragmentShadingRateWithShaderDepthStencilWritesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateWithShaderDepthStencilWrites(MemorySegment src) { return _fragmentShadingRateWithShaderDepthStencilWritesAt(0L, src); }
    public MemorySegment _fragmentShadingRateWithSampleMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentShadingRateWithSampleMask, index), LAYOUT_fragmentShadingRateWithSampleMask); }
    public MemorySegment _fragmentShadingRateWithSampleMask() { return _fragmentShadingRateWithSampleMaskAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateWithSampleMaskAt(long index, MemorySegment src) { _fragmentShadingRateWithSampleMaskAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateWithSampleMask(MemorySegment src) { return _fragmentShadingRateWithSampleMaskAt(0L, src); }
    public MemorySegment _fragmentShadingRateWithShaderSampleMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentShadingRateWithShaderSampleMask, index), LAYOUT_fragmentShadingRateWithShaderSampleMask); }
    public MemorySegment _fragmentShadingRateWithShaderSampleMask() { return _fragmentShadingRateWithShaderSampleMaskAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateWithShaderSampleMaskAt(long index, MemorySegment src) { _fragmentShadingRateWithShaderSampleMaskAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateWithShaderSampleMask(MemorySegment src) { return _fragmentShadingRateWithShaderSampleMaskAt(0L, src); }
    public MemorySegment _fragmentShadingRateWithConservativeRasterizationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentShadingRateWithConservativeRasterization, index), LAYOUT_fragmentShadingRateWithConservativeRasterization); }
    public MemorySegment _fragmentShadingRateWithConservativeRasterization() { return _fragmentShadingRateWithConservativeRasterizationAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateWithConservativeRasterizationAt(long index, MemorySegment src) { _fragmentShadingRateWithConservativeRasterizationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateWithConservativeRasterization(MemorySegment src) { return _fragmentShadingRateWithConservativeRasterizationAt(0L, src); }
    public MemorySegment _fragmentShadingRateWithFragmentShaderInterlockAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentShadingRateWithFragmentShaderInterlock, index), LAYOUT_fragmentShadingRateWithFragmentShaderInterlock); }
    public MemorySegment _fragmentShadingRateWithFragmentShaderInterlock() { return _fragmentShadingRateWithFragmentShaderInterlockAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateWithFragmentShaderInterlockAt(long index, MemorySegment src) { _fragmentShadingRateWithFragmentShaderInterlockAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateWithFragmentShaderInterlock(MemorySegment src) { return _fragmentShadingRateWithFragmentShaderInterlockAt(0L, src); }
    public MemorySegment _fragmentShadingRateWithCustomSampleLocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentShadingRateWithCustomSampleLocations, index), LAYOUT_fragmentShadingRateWithCustomSampleLocations); }
    public MemorySegment _fragmentShadingRateWithCustomSampleLocations() { return _fragmentShadingRateWithCustomSampleLocationsAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateWithCustomSampleLocationsAt(long index, MemorySegment src) { _fragmentShadingRateWithCustomSampleLocationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateWithCustomSampleLocations(MemorySegment src) { return _fragmentShadingRateWithCustomSampleLocationsAt(0L, src); }
    public MemorySegment _fragmentShadingRateStrictMultiplyCombinerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentShadingRateStrictMultiplyCombiner, index), LAYOUT_fragmentShadingRateStrictMultiplyCombiner); }
    public MemorySegment _fragmentShadingRateStrictMultiplyCombiner() { return _fragmentShadingRateStrictMultiplyCombinerAt(0L); }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateStrictMultiplyCombinerAt(long index, MemorySegment src) { _fragmentShadingRateStrictMultiplyCombinerAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR _fragmentShadingRateStrictMultiplyCombiner(MemorySegment src) { return _fragmentShadingRateStrictMultiplyCombinerAt(0L, src); }
}
