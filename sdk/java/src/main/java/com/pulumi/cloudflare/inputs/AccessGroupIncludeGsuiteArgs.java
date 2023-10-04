// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessGroupIncludeGsuiteArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessGroupIncludeGsuiteArgs Empty = new AccessGroupIncludeGsuiteArgs();

    @Import(name="emails")
    private @Nullable Output<List<String>> emails;

    public Optional<Output<List<String>>> emails() {
        return Optional.ofNullable(this.emails);
    }

    /**
     * The ID of the Azure Identity provider.
     * 
     */
    @Import(name="identityProviderId")
    private @Nullable Output<String> identityProviderId;

    /**
     * @return The ID of the Azure Identity provider.
     * 
     */
    public Optional<Output<String>> identityProviderId() {
        return Optional.ofNullable(this.identityProviderId);
    }

    private AccessGroupIncludeGsuiteArgs() {}

    private AccessGroupIncludeGsuiteArgs(AccessGroupIncludeGsuiteArgs $) {
        this.emails = $.emails;
        this.identityProviderId = $.identityProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessGroupIncludeGsuiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessGroupIncludeGsuiteArgs $;

        public Builder() {
            $ = new AccessGroupIncludeGsuiteArgs();
        }

        public Builder(AccessGroupIncludeGsuiteArgs defaults) {
            $ = new AccessGroupIncludeGsuiteArgs(Objects.requireNonNull(defaults));
        }

        public Builder emails(@Nullable Output<List<String>> emails) {
            $.emails = emails;
            return this;
        }

        public Builder emails(List<String> emails) {
            return emails(Output.of(emails));
        }

        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }

        /**
         * @param identityProviderId The ID of the Azure Identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(@Nullable Output<String> identityProviderId) {
            $.identityProviderId = identityProviderId;
            return this;
        }

        /**
         * @param identityProviderId The ID of the Azure Identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(String identityProviderId) {
            return identityProviderId(Output.of(identityProviderId));
        }

        public AccessGroupIncludeGsuiteArgs build() {
            return $;
        }
    }

}
