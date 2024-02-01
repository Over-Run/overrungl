/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.amd;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_AMD_name_gen_delete}
 */
public interface GLAMDNameGenDelete {
    int GL_DATA_BUFFER_AMD = 0x9151;
    int GL_PERFORMANCE_MONITOR_AMD = 0x9152;
    int GL_QUERY_OBJECT_AMD = 0x9153;
    int GL_VERTEX_ARRAY_OBJECT_AMD = 0x9154;
    int GL_SAMPLER_OBJECT_AMD = 0x9155;

    void glGenNamesAMD(int identifier, int num, @NativeType("GLuint *") MemorySegment names);
    void glDeleteNamesAMD(int identifier, int num, @NativeType("const GLuint *") MemorySegment names);
    boolean glIsNameAMD(int identifier, int name);
}
