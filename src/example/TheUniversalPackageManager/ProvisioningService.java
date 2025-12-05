package example.TheUniversalPackageManager;

public class ProvisioningService {
    public void installSoftware(String distro, String pkg) {
        PackageInstaller installer = InstallerFactory.getInstaller(distro);
        installer.install(pkg);
    }
}
