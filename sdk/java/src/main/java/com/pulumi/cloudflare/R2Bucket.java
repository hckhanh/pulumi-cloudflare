// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.R2BucketArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.R2BucketState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.cloudflare.R2Bucket;
 * import com.pulumi.cloudflare.R2BucketArgs;
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
 *         var example = new R2Bucket("example", R2BucketArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("terraform-bucket")
 *             .location("enam")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &gt; Available location values can be found in the [R2 documentation](https://developers.cloudflare.com/r2/reference/data-location/#available-hints).
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/r2Bucket:R2Bucket default &lt;account id&gt;/&lt;bucket name&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/r2Bucket:R2Bucket")
public class R2Bucket extends com.pulumi.resources.CustomResource {
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
     * The location hint of the R2 bucket.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location hint of the R2 bucket.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the R2 bucket.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the R2 bucket.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public R2Bucket(String name) {
        this(name, R2BucketArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public R2Bucket(String name, R2BucketArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public R2Bucket(String name, R2BucketArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/r2Bucket:R2Bucket", name, args == null ? R2BucketArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private R2Bucket(String name, Output<String> id, @Nullable R2BucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/r2Bucket:R2Bucket", name, state, makeResourceOptions(options, id));
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
    public static R2Bucket get(String name, Output<String> id, @Nullable R2BucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new R2Bucket(name, id, state, options);
    }
}
