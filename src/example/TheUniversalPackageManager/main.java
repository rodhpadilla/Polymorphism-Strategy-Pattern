package example.TheUniversalPackageManager;

public class main {
    public static void main(String[] args) {
        ProvisioningService myService = new ProvisioningService();
        myService.installSoftware("centos", "vim");
        myService.installSoftware("ubuntu", "neovim");
    }
}
