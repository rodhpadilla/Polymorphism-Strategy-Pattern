package exercise.LogArchivalDaemon;

public class TextAchivalDaemon implements ArchivalDaemon {
    @Override public boolean archive(final File file) {
        System.out.println("Initiate Compression ...");
        System.out.println("gzip <" + file.getFilename() + ">");

        try {
            System.out.println("[GZIP] Compressing <" + file.getFilename() + ">... ratio 10%");
            Thread.sleep(1000);
            System.out.println("[GZIP] Compressing <" + file.getFilename() + ">... ratio 40%");
            Thread.sleep(1000);
            System.out.println("[GZIP] Compressing <" + file.getFilename() + ">... ratio 70%");
            Thread.sleep(1000);
            System.out.println("[GZIP] Compressing <" + file.getFilename() + ">... ratio 95%");
            Thread.sleep(1000);
            System.out.println("[GZIP] Compressing <" + file.getFilename() + ">... ratio 100%");
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        }

    }
}
