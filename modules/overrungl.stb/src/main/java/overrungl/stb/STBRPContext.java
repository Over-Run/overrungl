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

import overrun.marshal.LayoutBuilder;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

import java.lang.invoke.MethodHandles;

/**
 * the details of the following structures don't matter to you, but they must
 * be visible so you can handle the memory allocations for them
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBRPContext extends Struct<STBRPContext> {
    /**
     * The allocator
     */
    StructAllocator<STBRPContext> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cInt("width")
            .cInt("height")
            .cInt("align")
            .cInt("init_mode")
            .cInt("heuristic")
            .cInt("num_nodes")
            .cAddress("active_head")
            .cAddress("free_head")
            .cArray("extra", 2, STBRPNode.OF.layout())
            .build()
    );
}
