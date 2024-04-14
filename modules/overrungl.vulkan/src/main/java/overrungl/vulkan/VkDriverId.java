/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
package overrungl.vulkan;

public enum VkDriverId implements overrun.marshal.CEnum {
    /**
     * Advanced Micro Devices, Inc.
     */
    AMD_PROPRIETARY(1),
    /**
     * Advanced Micro Devices, Inc.
     */
    AMD_OPEN_SOURCE(2),
    /**
     * Mesa open source project
     */
    MESA_RADV(3),
    /**
     * NVIDIA Corporation
     */
    NVIDIA_PROPRIETARY(4),
    /**
     * Intel Corporation
     */
    INTEL_PROPRIETARY_WINDOWS(5),
    /**
     * Intel Corporation
     */
    INTEL_OPEN_SOURCE_MESA(6),
    /**
     * Imagination Technologies
     */
    IMAGINATION_PROPRIETARY(7),
    /**
     * Qualcomm Technologies, Inc.
     */
    QUALCOMM_PROPRIETARY(8),
    /**
     * Arm Limited
     */
    ARM_PROPRIETARY(9),
    /**
     * Google LLC
     */
    GOOGLE_SWIFTSHADER(10),
    /**
     * Google LLC
     */
    GGP_PROPRIETARY(11),
    /**
     * Broadcom Inc.
     */
    BROADCOM_PROPRIETARY(12),
    /**
     * Mesa
     */
    MESA_LLVMPIPE(13),
    /**
     * MoltenVK
     */
    MOLTENVK(14),
    /**
     * Core Avionics &amp; Industrial Inc.
     */
    COREAVI_PROPRIETARY(15),
    /**
     * Juice Technologies, Inc.
     */
    JUICE_PROPRIETARY(16),
    /**
     * Verisilicon, Inc.
     */
    VERISILICON_PROPRIETARY(17),
    /**
     * Mesa open source project
     */
    MESA_TURNIP(18),
    /**
     * Mesa open source project
     */
    MESA_V3DV(19),
    /**
     * Mesa open source project
     */
    MESA_PANVK(20),
    /**
     * Samsung Electronics Co., Ltd.
     */
    SAMSUNG_PROPRIETARY(21),
    /**
     * Mesa open source project
     */
    MESA_VENUS(22),
    /**
     * Mesa open source project
     */
    MESA_DOZEN(23),
    /**
     * Mesa open source project
     */
    MESA_NVK(24),
    /**
     * Imagination Technologies
     */
    IMAGINATION_OPEN_SOURCE_MESA(25),
    /**
     * Mesa open source project
     */
    MESA_AGXV(26),
    ;
    private final int value;
    VkDriverId(int value) { this.value = value; }
    @Override public int value() { return value; }
}
