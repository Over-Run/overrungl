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

package overrungl.openal

import overrungl.gen.*

fun alext() {
    //region upcalls
    val LPALFOLDBACKCALLBACK = Upcall(alPackage, "ALFoldbackCallback") {
        targetMethod = "invoke"(
            void,
            ALenum("mode"),
            ALsizei("count")
        )
    }.pointerType c "LPALFOLDBACKCALLBACK"
    val ALEVENTPROCSOFT = Upcall(alPackage, "ALEventProcSOFT") {
        targetMethod = "invoke"(
            void,
            ALenum("eventType"),
            ALuint("object"),
            ALuint("param"),
            ALsizei("length"),
            const_ALchar_ptr("message"),
            void_ptr("userParam")
        )
    }.pointerType c "ALEVENTPROCSOFT"
    val ALBUFFERCALLBACKTYPESOFT = Upcall(alPackage, "ALBufferCallbackTypeSOFT") {
        targetMethod = "invoke"(
            ALsizei,
            ALvoid_ptr("userptr"),
            ALvoid_ptr("sampledata"),
            ALsizei("numbytes")
        )
    }.pointerType c "ALBUFFERCALLBACKTYPESOFT"
    val ALDEBUGPROCEXT = Upcall(alPackage, "ALDebugProcEXT") {
        targetMethod = "invoke"(
            void,
            ALenum("source"),
            ALenum("type"),
            ALuint("id"),
            ALenum("severity"),
            ALsizei("length"),
            const_ALchar_ptr("message"),
            void_ptr("userParam")
        )
    }.pointerType c "ALDEBUGPROCEXT"
    val ALCEVENTPROCTYPESOFT = Upcall(alPackage, "ALCEventProcTypeSOFT") {
        targetMethod = "invoke"(
            void,
            ALCenum("eventType"),
            ALCenum("deviceType"),
            ALCdevice_ptr("device"),
            ALCsizei("length"),
            const_ALCchar_ptr("message"),
            void_ptr("userParam")
        )
    }.pointerType c "ALCEVENTPROCTYPESOFT"
    //endregion

    //region downcalls
    downcall("AL_LOKI_IMA_ADPCM_format") {
        ALenum("AL_FORMAT_IMA_ADPCM_MONO16_EXT" to "0x10000")
        ALenum("AL_FORMAT_IMA_ADPCM_STEREO16_EXT" to "0x10001")
    }
    downcall("AL_LOKI_WAVE_format") {
        ALenum("AL_FORMAT_WAVE_EXT" to "0x10002")
    }
    downcall("AL_EXT_vorbis") {
        ALenum("AL_FORMAT_VORBIS_EXT" to "0x10003")
    }
    downcall("AL_LOKI_quadriphonic") {
        ALenum("AL_FORMAT_QUAD8_LOKI" to "0x10004")
        ALenum("AL_FORMAT_QUAD16_LOKI" to "0x10005")
    }
    downcall("AL_EXT_float32") {
        ALenum("AL_FORMAT_MONO_FLOAT32" to "0x10010")
        ALenum("AL_FORMAT_STEREO_FLOAT32" to "0x10011")
    }
    downcall("AL_EXT_double") {
        ALenum("AL_FORMAT_MONO_DOUBLE_EXT" to "0x10012")
        ALenum("AL_FORMAT_STEREO_DOUBLE_EXT" to "0x10013")
    }
    downcall("AL_EXT_MULAW") {
        ALenum("AL_FORMAT_MONO_MULAW_EXT" to "0x10014")
        ALenum("AL_FORMAT_STEREO_MULAW_EXT" to "0x10015")
    }
    downcall("AL_EXT_ALAW") {
        ALenum("AL_FORMAT_MONO_ALAW_EXT" to "0x10016")
        ALenum("AL_FORMAT_STEREO_ALAW_EXT" to "0x10017")
    }
    downcall("ALC_LOKI_audio_channel") {
        ALCenum("ALC_CHAN_MAIN_LOKI" to "0x500001")
        ALCenum("ALC_CHAN_PCM_LOKI" to "0x500002")
        ALCenum("ALC_CHAN_CD_LOKI" to "0x500003")
    }
    downcall("AL_EXT_MCFORMATS") {
        ALenum("AL_FORMAT_QUAD8" to "0x1204")
        ALenum("AL_FORMAT_QUAD16" to "0x1205")
        ALenum("AL_FORMAT_QUAD32" to "0x1206")
        ALenum("AL_FORMAT_REAR8" to "0x1207")
        ALenum("AL_FORMAT_REAR16" to "0x1208")
        ALenum("AL_FORMAT_REAR32" to "0x1209")
        ALenum("AL_FORMAT_51CHN8" to "0x120A")
        ALenum("AL_FORMAT_51CHN16" to "0x120B")
        ALenum("AL_FORMAT_51CHN32" to "0x120C")
        ALenum("AL_FORMAT_61CHN8" to "0x120D")
        ALenum("AL_FORMAT_61CHN16" to "0x120E")
        ALenum("AL_FORMAT_61CHN32" to "0x120F")
        ALenum("AL_FORMAT_71CHN8" to "0x1210")
        ALenum("AL_FORMAT_71CHN16" to "0x1211")
        ALenum("AL_FORMAT_71CHN32" to "0x1212")
    }
    downcall("AL_EXT_MULAW_MCFORMATS") {
        ALenum("AL_FORMAT_MONO_MULAW" to "0x10014")
        ALenum("AL_FORMAT_STEREO_MULAW" to "0x10015")
        ALenum("AL_FORMAT_QUAD_MULAW" to "0x10021")
        ALenum("AL_FORMAT_REAR_MULAW" to "0x10022")
        ALenum("AL_FORMAT_51CHN_MULAW" to "0x10023")
        ALenum("AL_FORMAT_61CHN_MULAW" to "0x10024")
        ALenum("AL_FORMAT_71CHN_MULAW" to "0x10025")
    }
    downcall("AL_EXT_IMA4") {
        ALenum("AL_FORMAT_MONO_IMA4" to "0x1300")
        ALenum("AL_FORMAT_STEREO_IMA4" to "0x1301")
    }
    downcall("AL_EXT_STATIC_BUFFER") {
        "alBufferDataStatic"(
            void,
            const_ALuint("buffer"),
            ALenum("format"),
            ALvoid_ptr("data"),
            ALsizei("size"),
            ALsizei("freq"),
            entrypoint = "alBufferDataStatic",
            optional = true
        )
    }
    downcall("ALC_EXT_disconnect") {
        ALCenum("ALC_CONNECTED" to "0x313")
    }
    downcall("ALC_EXT_thread_local_context") {
        "alcSetThreadContext"(
            ALCboolean,
            ALCcontext_ptr("context"),
            entrypoint = "alcSetThreadContext",
            optional = true
        )
        "alcGetThreadContext"(ALCcontext_ptr, entrypoint = "alcGetThreadContext", optional = true)
    }
    downcall("AL_EXT_source_distance_model") {
        ALenum("AL_SOURCE_DISTANCE_MODEL" to "0x200")
    }
    downcall("AL_SOFT_buffer_sub_data") {
        ALenum("AL_BYTE_RW_OFFSETS_SOFT" to "0x1031")
        ALenum("AL_SAMPLE_RW_OFFSETS_SOFT" to "0x1032")
        "alBufferSubDataSOFT"(
            void,
            ALuint("buffer"),
            ALenum("format"),
            const_ALvoid_ptr("data"),
            ALsizei("offset"),
            ALsizei("length"),
            entrypoint = "alBufferSubDataSOFT",
            optional = true
        )
    }
    downcall("AL_SOFT_loop_points") {
        ALenum("AL_LOOP_POINTS_SOFT" to "0x2015")
    }
    downcall("AL_EXT_FOLDBACK") {
        string_u8("AL_EXT_FOLDBACK_NAME" to """"AL_EXT_FOLDBACK"""")
        ALenum("AL_FOLDBACK_EVENT_BLOCK" to "0x4112")
        ALenum("AL_FOLDBACK_EVENT_START" to "0x4111")
        ALenum("AL_FOLDBACK_EVENT_STOP" to "0x4113")
        ALenum("AL_FOLDBACK_MODE_MONO" to "0x4101")
        ALenum("AL_FOLDBACK_MODE_STEREO" to "0x4102")
        "alRequestFoldbackStart"(
            void,
            ALenum("mode"),
            ALsizei("count"),
            ALsizei("length"),
            ALfloat_ptr("mem"),
            LPALFOLDBACKCALLBACK("callback"),
            entrypoint = "alRequestFoldbackStart",
            optional = true
        )
        "alRequestFoldbackStop"(void, entrypoint = "alRequestFoldbackStop", optional = true)
    }
    downcall("ALC_EXT_DEDICATED") {
        ALenum("AL_DEDICATED_GAIN" to "0x0001")
        ALenum("AL_EFFECT_DEDICATED_DIALOGUE" to "0x9001")
        ALenum("AL_EFFECT_DEDICATED_LOW_FREQUENCY_EFFECT" to "0x9000")
    }
    downcall("AL_SOFT_buffer_samples") {
        ALenum("AL_MONO_SOFT" to "0x1500")
        ALenum("AL_STEREO_SOFT" to "0x1501")
        ALenum("AL_REAR_SOFT" to "0x1502")
        ALenum("AL_QUAD_SOFT" to "0x1503")
        ALenum("AL_5POINT1_SOFT" to "0x1504")
        ALenum("AL_6POINT1_SOFT" to "0x1505")
        ALenum("AL_7POINT1_SOFT" to "0x1506")

        ALenum("AL_BYTE_SOFT" to "0x1400")
        ALenum("AL_UNSIGNED_BYTE_SOFT" to "0x1401")
        ALenum("AL_SHORT_SOFT" to "0x1402")
        ALenum("AL_UNSIGNED_SHORT_SOFT" to "0x1403")
        ALenum("AL_INT_SOFT" to "0x1404")
        ALenum("AL_UNSIGNED_INT_SOFT" to "0x1405")
        ALenum("AL_FLOAT_SOFT" to "0x1406")
        ALenum("AL_DOUBLE_SOFT" to "0x1407")
        ALenum("AL_BYTE3_SOFT" to "0x1408")
        ALenum("AL_UNSIGNED_BYTE3_SOFT" to "0x1409")

        ALenum("AL_MONO8_SOFT" to "0x1100")
        ALenum("AL_MONO16_SOFT" to "0x1101")
        ALenum("AL_MONO32F_SOFT" to "0x10010")
        ALenum("AL_STEREO8_SOFT" to "0x1102")
        ALenum("AL_STEREO16_SOFT" to "0x1103")
        ALenum("AL_STEREO32F_SOFT" to "0x10011")
        ALenum("AL_QUAD8_SOFT" to "0x1204")
        ALenum("AL_QUAD16_SOFT" to "0x1205")
        ALenum("AL_QUAD32F_SOFT" to "0x1206")
        ALenum("AL_REAR8_SOFT" to "0x1207")
        ALenum("AL_REAR16_SOFT" to "0x1208")
        ALenum("AL_REAR32F_SOFT" to "0x1209")
        ALenum("AL_5POINT1_8_SOFT" to "0x120A")
        ALenum("AL_5POINT1_16_SOFT" to "0x120B")
        ALenum("AL_5POINT1_32F_SOFT" to "0x120C")
        ALenum("AL_6POINT1_8_SOFT" to "0x120D")
        ALenum("AL_6POINT1_16_SOFT" to "0x120E")
        ALenum("AL_6POINT1_32F_SOFT" to "0x120F")
        ALenum("AL_7POINT1_8_SOFT" to "0x1210")
        ALenum("AL_7POINT1_16_SOFT" to "0x1211")
        ALenum("AL_7POINT1_32F_SOFT" to "0x1212")

        ALenum("AL_INTERNAL_FORMAT_SOFT" to "0x2008")
        ALenum("AL_BYTE_LENGTH_SOFT" to "0x2009")
        ALenum("AL_SAMPLE_LENGTH_SOFT" to "0x200A")
        ALenum("AL_SEC_LENGTH_SOFT" to "0x200B")

        "alBufferSamplesSOFT"(
            void,
            ALuint("buffer"),
            ALuint("samplerate"),
            ALenum("internalformat"),
            ALsizei("samples"),
            ALenum("channels"),
            ALenum("type"),
            const_ALvoid_ptr("data"),
            entrypoint = "alBufferSamplesSOFT",
            optional = true
        )
        "alBufferSubSamplesSOFT"(
            void,
            ALuint("buffer"),
            ALsizei("offset"),
            ALsizei("samples"),
            ALenum("channels"),
            ALenum("type"),
            const_ALvoid_ptr("data"),
            entrypoint = "alBufferSubSamplesSOFT",
            optional = true
        )
        "alGetBufferSamplesSOFT"(
            void,
            ALuint("buffer"),
            ALsizei("offset"),
            ALsizei("samples"),
            ALenum("channels"),
            ALenum("type"),
            ALvoid_ptr("data"),
            entrypoint = "alGetBufferSamplesSOFT",
            optional = true
        )
        "alIsBufferFormatSupportedSOFT"(
            ALboolean,
            ALenum("format"),
            entrypoint = "alIsBufferFormatSupportedSOFT",
            optional = true
        )
    }
    downcall("AL_SOFT_direct_channels") {
        ALenum("AL_DIRECT_CHANNELS_SOFT" to "0x1033")
    }
    downcall("ALC_SOFT_loopback") {
        ALCenum("ALC_FORMAT_CHANNELS_SOFT" to "0x1990")
        ALCenum("ALC_FORMAT_TYPE_SOFT" to "0x1991")

        ALCenum("ALC_BYTE_SOFT" to "0x1400")
        ALCenum("ALC_UNSIGNED_BYTE_SOFT" to "0x1401")
        ALCenum("ALC_SHORT_SOFT" to "0x1402")
        ALCenum("ALC_UNSIGNED_SHORT_SOFT" to "0x1403")
        ALCenum("ALC_INT_SOFT" to "0x1404")
        ALCenum("ALC_UNSIGNED_INT_SOFT" to "0x1405")
        ALCenum("ALC_FLOAT_SOFT" to "0x1406")

        ALCenum("ALC_MONO_SOFT" to "0x1500")
        ALCenum("ALC_STEREO_SOFT" to "0x1501")
        ALCenum("ALC_QUAD_SOFT" to "0x1503")
        ALCenum("ALC_5POINT1_SOFT" to "0x1504")
        ALCenum("ALC_6POINT1_SOFT" to "0x1505")
        ALCenum("ALC_7POINT1_SOFT" to "0x1506")

        "alcLoopbackOpenDeviceSOFT"(
            ALCdevice_ptr,
            const_ALCchar_ptr("deviceName"),
            entrypoint = "alcLoopbackOpenDeviceSOFT",
            optional = true
        )
        "alcIsRenderFormatSupportedSOFT"(
            ALCboolean,
            ALCdevice_ptr("device"),
            ALCsizei("freq"),
            ALCenum("channels"),
            ALCenum("type"),
            entrypoint = "alcIsRenderFormatSupportedSOFT",
            optional = true
        )
        "alcRenderSamplesSOFT"(
            void,
            ALCdevice_ptr("device"),
            ALCvoid_ptr("buffer"),
            ALCsizei("samples"),
            entrypoint = "alcRenderSamplesSOFT",
            optional = true
        )
    }
    downcall("AL_EXT_STEREO_ANGLES") {
        ALenum("AL_STEREO_ANGLES" to "0x1030")
    }
    downcall("AL_EXT_SOURCE_RADIUS") {
        ALenum("AL_SOURCE_RADIUS" to "0x1031")
    }
    downcall("AL_SOFT_source_latency") {
        ALenum("AL_SAMPLE_OFFSET_LATENCY_SOFT" to "0x1200")
        ALenum("AL_SEC_OFFSET_LATENCY_SOFT" to "0x1201")

        "alSourcedSOFT"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALdouble("value"),
            entrypoint = "alSourcedSOFT",
            optional = true
        )
        "alSource3dSOFT"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALdouble("value1"),
            ALdouble("value2"),
            ALdouble("value3"),
            entrypoint = "alSource3dSOFT",
            optional = true
        )
        "alSourcedvSOFT"(
            void,
            ALuint("source"),
            ALenum("param"),
            const_ALdouble_ptr("values"),
            entrypoint = "alSourcedvSOFT",
            optional = true
        )
        "alGetSourcedSOFT"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALdouble_ptr("value"),
            entrypoint = "alGetSourcedSOFT",
            optional = true
        )
        "alGetSource3dSOFT"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALdouble_ptr("value1"),
            ALdouble_ptr("value2"),
            ALdouble_ptr("value3"),
            entrypoint = "alGetSource3dSOFT",
            optional = true
        )
        "alGetSourcedvSOFT"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALdouble_ptr("values"),
            entrypoint = "alGetSourcedvSOFT",
            optional = true
        )
        "alSourcei64SOFT"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALint64SOFT("value"),
            entrypoint = "alSourcei64SOFT",
            optional = true
        )
        "alSource3i64SOFT"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALint64SOFT("value1"),
            ALint64SOFT("value2"),
            ALint64SOFT("value3"),
            entrypoint = "alSource3i64SOFT",
            optional = true
        )
        "alSourcei64vSOFT"(
            void,
            ALuint("source"),
            ALenum("param"),
            const_ALint64SOFT_ptr("values"),
            entrypoint = "alSourcei64vSOFT",
            optional = true
        )
        "alGetSourcei64SOFT"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALint64SOFT_ptr("value"),
            entrypoint = "alGetSourcei64SOFT",
            optional = true
        )
        "alGetSource3i64SOFT"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALint64SOFT_ptr("value1"),
            ALint64SOFT_ptr("value2"),
            ALint64SOFT_ptr("value3"),
            entrypoint = "alGetSource3i64SOFT",
            optional = true
        )
        "alGetSourcei64vSOFT"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALint64SOFT_ptr("values"),
            entrypoint = "alGetSourcei64vSOFT",
            optional = true
        )
    }
    downcall("ALC_EXT_DEFAULT_FILTER_ORDER") {
        ALCenum("ALC_DEFAULT_FILTER_ORDER" to "0x1100")
    }
    downcall("AL_SOFT_deferred_updates") {
        ALenum("AL_DEFERRED_UPDATES_SOFT" to "0xC002")

        "alDeferUpdatesSOFT"(void, entrypoint = "alDeferUpdatesSOFT", optional = true)
        "alProcessUpdatesSOFT"(void, entrypoint = "alProcessUpdatesSOFT", optional = true)
    }
    downcall("AL_SOFT_block_alignment") {
        ALenum("AL_UNPACK_BLOCK_ALIGNMENT_SOFT" to "0x200C")
        ALenum("AL_PACK_BLOCK_ALIGNMENT_SOFT" to "0x200D")
    }
    downcall("AL_SOFT_MSADPCM") {
        ALenum("AL_FORMAT_MONO_MSADPCM_SOFT" to "0x1302")
        ALenum("AL_FORMAT_STEREO_MSADPCM_SOFT" to "0x1303")
    }
    downcall("ALC_SOFT_pause_device") {
        "alcDevicePauseSOFT"(void, ALCdevice_ptr("device"), entrypoint = "alcDevicePauseSOFT", optional = true)
        "alcDeviceResumeSOFT"(void, ALCdevice_ptr("device"), entrypoint = "alcDeviceResumeSOFT", optional = true)
    }
    downcall("AL_EXT_BFORMAT") {
        ALenum("AL_FORMAT_BFORMAT2D_8" to "0x20021")
        ALenum("AL_FORMAT_BFORMAT2D_16" to "0x20022")
        ALenum("AL_FORMAT_BFORMAT2D_FLOAT32" to "0x20023")
        ALenum("AL_FORMAT_BFORMAT3D_8" to "0x20031")
        ALenum("AL_FORMAT_BFORMAT3D_16" to "0x20032")
        ALenum("AL_FORMAT_BFORMAT3D_FLOAT32" to "0x20033")
    }
    downcall("AL_EXT_MULAW_BFORMAT") {
        ALenum("AL_FORMAT_BFORMAT2D_MULAW" to "0x10031")
        ALenum("AL_FORMAT_BFORMAT3D_MULAW" to "0x10032")
    }
    downcall("ALC_SOFT_HRTF") {
        ALCenum("ALC_HRTF_SOFT" to "0x1992")
        ALCenum("ALC_DONT_CARE_SOFT" to "0x0002")
        ALCenum("ALC_HRTF_STATUS_SOFT" to "0x1993")
        ALCenum("ALC_HRTF_DISABLED_SOFT" to "0x0000")
        ALCenum("ALC_HRTF_ENABLED_SOFT" to "0x0001")
        ALCenum("ALC_HRTF_DENIED_SOFT" to "0x0002")
        ALCenum("ALC_HRTF_REQUIRED_SOFT" to "0x0003")
        ALCenum("ALC_HRTF_HEADPHONES_DETECTED_SOFT" to "0x0004")
        ALCenum("ALC_HRTF_UNSUPPORTED_FORMAT_SOFT" to "0x0005")
        ALCenum("ALC_NUM_HRTF_SPECIFIERS_SOFT" to "0x1994")
        ALCenum("ALC_HRTF_SPECIFIER_SOFT" to "0x1995")
        ALCenum("ALC_HRTF_ID_SOFT" to "0x1996")

        "alcGetStringiSOFT"(
            const_ALCchar_ptr,
            ALCdevice_ptr("device"),
            ALCenum("paramName"),
            ALCsizei("index"),
            entrypoint = "alcGetStringiSOFT",
            optional = true
        )
        "alcResetDeviceSOFT"(
            ALCboolean,
            ALCdevice_ptr("device"),
            const_ALCint_ptr("attribs"),
            entrypoint = "alcResetDeviceSOFT",
            optional = true
        )
    }
    downcall("AL_SOFT_gain_clamp_ex") {
        ALenum("AL_GAIN_LIMIT_SOFT" to "0x200E")
    }
    downcall("AL_SOFT_source_resampler") {
        ALenum("AL_NUM_RESAMPLERS_SOFT" to "0x1210")
        ALenum("AL_DEFAULT_RESAMPLER_SOFT" to "0x1211")
        ALenum("AL_SOURCE_RESAMPLER_SOFT" to "0x1212")
        ALenum("AL_RESAMPLER_NAME_SOFT" to "0x1213")

        "alGetStringiSOFT"(
            const_ALchar_ptr,
            ALenum("pname"),
            ALsizei("index"),
            entrypoint = "alGetStringiSOFT",
            optional = true
        )
    }
    downcall("AL_SOFT_source_spatialize") {
        ALenum("AL_SOURCE_SPATIALIZE_SOFT" to "0x1214")
        ALenum("AL_AUTO_SOFT" to "0x0002")
    }
    downcall("ALC_SOFT_output_limiter") {
        ALCenum("ALC_OUTPUT_LIMITER_SOFT" to "0x199A")
    }
    downcall("ALC_SOFT_device_clock") {
        ALCenum("ALC_DEVICE_CLOCK_SOFT" to "0x1600")
        ALCenum("ALC_DEVICE_LATENCY_SOFT" to "0x1601")
        ALCenum("ALC_DEVICE_CLOCK_LATENCY_SOFT" to "0x1602")
        ALenum("AL_SAMPLE_OFFSET_CLOCK_SOFT" to "0x1202")
        ALenum("AL_SEC_OFFSET_CLOCK_SOFT" to "0x1203")

        "alcGetInteger64vSOFT"(
            void,
            ALCdevice_ptr("device"),
            ALCenum("pname"),
            ALsizei("size"),
            ALCint64SOFT_ptr("values"),
            entrypoint = "alcGetInteger64vSOFT",
            optional = true
        )
    }
    downcall("AL_SOFT_direct_channels_remix") {
        ALenum("AL_DROP_UNMATCHED_SOFT" to "0x0001")
        ALenum("AL_REMIX_UNMATCHED_SOFT" to "0x0002")
    }
    downcall("AL_SOFT_bformat_ex") {
        ALenum("AL_AMBISONIC_LAYOUT_SOFT" to "0x1997")
        ALenum("AL_AMBISONIC_SCALING_SOFT" to "0x1998")

        ALenum("AL_FUMA_SOFT" to "0x0000")
        ALenum("AL_ACN_SOFT" to "0x0001")

        ALenum("AL_SN3D_SOFT" to "0x0001")
        ALenum("AL_N3D_SOFT" to "0x0002")
    }
    downcall("ALC_SOFT_loopback_bformat") {
        ALCenum("ALC_AMBISONIC_LAYOUT_SOFT" to "0x1997")
        ALCenum("ALC_AMBISONIC_SCALING_SOFT" to "0x1998")
        ALCenum("ALC_AMBISONIC_ORDER_SOFT" to "0x1999")
        ALCenum("ALC_MAX_AMBISONIC_ORDER_SOFT" to "0x199B")

        ALCenum("ALC_BFORMAT3D_SOFT" to "0x1507")

        ALCenum("ALC_FUMA_SOFT" to "0x0000")
        ALCenum("ALC_ACN_SOFT" to "0x0001")

        ALCenum("ALC_SN3D_SOFT" to "0x0001")
        ALCenum("ALC_N3D_SOFT" to "0x0002")
    }
    downcall("AL_SOFT_effect_target") {
        ALenum("AL_EFFECTSLOT_TARGET_SOFT" to "0x199C")
    }
    downcall("AL_SOFT_events") {
        ALenum("AL_EVENT_CALLBACK_FUNCTION_SOFT" to "0x19A2")
        ALenum("AL_EVENT_CALLBACK_USER_PARAM_SOFT" to "0x19A3")
        ALenum("AL_EVENT_TYPE_BUFFER_COMPLETED_SOFT" to "0x19A4")
        ALenum("AL_EVENT_TYPE_SOURCE_STATE_CHANGED_SOFT" to "0x19A5")
        ALenum("AL_EVENT_TYPE_DISCONNECTED_SOFT" to "0x19A6")

        "alEventControlSOFT"(
            void,
            ALsizei("count"),
            const_ALenum_ptr("types"),
            ALboolean("enable"),
            entrypoint = "alEventControlSOFT",
            optional = true
        )
        "alEventCallbackSOFT"(
            void,
            ALEVENTPROCSOFT("callback"),
            void_ptr("userParam"),
            entrypoint = "alEventCallbackSOFT",
            optional = true
        )
        "alGetPointerSOFT"(void_ptr, ALenum("pname"), entrypoint = "alGetPointerSOFT", optional = true)
        "alGetPointervSOFT"(
            void,
            ALenum("pname"),
            void_ptr_ptr("values"),
            entrypoint = "alGetPointervSOFT",
            optional = true
        )
    }
    downcall("ALC_SOFT_reopen_device") {
        "alcReopenDeviceSOFT"(
            ALCboolean,
            ALCdevice_ptr("device"),
            const_ALCchar_ptr("deviceName"),
            const_ALCint_ptr("attribs"),
            entrypoint = "alcReopenDeviceSOFT",
            optional = true
        )
    }
    downcall("AL_SOFT_callback_buffer") {
        ALenum("AL_BUFFER_CALLBACK_FUNCTION_SOFT" to "0x19A0")
        ALenum("AL_BUFFER_CALLBACK_USER_PARAM_SOFT" to "0x19A1")

        "alBufferCallbackSOFT"(
            void,
            ALuint("buffer"),
            ALenum("format"),
            ALsizei("freq"),
            ALBUFFERCALLBACKTYPESOFT("callback"),
            ALvoid_ptr("userptr"),
            entrypoint = "alBufferCallbackSOFT",
            optional = true
        )
        "alGetBufferPtrSOFT"(
            void,
            ALuint("buffer"),
            ALenum("param"),
            ALvoid_ptr_ptr("ptr"),
            entrypoint = "alGetBufferPtrSOFT",
            optional = true
        )
        "alGetBuffer3PtrSOFT"(
            void,
            ALuint("buffer"),
            ALenum("param"),
            ALvoid_ptr_ptr("ptr0"),
            ALvoid_ptr_ptr("ptr1"),
            ALvoid_ptr_ptr("ptr2"),
            entrypoint = "alGetBuffer3PtrSOFT",
            optional = true
        )
        "alGetBufferPtrvSOFT"(
            void,
            ALuint("buffer"),
            ALenum("param"),
            ALvoid_ptr_ptr("ptr"),
            entrypoint = "alGetBufferPtrvSOFT",
            optional = true
        )
    }
    downcall("AL_SOFT_UHJ") {
        ALenum("AL_FORMAT_UHJ2CHN8_SOFT" to "0x19A2")
        ALenum("AL_FORMAT_UHJ2CHN16_SOFT" to "0x19A3")
        ALenum("AL_FORMAT_UHJ2CHN_FLOAT32_SOFT" to "0x19A4")
        ALenum("AL_FORMAT_UHJ3CHN8_SOFT" to "0x19A5")
        ALenum("AL_FORMAT_UHJ3CHN16_SOFT" to "0x19A6")
        ALenum("AL_FORMAT_UHJ3CHN_FLOAT32_SOFT" to "0x19A7")
        ALenum("AL_FORMAT_UHJ4CHN8_SOFT" to "0x19A8")
        ALenum("AL_FORMAT_UHJ4CHN16_SOFT" to "0x19A9")
        ALenum("AL_FORMAT_UHJ4CHN_FLOAT32_SOFT" to "0x19AA")

        ALenum("AL_STEREO_MODE_SOFT" to "0x19B0")
        ALenum("AL_NORMAL_SOFT" to "0x0000")
        ALenum("AL_SUPER_STEREO_SOFT" to "0x0001")
        ALenum("AL_SUPER_STEREO_WIDTH_SOFT" to "0x19B1")
    }
    downcall("AL_SOFT_UHJ_ex") {
        ALenum("AL_FORMAT_UHJ2CHN_MULAW_SOFT" to "0x19B3")
        ALenum("AL_FORMAT_UHJ2CHN_ALAW_SOFT" to "0x19B4")
        ALenum("AL_FORMAT_UHJ2CHN_IMA4_SOFT" to "0x19B5")
        ALenum("AL_FORMAT_UHJ2CHN_MSADPCM_SOFT" to "0x19B6")
        ALenum("AL_FORMAT_UHJ3CHN_MULAW_SOFT" to "0x19B7")
        ALenum("AL_FORMAT_UHJ3CHN_ALAW_SOFT" to "0x19B8")
        ALenum("AL_FORMAT_UHJ4CHN_MULAW_SOFT" to "0x19B9")
        ALenum("AL_FORMAT_UHJ4CHN_ALAW_SOFT" to "0x19BA")
    }
    downcall("ALC_SOFT_output_mode") {
        ALCenum("ALC_OUTPUT_MODE_SOFT" to "0x19AC")
        ALCenum("ALC_ANY_SOFT" to "0x19AD")

        ALCenum("ALC_STEREO_BASIC_SOFT" to "0x19AE")
        ALCenum("ALC_STEREO_UHJ_SOFT" to "0x19AF")
        ALCenum("ALC_STEREO_HRTF_SOFT" to "0x19B2")

        ALCenum("ALC_SURROUND_5_1_SOFT" to "0x1504")
        ALCenum("ALC_SURROUND_6_1_SOFT" to "0x1505")
        ALCenum("ALC_SURROUND_7_1_SOFT" to "0x1506")
    }
    downcall("AL_SOFT_source_start_delay") {
        "alSourcePlayAtTimeSOFT"(
            void,
            ALuint("source"),
            ALint64SOFT("start_time"),
            entrypoint = "alSourcePlayAtTimeSOFT",
            optional = true
        )
        "alSourcePlayAtTimevSOFT"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            ALint64SOFT("start_time"),
            entrypoint = "alSourcePlayAtTimevSOFT",
            optional = true
        )
    }
    downcall("ALC_EXT_debug") {
        ALCenum("ALC_CONTEXT_FLAGS_EXT" to "0x19CF")
        ALCenum("ALC_CONTEXT_DEBUG_BIT_EXT" to "0x0001")
    }
    downcall("AL_EXT_debug") {
        ALenum("AL_DONT_CARE_EXT" to "0x0002")
        ALenum("AL_DEBUG_OUTPUT_EXT" to "0x19B2")
        ALenum("AL_DEBUG_CALLBACK_FUNCTION_EXT" to "0x19B3")
        ALenum("AL_DEBUG_CALLBACK_USER_PARAM_EXT" to "0x19B4")
        ALenum("AL_DEBUG_SOURCE_API_EXT" to "0x19B5")
        ALenum("AL_DEBUG_SOURCE_AUDIO_SYSTEM_EXT" to "0x19B6")
        ALenum("AL_DEBUG_SOURCE_THIRD_PARTY_EXT" to "0x19B7")
        ALenum("AL_DEBUG_SOURCE_APPLICATION_EXT" to "0x19B8")
        ALenum("AL_DEBUG_SOURCE_OTHER_EXT" to "0x19B9")
        ALenum("AL_DEBUG_TYPE_ERROR_EXT" to "0x19BA")
        ALenum("AL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_EXT" to "0x19BB")
        ALenum("AL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_EXT" to "0x19BC")
        ALenum("AL_DEBUG_TYPE_PORTABILITY_EXT" to "0x19BD")
        ALenum("AL_DEBUG_TYPE_PERFORMANCE_EXT" to "0x19BE")
        ALenum("AL_DEBUG_TYPE_MARKER_EXT" to "0x19BF")
        ALenum("AL_DEBUG_TYPE_PUSH_GROUP_EXT" to "0x19C0")
        ALenum("AL_DEBUG_TYPE_POP_GROUP_EXT" to "0x19C1")
        ALenum("AL_DEBUG_TYPE_OTHER_EXT" to "0x19C2")
        ALenum("AL_DEBUG_SEVERITY_HIGH_EXT" to "0x19C3")
        ALenum("AL_DEBUG_SEVERITY_MEDIUM_EXT" to "0x19C4")
        ALenum("AL_DEBUG_SEVERITY_LOW_EXT" to "0x19C5")
        ALenum("AL_DEBUG_SEVERITY_NOTIFICATION_EXT" to "0x19C6")
        ALenum("AL_DEBUG_LOGGED_MESSAGES_EXT" to "0x19C7")
        ALenum("AL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_EXT" to "0x19C8")
        ALenum("AL_MAX_DEBUG_MESSAGE_LENGTH_EXT" to "0x19C9")
        ALenum("AL_MAX_DEBUG_LOGGED_MESSAGES_EXT" to "0x19CA")
        ALenum("AL_MAX_DEBUG_GROUP_STACK_DEPTH_EXT" to "0x19CB")
        ALenum("AL_MAX_LABEL_LENGTH_EXT" to "0x19CC")
        ALenum("AL_STACK_OVERFLOW_EXT" to "0x19CD")
        ALenum("AL_STACK_UNDERFLOW_EXT" to "0x19CE")
        ALenum("AL_CONTEXT_FLAGS_EXT" to "0x19CF")
        ALenum("AL_BUFFER_EXT" to "0x1009")
        ALenum("AL_SOURCE_EXT" to "0x19D0")
        ALenum("AL_FILTER_EXT" to "0x19D1")
        ALenum("AL_EFFECT_EXT" to "0x19D2")
        ALenum("AL_AUXILIARY_EFFECT_SLOT_EXT" to "0x19D3")

        "alDebugMessageCallbackEXT"(
            void,
            ALDEBUGPROCEXT("callback"),
            void_ptr("userParam"),
            entrypoint = "alDebugMessageCallbackEXT",
            optional = true
        )
        "alDebugMessageInsertEXT"(
            void,
            ALenum("source"),
            ALenum("type"),
            ALuint("id"),
            ALenum("severity"),
            ALsizei("length"),
            const_ALchar_ptr("message"),
            entrypoint = "alDebugMessageInsertEXT",
            optional = true
        )
        "alDebugMessageControlEXT"(
            void,
            ALenum("source"),
            ALenum("type"),
            ALenum("severity"),
            ALsizei("count"),
            const_ALuint_ptr("ids"),
            ALboolean("enable"),
            entrypoint = "alDebugMessageControlEXT",
            optional = true
        )
        "alPushDebugGroupEXT"(
            void,
            ALenum("source"),
            ALuint("id"),
            ALsizei("length"),
            const_ALchar_ptr("message"),
            entrypoint = "alPushDebugGroupEXT",
            optional = true
        )
        "alPopDebugGroupEXT"(void, entrypoint = "alPopDebugGroupEXT", optional = true)
        "alGetDebugMessageLogEXT"(
            ALuint,
            ALuint("count"),
            ALsizei("logBufSize"),
            ALenum_ptr("sources"),
            ALenum_ptr("types"),
            ALuint_ptr("ids"),
            ALenum_ptr("severities"),
            ALsizei_ptr("lengths"),
            ALchar_ptr("logBuf"),
            entrypoint = "alGetDebugMessageLogEXT",
            optional = true
        )
        "alObjectLabelEXT"(
            void,
            ALenum("identifier"),
            ALuint("name"),
            ALsizei("length"),
            const_ALchar_ptr("label"),
            entrypoint = "alObjectLabelEXT",
            optional = true
        )
        "alGetObjectLabelEXT"(
            void,
            ALenum("identifier"),
            ALuint("name"),
            ALsizei("bufSize"),
            ALsizei_ptr("length"),
            ALchar_ptr("label"),
            entrypoint = "alGetObjectLabelEXT",
            optional = true
        )
        "alGetPointerEXT"(void_ptr, ALenum("pname"), entrypoint = "alGetPointerEXT", optional = true)
        "alGetPointervEXT"(
            void,
            ALenum("pname"),
            void_ptr_ptr("values"),
            entrypoint = "alGetPointervEXT",
            optional = true
        )
    }
    downcall("ALC_SOFT_system_events") {
        ALCenum("ALC_PLAYBACK_DEVICE_SOFT" to "0x19D4")
        ALCenum("ALC_CAPTURE_DEVICE_SOFT" to "0x19D5")
        ALCenum("ALC_EVENT_TYPE_DEFAULT_DEVICE_CHANGED_SOFT" to "0x19D6")
        ALCenum("ALC_EVENT_TYPE_DEVICE_ADDED_SOFT" to "0x19D7")
        ALCenum("ALC_EVENT_TYPE_DEVICE_REMOVED_SOFT" to "0x19D8")
        ALCenum("ALC_EVENT_SUPPORTED_SOFT" to "0x19D9")
        ALCenum("ALC_EVENT_NOT_SUPPORTED_SOFT" to "0x19DA")

        "alcEventIsSupportedSOFT"(
            ALCenum,
            ALCenum("eventType"),
            ALCenum("deviceType"),
            entrypoint = "alcEventIsSupportedSOFT",
            optional = true
        )
        "alcEventControlSOFT"(
            ALCboolean,
            ALCsizei("count"),
            const_ALCenum_ptr("events"),
            ALCboolean("enable"),
            entrypoint = "alcEventControlSOFT",
            optional = true
        )
        "alcEventCallbackSOFT"(
            void,
            ALCEVENTPROCTYPESOFT("callback"),
            void_ptr("userParam"),
            entrypoint = "alcEventCallbackSOFT",
            optional = true
        )
    }
    downcall("AL_EXT_direct_context") {
        "alcGetProcAddress2"(
            ALCvoid_ptr,
            ALCdevice_ptr("device"),
            const_ALCchar_ptr("funcName"),
            entrypoint = "alcGetProcAddress2",
            optional = true
        )

        "alEnableDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("capability"),
            entrypoint = "alEnableDirect",
            optional = true
        )
        "alDisableDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("capability"),
            entrypoint = "alDisableDirect",
            optional = true
        )
        "alIsEnabledDirect"(
            ALboolean,
            ALCcontext_ptr("context"),
            ALenum("capability"),
            entrypoint = "alIsEnabledDirect",
            optional = true
        )

        "alDopplerFactorDirect"(
            void,
            ALCcontext_ptr("context"),
            ALfloat("value"),
            entrypoint = "alDopplerFactorDirect",
            optional = true
        )
        "alSpeedOfSoundDirect"(
            void,
            ALCcontext_ptr("context"),
            ALfloat("value"),
            entrypoint = "alSpeedOfSoundDirect",
            optional = true
        )
        "alDistanceModelDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("distanceModel"),
            entrypoint = "alDistanceModelDirect",
            optional = true
        )

        "alGetStringDirect"(
            const_ALchar_ptr,
            ALCcontext_ptr("context"),
            ALenum("param"),
            entrypoint = "alGetStringDirect",
            optional = true
        )
        "alGetBooleanvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            ALboolean_ptr("values"),
            entrypoint = "alGetBooleanvDirect",
            optional = true
        )
        "alGetIntegervDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            ALint_ptr("values"),
            entrypoint = "alGetIntegervDirect",
            optional = true
        )
        "alGetFloatvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            ALfloat_ptr("values"),
            entrypoint = "alGetFloatvDirect",
            optional = true
        )
        "alGetDoublevDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            ALdouble_ptr("values"),
            entrypoint = "alGetDoublevDirect",
            optional = true
        )
        "alGetBooleanDirect"(
            ALboolean,
            ALCcontext_ptr("context"),
            ALenum("param"),
            entrypoint = "alGetBooleanDirect",
            optional = true
        )
        "alGetIntegerDirect"(
            ALint,
            ALCcontext_ptr("context"),
            ALenum("param"),
            entrypoint = "alGetIntegerDirect",
            optional = true
        )
        "alGetFloatDirect"(
            ALfloat,
            ALCcontext_ptr("context"),
            ALenum("param"),
            entrypoint = "alGetFloatDirect",
            optional = true
        )
        "alGetDoubleDirect"(
            ALdouble,
            ALCcontext_ptr("context"),
            ALenum("param"),
            entrypoint = "alGetDoubleDirect",
            optional = true
        )

        "alGetErrorDirect"(ALenum, ALCcontext_ptr("context"), entrypoint = "alGetErrorDirect", optional = true)
        "alIsExtensionPresentDirect"(
            ALboolean,
            ALCcontext_ptr("context"),
            const_ALchar_ptr("extname"),
            entrypoint = "alIsExtensionPresentDirect",
            optional = true
        )
        "alGetProcAddressDirect"(
            void_ptr,
            ALCcontext_ptr("context"),
            const_ALchar_ptr("fname"),
            entrypoint = "alGetProcAddressDirect",
            optional = true
        )
        "alGetEnumValueDirect"(
            ALenum,
            ALCcontext_ptr("context"),
            const_ALchar_ptr("ename"),
            entrypoint = "alGetEnumValueDirect",
            optional = true
        )

        "alListenerfDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            ALfloat("value"),
            entrypoint = "alListenerfDirect",
            optional = true
        )
        "alListener3fDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            ALfloat("value1"),
            ALfloat("value2"),
            ALfloat("value3"),
            entrypoint = "alListener3fDirect",
            optional = true
        )
        "alListenerfvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            const_ALfloat_ptr("values"),
            entrypoint = "alListenerfvDirect",
            optional = true
        )
        "alListeneriDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            ALint("value"),
            entrypoint = "alListeneriDirect",
            optional = true
        )
        "alListener3iDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            ALint("value1"),
            ALint("value2"),
            ALint("value3"),
            entrypoint = "alListener3iDirect",
            optional = true
        )
        "alListenerivDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            const_ALint_ptr("values"),
            entrypoint = "alListenerivDirect",
            optional = true
        )
        "alGetListenerfDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            ALfloat_ptr("value"),
            entrypoint = "alGetListenerfDirect",
            optional = true
        )
        "alGetListener3fDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            ALfloat_ptr("value1"),
            ALfloat_ptr("value2"),
            ALfloat_ptr("value3"),
            entrypoint = "alGetListener3fDirect",
            optional = true
        )
        "alGetListenerfvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            ALfloat_ptr("values"),
            entrypoint = "alGetListenerfvDirect",
            optional = true
        )
        "alGetListeneriDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            ALint_ptr("value"),
            entrypoint = "alGetListeneriDirect",
            optional = true
        )
        "alGetListener3iDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            ALint_ptr("value1"),
            ALint_ptr("value2"),
            ALint_ptr("value3"),
            entrypoint = "alGetListener3iDirect",
            optional = true
        )
        "alGetListenerivDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("param"),
            ALint_ptr("values"),
            entrypoint = "alGetListenerivDirect",
            optional = true
        )

        "alGenSourcesDirect"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            ALuint_ptr("sources"),
            entrypoint = "alGenSourcesDirect",
            optional = true
        )
        "alDeleteSourcesDirect"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            entrypoint = "alDeleteSourcesDirect",
            optional = true
        )
        "alIsSourceDirect"(
            ALboolean,
            ALCcontext_ptr("context"),
            ALuint("source"),
            entrypoint = "alIsSourceDirect",
            optional = true
        )
        "alSourcefDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALfloat("value"),
            entrypoint = "alSourcefDirect",
            optional = true
        )
        "alSource3fDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALfloat("value1"),
            ALfloat("value2"),
            ALfloat("value3"),
            entrypoint = "alSource3fDirect",
            optional = true
        )
        "alSourcefvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            const_ALfloat_ptr("values"),
            entrypoint = "alSourcefvDirect",
            optional = true
        )
        "alSourceiDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALint("value"),
            entrypoint = "alSourceiDirect",
            optional = true
        )
        "alSource3iDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALint("value1"),
            ALint("value2"),
            ALint("value3"),
            entrypoint = "alSource3iDirect",
            optional = true
        )
        "alSourceivDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            const_ALint_ptr("values"),
            entrypoint = "alSourceivDirect",
            optional = true
        )
        "alGetSourcefDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALfloat_ptr("value"),
            entrypoint = "alGetSourcefDirect",
            optional = true
        )
        "alGetSource3fDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALfloat_ptr("value1"),
            ALfloat_ptr("value2"),
            ALfloat_ptr("value3"),
            entrypoint = "alGetSource3fDirect",
            optional = true
        )
        "alGetSourcefvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALfloat_ptr("values"),
            entrypoint = "alGetSourcefvDirect",
            optional = true
        )
        "alGetSourceiDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALint_ptr("value"),
            entrypoint = "alGetSourceiDirect",
            optional = true
        )
        "alGetSource3iDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALint_ptr("value1"),
            ALint_ptr("value2"),
            ALint_ptr("value3"),
            entrypoint = "alGetSource3iDirect",
            optional = true
        )
        "alGetSourceivDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALint_ptr("values"),
            entrypoint = "alGetSourceivDirect",
            optional = true
        )
        "alSourcePlayDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            entrypoint = "alSourcePlayDirect",
            optional = true
        )
        "alSourceStopDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            entrypoint = "alSourceStopDirect",
            optional = true
        )
        "alSourceRewindDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            entrypoint = "alSourceRewindDirect",
            optional = true
        )
        "alSourcePauseDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            entrypoint = "alSourcePauseDirect",
            optional = true
        )
        "alSourcePlayvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            entrypoint = "alSourcePlayvDirect",
            optional = true
        )
        "alSourceStopvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            entrypoint = "alSourceStopvDirect",
            optional = true
        )
        "alSourceRewindvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            entrypoint = "alSourceRewindvDirect",
            optional = true
        )
        "alSourcePausevDirect"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            entrypoint = "alSourcePausevDirect",
            optional = true
        )
        "alSourceQueueBuffersDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALsizei("nb"),
            const_ALuint_ptr("buffers"),
            entrypoint = "alSourceQueueBuffersDirect",
            optional = true
        )
        "alSourceUnqueueBuffersDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALsizei("nb"),
            ALuint_ptr("buffers"),
            entrypoint = "alSourceUnqueueBuffersDirect",
            optional = true
        )

        "alGenBuffersDirect"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            ALuint_ptr("buffers"),
            entrypoint = "alGenBuffersDirect",
            optional = true
        )
        "alDeleteBuffersDirect"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            const_ALuint_ptr("buffers"),
            entrypoint = "alDeleteBuffersDirect",
            optional = true
        )
        "alIsBufferDirect"(
            ALboolean,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            entrypoint = "alIsBufferDirect",
            optional = true
        )
        "alBufferDataDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("format"),
            const_ALvoid_ptr("data"),
            ALsizei("size"),
            ALsizei("samplerate"),
            entrypoint = "alBufferDataDirect",
            optional = true
        )
        "alBufferfDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("param"),
            ALfloat("value"),
            entrypoint = "alBufferfDirect",
            optional = true
        )
        "alBuffer3fDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("param"),
            ALfloat("value1"),
            ALfloat("value2"),
            ALfloat("value3"),
            entrypoint = "alBuffer3fDirect",
            optional = true
        )
        "alBufferfvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("param"),
            const_ALfloat_ptr("values"),
            entrypoint = "alBufferfvDirect",
            optional = true
        )
        "alBufferiDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("param"),
            ALint("value"),
            entrypoint = "alBufferiDirect",
            optional = true
        )
        "alBuffer3iDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("param"),
            ALint("value1"),
            ALint("value2"),
            ALint("value3"),
            entrypoint = "alBuffer3iDirect",
            optional = true
        )
        "alBufferivDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("param"),
            const_ALint_ptr("values"),
            entrypoint = "alBufferivDirect",
            optional = true
        )
        "alGetBufferfDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("param"),
            ALfloat_ptr("value"),
            entrypoint = "alGetBufferfDirect",
            optional = true
        )
        "alGetBuffer3fDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("param"),
            ALfloat_ptr("value1"),
            ALfloat_ptr("value2"),
            ALfloat_ptr("value3"),
            entrypoint = "alGetBuffer3fDirect",
            optional = true
        )
        "alGetBufferfvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("param"),
            ALfloat_ptr("values"),
            entrypoint = "alGetBufferfvDirect",
            optional = true
        )
        "alGetBufferiDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("param"),
            ALint_ptr("value"),
            entrypoint = "alGetBufferiDirect",
            optional = true
        )
        "alGetBuffer3iDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("param"),
            ALint_ptr("value1"),
            ALint_ptr("value2"),
            ALint_ptr("value3"),
            entrypoint = "alGetBuffer3iDirect",
            optional = true
        )
        "alGetBufferivDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("param"),
            ALint_ptr("values"),
            entrypoint = "alGetBufferivDirect",
            optional = true
        )

        "alGenEffectsDirect"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            ALuint_ptr("effects"),
            entrypoint = "alGenEffectsDirect",
            optional = true
        )
        "alDeleteEffectsDirect"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            const_ALuint_ptr("effects"),
            entrypoint = "alDeleteEffectsDirect",
            optional = true
        )
        "alIsEffectDirect"(
            ALboolean,
            ALCcontext_ptr("context"),
            ALuint("effect"),
            entrypoint = "alIsEffectDirect",
            optional = true
        )
        "alEffectiDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effect"),
            ALenum("param"),
            ALint("iValue"),
            entrypoint = "alEffectiDirect",
            optional = true
        )
        "alEffectivDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effect"),
            ALenum("param"),
            const_ALint_ptr("piValues"),
            entrypoint = "alEffectivDirect",
            optional = true
        )
        "alEffectfDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effect"),
            ALenum("param"),
            ALfloat("flValue"),
            entrypoint = "alEffectfDirect",
            optional = true
        )
        "alEffectfvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effect"),
            ALenum("param"),
            const_ALfloat_ptr("pflValues"),
            entrypoint = "alEffectfvDirect",
            optional = true
        )
        "alGetEffectiDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effect"),
            ALenum("param"),
            ALint_ptr("piValue"),
            entrypoint = "alGetEffectiDirect",
            optional = true
        )
        "alGetEffectivDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effect"),
            ALenum("param"),
            ALint_ptr("piValues"),
            entrypoint = "alGetEffectivDirect",
            optional = true
        )
        "alGetEffectfDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effect"),
            ALenum("param"),
            ALfloat_ptr("pflValue"),
            entrypoint = "alGetEffectfDirect",
            optional = true
        )
        "alGetEffectfvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effect"),
            ALenum("param"),
            ALfloat_ptr("pflValues"),
            entrypoint = "alGetEffectfvDirect",
            optional = true
        )

        "alGenFiltersDirect"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            ALuint_ptr("filters"),
            entrypoint = "alGenFiltersDirect",
            optional = true
        )
        "alDeleteFiltersDirect"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            const_ALuint_ptr("filters"),
            entrypoint = "alDeleteFiltersDirect",
            optional = true
        )
        "alIsFilterDirect"(
            ALboolean,
            ALCcontext_ptr("context"),
            ALuint("filter"),
            entrypoint = "alIsFilterDirect",
            optional = true
        )
        "alFilteriDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("filter"),
            ALenum("param"),
            ALint("iValue"),
            entrypoint = "alFilteriDirect",
            optional = true
        )
        "alFilterivDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("filter"),
            ALenum("param"),
            const_ALint_ptr("piValues"),
            entrypoint = "alFilterivDirect",
            optional = true
        )
        "alFilterfDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("filter"),
            ALenum("param"),
            ALfloat("flValue"),
            entrypoint = "alFilterfDirect",
            optional = true
        )
        "alFilterfvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("filter"),
            ALenum("param"),
            const_ALfloat_ptr("pflValues"),
            entrypoint = "alFilterfvDirect",
            optional = true
        )
        "alGetFilteriDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("filter"),
            ALenum("param"),
            ALint_ptr("piValue"),
            entrypoint = "alGetFilteriDirect",
            optional = true
        )
        "alGetFilterivDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("filter"),
            ALenum("param"),
            ALint_ptr("piValues"),
            entrypoint = "alGetFilterivDirect",
            optional = true
        )
        "alGetFilterfDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("filter"),
            ALenum("param"),
            ALfloat_ptr("pflValue"),
            entrypoint = "alGetFilterfDirect",
            optional = true
        )
        "alGetFilterfvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("filter"),
            ALenum("param"),
            ALfloat_ptr("pflValues"),
            entrypoint = "alGetFilterfvDirect",
            optional = true
        )

        "alGenAuxiliaryEffectSlotsDirect"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            ALuint_ptr("effectslots"),
            entrypoint = "alGenAuxiliaryEffectSlotsDirect",
            optional = true
        )
        "alDeleteAuxiliaryEffectSlotsDirect"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            const_ALuint_ptr("effectslots"),
            entrypoint = "alDeleteAuxiliaryEffectSlotsDirect",
            optional = true
        )
        "alIsAuxiliaryEffectSlotDirect"(
            ALboolean,
            ALCcontext_ptr("context"),
            ALuint("effectslot"),
            entrypoint = "alIsAuxiliaryEffectSlotDirect",
            optional = true
        )
        "alAuxiliaryEffectSlotiDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effectslot"),
            ALenum("param"),
            ALint("iValue"),
            entrypoint = "alAuxiliaryEffectSlotiDirect",
            optional = true
        )
        "alAuxiliaryEffectSlotivDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effectslot"),
            ALenum("param"),
            const_ALint_ptr("piValues"),
            entrypoint = "alAuxiliaryEffectSlotivDirect",
            optional = true
        )
        "alAuxiliaryEffectSlotfDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effectslot"),
            ALenum("param"),
            ALfloat("flValue"),
            entrypoint = "alAuxiliaryEffectSlotfDirect",
            optional = true
        )
        "alAuxiliaryEffectSlotfvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effectslot"),
            ALenum("param"),
            const_ALfloat_ptr("pflValues"),
            entrypoint = "alAuxiliaryEffectSlotfvDirect",
            optional = true
        )
        "alGetAuxiliaryEffectSlotiDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effectslot"),
            ALenum("param"),
            ALint_ptr("piValue"),
            entrypoint = "alGetAuxiliaryEffectSlotiDirect",
            optional = true
        )
        "alGetAuxiliaryEffectSlotivDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effectslot"),
            ALenum("param"),
            ALint_ptr("piValues"),
            entrypoint = "alGetAuxiliaryEffectSlotivDirect",
            optional = true
        )
        "alGetAuxiliaryEffectSlotfDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effectslot"),
            ALenum("param"),
            ALfloat_ptr("pflValue"),
            entrypoint = "alGetAuxiliaryEffectSlotfDirect",
            optional = true
        )
        "alGetAuxiliaryEffectSlotfvDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("effectslot"),
            ALenum("param"),
            ALfloat_ptr("pflValues"),
            entrypoint = "alGetAuxiliaryEffectSlotfvDirect",
            optional = true
        )

        "alBufferDataStaticDirect"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("format"),
            ALvoid_ptr("data"),
            ALsizei("size"),
            ALsizei("freq"),
            entrypoint = "alBufferDataStaticDirect",
            optional = true
        )

        "alDebugMessageCallbackDirectEXT"(
            void,
            ALCcontext_ptr("context"),
            ALDEBUGPROCEXT("callback"),
            void_ptr("userParam"),
            entrypoint = "alDebugMessageCallbackDirectEXT",
            optional = true
        )
        "alDebugMessageInsertDirectEXT"(
            void,
            ALCcontext_ptr("context"),
            ALenum("source"),
            ALenum("type"),
            ALuint("id"),
            ALenum("severity"),
            ALsizei("length"),
            const_ALchar_ptr("message"),
            entrypoint = "alDebugMessageInsertDirectEXT",
            optional = true
        )
        "alDebugMessageControlDirectEXT"(
            void,
            ALCcontext_ptr("context"),
            ALenum("source"),
            ALenum("type"),
            ALenum("severity"),
            ALsizei("count"),
            const_ALuint_ptr("ids"),
            ALboolean("enable"),
            entrypoint = "alDebugMessageControlDirectEXT",
            optional = true
        )
        "alPushDebugGroupDirectEXT"(
            void,
            ALCcontext_ptr("context"),
            ALenum("source"),
            ALuint("id"),
            ALsizei("length"),
            const_ALchar_ptr("message"),
            entrypoint = "alPushDebugGroupDirectEXT",
            optional = true
        )
        "alPopDebugGroupDirectEXT"(
            void,
            ALCcontext_ptr("context"),
            entrypoint = "alPopDebugGroupDirectEXT",
            optional = true
        )
        "alGetDebugMessageLogDirectEXT"(
            ALuint,
            ALCcontext_ptr("context"),
            ALuint("count"),
            ALsizei("logBufSize"),
            ALenum_ptr("sources"),
            ALenum_ptr("types"),
            ALuint_ptr("ids"),
            ALenum_ptr("severities"),
            ALsizei_ptr("lengths"),
            ALchar_ptr("logBuf"),
            entrypoint = "alGetDebugMessageLogDirectEXT",
            optional = true
        )
        "alObjectLabelDirectEXT"(
            void,
            ALCcontext_ptr("context"),
            ALenum("identifier"),
            ALuint("name"),
            ALsizei("length"),
            const_ALchar_ptr("label"),
            entrypoint = "alObjectLabelDirectEXT",
            optional = true
        )
        "alGetObjectLabelDirectEXT"(
            void,
            ALCcontext_ptr("context"),
            ALenum("identifier"),
            ALuint("name"),
            ALsizei("bufSize"),
            ALsizei_ptr("length"),
            ALchar_ptr("label"),
            entrypoint = "alGetObjectLabelDirectEXT",
            optional = true
        )
        "alGetPointerDirectEXT"(
            void_ptr,
            ALCcontext_ptr("context"),
            ALenum("pname"),
            entrypoint = "alGetPointerDirectEXT",
            optional = true
        )
        "alGetPointervDirectEXT"(
            void,
            ALCcontext_ptr("context"),
            ALenum("pname"),
            void_ptr_ptr("values"),
            entrypoint = "alGetPointervDirectEXT",
            optional = true
        )

        "alRequestFoldbackStartDirect"(
            void,
            ALCcontext_ptr("context"),
            ALenum("mode"),
            ALsizei("count"),
            ALsizei("length"),
            ALfloat_ptr("mem"),
            LPALFOLDBACKCALLBACK("callback"),
            entrypoint = "alRequestFoldbackStartDirect",
            optional = true
        )
        "alRequestFoldbackStopDirect"(
            void,
            ALCcontext_ptr("context"),
            entrypoint = "alRequestFoldbackStopDirect",
            optional = true
        )

        "alBufferSubDataDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("format"),
            const_ALvoid_ptr("data"),
            ALsizei("offset"),
            ALsizei("length"),
            entrypoint = "alBufferSubDataDirectSOFT",
            optional = true
        )

        "alSourcedDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALdouble("value"),
            entrypoint = "alSourcedDirectSOFT",
            optional = true
        )
        "alSource3dDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALdouble("value1"),
            ALdouble("value2"),
            ALdouble("value3"),
            entrypoint = "alSource3dDirectSOFT",
            optional = true
        )
        "alSourcedvDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            const_ALdouble_ptr("values"),
            entrypoint = "alSourcedvDirectSOFT",
            optional = true
        )
        "alGetSourcedDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALdouble_ptr("value"),
            entrypoint = "alGetSourcedDirectSOFT",
            optional = true
        )
        "alGetSource3dDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALdouble_ptr("value1"),
            ALdouble_ptr("value2"),
            ALdouble_ptr("value3"),
            entrypoint = "alGetSource3dDirectSOFT",
            optional = true
        )
        "alGetSourcedvDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALdouble_ptr("values"),
            entrypoint = "alGetSourcedvDirectSOFT",
            optional = true
        )
        "alSourcei64DirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALint64SOFT("value"),
            entrypoint = "alSourcei64DirectSOFT",
            optional = true
        )
        "alSource3i64DirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALint64SOFT("value1"),
            ALint64SOFT("value2"),
            ALint64SOFT("value3"),
            entrypoint = "alSource3i64DirectSOFT",
            optional = true
        )
        "alSourcei64vDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            const_ALint64SOFT_ptr("values"),
            entrypoint = "alSourcei64vDirectSOFT",
            optional = true
        )
        "alGetSourcei64DirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALint64SOFT_ptr("value"),
            entrypoint = "alGetSourcei64DirectSOFT",
            optional = true
        )
        "alGetSource3i64DirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALint64SOFT_ptr("value1"),
            ALint64SOFT_ptr("value2"),
            ALint64SOFT_ptr("value3"),
            entrypoint = "alGetSource3i64DirectSOFT",
            optional = true
        )
        "alGetSourcei64vDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALenum("param"),
            ALint64SOFT_ptr("values"),
            entrypoint = "alGetSourcei64vDirectSOFT",
            optional = true
        )

        "alDeferUpdatesDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            entrypoint = "alDeferUpdatesDirectSOFT",
            optional = true
        )
        "alProcessUpdatesDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            entrypoint = "alProcessUpdatesDirectSOFT",
            optional = true
        )

        "alGetStringiDirectSOFT"(
            const_ALchar_ptr,
            ALCcontext_ptr("context"),
            ALenum("pname"),
            ALsizei("index"),
            entrypoint = "alGetStringiDirectSOFT",
            optional = true
        )

        "alEventControlDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("count"),
            const_ALenum_ptr("types"),
            ALboolean("enable"),
            entrypoint = "alEventControlDirectSOFT",
            optional = true
        )
        "alEventCallbackDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALEVENTPROCSOFT("callback"),
            void_ptr("userParam"),
            entrypoint = "alEventCallbackDirectSOFT",
            optional = true
        )
        "alGetPointerDirectSOFT"(
            void_ptr,
            ALCcontext_ptr("context"),
            ALenum("pname"),
            entrypoint = "alGetPointerDirectSOFT",
            optional = true
        )
        "alGetPointervDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALenum("pname"),
            void_ptr_ptr("values"),
            entrypoint = "alGetPointervDirectSOFT",
            optional = true
        )

        "alBufferCallbackDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("format"),
            ALsizei("freq"),
            ALBUFFERCALLBACKTYPESOFT("callback"),
            ALvoid_ptr("userptr"),
            entrypoint = "alBufferCallbackDirectSOFT",
            optional = true
        )
        "alGetBufferPtrDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("param"),
            ALvoid_ptr_ptr("ptr"),
            entrypoint = "alGetBufferPtrDirectSOFT",
            optional = true
        )
        "alGetBuffer3PtrDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("param"),
            ALvoid_ptr_ptr("ptr0"),
            ALvoid_ptr_ptr("ptr1"),
            ALvoid_ptr_ptr("ptr2"),
            entrypoint = "alGetBuffer3PtrDirectSOFT",
            optional = true
        )
        "alGetBufferPtrvDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALenum("param"),
            ALvoid_ptr_ptr("ptr"),
            entrypoint = "alGetBufferPtrvDirectSOFT",
            optional = true
        )

        "alSourcePlayAtTimeDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALuint("source"),
            ALint64SOFT("start_time"),
            entrypoint = "alSourcePlayAtTimeDirectSOFT",
            optional = true
        )
        "alSourcePlayAtTimevDirectSOFT"(
            void,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            ALint64SOFT("start_time"),
            entrypoint = "alSourcePlayAtTimevDirectSOFT",
            optional = true
        )

        "EAXSetDirect"(
            ALenum,
            ALCcontext_ptr("context"),
            (address c "const struct _GUID *")("property_set_id"),
            ALuint("property_id"),
            ALuint("source_id"),
            ALvoid_ptr("value"),
            ALuint("value_size"),
            entrypoint = "EAXSetDirect",
            optional = true
        )
        "EAXGetDirect"(
            ALenum,
            ALCcontext_ptr("context"),
            (address c "const struct _GUID *")("property_set_id"),
            ALuint("property_id"),
            ALuint("source_id"),
            ALvoid_ptr("value"),
            ALuint("value_size"),
            entrypoint = "EAXGetDirect",
            optional = true
        )
        "EAXSetBufferModeDirect"(
            ALboolean,
            ALCcontext_ptr("context"),
            ALsizei("n"),
            const_ALuint_ptr("buffers"),
            ALint("value"),
            entrypoint = "EAXSetBufferModeDirect",
            optional = true
        )
        "EAXGetBufferModeDirect"(
            ALenum,
            ALCcontext_ptr("context"),
            ALuint("buffer"),
            ALint_ptr("pReserved"),
            entrypoint = "EAXGetBufferModeDirect",
            optional = true
        )
    }
    downcall("AL_SOFT_bformat_hoa") {
        ALenum("AL_UNPACK_AMBISONIC_ORDER_SOFT" to "0x199D")
    }
    //endregion
}

fun downcall(extName: String, action: StaticDowncall.() -> Unit) {
    StaticDowncall(
        alPackage,
        extName.split('_').joinToString("") { it.replaceFirstChar(Char::uppercaseChar) },
        alLookup,
        writeWholeFile = true,
        action = action
    )
}
