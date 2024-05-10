// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.PageRuleArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.PageRuleState;
import com.pulumi.cloudflare.outputs.PageRuleActions;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare page rule resource.
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
 * import com.pulumi.cloudflare.PageRule;
 * import com.pulumi.cloudflare.PageRuleArgs;
 * import com.pulumi.cloudflare.inputs.PageRuleActionsArgs;
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
 *         // Add a page rule to the domain
 *         var foobar = new PageRule("foobar", PageRuleArgs.builder()        
 *             .zoneId(cloudflareZoneId)
 *             .target(String.format("sub.%s/page", cloudflareZone))
 *             .priority(1)
 *             .actions(PageRuleActionsArgs.builder()
 *                 .ssl("flexible")
 *                 .emailObfuscation("on")
 *                 .minifies(PageRuleActionsMinifyArgs.builder()
 *                     .html("off")
 *                     .css("on")
 *                     .js("on")
 *                     .build())
 *                 .build())
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
 * Page rules can be imported using a composite ID formed of zone ID and page rule ID, e.g.
 * 
 * ```sh
 * $ pulumi import cloudflare:index/pageRule:PageRule default d41d8cd98f00b204e9800998ecf8427e/ch8374ftwdghsif43
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/pageRule:PageRule")
public class PageRule extends com.pulumi.resources.CustomResource {
    /**
     * The actions taken by the page rule, options given below.
     * 
     */
    @Export(name="actions", refs={PageRuleActions.class}, tree="[0]")
    private Output<PageRuleActions> actions;

    /**
     * @return The actions taken by the page rule, options given below.
     * 
     */
    public Output<PageRuleActions> actions() {
        return this.actions;
    }
    /**
     * The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * Whether the page rule is active or disabled.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> status;

    /**
     * @return Whether the page rule is active or disabled.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * The URL pattern to target with the page rule.
     * 
     */
    @Export(name="target", refs={String.class}, tree="[0]")
    private Output<String> target;

    /**
     * @return The URL pattern to target with the page rule.
     * 
     */
    public Output<String> target() {
        return this.target;
    }
    /**
     * The DNS zone ID to which the page rule should be added.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The DNS zone ID to which the page rule should be added.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PageRule(String name) {
        this(name, PageRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PageRule(String name, PageRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PageRule(String name, PageRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/pageRule:PageRule", name, args == null ? PageRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PageRule(String name, Output<String> id, @Nullable PageRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/pageRule:PageRule", name, state, makeResourceOptions(options, id));
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
    public static PageRule get(String name, Output<String> id, @Nullable PageRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PageRule(name, id, state, options);
    }
}
