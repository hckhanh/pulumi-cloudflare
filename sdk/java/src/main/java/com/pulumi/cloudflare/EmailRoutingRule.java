// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.EmailRoutingRuleArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.EmailRoutingRuleState;
import com.pulumi.cloudflare.outputs.EmailRoutingRuleAction;
import com.pulumi.cloudflare.outputs.EmailRoutingRuleMatcher;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The [Email Routing Rule](https://developers.cloudflare.com/email-routing/setup/email-routing-addresses/#email-rule-actions) resource allows you to create and manage email routing rules for a zone.
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
 * import com.pulumi.cloudflare.EmailRoutingRule;
 * import com.pulumi.cloudflare.EmailRoutingRuleArgs;
 * import com.pulumi.cloudflare.inputs.EmailRoutingRuleActionArgs;
 * import com.pulumi.cloudflare.inputs.EmailRoutingRuleMatcherArgs;
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
 *         var main = new EmailRoutingRule(&#34;main&#34;, EmailRoutingRuleArgs.builder()        
 *             .actions(EmailRoutingRuleActionArgs.builder()
 *                 .type(&#34;forward&#34;)
 *                 .values(&#34;destinationaddress@example.net&#34;)
 *                 .build())
 *             .enabled(true)
 *             .matchers(EmailRoutingRuleMatcherArgs.builder()
 *                 .field(&#34;to&#34;)
 *                 .type(&#34;literal&#34;)
 *                 .value(&#34;test@example.com&#34;)
 *                 .build())
 *             .name(&#34;terraform rule&#34;)
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
 * $ pulumi import cloudflare:index/emailRoutingRule:EmailRoutingRule example &lt;zone_id&gt;/&lt;email_routing_rule_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/emailRoutingRule:EmailRoutingRule")
public class EmailRoutingRule extends com.pulumi.resources.CustomResource {
    /**
     * Actions to take when a match is found.
     * 
     */
    @Export(name="actions", refs={List.class,EmailRoutingRuleAction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<EmailRoutingRuleAction>> actions;

    /**
     * @return Actions to take when a match is found.
     * 
     */
    public Output<Optional<List<EmailRoutingRuleAction>>> actions() {
        return Codegen.optional(this.actions);
    }
    /**
     * Whether the email routing rule is enabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether the email routing rule is enabled.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Matching patterns to forward to your actions.
     * 
     */
    @Export(name="matchers", refs={List.class,EmailRoutingRuleMatcher.class}, tree="[0,1]")
    private Output</* @Nullable */ List<EmailRoutingRuleMatcher>> matchers;

    /**
     * @return Matching patterns to forward to your actions.
     * 
     */
    public Output<Optional<List<EmailRoutingRuleMatcher>>> matchers() {
        return Codegen.optional(this.matchers);
    }
    /**
     * Routing rule name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Routing rule name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The priority of the email routing rule.
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output<Integer> priority;

    /**
     * @return The priority of the email routing rule.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * The tag of the email routing rule.
     * 
     */
    @Export(name="tag", refs={String.class}, tree="[0]")
    private Output<String> tag;

    /**
     * @return The tag of the email routing rule.
     * 
     */
    public Output<String> tag() {
        return this.tag;
    }
    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
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
    public EmailRoutingRule(String name) {
        this(name, EmailRoutingRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EmailRoutingRule(String name, EmailRoutingRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EmailRoutingRule(String name, EmailRoutingRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/emailRoutingRule:EmailRoutingRule", name, args == null ? EmailRoutingRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EmailRoutingRule(String name, Output<String> id, @Nullable EmailRoutingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/emailRoutingRule:EmailRoutingRule", name, state, makeResourceOptions(options, id));
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
    public static EmailRoutingRule get(String name, Output<String> id, @Nullable EmailRoutingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EmailRoutingRule(name, id, state, options);
    }
}
