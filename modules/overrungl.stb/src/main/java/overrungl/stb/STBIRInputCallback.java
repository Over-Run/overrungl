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
 * INPUT CALLBACK: this callback is used for input scanlines
 * <p>
 * The input callback is super flexible - it calls you with the input address
 * (based on the stride and base pointer), it gives you an optional_output
 * pointer that you can fill, or you can just return your own pointer into
 * your own data.
 * <p>
 * You can also do conversion from non-supported data types if necessary - in
 * this case, you ignore the input_ptr and just use the x and y parameters to
 * calculate your own input_ptr based on the size of each non-supported pixel.
 * (Something like the third example below.)
 * <p>
 * You can also install just an input or just an output callback by setting the
 * callback that you don't want to zero.
 * <p>
 * First example, progress: (getting a callback that you can monitor the progress):
 * <pre>{@code void const * my_callback( void * optional_output, void const * input_ptr, int num_pixels, int x, int y, void * context )
 * {
 *    percentage_done = y / input_height;
 *    return input_ptr;  // use buffer from call
 * }}</pre>
 * <p>
 * Next example, copying: (copy from some other buffer or stream):
 * <pre>{@code void const * my_callback( void * optional_output, void const * input_ptr, int num_pixels, int x, int y, void * context )
 * {
 *    CopyOrStreamData( optional_output, other_data_src, num_pixels * pixel_width_in_bytes );
 *    return optional_output;  // return the optional buffer that we filled
 * }}</pre>
 * <p>
 * Third example, input another buffer without copying: (zero-copy from other buffer):
 * <pre>{@code void const * my_callback( void * optional_output, void const * input_ptr, int num_pixels, int x, int y, void * context )
 * {
 *    void * pixels = ( (char*) other_image_base ) + ( y * other_image_stride ) + ( x * other_pixel_width_in_bytes );
 *    return pixels;       // return pointer to your data without copying
 * }}</pre>
 *
 * @author squid233
 * @since 0.1.0
 */
@FunctionalInterface
public interface STBIRInputCallback extends Upcall {
    /**
     * the type
     */
    Type<STBIRInputCallback> TYPE = Upcall.type("invoke", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));

    @NativeType("void const *")
    MemorySegment invoke(@NativeType("void *") MemorySegment optional_output, @NativeType("void const *") MemorySegment input_ptr, int num_pixels, int x, int y, @NativeType("void *") MemorySegment context);

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}
