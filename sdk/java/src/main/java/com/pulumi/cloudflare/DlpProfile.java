// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.DlpProfileArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.DlpProfileState;
import com.pulumi.cloudflare.outputs.DlpProfileContextAwareness;
import com.pulumi.cloudflare.outputs.DlpProfileEntry;
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
 * Provides a Cloudflare DLP Profile resource. Data Loss Prevention profiles
 * are a set of entries that can be matched in HTTP bodies or files.
 * They are referenced in Zero Trust Gateway rules.
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
 * import com.pulumi.cloudflare.DlpProfile;
 * import com.pulumi.cloudflare.DlpProfileArgs;
 * import com.pulumi.cloudflare.inputs.DlpProfileEntryArgs;
 * import com.pulumi.cloudflare.inputs.DlpProfileEntryPatternArgs;
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
 *         // Predefined profile must be imported, cannot be created
 *         var creds = new DlpProfile("creds", DlpProfileArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("Credentials and Secrets")
 *             .type("predefined")
 *             .allowedMatchCount(3)
 *             .entries(            
 *                 DlpProfileEntryArgs.builder()
 *                     .enabled(true)
 *                     .name("Amazon AWS Access Key ID")
 *                     .id("d8fcfc9c-773c-405e-8426-21ecbb67ba93")
 *                     .build(),
 *                 DlpProfileEntryArgs.builder()
 *                     .enabled(false)
 *                     .id("2c0e33e1-71da-40c8-aad3-32e674ad3d96")
 *                     .name("Amazon AWS Secret Access Key")
 *                     .build(),
 *                 DlpProfileEntryArgs.builder()
 *                     .enabled(true)
 *                     .id("4e92c006-3802-4dff-bbe1-8e1513b1c92a")
 *                     .name("Microsoft Azure Client Secret")
 *                     .build(),
 *                 DlpProfileEntryArgs.builder()
 *                     .enabled(false)
 *                     .id("5c713294-2375-4904-abcf-e4a15be4d592")
 *                     .name("SSH Private Key")
 *                     .build(),
 *                 DlpProfileEntryArgs.builder()
 *                     .enabled(true)
 *                     .id("6c6579e4-d832-42d5-905c-8e53340930f2")
 *                     .name("Google GCP API Key")
 *                     .build())
 *             .build());
 * 
 *         // Custom profile
 *         var exampleCustom = new DlpProfile("exampleCustom", DlpProfileArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("Example Custom Profile")
 *             .description("A profile with example entries")
 *             .type("custom")
 *             .allowedMatchCount(0)
 *             .entries(            
 *                 DlpProfileEntryArgs.builder()
 *                     .name("Matches visa credit cards")
 *                     .enabled(true)
 *                     .pattern(DlpProfileEntryPatternArgs.builder()
 *                         .regex("4\\d{3}([-\\. ])?\\d{4}([-\\. ])?\\d{4}([-\\. ])?\\d{4}")
 *                         .validation("luhn")
 *                         .build())
 *                     .build(),
 *                 DlpProfileEntryArgs.builder()
 *                     .name("Matches diners club card")
 *                     .enabled(true)
 *                     .pattern(DlpProfileEntryPatternArgs.builder()
 *                         .regex("(?:0[0-5]|[68][0-9])[0-9]{11}")
 *                         .validation("luhn")
 *                         .build())
 *                     .build())
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
 * $ pulumi import cloudflare:index/dlpProfile:DlpProfile example &lt;account_id&gt;/&lt;dlp_profile_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/dlpProfile:DlpProfile")
public class DlpProfile extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Related DLP policies will trigger when the match count exceeds the number set.
     * 
     */
    @Export(name="allowedMatchCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> allowedMatchCount;

    /**
     * @return Related DLP policies will trigger when the match count exceeds the number set.
     * 
     */
    public Output<Integer> allowedMatchCount() {
        return this.allowedMatchCount;
    }
    /**
     * Scan the context of predefined entries to only return matches surrounded by keywords.
     * 
     */
    @Export(name="contextAwareness", refs={DlpProfileContextAwareness.class}, tree="[0]")
    private Output<DlpProfileContextAwareness> contextAwareness;

    /**
     * @return Scan the context of predefined entries to only return matches surrounded by keywords.
     * 
     */
    public Output<DlpProfileContextAwareness> contextAwareness() {
        return this.contextAwareness;
    }
    /**
     * Brief summary of the profile and its intended use.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Brief summary of the profile and its intended use.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * List of entries to apply to the profile.
     * 
     */
    @Export(name="entries", refs={List.class,DlpProfileEntry.class}, tree="[0,1]")
    private Output<List<DlpProfileEntry>> entries;

    /**
     * @return List of entries to apply to the profile.
     * 
     */
    public Output<List<DlpProfileEntry>> entries() {
        return this.entries;
    }
    /**
     * Name of the profile. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the profile. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * If true, scan images via OCR to determine if any text present matches filters.
     * 
     */
    @Export(name="ocrEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ocrEnabled;

    /**
     * @return If true, scan images via OCR to determine if any text present matches filters.
     * 
     */
    public Output<Optional<Boolean>> ocrEnabled() {
        return Codegen.optional(this.ocrEnabled);
    }
    /**
     * The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DlpProfile(String name) {
        this(name, DlpProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DlpProfile(String name, DlpProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DlpProfile(String name, DlpProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/dlpProfile:DlpProfile", name, args == null ? DlpProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DlpProfile(String name, Output<String> id, @Nullable DlpProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/dlpProfile:DlpProfile", name, state, makeResourceOptions(options, id));
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
    public static DlpProfile get(String name, Output<String> id, @Nullable DlpProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DlpProfile(name, id, state, options);
    }
}
