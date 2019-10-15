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

    UserAgentHelper(UserAgent userAgent) {
        this.userAgent = userAgent;
    }

    boolean isiOS() {
        return isOs(OperatingSystem.IOS);
    }

    boolean isAndroid() {
        return isOs(OperatingSystem.ANDROID);
    }

    boolean isWindows() {
        return isOs(OperatingSystem.WINDOWS);
    }

    boolean isOSX() {
        return isOs(OperatingSystem.MAC_OS_X) || isOs(OperatingSystem.MAC_OS);
    }

    private boolean isOs(OperatingSystem osForChecking) {
        OperatingSystem os = userAgent.getOperatingSystem();
        return os.getGroup() == osForChecking || os == osForChecking;
    }
}
