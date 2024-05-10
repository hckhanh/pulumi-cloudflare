// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.IpsecTunnelArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.IpsecTunnelState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource, that manages IPsec tunnels for Magic Transit.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.IpsecTunnel;
 * import com.pulumi.cloudflare.IpsecTunnelArgs;
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
 *         var example = new IpsecTunnel("example", IpsecTunnelArgs.builder()        
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("IPsec_1")
 *             .customerEndpoint("203.0.113.1")
 *             .cloudflareEndpoint("203.0.113.1")
 *             .interfaceAddress("192.0.2.0/31")
 *             .description("Tunnel for ISP X")
 *             .healthCheckEnabled(true)
 *             .healthCheckTarget("203.0.113.1")
 *             .healthCheckType("reply")
 *             .psk("asdf12341234")
 *             .allowNullCipher(false)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/ipsecTunnel:IpsecTunnel example &lt;account_id&gt;/&lt;tunnel_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/ipsecTunnel:IpsecTunnel")
public class IpsecTunnel extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountId;

    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
     * 
     */
    @Export(name="allowNullCipher", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowNullCipher;

    /**
     * @return Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> allowNullCipher() {
        return Codegen.optional(this.allowNullCipher);
    }
    /**
     * IP address assigned to the Cloudflare side of the IPsec tunnel.
     * 
     */
    @Export(name="cloudflareEndpoint", refs={String.class}, tree="[0]")
    private Output<String> cloudflareEndpoint;

    /**
     * @return IP address assigned to the Cloudflare side of the IPsec tunnel.
     * 
     */
    public Output<String> cloudflareEndpoint() {
        return this.cloudflareEndpoint;
    }
    /**
     * IP address assigned to the customer side of the IPsec tunnel.
     * 
     */
    @Export(name="customerEndpoint", refs={String.class}, tree="[0]")
    private Output<String> customerEndpoint;

    /**
     * @return IP address assigned to the customer side of the IPsec tunnel.
     * 
     */
    public Output<String> customerEndpoint() {
        return this.customerEndpoint;
    }
    /**
     * An optional description of the IPsec tunnel.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of the IPsec tunnel.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * `remote_id` in the form of a fqdn. This value is generated by cloudflare.
     * 
     */
    @Export(name="fqdnId", refs={String.class}, tree="[0]")
    private Output<String> fqdnId;

    /**
     * @return `remote_id` in the form of a fqdn. This value is generated by cloudflare.
     * 
     */
    public Output<String> fqdnId() {
        return this.fqdnId;
    }
    /**
     * Specifies the direction for the health check. Available values: `unidirectional`, `bidirectional` Default: `unidirectional`.
     * 
     */
    @Export(name="healthCheckDirection", refs={String.class}, tree="[0]")
    private Output<String> healthCheckDirection;

    /**
     * @return Specifies the direction for the health check. Available values: `unidirectional`, `bidirectional` Default: `unidirectional`.
     * 
     */
    public Output<String> healthCheckDirection() {
        return this.healthCheckDirection;
    }
    /**
     * Specifies if ICMP tunnel health checks are enabled. Default: `true`.
     * 
     */
    @Export(name="healthCheckEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> healthCheckEnabled;

    /**
     * @return Specifies if ICMP tunnel health checks are enabled. Default: `true`.
     * 
     */
    public Output<Boolean> healthCheckEnabled() {
        return this.healthCheckEnabled;
    }
    /**
     * Specifies the ICMP rate for the health check. Available values: `low`, `mid`, `high` Default: `mid`.
     * 
     */
    @Export(name="healthCheckRate", refs={String.class}, tree="[0]")
    private Output<String> healthCheckRate;

    /**
     * @return Specifies the ICMP rate for the health check. Available values: `low`, `mid`, `high` Default: `mid`.
     * 
     */
    public Output<String> healthCheckRate() {
        return this.healthCheckRate;
    }
    /**
     * The IP address of the customer endpoint that will receive tunnel health checks. Default: `&lt;customer_gre_endpoint&gt;`.
     * 
     */
    @Export(name="healthCheckTarget", refs={String.class}, tree="[0]")
    private Output<String> healthCheckTarget;

    /**
     * @return The IP address of the customer endpoint that will receive tunnel health checks. Default: `&lt;customer_gre_endpoint&gt;`.
     * 
     */
    public Output<String> healthCheckTarget() {
        return this.healthCheckTarget;
    }
    /**
     * Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
     * 
     */
    @Export(name="healthCheckType", refs={String.class}, tree="[0]")
    private Output<String> healthCheckType;

    /**
     * @return Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
     * 
     */
    public Output<String> healthCheckType() {
        return this.healthCheckType;
    }
    /**
     * `remote_id` as a hex string. This value is generated by cloudflare.
     * 
     */
    @Export(name="hexId", refs={String.class}, tree="[0]")
    private Output<String> hexId;

    /**
     * @return `remote_id` as a hex string. This value is generated by cloudflare.
     * 
     */
    public Output<String> hexId() {
        return this.hexId;
    }
    /**
     * 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
     * 
     */
    @Export(name="interfaceAddress", refs={String.class}, tree="[0]")
    private Output<String> interfaceAddress;

    /**
     * @return 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
     * 
     */
    public Output<String> interfaceAddress() {
        return this.interfaceAddress;
    }
    /**
     * Name of the IPsec tunnel.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the IPsec tunnel.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
     * 
     */
    @Export(name="psk", refs={String.class}, tree="[0]")
    private Output<String> psk;

    /**
     * @return Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
     * 
     */
    public Output<String> psk() {
        return this.psk;
    }
    /**
     * ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
     * 
     */
    @Export(name="remoteId", refs={String.class}, tree="[0]")
    private Output<String> remoteId;

    /**
     * @return ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
     * 
     */
    public Output<String> remoteId() {
        return this.remoteId;
    }
    /**
     * Specifies if replay protection is enabled. Defaults to `false`.
     * 
     */
    @Export(name="replayProtection", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> replayProtection;

    /**
     * @return Specifies if replay protection is enabled. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> replayProtection() {
        return Codegen.optional(this.replayProtection);
    }
    /**
     * `remote_id` in the form of an email address. This value is generated by cloudflare.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return `remote_id` in the form of an email address. This value is generated by cloudflare.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IpsecTunnel(String name) {
        this(name, IpsecTunnelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IpsecTunnel(String name, IpsecTunnelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IpsecTunnel(String name, IpsecTunnelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/ipsecTunnel:IpsecTunnel", name, args == null ? IpsecTunnelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IpsecTunnel(String name, Output<String> id, @Nullable IpsecTunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/ipsecTunnel:IpsecTunnel", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "psk"
            ))
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
    public static IpsecTunnel get(String name, Output<String> id, @Nullable IpsecTunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IpsecTunnel(name, id, state, options);
    }
}
