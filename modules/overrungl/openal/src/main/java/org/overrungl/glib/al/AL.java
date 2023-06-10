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

package org.overrungl.glib.al;

import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.util.MemoryStack;
import org.overrun.glib.util.value.Value3;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static org.overrungl.glib.al.Handles.*;

/**
 * The OpenAL binding.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class AL {
    static {
        create();
    }

    /**
     * No distance model or no buffer
     */
    public static final int AL_NONE = 0;
    /**
     * Boolean False.
     */
    public static final int AL_FALSE = 0;
    /**
     * Boolean True.
     */
    public static final int AL_TRUE = 1;
    /**
     * Relative source.<br>
     * Type:    ALboolean<br>
     * Range:   [AL_FALSE, AL_TRUE]<br>
     * Default: AL_FALSE
     * <p>
     * Specifies if the source uses relative coordinates.
     */
    public static final int AL_SOURCE_RELATIVE = 0x202;
    /**
     * Inner cone angle, in degrees.<br>
     * Type:    ALint, ALfloat<br>
     * Range:   [0 - 360]<br>
     * Default: 360
     * <p>
     * The angle covered by the inner cone, the area within which the source will
     * not be attenuated by direction.
     */
    public static final int AL_CONE_INNER_ANGLE = 0x1001;
    /**
     * Outer cone angle, in degrees.<br>
     * Range:   [0 - 360]<br>
     * Default: 360
     * <p>
     * The angle covered by the outer cone, the area outside which the source
     * will be fully attenuated by direction.
     */
    public static final int AL_CONE_OUTER_ANGLE = 0x1002;
    /**
     * Source pitch.<br>
     * Type:    ALfloat<br>
     * Range:   [0.5 - 2.0]<br>
     * Default: 1.0
     * <p>
     * A multiplier for the sample rate of the source's buffer.
     */
    public static final int AL_PITCH = 0x1003;
    /**
     * Source or listener position.<br>
     * Type:    ALfloat[3], ALint[3]<br>
     * Default: {0, 0, 0}
     * <p>
     * The source or listener location in three-dimensional space.
     * <p>
     * OpenAL uses a right-handed coordinate system, like OpenGL, where with a
     * default view, X points right (thumb), Y points up (index finger), and Z
     * points towards the viewer/camera (middle finger).
     * <p>
     * To change from or to a left-handed coordinate system, negate the Z
     * component.
     */
    public static final int AL_POSITION = 0x1004;
    /**
     * Source direction.<br>
     * Type:    ALfloat[3], ALint[3]<br>
     * Default: {0, 0, 0}
     * <p>
     * Specifies the current direction in local space. A zero-length vector
     * specifies an omnidirectional source (cone is ignored).
     * <p>
     * To change from or to a left-handed coordinate system, negate the Z
     * component.
     */
    public static final int AL_DIRECTION = 0x1005;
    /**
     * Source or listener velocity.<br>
     * Type:    ALfloat[3], ALint[3]<br>
     * Default: {0, 0, 0}
     * <p>
     * Specifies the current velocity, relative to the position.
     * <p>
     * To change from or to a left-handed coordinate system, negate the Z
     * component.
     */
    public static final int AL_VELOCITY = 0x1006;
    /**
     * Source looping.<br>
     * Type:    ALboolean<br>
     * Range:   [AL_FALSE, AL_TRUE]<br>
     * Default: AL_FALSE
     * <p>
     * Specifies whether source playback loops.
     */
    public static final int AL_LOOPING = 0x1007;
    /**
     * Source buffer.<br>
     * Type:    ALuint<br>
     * Range:   any valid Buffer ID<br>
     * Default: AL_NONE
     * <p>
     * Specifies the buffer to provide sound samples for a source.
     */
    public static final int AL_BUFFER = 0x1009;
    /**
     * Source or listener gain.<br>
     * Type:  ALfloat<br>
     * Range: [0.0 - ]
     * <p>
     * For sources, an initial linear gain value (before attenuation is applied).
     * For the listener, an output linear gain adjustment.
     * <p>
     * A value of 1.0 means unattenuated. Each division by 2 equals an attenuation
     * of about -6dB. Each multiplication by 2 equals an amplification of about
     * +6dB.
     */
    public static final int AL_GAIN = 0x100A;
    /**
     * Minimum source gain.<br>
     * Type:  ALfloat<br>
     * Range: [0.0 - 1.0]
     * <p>
     * The minimum gain allowed for a source, after distance and cone attenuation
     * are applied (if applicable).
     */
    public static final int AL_MIN_GAIN = 0x100D;
    /**
     * Maximum source gain.<br>
     * Type:  ALfloat<br>
     * Range: [0.0 - 1.0]
     * <p>
     * The maximum gain allowed for a source, after distance and cone attenuation
     * are applied (if applicable).
     */
    public static final int AL_MAX_GAIN = 0x100E;
    /**
     * Listener orientation.<br>
     * Type:    ALfloat[6]<br>
     * Default: {0.0, 0.0, -1.0, 0.0, 1.0, 0.0}
     * <p>
     * Effectively two three-dimensional vectors. The first vector is the front (or
     * "at"), and the second is the top (or "up"). Both vectors are relative to the
     * listener position.
     * <p>
     * To change from or to a left-handed coordinate system, negate the Z
     * component of both vectors.
     */
    public static final int AL_ORIENTATION = 0x100F;
    /**
     * Source state (query only).<br>
     * Type:  ALenum<br>
     * Range: [AL_INITIAL, AL_PLAYING, AL_PAUSED, AL_STOPPED]
     */
    public static final int AL_SOURCE_STATE = 0x1010;
    /**
     * Source state values.
     */
    public static final int AL_INITIAL = 0x1011,
        AL_PLAYING = 0x1012,
        AL_PAUSED = 0x1013,
        AL_STOPPED = 0x1014;
    /**
     * Source Buffer Queue size (query only).<br>
     * Type: ALint
     * <p>
     * The number of buffers queued using alSourceQueueBuffers, minus the buffers
     * removed with alSourceUnqueueBuffers.
     */
    public static final int AL_BUFFERS_QUEUED = 0x1015;
    /**
     * Source Buffer Queue processed count (query only).<br>
     * Type: ALint
     * <p>
     * The number of queued buffers that have been fully processed and can be
     * removed with alSourceUnqueueBuffers.
     * <p>
     * Looping sources will never fully process buffers because they will be set to
     * play again for when the source loops.
     */
    public static final int AL_BUFFERS_PROCESSED = 0x1016;
    /**
     * Source reference distance.<br>
     * Type:    ALfloat<br>
     * Range:   [0.0 - ]<br>
     * Default: 1.0
     * <p>
     * The distance in units that no distance attenuation occurs.
     * <p>
     * At 0.0, no distance attenuation occurs with non-linear attenuation models.
     */
    public static final int AL_REFERENCE_DISTANCE = 0x1020;
    /**
     * Source rolloff factor.<br>
     * Type:    ALfloat<br>
     * Range:   [0.0 - ]<br>
     * Default: 1.0
     * <p>
     * Multiplier to exaggerate or diminish distance attenuation.
     * <p>
     * At 0.0, no distance attenuation ever occurs.
     */
    public static final int AL_ROLLOFF_FACTOR = 0x1021;
    /**
     * Outer cone gain.<br>
     * Type:    ALfloat<br>
     * Range:   [0.0 - 1.0]<br>
     * Default: 0.0
     * <p>
     * The gain attenuation applied when the listener is outside the source's
     * outer cone angle.
     */
    public static final int AL_CONE_OUTER_GAIN = 0x1022;
    /**
     * Source maximum distance.<br>
     * Type:    ALfloat<br>
     * Range:   [0.0 - ]<br>
     * Default: FLT_MAX
     * <p>
     * The distance above which the source is not attenuated any further with a
     * clamped distance model, or where attenuation reaches 0.0 gain for linear
     * distance models with a default rolloff factor.
     */
    public static final int AL_MAX_DISTANCE = 0x1023;
    /**
     * Source buffer offset, in seconds
     */
    public static final int AL_SEC_OFFSET = 0x1024;
    /**
     * Source buffer offset, in sample frames
     */
    public static final int AL_SAMPLE_OFFSET = 0x1025;
    /**
     * Source buffer offset, in bytes
     */
    public static final int AL_BYTE_OFFSET = 0x1026;
    /**
     * Source type (query only).<br>
     * Type:  ALenum<br>
     * Range: [AL_STATIC, AL_STREAMING, AL_UNDETERMINED]
     * <p>
     * A Source is Static if a Buffer has been attached using AL_BUFFER.
     * <p>
     * A Source is Streaming if one or more Buffers have been attached using
     * alSourceQueueBuffers.
     * <p>
     * A Source is Undetermined when it has the NULL buffer attached using
     * AL_BUFFER.
     */
    public static final int AL_SOURCE_TYPE = 0x1027;
    /**
     * Source type values.
     */
    public static final int AL_STATIC = 0x1028,
        AL_STREAMING = 0x1029,
        AL_UNDETERMINED = 0x1030;
    /**
     * Unsigned 8-bit mono buffer format.
     */
    public static final int AL_FORMAT_MONO8 = 0x1100;
    /**
     * Signed 16-bit mono buffer format.
     */
    public static final int AL_FORMAT_MONO16 = 0x1101;
    /**
     * Unsigned 8-bit stereo buffer format.
     */
    public static final int AL_FORMAT_STEREO8 = 0x1102;
    /**
     * Signed 16-bit stereo buffer format.
     */
    public static final int AL_FORMAT_STEREO16 = 0x1103;
    /**
     * Buffer frequency/sample rate (query only).
     */
    public static final int AL_FREQUENCY = 0x2001;
    /**
     * Buffer bits per sample (query only).
     */
    public static final int AL_BITS = 0x2002;
    /**
     * Buffer channel count (query only).
     */
    public static final int AL_CHANNELS = 0x2003;
    /**
     * Buffer data size in bytes (query only).
     */
    public static final int AL_SIZE = 0x2004;
    /**
     * Buffer state. Not for public use.
     */
    public static final int AL_UNUSED = 0x2010,
        AL_PENDING = 0x2011,
        AL_PROCESSED = 0x2012;
    /**
     * No error.
     */
    public static final int AL_NO_ERROR = 0;
    /**
     * Invalid name (ID) passed to an AL call.
     */
    public static final int AL_INVALID_NAME = 0xA001;
    /**
     * Invalid enumeration passed to AL call.
     */
    public static final int AL_INVALID_ENUM = 0xA002;
    /**
     * Invalid value passed to AL call.
     */
    public static final int AL_INVALID_VALUE = 0xA003;
    /**
     * Illegal AL call.
     */
    public static final int AL_INVALID_OPERATION = 0xA004;
    /**
     * Not enough memory to execute the AL call.
     */
    public static final int AL_OUT_OF_MEMORY = 0xA005;
    /**
     * Context string: Vendor name.
     */
    public static final int AL_VENDOR = 0xB001;
    /**
     * Context string: Version.
     */
    public static final int AL_VERSION = 0xB002;
    /**
     * Context string: Renderer name.
     */
    public static final int AL_RENDERER = 0xB003;
    /**
     * Context string: Space-separated extension list.
     */
    public static final int AL_EXTENSIONS = 0xB004;
    /**
     * Doppler scale.<br>
     * Type:    ALfloat<br>
     * Range:   [0.0 - ]<br>
     * Default: 1.0
     * <p>
     * Scale for source and listener velocities.
     */
    public static final int AL_DOPPLER_FACTOR = 0xC000;
    /**
     * Doppler velocity (deprecated).
     * <p>
     * A multiplier applied to the Speed of Sound.
     */
    public static final int AL_DOPPLER_VELOCITY = 0xC001;
    /**
     * Speed of Sound, in units per second.<br>
     * Type:    ALfloat<br>
     * Range:   [0.0001 - ]<br>
     * Default: 343.3
     * <p>
     * The speed at which sound waves are assumed to travel, when calculating the
     * doppler effect from source and listener velocities.
     */
    public static final int AL_SPEED_OF_SOUND = 0xC003;
    /**
     * Distance attenuation model.<br>
     * Type:    ALenum<br>
     * Range:   [AL_NONE, AL_INVERSE_DISTANCE, AL_INVERSE_DISTANCE_CLAMPED,<br>
     * AL_LINEAR_DISTANCE, AL_LINEAR_DISTANCE_CLAMPED,<br>
     * AL_EXPONENT_DISTANCE, AL_EXPONENT_DISTANCE_CLAMPED]<br>
     * Default: AL_INVERSE_DISTANCE_CLAMPED
     * <p>
     * The model by which sources attenuate with distance.
     * <p>
     * None     - No distance attenuation.<br>
     * Inverse  - Doubling the distance halves the source gain.<br>
     * Linear   - Linear gain scaling between the reference and max distances.<br>
     * Exponent - Exponential gain dropoff.
     * <p>
     * Clamped variations work like the non-clamped counterparts, except the
     * distance calculated is clamped between the reference and max distances.
     */
    public static final int AL_DISTANCE_MODEL = 0xD000;
    /**
     * Distance model values.
     */
    public static final int AL_INVERSE_DISTANCE = 0xD001,
        AL_INVERSE_DISTANCE_CLAMPED = 0xD002,
        AL_LINEAR_DISTANCE = 0xD003,
        AL_LINEAR_DISTANCE_CLAMPED = 0xD004,
        AL_EXPONENT_DISTANCE = 0xD005,
        AL_EXPONENT_DISTANCE_CLAMPED = 0xD006;

    public static void enable(int capability) {
        try {
            alEnable.invokeExact(capability);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void disable(int capability) {
        try {
            alDisable.invokeExact(capability);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isEnabled(int capability) {
        try {
            return (boolean) alIsEnabled.invokeExact(capability);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void dopplerFactor(float value) {
        try {
            alDopplerFactor.invokeExact(value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void dopplerVelocity(float value) {
        try {
            alDopplerVelocity.invokeExact(value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void speedOfSound(float value) {
        try {
            alSpeedOfSound.invokeExact(value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void distanceModel(int distanceModel) {
        try {
            alDistanceModel.invokeExact(distanceModel);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment ngetString(int param) {
        try {
            return (MemorySegment) alGetString.invokeExact(param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String getString(int param) {
        return ngetString(param).getUtf8String(0);
    }

    public static void ngetBooleanv(int param, MemorySegment values) {
        try {
            alGetBooleanv.invokeExact(param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBooleanv(SegmentAllocator allocator, int param, boolean[] values) {
        final MemorySegment seg = allocator.allocateArray(JAVA_BYTE, values.length);
        ngetBooleanv(param, seg);
        RuntimeHelper.toArray(seg, values);
    }

    public static void ngetIntegerv(int param, MemorySegment values) {
        try {
            alGetIntegerv.invokeExact(param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getIntegerv(SegmentAllocator allocator, int param, int[] values) {
        final MemorySegment seg = allocator.allocateArray(JAVA_INT, values.length);
        ngetIntegerv(param, seg);
        RuntimeHelper.toArray(seg, values);
    }

    public static void ngetFloatv(int param, MemorySegment values) {
        try {
            alGetFloatv.invokeExact(param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getFloatv(SegmentAllocator allocator, int param, float[] values) {
        final MemorySegment seg = allocator.allocateArray(JAVA_FLOAT, values.length);
        ngetFloatv(param, seg);
        RuntimeHelper.toArray(seg, values);
    }

    public static void ngetDoublev(int param, MemorySegment values) {
        try {
            alGetDoublev.invokeExact(param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getDoublev(SegmentAllocator allocator, int param, double[] values) {
        final MemorySegment seg = allocator.allocateArray(JAVA_DOUBLE, values.length);
        ngetDoublev(param, seg);
        RuntimeHelper.toArray(seg, values);
    }

    public static boolean getBoolean(int param) {
        try {
            return (boolean) alGetBoolean.invokeExact(param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getInteger(int param) {
        try {
            return (int) alGetInteger.invokeExact(param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static float getFloat(int param) {
        try {
            return (float) alGetFloat.invokeExact(param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static double getDouble(int param) {
        try {
            return (double) alGetDouble.invokeExact(param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Obtain the first error generated in the AL context since the last call to
     * this function.
     *
     * @return the error code
     */
    public static int getError() {
        try {
            return (int) alGetError.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Query for the presence of an extension on the AL context.
     *
     * @param extName the name of the extension
     * @return the presence of the given extension
     */
    public static boolean nisExtensionPresent(MemorySegment extName) {
        try {
            return (boolean) alIsExtensionPresent.invokeExact(extName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Query for the presence of an extension on the AL context.
     *
     * @param extName the name of the extension
     * @return the presence of the given extension
     * @see #nisExtensionPresent(MemorySegment) nisExtensionPresent
     */
    public static boolean isExtensionPresent(SegmentAllocator allocator, String extName) {
        return nisExtensionPresent(allocator.allocateUtf8String(extName));
    }

    /**
     * Retrieve the address of a function.
     * The returned function may be context-specific.
     *
     * @param fname the name of the function
     * @return the address of the given function
     */
    public static MemorySegment ngetProcAddress(MemorySegment fname) {
        try {
            return (MemorySegment) alGetProcAddress.invokeExact(fname);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieve the address of a function.
     * The returned function may be context-specific.
     *
     * @param fname the name of the function
     * @return the address of the given function
     * @see #ngetProcAddress(MemorySegment) ngetProcAddress
     */
    public static MemorySegment getProcAddress(SegmentAllocator allocator, String fname) {
        return ngetProcAddress(allocator.allocateUtf8String(fname));
    }

    /**
     * Retrieve the value of an enum. The returned value may be context-specific.
     *
     * @param ename the name of the enum
     * @return the value of the given enum
     */
    public static int ngetEnumValue(MemorySegment ename) {
        try {
            return (int) alGetEnumValue.invokeExact(ename);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Retrieve the value of an enum. The returned value may be context-specific.
     *
     * @param ename the name of the enum
     * @return the value of the given enum
     * @see #ngetEnumValue(MemorySegment) ngetEnumValue
     */
    public static int getEnumValue(SegmentAllocator allocator, String ename) {
        return ngetEnumValue(allocator.allocateUtf8String(ename));
    }

    public static void listenerf(int param, float value) {
        try {
            alListenerf.invokeExact(param, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void listener3f(int param, float value1, float value2, float value3) {
        try {
            alListener3f.invokeExact(param, value1, value2, value3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void nlistenerfv(int param, MemorySegment values) {
        try {
            alListenerfv.invokeExact(param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void listenerfv(SegmentAllocator allocator, int param, float[] values) {
        nlistenerfv(param, allocator.allocateArray(JAVA_FLOAT, values));
    }

    public static void listeneri(int param, int value) {
        try {
            alListeneri.invokeExact(param, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void listener3i(int param, int value1, int value2, int value3) {
        try {
            alListener3i.invokeExact(param, value1, value2, value3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void nlisteneriv(int param, MemorySegment values) {
        try {
            alListeneriv.invokeExact(param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void listeneriv(SegmentAllocator allocator, int param, int[] values) {
        nlisteneriv(param, allocator.allocateArray(JAVA_INT, values));
    }

    public static void ngetListenerf(int param, MemorySegment value) {
        try {
            alGetListenerf.invokeExact(param, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static float getListenerf(int param) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(JAVA_FLOAT);
            ngetListenerf(param, seg);
            return seg.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void ngetListener3f(int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try {
            alGetListener3f.invokeExact(param, value1, value2, value3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static Value3.OfFloat getListener3f(int param) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg1 = stack.calloc(JAVA_FLOAT);
            final MemorySegment seg2 = stack.calloc(JAVA_FLOAT);
            final MemorySegment seg3 = stack.calloc(JAVA_FLOAT);
            ngetListener3f(param, seg1, seg2, seg3);
            return new Value3.OfFloat(seg1.get(JAVA_FLOAT, 0), seg2.get(JAVA_FLOAT, 0), seg3.get(JAVA_FLOAT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void ngetListenerfv(int param, MemorySegment values) {
        try {
            alGetListenerfv.invokeExact(param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getListenerfv(SegmentAllocator allocator, int param, float[] values) {
        final MemorySegment seg = allocator.allocateArray(JAVA_FLOAT, values.length);
        ngetListenerfv(param, seg);
        RuntimeHelper.toArray(seg, values);
    }

    public static void ngetListeneri(int param, MemorySegment value) {
        try {
            alGetListeneri.invokeExact(param, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static float getListeneri(int param) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(JAVA_INT);
            ngetListeneri(param, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void ngetListener3i(int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try {
            alGetListener3i.invokeExact(param, value1, value2, value3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static Value3.OfInt getListener3i(int param) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg1 = stack.calloc(JAVA_INT);
            final MemorySegment seg2 = stack.calloc(JAVA_INT);
            final MemorySegment seg3 = stack.calloc(JAVA_INT);
            ngetListener3i(param, seg1, seg2, seg3);
            return new Value3.OfInt(seg1.get(JAVA_INT, 0), seg2.get(JAVA_INT, 0), seg3.get(JAVA_INT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void ngetListeneriv(int param, MemorySegment values) {
        try {
            alGetListeneriv.invokeExact(param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getListeneriv(SegmentAllocator allocator, int param, int[] values) {
        final MemorySegment seg = allocator.allocateArray(JAVA_INT, values.length);
        ngetListeneriv(param, seg);
        RuntimeHelper.toArray(seg, values);
    }

    /**
     * Create source objects.
     *
     * @param n       the count of the objects.
     * @param sources a buffer that retrieves the objects.
     */
    public static void ngenSources(int n, MemorySegment sources) {
        try {
            alGenSources.invokeExact(n, sources);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Create source objects.
     *
     * @param allocator the allocator of the buffer.
     * @param sources   an array that retrieves the objects.
     * @see #ngenSources(int, MemorySegment) ngenSources
     */
    public static void genSources(SegmentAllocator allocator, int[] sources) {
        final MemorySegment seg = allocator.allocateArray(JAVA_INT, sources.length);
        ngenSources(sources.length, seg);
        RuntimeHelper.toArray(seg, sources);
    }

    /**
     * Create a source object.
     *
     * @return the object.
     * @see #ngenSources(int, MemorySegment) ngenSources
     */
    public static int genSource() {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(JAVA_INT);
            ngenSources(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Delete source objects.
     *
     * @param n       the count of the objects.
     * @param sources the objects.
     */
    public static void ndeleteSources(int n, MemorySegment sources) {
        try {
            alDeleteSources.invokeExact(n, sources);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Delete source objects.
     *
     * @param allocator the allocator of the buffer.
     * @param sources   the objects.
     * @see #ndeleteSources(int, MemorySegment) ndeleteSources
     */
    public static void deleteSources(SegmentAllocator allocator, int[] sources) {
        ndeleteSources(sources.length, allocator.allocateArray(JAVA_INT, sources));
    }

    /**
     * Delete a source object.
     *
     * @param source the object.
     * @see #ndeleteSources(int, MemorySegment) ndeleteSources
     */
    public static void deleteSource(int source) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            ngenSources(1, stack.ints(source));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Verify an ID is for a valid source.
     *
     * @param source an ID of a source
     * @return the result
     */
    public static boolean isSource(int source) {
        try {
            return (boolean) alIsSource.invokeExact(source);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void sourcef(int source, int param, float value) {
        try {
            alSourcef.invokeExact(source, param, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void source3f(int source, int param, float value1, float value2, float value3) {
        try {
            alSource3f.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void nsourcefv(int source, int param, MemorySegment values) {
        try {
            alSourcefv.invokeExact(source, param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void sourcefv(SegmentAllocator allocator, int source, int param, float[] values) {
        nsourcefv(source, param, allocator.allocateArray(JAVA_FLOAT, values));
    }

    public static void sourcei(int source, int param, int value) {
        try {
            alSourcei.invokeExact(source, param, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void source3i(int source, int param, int value1, int value2, int value3) {
        try {
            alSource3i.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void nsourceiv(int source, int param, MemorySegment values) {
        try {
            alSourceiv.invokeExact(source, param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void sourceiv(SegmentAllocator allocator, int source, int param, int[] values) {
        nsourceiv(source, param, allocator.allocateArray(JAVA_INT, values));
    }

    public static void ngetSourcef(int source, int param, MemorySegment value) {
        try {
            alGetSourcef.invokeExact(source, param, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static float getSourcef(int source, int param) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(JAVA_FLOAT);
            ngetSourcef(source, param, seg);
            return seg.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void ngetSource3f(int source, int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try {
            alGetSource3f.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static Value3.OfFloat getSource3f(int source, int param) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg1 = stack.calloc(JAVA_FLOAT);
            final MemorySegment seg2 = stack.calloc(JAVA_FLOAT);
            final MemorySegment seg3 = stack.calloc(JAVA_FLOAT);
            ngetSource3f(source, param, seg1, seg2, seg3);
            return new Value3.OfFloat(seg1.get(JAVA_FLOAT, 0), seg2.get(JAVA_FLOAT, 0), seg3.get(JAVA_FLOAT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void ngetSourcefv(int source, int param, MemorySegment values) {
        try {
            alGetSourcefv.invokeExact(source, param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getSourcefv(SegmentAllocator allocator, int source, int param, float[] values) {
        final MemorySegment seg = allocator.allocateArray(JAVA_FLOAT, values.length);
        ngetSourcefv(source, param, seg);
        RuntimeHelper.toArray(seg, values);
    }

    public static void ngetSourcei(int source, int param, MemorySegment value) {
        try {
            alGetSourcei.invokeExact(source, param, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static float getSourcei(int source, int param) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(JAVA_INT);
            ngetSourcei(source, param, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void ngetSource3i(int source, int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try {
            alGetSource3i.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static Value3.OfInt getSource3i(int source, int param) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg1 = stack.calloc(JAVA_INT);
            final MemorySegment seg2 = stack.calloc(JAVA_INT);
            final MemorySegment seg3 = stack.calloc(JAVA_INT);
            ngetSource3i(source, param, seg1, seg2, seg3);
            return new Value3.OfInt(seg1.get(JAVA_INT, 0), seg2.get(JAVA_INT, 0), seg3.get(JAVA_INT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void ngetSourceiv(int source, int param, MemorySegment values) {
        try {
            alGetSourceiv.invokeExact(source, param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getSourceiv(SegmentAllocator allocator, int source, int param, int[] values) {
        final MemorySegment seg = allocator.allocateArray(JAVA_INT, values.length);
        ngetSourceiv(source, param, seg);
        RuntimeHelper.toArray(seg, values);
    }

    /**
     * Play, restart, or resume a source, setting its state to {@link #AL_PLAYING}.
     *
     * @param source the ID of the source
     */
    public static void sourcePlay(int source) {
        try {
            alSourcePlay.invokeExact(source);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Stop a source, setting its state to {@link #AL_STOPPED} if playing or paused.
     *
     * @param source the ID of the source
     */
    public static void sourceStop(int source) {
        try {
            alSourceStop.invokeExact(source);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Rewind a source, setting its state to {@link #AL_INITIAL}.
     *
     * @param source the ID of the source
     */
    public static void sourceRewind(int source) {
        try {
            alSourceRewind.invokeExact(source);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Pause a source, setting its state to {@link #AL_PAUSED} if playing.
     *
     * @param source the ID of the source
     */
    public static void sourcePause(int source) {
        try {
            alSourcePause.invokeExact(source);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Play, restart, or resume a list of sources atomically.
     *
     * @param n       the count of the sources
     * @param sources the sources
     */
    public static void nsourcePlayv(int n, MemorySegment sources) {
        try {
            alSourcePlayv.invokeExact(n, sources);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Play, restart, or resume a list of sources atomically.
     *
     * @param allocator the allocator of the sources
     * @param sources   the sources
     * @see #nsourcePlayv(int, MemorySegment) nsourcePlayv
     */
    public static void sourcePlayv(SegmentAllocator allocator, int[] sources) {
        final MemorySegment seg = allocator.allocateArray(JAVA_INT, sources.length);
        nsourcePlayv(sources.length, seg);
        RuntimeHelper.toArray(seg, sources);
    }

    /**
     * Stop a list of sources atomically.
     *
     * @param n       the count of the sources
     * @param sources the sources
     */
    public static void nsourceStopv(int n, MemorySegment sources) {
        try {
            alSourceStopv.invokeExact(n, sources);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Stop a list of sources atomically.
     *
     * @param allocator the allocator of the sources
     * @param sources   the sources
     * @see #nsourcePlayv(int, MemorySegment) nsourcePlayv
     */
    public static void sourceStopv(SegmentAllocator allocator, int[] sources) {
        final MemorySegment seg = allocator.allocateArray(JAVA_INT, sources.length);
        nsourceStopv(sources.length, seg);
        RuntimeHelper.toArray(seg, sources);
    }

    /**
     * Rewind a list of sources atomically.
     *
     * @param n       the count of the sources
     * @param sources the sources
     */
    public static void nsourceRewindv(int n, MemorySegment sources) {
        try {
            alSourceRewindv.invokeExact(n, sources);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Rewind a list of sources atomically.
     *
     * @param allocator the allocator of the sources
     * @param sources   the sources
     * @see #nsourcePlayv(int, MemorySegment) nsourcePlayv
     */
    public static void sourceRewindv(SegmentAllocator allocator, int[] sources) {
        final MemorySegment seg = allocator.allocateArray(JAVA_INT, sources.length);
        nsourceRewindv(sources.length, seg);
        RuntimeHelper.toArray(seg, sources);
    }

    /**
     * Pause a list of sources atomically.
     *
     * @param n       the count of the sources
     * @param sources the sources
     */
    public static void nsourcePausev(int n, MemorySegment sources) {
        try {
            alSourcePausev.invokeExact(n, sources);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Pause a list of sources atomically.
     *
     * @param allocator the allocator of the sources
     * @param sources   the sources
     * @see #nsourcePlayv(int, MemorySegment) nsourcePlayv
     */
    public static void sourcePausev(SegmentAllocator allocator, int[] sources) {
        final MemorySegment seg = allocator.allocateArray(JAVA_INT, sources.length);
        nsourcePausev(sources.length, seg);
        RuntimeHelper.toArray(seg, sources);
    }

    /**
     * Queue buffers onto a source
     *
     * @param source  the source
     * @param nb      the count of the buffers
     * @param buffers the buffers
     */
    public static void nsourceQueueBuffers(int source, int nb, MemorySegment buffers) {
        try {
            alSourceQueueBuffers.invokeExact(source, nb, buffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Queue buffers onto a source
     *
     * @param allocator the allocator of the buffers
     * @param source    the source
     * @param buffers   the buffers
     */
    public static void sourceQueueBuffers(SegmentAllocator allocator, int source, int[] buffers) {
        nsourceQueueBuffers(source, buffers.length, allocator.allocateArray(JAVA_INT, buffers));
    }

    /**
     * Unqueue processed buffers from a source
     *
     * @param source  the source
     * @param nb      the count of the buffers
     * @param buffers the buffers
     */
    public static void nsourceUnqueueBuffers(int source, int nb, MemorySegment buffers) {
        try {
            alSourceUnqueueBuffers.invokeExact(source, nb, buffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Unqueue processed buffers from a source
     *
     * @param allocator the allocator of the buffers
     * @param source    the source
     * @param buffers   the buffers
     */
    public static void sourceUnqueueBuffers(SegmentAllocator allocator, int source, int[] buffers) {
        final MemorySegment seg = allocator.allocateArray(JAVA_INT, buffers);
        nsourceUnqueueBuffers(source, buffers.length, seg);
        RuntimeHelper.toArray(seg, buffers);
    }

    /**
     * Create buffer objects.
     *
     * @param n       the count of the objects.
     * @param buffers a buffer that retrieves the objects.
     */
    public static void ngenBuffers(int n, MemorySegment buffers) {
        try {
            alGenBuffers.invokeExact(n, buffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Create buffer objects.
     *
     * @param allocator the allocator of the buffer.
     * @param buffers   an array that retrieves the objects.
     * @see #ngenBuffers(int, MemorySegment) ngenBuffers
     */
    public static void genBuffers(SegmentAllocator allocator, int[] buffers) {
        final MemorySegment seg = allocator.allocateArray(JAVA_INT, buffers.length);
        ngenBuffers(buffers.length, seg);
        RuntimeHelper.toArray(seg, buffers);
    }

    /**
     * Create a buffer object.
     *
     * @return the object.
     * @see #ngenBuffers(int, MemorySegment) ngenBuffers
     */
    public static int genBuffer() {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(JAVA_INT);
            ngenBuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Delete buffer objects.
     *
     * @param n       the count of the objects.
     * @param buffers the objects.
     */
    public static void ndeleteBuffers(int n, MemorySegment buffers) {
        try {
            alDeleteBuffers.invokeExact(n, buffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Delete buffer objects.
     *
     * @param allocator the allocator of the buffer.
     * @param buffers   the objects.
     * @see #ndeleteBuffers(int, MemorySegment) ndeleteBuffers
     */
    public static void deleteBuffers(SegmentAllocator allocator, int[] buffers) {
        ndeleteBuffers(buffers.length, allocator.allocateArray(JAVA_INT, buffers));
    }

    /**
     * Delete a buffer object.
     *
     * @param buffer the object.
     * @see #ndeleteBuffers(int, MemorySegment) ndeleteBuffers
     */
    public static void deleteBuffer(int buffer) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            ngenBuffers(1, stack.ints(buffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Verify an ID is a valid buffer (including the NULL buffer).
     *
     * @param buffer an ID of a buffer
     * @return the result
     */
    public static boolean isBuffer(int buffer) {
        try {
            return (boolean) alIsBuffer.invokeExact(buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Copies data into the buffer, interpreting it using the specified format and
     * sample-rate.
     *
     * @param buffer     the buffer ID
     * @param format     the data format
     * @param data       the data
     * @param size       the data size
     * @param sampleRate the sample-rate
     */
    public static void bufferData(int buffer, int format, MemorySegment data, int size, int sampleRate) {
        try {
            alBufferData.invokeExact(buffer, format, data, size, sampleRate);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bufferf(int buffer, int param, float value) {
        try {
            alBufferf.invokeExact(buffer, param, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void buffer3f(int buffer, int param, float value1, float value2, float value3) {
        try {
            alBuffer3f.invokeExact(buffer, param, value1, value2, value3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void nbufferfv(int buffer, int param, MemorySegment values) {
        try {
            alBufferfv.invokeExact(buffer, param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bufferfv(SegmentAllocator allocator, int buffer, int param, float[] values) {
        nbufferfv(buffer, param, allocator.allocateArray(JAVA_FLOAT, values));
    }

    public static void bufferi(int buffer, int param, int value) {
        try {
            alBufferi.invokeExact(buffer, param, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void buffer3i(int buffer, int param, int value1, int value2, int value3) {
        try {
            alBuffer3i.invokeExact(buffer, param, value1, value2, value3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void nbufferiv(int buffer, int param, MemorySegment values) {
        try {
            alBufferiv.invokeExact(buffer, param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bufferiv(SegmentAllocator allocator, int buffer, int param, int[] values) {
        nbufferiv(buffer, param, allocator.allocateArray(JAVA_INT, values));
    }

    public static void ngetBufferf(int buffer, int param, MemorySegment value) {
        try {
            alGetBufferf.invokeExact(buffer, param, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static float getBufferf(int buffer, int param) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(JAVA_FLOAT);
            ngetBufferf(buffer, param, seg);
            return seg.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void ngetBuffer3f(int buffer, int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try {
            alGetBuffer3f.invokeExact(buffer, param, value1, value2, value3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static Value3.OfFloat getBuffer3f(int buffer, int param) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg1 = stack.calloc(JAVA_FLOAT);
            final MemorySegment seg2 = stack.calloc(JAVA_FLOAT);
            final MemorySegment seg3 = stack.calloc(JAVA_FLOAT);
            ngetBuffer3f(buffer, param, seg1, seg2, seg3);
            return new Value3.OfFloat(seg1.get(JAVA_FLOAT, 0), seg2.get(JAVA_FLOAT, 0), seg3.get(JAVA_FLOAT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void ngetBufferfv(int buffer, int param, MemorySegment values) {
        try {
            alGetBufferfv.invokeExact(buffer, param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBufferfv(SegmentAllocator allocator, int buffer, int param, float[] values) {
        final MemorySegment seg = allocator.allocateArray(JAVA_FLOAT, values.length);
        ngetBufferfv(buffer, param, seg);
        RuntimeHelper.toArray(seg, values);
    }

    public static void ngetBufferi(int buffer, int param, MemorySegment value) {
        try {
            alGetBufferi.invokeExact(buffer, param, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static float getBufferi(int buffer, int param) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg = stack.calloc(JAVA_INT);
            ngetBufferi(buffer, param, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void ngetBuffer3i(int buffer, int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try {
            alGetBuffer3i.invokeExact(buffer, param, value1, value2, value3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static Value3.OfInt getBuffer3i(int buffer, int param) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            final MemorySegment seg1 = stack.calloc(JAVA_INT);
            final MemorySegment seg2 = stack.calloc(JAVA_INT);
            final MemorySegment seg3 = stack.calloc(JAVA_INT);
            ngetBuffer3i(buffer, param, seg1, seg2, seg3);
            return new Value3.OfInt(seg1.get(JAVA_INT, 0), seg2.get(JAVA_INT, 0), seg3.get(JAVA_INT, 0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void ngetBufferiv(int buffer, int param, MemorySegment values) {
        try {
            alGetBufferiv.invokeExact(buffer, param, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBufferiv(SegmentAllocator allocator, int buffer, int param, int[] values) {
        final MemorySegment seg = allocator.allocateArray(JAVA_INT, values.length);
        ngetBufferiv(buffer, param, seg);
        RuntimeHelper.toArray(seg, values);
    }
}
