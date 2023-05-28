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

import static org.overrungl.glib.al.Handles.*;

/**
 * The OpenAL binding.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class AL {
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
}
