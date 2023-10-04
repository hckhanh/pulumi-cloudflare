// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.CustomHostnameSslSettingArgs;
import com.pulumi.cloudflare.inputs.CustomHostnameSslValidationErrorArgs;
import com.pulumi.cloudflare.inputs.CustomHostnameSslValidationRecordArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomHostnameSslArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomHostnameSslArgs Empty = new CustomHostnameSslArgs();

    /**
     * A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Available values: `ubiquitous`, `optimal`, `force`.
     * 
     */
    @Import(name="bundleMethod")
    private @Nullable Output<String> bundleMethod;

    /**
     * @return A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Available values: `ubiquitous`, `optimal`, `force`.
     * 
     */
    public Optional<Output<String>> bundleMethod() {
        return Optional.ofNullable(this.bundleMethod);
    }

    @Import(name="certificateAuthority")
    private @Nullable Output<String> certificateAuthority;

    public Optional<Output<String>> certificateAuthority() {
        return Optional.ofNullable(this.certificateAuthority);
    }

    /**
     * If a custom uploaded certificate is used.
     * 
     */
    @Import(name="customCertificate")
    private @Nullable Output<String> customCertificate;

    /**
     * @return If a custom uploaded certificate is used.
     * 
     */
    public Optional<Output<String>> customCertificate() {
        return Optional.ofNullable(this.customCertificate);
    }

    /**
     * The key for a custom uploaded certificate.
     * 
     */
    @Import(name="customKey")
    private @Nullable Output<String> customKey;

    /**
     * @return The key for a custom uploaded certificate.
     * 
     */
    public Optional<Output<String>> customKey() {
        return Optional.ofNullable(this.customKey);
    }

    /**
     * Domain control validation (DCV) method used for this hostname. Available values: `http`, `txt`, `email`.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return Domain control validation (DCV) method used for this hostname. Available values: `http`, `txt`, `email`.
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * SSL/TLS settings for the certificate.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<List<CustomHostnameSslSettingArgs>> settings;

    /**
     * @return SSL/TLS settings for the certificate.
     * 
     */
    public Optional<Output<List<CustomHostnameSslSettingArgs>>> settings() {
        return Optional.ofNullable(this.settings);
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Level of validation to be used for this hostname. Available values: `dv`. Defaults to `dv`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Level of validation to be used for this hostname. Available values: `dv`. Defaults to `dv`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="validationErrors")
    private @Nullable Output<List<CustomHostnameSslValidationErrorArgs>> validationErrors;

    public Optional<Output<List<CustomHostnameSslValidationErrorArgs>>> validationErrors() {
        return Optional.ofNullable(this.validationErrors);
    }

    @Import(name="validationRecords")
    private @Nullable Output<List<CustomHostnameSslValidationRecordArgs>> validationRecords;

    public Optional<Output<List<CustomHostnameSslValidationRecordArgs>>> validationRecords() {
        return Optional.ofNullable(this.validationRecords);
    }

    /**
     * Indicates whether the certificate covers a wildcard.
     * 
     */
    @Import(name="wildcard")
    private @Nullable Output<Boolean> wildcard;

    /**
     * @return Indicates whether the certificate covers a wildcard.
     * 
     */
    public Optional<Output<Boolean>> wildcard() {
        return Optional.ofNullable(this.wildcard);
    }

    private CustomHostnameSslArgs() {}

    private CustomHostnameSslArgs(CustomHostnameSslArgs $) {
        this.bundleMethod = $.bundleMethod;
        this.certificateAuthority = $.certificateAuthority;
        this.customCertificate = $.customCertificate;
        this.customKey = $.customKey;
        this.method = $.method;
        this.settings = $.settings;
        this.status = $.status;
        this.type = $.type;
        this.validationErrors = $.validationErrors;
        this.validationRecords = $.validationRecords;
        this.wildcard = $.wildcard;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomHostnameSslArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomHostnameSslArgs $;

        public Builder() {
            $ = new CustomHostnameSslArgs();
        }

        public Builder(CustomHostnameSslArgs defaults) {
            $ = new CustomHostnameSslArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bundleMethod A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Available values: `ubiquitous`, `optimal`, `force`.
         * 
         * @return builder
         * 
         */
        public Builder bundleMethod(@Nullable Output<String> bundleMethod) {
            $.bundleMethod = bundleMethod;
            return this;
        }

        /**
         * @param bundleMethod A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Available values: `ubiquitous`, `optimal`, `force`.
         * 
         * @return builder
         * 
         */
        public Builder bundleMethod(String bundleMethod) {
            return bundleMethod(Output.of(bundleMethod));
        }

        public Builder certificateAuthority(@Nullable Output<String> certificateAuthority) {
            $.certificateAuthority = certificateAuthority;
            return this;
        }

        public Builder certificateAuthority(String certificateAuthority) {
            return certificateAuthority(Output.of(certificateAuthority));
        }

        /**
         * @param customCertificate If a custom uploaded certificate is used.
         * 
         * @return builder
         * 
         */
        public Builder customCertificate(@Nullable Output<String> customCertificate) {
            $.customCertificate = customCertificate;
            return this;
        }

        /**
         * @param customCertificate If a custom uploaded certificate is used.
         * 
         * @return builder
         * 
         */
        public Builder customCertificate(String customCertificate) {
            return customCertificate(Output.of(customCertificate));
        }

        /**
         * @param customKey The key for a custom uploaded certificate.
         * 
         * @return builder
         * 
         */
        public Builder customKey(@Nullable Output<String> customKey) {
            $.customKey = customKey;
            return this;
        }

        /**
         * @param customKey The key for a custom uploaded certificate.
         * 
         * @return builder
         * 
         */
        public Builder customKey(String customKey) {
            return customKey(Output.of(customKey));
        }

        /**
         * @param method Domain control validation (DCV) method used for this hostname. Available values: `http`, `txt`, `email`.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method Domain control validation (DCV) method used for this hostname. Available values: `http`, `txt`, `email`.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param settings SSL/TLS settings for the certificate.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<List<CustomHostnameSslSettingArgs>> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings SSL/TLS settings for the certificate.
         * 
         * @return builder
         * 
         */
        public Builder settings(List<CustomHostnameSslSettingArgs> settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param settings SSL/TLS settings for the certificate.
         * 
         * @return builder
         * 
         */
        public Builder settings(CustomHostnameSslSettingArgs... settings) {
            return settings(List.of(settings));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type Level of validation to be used for this hostname. Available values: `dv`. Defaults to `dv`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Level of validation to be used for this hostname. Available values: `dv`. Defaults to `dv`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder validationErrors(@Nullable Output<List<CustomHostnameSslValidationErrorArgs>> validationErrors) {
            $.validationErrors = validationErrors;
            return this;
        }

        public Builder validationErrors(List<CustomHostnameSslValidationErrorArgs> validationErrors) {
            return validationErrors(Output.of(validationErrors));
        }

        public Builder validationErrors(CustomHostnameSslValidationErrorArgs... validationErrors) {
            return validationErrors(List.of(validationErrors));
        }

        public Builder validationRecords(@Nullable Output<List<CustomHostnameSslValidationRecordArgs>> validationRecords) {
            $.validationRecords = validationRecords;
            return this;
        }

        public Builder validationRecords(List<CustomHostnameSslValidationRecordArgs> validationRecords) {
            return validationRecords(Output.of(validationRecords));
        }

        public Builder validationRecords(CustomHostnameSslValidationRecordArgs... validationRecords) {
            return validationRecords(List.of(validationRecords));
        }

        /**
         * @param wildcard Indicates whether the certificate covers a wildcard.
         * 
         * @return builder
         * 
         */
        public Builder wildcard(@Nullable Output<Boolean> wildcard) {
            $.wildcard = wildcard;
            return this;
        }

        /**
         * @param wildcard Indicates whether the certificate covers a wildcard.
         * 
         * @return builder
         * 
         */
        public Builder wildcard(Boolean wildcard) {
            return wildcard(Output.of(wildcard));
        }

        public CustomHostnameSslArgs build() {
            return $;
        }
    }

}
