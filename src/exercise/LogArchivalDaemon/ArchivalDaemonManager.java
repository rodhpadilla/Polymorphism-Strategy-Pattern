package exercise.LogArchivalDaemon;

public class ArchivalDaemonManager {
    public void runArchive(File file) {
        ArchivalDaemon archivalDaemon = ArchivalDaemonResolver.getArchivalDaemon(file);
        archivalDaemon.archive(file);
    }
}
