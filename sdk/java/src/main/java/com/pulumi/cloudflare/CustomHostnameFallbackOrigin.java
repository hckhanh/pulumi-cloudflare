// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.CustomHostnameFallbackOriginArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.CustomHostnameFallbackOriginState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare custom hostname fallback origin resource.
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
 * import com.pulumi.cloudflare.CustomHostnameFallbackOrigin;
 * import com.pulumi.cloudflare.CustomHostnameFallbackOriginArgs;
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
 *         var example = new CustomHostnameFallbackOrigin(&#34;example&#34;, CustomHostnameFallbackOriginArgs.builder()        
 *             .origin(&#34;fallback.example.com&#34;)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
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
 * $ pulumi import cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin example &lt;zone_id&gt;/&lt;fallback_hostname&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin")
public class CustomHostnameFallbackOrigin extends com.pulumi.resources.CustomResource {
    /**
     * Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
     * 
     */
    @Export(name="origin", refs={String.class}, tree="[0]")
    private Output<String> origin;

    /**
     * @return Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
     * 
     */
    public Output<String> origin() {
        return this.origin;
    }
    /**
     * Status of the fallback origin&#39;s activation.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the fallback origin&#39;s activation.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomHostnameFallbackOrigin(String name) {
        this(name, CustomHostnameFallbackOriginArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomHostnameFallbackOrigin(String name, CustomHostnameFallbackOriginArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomHostnameFallbackOrigin(String name, CustomHostnameFallbackOriginArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin", name, args == null ? CustomHostnameFallbackOriginArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomHostnameFallbackOrigin(String name, Output<String> id, @Nullable CustomHostnameFallbackOriginState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin", name, state, makeResourceOptions(options, id));
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
    public static CustomHostnameFallbackOrigin get(String name, Output<String> id, @Nullable CustomHostnameFallbackOriginState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomHostnameFallbackOrigin(name, id, state, options);
    }
}
