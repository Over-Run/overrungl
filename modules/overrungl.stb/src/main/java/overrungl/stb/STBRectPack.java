/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.stb;

import org.jspecify.annotations.NonNull;

import java.lang.foreign.MemorySegment;

/// [stb_rect_pack.h](https://github.com/nothings/stb/blob/master/stb_rect_pack.h)
///
/// @author squid233
/// @since 0.1.0
public final class STBRectPack {
    //@formatter:off
    //region Fields
    public static final int STBRP__MAXVAL = 0x7fffffff;
    public static final int STBRP_HEURISTIC_Skyline_default = 0;
    public static final int STBRP_HEURISTIC_Skyline_BL_sortHeight = 0;
    public static final int STBRP_HEURISTIC_Skyline_BF_sortHeight = 1;
    //endregion

    /// Invokes `stbrp_pack_rects`.
    /// ```
    /// (int) STBbool stbrp_pack_rects(stbrp_context* context, stbrp_rect* rects, int num_rects);
    /// ```
    public static boolean stbrp_pack_rects(@NonNull MemorySegment context, @NonNull MemorySegment rects, int num_rects) {
        return org.lwjgl.stb.STBRectPack.nstbrp_pack_rects(context.address(), rects.address(), num_rects) != 0;
    }

    /// Invokes `stbrp_init_target`.
    /// ```
    /// void stbrp_init_target(stbrp_context* context, int width, int height, stbrp_node* nodes, int num_nodes);
    /// ```
    public static void stbrp_init_target(@NonNull MemorySegment context, int width, int height, @NonNull MemorySegment nodes, int num_nodes) {
        org.lwjgl.stb.STBRectPack.nstbrp_init_target(context.address(), width, height, nodes.address(), num_nodes);
    }

    /// Invokes `stbrp_setup_allow_out_of_mem`.
    /// ```
    /// void stbrp_setup_allow_out_of_mem(stbrp_context* context, int allow_out_of_mem);
    /// ```
    public static void stbrp_setup_allow_out_of_mem(@NonNull MemorySegment context, int allow_out_of_mem) {
        org.lwjgl.stb.STBRectPack.nstbrp_setup_allow_out_of_mem(context.address(), allow_out_of_mem);
    }

    /// Invokes `stbrp_setup_heuristic`.
    /// ```
    /// void stbrp_setup_heuristic(stbrp_context* context, int heuristic);
    /// ```
    public static void stbrp_setup_heuristic(@NonNull MemorySegment context, int heuristic) {
        org.lwjgl.stb.STBRectPack.nstbrp_setup_heuristic(context.address(), heuristic);
    }

    //@formatter:on

    private STBRectPack() {
    }
}
