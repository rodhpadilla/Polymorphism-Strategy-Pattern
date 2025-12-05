package example.TheUniversalPackageManager;

public class AptInstaller implements PackageInstaller {
    @Override public void install(final String packageName) {
        System.out.println("[Debian/Ubuntu] Running: sudo apt-get install -y " + packageName);
    }
}
