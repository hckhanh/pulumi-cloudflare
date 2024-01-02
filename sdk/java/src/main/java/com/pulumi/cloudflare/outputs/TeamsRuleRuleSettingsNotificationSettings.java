// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TeamsRuleRuleSettingsNotificationSettings {
    /**
     * @return Enable notification settings.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Notification content.
     * 
     */
    private @Nullable String message;
    /**
     * @return Support URL to show in the notification.
     * 
     */
    private @Nullable Boolean supportUrl;

    private TeamsRuleRuleSettingsNotificationSettings() {}
    /**
     * @return Enable notification settings.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Notification content.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return Support URL to show in the notification.
     * 
     */
    public Optional<Boolean> supportUrl() {
        return Optional.ofNullable(this.supportUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamsRuleRuleSettingsNotificationSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String message;
        private @Nullable Boolean supportUrl;
        public Builder() {}
        public Builder(TeamsRuleRuleSettingsNotificationSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.message = defaults.message;
    	      this.supportUrl = defaults.supportUrl;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {

            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder supportUrl(@Nullable Boolean supportUrl) {

            this.supportUrl = supportUrl;
            return this;
        }
        public TeamsRuleRuleSettingsNotificationSettings build() {
            final var _resultValue = new TeamsRuleRuleSettingsNotificationSettings();
            _resultValue.enabled = enabled;
            _resultValue.message = message;
            _resultValue.supportUrl = supportUrl;
            return _resultValue;
        }
    }
}
