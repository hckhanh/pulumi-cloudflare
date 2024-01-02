// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class EmailRoutingAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final EmailRoutingAddressArgs Empty = new EmailRoutingAddressArgs();

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * The contact email address of the user. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return The contact email address of the user. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    private EmailRoutingAddressArgs() {}

    private EmailRoutingAddressArgs(EmailRoutingAddressArgs $) {
        this.accountId = $.accountId;
        this.email = $.email;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailRoutingAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailRoutingAddressArgs $;

        public Builder() {
            $ = new EmailRoutingAddressArgs();
        }

        public Builder(EmailRoutingAddressArgs defaults) {
            $ = new EmailRoutingAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param email The contact email address of the user. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The contact email address of the user. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        public EmailRoutingAddressArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("EmailRoutingAddressArgs", "accountId");
            }
            if ($.email == null) {
                throw new MissingRequiredPropertyException("EmailRoutingAddressArgs", "email");
            }
            return $;
        }
    }

}
