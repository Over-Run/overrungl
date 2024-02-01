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
 * {@code GL_AMD_occlusion_query_event}
 */
public interface GLAMDOcclusionQueryEvent {
    int GL_OCCLUSION_QUERY_EVENT_MASK_AMD = 0x874F;
    int GL_QUERY_DEPTH_PASS_EVENT_BIT_AMD = 0x00000001;
    int GL_QUERY_DEPTH_FAIL_EVENT_BIT_AMD = 0x00000002;
    int GL_QUERY_STENCIL_FAIL_EVENT_BIT_AMD = 0x00000004;
    int GL_QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD = 0x00000008;
    int GL_QUERY_ALL_EVENT_BITS_AMD = 0xFFFFFFFF;

    void glQueryObjectParameteruiAMD(int target, int id, int pname, int param);
}
