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

import overrungl.gen.StaticDowncall
import overrungl.gen.void

fun ALC() {
    StaticDowncall(alPackage, "ALC", alLookup) {
        //region fields
        ALCenum("ALC_FALSE" to "0")
        ALCenum("ALC_TRUE" to "1")

        ALCenum("ALC_FREQUENCY" to "0x1007")
        ALCenum("ALC_REFRESH" to "0x1008")
        ALCenum("ALC_SYNC" to "0x1009")
        ALCenum("ALC_MONO_SOURCES" to "0x1010")
        ALCenum("ALC_STEREO_SOURCES" to "0x1011")

        ALCenum("ALC_NO_ERROR" to "0")
        ALCenum("ALC_INVALID_DEVICE" to "0xA001")
        ALCenum("ALC_INVALID_CONTEXT" to "0xA002")
        ALCenum("ALC_INVALID_ENUM" to "0xA003")
        ALCenum("ALC_INVALID_VALUE" to "0xA004")
        ALCenum("ALC_OUT_OF_MEMORY" to "0xA005")

        ALCenum("ALC_MAJOR_VERSION" to "0x1000")
        ALCenum("ALC_MINOR_VERSION" to "0x1001")

        ALCenum("ALC_ATTRIBUTES_SIZE" to "0x1002")
        ALCenum("ALC_ALL_ATTRIBUTES" to "0x1003")
        ALCenum("ALC_DEFAULT_DEVICE_SPECIFIER" to "0x1004")
        ALCenum("ALC_DEVICE_SPECIFIER" to "0x1005")
        ALCenum("ALC_EXTENSIONS" to "0x1006")

        ALCenum("ALC_EXT_CAPTURE" to "1", "Capture extension")
        ALCenum("ALC_CAPTURE_DEVICE_SPECIFIER" to "0x310")
        ALCenum("ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER" to "0x311")
        ALCenum("ALC_CAPTURE_SAMPLES" to "0x312")

        ALCenum("ALC_ENUMERATE_ALL_EXT" to "1")
        ALCenum("ALC_DEFAULT_ALL_DEVICES_SPECIFIER" to "0x1012")
        ALCenum("ALC_ALL_DEVICES_SPECIFIER" to "0x1013")
        //endregion

        //region functions
        "alcCreateContext"(
            ALCcontext_ptr,
            ALCdevice_ptr("device"),
            const_ALCint_ptr("attrlist"),
            entrypoint = "alcCreateContext"
        )
        "alcMakeContextCurrent"(
            ALCboolean,
            ALCcontext_ptr("context"),
            entrypoint = "alcMakeContextCurrent"
        )
        "alcProcessContext"(
            void,
            ALCcontext_ptr("context"),
            entrypoint = "alcProcessContext"
        )
        "alcSuspendContext"(
            void,
            ALCcontext_ptr("context"),
            entrypoint = "alcSuspendContext"
        )
        "alcDestroyContext"(
            void,
            ALCcontext_ptr("context"),
            entrypoint = "alcDestroyContext"
        )
        "alcGetCurrentContext"(
            ALCcontext_ptr,
            entrypoint = "alcGetCurrentContext"
        )
        "alcGetContextsDevice"(
            ALCdevice_ptr,
            ALCcontext_ptr("context"),
            entrypoint = "alcGetContextsDevice"
        )

        +"alcOpenDevice"(
            ALCdevice_ptr,
            const_ALCchar_ptr("devicename"),
            entrypoint = "alcOpenDevice"
        ).overload()
        "alcCloseDevice"(
            ALCboolean,
            ALCdevice_ptr("device"),
            entrypoint = "alcCloseDevice"
        )

        "alcGetError"(
            ALCenum,
            ALCdevice_ptr("device"),
            entrypoint = "alcGetError"
        )

        +"alcIsExtensionPresent"(
            ALCboolean,
            ALCdevice_ptr("device"),
            const_ALCchar_ptr("extname"),
            entrypoint = "alcIsExtensionPresent"
        ).overload()
        +"alcGetProcAddress"(
            ALCvoid_ptr,
            ALCdevice_ptr("device"),
            const_ALCchar_ptr("funcname"),
            entrypoint = "alcGetProcAddress"
        ).overload()
        +"alcGetEnumValue"(
            ALCenum,
            ALCdevice_ptr("device"),
            const_ALCchar_ptr("enumname"),
            entrypoint = "alcGetEnumValue"
        ).overload()

        +"alcGetString_"(
            const_ALCchar_ptr,
            ALCdevice_ptr("device"),
            ALCenum("param"),
            entrypoint = "alcGetString"
        ).overload(name = "alcGetString")
        "alcGetIntegerv"(
            void,
            ALCdevice_ptr("device"),
            ALCenum("param"),
            ALCsizei("size"),
            ALCint_ptr("values"),
            entrypoint = "alcGetIntegerv"
        )

        +"alcCaptureOpenDevice"(
            ALCdevice_ptr,
            const_ALCchar_ptr("devicename"),
            ALCuint("frequency"),
            ALCenum("format"),
            ALCsizei("buffersize"),
            entrypoint = "alcCaptureOpenDevice"
        ).overload()
        "alcCaptureCloseDevice"(
            ALCboolean,
            ALCdevice_ptr("device"),
            entrypoint = "alcCaptureCloseDevice"
        )
        "alcCaptureStart"(
            void,
            ALCdevice_ptr("device"),
            entrypoint = "alcCaptureStart"
        )
        "alcCaptureStop"(
            void,
            ALCdevice_ptr("device"),
            entrypoint = "alcCaptureStop"
        )
        "alcCaptureSamples"(
            void,
            ALCdevice_ptr("device"),
            ALCvoid_ptr("buffer"),
            ALCsizei("samples"),
            entrypoint = "alcCaptureSamples"
        )
        //endregion
    }
}
