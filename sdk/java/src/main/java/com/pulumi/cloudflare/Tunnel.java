// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.TunnelArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.TunnelState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Tunnel exposes applications running on your local web server on any
 * network with an internet connection without manually adding DNS
 * records or configuring a firewall or router.
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
 * import com.pulumi.cloudflare.Tunnel;
 * import com.pulumi.cloudflare.TunnelArgs;
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
 *         var example = new Tunnel("example", TunnelArgs.builder()        
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("my-tunnel")
 *             .secret("AQIDBAUGBwgBAgMEBQYHCAECAwQFBgcIAQIDBAUGBwg=")
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
 * $ pulumi import cloudflare:index/tunnel:Tunnel example &lt;account_id&gt;/&lt;tunnel_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/tunnel:Tunnel")
public class Tunnel extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Usable CNAME for accessing the Tunnel.
     * 
     */
    @Export(name="cname", refs={String.class}, tree="[0]")
    private Output<String> cname;

    /**
     * @return Usable CNAME for accessing the Tunnel.
     * 
     */
    public Output<String> cname() {
        return this.cname;
    }
    /**
     * Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard or using tunnel*config, tunnel*route or tunnel*virtual*network resources. Available values: `local`, `cloudflare`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="configSrc", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> configSrc;

    /**
     * @return Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard or using tunnel*config, tunnel*route or tunnel*virtual*network resources. Available values: `local`, `cloudflare`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<String>> configSrc() {
        return Codegen.optional(this.configSrc);
    }
    /**
     * A user-friendly name chosen when the tunnel is created. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A user-friendly name chosen when the tunnel is created. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel&#39;s password. Anyone wishing to run the tunnel needs this password. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="secret", refs={String.class}, tree="[0]")
    private Output<String> secret;

    /**
     * @return 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel&#39;s password. Anyone wishing to run the tunnel needs this password. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }
    /**
     * Token used by a connector to authenticate and run the tunnel.
     * 
     */
    @Export(name="tunnelToken", refs={String.class}, tree="[0]")
    private Output<String> tunnelToken;

    /**
     * @return Token used by a connector to authenticate and run the tunnel.
     * 
     */
    public Output<String> tunnelToken() {
        return this.tunnelToken;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Tunnel(String name) {
        this(name, TunnelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Tunnel(String name, TunnelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tunnel(String name, TunnelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/tunnel:Tunnel", name, args == null ? TunnelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Tunnel(String name, Output<String> id, @Nullable TunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/tunnel:Tunnel", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "secret",
                "tunnelToken"
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
    public static Tunnel get(String name, Output<String> id, @Nullable TunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Tunnel(name, id, state, options);
    }
}
