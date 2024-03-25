// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.HyperdriveConfigArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.HyperdriveConfigState;
import com.pulumi.cloudflare.outputs.HyperdriveConfigCaching;
import com.pulumi.cloudflare.outputs.HyperdriveConfigOrigin;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The [Hyperdrive Config](https://developers.cloudflare.com/hyperdrive/) resource allows you to manage Cloudflare Hyperdrive Configs.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.HyperdriveConfig;
 * import com.pulumi.cloudflare.HyperdriveConfigArgs;
 * import com.pulumi.cloudflare.inputs.HyperdriveConfigCachingArgs;
 * import com.pulumi.cloudflare.inputs.HyperdriveConfigOriginArgs;
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
 *         var noDefaults = new HyperdriveConfig(&#34;noDefaults&#34;, HyperdriveConfigArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .caching(HyperdriveConfigCachingArgs.builder()
 *                 .disabled(false)
 *                 .build())
 *             .name(&#34;my-hyperdrive-config&#34;)
 *             .origin(HyperdriveConfigOriginArgs.builder()
 *                 .database(&#34;postgres&#34;)
 *                 .host(&#34;my-database.example.com&#34;)
 *                 .password(&#34;my-password&#34;)
 *                 .port(5432)
 *                 .scheme(&#34;postgres&#34;)
 *                 .user(&#34;my-user&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/hyperdriveConfig:HyperdriveConfig example &lt;account_id&gt;/&lt;hyperdrive_config_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/hyperdriveConfig:HyperdriveConfig")
public class HyperdriveConfig extends com.pulumi.resources.CustomResource {
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
     * The caching details for the Hyperdrive configuration.
     * 
     */
    @Export(name="caching", refs={HyperdriveConfigCaching.class}, tree="[0]")
    private Output<HyperdriveConfigCaching> caching;

    /**
     * @return The caching details for the Hyperdrive configuration.
     * 
     */
    public Output<HyperdriveConfigCaching> caching() {
        return this.caching;
    }
    /**
     * The name of the Hyperdrive configuration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Hyperdrive configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The origin details for the Hyperdrive configuration.
     * 
     */
    @Export(name="origin", refs={HyperdriveConfigOrigin.class}, tree="[0]")
    private Output<HyperdriveConfigOrigin> origin;

    /**
     * @return The origin details for the Hyperdrive configuration.
     * 
     */
    public Output<HyperdriveConfigOrigin> origin() {
        return this.origin;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HyperdriveConfig(String name) {
        this(name, HyperdriveConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HyperdriveConfig(String name, HyperdriveConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HyperdriveConfig(String name, HyperdriveConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/hyperdriveConfig:HyperdriveConfig", name, args == null ? HyperdriveConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HyperdriveConfig(String name, Output<String> id, @Nullable HyperdriveConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/hyperdriveConfig:HyperdriveConfig", name, state, makeResourceOptions(options, id));
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
    public static HyperdriveConfig get(String name, Output<String> id, @Nullable HyperdriveConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HyperdriveConfig(name, id, state, options);
    }
}
