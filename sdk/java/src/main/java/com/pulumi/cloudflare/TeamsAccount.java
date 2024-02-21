// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.TeamsAccountArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.TeamsAccountState;
import com.pulumi.cloudflare.outputs.TeamsAccountAntivirus;
import com.pulumi.cloudflare.outputs.TeamsAccountBlockPage;
import com.pulumi.cloudflare.outputs.TeamsAccountBodyScanning;
import com.pulumi.cloudflare.outputs.TeamsAccountExtendedEmailMatching;
import com.pulumi.cloudflare.outputs.TeamsAccountFips;
import com.pulumi.cloudflare.outputs.TeamsAccountLogging;
import com.pulumi.cloudflare.outputs.TeamsAccountPayloadLog;
import com.pulumi.cloudflare.outputs.TeamsAccountProxy;
import com.pulumi.cloudflare.outputs.TeamsAccountSshSessionLog;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Teams Account resource. The Teams Account
 * resource defines configuration for secure web gateway.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.TeamsAccount;
 * import com.pulumi.cloudflare.TeamsAccountArgs;
 * import com.pulumi.cloudflare.inputs.TeamsAccountAntivirusArgs;
 * import com.pulumi.cloudflare.inputs.TeamsAccountAntivirusNotificationSettingsArgs;
 * import com.pulumi.cloudflare.inputs.TeamsAccountBlockPageArgs;
 * import com.pulumi.cloudflare.inputs.TeamsAccountBodyScanningArgs;
 * import com.pulumi.cloudflare.inputs.TeamsAccountExtendedEmailMatchingArgs;
 * import com.pulumi.cloudflare.inputs.TeamsAccountFipsArgs;
 * import com.pulumi.cloudflare.inputs.TeamsAccountLoggingArgs;
 * import com.pulumi.cloudflare.inputs.TeamsAccountLoggingSettingsByRuleTypeArgs;
 * import com.pulumi.cloudflare.inputs.TeamsAccountLoggingSettingsByRuleTypeDnsArgs;
 * import com.pulumi.cloudflare.inputs.TeamsAccountLoggingSettingsByRuleTypeHttpArgs;
 * import com.pulumi.cloudflare.inputs.TeamsAccountLoggingSettingsByRuleTypeL4Args;
 * import com.pulumi.cloudflare.inputs.TeamsAccountProxyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new TeamsAccount(&#34;example&#34;, TeamsAccountArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .antivirus(TeamsAccountAntivirusArgs.builder()
 *                 .enabledDownloadPhase(true)
 *                 .enabledUploadPhase(false)
 *                 .failClosed(true)
 *                 .notificationSettings(TeamsAccountAntivirusNotificationSettingsArgs.builder()
 *                     .enabled(true)
 *                     .message(&#34;you are blocked&#34;)
 *                     .supportUrl(&#34;https://example.com/blocked&#34;)
 *                     .build())
 *                 .build())
 *             .blockPage(TeamsAccountBlockPageArgs.builder()
 *                 .backgroundColor(&#34;#000000&#34;)
 *                 .footerText(&#34;hello&#34;)
 *                 .headerText(&#34;hello&#34;)
 *                 .logoPath(&#34;https://example.com/logo.jpg&#34;)
 *                 .build())
 *             .bodyScanning(TeamsAccountBodyScanningArgs.builder()
 *                 .inspectionMode(&#34;deep&#34;)
 *                 .build())
 *             .extendedEmailMatching(TeamsAccountExtendedEmailMatchingArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .fips(TeamsAccountFipsArgs.builder()
 *                 .tls(true)
 *                 .build())
 *             .logging(TeamsAccountLoggingArgs.builder()
 *                 .redactPii(true)
 *                 .settingsByRuleType(TeamsAccountLoggingSettingsByRuleTypeArgs.builder()
 *                     .dns(TeamsAccountLoggingSettingsByRuleTypeDnsArgs.builder()
 *                         .logAll(false)
 *                         .logBlocks(true)
 *                         .build())
 *                     .http(TeamsAccountLoggingSettingsByRuleTypeHttpArgs.builder()
 *                         .logAll(true)
 *                         .logBlocks(true)
 *                         .build())
 *                     .l4(TeamsAccountLoggingSettingsByRuleTypeL4Args.builder()
 *                         .logAll(false)
 *                         .logBlocks(true)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .protocolDetectionEnabled(true)
 *             .proxy(TeamsAccountProxyArgs.builder()
 *                 .rootCa(true)
 *                 .tcp(true)
 *                 .udp(true)
 *                 .build())
 *             .tlsDecryptEnabled(true)
 *             .urlBrowserIsolationEnabled(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/teamsAccount:TeamsAccount example &lt;account_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/teamsAccount:TeamsAccount")
public class TeamsAccount extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Whether to enable the activity log.
     * 
     */
    @Export(name="activityLogEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> activityLogEnabled;

    /**
     * @return Whether to enable the activity log.
     * 
     */
    public Output<Optional<Boolean>> activityLogEnabled() {
        return Codegen.optional(this.activityLogEnabled);
    }
    /**
     * Configuration block for antivirus traffic scanning.
     * 
     */
    @Export(name="antivirus", refs={TeamsAccountAntivirus.class}, tree="[0]")
    private Output</* @Nullable */ TeamsAccountAntivirus> antivirus;

    /**
     * @return Configuration block for antivirus traffic scanning.
     * 
     */
    public Output<Optional<TeamsAccountAntivirus>> antivirus() {
        return Codegen.optional(this.antivirus);
    }
    /**
     * Configuration for a custom block page.
     * 
     */
    @Export(name="blockPage", refs={TeamsAccountBlockPage.class}, tree="[0]")
    private Output</* @Nullable */ TeamsAccountBlockPage> blockPage;

    /**
     * @return Configuration for a custom block page.
     * 
     */
    public Output<Optional<TeamsAccountBlockPage>> blockPage() {
        return Codegen.optional(this.blockPage);
    }
    /**
     * Configuration for body scanning.
     * 
     */
    @Export(name="bodyScanning", refs={TeamsAccountBodyScanning.class}, tree="[0]")
    private Output</* @Nullable */ TeamsAccountBodyScanning> bodyScanning;

    /**
     * @return Configuration for body scanning.
     * 
     */
    public Output<Optional<TeamsAccountBodyScanning>> bodyScanning() {
        return Codegen.optional(this.bodyScanning);
    }
    /**
     * Configuration for extended e-mail matching.
     * 
     */
    @Export(name="extendedEmailMatching", refs={TeamsAccountExtendedEmailMatching.class}, tree="[0]")
    private Output</* @Nullable */ TeamsAccountExtendedEmailMatching> extendedEmailMatching;

    /**
     * @return Configuration for extended e-mail matching.
     * 
     */
    public Output<Optional<TeamsAccountExtendedEmailMatching>> extendedEmailMatching() {
        return Codegen.optional(this.extendedEmailMatching);
    }
    /**
     * Configure compliance with Federal Information Processing Standards.
     * 
     */
    @Export(name="fips", refs={TeamsAccountFips.class}, tree="[0]")
    private Output</* @Nullable */ TeamsAccountFips> fips;

    /**
     * @return Configure compliance with Federal Information Processing Standards.
     * 
     */
    public Output<Optional<TeamsAccountFips>> fips() {
        return Codegen.optional(this.fips);
    }
    @Export(name="logging", refs={TeamsAccountLogging.class}, tree="[0]")
    private Output</* @Nullable */ TeamsAccountLogging> logging;

    public Output<Optional<TeamsAccountLogging>> logging() {
        return Codegen.optional(this.logging);
    }
    /**
     * Enable non-identity onramp for Browser Isolation. Defaults to `false`.
     * 
     */
    @Export(name="nonIdentityBrowserIsolationEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> nonIdentityBrowserIsolationEnabled;

    /**
     * @return Enable non-identity onramp for Browser Isolation. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> nonIdentityBrowserIsolationEnabled() {
        return Codegen.optional(this.nonIdentityBrowserIsolationEnabled);
    }
    /**
     * Configuration for DLP Payload Logging.
     * 
     */
    @Export(name="payloadLog", refs={TeamsAccountPayloadLog.class}, tree="[0]")
    private Output</* @Nullable */ TeamsAccountPayloadLog> payloadLog;

    /**
     * @return Configuration for DLP Payload Logging.
     * 
     */
    public Output<Optional<TeamsAccountPayloadLog>> payloadLog() {
        return Codegen.optional(this.payloadLog);
    }
    /**
     * Indicator that protocol detection is enabled.
     * 
     */
    @Export(name="protocolDetectionEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> protocolDetectionEnabled;

    /**
     * @return Indicator that protocol detection is enabled.
     * 
     */
    public Output<Optional<Boolean>> protocolDetectionEnabled() {
        return Codegen.optional(this.protocolDetectionEnabled);
    }
    /**
     * Configuration block for specifying which protocols are proxied.
     * 
     */
    @Export(name="proxy", refs={TeamsAccountProxy.class}, tree="[0]")
    private Output</* @Nullable */ TeamsAccountProxy> proxy;

    /**
     * @return Configuration block for specifying which protocols are proxied.
     * 
     */
    public Output<Optional<TeamsAccountProxy>> proxy() {
        return Codegen.optional(this.proxy);
    }
    /**
     * Configuration for SSH Session Logging.
     * 
     */
    @Export(name="sshSessionLog", refs={TeamsAccountSshSessionLog.class}, tree="[0]")
    private Output</* @Nullable */ TeamsAccountSshSessionLog> sshSessionLog;

    /**
     * @return Configuration for SSH Session Logging.
     * 
     */
    public Output<Optional<TeamsAccountSshSessionLog>> sshSessionLog() {
        return Codegen.optional(this.sshSessionLog);
    }
    /**
     * Indicator that decryption of TLS traffic is enabled.
     * 
     */
    @Export(name="tlsDecryptEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> tlsDecryptEnabled;

    /**
     * @return Indicator that decryption of TLS traffic is enabled.
     * 
     */
    public Output<Optional<Boolean>> tlsDecryptEnabled() {
        return Codegen.optional(this.tlsDecryptEnabled);
    }
    /**
     * Safely browse websites in Browser Isolation through a URL. Defaults to `false`.
     * 
     */
    @Export(name="urlBrowserIsolationEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> urlBrowserIsolationEnabled;

    /**
     * @return Safely browse websites in Browser Isolation through a URL. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> urlBrowserIsolationEnabled() {
        return Codegen.optional(this.urlBrowserIsolationEnabled);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TeamsAccount(String name) {
        this(name, TeamsAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TeamsAccount(String name, TeamsAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TeamsAccount(String name, TeamsAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/teamsAccount:TeamsAccount", name, args == null ? TeamsAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TeamsAccount(String name, Output<String> id, @Nullable TeamsAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/teamsAccount:TeamsAccount", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TeamsAccount get(String name, Output<String> id, @Nullable TeamsAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TeamsAccount(name, id, state, options);
    }
}
