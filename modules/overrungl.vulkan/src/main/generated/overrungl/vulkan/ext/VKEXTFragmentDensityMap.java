// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_fragment_density_map` - device extension
public final class VKEXTFragmentDensityMap {
    public static final int VK_EXT_FRAGMENT_DENSITY_MAP_SPEC_VERSION = 2;
    public static final String VK_EXT_FRAGMENT_DENSITY_MAP_EXTENSION_NAME = "VK_EXT_fragment_density_map";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT = 1000218000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT = 1000218001;
    public static final int VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT = 1000218002;
    public static final int VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT = 0x00004000;
    public static final int VK_IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT = 1000218000;
    public static final int VK_ACCESS_FRAGMENT_DENSITY_MAP_READ_BIT_EXT = 0x01000000;
    public static final int VK_FORMAT_FEATURE_FRAGMENT_DENSITY_MAP_BIT_EXT = 0x01000000;
    public static final int VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT = 0x00000200;
    public static final int VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT = 0x00000001;
    public static final int VK_PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT = 0x00800000;
    public static final int VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT = 0x00000001;
    public static final int VK_SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT = 0x00000002;
    public static final long VK_FORMAT_FEATURE_2_FRAGMENT_DENSITY_MAP_BIT_EXT = 0x01000000L;
    public static final int VK_PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT = 0x00400000;
    public static final int VK_PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT = 0x00400000;
    public static final int VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT = 1000218007;

    private VKEXTFragmentDensityMap() {}

}
