/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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

package overrungl.vulkan

data class VkFormat(
    val enumName: String,
    val enumClass: String,
    val blockSize: String,
    val texelsPerBlock: String,
    val blockExtent: String?,
    val packed: String?,
    val compressed: String?,
    val chroma: String?,
    val components: List<VkFormatComponent>?,
    val planes: List<VkFormatPlane>?,
    val spirvImageFormats: List<VkFormatSpirvImageFormat>?
)

data class VkFormatComponent(
    val name: String,
    val bits: String,
    val numericFormat: String,
    val planeIndex: String?
)

data class VkFormatPlane(
    val index: String,
    val widthDivisor: String,
    val heightDivisor: String,
    val compatible: String
)

data class VkFormatSpirvImageFormat(
    val name: String
)
