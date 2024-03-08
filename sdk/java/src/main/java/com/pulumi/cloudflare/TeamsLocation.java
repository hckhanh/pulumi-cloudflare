// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.TeamsLocationArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.TeamsLocationState;
import com.pulumi.cloudflare.outputs.TeamsLocationNetwork;
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
 * Provides a Cloudflare Teams Location resource. Teams Locations are
 * referenced when creating secure web gateway policies.
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
 * import com.pulumi.cloudflare.TeamsLocation;
 * import com.pulumi.cloudflare.TeamsLocationArgs;
 * import com.pulumi.cloudflare.inputs.TeamsLocationNetworkArgs;
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
 *         var example = new TeamsLocation(&#34;example&#34;, TeamsLocationArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .clientDefault(true)
 *             .name(&#34;office&#34;)
 *             .networks(            
 *                 TeamsLocationNetworkArgs.builder()
 *                     .network(&#34;203.0.113.1/32&#34;)
 *                     .build(),
 *                 TeamsLocationNetworkArgs.builder()
 *                     .network(&#34;203.0.113.2/32&#34;)
 *                     .build())
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
 * $ pulumi import cloudflare:index/teamsLocation:TeamsLocation example &lt;account_id&gt;/&lt;teams_location_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/teamsLocation:TeamsLocation")
public class TeamsLocation extends com.pulumi.resources.CustomResource {
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
     * Indicator that anonymized logs are enabled.
     * 
     */
    @Export(name="anonymizedLogsEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> anonymizedLogsEnabled;

    /**
     * @return Indicator that anonymized logs are enabled.
     * 
     */
    public Output<Boolean> anonymizedLogsEnabled() {
        return this.anonymizedLogsEnabled;
    }
    /**
     * Indicator that this is the default location.
     * 
     */
    @Export(name="clientDefault", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> clientDefault;

    /**
     * @return Indicator that this is the default location.
     * 
     */
    public Output<Optional<Boolean>> clientDefault() {
        return Codegen.optional(this.clientDefault);
    }
    /**
     * The FQDN that DoH clients should be pointed at.
     * 
     */
    @Export(name="dohSubdomain", refs={String.class}, tree="[0]")
    private Output<String> dohSubdomain;

    /**
     * @return The FQDN that DoH clients should be pointed at.
     * 
     */
    public Output<String> dohSubdomain() {
        return this.dohSubdomain;
    }
    /**
     * Client IP address.
     * 
     */
    @Export(name="ip", refs={String.class}, tree="[0]")
    private Output<String> ip;

    /**
     * @return Client IP address.
     * 
     */
    public Output<String> ip() {
        return this.ip;
    }
    /**
     * IP to direct all IPv4 DNS queries to.
     * 
     */
    @Export(name="ipv4Destination", refs={String.class}, tree="[0]")
    private Output<String> ipv4Destination;

    /**
     * @return IP to direct all IPv4 DNS queries to.
     * 
     */
    public Output<String> ipv4Destination() {
        return this.ipv4Destination;
    }
    /**
     * Name of the teams location.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the teams location.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The networks CIDRs that comprise the location.
     * 
     */
    @Export(name="networks", refs={List.class,TeamsLocationNetwork.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TeamsLocationNetwork>> networks;

    /**
     * @return The networks CIDRs that comprise the location.
     * 
     */
    public Output<Optional<List<TeamsLocationNetwork>>> networks() {
        return Codegen.optional(this.networks);
    }
    @Export(name="policyIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> policyIds;

    public Output<List<String>> policyIds() {
        return this.policyIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TeamsLocation(String name) {
        this(name, TeamsLocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TeamsLocation(String name, TeamsLocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TeamsLocation(String name, TeamsLocationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/teamsLocation:TeamsLocation", name, args == null ? TeamsLocationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TeamsLocation(String name, Output<String> id, @Nullable TeamsLocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/teamsLocation:TeamsLocation", name, state, makeResourceOptions(options, id));
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
    public static TeamsLocation get(String name, Output<String> id, @Nullable TeamsLocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TeamsLocation(name, id, state, options);
    }
}
