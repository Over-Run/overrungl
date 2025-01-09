/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.msft;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKMSFTLayeredDriver {
    public static final int VK_LAYERED_DRIVER_UNDERLYING_API_NONE_MSFT = 0;
    public static final int VK_LAYERED_DRIVER_UNDERLYING_API_D3D12_MSFT = 1;
    public static final int VK_MSFT_LAYERED_DRIVER_SPEC_VERSION = 1;
    public static final String VK_MSFT_LAYERED_DRIVER_EXTENSION_NAME = "VK_MSFT_layered_driver";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_DRIVER_PROPERTIES_MSFT = 1000530000;

    public VKMSFTLayeredDriver(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
    }

}