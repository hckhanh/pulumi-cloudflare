// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.FallbackDomainDomainArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FallbackDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final FallbackDomainArgs Empty = new FallbackDomainArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    @Import(name="domains", required=true)
    private Output<List<FallbackDomainDomainArgs>> domains;

    public Output<List<FallbackDomainDomainArgs>> domains() {
        return this.domains;
    }

    /**
     * The settings policy for which to configure this fallback domain policy.
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    /**
     * @return The settings policy for which to configure this fallback domain policy.
     * 
     */
    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    private FallbackDomainArgs() {}

    private FallbackDomainArgs(FallbackDomainArgs $) {
        this.accountId = $.accountId;
        this.domains = $.domains;
        this.policyId = $.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FallbackDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FallbackDomainArgs $;

        public Builder() {
            $ = new FallbackDomainArgs();
        }

        public Builder(FallbackDomainArgs defaults) {
            $ = new FallbackDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
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

        public Builder domains(Output<List<FallbackDomainDomainArgs>> domains) {
            $.domains = domains;
            return this;
        }

        public Builder domains(List<FallbackDomainDomainArgs> domains) {
            return domains(Output.of(domains));
        }

        public Builder domains(FallbackDomainDomainArgs... domains) {
            return domains(List.of(domains));
        }

        /**
         * @param policyId The settings policy for which to configure this fallback domain policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The settings policy for which to configure this fallback domain policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        public FallbackDomainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("FallbackDomainArgs", "accountId");
            }
            if ($.domains == null) {
                throw new MissingRequiredPropertyException("FallbackDomainArgs", "domains");
            }
            return $;
        }
    }

}
