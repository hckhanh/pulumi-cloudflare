// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.AccessGroupArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.AccessGroupState;
import com.pulumi.cloudflare.outputs.AccessGroupExclude;
import com.pulumi.cloudflare.outputs.AccessGroupInclude;
import com.pulumi.cloudflare.outputs.AccessGroupRequire;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Access Group resource. Access Groups are used
 * in conjunction with Access Policies to restrict access to a
 * particular resource based on group membership.
 * 
 * &gt; It&#39;s required that an `account_id` or `zone_id` is provided and in
 * most cases using either is fine. However, if you&#39;re using a scoped
 * access token, you must provide the argument that matches the token&#39;s
 * scope. For example, an access token that is scoped to the &#34;example.com&#34;
 * zone needs to use the `zone_id` argument.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.AccessGroup;
 * import com.pulumi.cloudflare.AccessGroupArgs;
 * import com.pulumi.cloudflare.inputs.AccessGroupIncludeArgs;
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
 *         var exampleAccessGroup = new AccessGroup(&#34;exampleAccessGroup&#34;, AccessGroupArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .name(&#34;staging group&#34;)
 *             .includes(AccessGroupIncludeArgs.builder()
 *                 .emails(&#34;test@example.com&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleIndex_accessGroupAccessGroup = new AccessGroup(&#34;exampleIndex/accessGroupAccessGroup&#34;, AccessGroupArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .name(&#34;staging group&#34;)
 *             .includes(AccessGroupIncludeArgs.builder()
 *                 .emails(&#34;test@example.com&#34;)
 *                 .build())
 *             .requires(AccessGroupRequireArgs.builder()
 *                 .ips(var_.office_ip())
 *                 .build())
 *             .build());
 * 
 *         var exampleCloudflareIndex_accessGroupAccessGroup = new AccessGroup(&#34;exampleCloudflareIndex/accessGroupAccessGroup&#34;, AccessGroupArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .name(&#34;test_group&#34;)
 *             .includes(AccessGroupIncludeArgs.builder()
 *                 .azures(AccessGroupIncludeAzureArgs.builder()
 *                     .identityProviderId(&#34;ca298b82-93b5-41bf-bc2d-10493f09b761&#34;)
 *                     .ids(&#34;86773093-5feb-48dd-814b-7ccd3676ff50&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/accessGroup:AccessGroup example &lt;account_id&gt;/&lt;group_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/accessGroup:AccessGroup")
public class AccessGroup extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    @Export(name="excludes", type=List.class, parameters={AccessGroupExclude.class})
    private Output</* @Nullable */ List<AccessGroupExclude>> excludes;

    public Output<Optional<List<AccessGroupExclude>>> excludes() {
        return Codegen.optional(this.excludes);
    }
    @Export(name="includes", type=List.class, parameters={AccessGroupInclude.class})
    private Output<List<AccessGroupInclude>> includes;

    public Output<List<AccessGroupInclude>> includes() {
        return this.includes;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="requires", type=List.class, parameters={AccessGroupRequire.class})
    private Output</* @Nullable */ List<AccessGroupRequire>> requires;

    public Output<Optional<List<AccessGroupRequire>>> requires() {
        return Codegen.optional(this.requires);
    }
    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessGroup(String name) {
        this(name, AccessGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessGroup(String name, AccessGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessGroup(String name, AccessGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessGroup:AccessGroup", name, args == null ? AccessGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessGroup(String name, Output<String> id, @Nullable AccessGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessGroup:AccessGroup", name, state, makeResourceOptions(options, id));
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
    public static AccessGroup get(String name, Output<String> id, @Nullable AccessGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessGroup(name, id, state, options);
    }
}
