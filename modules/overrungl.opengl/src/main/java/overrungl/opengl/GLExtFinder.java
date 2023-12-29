/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

package overrungl.opengl;

import overrungl.internal.RuntimeHelper;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;

/**
 * Utilities
 *
 * @author squid233
 * @since 0.1.0
 */
final class GLExtFinder {
    static boolean getExtensions(SegmentAllocator allocator,
                                 int version,
                                 MemorySegment outExts,
                                 MemorySegment outNumExtsI,
                                 MemorySegment[] outExtsI,
                                 GLCapabilities caps) {
        if (GLLoader.versionMajor(version) < 3) {
            if (caps.glGetString == null) {
                return false;
            }
            outExts.set(ADDRESS, 0, GL10C.ngetString(GL10C.EXTENSIONS));
        } else {
            if (caps.glGetStringi == null || caps.glGetIntegerv == null) {
                return false;
            }
            int numExtsI = GL10C.getInteger(GL30C.NUM_EXTENSIONS);
            var extsI = MemorySegment.NULL;
            if (numExtsI > 0) {
                extsI = allocator.allocateArray(ADDRESS, numExtsI);
            }
            if (RuntimeHelper.isNullptr(extsI)) {
                return false;
            }
            for (int index = 0; index < numExtsI; index++) {
                var glStrTmp = GL30C.getStringi(GL10C.EXTENSIONS, index);
                extsI.setAtIndex(ADDRESS, index, allocator.allocateUtf8String(glStrTmp));
            }
            outNumExtsI.set(JAVA_INT, 0, numExtsI);
            outExtsI[0] = extsI;
        }

        return true;
    }

    static boolean hasExtension(int version, String exts, int numExtsI, MemorySegment extsI, String ext) {
        if (GLLoader.versionMajor(version) < 3) {
            if (exts == null || ext == null) {
                return false;
            }
            return exts.contains(ext);
        }
        for (int index = 0; index < numExtsI; index++) {
            if (RuntimeHelper.unboundPointerString(extsI, index).equals(ext)) {
                return true;
            }
        }
        return false;
    }
}
