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
package overrungl.opengl.ext;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_HP_image_transform}
 */
public interface GLHPImageTransform {
    int GL_IMAGE_SCALE_X_HP = 0x8155;
    int GL_IMAGE_SCALE_Y_HP = 0x8156;
    int GL_IMAGE_TRANSLATE_X_HP = 0x8157;
    int GL_IMAGE_TRANSLATE_Y_HP = 0x8158;
    int GL_IMAGE_ROTATE_ANGLE_HP = 0x8159;
    int GL_IMAGE_ROTATE_ORIGIN_X_HP = 0x815A;
    int GL_IMAGE_ROTATE_ORIGIN_Y_HP = 0x815B;
    int GL_IMAGE_MAG_FILTER_HP = 0x815C;
    int GL_IMAGE_MIN_FILTER_HP = 0x815D;
    int GL_IMAGE_CUBIC_WEIGHT_HP = 0x815E;
    int GL_CUBIC_HP = 0x815F;
    int GL_AVERAGE_HP = 0x8160;
    int GL_IMAGE_TRANSFORM_2D_HP = 0x8161;
    int GL_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP = 0x8162;
    int GL_PROXY_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP = 0x8163;

    default void glImageTransformParameteriHP(int target, int pname, int param) {
        throw new ContextException();
    }

    default void glImageTransformParameterfHP(int target, int pname, float param) {
        throw new ContextException();
    }

    default void glImageTransformParameterivHP(int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glImageTransformParameterfvHP(int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetImageTransformParameterivHP(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetImageTransformParameterfvHP(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

}
