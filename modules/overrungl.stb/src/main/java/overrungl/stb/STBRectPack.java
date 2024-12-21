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

import overrungl.annotation.CType;
import overrungl.internal.RuntimeHelper;
import overrungl.util.Marshal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

/**
 * Useful for e.g. packing rectangular textures into an atlas.
 * Does not do rotation.
 * <p>
 * This library currently uses the Skyline Bottom-Left algorithm.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBRectPack {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    ///Mostly for internal use, but this is the maximum supported coordinate value.
    public static final int STBRP__MAXVAL = 0x7fffffff;
    public static final int STBRP_HEURISTIC_Skyline_default = 0;
    public static final int STBRP_HEURISTIC_Skyline_BL_sortHeight = STBRP_HEURISTIC_Skyline_default;
    public static final int STBRP_HEURISTIC_Skyline_BF_sortHeight = 1;
    //region Method handles
    /// The method handle of `stbrp_pack_rects`.
    public static final MethodHandle MH_stbrp_pack_rects = RuntimeHelper.downcall(Handles.lookup, "stbrp_pack_rects", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBRPContext.LAYOUT), ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBRPRect.LAYOUT), ValueLayout.JAVA_INT));
    /// The method handle of `stbrp_init_target`.
    public static final MethodHandle MH_stbrp_init_target = RuntimeHelper.downcall(Handles.lookup, "stbrp_init_target", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBRPContext.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBRPNode.LAYOUT), ValueLayout.JAVA_INT));
    /// The method handle of `stbrp_setup_allow_out_of_mem`.
    public static final MethodHandle MH_stbrp_setup_allow_out_of_mem = RuntimeHelper.downcall(Handles.lookup, "stbrp_setup_allow_out_of_mem", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBRPContext.LAYOUT), ValueLayout.JAVA_BOOLEAN));
    /// The method handle of `stbrp_setup_heuristic`.
    public static final MethodHandle MH_stbrp_setup_heuristic = RuntimeHelper.downcall(Handles.lookup, "stbrp_setup_heuristic", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBRPContext.LAYOUT), ValueLayout.JAVA_INT));
    //endregion

    ///Assign packed locations to rectangles. The rectangles are of type
    ///'stbrp_rect' defined below, stored in the array 'rects', and there
    ///are 'num_rects' many of them.
    ///
    ///Rectangles which are successfully packed have the 'was_packed' flag
    ///set to a non-zero value and 'x' and 'y' store the minimum location
    ///on each axis (i.e. bottom-left in cartesian coordinates, top-left
    ///if you imagine y increasing downwards). Rectangles which do not fit
    ///have the 'was_packed' flag set to 0.
    ///
    ///You should not try to access the 'rects' array from another thread
    ///while this function is running, as the function temporarily reorders
    ///the array while it executes.
    ///
    ///To pack into another rectangle, you need to call stbrp_init_target
    ///again. To continue packing into the same rectangle, you can call
    ///this function again. Calling this multiple times with multiple rect
    ///arrays will probably produce worse packing results than calling it
    ///a single time with the full rectangle array, but the option is
    ///available.
    ///
    ///@return 1 if all of the rectangles were successfully
    ///        packed and 0 otherwise.
    public static @CType("int") int stbrp_pack_rects(@CType("stbrp_context *") java.lang.foreign.MemorySegment context, @CType("stbrp_rect *") java.lang.foreign.MemorySegment rects, @CType("int") int num_rects) {
        try {
            return (int) MH_stbrp_pack_rects.invokeExact(context, rects, num_rects);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_pack_rects", e); }
    }
    ///Assign packed locations to rectangles. The rectangles are of type
    ///'stbrp_rect' defined below, stored in the array 'rects', and there
    ///are 'num_rects' many of them.
    ///
    ///Rectangles which are successfully packed have the 'was_packed' flag
    ///set to a non-zero value and 'x' and 'y' store the minimum location
    ///on each axis (i.e. bottom-left in cartesian coordinates, top-left
    ///if you imagine y increasing downwards). Rectangles which do not fit
    ///have the 'was_packed' flag set to 0.
    ///
    ///You should not try to access the 'rects' array from another thread
    ///while this function is running, as the function temporarily reorders
    ///the array while it executes.
    ///
    ///To pack into another rectangle, you need to call stbrp_init_target
    ///again. To continue packing into the same rectangle, you can call
    ///this function again. Calling this multiple times with multiple rect
    ///arrays will probably produce worse packing results than calling it
    ///a single time with the full rectangle array, but the option is
    ///available.
    ///
    ///@return 1 if all of the rectangles were successfully
    ///        packed and 0 otherwise.
    public static @CType("int") int stbrp_pack_rects(@CType("stbrp_context *") overrungl.stb.STBRPContext context, @CType("stbrp_rect *") overrungl.stb.STBRPRect rects, @CType("int") int num_rects) {
        try {
            return (int) MH_stbrp_pack_rects.invokeExact(Marshal.marshal(context), Marshal.marshal(rects), num_rects);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_pack_rects", e); }
    }
    ///Initialize a rectangle packer to:
    ///pack a rectangle that is 'width' by 'height' in dimensions
    ///using temporary storage provided by the array 'nodes', which is 'num_nodes' long
    ///
    ///You must call this function every time you start packing into a new target.
    ///
    ///There is no "shutdown" function. The 'nodes' memory must stay valid for
    ///the following stbrp_pack_rects() call (or calls), but can be freed after
    ///the call (or calls) finish.
    ///
    ///Note: to guarantee best results, either:
    ///1. make sure 'num_nodes' >= 'width' or
    ///2. call stbrp_allow_out_of_mem() defined below with 'allow_out_of_mem = 1'
    ///
    ///If you don't do either of the above things, widths will be quantized to multiples
    ///of small integers to guarantee the algorithm doesn't run out of temporary storage.
    ///
    ///If you do #2, then the non-quantized algorithm will be used, but the algorithm
    ///may run out of temporary storage and be unable to pack some rectangles.
    public static void stbrp_init_target(@CType("stbrp_context *") java.lang.foreign.MemorySegment context, @CType("int") int width, @CType("int") int height, @CType("stbrp_node *") java.lang.foreign.MemorySegment nodes, @CType("int") int num_nodes) {
        try {
            MH_stbrp_init_target.invokeExact(context, width, height, nodes, num_nodes);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_init_target", e); }
    }
    ///Initialize a rectangle packer to:
    ///pack a rectangle that is 'width' by 'height' in dimensions
    ///using temporary storage provided by the array 'nodes', which is 'num_nodes' long
    ///
    ///You must call this function every time you start packing into a new target.
    ///
    ///There is no "shutdown" function. The 'nodes' memory must stay valid for
    ///the following stbrp_pack_rects() call (or calls), but can be freed after
    ///the call (or calls) finish.
    ///
    ///Note: to guarantee best results, either:
    ///1. make sure 'num_nodes' >= 'width' or
    ///2. call stbrp_allow_out_of_mem() defined below with 'allow_out_of_mem = 1'
    ///
    ///If you don't do either of the above things, widths will be quantized to multiples
    ///of small integers to guarantee the algorithm doesn't run out of temporary storage.
    ///
    ///If you do #2, then the non-quantized algorithm will be used, but the algorithm
    ///may run out of temporary storage and be unable to pack some rectangles.
    public static void stbrp_init_target(@CType("stbrp_context *") overrungl.stb.STBRPContext context, @CType("int") int width, @CType("int") int height, @CType("stbrp_node *") overrungl.stb.STBRPNode nodes, @CType("int") int num_nodes) {
        try {
            MH_stbrp_init_target.invokeExact(Marshal.marshal(context), width, height, Marshal.marshal(nodes), num_nodes);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_init_target", e); }
    }
    ///Optionally call this function after init but before doing any packing to
    ///change the handling of the out-of-temp-memory scenario, described above.
    ///If you call init again, this will be reset to the default (false).
    public static void stbrp_setup_allow_out_of_mem(@CType("stbrp_context *") java.lang.foreign.MemorySegment context, @CType("int") boolean allow_out_of_mem) {
        try {
            MH_stbrp_setup_allow_out_of_mem.invokeExact(context, allow_out_of_mem);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_setup_allow_out_of_mem", e); }
    }
    ///Optionally call this function after init but before doing any packing to
    ///change the handling of the out-of-temp-memory scenario, described above.
    ///If you call init again, this will be reset to the default (false).
    public static void stbrp_setup_allow_out_of_mem(@CType("stbrp_context *") overrungl.stb.STBRPContext context, @CType("int") boolean allow_out_of_mem) {
        try {
            MH_stbrp_setup_allow_out_of_mem.invokeExact(Marshal.marshal(context), allow_out_of_mem);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_setup_allow_out_of_mem", e); }
    }
    ///Optionally select which packing heuristic the library should use. Different
    ///heuristics will produce better/worse results for different data sets.
    ///If you call init again, this will be reset to the default.
    public static void stbrp_setup_heuristic(@CType("stbrp_context *") java.lang.foreign.MemorySegment context, @CType("int") int heuristic) {
        try {
            MH_stbrp_setup_heuristic.invokeExact(context, heuristic);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_setup_heuristic", e); }
    }
    ///Optionally select which packing heuristic the library should use. Different
    ///heuristics will produce better/worse results for different data sets.
    ///If you call init again, this will be reset to the default.
    public static void stbrp_setup_heuristic(@CType("stbrp_context *") overrungl.stb.STBRPContext context, @CType("int") int heuristic) {
        try {
            MH_stbrp_setup_heuristic.invokeExact(Marshal.marshal(context), heuristic);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_setup_heuristic", e); }
    }
    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBRectPack() {
    }
}
