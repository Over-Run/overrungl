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

package overrungl.nfd;

import overrun.marshal.LayoutBuilder;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;
import overrungl.util.PlatformLayouts;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandles;

/**
 * The native window handle.
 * <p>
 * If using a platform abstraction framework (e.g. SDL2), this should be
 * obtained using the corresponding NFD glue header (e.g. nfd_sdl2.h).
 *
 * @author squid233
 * @since 0.1.0
 */
public interface NFDWindowHandle extends Struct<NFDWindowHandle> {
    /**
     * The struct allocator.
     */
    StructAllocator<NFDWindowHandle> OF = new StructAllocator<>(MethodHandles.lookup(),
        LayoutBuilder.struct()
            .add(PlatformLayouts.SIZE_T, "type")
            .cAddress("handle")
            .build());

    /**
     * {@return type}
     */
    long type();

    /**
     * Sets {@code type}.
     *
     * @param type type
     * @return {@code this}
     */
    NFDWindowHandle type(long type);

    /**
     * {@return handle}
     */
    MemorySegment handle();

    /**
     * Sets {@code handle}
     *
     * @param handle handle
     * @return {@code this}
     */
    NFDWindowHandle handle(MemorySegment handle);
}
