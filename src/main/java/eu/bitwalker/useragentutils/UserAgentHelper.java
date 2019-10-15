package eu.bitwalker.useragentutils;

/**
 * A helper around {@link UserAgent} to provide some quick actions.
 *
 * @author Shashank Agrawal
 * @since 0.0.2
 */
public class UserAgentHelper {

    private UserAgent userAgent;

    public static UserAgentHelper from(UserAgent userAgent) {
        return new UserAgentHelper(userAgent);
    }

    private UserAgentHelper(UserAgent userAgent) {
        this.userAgent = userAgent;
    }

    public boolean isiOS() {
        return isOS(OperatingSystem.IOS);
    }

    public boolean isAndroid() {
        return isOS(OperatingSystem.ANDROID);
    }

    public boolean isWindows() {
        return isOS(OperatingSystem.WINDOWS);
    }

    public boolean isMacOS() {
        return isOS(OperatingSystem.MAC_OS_X) || isOS(OperatingSystem.MAC_OS);
    }

    public boolean isOS(OperatingSystem osForChecking) {
        OperatingSystem os = userAgent.getOperatingSystem();
        return os.getGroup() == osForChecking || os == osForChecking;
    }
}
