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
package overrungl.openal;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.*;
import overrungl.util.*;
public final class ALEXTDirectContext {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `alcGetProcAddress2`.
        public static final FunctionDescriptor FD_alcGetProcAddress2 = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alEnableDirect`.
        public static final FunctionDescriptor FD_alEnableDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alDisableDirect`.
        public static final FunctionDescriptor FD_alDisableDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alIsEnabledDirect`.
        public static final FunctionDescriptor FD_alIsEnabledDirect = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alDopplerFactorDirect`.
        public static final FunctionDescriptor FD_alDopplerFactorDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alSpeedOfSoundDirect`.
        public static final FunctionDescriptor FD_alSpeedOfSoundDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alDistanceModelDirect`.
        public static final FunctionDescriptor FD_alDistanceModelDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alGetStringDirect`.
        public static final FunctionDescriptor FD_alGetStringDirect = FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alGetBooleanvDirect`.
        public static final FunctionDescriptor FD_alGetBooleanvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetIntegervDirect`.
        public static final FunctionDescriptor FD_alGetIntegervDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetFloatvDirect`.
        public static final FunctionDescriptor FD_alGetFloatvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetDoublevDirect`.
        public static final FunctionDescriptor FD_alGetDoublevDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBooleanDirect`.
        public static final FunctionDescriptor FD_alGetBooleanDirect = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alGetIntegerDirect`.
        public static final FunctionDescriptor FD_alGetIntegerDirect = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alGetFloatDirect`.
        public static final FunctionDescriptor FD_alGetFloatDirect = FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alGetDoubleDirect`.
        public static final FunctionDescriptor FD_alGetDoubleDirect = FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alGetErrorDirect`.
        public static final FunctionDescriptor FD_alGetErrorDirect = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alIsExtensionPresentDirect`.
        public static final FunctionDescriptor FD_alIsExtensionPresentDirect = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alGetProcAddressDirect`.
        public static final FunctionDescriptor FD_alGetProcAddressDirect = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alGetEnumValueDirect`.
        public static final FunctionDescriptor FD_alGetEnumValueDirect = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alListenerfDirect`.
        public static final FunctionDescriptor FD_alListenerfDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alListener3fDirect`.
        public static final FunctionDescriptor FD_alListener3fDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alListenerfvDirect`.
        public static final FunctionDescriptor FD_alListenerfvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alListeneriDirect`.
        public static final FunctionDescriptor FD_alListeneriDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alListener3iDirect`.
        public static final FunctionDescriptor FD_alListener3iDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alListenerivDirect`.
        public static final FunctionDescriptor FD_alListenerivDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetListenerfDirect`.
        public static final FunctionDescriptor FD_alGetListenerfDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetListener3fDirect`.
        public static final FunctionDescriptor FD_alGetListener3fDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetListenerfvDirect`.
        public static final FunctionDescriptor FD_alGetListenerfvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetListeneriDirect`.
        public static final FunctionDescriptor FD_alGetListeneriDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetListener3iDirect`.
        public static final FunctionDescriptor FD_alGetListener3iDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetListenerivDirect`.
        public static final FunctionDescriptor FD_alGetListenerivDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGenSourcesDirect`.
        public static final FunctionDescriptor FD_alGenSourcesDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alDeleteSourcesDirect`.
        public static final FunctionDescriptor FD_alDeleteSourcesDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alIsSourceDirect`.
        public static final FunctionDescriptor FD_alIsSourceDirect = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alSourcefDirect`.
        public static final FunctionDescriptor FD_alSourcefDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alSource3fDirect`.
        public static final FunctionDescriptor FD_alSource3fDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alSourcefvDirect`.
        public static final FunctionDescriptor FD_alSourcefvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourceiDirect`.
        public static final FunctionDescriptor FD_alSourceiDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alSource3iDirect`.
        public static final FunctionDescriptor FD_alSource3iDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alSourceivDirect`.
        public static final FunctionDescriptor FD_alSourceivDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSourcefDirect`.
        public static final FunctionDescriptor FD_alGetSourcefDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSource3fDirect`.
        public static final FunctionDescriptor FD_alGetSource3fDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSourcefvDirect`.
        public static final FunctionDescriptor FD_alGetSourcefvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSourceiDirect`.
        public static final FunctionDescriptor FD_alGetSourceiDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSource3iDirect`.
        public static final FunctionDescriptor FD_alGetSource3iDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSourceivDirect`.
        public static final FunctionDescriptor FD_alGetSourceivDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourcePlayDirect`.
        public static final FunctionDescriptor FD_alSourcePlayDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alSourceStopDirect`.
        public static final FunctionDescriptor FD_alSourceStopDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alSourceRewindDirect`.
        public static final FunctionDescriptor FD_alSourceRewindDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alSourcePauseDirect`.
        public static final FunctionDescriptor FD_alSourcePauseDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alSourcePlayvDirect`.
        public static final FunctionDescriptor FD_alSourcePlayvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourceStopvDirect`.
        public static final FunctionDescriptor FD_alSourceStopvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourceRewindvDirect`.
        public static final FunctionDescriptor FD_alSourceRewindvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourcePausevDirect`.
        public static final FunctionDescriptor FD_alSourcePausevDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourceQueueBuffersDirect`.
        public static final FunctionDescriptor FD_alSourceQueueBuffersDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourceUnqueueBuffersDirect`.
        public static final FunctionDescriptor FD_alSourceUnqueueBuffersDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGenBuffersDirect`.
        public static final FunctionDescriptor FD_alGenBuffersDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alDeleteBuffersDirect`.
        public static final FunctionDescriptor FD_alDeleteBuffersDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alIsBufferDirect`.
        public static final FunctionDescriptor FD_alIsBufferDirect = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alBufferDataDirect`.
        public static final FunctionDescriptor FD_alBufferDataDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alBufferfDirect`.
        public static final FunctionDescriptor FD_alBufferfDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alBuffer3fDirect`.
        public static final FunctionDescriptor FD_alBuffer3fDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alBufferfvDirect`.
        public static final FunctionDescriptor FD_alBufferfvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alBufferiDirect`.
        public static final FunctionDescriptor FD_alBufferiDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alBuffer3iDirect`.
        public static final FunctionDescriptor FD_alBuffer3iDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alBufferivDirect`.
        public static final FunctionDescriptor FD_alBufferivDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBufferfDirect`.
        public static final FunctionDescriptor FD_alGetBufferfDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBuffer3fDirect`.
        public static final FunctionDescriptor FD_alGetBuffer3fDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBufferfvDirect`.
        public static final FunctionDescriptor FD_alGetBufferfvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBufferiDirect`.
        public static final FunctionDescriptor FD_alGetBufferiDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBuffer3iDirect`.
        public static final FunctionDescriptor FD_alGetBuffer3iDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBufferivDirect`.
        public static final FunctionDescriptor FD_alGetBufferivDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGenEffectsDirect`.
        public static final FunctionDescriptor FD_alGenEffectsDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alDeleteEffectsDirect`.
        public static final FunctionDescriptor FD_alDeleteEffectsDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alIsEffectDirect`.
        public static final FunctionDescriptor FD_alIsEffectDirect = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alEffectiDirect`.
        public static final FunctionDescriptor FD_alEffectiDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alEffectivDirect`.
        public static final FunctionDescriptor FD_alEffectivDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alEffectfDirect`.
        public static final FunctionDescriptor FD_alEffectfDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alEffectfvDirect`.
        public static final FunctionDescriptor FD_alEffectfvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetEffectiDirect`.
        public static final FunctionDescriptor FD_alGetEffectiDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetEffectivDirect`.
        public static final FunctionDescriptor FD_alGetEffectivDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetEffectfDirect`.
        public static final FunctionDescriptor FD_alGetEffectfDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetEffectfvDirect`.
        public static final FunctionDescriptor FD_alGetEffectfvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGenFiltersDirect`.
        public static final FunctionDescriptor FD_alGenFiltersDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alDeleteFiltersDirect`.
        public static final FunctionDescriptor FD_alDeleteFiltersDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alIsFilterDirect`.
        public static final FunctionDescriptor FD_alIsFilterDirect = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alFilteriDirect`.
        public static final FunctionDescriptor FD_alFilteriDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alFilterivDirect`.
        public static final FunctionDescriptor FD_alFilterivDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alFilterfDirect`.
        public static final FunctionDescriptor FD_alFilterfDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alFilterfvDirect`.
        public static final FunctionDescriptor FD_alFilterfvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetFilteriDirect`.
        public static final FunctionDescriptor FD_alGetFilteriDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetFilterivDirect`.
        public static final FunctionDescriptor FD_alGetFilterivDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetFilterfDirect`.
        public static final FunctionDescriptor FD_alGetFilterfDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetFilterfvDirect`.
        public static final FunctionDescriptor FD_alGetFilterfvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGenAuxiliaryEffectSlotsDirect`.
        public static final FunctionDescriptor FD_alGenAuxiliaryEffectSlotsDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alDeleteAuxiliaryEffectSlotsDirect`.
        public static final FunctionDescriptor FD_alDeleteAuxiliaryEffectSlotsDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alIsAuxiliaryEffectSlotDirect`.
        public static final FunctionDescriptor FD_alIsAuxiliaryEffectSlotDirect = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alAuxiliaryEffectSlotiDirect`.
        public static final FunctionDescriptor FD_alAuxiliaryEffectSlotiDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alAuxiliaryEffectSlotivDirect`.
        public static final FunctionDescriptor FD_alAuxiliaryEffectSlotivDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alAuxiliaryEffectSlotfDirect`.
        public static final FunctionDescriptor FD_alAuxiliaryEffectSlotfDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        /// The function descriptor of `alAuxiliaryEffectSlotfvDirect`.
        public static final FunctionDescriptor FD_alAuxiliaryEffectSlotfvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetAuxiliaryEffectSlotiDirect`.
        public static final FunctionDescriptor FD_alGetAuxiliaryEffectSlotiDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetAuxiliaryEffectSlotivDirect`.
        public static final FunctionDescriptor FD_alGetAuxiliaryEffectSlotivDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetAuxiliaryEffectSlotfDirect`.
        public static final FunctionDescriptor FD_alGetAuxiliaryEffectSlotfDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetAuxiliaryEffectSlotfvDirect`.
        public static final FunctionDescriptor FD_alGetAuxiliaryEffectSlotfvDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alBufferDataStaticDirect`.
        public static final FunctionDescriptor FD_alBufferDataStaticDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alDebugMessageCallbackDirectEXT`.
        public static final FunctionDescriptor FD_alDebugMessageCallbackDirectEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alDebugMessageInsertDirectEXT`.
        public static final FunctionDescriptor FD_alDebugMessageInsertDirectEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alDebugMessageControlDirectEXT`.
        public static final FunctionDescriptor FD_alDebugMessageControlDirectEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN);
        /// The function descriptor of `alPushDebugGroupDirectEXT`.
        public static final FunctionDescriptor FD_alPushDebugGroupDirectEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alPopDebugGroupDirectEXT`.
        public static final FunctionDescriptor FD_alPopDebugGroupDirectEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        /// The function descriptor of `alGetDebugMessageLogDirectEXT`.
        public static final FunctionDescriptor FD_alGetDebugMessageLogDirectEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alObjectLabelDirectEXT`.
        public static final FunctionDescriptor FD_alObjectLabelDirectEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alGetObjectLabelDirectEXT`.
        public static final FunctionDescriptor FD_alGetObjectLabelDirectEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT);
        /// The function descriptor of `alGetPointerDirectEXT`.
        public static final FunctionDescriptor FD_alGetPointerDirectEXT = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alGetPointervDirectEXT`.
        public static final FunctionDescriptor FD_alGetPointervDirectEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alRequestFoldbackStartDirect`.
        public static final FunctionDescriptor FD_alRequestFoldbackStartDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alRequestFoldbackStopDirect`.
        public static final FunctionDescriptor FD_alRequestFoldbackStopDirect = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        /// The function descriptor of `alBufferSubDataDirectSOFT`.
        public static final FunctionDescriptor FD_alBufferSubDataDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alSourcedDirectSOFT`.
        public static final FunctionDescriptor FD_alSourcedDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE);
        /// The function descriptor of `alSource3dDirectSOFT`.
        public static final FunctionDescriptor FD_alSource3dDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        /// The function descriptor of `alSourcedvDirectSOFT`.
        public static final FunctionDescriptor FD_alSourcedvDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSourcedDirectSOFT`.
        public static final FunctionDescriptor FD_alGetSourcedDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSource3dDirectSOFT`.
        public static final FunctionDescriptor FD_alGetSource3dDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSourcedvDirectSOFT`.
        public static final FunctionDescriptor FD_alGetSourcedvDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourcei64DirectSOFT`.
        public static final FunctionDescriptor FD_alSourcei64DirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        /// The function descriptor of `alSource3i64DirectSOFT`.
        public static final FunctionDescriptor FD_alSource3i64DirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        /// The function descriptor of `alSourcei64vDirectSOFT`.
        public static final FunctionDescriptor FD_alSourcei64vDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSourcei64DirectSOFT`.
        public static final FunctionDescriptor FD_alGetSourcei64DirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSource3i64DirectSOFT`.
        public static final FunctionDescriptor FD_alGetSource3i64DirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetSourcei64vDirectSOFT`.
        public static final FunctionDescriptor FD_alGetSourcei64vDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alDeferUpdatesDirectSOFT`.
        public static final FunctionDescriptor FD_alDeferUpdatesDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        /// The function descriptor of `alProcessUpdatesDirectSOFT`.
        public static final FunctionDescriptor FD_alProcessUpdatesDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        /// The function descriptor of `alGetStringiDirectSOFT`.
        public static final FunctionDescriptor FD_alGetStringiDirectSOFT = FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        /// The function descriptor of `alEventControlDirectSOFT`.
        public static final FunctionDescriptor FD_alEventControlDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN);
        /// The function descriptor of `alEventCallbackDirectSOFT`.
        public static final FunctionDescriptor FD_alEventCallbackDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetPointerDirectSOFT`.
        public static final FunctionDescriptor FD_alGetPointerDirectSOFT = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `alGetPointervDirectSOFT`.
        public static final FunctionDescriptor FD_alGetPointervDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alBufferCallbackDirectSOFT`.
        public static final FunctionDescriptor FD_alBufferCallbackDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBufferPtrDirectSOFT`.
        public static final FunctionDescriptor FD_alGetBufferPtrDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBuffer3PtrDirectSOFT`.
        public static final FunctionDescriptor FD_alGetBuffer3PtrDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        /// The function descriptor of `alGetBufferPtrvDirectSOFT`.
        public static final FunctionDescriptor FD_alGetBufferPtrvDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// The function descriptor of `alSourcePlayAtTimeDirectSOFT`.
        public static final FunctionDescriptor FD_alSourcePlayAtTimeDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        /// The function descriptor of `alSourcePlayAtTimevDirectSOFT`.
        public static final FunctionDescriptor FD_alSourcePlayAtTimevDirectSOFT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG);
        /// The function descriptor of `EAXSetDirect`.
        public static final FunctionDescriptor FD_EAXSetDirect = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `EAXGetDirect`.
        public static final FunctionDescriptor FD_EAXGetDirect = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `EAXSetBufferModeDirect`.
        public static final FunctionDescriptor FD_EAXSetBufferModeDirect = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        /// The function descriptor of `EAXGetBufferModeDirect`.
        public static final FunctionDescriptor FD_EAXGetBufferModeDirect = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        /// Function descriptors.
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_alcGetProcAddress2,
            FD_alEnableDirect,
            FD_alDisableDirect,
            FD_alIsEnabledDirect,
            FD_alDopplerFactorDirect,
            FD_alSpeedOfSoundDirect,
            FD_alDistanceModelDirect,
            FD_alGetStringDirect,
            FD_alGetBooleanvDirect,
            FD_alGetIntegervDirect,
            FD_alGetFloatvDirect,
            FD_alGetDoublevDirect,
            FD_alGetBooleanDirect,
            FD_alGetIntegerDirect,
            FD_alGetFloatDirect,
            FD_alGetDoubleDirect,
            FD_alGetErrorDirect,
            FD_alIsExtensionPresentDirect,
            FD_alGetProcAddressDirect,
            FD_alGetEnumValueDirect,
            FD_alListenerfDirect,
            FD_alListener3fDirect,
            FD_alListenerfvDirect,
            FD_alListeneriDirect,
            FD_alListener3iDirect,
            FD_alListenerivDirect,
            FD_alGetListenerfDirect,
            FD_alGetListener3fDirect,
            FD_alGetListenerfvDirect,
            FD_alGetListeneriDirect,
            FD_alGetListener3iDirect,
            FD_alGetListenerivDirect,
            FD_alGenSourcesDirect,
            FD_alDeleteSourcesDirect,
            FD_alIsSourceDirect,
            FD_alSourcefDirect,
            FD_alSource3fDirect,
            FD_alSourcefvDirect,
            FD_alSourceiDirect,
            FD_alSource3iDirect,
            FD_alSourceivDirect,
            FD_alGetSourcefDirect,
            FD_alGetSource3fDirect,
            FD_alGetSourcefvDirect,
            FD_alGetSourceiDirect,
            FD_alGetSource3iDirect,
            FD_alGetSourceivDirect,
            FD_alSourcePlayDirect,
            FD_alSourceStopDirect,
            FD_alSourceRewindDirect,
            FD_alSourcePauseDirect,
            FD_alSourcePlayvDirect,
            FD_alSourceStopvDirect,
            FD_alSourceRewindvDirect,
            FD_alSourcePausevDirect,
            FD_alSourceQueueBuffersDirect,
            FD_alSourceUnqueueBuffersDirect,
            FD_alGenBuffersDirect,
            FD_alDeleteBuffersDirect,
            FD_alIsBufferDirect,
            FD_alBufferDataDirect,
            FD_alBufferfDirect,
            FD_alBuffer3fDirect,
            FD_alBufferfvDirect,
            FD_alBufferiDirect,
            FD_alBuffer3iDirect,
            FD_alBufferivDirect,
            FD_alGetBufferfDirect,
            FD_alGetBuffer3fDirect,
            FD_alGetBufferfvDirect,
            FD_alGetBufferiDirect,
            FD_alGetBuffer3iDirect,
            FD_alGetBufferivDirect,
            FD_alGenEffectsDirect,
            FD_alDeleteEffectsDirect,
            FD_alIsEffectDirect,
            FD_alEffectiDirect,
            FD_alEffectivDirect,
            FD_alEffectfDirect,
            FD_alEffectfvDirect,
            FD_alGetEffectiDirect,
            FD_alGetEffectivDirect,
            FD_alGetEffectfDirect,
            FD_alGetEffectfvDirect,
            FD_alGenFiltersDirect,
            FD_alDeleteFiltersDirect,
            FD_alIsFilterDirect,
            FD_alFilteriDirect,
            FD_alFilterivDirect,
            FD_alFilterfDirect,
            FD_alFilterfvDirect,
            FD_alGetFilteriDirect,
            FD_alGetFilterivDirect,
            FD_alGetFilterfDirect,
            FD_alGetFilterfvDirect,
            FD_alGenAuxiliaryEffectSlotsDirect,
            FD_alDeleteAuxiliaryEffectSlotsDirect,
            FD_alIsAuxiliaryEffectSlotDirect,
            FD_alAuxiliaryEffectSlotiDirect,
            FD_alAuxiliaryEffectSlotivDirect,
            FD_alAuxiliaryEffectSlotfDirect,
            FD_alAuxiliaryEffectSlotfvDirect,
            FD_alGetAuxiliaryEffectSlotiDirect,
            FD_alGetAuxiliaryEffectSlotivDirect,
            FD_alGetAuxiliaryEffectSlotfDirect,
            FD_alGetAuxiliaryEffectSlotfvDirect,
            FD_alBufferDataStaticDirect,
            FD_alDebugMessageCallbackDirectEXT,
            FD_alDebugMessageInsertDirectEXT,
            FD_alDebugMessageControlDirectEXT,
            FD_alPushDebugGroupDirectEXT,
            FD_alPopDebugGroupDirectEXT,
            FD_alGetDebugMessageLogDirectEXT,
            FD_alObjectLabelDirectEXT,
            FD_alGetObjectLabelDirectEXT,
            FD_alGetPointerDirectEXT,
            FD_alGetPointervDirectEXT,
            FD_alRequestFoldbackStartDirect,
            FD_alRequestFoldbackStopDirect,
            FD_alBufferSubDataDirectSOFT,
            FD_alSourcedDirectSOFT,
            FD_alSource3dDirectSOFT,
            FD_alSourcedvDirectSOFT,
            FD_alGetSourcedDirectSOFT,
            FD_alGetSource3dDirectSOFT,
            FD_alGetSourcedvDirectSOFT,
            FD_alSourcei64DirectSOFT,
            FD_alSource3i64DirectSOFT,
            FD_alSourcei64vDirectSOFT,
            FD_alGetSourcei64DirectSOFT,
            FD_alGetSource3i64DirectSOFT,
            FD_alGetSourcei64vDirectSOFT,
            FD_alDeferUpdatesDirectSOFT,
            FD_alProcessUpdatesDirectSOFT,
            FD_alGetStringiDirectSOFT,
            FD_alEventControlDirectSOFT,
            FD_alEventCallbackDirectSOFT,
            FD_alGetPointerDirectSOFT,
            FD_alGetPointervDirectSOFT,
            FD_alBufferCallbackDirectSOFT,
            FD_alGetBufferPtrDirectSOFT,
            FD_alGetBuffer3PtrDirectSOFT,
            FD_alGetBufferPtrvDirectSOFT,
            FD_alSourcePlayAtTimeDirectSOFT,
            FD_alSourcePlayAtTimevDirectSOFT,
            FD_EAXSetDirect,
            FD_EAXGetDirect,
            FD_EAXSetBufferModeDirect,
            FD_EAXGetBufferModeDirect
        );
    }
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alcGetProcAddress2`.
        public static final MethodHandle MH_alcGetProcAddress2 = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alcGetProcAddress2", Descriptors.FD_alcGetProcAddress2);
        /// The method handle of `alEnableDirect`.
        public static final MethodHandle MH_alEnableDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alEnableDirect", Descriptors.FD_alEnableDirect);
        /// The method handle of `alDisableDirect`.
        public static final MethodHandle MH_alDisableDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDisableDirect", Descriptors.FD_alDisableDirect);
        /// The method handle of `alIsEnabledDirect`.
        public static final MethodHandle MH_alIsEnabledDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alIsEnabledDirect", Descriptors.FD_alIsEnabledDirect);
        /// The method handle of `alDopplerFactorDirect`.
        public static final MethodHandle MH_alDopplerFactorDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDopplerFactorDirect", Descriptors.FD_alDopplerFactorDirect);
        /// The method handle of `alSpeedOfSoundDirect`.
        public static final MethodHandle MH_alSpeedOfSoundDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSpeedOfSoundDirect", Descriptors.FD_alSpeedOfSoundDirect);
        /// The method handle of `alDistanceModelDirect`.
        public static final MethodHandle MH_alDistanceModelDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDistanceModelDirect", Descriptors.FD_alDistanceModelDirect);
        /// The method handle of `alGetStringDirect`.
        public static final MethodHandle MH_alGetStringDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetStringDirect", Descriptors.FD_alGetStringDirect);
        /// The method handle of `alGetBooleanvDirect`.
        public static final MethodHandle MH_alGetBooleanvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetBooleanvDirect", Descriptors.FD_alGetBooleanvDirect);
        /// The method handle of `alGetIntegervDirect`.
        public static final MethodHandle MH_alGetIntegervDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetIntegervDirect", Descriptors.FD_alGetIntegervDirect);
        /// The method handle of `alGetFloatvDirect`.
        public static final MethodHandle MH_alGetFloatvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetFloatvDirect", Descriptors.FD_alGetFloatvDirect);
        /// The method handle of `alGetDoublevDirect`.
        public static final MethodHandle MH_alGetDoublevDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetDoublevDirect", Descriptors.FD_alGetDoublevDirect);
        /// The method handle of `alGetBooleanDirect`.
        public static final MethodHandle MH_alGetBooleanDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetBooleanDirect", Descriptors.FD_alGetBooleanDirect);
        /// The method handle of `alGetIntegerDirect`.
        public static final MethodHandle MH_alGetIntegerDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetIntegerDirect", Descriptors.FD_alGetIntegerDirect);
        /// The method handle of `alGetFloatDirect`.
        public static final MethodHandle MH_alGetFloatDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetFloatDirect", Descriptors.FD_alGetFloatDirect);
        /// The method handle of `alGetDoubleDirect`.
        public static final MethodHandle MH_alGetDoubleDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetDoubleDirect", Descriptors.FD_alGetDoubleDirect);
        /// The method handle of `alGetErrorDirect`.
        public static final MethodHandle MH_alGetErrorDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetErrorDirect", Descriptors.FD_alGetErrorDirect);
        /// The method handle of `alIsExtensionPresentDirect`.
        public static final MethodHandle MH_alIsExtensionPresentDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alIsExtensionPresentDirect", Descriptors.FD_alIsExtensionPresentDirect);
        /// The method handle of `alGetProcAddressDirect`.
        public static final MethodHandle MH_alGetProcAddressDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetProcAddressDirect", Descriptors.FD_alGetProcAddressDirect);
        /// The method handle of `alGetEnumValueDirect`.
        public static final MethodHandle MH_alGetEnumValueDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetEnumValueDirect", Descriptors.FD_alGetEnumValueDirect);
        /// The method handle of `alListenerfDirect`.
        public static final MethodHandle MH_alListenerfDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alListenerfDirect", Descriptors.FD_alListenerfDirect);
        /// The method handle of `alListener3fDirect`.
        public static final MethodHandle MH_alListener3fDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alListener3fDirect", Descriptors.FD_alListener3fDirect);
        /// The method handle of `alListenerfvDirect`.
        public static final MethodHandle MH_alListenerfvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alListenerfvDirect", Descriptors.FD_alListenerfvDirect);
        /// The method handle of `alListeneriDirect`.
        public static final MethodHandle MH_alListeneriDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alListeneriDirect", Descriptors.FD_alListeneriDirect);
        /// The method handle of `alListener3iDirect`.
        public static final MethodHandle MH_alListener3iDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alListener3iDirect", Descriptors.FD_alListener3iDirect);
        /// The method handle of `alListenerivDirect`.
        public static final MethodHandle MH_alListenerivDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alListenerivDirect", Descriptors.FD_alListenerivDirect);
        /// The method handle of `alGetListenerfDirect`.
        public static final MethodHandle MH_alGetListenerfDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetListenerfDirect", Descriptors.FD_alGetListenerfDirect);
        /// The method handle of `alGetListener3fDirect`.
        public static final MethodHandle MH_alGetListener3fDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetListener3fDirect", Descriptors.FD_alGetListener3fDirect);
        /// The method handle of `alGetListenerfvDirect`.
        public static final MethodHandle MH_alGetListenerfvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetListenerfvDirect", Descriptors.FD_alGetListenerfvDirect);
        /// The method handle of `alGetListeneriDirect`.
        public static final MethodHandle MH_alGetListeneriDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetListeneriDirect", Descriptors.FD_alGetListeneriDirect);
        /// The method handle of `alGetListener3iDirect`.
        public static final MethodHandle MH_alGetListener3iDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetListener3iDirect", Descriptors.FD_alGetListener3iDirect);
        /// The method handle of `alGetListenerivDirect`.
        public static final MethodHandle MH_alGetListenerivDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetListenerivDirect", Descriptors.FD_alGetListenerivDirect);
        /// The method handle of `alGenSourcesDirect`.
        public static final MethodHandle MH_alGenSourcesDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGenSourcesDirect", Descriptors.FD_alGenSourcesDirect);
        /// The method handle of `alDeleteSourcesDirect`.
        public static final MethodHandle MH_alDeleteSourcesDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDeleteSourcesDirect", Descriptors.FD_alDeleteSourcesDirect);
        /// The method handle of `alIsSourceDirect`.
        public static final MethodHandle MH_alIsSourceDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alIsSourceDirect", Descriptors.FD_alIsSourceDirect);
        /// The method handle of `alSourcefDirect`.
        public static final MethodHandle MH_alSourcefDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcefDirect", Descriptors.FD_alSourcefDirect);
        /// The method handle of `alSource3fDirect`.
        public static final MethodHandle MH_alSource3fDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSource3fDirect", Descriptors.FD_alSource3fDirect);
        /// The method handle of `alSourcefvDirect`.
        public static final MethodHandle MH_alSourcefvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcefvDirect", Descriptors.FD_alSourcefvDirect);
        /// The method handle of `alSourceiDirect`.
        public static final MethodHandle MH_alSourceiDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourceiDirect", Descriptors.FD_alSourceiDirect);
        /// The method handle of `alSource3iDirect`.
        public static final MethodHandle MH_alSource3iDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSource3iDirect", Descriptors.FD_alSource3iDirect);
        /// The method handle of `alSourceivDirect`.
        public static final MethodHandle MH_alSourceivDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourceivDirect", Descriptors.FD_alSourceivDirect);
        /// The method handle of `alGetSourcefDirect`.
        public static final MethodHandle MH_alGetSourcefDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSourcefDirect", Descriptors.FD_alGetSourcefDirect);
        /// The method handle of `alGetSource3fDirect`.
        public static final MethodHandle MH_alGetSource3fDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSource3fDirect", Descriptors.FD_alGetSource3fDirect);
        /// The method handle of `alGetSourcefvDirect`.
        public static final MethodHandle MH_alGetSourcefvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSourcefvDirect", Descriptors.FD_alGetSourcefvDirect);
        /// The method handle of `alGetSourceiDirect`.
        public static final MethodHandle MH_alGetSourceiDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSourceiDirect", Descriptors.FD_alGetSourceiDirect);
        /// The method handle of `alGetSource3iDirect`.
        public static final MethodHandle MH_alGetSource3iDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSource3iDirect", Descriptors.FD_alGetSource3iDirect);
        /// The method handle of `alGetSourceivDirect`.
        public static final MethodHandle MH_alGetSourceivDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSourceivDirect", Descriptors.FD_alGetSourceivDirect);
        /// The method handle of `alSourcePlayDirect`.
        public static final MethodHandle MH_alSourcePlayDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcePlayDirect", Descriptors.FD_alSourcePlayDirect);
        /// The method handle of `alSourceStopDirect`.
        public static final MethodHandle MH_alSourceStopDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourceStopDirect", Descriptors.FD_alSourceStopDirect);
        /// The method handle of `alSourceRewindDirect`.
        public static final MethodHandle MH_alSourceRewindDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourceRewindDirect", Descriptors.FD_alSourceRewindDirect);
        /// The method handle of `alSourcePauseDirect`.
        public static final MethodHandle MH_alSourcePauseDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcePauseDirect", Descriptors.FD_alSourcePauseDirect);
        /// The method handle of `alSourcePlayvDirect`.
        public static final MethodHandle MH_alSourcePlayvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcePlayvDirect", Descriptors.FD_alSourcePlayvDirect);
        /// The method handle of `alSourceStopvDirect`.
        public static final MethodHandle MH_alSourceStopvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourceStopvDirect", Descriptors.FD_alSourceStopvDirect);
        /// The method handle of `alSourceRewindvDirect`.
        public static final MethodHandle MH_alSourceRewindvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourceRewindvDirect", Descriptors.FD_alSourceRewindvDirect);
        /// The method handle of `alSourcePausevDirect`.
        public static final MethodHandle MH_alSourcePausevDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcePausevDirect", Descriptors.FD_alSourcePausevDirect);
        /// The method handle of `alSourceQueueBuffersDirect`.
        public static final MethodHandle MH_alSourceQueueBuffersDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourceQueueBuffersDirect", Descriptors.FD_alSourceQueueBuffersDirect);
        /// The method handle of `alSourceUnqueueBuffersDirect`.
        public static final MethodHandle MH_alSourceUnqueueBuffersDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourceUnqueueBuffersDirect", Descriptors.FD_alSourceUnqueueBuffersDirect);
        /// The method handle of `alGenBuffersDirect`.
        public static final MethodHandle MH_alGenBuffersDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGenBuffersDirect", Descriptors.FD_alGenBuffersDirect);
        /// The method handle of `alDeleteBuffersDirect`.
        public static final MethodHandle MH_alDeleteBuffersDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDeleteBuffersDirect", Descriptors.FD_alDeleteBuffersDirect);
        /// The method handle of `alIsBufferDirect`.
        public static final MethodHandle MH_alIsBufferDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alIsBufferDirect", Descriptors.FD_alIsBufferDirect);
        /// The method handle of `alBufferDataDirect`.
        public static final MethodHandle MH_alBufferDataDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alBufferDataDirect", Descriptors.FD_alBufferDataDirect);
        /// The method handle of `alBufferfDirect`.
        public static final MethodHandle MH_alBufferfDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alBufferfDirect", Descriptors.FD_alBufferfDirect);
        /// The method handle of `alBuffer3fDirect`.
        public static final MethodHandle MH_alBuffer3fDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alBuffer3fDirect", Descriptors.FD_alBuffer3fDirect);
        /// The method handle of `alBufferfvDirect`.
        public static final MethodHandle MH_alBufferfvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alBufferfvDirect", Descriptors.FD_alBufferfvDirect);
        /// The method handle of `alBufferiDirect`.
        public static final MethodHandle MH_alBufferiDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alBufferiDirect", Descriptors.FD_alBufferiDirect);
        /// The method handle of `alBuffer3iDirect`.
        public static final MethodHandle MH_alBuffer3iDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alBuffer3iDirect", Descriptors.FD_alBuffer3iDirect);
        /// The method handle of `alBufferivDirect`.
        public static final MethodHandle MH_alBufferivDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alBufferivDirect", Descriptors.FD_alBufferivDirect);
        /// The method handle of `alGetBufferfDirect`.
        public static final MethodHandle MH_alGetBufferfDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetBufferfDirect", Descriptors.FD_alGetBufferfDirect);
        /// The method handle of `alGetBuffer3fDirect`.
        public static final MethodHandle MH_alGetBuffer3fDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetBuffer3fDirect", Descriptors.FD_alGetBuffer3fDirect);
        /// The method handle of `alGetBufferfvDirect`.
        public static final MethodHandle MH_alGetBufferfvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetBufferfvDirect", Descriptors.FD_alGetBufferfvDirect);
        /// The method handle of `alGetBufferiDirect`.
        public static final MethodHandle MH_alGetBufferiDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetBufferiDirect", Descriptors.FD_alGetBufferiDirect);
        /// The method handle of `alGetBuffer3iDirect`.
        public static final MethodHandle MH_alGetBuffer3iDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetBuffer3iDirect", Descriptors.FD_alGetBuffer3iDirect);
        /// The method handle of `alGetBufferivDirect`.
        public static final MethodHandle MH_alGetBufferivDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetBufferivDirect", Descriptors.FD_alGetBufferivDirect);
        /// The method handle of `alGenEffectsDirect`.
        public static final MethodHandle MH_alGenEffectsDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGenEffectsDirect", Descriptors.FD_alGenEffectsDirect);
        /// The method handle of `alDeleteEffectsDirect`.
        public static final MethodHandle MH_alDeleteEffectsDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDeleteEffectsDirect", Descriptors.FD_alDeleteEffectsDirect);
        /// The method handle of `alIsEffectDirect`.
        public static final MethodHandle MH_alIsEffectDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alIsEffectDirect", Descriptors.FD_alIsEffectDirect);
        /// The method handle of `alEffectiDirect`.
        public static final MethodHandle MH_alEffectiDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alEffectiDirect", Descriptors.FD_alEffectiDirect);
        /// The method handle of `alEffectivDirect`.
        public static final MethodHandle MH_alEffectivDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alEffectivDirect", Descriptors.FD_alEffectivDirect);
        /// The method handle of `alEffectfDirect`.
        public static final MethodHandle MH_alEffectfDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alEffectfDirect", Descriptors.FD_alEffectfDirect);
        /// The method handle of `alEffectfvDirect`.
        public static final MethodHandle MH_alEffectfvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alEffectfvDirect", Descriptors.FD_alEffectfvDirect);
        /// The method handle of `alGetEffectiDirect`.
        public static final MethodHandle MH_alGetEffectiDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetEffectiDirect", Descriptors.FD_alGetEffectiDirect);
        /// The method handle of `alGetEffectivDirect`.
        public static final MethodHandle MH_alGetEffectivDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetEffectivDirect", Descriptors.FD_alGetEffectivDirect);
        /// The method handle of `alGetEffectfDirect`.
        public static final MethodHandle MH_alGetEffectfDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetEffectfDirect", Descriptors.FD_alGetEffectfDirect);
        /// The method handle of `alGetEffectfvDirect`.
        public static final MethodHandle MH_alGetEffectfvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetEffectfvDirect", Descriptors.FD_alGetEffectfvDirect);
        /// The method handle of `alGenFiltersDirect`.
        public static final MethodHandle MH_alGenFiltersDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGenFiltersDirect", Descriptors.FD_alGenFiltersDirect);
        /// The method handle of `alDeleteFiltersDirect`.
        public static final MethodHandle MH_alDeleteFiltersDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDeleteFiltersDirect", Descriptors.FD_alDeleteFiltersDirect);
        /// The method handle of `alIsFilterDirect`.
        public static final MethodHandle MH_alIsFilterDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alIsFilterDirect", Descriptors.FD_alIsFilterDirect);
        /// The method handle of `alFilteriDirect`.
        public static final MethodHandle MH_alFilteriDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alFilteriDirect", Descriptors.FD_alFilteriDirect);
        /// The method handle of `alFilterivDirect`.
        public static final MethodHandle MH_alFilterivDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alFilterivDirect", Descriptors.FD_alFilterivDirect);
        /// The method handle of `alFilterfDirect`.
        public static final MethodHandle MH_alFilterfDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alFilterfDirect", Descriptors.FD_alFilterfDirect);
        /// The method handle of `alFilterfvDirect`.
        public static final MethodHandle MH_alFilterfvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alFilterfvDirect", Descriptors.FD_alFilterfvDirect);
        /// The method handle of `alGetFilteriDirect`.
        public static final MethodHandle MH_alGetFilteriDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetFilteriDirect", Descriptors.FD_alGetFilteriDirect);
        /// The method handle of `alGetFilterivDirect`.
        public static final MethodHandle MH_alGetFilterivDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetFilterivDirect", Descriptors.FD_alGetFilterivDirect);
        /// The method handle of `alGetFilterfDirect`.
        public static final MethodHandle MH_alGetFilterfDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetFilterfDirect", Descriptors.FD_alGetFilterfDirect);
        /// The method handle of `alGetFilterfvDirect`.
        public static final MethodHandle MH_alGetFilterfvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetFilterfvDirect", Descriptors.FD_alGetFilterfvDirect);
        /// The method handle of `alGenAuxiliaryEffectSlotsDirect`.
        public static final MethodHandle MH_alGenAuxiliaryEffectSlotsDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGenAuxiliaryEffectSlotsDirect", Descriptors.FD_alGenAuxiliaryEffectSlotsDirect);
        /// The method handle of `alDeleteAuxiliaryEffectSlotsDirect`.
        public static final MethodHandle MH_alDeleteAuxiliaryEffectSlotsDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDeleteAuxiliaryEffectSlotsDirect", Descriptors.FD_alDeleteAuxiliaryEffectSlotsDirect);
        /// The method handle of `alIsAuxiliaryEffectSlotDirect`.
        public static final MethodHandle MH_alIsAuxiliaryEffectSlotDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alIsAuxiliaryEffectSlotDirect", Descriptors.FD_alIsAuxiliaryEffectSlotDirect);
        /// The method handle of `alAuxiliaryEffectSlotiDirect`.
        public static final MethodHandle MH_alAuxiliaryEffectSlotiDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alAuxiliaryEffectSlotiDirect", Descriptors.FD_alAuxiliaryEffectSlotiDirect);
        /// The method handle of `alAuxiliaryEffectSlotivDirect`.
        public static final MethodHandle MH_alAuxiliaryEffectSlotivDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alAuxiliaryEffectSlotivDirect", Descriptors.FD_alAuxiliaryEffectSlotivDirect);
        /// The method handle of `alAuxiliaryEffectSlotfDirect`.
        public static final MethodHandle MH_alAuxiliaryEffectSlotfDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alAuxiliaryEffectSlotfDirect", Descriptors.FD_alAuxiliaryEffectSlotfDirect);
        /// The method handle of `alAuxiliaryEffectSlotfvDirect`.
        public static final MethodHandle MH_alAuxiliaryEffectSlotfvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alAuxiliaryEffectSlotfvDirect", Descriptors.FD_alAuxiliaryEffectSlotfvDirect);
        /// The method handle of `alGetAuxiliaryEffectSlotiDirect`.
        public static final MethodHandle MH_alGetAuxiliaryEffectSlotiDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetAuxiliaryEffectSlotiDirect", Descriptors.FD_alGetAuxiliaryEffectSlotiDirect);
        /// The method handle of `alGetAuxiliaryEffectSlotivDirect`.
        public static final MethodHandle MH_alGetAuxiliaryEffectSlotivDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetAuxiliaryEffectSlotivDirect", Descriptors.FD_alGetAuxiliaryEffectSlotivDirect);
        /// The method handle of `alGetAuxiliaryEffectSlotfDirect`.
        public static final MethodHandle MH_alGetAuxiliaryEffectSlotfDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetAuxiliaryEffectSlotfDirect", Descriptors.FD_alGetAuxiliaryEffectSlotfDirect);
        /// The method handle of `alGetAuxiliaryEffectSlotfvDirect`.
        public static final MethodHandle MH_alGetAuxiliaryEffectSlotfvDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetAuxiliaryEffectSlotfvDirect", Descriptors.FD_alGetAuxiliaryEffectSlotfvDirect);
        /// The method handle of `alBufferDataStaticDirect`.
        public static final MethodHandle MH_alBufferDataStaticDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alBufferDataStaticDirect", Descriptors.FD_alBufferDataStaticDirect);
        /// The method handle of `alDebugMessageCallbackDirectEXT`.
        public static final MethodHandle MH_alDebugMessageCallbackDirectEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDebugMessageCallbackDirectEXT", Descriptors.FD_alDebugMessageCallbackDirectEXT);
        /// The method handle of `alDebugMessageInsertDirectEXT`.
        public static final MethodHandle MH_alDebugMessageInsertDirectEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDebugMessageInsertDirectEXT", Descriptors.FD_alDebugMessageInsertDirectEXT);
        /// The method handle of `alDebugMessageControlDirectEXT`.
        public static final MethodHandle MH_alDebugMessageControlDirectEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDebugMessageControlDirectEXT", Descriptors.FD_alDebugMessageControlDirectEXT);
        /// The method handle of `alPushDebugGroupDirectEXT`.
        public static final MethodHandle MH_alPushDebugGroupDirectEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alPushDebugGroupDirectEXT", Descriptors.FD_alPushDebugGroupDirectEXT);
        /// The method handle of `alPopDebugGroupDirectEXT`.
        public static final MethodHandle MH_alPopDebugGroupDirectEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alPopDebugGroupDirectEXT", Descriptors.FD_alPopDebugGroupDirectEXT);
        /// The method handle of `alGetDebugMessageLogDirectEXT`.
        public static final MethodHandle MH_alGetDebugMessageLogDirectEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetDebugMessageLogDirectEXT", Descriptors.FD_alGetDebugMessageLogDirectEXT);
        /// The method handle of `alObjectLabelDirectEXT`.
        public static final MethodHandle MH_alObjectLabelDirectEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alObjectLabelDirectEXT", Descriptors.FD_alObjectLabelDirectEXT);
        /// The method handle of `alGetObjectLabelDirectEXT`.
        public static final MethodHandle MH_alGetObjectLabelDirectEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetObjectLabelDirectEXT", Descriptors.FD_alGetObjectLabelDirectEXT);
        /// The method handle of `alGetPointerDirectEXT`.
        public static final MethodHandle MH_alGetPointerDirectEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetPointerDirectEXT", Descriptors.FD_alGetPointerDirectEXT);
        /// The method handle of `alGetPointervDirectEXT`.
        public static final MethodHandle MH_alGetPointervDirectEXT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetPointervDirectEXT", Descriptors.FD_alGetPointervDirectEXT);
        /// The method handle of `alRequestFoldbackStartDirect`.
        public static final MethodHandle MH_alRequestFoldbackStartDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alRequestFoldbackStartDirect", Descriptors.FD_alRequestFoldbackStartDirect);
        /// The method handle of `alRequestFoldbackStopDirect`.
        public static final MethodHandle MH_alRequestFoldbackStopDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alRequestFoldbackStopDirect", Descriptors.FD_alRequestFoldbackStopDirect);
        /// The method handle of `alBufferSubDataDirectSOFT`.
        public static final MethodHandle MH_alBufferSubDataDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alBufferSubDataDirectSOFT", Descriptors.FD_alBufferSubDataDirectSOFT);
        /// The method handle of `alSourcedDirectSOFT`.
        public static final MethodHandle MH_alSourcedDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcedDirectSOFT", Descriptors.FD_alSourcedDirectSOFT);
        /// The method handle of `alSource3dDirectSOFT`.
        public static final MethodHandle MH_alSource3dDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSource3dDirectSOFT", Descriptors.FD_alSource3dDirectSOFT);
        /// The method handle of `alSourcedvDirectSOFT`.
        public static final MethodHandle MH_alSourcedvDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcedvDirectSOFT", Descriptors.FD_alSourcedvDirectSOFT);
        /// The method handle of `alGetSourcedDirectSOFT`.
        public static final MethodHandle MH_alGetSourcedDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSourcedDirectSOFT", Descriptors.FD_alGetSourcedDirectSOFT);
        /// The method handle of `alGetSource3dDirectSOFT`.
        public static final MethodHandle MH_alGetSource3dDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSource3dDirectSOFT", Descriptors.FD_alGetSource3dDirectSOFT);
        /// The method handle of `alGetSourcedvDirectSOFT`.
        public static final MethodHandle MH_alGetSourcedvDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSourcedvDirectSOFT", Descriptors.FD_alGetSourcedvDirectSOFT);
        /// The method handle of `alSourcei64DirectSOFT`.
        public static final MethodHandle MH_alSourcei64DirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcei64DirectSOFT", Descriptors.FD_alSourcei64DirectSOFT);
        /// The method handle of `alSource3i64DirectSOFT`.
        public static final MethodHandle MH_alSource3i64DirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSource3i64DirectSOFT", Descriptors.FD_alSource3i64DirectSOFT);
        /// The method handle of `alSourcei64vDirectSOFT`.
        public static final MethodHandle MH_alSourcei64vDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcei64vDirectSOFT", Descriptors.FD_alSourcei64vDirectSOFT);
        /// The method handle of `alGetSourcei64DirectSOFT`.
        public static final MethodHandle MH_alGetSourcei64DirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSourcei64DirectSOFT", Descriptors.FD_alGetSourcei64DirectSOFT);
        /// The method handle of `alGetSource3i64DirectSOFT`.
        public static final MethodHandle MH_alGetSource3i64DirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSource3i64DirectSOFT", Descriptors.FD_alGetSource3i64DirectSOFT);
        /// The method handle of `alGetSourcei64vDirectSOFT`.
        public static final MethodHandle MH_alGetSourcei64vDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetSourcei64vDirectSOFT", Descriptors.FD_alGetSourcei64vDirectSOFT);
        /// The method handle of `alDeferUpdatesDirectSOFT`.
        public static final MethodHandle MH_alDeferUpdatesDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alDeferUpdatesDirectSOFT", Descriptors.FD_alDeferUpdatesDirectSOFT);
        /// The method handle of `alProcessUpdatesDirectSOFT`.
        public static final MethodHandle MH_alProcessUpdatesDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alProcessUpdatesDirectSOFT", Descriptors.FD_alProcessUpdatesDirectSOFT);
        /// The method handle of `alGetStringiDirectSOFT`.
        public static final MethodHandle MH_alGetStringiDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetStringiDirectSOFT", Descriptors.FD_alGetStringiDirectSOFT);
        /// The method handle of `alEventControlDirectSOFT`.
        public static final MethodHandle MH_alEventControlDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alEventControlDirectSOFT", Descriptors.FD_alEventControlDirectSOFT);
        /// The method handle of `alEventCallbackDirectSOFT`.
        public static final MethodHandle MH_alEventCallbackDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alEventCallbackDirectSOFT", Descriptors.FD_alEventCallbackDirectSOFT);
        /// The method handle of `alGetPointerDirectSOFT`.
        public static final MethodHandle MH_alGetPointerDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetPointerDirectSOFT", Descriptors.FD_alGetPointerDirectSOFT);
        /// The method handle of `alGetPointervDirectSOFT`.
        public static final MethodHandle MH_alGetPointervDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetPointervDirectSOFT", Descriptors.FD_alGetPointervDirectSOFT);
        /// The method handle of `alBufferCallbackDirectSOFT`.
        public static final MethodHandle MH_alBufferCallbackDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alBufferCallbackDirectSOFT", Descriptors.FD_alBufferCallbackDirectSOFT);
        /// The method handle of `alGetBufferPtrDirectSOFT`.
        public static final MethodHandle MH_alGetBufferPtrDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetBufferPtrDirectSOFT", Descriptors.FD_alGetBufferPtrDirectSOFT);
        /// The method handle of `alGetBuffer3PtrDirectSOFT`.
        public static final MethodHandle MH_alGetBuffer3PtrDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetBuffer3PtrDirectSOFT", Descriptors.FD_alGetBuffer3PtrDirectSOFT);
        /// The method handle of `alGetBufferPtrvDirectSOFT`.
        public static final MethodHandle MH_alGetBufferPtrvDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetBufferPtrvDirectSOFT", Descriptors.FD_alGetBufferPtrvDirectSOFT);
        /// The method handle of `alSourcePlayAtTimeDirectSOFT`.
        public static final MethodHandle MH_alSourcePlayAtTimeDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcePlayAtTimeDirectSOFT", Descriptors.FD_alSourcePlayAtTimeDirectSOFT);
        /// The method handle of `alSourcePlayAtTimevDirectSOFT`.
        public static final MethodHandle MH_alSourcePlayAtTimevDirectSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alSourcePlayAtTimevDirectSOFT", Descriptors.FD_alSourcePlayAtTimevDirectSOFT);
        /// The method handle of `EAXSetDirect`.
        public static final MethodHandle MH_EAXSetDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "EAXSetDirect", Descriptors.FD_EAXSetDirect);
        /// The method handle of `EAXGetDirect`.
        public static final MethodHandle MH_EAXGetDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "EAXGetDirect", Descriptors.FD_EAXGetDirect);
        /// The method handle of `EAXSetBufferModeDirect`.
        public static final MethodHandle MH_EAXSetBufferModeDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "EAXSetBufferModeDirect", Descriptors.FD_EAXSetBufferModeDirect);
        /// The method handle of `EAXGetBufferModeDirect`.
        public static final MethodHandle MH_EAXGetBufferModeDirect = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "EAXGetBufferModeDirect", Descriptors.FD_EAXGetBufferModeDirect);
    }

    public static @CType("ALCvoid *") java.lang.foreign.MemorySegment alcGetProcAddress2(@CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("const ALCchar*") java.lang.foreign.MemorySegment funcName) {
        if (Handles.MH_alcGetProcAddress2 == null) throw new SymbolNotFoundError("Symbol not found: alcGetProcAddress2");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alcGetProcAddress2.invokeExact(device, funcName);
        } catch (Throwable e) { throw new RuntimeException("error in alcGetProcAddress2", e); }
    }

    public static void alEnableDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int capability) {
        if (Handles.MH_alEnableDirect == null) throw new SymbolNotFoundError("Symbol not found: alEnableDirect");
        try {
            Handles.MH_alEnableDirect.invokeExact(context, capability);
        } catch (Throwable e) { throw new RuntimeException("error in alEnableDirect", e); }
    }

    public static void alDisableDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int capability) {
        if (Handles.MH_alDisableDirect == null) throw new SymbolNotFoundError("Symbol not found: alDisableDirect");
        try {
            Handles.MH_alDisableDirect.invokeExact(context, capability);
        } catch (Throwable e) { throw new RuntimeException("error in alDisableDirect", e); }
    }

    public static @CType("ALboolean") boolean alIsEnabledDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int capability) {
        if (Handles.MH_alIsEnabledDirect == null) throw new SymbolNotFoundError("Symbol not found: alIsEnabledDirect");
        try {
            return (boolean) Handles.MH_alIsEnabledDirect.invokeExact(context, capability);
        } catch (Throwable e) { throw new RuntimeException("error in alIsEnabledDirect", e); }
    }

    public static void alDopplerFactorDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALfloat") float value) {
        if (Handles.MH_alDopplerFactorDirect == null) throw new SymbolNotFoundError("Symbol not found: alDopplerFactorDirect");
        try {
            Handles.MH_alDopplerFactorDirect.invokeExact(context, value);
        } catch (Throwable e) { throw new RuntimeException("error in alDopplerFactorDirect", e); }
    }

    public static void alSpeedOfSoundDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALfloat") float value) {
        if (Handles.MH_alSpeedOfSoundDirect == null) throw new SymbolNotFoundError("Symbol not found: alSpeedOfSoundDirect");
        try {
            Handles.MH_alSpeedOfSoundDirect.invokeExact(context, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSpeedOfSoundDirect", e); }
    }

    public static void alDistanceModelDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int distanceModel) {
        if (Handles.MH_alDistanceModelDirect == null) throw new SymbolNotFoundError("Symbol not found: alDistanceModelDirect");
        try {
            Handles.MH_alDistanceModelDirect.invokeExact(context, distanceModel);
        } catch (Throwable e) { throw new RuntimeException("error in alDistanceModelDirect", e); }
    }

    public static @CType("const ALchar*") java.lang.foreign.MemorySegment alGetStringDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param) {
        if (Handles.MH_alGetStringDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetStringDirect");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alGetStringDirect.invokeExact(context, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetStringDirect", e); }
    }

    public static void alGetBooleanvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("ALboolean *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetBooleanvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBooleanvDirect");
        try {
            Handles.MH_alGetBooleanvDirect.invokeExact(context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBooleanvDirect", e); }
    }

    public static void alGetIntegervDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetIntegervDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetIntegervDirect");
        try {
            Handles.MH_alGetIntegervDirect.invokeExact(context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetIntegervDirect", e); }
    }

    public static void alGetFloatvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetFloatvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetFloatvDirect");
        try {
            Handles.MH_alGetFloatvDirect.invokeExact(context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFloatvDirect", e); }
    }

    public static void alGetDoublevDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("ALdouble *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetDoublevDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetDoublevDirect");
        try {
            Handles.MH_alGetDoublevDirect.invokeExact(context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDoublevDirect", e); }
    }

    public static @CType("ALboolean") boolean alGetBooleanDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param) {
        if (Handles.MH_alGetBooleanDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBooleanDirect");
        try {
            return (boolean) Handles.MH_alGetBooleanDirect.invokeExact(context, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBooleanDirect", e); }
    }

    public static @CType("ALint") int alGetIntegerDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param) {
        if (Handles.MH_alGetIntegerDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetIntegerDirect");
        try {
            return (int) Handles.MH_alGetIntegerDirect.invokeExact(context, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetIntegerDirect", e); }
    }

    public static @CType("ALfloat") float alGetFloatDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param) {
        if (Handles.MH_alGetFloatDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetFloatDirect");
        try {
            return (float) Handles.MH_alGetFloatDirect.invokeExact(context, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFloatDirect", e); }
    }

    public static @CType("ALdouble") double alGetDoubleDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param) {
        if (Handles.MH_alGetDoubleDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetDoubleDirect");
        try {
            return (double) Handles.MH_alGetDoubleDirect.invokeExact(context, param);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDoubleDirect", e); }
    }

    public static @CType("ALenum") int alGetErrorDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context) {
        if (Handles.MH_alGetErrorDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetErrorDirect");
        try {
            return (int) Handles.MH_alGetErrorDirect.invokeExact(context);
        } catch (Throwable e) { throw new RuntimeException("error in alGetErrorDirect", e); }
    }

    public static @CType("ALboolean") boolean alIsExtensionPresentDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("const ALchar*") java.lang.foreign.MemorySegment extname) {
        if (Handles.MH_alIsExtensionPresentDirect == null) throw new SymbolNotFoundError("Symbol not found: alIsExtensionPresentDirect");
        try {
            return (boolean) Handles.MH_alIsExtensionPresentDirect.invokeExact(context, extname);
        } catch (Throwable e) { throw new RuntimeException("error in alIsExtensionPresentDirect", e); }
    }

    public static @CType("void*") java.lang.foreign.MemorySegment alGetProcAddressDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("const ALchar*") java.lang.foreign.MemorySegment fname) {
        if (Handles.MH_alGetProcAddressDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetProcAddressDirect");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alGetProcAddressDirect.invokeExact(context, fname);
        } catch (Throwable e) { throw new RuntimeException("error in alGetProcAddressDirect", e); }
    }

    public static @CType("ALenum") int alGetEnumValueDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("const ALchar*") java.lang.foreign.MemorySegment ename) {
        if (Handles.MH_alGetEnumValueDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetEnumValueDirect");
        try {
            return (int) Handles.MH_alGetEnumValueDirect.invokeExact(context, ename);
        } catch (Throwable e) { throw new RuntimeException("error in alGetEnumValueDirect", e); }
    }

    public static void alListenerfDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("ALfloat") float value) {
        if (Handles.MH_alListenerfDirect == null) throw new SymbolNotFoundError("Symbol not found: alListenerfDirect");
        try {
            Handles.MH_alListenerfDirect.invokeExact(context, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alListenerfDirect", e); }
    }

    public static void alListener3fDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("ALfloat") float value1, @CType("ALfloat") float value2, @CType("ALfloat") float value3) {
        if (Handles.MH_alListener3fDirect == null) throw new SymbolNotFoundError("Symbol not found: alListener3fDirect");
        try {
            Handles.MH_alListener3fDirect.invokeExact(context, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alListener3fDirect", e); }
    }

    public static void alListenerfvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("const ALfloat *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alListenerfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alListenerfvDirect");
        try {
            Handles.MH_alListenerfvDirect.invokeExact(context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alListenerfvDirect", e); }
    }

    public static void alListeneriDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("ALint") int value) {
        if (Handles.MH_alListeneriDirect == null) throw new SymbolNotFoundError("Symbol not found: alListeneriDirect");
        try {
            Handles.MH_alListeneriDirect.invokeExact(context, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alListeneriDirect", e); }
    }

    public static void alListener3iDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("ALint") int value1, @CType("ALint") int value2, @CType("ALint") int value3) {
        if (Handles.MH_alListener3iDirect == null) throw new SymbolNotFoundError("Symbol not found: alListener3iDirect");
        try {
            Handles.MH_alListener3iDirect.invokeExact(context, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alListener3iDirect", e); }
    }

    public static void alListenerivDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("const ALint *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alListenerivDirect == null) throw new SymbolNotFoundError("Symbol not found: alListenerivDirect");
        try {
            Handles.MH_alListenerivDirect.invokeExact(context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alListenerivDirect", e); }
    }

    public static void alGetListenerfDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment value) {
        if (Handles.MH_alGetListenerfDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetListenerfDirect");
        try {
            Handles.MH_alGetListenerfDirect.invokeExact(context, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerfDirect", e); }
    }

    public static void alGetListener3fDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment value1, @CType("ALfloat *") java.lang.foreign.MemorySegment value2, @CType("ALfloat *") java.lang.foreign.MemorySegment value3) {
        if (Handles.MH_alGetListener3fDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetListener3fDirect");
        try {
            Handles.MH_alGetListener3fDirect.invokeExact(context, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3fDirect", e); }
    }

    public static void alGetListenerfvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetListenerfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetListenerfvDirect");
        try {
            Handles.MH_alGetListenerfvDirect.invokeExact(context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerfvDirect", e); }
    }

    public static void alGetListeneriDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment value) {
        if (Handles.MH_alGetListeneriDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetListeneriDirect");
        try {
            Handles.MH_alGetListeneriDirect.invokeExact(context, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListeneriDirect", e); }
    }

    public static void alGetListener3iDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment value1, @CType("ALint *") java.lang.foreign.MemorySegment value2, @CType("ALint *") java.lang.foreign.MemorySegment value3) {
        if (Handles.MH_alGetListener3iDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetListener3iDirect");
        try {
            Handles.MH_alGetListener3iDirect.invokeExact(context, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListener3iDirect", e); }
    }

    public static void alGetListenerivDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetListenerivDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetListenerivDirect");
        try {
            Handles.MH_alGetListenerivDirect.invokeExact(context, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetListenerivDirect", e); }
    }

    public static void alGenSourcesDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("ALuint *") java.lang.foreign.MemorySegment sources) {
        if (Handles.MH_alGenSourcesDirect == null) throw new SymbolNotFoundError("Symbol not found: alGenSourcesDirect");
        try {
            Handles.MH_alGenSourcesDirect.invokeExact(context, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alGenSourcesDirect", e); }
    }

    public static void alDeleteSourcesDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources) {
        if (Handles.MH_alDeleteSourcesDirect == null) throw new SymbolNotFoundError("Symbol not found: alDeleteSourcesDirect");
        try {
            Handles.MH_alDeleteSourcesDirect.invokeExact(context, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteSourcesDirect", e); }
    }

    public static @CType("ALboolean") boolean alIsSourceDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source) {
        if (Handles.MH_alIsSourceDirect == null) throw new SymbolNotFoundError("Symbol not found: alIsSourceDirect");
        try {
            return (boolean) Handles.MH_alIsSourceDirect.invokeExact(context, source);
        } catch (Throwable e) { throw new RuntimeException("error in alIsSourceDirect", e); }
    }

    public static void alSourcefDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat") float value) {
        if (Handles.MH_alSourcefDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourcefDirect");
        try {
            Handles.MH_alSourcefDirect.invokeExact(context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcefDirect", e); }
    }

    public static void alSource3fDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat") float value1, @CType("ALfloat") float value2, @CType("ALfloat") float value3) {
        if (Handles.MH_alSource3fDirect == null) throw new SymbolNotFoundError("Symbol not found: alSource3fDirect");
        try {
            Handles.MH_alSource3fDirect.invokeExact(context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3fDirect", e); }
    }

    public static void alSourcefvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALfloat *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alSourcefvDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourcefvDirect");
        try {
            Handles.MH_alSourcefvDirect.invokeExact(context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcefvDirect", e); }
    }

    public static void alSourceiDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint") int value) {
        if (Handles.MH_alSourceiDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceiDirect");
        try {
            Handles.MH_alSourceiDirect.invokeExact(context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceiDirect", e); }
    }

    public static void alSource3iDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint") int value1, @CType("ALint") int value2, @CType("ALint") int value3) {
        if (Handles.MH_alSource3iDirect == null) throw new SymbolNotFoundError("Symbol not found: alSource3iDirect");
        try {
            Handles.MH_alSource3iDirect.invokeExact(context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3iDirect", e); }
    }

    public static void alSourceivDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALint *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alSourceivDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceivDirect");
        try {
            Handles.MH_alSourceivDirect.invokeExact(context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceivDirect", e); }
    }

    public static void alGetSourcefDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment value) {
        if (Handles.MH_alGetSourcefDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcefDirect");
        try {
            Handles.MH_alGetSourcefDirect.invokeExact(context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcefDirect", e); }
    }

    public static void alGetSource3fDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment value1, @CType("ALfloat *") java.lang.foreign.MemorySegment value2, @CType("ALfloat *") java.lang.foreign.MemorySegment value3) {
        if (Handles.MH_alGetSource3fDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetSource3fDirect");
        try {
            Handles.MH_alGetSource3fDirect.invokeExact(context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3fDirect", e); }
    }

    public static void alGetSourcefvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetSourcefvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcefvDirect");
        try {
            Handles.MH_alGetSourcefvDirect.invokeExact(context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcefvDirect", e); }
    }

    public static void alGetSourceiDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment value) {
        if (Handles.MH_alGetSourceiDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetSourceiDirect");
        try {
            Handles.MH_alGetSourceiDirect.invokeExact(context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourceiDirect", e); }
    }

    public static void alGetSource3iDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment value1, @CType("ALint *") java.lang.foreign.MemorySegment value2, @CType("ALint *") java.lang.foreign.MemorySegment value3) {
        if (Handles.MH_alGetSource3iDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetSource3iDirect");
        try {
            Handles.MH_alGetSource3iDirect.invokeExact(context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3iDirect", e); }
    }

    public static void alGetSourceivDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetSourceivDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetSourceivDirect");
        try {
            Handles.MH_alGetSourceivDirect.invokeExact(context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourceivDirect", e); }
    }

    public static void alSourcePlayDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source) {
        if (Handles.MH_alSourcePlayDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourcePlayDirect");
        try {
            Handles.MH_alSourcePlayDirect.invokeExact(context, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayDirect", e); }
    }

    public static void alSourceStopDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source) {
        if (Handles.MH_alSourceStopDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceStopDirect");
        try {
            Handles.MH_alSourceStopDirect.invokeExact(context, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceStopDirect", e); }
    }

    public static void alSourceRewindDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source) {
        if (Handles.MH_alSourceRewindDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceRewindDirect");
        try {
            Handles.MH_alSourceRewindDirect.invokeExact(context, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceRewindDirect", e); }
    }

    public static void alSourcePauseDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source) {
        if (Handles.MH_alSourcePauseDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourcePauseDirect");
        try {
            Handles.MH_alSourcePauseDirect.invokeExact(context, source);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePauseDirect", e); }
    }

    public static void alSourcePlayvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources) {
        if (Handles.MH_alSourcePlayvDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourcePlayvDirect");
        try {
            Handles.MH_alSourcePlayvDirect.invokeExact(context, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayvDirect", e); }
    }

    public static void alSourceStopvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources) {
        if (Handles.MH_alSourceStopvDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceStopvDirect");
        try {
            Handles.MH_alSourceStopvDirect.invokeExact(context, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceStopvDirect", e); }
    }

    public static void alSourceRewindvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources) {
        if (Handles.MH_alSourceRewindvDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceRewindvDirect");
        try {
            Handles.MH_alSourceRewindvDirect.invokeExact(context, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceRewindvDirect", e); }
    }

    public static void alSourcePausevDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources) {
        if (Handles.MH_alSourcePausevDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourcePausevDirect");
        try {
            Handles.MH_alSourcePausevDirect.invokeExact(context, n, sources);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePausevDirect", e); }
    }

    public static void alSourceQueueBuffersDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALsizei") int nb, @CType("const ALuint *") java.lang.foreign.MemorySegment buffers) {
        if (Handles.MH_alSourceQueueBuffersDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceQueueBuffersDirect");
        try {
            Handles.MH_alSourceQueueBuffersDirect.invokeExact(context, source, nb, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceQueueBuffersDirect", e); }
    }

    public static void alSourceUnqueueBuffersDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALsizei") int nb, @CType("ALuint *") java.lang.foreign.MemorySegment buffers) {
        if (Handles.MH_alSourceUnqueueBuffersDirect == null) throw new SymbolNotFoundError("Symbol not found: alSourceUnqueueBuffersDirect");
        try {
            Handles.MH_alSourceUnqueueBuffersDirect.invokeExact(context, source, nb, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alSourceUnqueueBuffersDirect", e); }
    }

    public static void alGenBuffersDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("ALuint *") java.lang.foreign.MemorySegment buffers) {
        if (Handles.MH_alGenBuffersDirect == null) throw new SymbolNotFoundError("Symbol not found: alGenBuffersDirect");
        try {
            Handles.MH_alGenBuffersDirect.invokeExact(context, n, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alGenBuffersDirect", e); }
    }

    public static void alDeleteBuffersDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment buffers) {
        if (Handles.MH_alDeleteBuffersDirect == null) throw new SymbolNotFoundError("Symbol not found: alDeleteBuffersDirect");
        try {
            Handles.MH_alDeleteBuffersDirect.invokeExact(context, n, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteBuffersDirect", e); }
    }

    public static @CType("ALboolean") boolean alIsBufferDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer) {
        if (Handles.MH_alIsBufferDirect == null) throw new SymbolNotFoundError("Symbol not found: alIsBufferDirect");
        try {
            return (boolean) Handles.MH_alIsBufferDirect.invokeExact(context, buffer);
        } catch (Throwable e) { throw new RuntimeException("error in alIsBufferDirect", e); }
    }

    public static void alBufferDataDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int format, @CType("const ALvoid *") java.lang.foreign.MemorySegment data, @CType("ALsizei") int size, @CType("ALsizei") int samplerate) {
        if (Handles.MH_alBufferDataDirect == null) throw new SymbolNotFoundError("Symbol not found: alBufferDataDirect");
        try {
            Handles.MH_alBufferDataDirect.invokeExact(context, buffer, format, data, size, samplerate);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferDataDirect", e); }
    }

    public static void alBufferfDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat") float value) {
        if (Handles.MH_alBufferfDirect == null) throw new SymbolNotFoundError("Symbol not found: alBufferfDirect");
        try {
            Handles.MH_alBufferfDirect.invokeExact(context, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferfDirect", e); }
    }

    public static void alBuffer3fDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat") float value1, @CType("ALfloat") float value2, @CType("ALfloat") float value3) {
        if (Handles.MH_alBuffer3fDirect == null) throw new SymbolNotFoundError("Symbol not found: alBuffer3fDirect");
        try {
            Handles.MH_alBuffer3fDirect.invokeExact(context, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alBuffer3fDirect", e); }
    }

    public static void alBufferfvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("const ALfloat *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alBufferfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alBufferfvDirect");
        try {
            Handles.MH_alBufferfvDirect.invokeExact(context, buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferfvDirect", e); }
    }

    public static void alBufferiDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint") int value) {
        if (Handles.MH_alBufferiDirect == null) throw new SymbolNotFoundError("Symbol not found: alBufferiDirect");
        try {
            Handles.MH_alBufferiDirect.invokeExact(context, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferiDirect", e); }
    }

    public static void alBuffer3iDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint") int value1, @CType("ALint") int value2, @CType("ALint") int value3) {
        if (Handles.MH_alBuffer3iDirect == null) throw new SymbolNotFoundError("Symbol not found: alBuffer3iDirect");
        try {
            Handles.MH_alBuffer3iDirect.invokeExact(context, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alBuffer3iDirect", e); }
    }

    public static void alBufferivDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("const ALint *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alBufferivDirect == null) throw new SymbolNotFoundError("Symbol not found: alBufferivDirect");
        try {
            Handles.MH_alBufferivDirect.invokeExact(context, buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferivDirect", e); }
    }

    public static void alGetBufferfDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment value) {
        if (Handles.MH_alGetBufferfDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferfDirect");
        try {
            Handles.MH_alGetBufferfDirect.invokeExact(context, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferfDirect", e); }
    }

    public static void alGetBuffer3fDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment value1, @CType("ALfloat *") java.lang.foreign.MemorySegment value2, @CType("ALfloat *") java.lang.foreign.MemorySegment value3) {
        if (Handles.MH_alGetBuffer3fDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBuffer3fDirect");
        try {
            Handles.MH_alGetBuffer3fDirect.invokeExact(context, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3fDirect", e); }
    }

    public static void alGetBufferfvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetBufferfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferfvDirect");
        try {
            Handles.MH_alGetBufferfvDirect.invokeExact(context, buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferfvDirect", e); }
    }

    public static void alGetBufferiDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment value) {
        if (Handles.MH_alGetBufferiDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferiDirect");
        try {
            Handles.MH_alGetBufferiDirect.invokeExact(context, buffer, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferiDirect", e); }
    }

    public static void alGetBuffer3iDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment value1, @CType("ALint *") java.lang.foreign.MemorySegment value2, @CType("ALint *") java.lang.foreign.MemorySegment value3) {
        if (Handles.MH_alGetBuffer3iDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBuffer3iDirect");
        try {
            Handles.MH_alGetBuffer3iDirect.invokeExact(context, buffer, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3iDirect", e); }
    }

    public static void alGetBufferivDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetBufferivDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferivDirect");
        try {
            Handles.MH_alGetBufferivDirect.invokeExact(context, buffer, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferivDirect", e); }
    }

    public static void alGenEffectsDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("ALuint *") java.lang.foreign.MemorySegment effects) {
        if (Handles.MH_alGenEffectsDirect == null) throw new SymbolNotFoundError("Symbol not found: alGenEffectsDirect");
        try {
            Handles.MH_alGenEffectsDirect.invokeExact(context, n, effects);
        } catch (Throwable e) { throw new RuntimeException("error in alGenEffectsDirect", e); }
    }

    public static void alDeleteEffectsDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment effects) {
        if (Handles.MH_alDeleteEffectsDirect == null) throw new SymbolNotFoundError("Symbol not found: alDeleteEffectsDirect");
        try {
            Handles.MH_alDeleteEffectsDirect.invokeExact(context, n, effects);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteEffectsDirect", e); }
    }

    public static @CType("ALboolean") boolean alIsEffectDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effect) {
        if (Handles.MH_alIsEffectDirect == null) throw new SymbolNotFoundError("Symbol not found: alIsEffectDirect");
        try {
            return (boolean) Handles.MH_alIsEffectDirect.invokeExact(context, effect);
        } catch (Throwable e) { throw new RuntimeException("error in alIsEffectDirect", e); }
    }

    public static void alEffectiDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("ALint") int iValue) {
        if (Handles.MH_alEffectiDirect == null) throw new SymbolNotFoundError("Symbol not found: alEffectiDirect");
        try {
            Handles.MH_alEffectiDirect.invokeExact(context, effect, param, iValue);
        } catch (Throwable e) { throw new RuntimeException("error in alEffectiDirect", e); }
    }

    public static void alEffectivDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("const ALint *") java.lang.foreign.MemorySegment piValues) {
        if (Handles.MH_alEffectivDirect == null) throw new SymbolNotFoundError("Symbol not found: alEffectivDirect");
        try {
            Handles.MH_alEffectivDirect.invokeExact(context, effect, param, piValues);
        } catch (Throwable e) { throw new RuntimeException("error in alEffectivDirect", e); }
    }

    public static void alEffectfDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("ALfloat") float flValue) {
        if (Handles.MH_alEffectfDirect == null) throw new SymbolNotFoundError("Symbol not found: alEffectfDirect");
        try {
            Handles.MH_alEffectfDirect.invokeExact(context, effect, param, flValue);
        } catch (Throwable e) { throw new RuntimeException("error in alEffectfDirect", e); }
    }

    public static void alEffectfvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("const ALfloat *") java.lang.foreign.MemorySegment pflValues) {
        if (Handles.MH_alEffectfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alEffectfvDirect");
        try {
            Handles.MH_alEffectfvDirect.invokeExact(context, effect, param, pflValues);
        } catch (Throwable e) { throw new RuntimeException("error in alEffectfvDirect", e); }
    }

    public static void alGetEffectiDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment piValue) {
        if (Handles.MH_alGetEffectiDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetEffectiDirect");
        try {
            Handles.MH_alGetEffectiDirect.invokeExact(context, effect, param, piValue);
        } catch (Throwable e) { throw new RuntimeException("error in alGetEffectiDirect", e); }
    }

    public static void alGetEffectivDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment piValues) {
        if (Handles.MH_alGetEffectivDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetEffectivDirect");
        try {
            Handles.MH_alGetEffectivDirect.invokeExact(context, effect, param, piValues);
        } catch (Throwable e) { throw new RuntimeException("error in alGetEffectivDirect", e); }
    }

    public static void alGetEffectfDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment pflValue) {
        if (Handles.MH_alGetEffectfDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetEffectfDirect");
        try {
            Handles.MH_alGetEffectfDirect.invokeExact(context, effect, param, pflValue);
        } catch (Throwable e) { throw new RuntimeException("error in alGetEffectfDirect", e); }
    }

    public static void alGetEffectfvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effect, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment pflValues) {
        if (Handles.MH_alGetEffectfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetEffectfvDirect");
        try {
            Handles.MH_alGetEffectfvDirect.invokeExact(context, effect, param, pflValues);
        } catch (Throwable e) { throw new RuntimeException("error in alGetEffectfvDirect", e); }
    }

    public static void alGenFiltersDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("ALuint *") java.lang.foreign.MemorySegment filters) {
        if (Handles.MH_alGenFiltersDirect == null) throw new SymbolNotFoundError("Symbol not found: alGenFiltersDirect");
        try {
            Handles.MH_alGenFiltersDirect.invokeExact(context, n, filters);
        } catch (Throwable e) { throw new RuntimeException("error in alGenFiltersDirect", e); }
    }

    public static void alDeleteFiltersDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment filters) {
        if (Handles.MH_alDeleteFiltersDirect == null) throw new SymbolNotFoundError("Symbol not found: alDeleteFiltersDirect");
        try {
            Handles.MH_alDeleteFiltersDirect.invokeExact(context, n, filters);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteFiltersDirect", e); }
    }

    public static @CType("ALboolean") boolean alIsFilterDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int filter) {
        if (Handles.MH_alIsFilterDirect == null) throw new SymbolNotFoundError("Symbol not found: alIsFilterDirect");
        try {
            return (boolean) Handles.MH_alIsFilterDirect.invokeExact(context, filter);
        } catch (Throwable e) { throw new RuntimeException("error in alIsFilterDirect", e); }
    }

    public static void alFilteriDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("ALint") int iValue) {
        if (Handles.MH_alFilteriDirect == null) throw new SymbolNotFoundError("Symbol not found: alFilteriDirect");
        try {
            Handles.MH_alFilteriDirect.invokeExact(context, filter, param, iValue);
        } catch (Throwable e) { throw new RuntimeException("error in alFilteriDirect", e); }
    }

    public static void alFilterivDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("const ALint *") java.lang.foreign.MemorySegment piValues) {
        if (Handles.MH_alFilterivDirect == null) throw new SymbolNotFoundError("Symbol not found: alFilterivDirect");
        try {
            Handles.MH_alFilterivDirect.invokeExact(context, filter, param, piValues);
        } catch (Throwable e) { throw new RuntimeException("error in alFilterivDirect", e); }
    }

    public static void alFilterfDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("ALfloat") float flValue) {
        if (Handles.MH_alFilterfDirect == null) throw new SymbolNotFoundError("Symbol not found: alFilterfDirect");
        try {
            Handles.MH_alFilterfDirect.invokeExact(context, filter, param, flValue);
        } catch (Throwable e) { throw new RuntimeException("error in alFilterfDirect", e); }
    }

    public static void alFilterfvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("const ALfloat *") java.lang.foreign.MemorySegment pflValues) {
        if (Handles.MH_alFilterfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alFilterfvDirect");
        try {
            Handles.MH_alFilterfvDirect.invokeExact(context, filter, param, pflValues);
        } catch (Throwable e) { throw new RuntimeException("error in alFilterfvDirect", e); }
    }

    public static void alGetFilteriDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment piValue) {
        if (Handles.MH_alGetFilteriDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetFilteriDirect");
        try {
            Handles.MH_alGetFilteriDirect.invokeExact(context, filter, param, piValue);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFilteriDirect", e); }
    }

    public static void alGetFilterivDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment piValues) {
        if (Handles.MH_alGetFilterivDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetFilterivDirect");
        try {
            Handles.MH_alGetFilterivDirect.invokeExact(context, filter, param, piValues);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFilterivDirect", e); }
    }

    public static void alGetFilterfDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment pflValue) {
        if (Handles.MH_alGetFilterfDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetFilterfDirect");
        try {
            Handles.MH_alGetFilterfDirect.invokeExact(context, filter, param, pflValue);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFilterfDirect", e); }
    }

    public static void alGetFilterfvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int filter, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment pflValues) {
        if (Handles.MH_alGetFilterfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetFilterfvDirect");
        try {
            Handles.MH_alGetFilterfvDirect.invokeExact(context, filter, param, pflValues);
        } catch (Throwable e) { throw new RuntimeException("error in alGetFilterfvDirect", e); }
    }

    public static void alGenAuxiliaryEffectSlotsDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("ALuint *") java.lang.foreign.MemorySegment effectslots) {
        if (Handles.MH_alGenAuxiliaryEffectSlotsDirect == null) throw new SymbolNotFoundError("Symbol not found: alGenAuxiliaryEffectSlotsDirect");
        try {
            Handles.MH_alGenAuxiliaryEffectSlotsDirect.invokeExact(context, n, effectslots);
        } catch (Throwable e) { throw new RuntimeException("error in alGenAuxiliaryEffectSlotsDirect", e); }
    }

    public static void alDeleteAuxiliaryEffectSlotsDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment effectslots) {
        if (Handles.MH_alDeleteAuxiliaryEffectSlotsDirect == null) throw new SymbolNotFoundError("Symbol not found: alDeleteAuxiliaryEffectSlotsDirect");
        try {
            Handles.MH_alDeleteAuxiliaryEffectSlotsDirect.invokeExact(context, n, effectslots);
        } catch (Throwable e) { throw new RuntimeException("error in alDeleteAuxiliaryEffectSlotsDirect", e); }
    }

    public static @CType("ALboolean") boolean alIsAuxiliaryEffectSlotDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effectslot) {
        if (Handles.MH_alIsAuxiliaryEffectSlotDirect == null) throw new SymbolNotFoundError("Symbol not found: alIsAuxiliaryEffectSlotDirect");
        try {
            return (boolean) Handles.MH_alIsAuxiliaryEffectSlotDirect.invokeExact(context, effectslot);
        } catch (Throwable e) { throw new RuntimeException("error in alIsAuxiliaryEffectSlotDirect", e); }
    }

    public static void alAuxiliaryEffectSlotiDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("ALint") int iValue) {
        if (Handles.MH_alAuxiliaryEffectSlotiDirect == null) throw new SymbolNotFoundError("Symbol not found: alAuxiliaryEffectSlotiDirect");
        try {
            Handles.MH_alAuxiliaryEffectSlotiDirect.invokeExact(context, effectslot, param, iValue);
        } catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSlotiDirect", e); }
    }

    public static void alAuxiliaryEffectSlotivDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("const ALint *") java.lang.foreign.MemorySegment piValues) {
        if (Handles.MH_alAuxiliaryEffectSlotivDirect == null) throw new SymbolNotFoundError("Symbol not found: alAuxiliaryEffectSlotivDirect");
        try {
            Handles.MH_alAuxiliaryEffectSlotivDirect.invokeExact(context, effectslot, param, piValues);
        } catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSlotivDirect", e); }
    }

    public static void alAuxiliaryEffectSlotfDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("ALfloat") float flValue) {
        if (Handles.MH_alAuxiliaryEffectSlotfDirect == null) throw new SymbolNotFoundError("Symbol not found: alAuxiliaryEffectSlotfDirect");
        try {
            Handles.MH_alAuxiliaryEffectSlotfDirect.invokeExact(context, effectslot, param, flValue);
        } catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSlotfDirect", e); }
    }

    public static void alAuxiliaryEffectSlotfvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("const ALfloat *") java.lang.foreign.MemorySegment pflValues) {
        if (Handles.MH_alAuxiliaryEffectSlotfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alAuxiliaryEffectSlotfvDirect");
        try {
            Handles.MH_alAuxiliaryEffectSlotfvDirect.invokeExact(context, effectslot, param, pflValues);
        } catch (Throwable e) { throw new RuntimeException("error in alAuxiliaryEffectSlotfvDirect", e); }
    }

    public static void alGetAuxiliaryEffectSlotiDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment piValue) {
        if (Handles.MH_alGetAuxiliaryEffectSlotiDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetAuxiliaryEffectSlotiDirect");
        try {
            Handles.MH_alGetAuxiliaryEffectSlotiDirect.invokeExact(context, effectslot, param, piValue);
        } catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSlotiDirect", e); }
    }

    public static void alGetAuxiliaryEffectSlotivDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("ALint *") java.lang.foreign.MemorySegment piValues) {
        if (Handles.MH_alGetAuxiliaryEffectSlotivDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetAuxiliaryEffectSlotivDirect");
        try {
            Handles.MH_alGetAuxiliaryEffectSlotivDirect.invokeExact(context, effectslot, param, piValues);
        } catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSlotivDirect", e); }
    }

    public static void alGetAuxiliaryEffectSlotfDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment pflValue) {
        if (Handles.MH_alGetAuxiliaryEffectSlotfDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetAuxiliaryEffectSlotfDirect");
        try {
            Handles.MH_alGetAuxiliaryEffectSlotfDirect.invokeExact(context, effectslot, param, pflValue);
        } catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSlotfDirect", e); }
    }

    public static void alGetAuxiliaryEffectSlotfvDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int effectslot, @CType("ALenum") int param, @CType("ALfloat *") java.lang.foreign.MemorySegment pflValues) {
        if (Handles.MH_alGetAuxiliaryEffectSlotfvDirect == null) throw new SymbolNotFoundError("Symbol not found: alGetAuxiliaryEffectSlotfvDirect");
        try {
            Handles.MH_alGetAuxiliaryEffectSlotfvDirect.invokeExact(context, effectslot, param, pflValues);
        } catch (Throwable e) { throw new RuntimeException("error in alGetAuxiliaryEffectSlotfvDirect", e); }
    }

    public static void alBufferDataStaticDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int format, @CType("ALvoid *") java.lang.foreign.MemorySegment data, @CType("ALsizei") int size, @CType("ALsizei") int freq) {
        if (Handles.MH_alBufferDataStaticDirect == null) throw new SymbolNotFoundError("Symbol not found: alBufferDataStaticDirect");
        try {
            Handles.MH_alBufferDataStaticDirect.invokeExact(context, buffer, format, data, size, freq);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferDataStaticDirect", e); }
    }

    public static void alDebugMessageCallbackDirectEXT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALDEBUGPROCEXT") java.lang.foreign.MemorySegment callback, @CType("void*") java.lang.foreign.MemorySegment userParam) {
        if (Handles.MH_alDebugMessageCallbackDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alDebugMessageCallbackDirectEXT");
        try {
            Handles.MH_alDebugMessageCallbackDirectEXT.invokeExact(context, callback, userParam);
        } catch (Throwable e) { throw new RuntimeException("error in alDebugMessageCallbackDirectEXT", e); }
    }

    public static void alDebugMessageInsertDirectEXT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int source, @CType("ALenum") int type, @CType("ALuint") int id, @CType("ALenum") int severity, @CType("ALsizei") int length, @CType("const ALchar*") java.lang.foreign.MemorySegment message) {
        if (Handles.MH_alDebugMessageInsertDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alDebugMessageInsertDirectEXT");
        try {
            Handles.MH_alDebugMessageInsertDirectEXT.invokeExact(context, source, type, id, severity, length, message);
        } catch (Throwable e) { throw new RuntimeException("error in alDebugMessageInsertDirectEXT", e); }
    }

    public static void alDebugMessageControlDirectEXT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int source, @CType("ALenum") int type, @CType("ALenum") int severity, @CType("ALsizei") int count, @CType("const ALuint *") java.lang.foreign.MemorySegment ids, @CType("ALboolean") boolean enable) {
        if (Handles.MH_alDebugMessageControlDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alDebugMessageControlDirectEXT");
        try {
            Handles.MH_alDebugMessageControlDirectEXT.invokeExact(context, source, type, severity, count, ids, enable);
        } catch (Throwable e) { throw new RuntimeException("error in alDebugMessageControlDirectEXT", e); }
    }

    public static void alPushDebugGroupDirectEXT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int source, @CType("ALuint") int id, @CType("ALsizei") int length, @CType("const ALchar*") java.lang.foreign.MemorySegment message) {
        if (Handles.MH_alPushDebugGroupDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alPushDebugGroupDirectEXT");
        try {
            Handles.MH_alPushDebugGroupDirectEXT.invokeExact(context, source, id, length, message);
        } catch (Throwable e) { throw new RuntimeException("error in alPushDebugGroupDirectEXT", e); }
    }

    public static void alPopDebugGroupDirectEXT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context) {
        if (Handles.MH_alPopDebugGroupDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alPopDebugGroupDirectEXT");
        try {
            Handles.MH_alPopDebugGroupDirectEXT.invokeExact(context);
        } catch (Throwable e) { throw new RuntimeException("error in alPopDebugGroupDirectEXT", e); }
    }

    public static @CType("ALuint") int alGetDebugMessageLogDirectEXT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int count, @CType("ALsizei") int logBufSize, @CType("ALenum *") java.lang.foreign.MemorySegment sources, @CType("ALenum *") java.lang.foreign.MemorySegment types, @CType("ALuint *") java.lang.foreign.MemorySegment ids, @CType("ALenum *") java.lang.foreign.MemorySegment severities, @CType("ALsizei *") java.lang.foreign.MemorySegment lengths, @CType("ALchar*") java.lang.foreign.MemorySegment logBuf) {
        if (Handles.MH_alGetDebugMessageLogDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetDebugMessageLogDirectEXT");
        try {
            return (int) Handles.MH_alGetDebugMessageLogDirectEXT.invokeExact(context, count, logBufSize, sources, types, ids, severities, lengths, logBuf);
        } catch (Throwable e) { throw new RuntimeException("error in alGetDebugMessageLogDirectEXT", e); }
    }

    public static void alObjectLabelDirectEXT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int identifier, @CType("ALuint") int name, @CType("ALsizei") int length, @CType("const ALchar*") java.lang.foreign.MemorySegment label) {
        if (Handles.MH_alObjectLabelDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alObjectLabelDirectEXT");
        try {
            Handles.MH_alObjectLabelDirectEXT.invokeExact(context, identifier, name, length, label);
        } catch (Throwable e) { throw new RuntimeException("error in alObjectLabelDirectEXT", e); }
    }

    public static void alGetObjectLabelDirectEXT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int identifier, @CType("ALuint") int name, @CType("ALsizei") int bufSize, @CType("ALsizei *") java.lang.foreign.MemorySegment length, @CType("ALchar*") java.lang.foreign.MemorySegment label) {
        if (Handles.MH_alGetObjectLabelDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetObjectLabelDirectEXT");
        try {
            Handles.MH_alGetObjectLabelDirectEXT.invokeExact(context, identifier, name, bufSize, length, label);
        } catch (Throwable e) { throw new RuntimeException("error in alGetObjectLabelDirectEXT", e); }
    }

    public static @CType("void*") java.lang.foreign.MemorySegment alGetPointerDirectEXT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int pname) {
        if (Handles.MH_alGetPointerDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetPointerDirectEXT");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alGetPointerDirectEXT.invokeExact(context, pname);
        } catch (Throwable e) { throw new RuntimeException("error in alGetPointerDirectEXT", e); }
    }

    public static void alGetPointervDirectEXT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int pname, @CType("void**") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetPointervDirectEXT == null) throw new SymbolNotFoundError("Symbol not found: alGetPointervDirectEXT");
        try {
            Handles.MH_alGetPointervDirectEXT.invokeExact(context, pname, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetPointervDirectEXT", e); }
    }

    public static void alRequestFoldbackStartDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int mode, @CType("ALsizei") int count, @CType("ALsizei") int length, @CType("ALfloat *") java.lang.foreign.MemorySegment mem, @CType("LPALFOLDBACKCALLBACK") java.lang.foreign.MemorySegment callback) {
        if (Handles.MH_alRequestFoldbackStartDirect == null) throw new SymbolNotFoundError("Symbol not found: alRequestFoldbackStartDirect");
        try {
            Handles.MH_alRequestFoldbackStartDirect.invokeExact(context, mode, count, length, mem, callback);
        } catch (Throwable e) { throw new RuntimeException("error in alRequestFoldbackStartDirect", e); }
    }

    public static void alRequestFoldbackStopDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context) {
        if (Handles.MH_alRequestFoldbackStopDirect == null) throw new SymbolNotFoundError("Symbol not found: alRequestFoldbackStopDirect");
        try {
            Handles.MH_alRequestFoldbackStopDirect.invokeExact(context);
        } catch (Throwable e) { throw new RuntimeException("error in alRequestFoldbackStopDirect", e); }
    }

    public static void alBufferSubDataDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int format, @CType("const ALvoid *") java.lang.foreign.MemorySegment data, @CType("ALsizei") int offset, @CType("ALsizei") int length) {
        if (Handles.MH_alBufferSubDataDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alBufferSubDataDirectSOFT");
        try {
            Handles.MH_alBufferSubDataDirectSOFT.invokeExact(context, buffer, format, data, offset, length);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferSubDataDirectSOFT", e); }
    }

    public static void alSourcedDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble") double value) {
        if (Handles.MH_alSourcedDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcedDirectSOFT");
        try {
            Handles.MH_alSourcedDirectSOFT.invokeExact(context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcedDirectSOFT", e); }
    }

    public static void alSource3dDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble") double value1, @CType("ALdouble") double value2, @CType("ALdouble") double value3) {
        if (Handles.MH_alSource3dDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSource3dDirectSOFT");
        try {
            Handles.MH_alSource3dDirectSOFT.invokeExact(context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3dDirectSOFT", e); }
    }

    public static void alSourcedvDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALdouble *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alSourcedvDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcedvDirectSOFT");
        try {
            Handles.MH_alSourcedvDirectSOFT.invokeExact(context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcedvDirectSOFT", e); }
    }

    public static void alGetSourcedDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble *") java.lang.foreign.MemorySegment value) {
        if (Handles.MH_alGetSourcedDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcedDirectSOFT");
        try {
            Handles.MH_alGetSourcedDirectSOFT.invokeExact(context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcedDirectSOFT", e); }
    }

    public static void alGetSource3dDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble *") java.lang.foreign.MemorySegment value1, @CType("ALdouble *") java.lang.foreign.MemorySegment value2, @CType("ALdouble *") java.lang.foreign.MemorySegment value3) {
        if (Handles.MH_alGetSource3dDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSource3dDirectSOFT");
        try {
            Handles.MH_alGetSource3dDirectSOFT.invokeExact(context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3dDirectSOFT", e); }
    }

    public static void alGetSourcedvDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALdouble *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetSourcedvDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcedvDirectSOFT");
        try {
            Handles.MH_alGetSourcedvDirectSOFT.invokeExact(context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcedvDirectSOFT", e); }
    }

    public static void alSourcei64DirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT") long value) {
        if (Handles.MH_alSourcei64DirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcei64DirectSOFT");
        try {
            Handles.MH_alSourcei64DirectSOFT.invokeExact(context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcei64DirectSOFT", e); }
    }

    public static void alSource3i64DirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT") long value1, @CType("ALint64SOFT") long value2, @CType("ALint64SOFT") long value3) {
        if (Handles.MH_alSource3i64DirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSource3i64DirectSOFT");
        try {
            Handles.MH_alSource3i64DirectSOFT.invokeExact(context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alSource3i64DirectSOFT", e); }
    }

    public static void alSourcei64vDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("const ALint64SOFT *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alSourcei64vDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcei64vDirectSOFT");
        try {
            Handles.MH_alSourcei64vDirectSOFT.invokeExact(context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcei64vDirectSOFT", e); }
    }

    public static void alGetSourcei64DirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT *") java.lang.foreign.MemorySegment value) {
        if (Handles.MH_alGetSourcei64DirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcei64DirectSOFT");
        try {
            Handles.MH_alGetSourcei64DirectSOFT.invokeExact(context, source, param, value);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcei64DirectSOFT", e); }
    }

    public static void alGetSource3i64DirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT *") java.lang.foreign.MemorySegment value1, @CType("ALint64SOFT *") java.lang.foreign.MemorySegment value2, @CType("ALint64SOFT *") java.lang.foreign.MemorySegment value3) {
        if (Handles.MH_alGetSource3i64DirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSource3i64DirectSOFT");
        try {
            Handles.MH_alGetSource3i64DirectSOFT.invokeExact(context, source, param, value1, value2, value3);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSource3i64DirectSOFT", e); }
    }

    public static void alGetSourcei64vDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALenum") int param, @CType("ALint64SOFT *") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetSourcei64vDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetSourcei64vDirectSOFT");
        try {
            Handles.MH_alGetSourcei64vDirectSOFT.invokeExact(context, source, param, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetSourcei64vDirectSOFT", e); }
    }

    public static void alDeferUpdatesDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context) {
        if (Handles.MH_alDeferUpdatesDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alDeferUpdatesDirectSOFT");
        try {
            Handles.MH_alDeferUpdatesDirectSOFT.invokeExact(context);
        } catch (Throwable e) { throw new RuntimeException("error in alDeferUpdatesDirectSOFT", e); }
    }

    public static void alProcessUpdatesDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context) {
        if (Handles.MH_alProcessUpdatesDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alProcessUpdatesDirectSOFT");
        try {
            Handles.MH_alProcessUpdatesDirectSOFT.invokeExact(context);
        } catch (Throwable e) { throw new RuntimeException("error in alProcessUpdatesDirectSOFT", e); }
    }

    public static @CType("const ALchar*") java.lang.foreign.MemorySegment alGetStringiDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int pname, @CType("ALsizei") int index) {
        if (Handles.MH_alGetStringiDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetStringiDirectSOFT");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alGetStringiDirectSOFT.invokeExact(context, pname, index);
        } catch (Throwable e) { throw new RuntimeException("error in alGetStringiDirectSOFT", e); }
    }

    public static void alEventControlDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int count, @CType("const ALenum *") java.lang.foreign.MemorySegment types, @CType("ALboolean") boolean enable) {
        if (Handles.MH_alEventControlDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alEventControlDirectSOFT");
        try {
            Handles.MH_alEventControlDirectSOFT.invokeExact(context, count, types, enable);
        } catch (Throwable e) { throw new RuntimeException("error in alEventControlDirectSOFT", e); }
    }

    public static void alEventCallbackDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALEVENTPROCSOFT") java.lang.foreign.MemorySegment callback, @CType("void*") java.lang.foreign.MemorySegment userParam) {
        if (Handles.MH_alEventCallbackDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alEventCallbackDirectSOFT");
        try {
            Handles.MH_alEventCallbackDirectSOFT.invokeExact(context, callback, userParam);
        } catch (Throwable e) { throw new RuntimeException("error in alEventCallbackDirectSOFT", e); }
    }

    public static @CType("void*") java.lang.foreign.MemorySegment alGetPointerDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int pname) {
        if (Handles.MH_alGetPointerDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetPointerDirectSOFT");
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_alGetPointerDirectSOFT.invokeExact(context, pname);
        } catch (Throwable e) { throw new RuntimeException("error in alGetPointerDirectSOFT", e); }
    }

    public static void alGetPointervDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALenum") int pname, @CType("void**") java.lang.foreign.MemorySegment values) {
        if (Handles.MH_alGetPointervDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetPointervDirectSOFT");
        try {
            Handles.MH_alGetPointervDirectSOFT.invokeExact(context, pname, values);
        } catch (Throwable e) { throw new RuntimeException("error in alGetPointervDirectSOFT", e); }
    }

    public static void alBufferCallbackDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int format, @CType("ALsizei") int freq, @CType("ALBUFFERCALLBACKTYPESOFT") java.lang.foreign.MemorySegment callback, @CType("ALvoid *") java.lang.foreign.MemorySegment userptr) {
        if (Handles.MH_alBufferCallbackDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alBufferCallbackDirectSOFT");
        try {
            Handles.MH_alBufferCallbackDirectSOFT.invokeExact(context, buffer, format, freq, callback, userptr);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferCallbackDirectSOFT", e); }
    }

    public static void alGetBufferPtrDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALvoid **") java.lang.foreign.MemorySegment ptr) {
        if (Handles.MH_alGetBufferPtrDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferPtrDirectSOFT");
        try {
            Handles.MH_alGetBufferPtrDirectSOFT.invokeExact(context, buffer, param, ptr);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferPtrDirectSOFT", e); }
    }

    public static void alGetBuffer3PtrDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALvoid **") java.lang.foreign.MemorySegment ptr0, @CType("ALvoid **") java.lang.foreign.MemorySegment ptr1, @CType("ALvoid **") java.lang.foreign.MemorySegment ptr2) {
        if (Handles.MH_alGetBuffer3PtrDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetBuffer3PtrDirectSOFT");
        try {
            Handles.MH_alGetBuffer3PtrDirectSOFT.invokeExact(context, buffer, param, ptr0, ptr1, ptr2);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBuffer3PtrDirectSOFT", e); }
    }

    public static void alGetBufferPtrvDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALenum") int param, @CType("ALvoid **") java.lang.foreign.MemorySegment ptr) {
        if (Handles.MH_alGetBufferPtrvDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alGetBufferPtrvDirectSOFT");
        try {
            Handles.MH_alGetBufferPtrvDirectSOFT.invokeExact(context, buffer, param, ptr);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferPtrvDirectSOFT", e); }
    }

    public static void alSourcePlayAtTimeDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int source, @CType("ALint64SOFT") long start_time) {
        if (Handles.MH_alSourcePlayAtTimeDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcePlayAtTimeDirectSOFT");
        try {
            Handles.MH_alSourcePlayAtTimeDirectSOFT.invokeExact(context, source, start_time);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayAtTimeDirectSOFT", e); }
    }

    public static void alSourcePlayAtTimevDirectSOFT(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment sources, @CType("ALint64SOFT") long start_time) {
        if (Handles.MH_alSourcePlayAtTimevDirectSOFT == null) throw new SymbolNotFoundError("Symbol not found: alSourcePlayAtTimevDirectSOFT");
        try {
            Handles.MH_alSourcePlayAtTimevDirectSOFT.invokeExact(context, n, sources, start_time);
        } catch (Throwable e) { throw new RuntimeException("error in alSourcePlayAtTimevDirectSOFT", e); }
    }

    public static @CType("ALenum") int EAXSetDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("const struct _GUID *") java.lang.foreign.MemorySegment property_set_id, @CType("ALuint") int property_id, @CType("ALuint") int source_id, @CType("ALvoid *") java.lang.foreign.MemorySegment value, @CType("ALuint") int value_size) {
        if (Handles.MH_EAXSetDirect == null) throw new SymbolNotFoundError("Symbol not found: EAXSetDirect");
        try {
            return (int) Handles.MH_EAXSetDirect.invokeExact(context, property_set_id, property_id, source_id, value, value_size);
        } catch (Throwable e) { throw new RuntimeException("error in EAXSetDirect", e); }
    }

    public static @CType("ALenum") int EAXGetDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("const struct _GUID *") java.lang.foreign.MemorySegment property_set_id, @CType("ALuint") int property_id, @CType("ALuint") int source_id, @CType("ALvoid *") java.lang.foreign.MemorySegment value, @CType("ALuint") int value_size) {
        if (Handles.MH_EAXGetDirect == null) throw new SymbolNotFoundError("Symbol not found: EAXGetDirect");
        try {
            return (int) Handles.MH_EAXGetDirect.invokeExact(context, property_set_id, property_id, source_id, value, value_size);
        } catch (Throwable e) { throw new RuntimeException("error in EAXGetDirect", e); }
    }

    public static @CType("ALboolean") boolean EAXSetBufferModeDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALsizei") int n, @CType("const ALuint *") java.lang.foreign.MemorySegment buffers, @CType("ALint") int value) {
        if (Handles.MH_EAXSetBufferModeDirect == null) throw new SymbolNotFoundError("Symbol not found: EAXSetBufferModeDirect");
        try {
            return (boolean) Handles.MH_EAXSetBufferModeDirect.invokeExact(context, n, buffers, value);
        } catch (Throwable e) { throw new RuntimeException("error in EAXSetBufferModeDirect", e); }
    }

    public static @CType("ALenum") int EAXGetBufferModeDirect(@CType("ALCcontext *") java.lang.foreign.MemorySegment context, @CType("ALuint") int buffer, @CType("ALint *") java.lang.foreign.MemorySegment pReserved) {
        if (Handles.MH_EAXGetBufferModeDirect == null) throw new SymbolNotFoundError("Symbol not found: EAXGetBufferModeDirect");
        try {
            return (int) Handles.MH_EAXGetBufferModeDirect.invokeExact(context, buffer, pReserved);
        } catch (Throwable e) { throw new RuntimeException("error in EAXGetBufferModeDirect", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALEXTDirectContext() {
    }
}
