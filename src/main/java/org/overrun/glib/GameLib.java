package org.overrun.glib;

import org.overrun.glib.os.OperatingSystem;

import java.io.File;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SymbolLookup;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

/**
 * The overrun game library utils.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GameLib {
    private static final File tmpdir = new File(System.getProperty("java.io.tmpdir"));

    /**
     * Load a library from classpath or local.
     *
     * @param module   the module name like {@code glfw}
     * @param basename the basename of the library (without extensions)
     * @param version  the version suffix
     * @return the {@link SymbolLookup}
     * @throws RuntimeException if file not found
     */
    public static SymbolLookup load(String module, String basename, String version)
        throws RuntimeException {
        final var os = OperatingSystem.current();
        final var path = basename + os.getSharedLibrarySuffix();
        URI uri;
        // 1. Load from classpath
        try {
            var file = new File(tmpdir, "overrungl" + System.getProperty("user.name"));
            if (!file.exists()) {
                // Create directory
                file.mkdir();
            } else if (file.isFile()) {
                // Remove
                file.delete();
                // Create directory
                file.mkdir();
            }
            var libFile = new File(file, basename + "-" + version + os.getSharedLibrarySuffix());
            if (!libFile.exists()) {
                // Extract
                try (var is = ClassLoader.getSystemResourceAsStream(
                    module + "/" + os.getFamilyName() + "/" + os.getArch() + "/" + path
                )) {
                    Files.copy(Objects.requireNonNull(is), Path.of(libFile.getAbsolutePath()));
                }
            }
            uri = libFile.toURI();
        } catch (Exception e) {
            // 2. Load from natives directory
            var file = new File(System.getProperty("overrungl.natives", ".") + "/" + path);
            if (!file.exists()) {
                throw new RuntimeException("File not found: " + file + "; Try to set property -Doverrungl.natives to a valid path");
            }
            uri = file.toURI();
        }
        // Load library by the path with the global session
        return SymbolLookup.libraryLookup(Path.of(uri), MemorySession.global());
    }
}
