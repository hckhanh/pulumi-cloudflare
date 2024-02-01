// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountRolesRole {
    /**
     * @return Description of role&#39;s permissions.
     * 
     */
    private @Nullable String description;
    /**
     * @return Role identifier tag.
     * 
     */
    private @Nullable String id;
    /**
     * @return Role Name.
     * 
     */
    private @Nullable String name;

    private GetAccountRolesRole() {}
    /**
     * @return Description of role&#39;s permissions.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Role identifier tag.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Role Name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountRolesRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable String id;
        private @Nullable String name;
        public Builder() {}
        public Builder(GetAccountRolesRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public GetAccountRolesRole build() {
            final var _resultValue = new GetAccountRolesRole();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
