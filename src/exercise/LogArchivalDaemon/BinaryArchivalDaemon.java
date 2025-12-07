package exercise.LogArchivalDaemon;

public class BinaryArchivalDaemon implements ArchivalDaemon {
    @Override public boolean archive(final File file) {
        System.out.println("Initiate Moving...");
        System.out.println("[MV] Moving <" + file.getFilename() + "> to /var/backup/");
        return true;
    }
}
