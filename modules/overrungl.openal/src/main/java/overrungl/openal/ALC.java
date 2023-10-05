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

package overrungl.openal;

import overrungl.internal.RuntimeHelper;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static overrungl.openal.Handles.*;

/**
 * The OpenAL context binding.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class ALC {
    static {
        create();
    }

    /**
     * Boolean False.
     */
    public static final int ALC_FALSE = 0;
    /**
     * Boolean True.
     */
    public static final int ALC_TRUE = 1;
    /**
     * Context attribute: <int> Hz.
     */
    public static final int ALC_FREQUENCY = 0x1007;
    /**
     * Context attribute: <int> Hz.
     */
    public static final int ALC_REFRESH = 0x1008;
    /**
     * Context attribute: AL_TRUE or AL_FALSE synchronous context?
     */
    public static final int ALC_SYNC = 0x1009;
    /**
     * Context attribute: <int> requested Mono (3D) Sources.
     */
    public static final int ALC_MONO_SOURCES = 0x1010;
    /**
     * Context attribute: <int> requested Stereo Sources.
     */
    public static final int ALC_STEREO_SOURCES = 0x1011;
    /**
     * No error.
     */
    public static final int ALC_NO_ERROR = 0;
    /**
     * Invalid device handle.
     */
    public static final int ALC_INVALID_DEVICE = 0xA001;
    /**
     * Invalid context handle.
     */
    public static final int ALC_INVALID_CONTEXT = 0xA002;
    /**
     * Invalid enumeration passed to an ALC call.
     */
    public static final int ALC_INVALID_ENUM = 0xA003;
    /**
     * Invalid value passed to an ALC call.
     */
    public static final int ALC_INVALID_VALUE = 0xA004;

    /**
     * Out of memory.
     */
    public static final int ALC_OUT_OF_MEMORY = 0xA005;
    /**
     * Runtime ALC major version.
     */
    public static final int ALC_MAJOR_VERSION = 0x1000;
    /**
     * Runtime ALC minor version.
     */
    public static final int ALC_MINOR_VERSION = 0x1001;
    /**
     * Context attribute list size.
     */
    public static final int ALC_ATTRIBUTES_SIZE = 0x1002;
    /**
     * Context attribute list properties.
     */
    public static final int ALC_ALL_ATTRIBUTES = 0x1003;
    /**
     * String for the default device specifier.
     */
    public static final int ALC_DEFAULT_DEVICE_SPECIFIER = 0x1004;
    /**
     * Device specifier string.
     * <p>
     * If device handle is NULL, it is instead a null-character separated list of
     * strings of known device specifiers (list ends with an empty string).
     */
    public static final int ALC_DEVICE_SPECIFIER = 0x1005;
    /**
     * String for space-separated list of ALC extensions.
     */
    public static final int ALC_EXTENSIONS = 0x1006;
    /**
     * Capture extension
     */
    public static final int ALC_EXT_CAPTURE = 1;
    /**
     * Capture device specifier string.
     * <p>
     * If device handle is NULL, it is instead a null-character separated list of
     * strings of known capture device specifiers (list ends with an empty string).
     */
    public static final int ALC_CAPTURE_DEVICE_SPECIFIER = 0x310;
    /**
     * String for the default capture device specifier.
     */
    public static final int ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 0x311;
    /**
     * Number of sample frames available for capture.
     */
    public static final int ALC_CAPTURE_SAMPLES = 0x312;
    /**
     * Enumerate All extension
     */
    public static final int ALC_ENUMERATE_ALL_EXT = 1;
    /**
     * String for the default extended device specifier.
     */
    public static final int ALC_DEFAULT_ALL_DEVICES_SPECIFIER = 0x1012;
    /**
     * Device's extended specifier string.
     * <p>
     * If device handle is NULL, it is instead a null-character separated list of
     * strings of known extended device specifiers (list ends with an empty string).
     */
    public static final int ALC_ALL_DEVICES_SPECIFIER = 0x1013;

    public static MemorySegment ncreateContext(MemorySegment device, MemorySegment attrlist) {
        try {
            return (MemorySegment) alcCreateContext.invokeExact(device, attrlist);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment createContext(SegmentAllocator allocator, MemorySegment device, int[] attrlist) {
        return ncreateContext(device, allocator.allocateArray(ValueLayout.JAVA_INT, attrlist));
    }

    public static boolean makeContextCurrent(MemorySegment context) {
        try {
            return (boolean) alcMakeContextCurrent.invokeExact(context);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void processContext(MemorySegment context) {
        try {
            alcProcessContext.invokeExact(context);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void suspendContext(MemorySegment context) {
        try {
            alcSuspendContext.invokeExact(context);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void destroyContext(MemorySegment context) {
        try {
            alcDestroyContext.invokeExact(context);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment getCurrentContext() {
        try {
            return (MemorySegment) alcGetCurrentContext.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment getContextsDevice(MemorySegment context) {
        try {
            return (MemorySegment) alcGetContextsDevice.invokeExact(context);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment nopenDevice(MemorySegment deviceName) {
        try {
            return (MemorySegment) alcOpenDevice.invokeExact(deviceName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment openDevice(SegmentAllocator allocator, String deviceName) {
        return nopenDevice(allocator.allocateUtf8String(deviceName));
    }

    public static boolean closeDevice(MemorySegment device) {
        try {
            return (boolean) alcCloseDevice.invokeExact(device);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getError(MemorySegment device) {
        try {
            return (int) alcGetError.invokeExact(device);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean nisExtensionPresent(MemorySegment device, MemorySegment extName) {
        try {
            return (boolean) alcIsExtensionPresent.invokeExact(device, extName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isExtensionPresent(SegmentAllocator allocator, MemorySegment device, String extName) {
        return nisExtensionPresent(device, allocator.allocateUtf8String(extName));
    }

    public static MemorySegment ngetProcAddress(MemorySegment device, MemorySegment funcName) {
        try {
            return (MemorySegment) alcGetProcAddress.invokeExact(device, funcName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment getProcAddress(SegmentAllocator allocator, MemorySegment device, String funcName) {
        return ngetProcAddress(device, allocator.allocateUtf8String(funcName));
    }

    public static int ngetEnumValue(MemorySegment device, MemorySegment enumName) {
        try {
            return (int) alcGetEnumValue.invokeExact(device, enumName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getEnumValue(SegmentAllocator allocator, MemorySegment device, String enumName) {
        return ngetEnumValue(device, allocator.allocateUtf8String(enumName));
    }

    public static MemorySegment ngetString(MemorySegment device, int param) {
        try {
            return (MemorySegment) alcGetString.invokeExact(device, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String getString(MemorySegment device, int param) {
        return ngetString(device, param).getUtf8String(0);
    }

    public static void ngetIntegerv(MemorySegment device, int param, int size, MemorySegment values) {
        try {
            alcGetIntegerv.invokeExact(device, param, size, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getIntegerv(SegmentAllocator allocator, MemorySegment device, int param, int[] values) {
        final MemorySegment seg = allocator.allocateArray(ValueLayout.JAVA_INT, values.length);
        ngetIntegerv(device, param, values.length, seg);
        RuntimeHelper.toArray(seg, values);
    }

    public static MemorySegment ncaptureOpenDevice(MemorySegment deviceName, int frequency, int format, int bufferSize) {
        try {
            return (MemorySegment) alcCaptureOpenDevice.invokeExact(deviceName, frequency, format, bufferSize);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment captureOpenDevice(SegmentAllocator allocator, String deviceName, int frequency, int format, int bufferSize) {
        return ncaptureOpenDevice(allocator.allocateUtf8String(deviceName), frequency, format, bufferSize);
    }

    public static boolean captureCloseDevice(MemorySegment device) {
        try {
            return (boolean) alcCaptureCloseDevice.invokeExact(device);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void captureStart(MemorySegment device) {
        try {
            alcCaptureStart.invokeExact(device);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void captureStop(MemorySegment device) {
        try {
            alcCaptureStop.invokeExact(device);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void captureSamples(MemorySegment device, MemorySegment buffer, int samples) {
        try {
            alcCaptureSamples.invokeExact(device, buffer, samples);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
