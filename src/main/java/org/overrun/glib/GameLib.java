package org.overrun.glib;

import org.overrun.glib.os.OperatingSystem;

import java.io.File;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SymbolLookup;
import java.net.URI;
import java.nio.file.Path;

/**
 * The overrun game library utils.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GameLib {
    /**
     * Load a library from classpath or local.
     *
     * @param module   the module name like glfw
     * @param basename the basename of the library (without extensions)
     * @return the {@link SymbolLookup}
     */
    public static SymbolLookup load(String module, String basename) {
        final var os = OperatingSystem.current();
        var path = basename + os.getSharedLibrarySuffix();
        URI uri;
        // 1. Load from classpath
        try {
            uri = ClassLoader.getSystemResource(module + os.getFamilyName() + "/" + os.getArch() + path).toURI();
        } catch (Exception e) {
            // 2. Load from natives directory
            var file = new File(System.getProperty("overrungl.natives", "") + path);
            if (!file.exists()) {
                throw new RuntimeException("File not found: " + file + "; Try to set property overrungl.natives to a valid path");
            }
            uri = file.toURI();
        }
        return SymbolLookup.libraryLookup(Path.of(uri), MemorySession.global());
    }
}
