package example.TheUniversalPackageManager;

public class InstallerFactory {
    public static PackageInstaller getInstaller(String osDistro) {
        if ("ubuntu".equalsIgnoreCase(osDistro) || "debian".equalsIgnoreCase(osDistro)) {
            return new AptInstaller();
        }
        else if ("centos".equalsIgnoreCase(osDistro) || "rhel".equalsIgnoreCase(osDistro)) {
            return new YumInstaller();
        } else {
            throw new UnsupportedOperationException("OS not supported: " + osDistro);
        }
    }
}
