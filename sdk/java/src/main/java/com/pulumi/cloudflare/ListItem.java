// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.ListItemArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.ListItemState;
import com.pulumi.cloudflare.outputs.ListItemHostname;
import com.pulumi.cloudflare.outputs.ListItemRedirect;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides individual list items (IPs, Redirects, ASNs, Hostnames) to be used in Edge Rules Engine
 * across all zones within the same account.
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
 * import com.pulumi.cloudflare.List;
 * import com.pulumi.cloudflare.ListArgs;
 * import com.pulumi.cloudflare.ListItem;
 * import com.pulumi.cloudflare.ListItemArgs;
 * import com.pulumi.cloudflare.inputs.ListItemRedirectArgs;
 * import com.pulumi.cloudflare.inputs.ListItemHostnameArgs;
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
 *         // IP List
 *         var exampleIpList = new List("exampleIpList", ListArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("example_list")
 *             .description("example IPs for a list")
 *             .kind("ip")
 *             .build());
 * 
 *         // IP List Item
 *         var exampleIpItem = new ListItem("exampleIpItem", ListItemArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .listId(exampleIpList.id())
 *             .comment("List Item Comment")
 *             .ip("192.0.2.0")
 *             .build());
 * 
 *         // Redirect List
 *         var exampleRedirectList = new List("exampleRedirectList", ListArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("example_list")
 *             .description("example Redirects for a list")
 *             .kind("redirect")
 *             .build());
 * 
 *         // Redirect List Item
 *         var exampleRedirectItem = new ListItem("exampleRedirectItem", ListItemArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .listId(exampleIpList.id())
 *             .redirect(ListItemRedirectArgs.builder()
 *                 .sourceUrl("https://source.tld/")
 *                 .targetUrl("https://target.tld")
 *                 .statusCode(302)
 *                 .subpathMatching(true)
 *                 .build())
 *             .build());
 * 
 *         // ASN List
 *         var exampleAsnList = new List("exampleAsnList", ListArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("example_asn_list")
 *             .description("example ASNs for a list")
 *             .kind("asn")
 *             .build());
 * 
 *         // ASN List Item
 *         var exampleAsnItem = new ListItem("exampleAsnItem", ListItemArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .listId(exampleAsnList.id())
 *             .comment("List Item Comment")
 *             .asn(6789)
 *             .build());
 * 
 *         // Hostname List
 *         var exampleHostnameList = new List("exampleHostnameList", ListArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("example_hostname_list")
 *             .description("example Hostnames for a list")
 *             .kind("hostname")
 *             .build());
 * 
 *         // Hostname List Item
 *         var exampleHostnameItem = new ListItem("exampleHostnameItem", ListItemArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .listId(exampleHostnameList.id())
 *             .comment("List Item Comment")
 *             .hostname(ListItemHostnameArgs.builder()
 *                 .urlHostname("example.com")
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
 * ```sh
 * $ pulumi import cloudflare:index/listItem:ListItem example &lt;account_id&gt;/&lt;list_id&gt;/&lt;item_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/listItem:ListItem")
public class ListItem extends com.pulumi.resources.CustomResource {
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
     * Autonomous system number to include in the list. Must provide only one of: `ip`, `asn`, `redirect`, `hostname`.
     * 
     */
    @Export(name="asn", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> asn;

    /**
     * @return Autonomous system number to include in the list. Must provide only one of: `ip`, `asn`, `redirect`, `hostname`.
     * 
     */
    public Output<Optional<Integer>> asn() {
        return Codegen.optional(this.asn);
    }
    /**
     * An optional comment for the item.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return An optional comment for the item.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Hostname to store in the list. Must provide only one of: `ip`, `asn`, `redirect`, `hostname`.
     * 
     */
    @Export(name="hostname", refs={ListItemHostname.class}, tree="[0]")
    private Output</* @Nullable */ ListItemHostname> hostname;

    /**
     * @return Hostname to store in the list. Must provide only one of: `ip`, `asn`, `redirect`, `hostname`.
     * 
     */
    public Output<Optional<ListItemHostname>> hostname() {
        return Codegen.optional(this.hostname);
    }
    /**
     * IP address to include in the list. Must provide only one of: `ip`, `asn`, `redirect`, `hostname`.
     * 
     */
    @Export(name="ip", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ip;

    /**
     * @return IP address to include in the list. Must provide only one of: `ip`, `asn`, `redirect`, `hostname`.
     * 
     */
    public Output<Optional<String>> ip() {
        return Codegen.optional(this.ip);
    }
    /**
     * The list identifier to target for the resource.
     * 
     */
    @Export(name="listId", refs={String.class}, tree="[0]")
    private Output<String> listId;

    /**
     * @return The list identifier to target for the resource.
     * 
     */
    public Output<String> listId() {
        return this.listId;
    }
    /**
     * Redirect configuration to store in the list. Must provide only one of: `ip`, `asn`, `redirect`, `hostname`.
     * 
     */
    @Export(name="redirect", refs={ListItemRedirect.class}, tree="[0]")
    private Output</* @Nullable */ ListItemRedirect> redirect;

    /**
     * @return Redirect configuration to store in the list. Must provide only one of: `ip`, `asn`, `redirect`, `hostname`.
     * 
     */
    public Output<Optional<ListItemRedirect>> redirect() {
        return Codegen.optional(this.redirect);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ListItem(String name) {
        this(name, ListItemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ListItem(String name, ListItemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ListItem(String name, ListItemArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/listItem:ListItem", name, args == null ? ListItemArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ListItem(String name, Output<String> id, @Nullable ListItemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/listItem:ListItem", name, state, makeResourceOptions(options, id));
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
    public static ListItem get(String name, Output<String> id, @Nullable ListItemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ListItem(name, id, state, options);
    }
}
