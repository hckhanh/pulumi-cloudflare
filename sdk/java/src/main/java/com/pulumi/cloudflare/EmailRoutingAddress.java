// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.EmailRoutingAddressArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.EmailRoutingAddressState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The [Email Routing Address](https://developers.cloudflare.com/email-routing/setup/email-routing-addresses/#destination-addresses) resource allows you to manage Cloudflare Email Routing Destination Addresses.
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
 * import com.pulumi.cloudflare.EmailRoutingAddress;
 * import com.pulumi.cloudflare.EmailRoutingAddressArgs;
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
 *         var example = new EmailRoutingAddress("example", EmailRoutingAddressArgs.builder()        
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .email("user{@literal @}example.com")
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
 * $ pulumi import cloudflare:index/emailRoutingAddress:EmailRoutingAddress example &lt;account_id&gt;/&lt;email_routing_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/emailRoutingAddress:EmailRoutingAddress")
public class EmailRoutingAddress extends com.pulumi.resources.CustomResource {
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
     * The date and time the destination address has been created.
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return The date and time the destination address has been created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * The contact email address of the user.
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output<String> email;

    /**
     * @return The contact email address of the user.
     * 
     */
    public Output<String> email() {
        return this.email;
    }
    /**
     * The date and time the destination address has been modified.
     * 
     */
    @Export(name="modified", refs={String.class}, tree="[0]")
    private Output<String> modified;

    /**
     * @return The date and time the destination address has been modified.
     * 
     */
    public Output<String> modified() {
        return this.modified;
    }
    /**
     * Destination address identifier.
     * 
     */
    @Export(name="tag", refs={String.class}, tree="[0]")
    private Output<String> tag;

    /**
     * @return Destination address identifier.
     * 
     */
    public Output<String> tag() {
        return this.tag;
    }
    /**
     * The date and time the destination address has been verified. Null means not verified yet.
     * 
     */
    @Export(name="verified", refs={String.class}, tree="[0]")
    private Output<String> verified;

    /**
     * @return The date and time the destination address has been verified. Null means not verified yet.
     * 
     */
    public Output<String> verified() {
        return this.verified;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EmailRoutingAddress(String name) {
        this(name, EmailRoutingAddressArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EmailRoutingAddress(String name, EmailRoutingAddressArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EmailRoutingAddress(String name, EmailRoutingAddressArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/emailRoutingAddress:EmailRoutingAddress", name, args == null ? EmailRoutingAddressArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EmailRoutingAddress(String name, Output<String> id, @Nullable EmailRoutingAddressState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/emailRoutingAddress:EmailRoutingAddress", name, state, makeResourceOptions(options, id));
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
    public static EmailRoutingAddress get(String name, Output<String> id, @Nullable EmailRoutingAddressState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EmailRoutingAddress(name, id, state, options);
    }
}
