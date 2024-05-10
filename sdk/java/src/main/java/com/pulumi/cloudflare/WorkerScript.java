// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.WorkerScriptArgs;
import com.pulumi.cloudflare.inputs.WorkerScriptState;
import com.pulumi.cloudflare.outputs.WorkerScriptAnalyticsEngineBinding;
import com.pulumi.cloudflare.outputs.WorkerScriptD1DatabaseBinding;
import com.pulumi.cloudflare.outputs.WorkerScriptKvNamespaceBinding;
import com.pulumi.cloudflare.outputs.WorkerScriptPlacement;
import com.pulumi.cloudflare.outputs.WorkerScriptPlainTextBinding;
import com.pulumi.cloudflare.outputs.WorkerScriptQueueBinding;
import com.pulumi.cloudflare.outputs.WorkerScriptR2BucketBinding;
import com.pulumi.cloudflare.outputs.WorkerScriptSecretTextBinding;
import com.pulumi.cloudflare.outputs.WorkerScriptServiceBinding;
import com.pulumi.cloudflare.outputs.WorkerScriptWebassemblyBinding;
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
 * Provides a Cloudflare worker script resource. In order for a script to be active, you&#39;ll also need to setup a `cloudflare.WorkerRoute`.
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
 * import com.pulumi.cloudflare.WorkersKvNamespace;
 * import com.pulumi.cloudflare.WorkersKvNamespaceArgs;
 * import com.pulumi.cloudflare.WorkerScript;
 * import com.pulumi.cloudflare.WorkerScriptArgs;
 * import com.pulumi.cloudflare.inputs.WorkerScriptKvNamespaceBindingArgs;
 * import com.pulumi.cloudflare.inputs.WorkerScriptPlainTextBindingArgs;
 * import com.pulumi.cloudflare.inputs.WorkerScriptSecretTextBindingArgs;
 * import com.pulumi.cloudflare.inputs.WorkerScriptWebassemblyBindingArgs;
 * import com.pulumi.cloudflare.inputs.WorkerScriptServiceBindingArgs;
 * import com.pulumi.cloudflare.inputs.WorkerScriptR2BucketBindingArgs;
 * import com.pulumi.cloudflare.inputs.WorkerScriptAnalyticsEngineBindingArgs;
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
 *         var myNamespace = new WorkersKvNamespace("myNamespace", WorkersKvNamespaceArgs.builder()        
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .title("example")
 *             .build());
 * 
 *         // Sets the script with the name "script_1"
 *         var myScript = new WorkerScript("myScript", WorkerScriptArgs.builder()        
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("script_1")
 *             .content(StdFunctions.file(FileArgs.builder()
 *                 .input("script.js")
 *                 .build()).result())
 *             .kvNamespaceBindings(WorkerScriptKvNamespaceBindingArgs.builder()
 *                 .name("MY_EXAMPLE_KV_NAMESPACE")
 *                 .namespaceId(myNamespace.id())
 *                 .build())
 *             .plainTextBindings(WorkerScriptPlainTextBindingArgs.builder()
 *                 .name("MY_EXAMPLE_PLAIN_TEXT")
 *                 .text("foobar")
 *                 .build())
 *             .secretTextBindings(WorkerScriptSecretTextBindingArgs.builder()
 *                 .name("MY_EXAMPLE_SECRET_TEXT")
 *                 .text(secretFooValue)
 *                 .build())
 *             .webassemblyBindings(WorkerScriptWebassemblyBindingArgs.builder()
 *                 .name("MY_EXAMPLE_WASM")
 *                 .module(StdFunctions.filebase64(Filebase64Args.builder()
 *                     .input("example.wasm")
 *                     .build()).result())
 *                 .build())
 *             .serviceBindings(WorkerScriptServiceBindingArgs.builder()
 *                 .name("MY_SERVICE_BINDING")
 *                 .service("MY_SERVICE")
 *                 .environment("production")
 *                 .build())
 *             .r2BucketBindings(WorkerScriptR2BucketBindingArgs.builder()
 *                 .name("MY_BUCKET")
 *                 .bucketName("MY_BUCKET_NAME")
 *                 .build())
 *             .analyticsEngineBindings(WorkerScriptAnalyticsEngineBindingArgs.builder()
 *                 .name("MY_DATASET")
 *                 .dataset("dataset1")
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
 * $ pulumi import cloudflare:index/workerScript:WorkerScript example &lt;account_id&gt;/&lt;script_name&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/workerScript:WorkerScript")
public class WorkerScript extends com.pulumi.resources.CustomResource {
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
    @Export(name="analyticsEngineBindings", refs={List.class,WorkerScriptAnalyticsEngineBinding.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WorkerScriptAnalyticsEngineBinding>> analyticsEngineBindings;

    public Output<Optional<List<WorkerScriptAnalyticsEngineBinding>>> analyticsEngineBindings() {
        return Codegen.optional(this.analyticsEngineBindings);
    }
    /**
     * The date to use for the compatibility flag.
     * 
     */
    @Export(name="compatibilityDate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> compatibilityDate;

    /**
     * @return The date to use for the compatibility flag.
     * 
     */
    public Output<Optional<String>> compatibilityDate() {
        return Codegen.optional(this.compatibilityDate);
    }
    /**
     * Compatibility flags used for Worker Scripts.
     * 
     */
    @Export(name="compatibilityFlags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> compatibilityFlags;

    /**
     * @return Compatibility flags used for Worker Scripts.
     * 
     */
    public Output<List<String>> compatibilityFlags() {
        return this.compatibilityFlags;
    }
    /**
     * The script content.
     * 
     */
    @Export(name="content", refs={String.class}, tree="[0]")
    private Output<String> content;

    /**
     * @return The script content.
     * 
     */
    public Output<String> content() {
        return this.content;
    }
    @Export(name="d1DatabaseBindings", refs={List.class,WorkerScriptD1DatabaseBinding.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WorkerScriptD1DatabaseBinding>> d1DatabaseBindings;

    public Output<Optional<List<WorkerScriptD1DatabaseBinding>>> d1DatabaseBindings() {
        return Codegen.optional(this.d1DatabaseBindings);
    }
    /**
     * Name of the Workers for Platforms dispatch namespace.
     * 
     */
    @Export(name="dispatchNamespace", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dispatchNamespace;

    /**
     * @return Name of the Workers for Platforms dispatch namespace.
     * 
     */
    public Output<Optional<String>> dispatchNamespace() {
        return Codegen.optional(this.dispatchNamespace);
    }
    @Export(name="kvNamespaceBindings", refs={List.class,WorkerScriptKvNamespaceBinding.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WorkerScriptKvNamespaceBinding>> kvNamespaceBindings;

    public Output<Optional<List<WorkerScriptKvNamespaceBinding>>> kvNamespaceBindings() {
        return Codegen.optional(this.kvNamespaceBindings);
    }
    /**
     * Enabling allows Worker events to be sent to a defined Logpush destination.
     * 
     */
    @Export(name="logpush", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> logpush;

    /**
     * @return Enabling allows Worker events to be sent to a defined Logpush destination.
     * 
     */
    public Output<Optional<Boolean>> logpush() {
        return Codegen.optional(this.logpush);
    }
    /**
     * Whether to upload Worker as a module.
     * 
     */
    @Export(name="module", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> module;

    /**
     * @return Whether to upload Worker as a module.
     * 
     */
    public Output<Optional<Boolean>> module() {
        return Codegen.optional(this.module);
    }
    /**
     * The name for the script. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the script. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="placements", refs={List.class,WorkerScriptPlacement.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WorkerScriptPlacement>> placements;

    public Output<Optional<List<WorkerScriptPlacement>>> placements() {
        return Codegen.optional(this.placements);
    }
    @Export(name="plainTextBindings", refs={List.class,WorkerScriptPlainTextBinding.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WorkerScriptPlainTextBinding>> plainTextBindings;

    public Output<Optional<List<WorkerScriptPlainTextBinding>>> plainTextBindings() {
        return Codegen.optional(this.plainTextBindings);
    }
    @Export(name="queueBindings", refs={List.class,WorkerScriptQueueBinding.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WorkerScriptQueueBinding>> queueBindings;

    public Output<Optional<List<WorkerScriptQueueBinding>>> queueBindings() {
        return Codegen.optional(this.queueBindings);
    }
    @Export(name="r2BucketBindings", refs={List.class,WorkerScriptR2BucketBinding.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WorkerScriptR2BucketBinding>> r2BucketBindings;

    public Output<Optional<List<WorkerScriptR2BucketBinding>>> r2BucketBindings() {
        return Codegen.optional(this.r2BucketBindings);
    }
    @Export(name="secretTextBindings", refs={List.class,WorkerScriptSecretTextBinding.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WorkerScriptSecretTextBinding>> secretTextBindings;

    public Output<Optional<List<WorkerScriptSecretTextBinding>>> secretTextBindings() {
        return Codegen.optional(this.secretTextBindings);
    }
    @Export(name="serviceBindings", refs={List.class,WorkerScriptServiceBinding.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WorkerScriptServiceBinding>> serviceBindings;

    public Output<Optional<List<WorkerScriptServiceBinding>>> serviceBindings() {
        return Codegen.optional(this.serviceBindings);
    }
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> tags;

    public Output<List<String>> tags() {
        return this.tags;
    }
    @Export(name="webassemblyBindings", refs={List.class,WorkerScriptWebassemblyBinding.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WorkerScriptWebassemblyBinding>> webassemblyBindings;

    public Output<Optional<List<WorkerScriptWebassemblyBinding>>> webassemblyBindings() {
        return Codegen.optional(this.webassemblyBindings);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkerScript(String name) {
        this(name, WorkerScriptArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkerScript(String name, WorkerScriptArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkerScript(String name, WorkerScriptArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workerScript:WorkerScript", name, args == null ? WorkerScriptArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkerScript(String name, Output<String> id, @Nullable WorkerScriptState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workerScript:WorkerScript", name, state, makeResourceOptions(options, id));
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
    public static WorkerScript get(String name, Output<String> id, @Nullable WorkerScriptState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkerScript(name, id, state, options);
    }
}
