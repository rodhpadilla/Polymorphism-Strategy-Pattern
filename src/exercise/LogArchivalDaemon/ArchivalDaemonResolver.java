package exercise.LogArchivalDaemon;

public class ArchivalDaemonResolver {
    public static ArchivalDaemon getArchivalDaemon(File file) {
        if (file.getFilename().contains(".log") || file.getFilename().contains("txt")) {
            return new TextAchivalDaemon();
        }
        else if (file.getFilename().contains(".mp4") || file.getFilename().contains(".bin") || file.getFilename().contains(".jpg")) {
            return new BinaryArchivalDaemon();
        }
        else if (file.getFilename().contains(".audit") || file.getFilename().contains(".secure")) {
            return new SecurityArchivalDaemon();
        } else {
            throw new UnsupportedOperationException("Filename not supported: " + file.getFilename());
        }
    }
}
