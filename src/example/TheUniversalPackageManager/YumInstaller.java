package example.TheUniversalPackageManager;

public class YumInstaller implements PackageInstaller {
    @Override public void install(final String packageName) {
        System.out.println("[RHEL/CentOS] Running: sudo yum install -y " + packageName);
    }
}
