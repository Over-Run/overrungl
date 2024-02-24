/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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

package overrungl.stb;

import overrun.marshal.Upcall;
import overrungl.NativeType;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

/**
 * OUTPUT CALLBACK: this callback is used for output scanlines
 * <p>
 * The output callback is considerably simpler - it just calls you so that you can dump
 * out each scanline. You could even directly copy out to disk if you have a simple format
 * like TGA or BMP. You can also convert to other output types here if you want.
 * <p>
 * Simple example:
 * <pre>{@code void const * my_output( void * output_ptr, int num_pixels, int y, void * context )
 * {
 *    percentage_done = y / output_height;
 *    fwrite( output_ptr, pixel_width_in_bytes, num_pixels, output_file );
 * }}</pre>
 *
 * @author squid233
 * @since 0.1.0
 */
@FunctionalInterface
public interface STBIROutputCallback extends Upcall {
    /**
     * the type
     */
    Type<STBIROutputCallback> TYPE = Upcall.type("invoke", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));

    void invoke(@NativeType("void const *") MemorySegment output_ptr, int num_pixels, int y, @NativeType("void *") MemorySegment context);

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}
