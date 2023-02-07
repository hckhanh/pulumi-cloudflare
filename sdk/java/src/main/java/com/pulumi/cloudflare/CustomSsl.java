// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.CustomSslArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.CustomSslState;
import com.pulumi.cloudflare.outputs.CustomSslCustomSslOptions;
import com.pulumi.cloudflare.outputs.CustomSslCustomSslPriority;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare custom SSL resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.CustomSsl;
 * import com.pulumi.cloudflare.CustomSslArgs;
 * import com.pulumi.cloudflare.inputs.CustomSslCustomSslOptionsArgs;
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
 *         var example = new CustomSsl(&#34;example&#34;, CustomSslArgs.builder()        
 *             .customSslOptions(CustomSslCustomSslOptionsArgs.builder()
 *                 .bundleMethod(&#34;ubiquitous&#34;)
 *                 .certificate(&#34;-----INSERT CERTIFICATE-----&#34;)
 *                 .geoRestrictions(&#34;us&#34;)
 *                 .privateKey(&#34;-----INSERT PRIVATE KEY-----&#34;)
 *                 .type(&#34;legacy_custom&#34;)
 *                 .build())
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/customSsl:CustomSsl example &lt;zone_id&gt;/&lt;certificate_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/customSsl:CustomSsl")
public class CustomSsl extends com.pulumi.resources.CustomResource {
    /**
     * The certificate associated parameters. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="customSslOptions", type=CustomSslCustomSslOptions.class, parameters={})
    private Output</* @Nullable */ CustomSslCustomSslOptions> customSslOptions;

    /**
     * @return The certificate associated parameters. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<CustomSslCustomSslOptions>> customSslOptions() {
        return Codegen.optional(this.customSslOptions);
    }
    @Export(name="customSslPriorities", type=List.class, parameters={CustomSslCustomSslPriority.class})
    private Output</* @Nullable */ List<CustomSslCustomSslPriority>> customSslPriorities;

    public Output<Optional<List<CustomSslCustomSslPriority>>> customSslPriorities() {
        return Codegen.optional(this.customSslPriorities);
    }
    @Export(name="expiresOn", type=String.class, parameters={})
    private Output<String> expiresOn;

    public Output<String> expiresOn() {
        return this.expiresOn;
    }
    @Export(name="hosts", type=List.class, parameters={String.class})
    private Output<List<String>> hosts;

    public Output<List<String>> hosts() {
        return this.hosts;
    }
    @Export(name="issuer", type=String.class, parameters={})
    private Output<String> issuer;

    public Output<String> issuer() {
        return this.issuer;
    }
    @Export(name="modifiedOn", type=String.class, parameters={})
    private Output<String> modifiedOn;

    public Output<String> modifiedOn() {
        return this.modifiedOn;
    }
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }
    @Export(name="signature", type=String.class, parameters={})
    private Output<String> signature;

    public Output<String> signature() {
        return this.signature;
    }
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }
    @Export(name="uploadedOn", type=String.class, parameters={})
    private Output<String> uploadedOn;

    public Output<String> uploadedOn() {
        return this.uploadedOn;
    }
    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomSsl(String name) {
        this(name, CustomSslArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomSsl(String name, CustomSslArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomSsl(String name, CustomSslArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/customSsl:CustomSsl", name, args == null ? CustomSslArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomSsl(String name, Output<String> id, @Nullable CustomSslState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/customSsl:CustomSsl", name, state, makeResourceOptions(options, id));
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
    public static CustomSsl get(String name, Output<String> id, @Nullable CustomSslState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomSsl(name, id, state, options);
    }
}
