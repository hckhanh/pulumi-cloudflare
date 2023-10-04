// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPolicyIncludeSamlArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPolicyIncludeSamlArgs Empty = new AccessPolicyIncludeSamlArgs();

    @Import(name="attributeName")
    private @Nullable Output<String> attributeName;

    public Optional<Output<String>> attributeName() {
        return Optional.ofNullable(this.attributeName);
    }

    @Import(name="attributeValue")
    private @Nullable Output<String> attributeValue;

    public Optional<Output<String>> attributeValue() {
        return Optional.ofNullable(this.attributeValue);
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

    private AccessPolicyIncludeSamlArgs() {}

    private AccessPolicyIncludeSamlArgs(AccessPolicyIncludeSamlArgs $) {
        this.attributeName = $.attributeName;
        this.attributeValue = $.attributeValue;
        this.identityProviderId = $.identityProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPolicyIncludeSamlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyIncludeSamlArgs $;

        public Builder() {
            $ = new AccessPolicyIncludeSamlArgs();
        }

        public Builder(AccessPolicyIncludeSamlArgs defaults) {
            $ = new AccessPolicyIncludeSamlArgs(Objects.requireNonNull(defaults));
        }

        public Builder attributeName(@Nullable Output<String> attributeName) {
            $.attributeName = attributeName;
            return this;
        }

        public Builder attributeName(String attributeName) {
            return attributeName(Output.of(attributeName));
        }

        public Builder attributeValue(@Nullable Output<String> attributeValue) {
            $.attributeValue = attributeValue;
            return this;
        }

        public Builder attributeValue(String attributeValue) {
            return attributeValue(Output.of(attributeValue));
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

        public AccessPolicyIncludeSamlArgs build() {
            return $;
        }
    }

}
