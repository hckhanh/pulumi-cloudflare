// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * Whether 2FA is enforced on the account. Defaults to `false`.
     * 
     */
    @Import(name="enforceTwofactor")
    private @Nullable Output<Boolean> enforceTwofactor;

    /**
     * @return Whether 2FA is enforced on the account. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enforceTwofactor() {
        return Optional.ofNullable(this.enforceTwofactor);
    }

    /**
     * The name of the account that is displayed in the Cloudflare dashboard.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the account that is displayed in the Cloudflare dashboard.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Account type. Available values: `enterprise`, `standard`. Defaults to `standard`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Account type. Available values: `enterprise`, `standard`. Defaults to `standard`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private AccountArgs() {}

    private AccountArgs(AccountArgs $) {
        this.enforceTwofactor = $.enforceTwofactor;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountArgs $;

        public Builder() {
            $ = new AccountArgs();
        }

        public Builder(AccountArgs defaults) {
            $ = new AccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enforceTwofactor Whether 2FA is enforced on the account. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enforceTwofactor(@Nullable Output<Boolean> enforceTwofactor) {
            $.enforceTwofactor = enforceTwofactor;
            return this;
        }

        /**
         * @param enforceTwofactor Whether 2FA is enforced on the account. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enforceTwofactor(Boolean enforceTwofactor) {
            return enforceTwofactor(Output.of(enforceTwofactor));
        }

        /**
         * @param name The name of the account that is displayed in the Cloudflare dashboard.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the account that is displayed in the Cloudflare dashboard.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Account type. Available values: `enterprise`, `standard`. Defaults to `standard`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Account type. Available values: `enterprise`, `standard`. Defaults to `standard`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AccountArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("AccountArgs", "name");
            }
            return $;
        }
    }

}
