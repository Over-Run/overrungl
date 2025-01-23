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
import overrungl.gen.file.*

val ALboolean = jboolean c "ALboolean"
val ALint = int c "ALint"
val ALuint = uint c "ALuint"
val ALsizei = int c "ALsizei"
val ALenum = int c "ALenum"
val ALfloat = float c "ALfloat"
val ALdouble = double c "ALdouble"

val ALvoid_ptr = address c "ALvoid *"
val ALvoid_ptr_ptr = address c "ALvoid **"
val ALboolean_ptr = address c "ALboolean *"
val ALchar_ptr = string_u8 c "ALchar*"
val ALint_ptr = jint_array c "ALint *"
val ALuint_ptr = jint_array c "ALuint *"
val ALsizei_ptr = jint_array c "ALsizei *"
val ALenum_ptr = jint_array c "ALenum *"
val ALfloat_ptr = jfloat_array c "ALfloat *"
val ALdouble_ptr = jdouble_array c "ALdouble *"

val const_ALuint = uint c "const ALuint"

val const_ALvoid_ptr = address c "const ALvoid *"
val const_ALchar_ptr = string_u8 c "const ALchar*"
val const_ALint_ptr = address c "const ALint *"
val const_ALuint_ptr = address c "const ALuint *"
val const_ALenum_ptr = address c "const ALenum *"
val const_ALfloat_ptr = address c "const ALfloat *"
val const_ALdouble_ptr = address c "const ALdouble *"


val ALCdevice_ptr = address c "ALCdevice *"
val ALCcontext_ptr = address c "ALCcontext *"

val ALCboolean = jboolean c "ALCboolean"
val ALCsizei = int c "ALCsizei"
val ALCenum = int c "ALCenum"

val ALCvoid_ptr = address c "ALCvoid *"

val const_ALCchar_ptr = string_u8 c "const ALCchar*"
val const_ALCint_ptr = address c "const ALCint *"
val const_ALCenum_ptr = address c "const ALCenum *"

val ALint64SOFT = jlong c "ALint64SOFT"
val ALint64SOFT_ptr = address c "ALint64SOFT *"
val const_ALint64SOFT_ptr = address c "const ALint64SOFT *"

val ALCint64SOFT_ptr = address c "ALCint64SOFT *"


const val alPackage = "overrungl.openal"
const val alLookup = "ALInternal.lookup()"

fun main() {
    alext()
    efx()

    registerDefType("ALboolean", c_char)
    registerDefType("ALchar", c_char)
    registerDefType("ALbyte", c_signed_char)
    registerDefType("ALubyte", c_unsigned_char)
    registerDefType("ALshort", c_short)
    registerDefType("ALushort", c_unsigned_short)
    registerDefType("ALint", c_int)
    registerDefType("ALuint", c_unsigned_int)
    registerDefType("ALsizei", c_int)
    registerDefType("ALenum", c_int)
    registerDefType("ALfloat", c_float)
    registerDefType("ALdouble", c_double)
    registerDefType("ALvoid", VoidType)

    registerDefType("ALCboolean", c_char)
    registerDefType("ALCchar", c_char)
    registerDefType("ALCbyte", c_signed_char)
    registerDefType("ALCubyte", c_unsigned_char)
    registerDefType("ALCshort", c_short)
    registerDefType("ALCushort", c_unsigned_short)
    registerDefType("ALCint", c_int)
    registerDefType("ALCuint", c_unsigned_int)
    registerDefType("ALCsizei", c_int)
    registerDefType("ALCenum", c_int)
    registerDefType("ALCfloat", c_float)
    registerDefType("ALCdouble", c_double)
    registerDefType("ALCvoid", VoidType)

    registerDefType("_alsoft_int64_t", int64_t)
    registerDefType("_alsoft_uint64_t", overrungl.gen.file.uint64_t)

    DefinitionFile("al.gen").compile(alPackage, "AL", alLookup)
    DefinitionFile("alc.gen").compile(alPackage, "ALC", alLookup)

    writeNativeImageRegistration(alPackage)
}
