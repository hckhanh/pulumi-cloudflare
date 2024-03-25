// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.WorkerScriptAnalyticsEngineBindingArgs;
import com.pulumi.cloudflare.inputs.WorkerScriptD1DatabaseBindingArgs;
import com.pulumi.cloudflare.inputs.WorkerScriptKvNamespaceBindingArgs;
import com.pulumi.cloudflare.inputs.WorkerScriptPlacementArgs;
import com.pulumi.cloudflare.inputs.WorkerScriptPlainTextBindingArgs;
import com.pulumi.cloudflare.inputs.WorkerScriptQueueBindingArgs;
import com.pulumi.cloudflare.inputs.WorkerScriptR2BucketBindingArgs;
import com.pulumi.cloudflare.inputs.WorkerScriptSecretTextBindingArgs;
import com.pulumi.cloudflare.inputs.WorkerScriptServiceBindingArgs;
import com.pulumi.cloudflare.inputs.WorkerScriptWebassemblyBindingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkerScriptState extends com.pulumi.resources.ResourceArgs {

    public static final WorkerScriptState Empty = new WorkerScriptState();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    @Import(name="analyticsEngineBindings")
    private @Nullable Output<List<WorkerScriptAnalyticsEngineBindingArgs>> analyticsEngineBindings;

    public Optional<Output<List<WorkerScriptAnalyticsEngineBindingArgs>>> analyticsEngineBindings() {
        return Optional.ofNullable(this.analyticsEngineBindings);
    }

    /**
     * The date to use for the compatibility flag.
     * 
     */
    @Import(name="compatibilityDate")
    private @Nullable Output<String> compatibilityDate;

    /**
     * @return The date to use for the compatibility flag.
     * 
     */
    public Optional<Output<String>> compatibilityDate() {
        return Optional.ofNullable(this.compatibilityDate);
    }

    /**
     * Compatibility flags used for Worker Scripts.
     * 
     */
    @Import(name="compatibilityFlags")
    private @Nullable Output<List<String>> compatibilityFlags;

    /**
     * @return Compatibility flags used for Worker Scripts.
     * 
     */
    public Optional<Output<List<String>>> compatibilityFlags() {
        return Optional.ofNullable(this.compatibilityFlags);
    }

    /**
     * The script content.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The script content.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    @Import(name="d1DatabaseBindings")
    private @Nullable Output<List<WorkerScriptD1DatabaseBindingArgs>> d1DatabaseBindings;

    public Optional<Output<List<WorkerScriptD1DatabaseBindingArgs>>> d1DatabaseBindings() {
        return Optional.ofNullable(this.d1DatabaseBindings);
    }

    /**
     * Name of the Workers for Platforms dispatch namespace.
     * 
     */
    @Import(name="dispatchNamespace")
    private @Nullable Output<String> dispatchNamespace;

    /**
     * @return Name of the Workers for Platforms dispatch namespace.
     * 
     */
    public Optional<Output<String>> dispatchNamespace() {
        return Optional.ofNullable(this.dispatchNamespace);
    }

    @Import(name="kvNamespaceBindings")
    private @Nullable Output<List<WorkerScriptKvNamespaceBindingArgs>> kvNamespaceBindings;

    public Optional<Output<List<WorkerScriptKvNamespaceBindingArgs>>> kvNamespaceBindings() {
        return Optional.ofNullable(this.kvNamespaceBindings);
    }

    /**
     * Enabling allows Worker events to be sent to a defined Logpush destination.
     * 
     */
    @Import(name="logpush")
    private @Nullable Output<Boolean> logpush;

    /**
     * @return Enabling allows Worker events to be sent to a defined Logpush destination.
     * 
     */
    public Optional<Output<Boolean>> logpush() {
        return Optional.ofNullable(this.logpush);
    }

    /**
     * The base64 encoded wasm module you want to store.
     * 
     */
    @Import(name="module")
    private @Nullable Output<Boolean> module;

    /**
     * @return The base64 encoded wasm module you want to store.
     * 
     */
    public Optional<Output<Boolean>> module() {
        return Optional.ofNullable(this.module);
    }

    /**
     * The global variable for the binding in your Worker code.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="placements")
    private @Nullable Output<List<WorkerScriptPlacementArgs>> placements;

    public Optional<Output<List<WorkerScriptPlacementArgs>>> placements() {
        return Optional.ofNullable(this.placements);
    }

    @Import(name="plainTextBindings")
    private @Nullable Output<List<WorkerScriptPlainTextBindingArgs>> plainTextBindings;

    public Optional<Output<List<WorkerScriptPlainTextBindingArgs>>> plainTextBindings() {
        return Optional.ofNullable(this.plainTextBindings);
    }

    @Import(name="queueBindings")
    private @Nullable Output<List<WorkerScriptQueueBindingArgs>> queueBindings;

    public Optional<Output<List<WorkerScriptQueueBindingArgs>>> queueBindings() {
        return Optional.ofNullable(this.queueBindings);
    }

    @Import(name="r2BucketBindings")
    private @Nullable Output<List<WorkerScriptR2BucketBindingArgs>> r2BucketBindings;

    public Optional<Output<List<WorkerScriptR2BucketBindingArgs>>> r2BucketBindings() {
        return Optional.ofNullable(this.r2BucketBindings);
    }

    @Import(name="secretTextBindings")
    private @Nullable Output<List<WorkerScriptSecretTextBindingArgs>> secretTextBindings;

    public Optional<Output<List<WorkerScriptSecretTextBindingArgs>>> secretTextBindings() {
        return Optional.ofNullable(this.secretTextBindings);
    }

    @Import(name="serviceBindings")
    private @Nullable Output<List<WorkerScriptServiceBindingArgs>> serviceBindings;

    public Optional<Output<List<WorkerScriptServiceBindingArgs>>> serviceBindings() {
        return Optional.ofNullable(this.serviceBindings);
    }

    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="webassemblyBindings")
    private @Nullable Output<List<WorkerScriptWebassemblyBindingArgs>> webassemblyBindings;

    public Optional<Output<List<WorkerScriptWebassemblyBindingArgs>>> webassemblyBindings() {
        return Optional.ofNullable(this.webassemblyBindings);
    }

    private WorkerScriptState() {}

    private WorkerScriptState(WorkerScriptState $) {
        this.accountId = $.accountId;
        this.analyticsEngineBindings = $.analyticsEngineBindings;
        this.compatibilityDate = $.compatibilityDate;
        this.compatibilityFlags = $.compatibilityFlags;
        this.content = $.content;
        this.d1DatabaseBindings = $.d1DatabaseBindings;
        this.dispatchNamespace = $.dispatchNamespace;
        this.kvNamespaceBindings = $.kvNamespaceBindings;
        this.logpush = $.logpush;
        this.module = $.module;
        this.name = $.name;
        this.placements = $.placements;
        this.plainTextBindings = $.plainTextBindings;
        this.queueBindings = $.queueBindings;
        this.r2BucketBindings = $.r2BucketBindings;
        this.secretTextBindings = $.secretTextBindings;
        this.serviceBindings = $.serviceBindings;
        this.tags = $.tags;
        this.webassemblyBindings = $.webassemblyBindings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerScriptState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerScriptState $;

        public Builder() {
            $ = new WorkerScriptState();
        }

        public Builder(WorkerScriptState defaults) {
            $ = new WorkerScriptState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder analyticsEngineBindings(@Nullable Output<List<WorkerScriptAnalyticsEngineBindingArgs>> analyticsEngineBindings) {
            $.analyticsEngineBindings = analyticsEngineBindings;
            return this;
        }

        public Builder analyticsEngineBindings(List<WorkerScriptAnalyticsEngineBindingArgs> analyticsEngineBindings) {
            return analyticsEngineBindings(Output.of(analyticsEngineBindings));
        }

        public Builder analyticsEngineBindings(WorkerScriptAnalyticsEngineBindingArgs... analyticsEngineBindings) {
            return analyticsEngineBindings(List.of(analyticsEngineBindings));
        }

        /**
         * @param compatibilityDate The date to use for the compatibility flag.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityDate(@Nullable Output<String> compatibilityDate) {
            $.compatibilityDate = compatibilityDate;
            return this;
        }

        /**
         * @param compatibilityDate The date to use for the compatibility flag.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityDate(String compatibilityDate) {
            return compatibilityDate(Output.of(compatibilityDate));
        }

        /**
         * @param compatibilityFlags Compatibility flags used for Worker Scripts.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityFlags(@Nullable Output<List<String>> compatibilityFlags) {
            $.compatibilityFlags = compatibilityFlags;
            return this;
        }

        /**
         * @param compatibilityFlags Compatibility flags used for Worker Scripts.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityFlags(List<String> compatibilityFlags) {
            return compatibilityFlags(Output.of(compatibilityFlags));
        }

        /**
         * @param compatibilityFlags Compatibility flags used for Worker Scripts.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityFlags(String... compatibilityFlags) {
            return compatibilityFlags(List.of(compatibilityFlags));
        }

        /**
         * @param content The script content.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The script content.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        public Builder d1DatabaseBindings(@Nullable Output<List<WorkerScriptD1DatabaseBindingArgs>> d1DatabaseBindings) {
            $.d1DatabaseBindings = d1DatabaseBindings;
            return this;
        }

        public Builder d1DatabaseBindings(List<WorkerScriptD1DatabaseBindingArgs> d1DatabaseBindings) {
            return d1DatabaseBindings(Output.of(d1DatabaseBindings));
        }

        public Builder d1DatabaseBindings(WorkerScriptD1DatabaseBindingArgs... d1DatabaseBindings) {
            return d1DatabaseBindings(List.of(d1DatabaseBindings));
        }

        /**
         * @param dispatchNamespace Name of the Workers for Platforms dispatch namespace.
         * 
         * @return builder
         * 
         */
        public Builder dispatchNamespace(@Nullable Output<String> dispatchNamespace) {
            $.dispatchNamespace = dispatchNamespace;
            return this;
        }

        /**
         * @param dispatchNamespace Name of the Workers for Platforms dispatch namespace.
         * 
         * @return builder
         * 
         */
        public Builder dispatchNamespace(String dispatchNamespace) {
            return dispatchNamespace(Output.of(dispatchNamespace));
        }

        public Builder kvNamespaceBindings(@Nullable Output<List<WorkerScriptKvNamespaceBindingArgs>> kvNamespaceBindings) {
            $.kvNamespaceBindings = kvNamespaceBindings;
            return this;
        }

        public Builder kvNamespaceBindings(List<WorkerScriptKvNamespaceBindingArgs> kvNamespaceBindings) {
            return kvNamespaceBindings(Output.of(kvNamespaceBindings));
        }

        public Builder kvNamespaceBindings(WorkerScriptKvNamespaceBindingArgs... kvNamespaceBindings) {
            return kvNamespaceBindings(List.of(kvNamespaceBindings));
        }

        /**
         * @param logpush Enabling allows Worker events to be sent to a defined Logpush destination.
         * 
         * @return builder
         * 
         */
        public Builder logpush(@Nullable Output<Boolean> logpush) {
            $.logpush = logpush;
            return this;
        }

        /**
         * @param logpush Enabling allows Worker events to be sent to a defined Logpush destination.
         * 
         * @return builder
         * 
         */
        public Builder logpush(Boolean logpush) {
            return logpush(Output.of(logpush));
        }

        /**
         * @param module The base64 encoded wasm module you want to store.
         * 
         * @return builder
         * 
         */
        public Builder module(@Nullable Output<Boolean> module) {
            $.module = module;
            return this;
        }

        /**
         * @param module The base64 encoded wasm module you want to store.
         * 
         * @return builder
         * 
         */
        public Builder module(Boolean module) {
            return module(Output.of(module));
        }

        /**
         * @param name The global variable for the binding in your Worker code.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The global variable for the binding in your Worker code.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder placements(@Nullable Output<List<WorkerScriptPlacementArgs>> placements) {
            $.placements = placements;
            return this;
        }

        public Builder placements(List<WorkerScriptPlacementArgs> placements) {
            return placements(Output.of(placements));
        }

        public Builder placements(WorkerScriptPlacementArgs... placements) {
            return placements(List.of(placements));
        }

        public Builder plainTextBindings(@Nullable Output<List<WorkerScriptPlainTextBindingArgs>> plainTextBindings) {
            $.plainTextBindings = plainTextBindings;
            return this;
        }

        public Builder plainTextBindings(List<WorkerScriptPlainTextBindingArgs> plainTextBindings) {
            return plainTextBindings(Output.of(plainTextBindings));
        }

        public Builder plainTextBindings(WorkerScriptPlainTextBindingArgs... plainTextBindings) {
            return plainTextBindings(List.of(plainTextBindings));
        }

        public Builder queueBindings(@Nullable Output<List<WorkerScriptQueueBindingArgs>> queueBindings) {
            $.queueBindings = queueBindings;
            return this;
        }

        public Builder queueBindings(List<WorkerScriptQueueBindingArgs> queueBindings) {
            return queueBindings(Output.of(queueBindings));
        }

        public Builder queueBindings(WorkerScriptQueueBindingArgs... queueBindings) {
            return queueBindings(List.of(queueBindings));
        }

        public Builder r2BucketBindings(@Nullable Output<List<WorkerScriptR2BucketBindingArgs>> r2BucketBindings) {
            $.r2BucketBindings = r2BucketBindings;
            return this;
        }

        public Builder r2BucketBindings(List<WorkerScriptR2BucketBindingArgs> r2BucketBindings) {
            return r2BucketBindings(Output.of(r2BucketBindings));
        }

        public Builder r2BucketBindings(WorkerScriptR2BucketBindingArgs... r2BucketBindings) {
            return r2BucketBindings(List.of(r2BucketBindings));
        }

        public Builder secretTextBindings(@Nullable Output<List<WorkerScriptSecretTextBindingArgs>> secretTextBindings) {
            $.secretTextBindings = secretTextBindings;
            return this;
        }

        public Builder secretTextBindings(List<WorkerScriptSecretTextBindingArgs> secretTextBindings) {
            return secretTextBindings(Output.of(secretTextBindings));
        }

        public Builder secretTextBindings(WorkerScriptSecretTextBindingArgs... secretTextBindings) {
            return secretTextBindings(List.of(secretTextBindings));
        }

        public Builder serviceBindings(@Nullable Output<List<WorkerScriptServiceBindingArgs>> serviceBindings) {
            $.serviceBindings = serviceBindings;
            return this;
        }

        public Builder serviceBindings(List<WorkerScriptServiceBindingArgs> serviceBindings) {
            return serviceBindings(Output.of(serviceBindings));
        }

        public Builder serviceBindings(WorkerScriptServiceBindingArgs... serviceBindings) {
            return serviceBindings(List.of(serviceBindings));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder webassemblyBindings(@Nullable Output<List<WorkerScriptWebassemblyBindingArgs>> webassemblyBindings) {
            $.webassemblyBindings = webassemblyBindings;
            return this;
        }

        public Builder webassemblyBindings(List<WorkerScriptWebassemblyBindingArgs> webassemblyBindings) {
            return webassemblyBindings(Output.of(webassemblyBindings));
        }

        public Builder webassemblyBindings(WorkerScriptWebassemblyBindingArgs... webassemblyBindings) {
            return webassemblyBindings(List.of(webassemblyBindings));
        }

        public WorkerScriptState build() {
            return $;
        }
    }

}
