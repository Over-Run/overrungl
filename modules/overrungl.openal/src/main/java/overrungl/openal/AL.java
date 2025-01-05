/*
 * MIT License
 *
 * Copyright (c) 2023-2025 Overrun Organization
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

import overrungl.annotation.CType;
import overrungl.annotation.Out;
import overrungl.internal.RuntimeHelper;
import overrungl.util.Marshal;
import overrungl.util.MemoryStack;
import overrungl.util.Unmarshal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

/**
 * The OpenAL binding.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class AL {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    ///No distance model or no buffer
    public static final int AL_NONE = 0;
    ///Boolean False.
    public static final int AL_FALSE = 0;
    ///Boolean True.
    public static final int AL_TRUE = 1;
    ///Relative source.
    ///- Type:    ALboolean
    ///- Range:   \[AL_FALSE, AL_TRUE\]
    ///- Default: AL_FALSE
    ///
    ///Specifies if the source uses relative coordinates.
    public static final int AL_SOURCE_RELATIVE = 0x202;
    ///Inner cone angle, in degrees.
    ///- Type:    ALint, ALfloat
    ///- Range:   \[0 - 360\]
    ///- Default: 360
    ///
    ///The angle covered by the inner cone, the area within which the source will
    ///not be attenuated by direction.
    public static final int AL_CONE_INNER_ANGLE = 0x1001;
    ///Outer cone angle, in degrees.
    ///- Range:   \[0 - 360\]
    ///- Default: 360
    ///
    ///The angle covered by the outer cone, the area outside of which the source
    ///will be fully attenuated by direction.
    public static final int AL_CONE_OUTER_ANGLE = 0x1002;
    ///Source pitch.
    ///- Type:    ALfloat
    ///- Range:   \[0.5 - 2.0\]
    ///- Default: 1.0
    ///
    ///A multiplier for the sample rate of the source's buffer.
    public static final int AL_PITCH = 0x1003;
    ///Source or listener position.
    ///- Type:    ALfloat\[3\], ALint\[3\]
    ///- Default: {0, 0, 0}
    ///
    ///The source or listener location in three dimensional space.
    ///
    ///OpenAL uses a right handed coordinate system, like OpenGL, where with a
    ///default view, X points right (thumb), Y points up (index finger), and Z
    ///points towards the viewer/camera (middle finger).
    ///
    ///To change from or to a left handed coordinate system, negate the Z
    ///component.
    public static final int AL_POSITION = 0x1004;
    ///Source direction.
    ///- Type:    ALfloat\[3\], ALint\[3\]
    ///- Default: {0, 0, 0}
    ///
    ///Specifies the current direction in local space. A zero-length vector
    ///specifies an omni-directional source (cone is ignored).
    ///
    ///To change from or to a left handed coordinate system, negate the Z
    ///component.
    public static final int AL_DIRECTION = 0x1005;
    ///Source or listener velocity.
    ///- Type:    ALfloat\[3\], ALint\[3]\
    ///- Default: {0, 0, 0}
    ///
    ///Specifies the current velocity, relative to the position.
    ///
    ///To change from or to a left handed coordinate system, negate the Z
    ///component.
    public static final int AL_VELOCITY = 0x1006;
    ///Source looping.
    ///- Type:    ALboolean
    ///- Range:   \[AL_FALSE, AL_TRUE\]
    ///- Default: AL_FALSE
    ///
    ///Specifies whether source playback loops.
    public static final int AL_LOOPING = 0x1007;
    ///Source buffer.
    ///- Type:    ALuint
    ///- Range:   any valid Buffer ID
    ///- Default: AL_NONE
    ///
    ///Specifies the buffer to provide sound samples for a source.
    public static final int AL_BUFFER = 0x1009;
    ///Source or listener gain.
    ///- Type:  ALfloat
    ///- Range: \[0.0 - \]
    ///
    ///For sources, an initial linear gain value (before attenuation is applied).
    ///For the listener, an output linear gain adjustment.
    ///
    ///A value of 1.0 means unattenuated. Each division by 2 equals an attenuation
    ///of about -6dB. Each multiplication by 2 equals an amplification of about
    ///+6dB.
    public static final int AL_GAIN = 0x100A;
    ///Minimum source gain.
    ///- Type:  ALfloat
    ///- Range: \[0.0 - 1.0\]
    ///
    ///The minimum gain allowed for a source, after distance and cone attenuation
    ///are applied (if applicable).
    public static final int AL_MIN_GAIN = 0x100D;
    ///Maximum source gain.
    ///- Type:  ALfloat
    ///- Range: \[0.0 - 1.0\]
    ///
    ///The maximum gain allowed for a source, after distance and cone attenuation
    ///are applied (if applicable).
    public static final int AL_MAX_GAIN = 0x100E;
    ///Listener orientation.
    ///- Type:    ALfloat\[6\]
    ///- Default: {0.0, 0.0, -1.0, 0.0, 1.0, 0.0}
    ///
    ///Effectively two three dimensional vectors. The first vector is the front (or
    ///"at") and the second is the top (or "up"). Both vectors are relative to the
    ///listener position.
    ///
    ///To change from or to a left handed coordinate system, negate the Z
    ///component of both vectors.
    public static final int AL_ORIENTATION = 0x100F;
    ///Source state (query only).
    ///- Type:  ALenum
    ///- Range: \[AL_INITIAL, AL_PLAYING, AL_PAUSED, AL_STOPPED\]
    public static final int AL_SOURCE_STATE = 0x1010;
    ///Source state values.
    public static final int
        AL_INITIAL = 0x1011,
        AL_PLAYING = 0x1012,
        AL_PAUSED = 0x1013,
        AL_STOPPED = 0x1014;
    ///Source Buffer Queue size (query only).
    ///- Type: ALint
    ///
    ///The number of buffers queued using alSourceQueueBuffers, minus the buffers
    ///removed with alSourceUnqueueBuffers.
    public static final int AL_BUFFERS_QUEUED = 0x1015;
    ///Source Buffer Queue processed count (query only).
    ///- Type: ALint
    ///
    ///The number of queued buffers that have been fully processed, and can be
    ///removed with alSourceUnqueueBuffers.
    ///
    ///Looping sources will never fully process buffers because they will be set to
    ///play again for when the source loops.
    public static final int AL_BUFFERS_PROCESSED = 0x1016;
    ///Source reference distance.
    ///- Type:    ALfloat
    ///- Range:   \[0.0 - \]
    ///- Default: 1.0
    ///
    ///The distance in units that no distance attenuation occurs.
    ///
    ///At 0.0, no distance attenuation occurs with non-linear attenuation models.
    public static final int AL_REFERENCE_DISTANCE = 0x1020;
    ///Source rolloff factor.
    ///- Type:    ALfloat
    ///- Range:   \[0.0 - \]
    ///- Default: 1.0
    ///
    ///Multiplier to exaggerate or diminish distance attenuation.
    ///
    ///At 0.0, no distance attenuation ever occurs.
    public static final int AL_ROLLOFF_FACTOR = 0x1021;
    ///Outer cone gain.
    ///- Type:    ALfloat
    ///- Range:   \[0.0 - 1.0\]
    ///- Default: 0.0
    ///
    ///The gain attenuation applied when the listener is outside of the source's
    ///outer cone angle.
    public static final int AL_CONE_OUTER_GAIN = 0x1022;
    ///Source maximum distance.
    ///- Type:    ALfloat
    ///- Range:   \[0.0 - \]
    ///- Default: FLT_MAX
    ///
    ///The distance above which the source is not attenuated any further with a
    ///clamped distance model, or where attenuation reaches 0.0 gain for linear
    ///distance models with a default rolloff factor.
    public static final int AL_MAX_DISTANCE = 0x1023;
    ///Source buffer offset, in seconds
    public static final int AL_SEC_OFFSET = 0x1024;
    ///Source buffer offset, in sample frames
    public static final int AL_SAMPLE_OFFSET = 0x1025;
    ///Source buffer offset, in bytes
    public static final int AL_BYTE_OFFSET = 0x1026;
    ///Source type (query only).
    ///- Type:  ALenum
    ///- Range: \[AL_STATIC, AL_STREAMING, AL_UNDETERMINED\]
    ///
    ///A Source is Static if a Buffer has been attached using AL_BUFFER.
    ///
    ///A Source is Streaming if one or more Buffers have been attached using
    ///alSourceQueueBuffers.
    ///
    ///A Source is Undetermined when it has the NULL buffer attached using
    ///AL_BUFFER.
    public static final int AL_SOURCE_TYPE = 0x1027;
    ///Source type values.
    public static final int
        AL_STATIC = 0x1028,
        AL_STREAMING = 0x1029,
        AL_UNDETERMINED = 0x1030;
    ///Unsigned 8-bit mono buffer format.
    public static final int AL_FORMAT_MONO8 = 0x1100;
    ///Signed 16-bit mono buffer format.
    public static final int AL_FORMAT_MONO16 = 0x1101;
    ///Unsigned 8-bit stereo buffer format.
    public static final int AL_FORMAT_STEREO8 = 0x1102;
    ///Signed 16-bit stereo buffer format.
    public static final int AL_FORMAT_STEREO16 = 0x1103;
    ///Buffer frequency/sample rate (query only).
    public static final int AL_FREQUENCY = 0x2001;
    ///Buffer bits per sample (query only).
    public static final int AL_BITS = 0x2002;
    ///Buffer channel count (query only).
    public static final int AL_CHANNELS = 0x2003;
    ///Buffer data size in bytes (query only).
    public static final int AL_SIZE = 0x2004;
    ///Buffer state. Not for public use.
    public static final int
        AL_UNUSED = 0x2010,
        AL_PENDING = 0x2011,
        AL_PROCESSED = 0x2012;
    ///No error.
    public static final int AL_NO_ERROR = 0;
    ///Invalid name (ID) passed to an AL call.
    public static final int AL_INVALID_NAME = 0xA001;
    ///Invalid enumeration passed to AL call.
    public static final int AL_INVALID_ENUM = 0xA002;
    ///Invalid value passed to AL call.
    public static final int AL_INVALID_VALUE = 0xA003;
    ///Illegal AL call.
    public static final int AL_INVALID_OPERATION = 0xA004;
    ///Not enough memory to execute the AL call.
    public static final int AL_OUT_OF_MEMORY = 0xA005;
    ///Context string: Vendor name.
    public static final int AL_VENDOR = 0xB001;
    ///Context string: Version.
    public static final int AL_VERSION = 0xB002;
    ///Context string: Renderer name.
    public static final int AL_RENDERER = 0xB003;
    ///Context string: Space-separated extension list.
    public static final int AL_EXTENSIONS = 0xB004;
    ///Doppler scale.
    ///- Type:    ALfloat
    ///- Range:   \[0.0 - \]
    ///- Default: 1.0
    ///
    ///Scale for source and listener velocities.
    public static final int AL_DOPPLER_FACTOR = 0xC000;
    ///Doppler velocity (deprecated).
    ///
    ///A multiplier applied to the Speed of Sound.
    public static final int AL_DOPPLER_VELOCITY = 0xC001;
    ///Speed of Sound, in units per second.
    ///- Type:    ALfloat
    ///- Range:   \[0.0001 - \]
    ///- Default: 343.3
    ///
    ///The speed at which sound waves are assumed to travel, when calculating the
    ///doppler effect from source and listener velocities.
    public static final int AL_SPEED_OF_SOUND = 0xC003;
    ///Distance attenuation model.
    ///- Type:    ALenum
    ///- Range:   \[AL_NONE, AL_INVERSE_DISTANCE, AL_INVERSE_DISTANCE_CLAMPED,
    ///          AL_LINEAR_DISTANCE, AL_LINEAR_DISTANCE_CLAMPED,
    ///          AL_EXPONENT_DISTANCE, AL_EXPONENT_DISTANCE_CLAMPED\]
    ///- Default: AL_INVERSE_DISTANCE_CLAMPED
    ///
    ///The model by which sources attenuate with distance.
    ///
    ///- None     - No distance attenuation.
    ///- Inverse  - Doubling the distance halves the source gain.
    ///- Linear   - Linear gain scaling between the reference and max distances.
    ///- Exponent - Exponential gain dropoff.
    ///
    ///Clamped variations work like the non-clamped counterparts, except the
    ///distance calculated is clamped between the reference and max distances.
    public static final int AL_DISTANCE_MODEL = 0xD000;
    ///Distance model values.
    public static final int
        AL_INVERSE_DISTANCE = 0xD001,
        AL_INVERSE_DISTANCE_CLAMPED = 0xD002,
        AL_LINEAR_DISTANCE = 0xD003,
        AL_LINEAR_DISTANCE_CLAMPED = 0xD004,
        AL_EXPONENT_DISTANCE = 0xD005,
        AL_EXPONENT_DISTANCE_CLAMPED = 0xD006;
    //endregion
    //region Method handles
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alEnable`.
        public static final MethodHandle MH_alEnable = RuntimeHelper.downcall(ALInternal.lookup(), "alEnable", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alDisable`.
        public static final MethodHandle MH_alDisable = RuntimeHelper.downcall(ALInternal.lookup(), "alDisable", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alIsEnabled`.
        public static final MethodHandle MH_alIsEnabled = RuntimeHelper.downcall(ALInternal.lookup(), "alIsEnabled", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
        /// The method handle of `alDopplerFactor`.
        public static final MethodHandle MH_alDopplerFactor = RuntimeHelper.downcall(ALInternal.lookup(), "alDopplerFactor", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `alDopplerVelocity`.
        public static final MethodHandle MH_alDopplerVelocity = RuntimeHelper.downcall(ALInternal.lookup(), "alDopplerVelocity", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `alSpeedOfSound`.
        public static final MethodHandle MH_alSpeedOfSound = RuntimeHelper.downcall(ALInternal.lookup(), "alSpeedOfSound", FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `alDistanceModel`.
        public static final MethodHandle MH_alDistanceModel = RuntimeHelper.downcall(ALInternal.lookup(), "alDistanceModel", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alGetString`.
        public static final MethodHandle MH_alGetString = RuntimeHelper.downcall(ALInternal.lookup(), "alGetString", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        /// The method handle of `alGetBooleanv`.
        public static final MethodHandle MH_alGetBooleanv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBooleanv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetIntegerv`.
        public static final MethodHandle MH_alGetIntegerv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetIntegerv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetFloatv`.
        public static final MethodHandle MH_alGetFloatv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetFloatv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetDoublev`.
        public static final MethodHandle MH_alGetDoublev = RuntimeHelper.downcall(ALInternal.lookup(), "alGetDoublev", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBoolean`.
        public static final MethodHandle MH_alGetBoolean = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBoolean", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
        /// The method handle of `alGetInteger`.
        public static final MethodHandle MH_alGetInteger = RuntimeHelper.downcall(ALInternal.lookup(), "alGetInteger", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alGetFloat`.
        public static final MethodHandle MH_alGetFloat = RuntimeHelper.downcall(ALInternal.lookup(), "alGetFloat", FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `alGetDouble`.
        public static final MethodHandle MH_alGetDouble = RuntimeHelper.downcall(ALInternal.lookup(), "alGetDouble", FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT));
        /// The method handle of `alGetError`.
        public static final MethodHandle MH_alGetError = RuntimeHelper.downcall(ALInternal.lookup(), "alGetError", FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `alIsExtensionPresent`.
        public static final MethodHandle MH_alIsExtensionPresent = RuntimeHelper.downcall(ALInternal.lookup(), "alIsExtensionPresent", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, Unmarshal.STR_LAYOUT));
        /// The method handle of `alGetProcAddress`.
        public static final MethodHandle MH_alGetProcAddress = RuntimeHelper.downcall(ALInternal.lookup(), "alGetProcAddress", FunctionDescriptor.of(ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `alGetEnumValue`.
        public static final MethodHandle MH_alGetEnumValue = RuntimeHelper.downcall(ALInternal.lookup(), "alGetEnumValue", FunctionDescriptor.of(ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT));
        /// The method handle of `alListenerf`.
        public static final MethodHandle MH_alListenerf = RuntimeHelper.downcall(ALInternal.lookup(), "alListenerf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alListener3f`.
        public static final MethodHandle MH_alListener3f = RuntimeHelper.downcall(ALInternal.lookup(), "alListener3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alListenerfv`.
        public static final MethodHandle MH_alListenerfv = RuntimeHelper.downcall(ALInternal.lookup(), "alListenerfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alListeneri`.
        public static final MethodHandle MH_alListeneri = RuntimeHelper.downcall(ALInternal.lookup(), "alListeneri", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alListener3i`.
        public static final MethodHandle MH_alListener3i = RuntimeHelper.downcall(ALInternal.lookup(), "alListener3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alListeneriv`.
        public static final MethodHandle MH_alListeneriv = RuntimeHelper.downcall(ALInternal.lookup(), "alListeneriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListenerf`.
        public static final MethodHandle MH_alGetListenerf = RuntimeHelper.downcall(ALInternal.lookup(), "alGetListenerf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListener3f`.
        public static final MethodHandle MH_alGetListener3f = RuntimeHelper.downcall(ALInternal.lookup(), "alGetListener3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetListenerfv`.
        public static final MethodHandle MH_alGetListenerfv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetListenerfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListeneri`.
        public static final MethodHandle MH_alGetListeneri = RuntimeHelper.downcall(ALInternal.lookup(), "alGetListeneri", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListener3i`.
        public static final MethodHandle MH_alGetListener3i = RuntimeHelper.downcall(ALInternal.lookup(), "alGetListener3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetListeneriv`.
        public static final MethodHandle MH_alGetListeneriv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetListeneriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGenSources`.
        public static final MethodHandle MH_alGenSources = RuntimeHelper.downcall(ALInternal.lookup(), "alGenSources", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alDeleteSources`.
        public static final MethodHandle MH_alDeleteSources = RuntimeHelper.downcall(ALInternal.lookup(), "alDeleteSources", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alIsSource`.
        public static final MethodHandle MH_alIsSource = RuntimeHelper.downcall(ALInternal.lookup(), "alIsSource", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
        /// The method handle of `alSourcef`.
        public static final MethodHandle MH_alSourcef = RuntimeHelper.downcall(ALInternal.lookup(), "alSourcef", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alSource3f`.
        public static final MethodHandle MH_alSource3f = RuntimeHelper.downcall(ALInternal.lookup(), "alSource3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alSourcefv`.
        public static final MethodHandle MH_alSourcefv = RuntimeHelper.downcall(ALInternal.lookup(), "alSourcefv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourcei`.
        public static final MethodHandle MH_alSourcei = RuntimeHelper.downcall(ALInternal.lookup(), "alSourcei", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alSource3i`.
        public static final MethodHandle MH_alSource3i = RuntimeHelper.downcall(ALInternal.lookup(), "alSource3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alSourceiv`.
        public static final MethodHandle MH_alSourceiv = RuntimeHelper.downcall(ALInternal.lookup(), "alSourceiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcef`.
        public static final MethodHandle MH_alGetSourcef = RuntimeHelper.downcall(ALInternal.lookup(), "alGetSourcef", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSource3f`.
        public static final MethodHandle MH_alGetSource3f = RuntimeHelper.downcall(ALInternal.lookup(), "alGetSource3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcefv`.
        public static final MethodHandle MH_alGetSourcefv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetSourcefv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcei`.
        public static final MethodHandle MH_alGetSourcei = RuntimeHelper.downcall(ALInternal.lookup(), "alGetSourcei", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSource3i`.
        public static final MethodHandle MH_alGetSource3i = RuntimeHelper.downcall(ALInternal.lookup(), "alGetSource3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourceiv`.
        public static final MethodHandle MH_alGetSourceiv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetSourceiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourcePlay`.
        public static final MethodHandle MH_alSourcePlay = RuntimeHelper.downcall(ALInternal.lookup(), "alSourcePlay", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alSourceStop`.
        public static final MethodHandle MH_alSourceStop = RuntimeHelper.downcall(ALInternal.lookup(), "alSourceStop", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alSourceRewind`.
        public static final MethodHandle MH_alSourceRewind = RuntimeHelper.downcall(ALInternal.lookup(), "alSourceRewind", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alSourcePause`.
        public static final MethodHandle MH_alSourcePause = RuntimeHelper.downcall(ALInternal.lookup(), "alSourcePause", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alSourcePlayv`.
        public static final MethodHandle MH_alSourcePlayv = RuntimeHelper.downcall(ALInternal.lookup(), "alSourcePlayv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceStopv`.
        public static final MethodHandle MH_alSourceStopv = RuntimeHelper.downcall(ALInternal.lookup(), "alSourceStopv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceRewindv`.
        public static final MethodHandle MH_alSourceRewindv = RuntimeHelper.downcall(ALInternal.lookup(), "alSourceRewindv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourcePausev`.
        public static final MethodHandle MH_alSourcePausev = RuntimeHelper.downcall(ALInternal.lookup(), "alSourcePausev", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceQueueBuffers`.
        public static final MethodHandle MH_alSourceQueueBuffers = RuntimeHelper.downcall(ALInternal.lookup(), "alSourceQueueBuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceUnqueueBuffers`.
        public static final MethodHandle MH_alSourceUnqueueBuffers = RuntimeHelper.downcall(ALInternal.lookup(), "alSourceUnqueueBuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGenBuffers`.
        public static final MethodHandle MH_alGenBuffers = RuntimeHelper.downcall(ALInternal.lookup(), "alGenBuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alDeleteBuffers`.
        public static final MethodHandle MH_alDeleteBuffers = RuntimeHelper.downcall(ALInternal.lookup(), "alDeleteBuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alIsBuffer`.
        public static final MethodHandle MH_alIsBuffer = RuntimeHelper.downcall(ALInternal.lookup(), "alIsBuffer", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
        /// The method handle of `alBufferData`.
        public static final MethodHandle MH_alBufferData = RuntimeHelper.downcall(ALInternal.lookup(), "alBufferData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alBufferf`.
        public static final MethodHandle MH_alBufferf = RuntimeHelper.downcall(ALInternal.lookup(), "alBufferf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alBuffer3f`.
        public static final MethodHandle MH_alBuffer3f = RuntimeHelper.downcall(ALInternal.lookup(), "alBuffer3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alBufferfv`.
        public static final MethodHandle MH_alBufferfv = RuntimeHelper.downcall(ALInternal.lookup(), "alBufferfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alBufferi`.
        public static final MethodHandle MH_alBufferi = RuntimeHelper.downcall(ALInternal.lookup(), "alBufferi", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alBuffer3i`.
        public static final MethodHandle MH_alBuffer3i = RuntimeHelper.downcall(ALInternal.lookup(), "alBuffer3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alBufferiv`.
        public static final MethodHandle MH_alBufferiv = RuntimeHelper.downcall(ALInternal.lookup(), "alBufferiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferf`.
        public static final MethodHandle MH_alGetBufferf = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBufferf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBuffer3f`.
        public static final MethodHandle MH_alGetBuffer3f = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBuffer3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferfv`.
        public static final MethodHandle MH_alGetBufferfv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBufferfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferi`.
        public static final MethodHandle MH_alGetBufferi = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBufferi", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBuffer3i`.
        public static final MethodHandle MH_alGetBuffer3i = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBuffer3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferiv`.
        public static final MethodHandle MH_alGetBufferiv = RuntimeHelper.downcall(ALInternal.lookup(), "alGetBufferiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    }
    //endregion

    public static void alEnable(@CType("ALenum") int capability) {
        try {
            Handles.MH_alEnable.invokeExact(capability);
        } catch (Throwable e) { throw new RuntimeException("error in alEnable", e); }
    }

    public static void alDisable(@CType("ALenum") int capability) {
        try {
            Handles.MH_alDisable.invokeExact(capability);
        } catch (Throwable e) { throw new RuntimeException("error in alDisable", e); }
    }

    public static @CType("ALboolean") boolean alIsEnabled(@CType("ALenum") int capability) {
        try {
            return (boolean) Handles.MH_alIsEnabled.invokeExact(capability);
        } catch (Throwable e) { throw new RuntimeException("error in alIsEnabled", e); }
    }

    public static void alDopplerFactor(@CType("ALfloat") float value) {
        try {
            Handles.MH_alDopplerFactor.invokeExact(value);
        } catch (Throwable e) { throw new RuntimeException("error in alDopplerFactor", e); }
    }

    public static void alDopplerVelocity(@CType("ALfloat") float value) {
        try {
            Handles.MH_alDopplerVelocity.invokeExact(value);
        } catch (Throwable e) { throw new RuntimeException("error in alDopplerVelocity", e); }
    }

    public static void alSpeedOfSound(@CType("ALfloat") float value) {
        try {
            Handles.MH_alSpeedOfSound.invokeExact(value);
        } catch (Throwable e) { throw new RuntimeException("error in alSpeedOfSound", e); }
    }

    public static void alDistanceModel(@CType("ALenum") int distanceModel) {
        try {
            Handles.MH_alDistanceModel.invokeExact(distanceModel);
        } catch (Throwable e) { throw new RuntimeException("error in alDistanceModel", e); }
    }

    public static @CType("const ALchar*") java.lang.foreign.MemorySegment alGetString_(@CType("ALenum") int param) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alGetString.invokeExact(param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetString", e); }
    }

    public static @CType("const ALchar*") java.lang.String alGetString(@CType("ALenum") int param) {
        try {
            return Unmarshal.unmarshalAsString((java.lang.foreign.MemorySegment) Handles.MH_alGetString.invokeExact(param));
        } catch (Throwable e) { throw new RuntimeException("error in alGetString", e); }
    }

    public static void alGetBooleanv(@CType("ALenum") int param, @Out @CType("ALboolean *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetBooleanv.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBooleanv", e); }
    }

    public static void alGetIntegerv(@CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetIntegerv.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetIntegerv", e); }
    }

    public static void alGetIntegerv(@CType("ALenum") int param, @Out @CType("ALint *") int[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetIntegerv.invokeExact(param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetIntegerv", e); }
    }

    public static void alGetFloatv(@CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetFloatv.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFloatv", e); }
    }

    public static void alGetFloatv(@CType("ALenum") int param, @Out @CType("ALfloat *") float[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetFloatv.invokeExact(param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFloatv", e); }
    }

    public static void alGetDoublev(@CType("ALenum") int param, @Out @CType("ALdouble *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetDoublev.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDoublev", e); }
    }

    public static void alGetDoublev(@CType("ALenum") int param, @Out @CType("ALdouble *") double[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetDoublev.invokeExact(param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDoublev", e); }
    }

    public static @CType("ALboolean") boolean alGetBoolean(@CType("ALenum") int param) {
        try {
            return (boolean) Handles.MH_alGetBoolean.invokeExact(param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBoolean", e); }
    }

    public static @CType("ALint") int alGetInteger(@CType("ALenum") int param) {
        try {
            return (int) Handles.MH_alGetInteger.invokeExact(param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetInteger", e); }
    }

    public static @CType("ALfloat") float alGetFloat(@CType("ALenum") int param) {
        try {
            return (float) Handles.MH_alGetFloat.invokeExact(param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFloat", e); }
    }

    public static @CType("ALdouble") double alGetDouble(@CType("ALenum") int param) {
        try {
            return (double) Handles.MH_alGetDouble.invokeExact(param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDouble", e); }
    }

    ///Obtain the first error generated in the AL context since the last call to
    ///this function.
    public static @CType("ALenum") int alGetError() {
        try {
            return (int) Handles.MH_alGetError.invokeExact();
        } catch (Throwable e) { throw new RuntimeException("error in alGetError", e); }
    }

    ///Query for the presence of an extension on the AL context.
    public static @CType("ALboolean") boolean alIsExtensionPresent(@CType("const ALchar*") java.lang.foreign.MemorySegment extname) {
        try {
            return (boolean) Handles.MH_alIsExtensionPresent.invokeExact(extname);
        } catch (Throwable e) { throw new RuntimeException("error in alIsExtensionPresent", e); }
    }

    ///Query for the presence of an extension on the AL context.
    public static @CType("ALboolean") boolean alIsExtensionPresent(@CType("const ALchar*") java.lang.String extname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (boolean) Handles.MH_alIsExtensionPresent.invokeExact(Marshal.marshal(__overrungl_stack, extname));
        } catch (Throwable e) { throw new RuntimeException("error in alIsExtensionPresent", e); }
    }

    ///Retrieve the address of a function. The returned function may be context-
    ///specific.
    public static @CType("void*") java.lang.foreign.MemorySegment alGetProcAddress(@CType("const ALchar*") java.lang.foreign.MemorySegment fname) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alGetProcAddress.invokeExact(fname);
        } catch (Throwable e) { throw new RuntimeException("error in alGetProcAddress", e); }
    }

    ///Retrieve the address of a function. The returned function may be context-
    ///specific.
    public static @CType("void*") java.lang.foreign.MemorySegment alGetProcAddress(@CType("const ALchar*") java.lang.String fname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (java.lang.foreign.MemorySegment) Handles.MH_alGetProcAddress.invokeExact(Marshal.marshal(__overrungl_stack, fname));
        } catch (Throwable e) { throw new RuntimeException("error in alGetProcAddress", e); }
    }

    ///Retrieve the value of an enum. The returned value may be context-specific.
    public static @CType("ALenum") int alGetEnumValue(@CType("const ALchar*") java.lang.foreign.MemorySegment ename) {
        try {
            return (int) Handles.MH_alGetEnumValue.invokeExact(ename);
        } catch (Throwable e) { throw new RuntimeException("error in alGetEnumValue", e); }
    }

    ///Retrieve the value of an enum. The returned value may be context-specific.
    public static @CType("ALenum") int alGetEnumValue(@CType("const ALchar*") java.lang.String ename) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (int) Handles.MH_alGetEnumValue.invokeExact(Marshal.marshal(__overrungl_stack, ename));
        } catch (Throwable e) { throw new RuntimeException("error in alGetEnumValue", e); }
    }

    public static void alListenerf(@CType("ALenum") int param, @CType("ALfloat") float value) {
        try {
            Handles.MH_alListenerf.invokeExact(param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alListenerf", e); }
    }

    public static void alListener3f(@CType("ALenum") int param, @CType("ALfloat") float value1, @CType("ALfloat") float value2, @CType("ALfloat") float value3) {
        try {
            Handles.MH_alListener3f.invokeExact(param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alListener3f", e); }
    }

    public static void alListenerfv(@CType("ALenum") int param, @CType("const ALfloat *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alListenerfv.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alListenerfv", e); }
    }

    public static void alListeneri(@CType("ALenum") int param, @CType("ALint") int value) {
        try {
            Handles.MH_alListeneri.invokeExact(param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alListeneri", e); }
    }

    public static void alListener3i(@CType("ALenum") int param, @CType("ALint") int value1, @CType("ALint") int value2, @CType("ALint") int value3) {
        try {
            Handles.MH_alListener3i.invokeExact(param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alListener3i", e); }
    }

    public static void alListeneriv(@CType("ALenum") int param, @CType("const ALint *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alListeneriv.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alListeneriv", e); }
    }

    public static void alGetListenerf(@CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value) {
        try {
            Handles.MH_alGetListenerf.invokeExact(param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerf", e); }
    }

    public static void alGetListenerf(@CType("ALenum") int param, @Out @CType("ALfloat *") float[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetListenerf.invokeExact(param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerf", e); }
    }

    public static void alGetListener3f(@CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value1, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value2, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value3) {
        try {
            Handles.MH_alGetListener3f.invokeExact(param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3f", e); }
    }

    public static void alGetListener3f(@CType("ALenum") int param, @Out @CType("ALfloat *") float[] value1, @Out @CType("ALfloat *") float[] value2, @Out @CType("ALfloat *") float[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetListener3f.invokeExact(param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3f", e); }
    }

    public static void alGetListenerfv(@CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetListenerfv.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerfv", e); }
    }

    public static void alGetListenerfv(@CType("ALenum") int param, @Out @CType("ALfloat *") float[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetListenerfv.invokeExact(param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerfv", e); }
    }

    public static void alGetListeneri(@CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment value) {
        try {
            Handles.MH_alGetListeneri.invokeExact(param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneri", e); }
    }

    public static void alGetListeneri(@CType("ALenum") int param, @Out @CType("ALint *") int[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetListeneri.invokeExact(param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneri", e); }
    }

    public static void alGetListener3i(@CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment value1, @Out @CType("ALint *") java.lang.foreign.MemorySegment value2, @Out @CType("ALint *") java.lang.foreign.MemorySegment value3) {
        try {
            Handles.MH_alGetListener3i.invokeExact(param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3i", e); }
    }

    public static void alGetListener3i(@CType("ALenum") int param, @Out @CType("ALint *") int[] value1, @Out @CType("ALint *") int[] value2, @Out @CType("ALint *") int[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetListener3i.invokeExact(param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3i", e); }
    }

    public static void alGetListeneriv(@CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetListeneriv.invokeExact(param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneriv", e); }
    }

    public static void alGetListeneriv(@CType("ALenum") int param, @Out @CType("ALint *") int[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetListeneriv.invokeExact(param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneriv", e); }
    }

    ///Create source objects.
    public static void alGenSources(@CType("ALsizei") int n, @Out @CType("ALuint *") java.lang.foreign.MemorySegment sources) {
        try {
            Handles.MH_alGenSources.invokeExact(n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alGenSources", e); }
    }

    ///Delete source objects.
    public static void alDeleteSources(@CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources) {
        try {
            Handles.MH_alDeleteSources.invokeExact(n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteSources", e); }
    }

    ///Verify an ID is for a valid source.
    public static @CType("ALboolean") boolean alIsSource(@CType("ALuint") int source) {
        try {
            return (boolean) Handles.MH_alIsSource.invokeExact(source);
        } catch (Throwable e) { throw new RuntimeException("error in alIsSource", e); }
    }

    public static void alSourcef(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat") float value) {
        try {
            Handles.MH_alSourcef.invokeExact(source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcef", e); }
    }

    public static void alSource3f(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat") float value1, @CType("ALfloat") float value2, @CType("ALfloat") float value3) {
        try {
            Handles.MH_alSource3f.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3f", e); }
    }

    public static void alSourcefv(@CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALfloat *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alSourcefv.invokeExact(source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcefv", e); }
    }

    public static void alSourcei(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint") int value) {
        try {
            Handles.MH_alSourcei.invokeExact(source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcei", e); }
    }

    public static void alSource3i(@CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint") int value1, @CType("ALint") int value2, @CType("ALint") int value3) {
        try {
            Handles.MH_alSource3i.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3i", e); }
    }

    public static void alSourceiv(@CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALint *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alSourceiv.invokeExact(source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceiv", e); }
    }

    public static void alGetSourcef(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value) {
        try {
            Handles.MH_alGetSourcef.invokeExact(source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcef", e); }
    }

    public static void alGetSourcef(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetSourcef.invokeExact(source, param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcef", e); }
    }

    public static void alGetSource3f(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value1, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value2, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value3) {
        try {
            Handles.MH_alGetSource3f.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3f", e); }
    }

    public static void alGetSource3f(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] value1, @Out @CType("ALfloat *") float[] value2, @Out @CType("ALfloat *") float[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetSource3f.invokeExact(source, param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3f", e); }
    }

    public static void alGetSourcefv(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetSourcefv.invokeExact(source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcefv", e); }
    }

    public static void alGetSourcefv(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetSourcefv.invokeExact(source, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcefv", e); }
    }

    public static void alGetSourcei(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment value) {
        try {
            Handles.MH_alGetSourcei.invokeExact(source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcei", e); }
    }

    public static void alGetSourcei(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") int[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetSourcei.invokeExact(source, param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcei", e); }
    }

    public static void alGetSource3i(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment value1, @Out @CType("ALint *") java.lang.foreign.MemorySegment value2, @Out @CType("ALint *") java.lang.foreign.MemorySegment value3) {
        try {
            Handles.MH_alGetSource3i.invokeExact(source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3i", e); }
    }

    public static void alGetSource3i(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") int[] value1, @Out @CType("ALint *") int[] value2, @Out @CType("ALint *") int[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetSource3i.invokeExact(source, param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3i", e); }
    }

    public static void alGetSourceiv(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetSourceiv.invokeExact(source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourceiv", e); }
    }

    public static void alGetSourceiv(@CType("ALuint") int source, @CType("ALenum") int param, @Out @CType("ALint *") int[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetSourceiv.invokeExact(source, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourceiv", e); }
    }

    ///Play, restart, or resume a source, setting its state to AL_PLAYING.
    public static void alSourcePlay(@CType("ALuint") int source) {
        try {
            Handles.MH_alSourcePlay.invokeExact(source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlay", e); }
    }

    ///Stop a source, setting its state to AL_STOPPED if playing or paused.
    public static void alSourceStop(@CType("ALuint") int source) {
        try {
            Handles.MH_alSourceStop.invokeExact(source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceStop", e); }
    }

    ///Rewind a source, setting its state to AL_INITIAL.
    public static void alSourceRewind(@CType("ALuint") int source) {
        try {
            Handles.MH_alSourceRewind.invokeExact(source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceRewind", e); }
    }

    ///Pause a source, setting its state to AL_PAUSED if playing.
    public static void alSourcePause(@CType("ALuint") int source) {
        try {
            Handles.MH_alSourcePause.invokeExact(source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePause", e); }
    }

    ///Play, restart, or resume a list of sources atomically.
    public static void alSourcePlayv(@CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources) {
        try {
            Handles.MH_alSourcePlayv.invokeExact(n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayv", e); }
    }

    ///Stop a list of sources atomically.
    public static void alSourceStopv(@CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources) {
        try {
            Handles.MH_alSourceStopv.invokeExact(n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceStopv", e); }
    }

    ///Rewind a list of sources atomically.
    public static void alSourceRewindv(@CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources) {
        try {
            Handles.MH_alSourceRewindv.invokeExact(n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceRewindv", e); }
    }

    ///Pause a list of sources atomically.
    public static void alSourcePausev(@CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources) {
        try {
            Handles.MH_alSourcePausev.invokeExact(n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePausev", e); }
    }

    ///Queue buffers onto a source
    public static void alSourceQueueBuffers(@CType("ALuint") int source, @CType("ALsizei") int nb, @CType("const ALuint *") java.lang.foreign.MemorySegment buffers) {
        try {
            Handles.MH_alSourceQueueBuffers.invokeExact(source, nb, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceQueueBuffers", e); }
    }

    ///Unqueue processed buffers from a source
    public static void alSourceUnqueueBuffers(@CType("ALuint") int source, @CType("ALsizei") int nb, @Out @CType("ALuint *") java.lang.foreign.MemorySegment buffers) {
        try {
            Handles.MH_alSourceUnqueueBuffers.invokeExact(source, nb, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceUnqueueBuffers", e); }
    }

    ///Create buffer objects
    public static void alGenBuffers(@CType("ALsizei") int n, @Out @CType("ALuint *") java.lang.foreign.MemorySegment buffers) {
        try {
            Handles.MH_alGenBuffers.invokeExact(n, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alGenBuffers", e); }
    }

    ///Delete buffer objects
    public static void alDeleteBuffers(@CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment buffers) {
        try {
            Handles.MH_alDeleteBuffers.invokeExact(n, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteBuffers", e); }
    }

    ///Verify an ID is a valid buffer (including the NULL buffer)
    public static @CType("ALboolean") boolean alIsBuffer(@CType("ALuint") int source) {
        try {
            return (boolean) Handles.MH_alIsBuffer.invokeExact(source);
        } catch (Throwable e) { throw new RuntimeException("error in alIsBuffer", e); }
    }

    ///Copies data into the buffer, interpreting it using the specified format and
    ///samplerate.
    public static void alBufferData(@CType("ALuint") int buffer, @CType("ALenum") int format, @CType("const ALvoid *") java.lang.foreign.MemorySegment data, @CType("ALsizei") int size, @CType("ALsizei") int samplerate) {
        try {
            Handles.MH_alBufferData.invokeExact(buffer, format, data, size, samplerate);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferData", e); }
    }

    public static void alBufferf(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat") float value) {
        try {
            Handles.MH_alBufferf.invokeExact(buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferf", e); }
    }

    public static void alBuffer3f(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat") float value1, @CType("ALfloat") float value2, @CType("ALfloat") float value3) {
        try {
            Handles.MH_alBuffer3f.invokeExact(buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alBuffer3f", e); }
    }

    public static void alBufferfv(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("const ALfloat *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alBufferfv.invokeExact(buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferfv", e); }
    }

    public static void alBufferi(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint") int value) {
        try {
            Handles.MH_alBufferi.invokeExact(buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferi", e); }
    }

    public static void alBuffer3i(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint") int value1, @CType("ALint") int value2, @CType("ALint") int value3) {
        try {
            Handles.MH_alBuffer3i.invokeExact(buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alBuffer3i", e); }
    }

    public static void alBufferiv(@CType("ALuint") int buffer, @CType("ALenum") int param, @CType("const ALint *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alBufferiv.invokeExact(buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferiv", e); }
    }

    public static void alGetBufferf(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value) {
        try {
            Handles.MH_alGetBufferf.invokeExact(buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferf", e); }
    }

    public static void alGetBufferf(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetBufferf.invokeExact(buffer, param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferf", e); }
    }

    public static void alGetBuffer3f(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value1, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value2, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment value3) {
        try {
            Handles.MH_alGetBuffer3f.invokeExact(buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3f", e); }
    }

    public static void alGetBuffer3f(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] value1, @Out @CType("ALfloat *") float[] value2, @Out @CType("ALfloat *") float[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetBuffer3f.invokeExact(buffer, param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3f", e); }
    }

    public static void alGetBufferfv(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetBufferfv.invokeExact(buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferfv", e); }
    }

    public static void alGetBufferfv(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALfloat *") float[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetBufferfv.invokeExact(buffer, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferfv", e); }
    }

    public static void alGetBufferi(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment value) {
        try {
            Handles.MH_alGetBufferi.invokeExact(buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferi", e); }
    }

    public static void alGetBufferi(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") int[] value) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value = Marshal.marshal(__overrungl_stack, value);
            Handles.MH_alGetBufferi.invokeExact(buffer, param, __overrungl_ref_value);
            Unmarshal.copy(__overrungl_ref_value, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferi", e); }
    }

    public static void alGetBuffer3i(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment value1, @Out @CType("ALint *") java.lang.foreign.MemorySegment value2, @Out @CType("ALint *") java.lang.foreign.MemorySegment value3) {
        try {
            Handles.MH_alGetBuffer3i.invokeExact(buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3i", e); }
    }

    public static void alGetBuffer3i(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") int[] value1, @Out @CType("ALint *") int[] value2, @Out @CType("ALint *") int[] value3) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_value1 = Marshal.marshal(__overrungl_stack, value1);
            var __overrungl_ref_value2 = Marshal.marshal(__overrungl_stack, value2);
            var __overrungl_ref_value3 = Marshal.marshal(__overrungl_stack, value3);
            Handles.MH_alGetBuffer3i.invokeExact(buffer, param, __overrungl_ref_value1, __overrungl_ref_value2, __overrungl_ref_value3);
            Unmarshal.copy(__overrungl_ref_value1, value1);
            Unmarshal.copy(__overrungl_ref_value2, value2);
            Unmarshal.copy(__overrungl_ref_value3, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3i", e); }
    }

    public static void alGetBufferiv(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") java.lang.foreign.MemorySegment values) {
        try {
            Handles.MH_alGetBufferiv.invokeExact(buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferiv", e); }
    }

    public static void alGetBufferiv(@CType("ALuint") int buffer, @CType("ALenum") int param, @Out @CType("ALint *") int[] values) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            var __overrungl_ref_values = Marshal.marshal(__overrungl_stack, values);
            Handles.MH_alGetBufferiv.invokeExact(buffer, param, __overrungl_ref_values);
            Unmarshal.copy(__overrungl_ref_values, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferiv", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private AL() {
    }

    public static int alGenSources() {
        try (var stack = MemoryStack.pushLocal()) {
            var p = stack.ints(0);
            alGenSources(1, p);
            return p.get(ValueLayout.JAVA_INT, 0);
        }
    }

    public static void alDeleteSources(int source) {
        try (var stack = MemoryStack.pushLocal()) {
            alDeleteSources(1, stack.ints(source));
        }
    }

    public static int alGenBuffers() {
        try (var stack = MemoryStack.pushLocal()) {
            var p = stack.ints(0);
            alGenBuffers(1, p);
            return p.get(ValueLayout.JAVA_INT, 0);
        }
    }

    public static void alDeleteBuffers(int buffer) {
        try (var stack = MemoryStack.pushLocal()) {
            alDeleteBuffers(1, stack.ints(buffer));
        }
    }
}
