/// The Shaderc binding.
///
/// - [Source](https://github.com/google/shaderc)
///
/// @since 0.2.0
module overrungl.shaderc {
    exports overrungl.shaderc;

    requires transitive overrungl.core;
    requires static org.graalvm.nativeimage;
    requires static org.jspecify;
}
