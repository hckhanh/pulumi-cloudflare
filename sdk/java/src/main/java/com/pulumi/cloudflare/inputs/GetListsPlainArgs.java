// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetListsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetListsPlainArgs Empty = new GetListsPlainArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    private GetListsPlainArgs() {}

    private GetListsPlainArgs(GetListsPlainArgs $) {
        this.accountId = $.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetListsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetListsPlainArgs $;

        public Builder() {
            $ = new GetListsPlainArgs();
        }

        public Builder(GetListsPlainArgs defaults) {
            $ = new GetListsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        public GetListsPlainArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            return $;
        }
    }

}
