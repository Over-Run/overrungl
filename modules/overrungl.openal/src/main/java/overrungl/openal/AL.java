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

import overrungl.internal.RuntimeHelper;
import overrungl.util.MemoryStack;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
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
    public static final int AL_NONE = 0;
    public static final int AL_FALSE = 0;
    public static final int AL_TRUE = 1;
    public static final int AL_SOURCE_RELATIVE = 0x202;
    public static final int AL_CONE_INNER_ANGLE = 0x1001;
    public static final int AL_CONE_OUTER_ANGLE = 0x1002;
    public static final int AL_PITCH = 0x1003;
    public static final int AL_POSITION = 0x1004;
    public static final int AL_DIRECTION = 0x1005;
    public static final int AL_VELOCITY = 0x1006;
    public static final int AL_LOOPING = 0x1007;
    public static final int AL_BUFFER = 0x1009;
    public static final int AL_GAIN = 0x100A;
    public static final int AL_MIN_GAIN = 0x100D;
    public static final int AL_MAX_GAIN = 0x100E;
    public static final int AL_ORIENTATION = 0x100F;
    public static final int AL_SOURCE_STATE = 0x1010;
    public static final int AL_INITIAL = 0x1011;
    public static final int AL_PLAYING = 0x1012;
    public static final int AL_PAUSED = 0x1013;
    public static final int AL_STOPPED = 0x1014;
    public static final int AL_BUFFERS_QUEUED = 0x1015;
    public static final int AL_BUFFERS_PROCESSED = 0x1016;
    public static final int AL_REFERENCE_DISTANCE = 0x1020;
    public static final int AL_ROLLOFF_FACTOR = 0x1021;
    public static final int AL_CONE_OUTER_GAIN = 0x1022;
    public static final int AL_MAX_DISTANCE = 0x1023;
    public static final int AL_SEC_OFFSET = 0x1024;
    public static final int AL_SAMPLE_OFFSET = 0x1025;
    public static final int AL_BYTE_OFFSET = 0x1026;
    public static final int AL_SOURCE_TYPE = 0x1027;
    public static final int AL_STATIC = 0x1028;
    public static final int AL_STREAMING = 0x1029;
    public static final int AL_UNDETERMINED = 0x1030;
    public static final int AL_FORMAT_MONO8 = 0x1100;
    public static final int AL_FORMAT_MONO16 = 0x1101;
    public static final int AL_FORMAT_STEREO8 = 0x1102;
    public static final int AL_FORMAT_STEREO16 = 0x1103;
    public static final int AL_FREQUENCY = 0x2001;
    public static final int AL_BITS = 0x2002;
    public static final int AL_CHANNELS = 0x2003;
    public static final int AL_SIZE = 0x2004;
    public static final int AL_UNUSED = 0x2010;
    public static final int AL_PENDING = 0x2011;
    public static final int AL_PROCESSED = 0x2012;
    public static final int AL_NO_ERROR = 0;
    public static final int AL_INVALID_NAME = 0xA001;
    public static final int AL_INVALID_ENUM = 0xA002;
    public static final int AL_INVALID_VALUE = 0xA003;
    public static final int AL_INVALID_OPERATION = 0xA004;
    public static final int AL_OUT_OF_MEMORY = 0xA005;
    public static final int AL_VENDOR = 0xB001;
    public static final int AL_VERSION = 0xB002;
    public static final int AL_RENDERER = 0xB003;
    public static final int AL_EXTENSIONS = 0xB004;
    public static final int AL_DOPPLER_FACTOR = 0xC000;
    public static final int AL_DOPPLER_VELOCITY = 0xC001;
    public static final int AL_SPEED_OF_SOUND = 0xC003;
    public static final int AL_DISTANCE_MODEL = 0xD000;
    public static final int AL_INVERSE_DISTANCE = 0xD001;
    public static final int AL_INVERSE_DISTANCE_CLAMPED = 0xD002;
    public static final int AL_LINEAR_DISTANCE = 0xD003;
    public static final int AL_LINEAR_DISTANCE_CLAMPED = 0xD004;
    public static final int AL_EXPONENT_DISTANCE = 0xD005;
    public static final int AL_EXPONENT_DISTANCE_CLAMPED = 0xD006;
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `alEnable`.
        public static final MethodHandle MH_alEnable = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alDisable`.
        public static final MethodHandle MH_alDisable = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alIsEnabled`.
        public static final MethodHandle MH_alIsEnabled = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        /// The method handle of `alDopplerFactor`.
        public static final MethodHandle MH_alDopplerFactor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `alDopplerVelocity`.
        public static final MethodHandle MH_alDopplerVelocity = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `alSpeedOfSound`.
        public static final MethodHandle MH_alSpeedOfSound = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        /// The method handle of `alDistanceModel`.
        public static final MethodHandle MH_alDistanceModel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alGetString`.
        public static final MethodHandle MH_alGetString = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `alGetBooleanv`.
        public static final MethodHandle MH_alGetBooleanv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetIntegerv`.
        public static final MethodHandle MH_alGetIntegerv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetFloatv`.
        public static final MethodHandle MH_alGetFloatv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetDoublev`.
        public static final MethodHandle MH_alGetDoublev = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBoolean`.
        public static final MethodHandle MH_alGetBoolean = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        /// The method handle of `alGetInteger`.
        public static final MethodHandle MH_alGetInteger = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alGetFloat`.
        public static final MethodHandle MH_alGetFloat = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `alGetDouble`.
        public static final MethodHandle MH_alGetDouble = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT));
        /// The method handle of `alGetError`.
        public static final MethodHandle MH_alGetError = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        /// The method handle of `alIsExtensionPresent`.
        public static final MethodHandle MH_alIsExtensionPresent = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        /// The method handle of `alGetProcAddress`.
        public static final MethodHandle MH_alGetProcAddress = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetEnumValue`.
        public static final MethodHandle MH_alGetEnumValue = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alListenerf`.
        public static final MethodHandle MH_alListenerf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alListener3f`.
        public static final MethodHandle MH_alListener3f = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alListenerfv`.
        public static final MethodHandle MH_alListenerfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alListeneri`.
        public static final MethodHandle MH_alListeneri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alListener3i`.
        public static final MethodHandle MH_alListener3i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alListeneriv`.
        public static final MethodHandle MH_alListeneriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListenerf`.
        public static final MethodHandle MH_alGetListenerf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListener3f`.
        public static final MethodHandle MH_alGetListener3f = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetListenerfv`.
        public static final MethodHandle MH_alGetListenerfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListeneri`.
        public static final MethodHandle MH_alGetListeneri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetListener3i`.
        public static final MethodHandle MH_alGetListener3i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetListeneriv`.
        public static final MethodHandle MH_alGetListeneriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGenSources`.
        public static final MethodHandle MH_alGenSources = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alDeleteSources`.
        public static final MethodHandle MH_alDeleteSources = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alIsSource`.
        public static final MethodHandle MH_alIsSource = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        /// The method handle of `alSourcef`.
        public static final MethodHandle MH_alSourcef = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alSource3f`.
        public static final MethodHandle MH_alSource3f = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alSourcefv`.
        public static final MethodHandle MH_alSourcefv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourcei`.
        public static final MethodHandle MH_alSourcei = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alSource3i`.
        public static final MethodHandle MH_alSource3i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alSourceiv`.
        public static final MethodHandle MH_alSourceiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcef`.
        public static final MethodHandle MH_alGetSourcef = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSource3f`.
        public static final MethodHandle MH_alGetSource3f = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcefv`.
        public static final MethodHandle MH_alGetSourcefv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourcei`.
        public static final MethodHandle MH_alGetSourcei = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetSource3i`.
        public static final MethodHandle MH_alGetSource3i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetSourceiv`.
        public static final MethodHandle MH_alGetSourceiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourcePlay`.
        public static final MethodHandle MH_alSourcePlay = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alSourceStop`.
        public static final MethodHandle MH_alSourceStop = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alSourceRewind`.
        public static final MethodHandle MH_alSourceRewind = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alSourcePause`.
        public static final MethodHandle MH_alSourcePause = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        /// The method handle of `alSourcePlayv`.
        public static final MethodHandle MH_alSourcePlayv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceStopv`.
        public static final MethodHandle MH_alSourceStopv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceRewindv`.
        public static final MethodHandle MH_alSourceRewindv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourcePausev`.
        public static final MethodHandle MH_alSourcePausev = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceQueueBuffers`.
        public static final MethodHandle MH_alSourceQueueBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alSourceUnqueueBuffers`.
        public static final MethodHandle MH_alSourceUnqueueBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGenBuffers`.
        public static final MethodHandle MH_alGenBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alDeleteBuffers`.
        public static final MethodHandle MH_alDeleteBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alIsBuffer`.
        public static final MethodHandle MH_alIsBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        /// The method handle of `alBufferData`.
        public static final MethodHandle MH_alBufferData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alBufferf`.
        public static final MethodHandle MH_alBufferf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alBuffer3f`.
        public static final MethodHandle MH_alBuffer3f = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        /// The method handle of `alBufferfv`.
        public static final MethodHandle MH_alBufferfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alBufferi`.
        public static final MethodHandle MH_alBufferi = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alBuffer3i`.
        public static final MethodHandle MH_alBuffer3i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `alBufferiv`.
        public static final MethodHandle MH_alBufferiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferf`.
        public static final MethodHandle MH_alGetBufferf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBuffer3f`.
        public static final MethodHandle MH_alGetBuffer3f = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferfv`.
        public static final MethodHandle MH_alGetBufferfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferi`.
        public static final MethodHandle MH_alGetBufferi = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBuffer3i`.
        public static final MethodHandle MH_alGetBuffer3i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferiv`.
        public static final MethodHandle MH_alGetBufferiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The function address of `alEnable`.
        public final MemorySegment PFN_alEnable;
        /// The function address of `alDisable`.
        public final MemorySegment PFN_alDisable;
        /// The function address of `alIsEnabled`.
        public final MemorySegment PFN_alIsEnabled;
        /// The function address of `alDopplerFactor`.
        public final MemorySegment PFN_alDopplerFactor;
        /// The function address of `alDopplerVelocity`.
        public final MemorySegment PFN_alDopplerVelocity;
        /// The function address of `alSpeedOfSound`.
        public final MemorySegment PFN_alSpeedOfSound;
        /// The function address of `alDistanceModel`.
        public final MemorySegment PFN_alDistanceModel;
        /// The function address of `alGetString`.
        public final MemorySegment PFN_alGetString;
        /// The function address of `alGetBooleanv`.
        public final MemorySegment PFN_alGetBooleanv;
        /// The function address of `alGetIntegerv`.
        public final MemorySegment PFN_alGetIntegerv;
        /// The function address of `alGetFloatv`.
        public final MemorySegment PFN_alGetFloatv;
        /// The function address of `alGetDoublev`.
        public final MemorySegment PFN_alGetDoublev;
        /// The function address of `alGetBoolean`.
        public final MemorySegment PFN_alGetBoolean;
        /// The function address of `alGetInteger`.
        public final MemorySegment PFN_alGetInteger;
        /// The function address of `alGetFloat`.
        public final MemorySegment PFN_alGetFloat;
        /// The function address of `alGetDouble`.
        public final MemorySegment PFN_alGetDouble;
        /// The function address of `alGetError`.
        public final MemorySegment PFN_alGetError;
        /// The function address of `alIsExtensionPresent`.
        public final MemorySegment PFN_alIsExtensionPresent;
        /// The function address of `alGetProcAddress`.
        public final MemorySegment PFN_alGetProcAddress;
        /// The function address of `alGetEnumValue`.
        public final MemorySegment PFN_alGetEnumValue;
        /// The function address of `alListenerf`.
        public final MemorySegment PFN_alListenerf;
        /// The function address of `alListener3f`.
        public final MemorySegment PFN_alListener3f;
        /// The function address of `alListenerfv`.
        public final MemorySegment PFN_alListenerfv;
        /// The function address of `alListeneri`.
        public final MemorySegment PFN_alListeneri;
        /// The function address of `alListener3i`.
        public final MemorySegment PFN_alListener3i;
        /// The function address of `alListeneriv`.
        public final MemorySegment PFN_alListeneriv;
        /// The function address of `alGetListenerf`.
        public final MemorySegment PFN_alGetListenerf;
        /// The function address of `alGetListener3f`.
        public final MemorySegment PFN_alGetListener3f;
        /// The function address of `alGetListenerfv`.
        public final MemorySegment PFN_alGetListenerfv;
        /// The function address of `alGetListeneri`.
        public final MemorySegment PFN_alGetListeneri;
        /// The function address of `alGetListener3i`.
        public final MemorySegment PFN_alGetListener3i;
        /// The function address of `alGetListeneriv`.
        public final MemorySegment PFN_alGetListeneriv;
        /// The function address of `alGenSources`.
        public final MemorySegment PFN_alGenSources;
        /// The function address of `alDeleteSources`.
        public final MemorySegment PFN_alDeleteSources;
        /// The function address of `alIsSource`.
        public final MemorySegment PFN_alIsSource;
        /// The function address of `alSourcef`.
        public final MemorySegment PFN_alSourcef;
        /// The function address of `alSource3f`.
        public final MemorySegment PFN_alSource3f;
        /// The function address of `alSourcefv`.
        public final MemorySegment PFN_alSourcefv;
        /// The function address of `alSourcei`.
        public final MemorySegment PFN_alSourcei;
        /// The function address of `alSource3i`.
        public final MemorySegment PFN_alSource3i;
        /// The function address of `alSourceiv`.
        public final MemorySegment PFN_alSourceiv;
        /// The function address of `alGetSourcef`.
        public final MemorySegment PFN_alGetSourcef;
        /// The function address of `alGetSource3f`.
        public final MemorySegment PFN_alGetSource3f;
        /// The function address of `alGetSourcefv`.
        public final MemorySegment PFN_alGetSourcefv;
        /// The function address of `alGetSourcei`.
        public final MemorySegment PFN_alGetSourcei;
        /// The function address of `alGetSource3i`.
        public final MemorySegment PFN_alGetSource3i;
        /// The function address of `alGetSourceiv`.
        public final MemorySegment PFN_alGetSourceiv;
        /// The function address of `alSourcePlay`.
        public final MemorySegment PFN_alSourcePlay;
        /// The function address of `alSourceStop`.
        public final MemorySegment PFN_alSourceStop;
        /// The function address of `alSourceRewind`.
        public final MemorySegment PFN_alSourceRewind;
        /// The function address of `alSourcePause`.
        public final MemorySegment PFN_alSourcePause;
        /// The function address of `alSourcePlayv`.
        public final MemorySegment PFN_alSourcePlayv;
        /// The function address of `alSourceStopv`.
        public final MemorySegment PFN_alSourceStopv;
        /// The function address of `alSourceRewindv`.
        public final MemorySegment PFN_alSourceRewindv;
        /// The function address of `alSourcePausev`.
        public final MemorySegment PFN_alSourcePausev;
        /// The function address of `alSourceQueueBuffers`.
        public final MemorySegment PFN_alSourceQueueBuffers;
        /// The function address of `alSourceUnqueueBuffers`.
        public final MemorySegment PFN_alSourceUnqueueBuffers;
        /// The function address of `alGenBuffers`.
        public final MemorySegment PFN_alGenBuffers;
        /// The function address of `alDeleteBuffers`.
        public final MemorySegment PFN_alDeleteBuffers;
        /// The function address of `alIsBuffer`.
        public final MemorySegment PFN_alIsBuffer;
        /// The function address of `alBufferData`.
        public final MemorySegment PFN_alBufferData;
        /// The function address of `alBufferf`.
        public final MemorySegment PFN_alBufferf;
        /// The function address of `alBuffer3f`.
        public final MemorySegment PFN_alBuffer3f;
        /// The function address of `alBufferfv`.
        public final MemorySegment PFN_alBufferfv;
        /// The function address of `alBufferi`.
        public final MemorySegment PFN_alBufferi;
        /// The function address of `alBuffer3i`.
        public final MemorySegment PFN_alBuffer3i;
        /// The function address of `alBufferiv`.
        public final MemorySegment PFN_alBufferiv;
        /// The function address of `alGetBufferf`.
        public final MemorySegment PFN_alGetBufferf;
        /// The function address of `alGetBuffer3f`.
        public final MemorySegment PFN_alGetBuffer3f;
        /// The function address of `alGetBufferfv`.
        public final MemorySegment PFN_alGetBufferfv;
        /// The function address of `alGetBufferi`.
        public final MemorySegment PFN_alGetBufferi;
        /// The function address of `alGetBuffer3i`.
        public final MemorySegment PFN_alGetBuffer3i;
        /// The function address of `alGetBufferiv`.
        public final MemorySegment PFN_alGetBufferiv;
        private Handles() {
            PFN_alEnable = ALInternal.lookup().findOrThrow("alEnable");
            PFN_alDisable = ALInternal.lookup().findOrThrow("alDisable");
            PFN_alIsEnabled = ALInternal.lookup().findOrThrow("alIsEnabled");
            PFN_alDopplerFactor = ALInternal.lookup().findOrThrow("alDopplerFactor");
            PFN_alDopplerVelocity = ALInternal.lookup().findOrThrow("alDopplerVelocity");
            PFN_alSpeedOfSound = ALInternal.lookup().findOrThrow("alSpeedOfSound");
            PFN_alDistanceModel = ALInternal.lookup().findOrThrow("alDistanceModel");
            PFN_alGetString = ALInternal.lookup().findOrThrow("alGetString");
            PFN_alGetBooleanv = ALInternal.lookup().findOrThrow("alGetBooleanv");
            PFN_alGetIntegerv = ALInternal.lookup().findOrThrow("alGetIntegerv");
            PFN_alGetFloatv = ALInternal.lookup().findOrThrow("alGetFloatv");
            PFN_alGetDoublev = ALInternal.lookup().findOrThrow("alGetDoublev");
            PFN_alGetBoolean = ALInternal.lookup().findOrThrow("alGetBoolean");
            PFN_alGetInteger = ALInternal.lookup().findOrThrow("alGetInteger");
            PFN_alGetFloat = ALInternal.lookup().findOrThrow("alGetFloat");
            PFN_alGetDouble = ALInternal.lookup().findOrThrow("alGetDouble");
            PFN_alGetError = ALInternal.lookup().findOrThrow("alGetError");
            PFN_alIsExtensionPresent = ALInternal.lookup().findOrThrow("alIsExtensionPresent");
            PFN_alGetProcAddress = ALInternal.lookup().findOrThrow("alGetProcAddress");
            PFN_alGetEnumValue = ALInternal.lookup().findOrThrow("alGetEnumValue");
            PFN_alListenerf = ALInternal.lookup().findOrThrow("alListenerf");
            PFN_alListener3f = ALInternal.lookup().findOrThrow("alListener3f");
            PFN_alListenerfv = ALInternal.lookup().findOrThrow("alListenerfv");
            PFN_alListeneri = ALInternal.lookup().findOrThrow("alListeneri");
            PFN_alListener3i = ALInternal.lookup().findOrThrow("alListener3i");
            PFN_alListeneriv = ALInternal.lookup().findOrThrow("alListeneriv");
            PFN_alGetListenerf = ALInternal.lookup().findOrThrow("alGetListenerf");
            PFN_alGetListener3f = ALInternal.lookup().findOrThrow("alGetListener3f");
            PFN_alGetListenerfv = ALInternal.lookup().findOrThrow("alGetListenerfv");
            PFN_alGetListeneri = ALInternal.lookup().findOrThrow("alGetListeneri");
            PFN_alGetListener3i = ALInternal.lookup().findOrThrow("alGetListener3i");
            PFN_alGetListeneriv = ALInternal.lookup().findOrThrow("alGetListeneriv");
            PFN_alGenSources = ALInternal.lookup().findOrThrow("alGenSources");
            PFN_alDeleteSources = ALInternal.lookup().findOrThrow("alDeleteSources");
            PFN_alIsSource = ALInternal.lookup().findOrThrow("alIsSource");
            PFN_alSourcef = ALInternal.lookup().findOrThrow("alSourcef");
            PFN_alSource3f = ALInternal.lookup().findOrThrow("alSource3f");
            PFN_alSourcefv = ALInternal.lookup().findOrThrow("alSourcefv");
            PFN_alSourcei = ALInternal.lookup().findOrThrow("alSourcei");
            PFN_alSource3i = ALInternal.lookup().findOrThrow("alSource3i");
            PFN_alSourceiv = ALInternal.lookup().findOrThrow("alSourceiv");
            PFN_alGetSourcef = ALInternal.lookup().findOrThrow("alGetSourcef");
            PFN_alGetSource3f = ALInternal.lookup().findOrThrow("alGetSource3f");
            PFN_alGetSourcefv = ALInternal.lookup().findOrThrow("alGetSourcefv");
            PFN_alGetSourcei = ALInternal.lookup().findOrThrow("alGetSourcei");
            PFN_alGetSource3i = ALInternal.lookup().findOrThrow("alGetSource3i");
            PFN_alGetSourceiv = ALInternal.lookup().findOrThrow("alGetSourceiv");
            PFN_alSourcePlay = ALInternal.lookup().findOrThrow("alSourcePlay");
            PFN_alSourceStop = ALInternal.lookup().findOrThrow("alSourceStop");
            PFN_alSourceRewind = ALInternal.lookup().findOrThrow("alSourceRewind");
            PFN_alSourcePause = ALInternal.lookup().findOrThrow("alSourcePause");
            PFN_alSourcePlayv = ALInternal.lookup().findOrThrow("alSourcePlayv");
            PFN_alSourceStopv = ALInternal.lookup().findOrThrow("alSourceStopv");
            PFN_alSourceRewindv = ALInternal.lookup().findOrThrow("alSourceRewindv");
            PFN_alSourcePausev = ALInternal.lookup().findOrThrow("alSourcePausev");
            PFN_alSourceQueueBuffers = ALInternal.lookup().findOrThrow("alSourceQueueBuffers");
            PFN_alSourceUnqueueBuffers = ALInternal.lookup().findOrThrow("alSourceUnqueueBuffers");
            PFN_alGenBuffers = ALInternal.lookup().findOrThrow("alGenBuffers");
            PFN_alDeleteBuffers = ALInternal.lookup().findOrThrow("alDeleteBuffers");
            PFN_alIsBuffer = ALInternal.lookup().findOrThrow("alIsBuffer");
            PFN_alBufferData = ALInternal.lookup().findOrThrow("alBufferData");
            PFN_alBufferf = ALInternal.lookup().findOrThrow("alBufferf");
            PFN_alBuffer3f = ALInternal.lookup().findOrThrow("alBuffer3f");
            PFN_alBufferfv = ALInternal.lookup().findOrThrow("alBufferfv");
            PFN_alBufferi = ALInternal.lookup().findOrThrow("alBufferi");
            PFN_alBuffer3i = ALInternal.lookup().findOrThrow("alBuffer3i");
            PFN_alBufferiv = ALInternal.lookup().findOrThrow("alBufferiv");
            PFN_alGetBufferf = ALInternal.lookup().findOrThrow("alGetBufferf");
            PFN_alGetBuffer3f = ALInternal.lookup().findOrThrow("alGetBuffer3f");
            PFN_alGetBufferfv = ALInternal.lookup().findOrThrow("alGetBufferfv");
            PFN_alGetBufferi = ALInternal.lookup().findOrThrow("alGetBufferi");
            PFN_alGetBuffer3i = ALInternal.lookup().findOrThrow("alGetBuffer3i");
            PFN_alGetBufferiv = ALInternal.lookup().findOrThrow("alGetBufferiv");
        }
        private static volatile Handles instance;
        private static Handles get() {
            if (instance == null) {
                synchronized (Handles.class) {
                    if (instance == null) { instance = new Handles(); }
                }
            }
            return instance;
        }
    }

    /// ```
    /// void alEnable(int capability);
    /// ```
    public static void alEnable(int capability) {
        try {
            Handles.MH_alEnable.invokeExact(Handles.get().PFN_alEnable, capability);
        } catch (Throwable e) { throw new RuntimeException("error in alEnable", e); }
    }

    /// ```
    /// void alDisable(int capability);
    /// ```
    public static void alDisable(int capability) {
        try {
            Handles.MH_alDisable.invokeExact(Handles.get().PFN_alDisable, capability);
        } catch (Throwable e) { throw new RuntimeException("error in alDisable", e); }
    }

    /// ```
    /// char alIsEnabled(int capability);
    /// ```
    public static boolean alIsEnabled(int capability) {
        try {
            return (((byte) Handles.MH_alIsEnabled.invokeExact(Handles.get().PFN_alIsEnabled, capability)) != 0);
        } catch (Throwable e) { throw new RuntimeException("error in alIsEnabled", e); }
    }

    /// ```
    /// void alDopplerFactor(float value);
    /// ```
    public static void alDopplerFactor(float value) {
        try {
            Handles.MH_alDopplerFactor.invokeExact(Handles.get().PFN_alDopplerFactor, value);
        } catch (Throwable e) { throw new RuntimeException("error in alDopplerFactor", e); }
    }

    /// ```
    /// void alDopplerVelocity(float value);
    /// ```
    public static void alDopplerVelocity(float value) {
        try {
            Handles.MH_alDopplerVelocity.invokeExact(Handles.get().PFN_alDopplerVelocity, value);
        } catch (Throwable e) { throw new RuntimeException("error in alDopplerVelocity", e); }
    }

    /// ```
    /// void alSpeedOfSound(float value);
    /// ```
    public static void alSpeedOfSound(float value) {
        try {
            Handles.MH_alSpeedOfSound.invokeExact(Handles.get().PFN_alSpeedOfSound, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSpeedOfSound", e); }
    }

    /// ```
    /// void alDistanceModel(int distanceModel);
    /// ```
    public static void alDistanceModel(int distanceModel) {
        try {
            Handles.MH_alDistanceModel.invokeExact(Handles.get().PFN_alDistanceModel, distanceModel);
        } catch (Throwable e) { throw new RuntimeException("error in alDistanceModel", e); }
    }

    /// ```
    /// const ALchar* alGetString(int param);
    /// ```
    public static MemorySegment alGetString(int param) {
        try {
            return (MemorySegment) Handles.MH_alGetString.invokeExact(Handles.get().PFN_alGetString, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetString", e); }
    }

    /// ```
    /// void alGetBooleanv(int param, ALboolean* values);
    /// ```
    public static void alGetBooleanv(int param, MemorySegment values) {
        try {
            Handles.MH_alGetBooleanv.invokeExact(Handles.get().PFN_alGetBooleanv, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBooleanv", e); }
    }

    /// ```
    /// void alGetIntegerv(int param, ALint* values);
    /// ```
    public static void alGetIntegerv(int param, MemorySegment values) {
        try {
            Handles.MH_alGetIntegerv.invokeExact(Handles.get().PFN_alGetIntegerv, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetIntegerv", e); }
    }

    /// ```
    /// void alGetFloatv(int param, ALfloat* values);
    /// ```
    public static void alGetFloatv(int param, MemorySegment values) {
        try {
            Handles.MH_alGetFloatv.invokeExact(Handles.get().PFN_alGetFloatv, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFloatv", e); }
    }

    /// ```
    /// void alGetDoublev(int param, ALdouble* values);
    /// ```
    public static void alGetDoublev(int param, MemorySegment values) {
        try {
            Handles.MH_alGetDoublev.invokeExact(Handles.get().PFN_alGetDoublev, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDoublev", e); }
    }

    /// ```
    /// char alGetBoolean(int param);
    /// ```
    public static boolean alGetBoolean(int param) {
        try {
            return (((byte) Handles.MH_alGetBoolean.invokeExact(Handles.get().PFN_alGetBoolean, param)) != 0);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBoolean", e); }
    }

    /// ```
    /// int alGetInteger(int param);
    /// ```
    public static int alGetInteger(int param) {
        try {
            return (int) Handles.MH_alGetInteger.invokeExact(Handles.get().PFN_alGetInteger, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetInteger", e); }
    }

    /// ```
    /// float alGetFloat(int param);
    /// ```
    public static float alGetFloat(int param) {
        try {
            return (float) Handles.MH_alGetFloat.invokeExact(Handles.get().PFN_alGetFloat, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFloat", e); }
    }

    /// ```
    /// double alGetDouble(int param);
    /// ```
    public static double alGetDouble(int param) {
        try {
            return (double) Handles.MH_alGetDouble.invokeExact(Handles.get().PFN_alGetDouble, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDouble", e); }
    }

    /// ```
    /// int alGetError();
    /// ```
    public static int alGetError() {
        try {
            return (int) Handles.MH_alGetError.invokeExact(Handles.get().PFN_alGetError);
        } catch (Throwable e) { throw new RuntimeException("error in alGetError", e); }
    }

    /// ```
    /// char alIsExtensionPresent(const ALchar* extname);
    /// ```
    public static boolean alIsExtensionPresent(MemorySegment extname) {
        try {
            return (((byte) Handles.MH_alIsExtensionPresent.invokeExact(Handles.get().PFN_alIsExtensionPresent, extname)) != 0);
        } catch (Throwable e) { throw new RuntimeException("error in alIsExtensionPresent", e); }
    }

    /// ```
    /// void* alGetProcAddress(const ALchar* fname);
    /// ```
    public static MemorySegment alGetProcAddress(MemorySegment fname) {
        try {
            return (MemorySegment) Handles.MH_alGetProcAddress.invokeExact(Handles.get().PFN_alGetProcAddress, fname);
        } catch (Throwable e) { throw new RuntimeException("error in alGetProcAddress", e); }
    }

    /// ```
    /// int alGetEnumValue(const ALchar* ename);
    /// ```
    public static int alGetEnumValue(MemorySegment ename) {
        try {
            return (int) Handles.MH_alGetEnumValue.invokeExact(Handles.get().PFN_alGetEnumValue, ename);
        } catch (Throwable e) { throw new RuntimeException("error in alGetEnumValue", e); }
    }

    /// ```
    /// void alListenerf(int param, float value);
    /// ```
    public static void alListenerf(int param, float value) {
        try {
            Handles.MH_alListenerf.invokeExact(Handles.get().PFN_alListenerf, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alListenerf", e); }
    }

    /// ```
    /// void alListener3f(int param, float value1, float value2, float value3);
    /// ```
    public static void alListener3f(int param, float value1, float value2, float value3) {
        try {
            Handles.MH_alListener3f.invokeExact(Handles.get().PFN_alListener3f, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alListener3f", e); }
    }

    /// ```
    /// void alListenerfv(int param, const ALfloat* values);
    /// ```
    public static void alListenerfv(int param, MemorySegment values) {
        try {
            Handles.MH_alListenerfv.invokeExact(Handles.get().PFN_alListenerfv, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alListenerfv", e); }
    }

    /// ```
    /// void alListeneri(int param, int value);
    /// ```
    public static void alListeneri(int param, int value) {
        try {
            Handles.MH_alListeneri.invokeExact(Handles.get().PFN_alListeneri, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alListeneri", e); }
    }

    /// ```
    /// void alListener3i(int param, int value1, int value2, int value3);
    /// ```
    public static void alListener3i(int param, int value1, int value2, int value3) {
        try {
            Handles.MH_alListener3i.invokeExact(Handles.get().PFN_alListener3i, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alListener3i", e); }
    }

    /// ```
    /// void alListeneriv(int param, const ALint* values);
    /// ```
    public static void alListeneriv(int param, MemorySegment values) {
        try {
            Handles.MH_alListeneriv.invokeExact(Handles.get().PFN_alListeneriv, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alListeneriv", e); }
    }

    /// ```
    /// void alGetListenerf(int param, ALfloat* value);
    /// ```
    public static void alGetListenerf(int param, MemorySegment value) {
        try {
            Handles.MH_alGetListenerf.invokeExact(Handles.get().PFN_alGetListenerf, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerf", e); }
    }

    /// ```
    /// void alGetListener3f(int param, ALfloat* value1, ALfloat* value2, ALfloat* value3);
    /// ```
    public static void alGetListener3f(int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try {
            Handles.MH_alGetListener3f.invokeExact(Handles.get().PFN_alGetListener3f, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3f", e); }
    }

    /// ```
    /// void alGetListenerfv(int param, ALfloat* values);
    /// ```
    public static void alGetListenerfv(int param, MemorySegment values) {
        try {
            Handles.MH_alGetListenerfv.invokeExact(Handles.get().PFN_alGetListenerfv, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerfv", e); }
    }

    /// ```
    /// void alGetListeneri(int param, ALint* value);
    /// ```
    public static void alGetListeneri(int param, MemorySegment value) {
        try {
            Handles.MH_alGetListeneri.invokeExact(Handles.get().PFN_alGetListeneri, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneri", e); }
    }

    /// ```
    /// void alGetListener3i(int param, ALint* value1, ALint* value2, ALint* value3);
    /// ```
    public static void alGetListener3i(int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try {
            Handles.MH_alGetListener3i.invokeExact(Handles.get().PFN_alGetListener3i, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3i", e); }
    }

    /// ```
    /// void alGetListeneriv(int param, ALint* values);
    /// ```
    public static void alGetListeneriv(int param, MemorySegment values) {
        try {
            Handles.MH_alGetListeneriv.invokeExact(Handles.get().PFN_alGetListeneriv, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneriv", e); }
    }

    /// ```
    /// void alGenSources(int n, ALuint* sources);
    /// ```
    public static void alGenSources(int n, MemorySegment sources) {
        try {
            Handles.MH_alGenSources.invokeExact(Handles.get().PFN_alGenSources, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alGenSources", e); }
    }

    /// ```
    /// void alDeleteSources(int n, const ALuint* sources);
    /// ```
    public static void alDeleteSources(int n, MemorySegment sources) {
        try {
            Handles.MH_alDeleteSources.invokeExact(Handles.get().PFN_alDeleteSources, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteSources", e); }
    }

    /// ```
    /// char alIsSource(unsigned int source);
    /// ```
    public static boolean alIsSource(int source) {
        try {
            return (((byte) Handles.MH_alIsSource.invokeExact(Handles.get().PFN_alIsSource, source)) != 0);
        } catch (Throwable e) { throw new RuntimeException("error in alIsSource", e); }
    }

    /// ```
    /// void alSourcef(unsigned int source, int param, float value);
    /// ```
    public static void alSourcef(int source, int param, float value) {
        try {
            Handles.MH_alSourcef.invokeExact(Handles.get().PFN_alSourcef, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcef", e); }
    }

    /// ```
    /// void alSource3f(unsigned int source, int param, float value1, float value2, float value3);
    /// ```
    public static void alSource3f(int source, int param, float value1, float value2, float value3) {
        try {
            Handles.MH_alSource3f.invokeExact(Handles.get().PFN_alSource3f, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3f", e); }
    }

    /// ```
    /// void alSourcefv(unsigned int source, int param, const ALfloat* values);
    /// ```
    public static void alSourcefv(int source, int param, MemorySegment values) {
        try {
            Handles.MH_alSourcefv.invokeExact(Handles.get().PFN_alSourcefv, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcefv", e); }
    }

    /// ```
    /// void alSourcei(unsigned int source, int param, int value);
    /// ```
    public static void alSourcei(int source, int param, int value) {
        try {
            Handles.MH_alSourcei.invokeExact(Handles.get().PFN_alSourcei, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcei", e); }
    }

    /// ```
    /// void alSource3i(unsigned int source, int param, int value1, int value2, int value3);
    /// ```
    public static void alSource3i(int source, int param, int value1, int value2, int value3) {
        try {
            Handles.MH_alSource3i.invokeExact(Handles.get().PFN_alSource3i, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3i", e); }
    }

    /// ```
    /// void alSourceiv(unsigned int source, int param, const ALint* values);
    /// ```
    public static void alSourceiv(int source, int param, MemorySegment values) {
        try {
            Handles.MH_alSourceiv.invokeExact(Handles.get().PFN_alSourceiv, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceiv", e); }
    }

    /// ```
    /// void alGetSourcef(unsigned int source, int param, ALfloat* value);
    /// ```
    public static void alGetSourcef(int source, int param, MemorySegment value) {
        try {
            Handles.MH_alGetSourcef.invokeExact(Handles.get().PFN_alGetSourcef, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcef", e); }
    }

    /// ```
    /// void alGetSource3f(unsigned int source, int param, ALfloat* value1, ALfloat* value2, ALfloat* value3);
    /// ```
    public static void alGetSource3f(int source, int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try {
            Handles.MH_alGetSource3f.invokeExact(Handles.get().PFN_alGetSource3f, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3f", e); }
    }

    /// ```
    /// void alGetSourcefv(unsigned int source, int param, ALfloat* values);
    /// ```
    public static void alGetSourcefv(int source, int param, MemorySegment values) {
        try {
            Handles.MH_alGetSourcefv.invokeExact(Handles.get().PFN_alGetSourcefv, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcefv", e); }
    }

    /// ```
    /// void alGetSourcei(unsigned int source, int param, ALint* value);
    /// ```
    public static void alGetSourcei(int source, int param, MemorySegment value) {
        try {
            Handles.MH_alGetSourcei.invokeExact(Handles.get().PFN_alGetSourcei, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcei", e); }
    }

    /// ```
    /// void alGetSource3i(unsigned int source, int param, ALint* value1, ALint* value2, ALint* value3);
    /// ```
    public static void alGetSource3i(int source, int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try {
            Handles.MH_alGetSource3i.invokeExact(Handles.get().PFN_alGetSource3i, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3i", e); }
    }

    /// ```
    /// void alGetSourceiv(unsigned int source, int param, ALint* values);
    /// ```
    public static void alGetSourceiv(int source, int param, MemorySegment values) {
        try {
            Handles.MH_alGetSourceiv.invokeExact(Handles.get().PFN_alGetSourceiv, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourceiv", e); }
    }

    /// ```
    /// void alSourcePlay(unsigned int source);
    /// ```
    public static void alSourcePlay(int source) {
        try {
            Handles.MH_alSourcePlay.invokeExact(Handles.get().PFN_alSourcePlay, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlay", e); }
    }

    /// ```
    /// void alSourceStop(unsigned int source);
    /// ```
    public static void alSourceStop(int source) {
        try {
            Handles.MH_alSourceStop.invokeExact(Handles.get().PFN_alSourceStop, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceStop", e); }
    }

    /// ```
    /// void alSourceRewind(unsigned int source);
    /// ```
    public static void alSourceRewind(int source) {
        try {
            Handles.MH_alSourceRewind.invokeExact(Handles.get().PFN_alSourceRewind, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceRewind", e); }
    }

    /// ```
    /// void alSourcePause(unsigned int source);
    /// ```
    public static void alSourcePause(int source) {
        try {
            Handles.MH_alSourcePause.invokeExact(Handles.get().PFN_alSourcePause, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePause", e); }
    }

    /// ```
    /// void alSourcePlayv(int n, const ALuint* sources);
    /// ```
    public static void alSourcePlayv(int n, MemorySegment sources) {
        try {
            Handles.MH_alSourcePlayv.invokeExact(Handles.get().PFN_alSourcePlayv, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayv", e); }
    }

    /// ```
    /// void alSourceStopv(int n, const ALuint* sources);
    /// ```
    public static void alSourceStopv(int n, MemorySegment sources) {
        try {
            Handles.MH_alSourceStopv.invokeExact(Handles.get().PFN_alSourceStopv, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceStopv", e); }
    }

    /// ```
    /// void alSourceRewindv(int n, const ALuint* sources);
    /// ```
    public static void alSourceRewindv(int n, MemorySegment sources) {
        try {
            Handles.MH_alSourceRewindv.invokeExact(Handles.get().PFN_alSourceRewindv, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceRewindv", e); }
    }

    /// ```
    /// void alSourcePausev(int n, const ALuint* sources);
    /// ```
    public static void alSourcePausev(int n, MemorySegment sources) {
        try {
            Handles.MH_alSourcePausev.invokeExact(Handles.get().PFN_alSourcePausev, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePausev", e); }
    }

    /// ```
    /// void alSourceQueueBuffers(unsigned int source, int nb, const ALuint* buffers);
    /// ```
    public static void alSourceQueueBuffers(int source, int nb, MemorySegment buffers) {
        try {
            Handles.MH_alSourceQueueBuffers.invokeExact(Handles.get().PFN_alSourceQueueBuffers, source, nb, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceQueueBuffers", e); }
    }

    /// ```
    /// void alSourceUnqueueBuffers(unsigned int source, int nb, ALuint* buffers);
    /// ```
    public static void alSourceUnqueueBuffers(int source, int nb, MemorySegment buffers) {
        try {
            Handles.MH_alSourceUnqueueBuffers.invokeExact(Handles.get().PFN_alSourceUnqueueBuffers, source, nb, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceUnqueueBuffers", e); }
    }

    /// ```
    /// void alGenBuffers(int n, ALuint* buffers);
    /// ```
    public static void alGenBuffers(int n, MemorySegment buffers) {
        try {
            Handles.MH_alGenBuffers.invokeExact(Handles.get().PFN_alGenBuffers, n, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alGenBuffers", e); }
    }

    /// ```
    /// void alDeleteBuffers(int n, const ALuint* buffers);
    /// ```
    public static void alDeleteBuffers(int n, MemorySegment buffers) {
        try {
            Handles.MH_alDeleteBuffers.invokeExact(Handles.get().PFN_alDeleteBuffers, n, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteBuffers", e); }
    }

    /// ```
    /// char alIsBuffer(unsigned int buffer);
    /// ```
    public static boolean alIsBuffer(int buffer) {
        try {
            return (((byte) Handles.MH_alIsBuffer.invokeExact(Handles.get().PFN_alIsBuffer, buffer)) != 0);
        } catch (Throwable e) { throw new RuntimeException("error in alIsBuffer", e); }
    }

    /// ```
    /// void alBufferData(unsigned int buffer, int format, const ALvoid* data, int size, int samplerate);
    /// ```
    public static void alBufferData(int buffer, int format, MemorySegment data, int size, int samplerate) {
        try {
            Handles.MH_alBufferData.invokeExact(Handles.get().PFN_alBufferData, buffer, format, data, size, samplerate);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferData", e); }
    }

    /// ```
    /// void alBufferf(unsigned int buffer, int param, float value);
    /// ```
    public static void alBufferf(int buffer, int param, float value) {
        try {
            Handles.MH_alBufferf.invokeExact(Handles.get().PFN_alBufferf, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferf", e); }
    }

    /// ```
    /// void alBuffer3f(unsigned int buffer, int param, float value1, float value2, float value3);
    /// ```
    public static void alBuffer3f(int buffer, int param, float value1, float value2, float value3) {
        try {
            Handles.MH_alBuffer3f.invokeExact(Handles.get().PFN_alBuffer3f, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alBuffer3f", e); }
    }

    /// ```
    /// void alBufferfv(unsigned int buffer, int param, const ALfloat* values);
    /// ```
    public static void alBufferfv(int buffer, int param, MemorySegment values) {
        try {
            Handles.MH_alBufferfv.invokeExact(Handles.get().PFN_alBufferfv, buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferfv", e); }
    }

    /// ```
    /// void alBufferi(unsigned int buffer, int param, int value);
    /// ```
    public static void alBufferi(int buffer, int param, int value) {
        try {
            Handles.MH_alBufferi.invokeExact(Handles.get().PFN_alBufferi, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferi", e); }
    }

    /// ```
    /// void alBuffer3i(unsigned int buffer, int param, int value1, int value2, int value3);
    /// ```
    public static void alBuffer3i(int buffer, int param, int value1, int value2, int value3) {
        try {
            Handles.MH_alBuffer3i.invokeExact(Handles.get().PFN_alBuffer3i, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alBuffer3i", e); }
    }

    /// ```
    /// void alBufferiv(unsigned int buffer, int param, const ALint* values);
    /// ```
    public static void alBufferiv(int buffer, int param, MemorySegment values) {
        try {
            Handles.MH_alBufferiv.invokeExact(Handles.get().PFN_alBufferiv, buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferiv", e); }
    }

    /// ```
    /// void alGetBufferf(unsigned int buffer, int param, ALfloat* value);
    /// ```
    public static void alGetBufferf(int buffer, int param, MemorySegment value) {
        try {
            Handles.MH_alGetBufferf.invokeExact(Handles.get().PFN_alGetBufferf, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferf", e); }
    }

    /// ```
    /// void alGetBuffer3f(unsigned int buffer, int param, ALfloat* value1, ALfloat* value2, ALfloat* value3);
    /// ```
    public static void alGetBuffer3f(int buffer, int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try {
            Handles.MH_alGetBuffer3f.invokeExact(Handles.get().PFN_alGetBuffer3f, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3f", e); }
    }

    /// ```
    /// void alGetBufferfv(unsigned int buffer, int param, ALfloat* values);
    /// ```
    public static void alGetBufferfv(int buffer, int param, MemorySegment values) {
        try {
            Handles.MH_alGetBufferfv.invokeExact(Handles.get().PFN_alGetBufferfv, buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferfv", e); }
    }

    /// ```
    /// void alGetBufferi(unsigned int buffer, int param, ALint* value);
    /// ```
    public static void alGetBufferi(int buffer, int param, MemorySegment value) {
        try {
            Handles.MH_alGetBufferi.invokeExact(Handles.get().PFN_alGetBufferi, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferi", e); }
    }

    /// ```
    /// void alGetBuffer3i(unsigned int buffer, int param, ALint* value1, ALint* value2, ALint* value3);
    /// ```
    public static void alGetBuffer3i(int buffer, int param, MemorySegment value1, MemorySegment value2, MemorySegment value3) {
        try {
            Handles.MH_alGetBuffer3i.invokeExact(Handles.get().PFN_alGetBuffer3i, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3i", e); }
    }

    /// ```
    /// void alGetBufferiv(unsigned int buffer, int param, ALint* values);
    /// ```
    public static void alGetBufferiv(int buffer, int param, MemorySegment values) {
        try {
            Handles.MH_alGetBufferiv.invokeExact(Handles.get().PFN_alGetBufferiv, buffer, param, values);
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
