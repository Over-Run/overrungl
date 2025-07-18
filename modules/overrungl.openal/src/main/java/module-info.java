/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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

/// The OpenAL binding.
///
/// OverrunGL uses [openal-soft](https://openal-soft.org/).
///
/// - [Website](https://www.openal.org/)
/// - [Source](https://github.com/kcat/openal-soft)
///
/// @author squid233
/// @since 0.1.0
module overrungl.openal {
    exports overrungl.openal;

    requires transitive overrungl.core;
    requires static org.graalvm.nativeimage;
}
