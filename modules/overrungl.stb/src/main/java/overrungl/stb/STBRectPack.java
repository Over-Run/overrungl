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

import overrun.marshal.Downcall;
import overrun.marshal.gen.Entrypoint;

import java.lang.invoke.MethodHandles;

/**
 * Useful for e.g. packing rectangular textures into an atlas.
 * Does not do rotation.
 * <p>
 * This library currently uses the Skyline Bottom-Left algorithm.
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBRectPack {
    /**
     * The instance of STBRectPack.
     */
    STBRectPack INSTANCE = Downcall.load(MethodHandles.lookup(), Handles.lookup);
    /**
     * Mostly for internal use, but this is the maximum supported coordinate value.
     */
    int _MAXVAL = 0x7fffffff;
    /**
     * heuristic
     */
    int HEURISTIC_Skyline_default = 0,
    /**
     * bottom left
     */
    HEURISTIC_Skyline_BL_sortHeight = HEURISTIC_Skyline_default,
    /**
     * best-fit
     */
    HEURISTIC_Skyline_BF_sortHeight = 1;

    /**
     * Assign packed locations to rectangles. The rectangles are of type
     * 'stbrp_rect' defined below, stored in the array 'rects', and there
     * are 'num_rects' many of them.
     * <p>
     * Rectangles which are successfully packed have the 'was_packed' flag
     * set to a non-zero value and 'x' and 'y' store the minimum location
     * on each axis (i.e. bottom-left in cartesian coordinates, top-left
     * if you imagine y increasing downwards). Rectangles which do not fit
     * have the 'was_packed' flag set to 0.
     * <p>
     * You should not try to access the 'rects' array from another thread
     * while this function is running, as the function temporarily reorders
     * the array while it executes.
     * <p>
     * To pack into another rectangle, you need to call stbrp_init_target
     * again. To continue packing into the same rectangle, you can call
     * this function again. Calling this multiple times with multiple rect
     * arrays will probably produce worse packing results than calling it
     * a single time with the full rectangle array, but the option is
     * available.
     *
     * @param context   context
     * @param rects     rects
     * @param num_rects num of rects
     * @return 1 if all of the rectangles were successfully
     * packed and 0 otherwise.
     */
    @Entrypoint("stbrp_pack_rects")
    int packRects(STBRPContext context, STBRPRect rects, int num_rects);

    /**
     * Initialize a rectangle packer to:
     * <ul>
     *     <li>pack a rectangle that is 'width' by 'height' in dimensions</li>
     *     <li>using temporary storage provided by the array 'nodes', which is 'num_nodes' long</li>
     * </ul>
     * <p>
     * You must call this function every time you start packing into a new target.
     * <p>
     * There is no "shutdown" function. The 'nodes' memory must stay valid for
     * the following stbrp_pack_rects() call (or calls), but can be freed after
     * the call (or calls) finish.
     * <p>
     * Note: to guarantee best results, either:
     * <ol>
     *     <li>make sure 'num_nodes' >= 'width' or</li>
     *     <li>call stbrp_allow_out_of_mem() defined below with 'allow_out_of_mem = 1'</li>
     * </ol>
     * <p>
     * If you don't do either of the above things, widths will be quantized to multiples
     * of small integers to guarantee the algorithm doesn't run out of temporary storage.
     * <p>
     * If you do #2, then the non-quantized algorithm will be used, but the algorithm
     * may run out of temporary storage and be unable to pack some rectangles.
     *
     * @param context   context
     * @param width     width
     * @param height    height
     * @param nodes     nodes
     * @param num_nodes num of nodes
     */
    @Entrypoint("stbrp_init_target")
    void initTarget(STBRPContext context, int width, int height, STBRPNode nodes, int num_nodes);

    /**
     * Optionally call this function after init but before doing any packing to
     * change the handling of the out-of-temp-memory scenario, described above.
     * <p>
     * If you call init again, this will be reset to the default (false).
     *
     * @param context          context
     * @param allow_out_of_mem allow_out_of_mem
     */
    @Entrypoint("stbrp_setup_allow_out_of_mem")
    void setupAllowOutOfMem(STBRPContext context, int allow_out_of_mem);

    /**
     * Optionally select which packing heuristic the library should use. Different
     * heuristics will produce better/worse results for different data sets.
     * <p>
     * If you call init again, this will be reset to the default.
     *
     * @param context   context
     * @param heuristic heuristic
     */
    @Entrypoint("stbrp_setup_heuristic")
    void setupHeuristic(STBRPContext context, int heuristic);
}
