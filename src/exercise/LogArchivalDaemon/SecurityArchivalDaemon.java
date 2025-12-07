package exercise.LogArchivalDaemon;

public class SecurityArchivalDaemon implements ArchivalDaemon {
    @Override public boolean archive(final File file) {
        System.out.println("Initiate Compression ...");
        System.out.println("[GPG] Encrypting <" + file.getFilename() + "> with RSA-4096...");
        return true;
    }
}
