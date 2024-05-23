// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.StaticRouteArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.StaticRouteState;
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
 * Provides a resource, that manages Cloudflare static routes for Magic
 * Transit or Magic WAN. Static routes are used to route traffic
 * through GRE tunnels.
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
 * import com.pulumi.cloudflare.StaticRoute;
 * import com.pulumi.cloudflare.StaticRouteArgs;
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
 *         var example = new StaticRoute("example", StaticRouteArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .description("New route for new prefix 192.0.2.0/24")
 *             .prefix("192.0.2.0/24")
 *             .nexthop("10.0.0.0")
 *             .priority(100)
 *             .weight(10)
 *             .coloNames("den01")
 *             .coloRegions("APAC")
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
 * $ pulumi import cloudflare:index/staticRoute:StaticRoute example &lt;account_id&gt;/&lt;static_route_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/staticRoute:StaticRoute")
public class StaticRoute extends com.pulumi.resources.CustomResource {
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
     * List of Cloudflare colocation regions for this static route.
     * 
     */
    @Export(name="coloNames", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> coloNames;

    /**
     * @return List of Cloudflare colocation regions for this static route.
     * 
     */
    public Output<Optional<List<String>>> coloNames() {
        return Codegen.optional(this.coloNames);
    }
    /**
     * List of Cloudflare colocation names for this static route.
     * 
     */
    @Export(name="coloRegions", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> coloRegions;

    /**
     * @return List of Cloudflare colocation names for this static route.
     * 
     */
    public Output<Optional<List<String>>> coloRegions() {
        return Codegen.optional(this.coloRegions);
    }
    /**
     * Description of the static route.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the static route.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The nexthop IP address where traffic will be routed to.
     * 
     */
    @Export(name="nexthop", refs={String.class}, tree="[0]")
    private Output<String> nexthop;

    /**
     * @return The nexthop IP address where traffic will be routed to.
     * 
     */
    public Output<String> nexthop() {
        return this.nexthop;
    }
    /**
     * Your network prefix using CIDR notation.
     * 
     */
    @Export(name="prefix", refs={String.class}, tree="[0]")
    private Output<String> prefix;

    /**
     * @return Your network prefix using CIDR notation.
     * 
     */
    public Output<String> prefix() {
        return this.prefix;
    }
    /**
     * The priority for the static route.
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output<Integer> priority;

    /**
     * @return The priority for the static route.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="weight", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> weight;

    /**
     * @return The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<Integer>> weight() {
        return Codegen.optional(this.weight);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StaticRoute(String name) {
        this(name, StaticRouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StaticRoute(String name, StaticRouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StaticRoute(String name, StaticRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/staticRoute:StaticRoute", name, args == null ? StaticRouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StaticRoute(String name, Output<String> id, @Nullable StaticRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/staticRoute:StaticRoute", name, state, makeResourceOptions(options, id));
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
    public static StaticRoute get(String name, Output<String> id, @Nullable StaticRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StaticRoute(name, id, state, options);
    }
}
