package exercise.LogArchivalDaemon;

public class Main {
    public static void main(String[] args) {
        File textFile = new File();
        textFile.setFilename("application.log");

        File binaryFile = new File();
        binaryFile.setFilename("video_recording.mp4");

        File securityFile = new File();
        securityFile.setFilename("payment_history.audit");

        ArchivalDaemonManager archivalDaemonManager = new ArchivalDaemonManager();
        archivalDaemonManager.runArchive(textFile);
        archivalDaemonManager.runArchive(binaryFile);
        archivalDaemonManager.runArchive(securityFile);
    }
}
