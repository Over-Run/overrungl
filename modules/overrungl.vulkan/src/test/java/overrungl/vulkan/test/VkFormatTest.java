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

package overrungl.vulkan.test;

import org.junit.jupiter.api.Test;
import overrungl.vulkan.VkFormat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/// adapted from [FormatTraits.cpp](https://github.com/KhronosGroup/Vulkan-Hpp/blob/32f2957efcb552aebcfca3a6e66675ead4d1a240/tests/FormatTraits/FormatTraits.cpp)
///
/// @since 0.1.0
public class VkFormatTest {
    @Test
    void testVkFormat() {
        assertEquals(1, VkFormat.R4G4_UNORM_PACK8.blockSize(), "Wrong blocksize !");

        VkFormat format = VkFormat.R4G4_UNORM_PACK8;
        if (format.texelsPerBlock() == 1) {
            format = VkFormat.R4G4B4A4_UNORM_PACK16;
        }

        assertEquals(1, VkFormat.BC1_RGB_UNORM_BLOCK.blockExtent()[2]);

        format = VkFormat.BC1_RGB_UNORM_BLOCK;
        if ("BC".equals(format.compressionScheme())) {
            format = VkFormat.R4G4_UNORM_PACK8;
        }

        assertTrue(VkFormat.BC1_RGB_SRGB_BLOCK.isCompressed(), "IsCompressed ?");

        assertEquals(8, format.packed());

        if (format.componentsAreCompressed()) {
            format = VkFormat.BC1_RGB_UNORM_BLOCK;
        }

        final VkFormat constFormat = VkFormat.R4G4_UNORM_PACK8;
        assertEquals(4, constFormat.componentBits(1), "Wrong component bits !");
        assertEquals(2, constFormat.componentCount());

        if ("R".equals(constFormat.componentName(0))) {
            format = constFormat;
        }

        assertEquals("UNORM", constFormat.componentNumericFormat(1));

        assertEquals(0, constFormat.componentPlaneIndex(8), "Hoo");

        if (format.planeCount() == 1) {
            format = constFormat;
        }

        assertSame(VkFormat.R8_UNORM, VkFormat.G8_B8_R8_3PLANE_420_UNORM.planeCompatibleFormat(2));

        if (format.planeHeightDivisor(0) == format.planeWidthDivisor(0)) {
            format = VkFormat.G8_B8_R8_3PLANE_420_UNORM;
        }

        var allFormats = VkFormat.getAllFormats();

        Map<String, Set<VkFormat>> compatibleFormats = HashMap.newHashMap(allFormats.size());
        for (VkFormat f : allFormats) {
            compatibleFormats.computeIfAbsent(f.compatibilityClass(), _ -> new HashSet<>())
                    .add(f);
        }
        for (var entry : compatibleFormats.entrySet()) {
            System.out.println("class = " + entry.getKey());
            for (VkFormat lf : entry.getValue()) {
                for (VkFormat rf : entry.getValue()) {
                    assertEquals(lf.blockSize(), rf.blockSize());
                    assertArrayEquals(lf.blockExtent(), rf.blockExtent());
                    assertEquals(lf.texelsPerBlock(), rf.texelsPerBlock());
                }
                System.out.println("    " + lf);
            }
            System.out.println();
        }

        assertTrue(VkFormat.R4G4B4A4_UNORM_PACK16.hasRedComponent(), "Hoo");
        assertTrue(VkFormat.R4G4B4A4_UNORM_PACK16.hasGreenComponent(), "Hoo");
        assertTrue(VkFormat.R4G4B4A4_UNORM_PACK16.hasBlueComponent(), "Hoo");
        assertTrue(VkFormat.R4G4B4A4_UNORM_PACK16.hasAlphaComponent(), "Hoo");
        assertTrue(VkFormat.R4G4B4A4_UNORM_PACK16.isColor(), "Hoo");
    }
}
