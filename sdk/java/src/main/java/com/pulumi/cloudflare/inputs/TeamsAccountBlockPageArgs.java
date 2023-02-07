// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TeamsAccountBlockPageArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamsAccountBlockPageArgs Empty = new TeamsAccountBlockPageArgs();

    /**
     * Hex code of block page background color.
     * 
     */
    @Import(name="backgroundColor")
    private @Nullable Output<String> backgroundColor;

    /**
     * @return Hex code of block page background color.
     * 
     */
    public Optional<Output<String>> backgroundColor() {
        return Optional.ofNullable(this.backgroundColor);
    }

    /**
     * Indicator of enablement.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Indicator of enablement.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Block page footer text.
     * 
     */
    @Import(name="footerText")
    private @Nullable Output<String> footerText;

    /**
     * @return Block page footer text.
     * 
     */
    public Optional<Output<String>> footerText() {
        return Optional.ofNullable(this.footerText);
    }

    /**
     * Block page header text.
     * 
     */
    @Import(name="headerText")
    private @Nullable Output<String> headerText;

    /**
     * @return Block page header text.
     * 
     */
    public Optional<Output<String>> headerText() {
        return Optional.ofNullable(this.headerText);
    }

    /**
     * URL of block page logo.
     * 
     */
    @Import(name="logoPath")
    private @Nullable Output<String> logoPath;

    /**
     * @return URL of block page logo.
     * 
     */
    public Optional<Output<String>> logoPath() {
        return Optional.ofNullable(this.logoPath);
    }

    /**
     * Admin email for users to contact.
     * 
     */
    @Import(name="mailtoAddress")
    private @Nullable Output<String> mailtoAddress;

    /**
     * @return Admin email for users to contact.
     * 
     */
    public Optional<Output<String>> mailtoAddress() {
        return Optional.ofNullable(this.mailtoAddress);
    }

    /**
     * Subject line for emails created from block page.
     * 
     */
    @Import(name="mailtoSubject")
    private @Nullable Output<String> mailtoSubject;

    /**
     * @return Subject line for emails created from block page.
     * 
     */
    public Optional<Output<String>> mailtoSubject() {
        return Optional.ofNullable(this.mailtoSubject);
    }

    /**
     * Name of block page configuration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of block page configuration.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private TeamsAccountBlockPageArgs() {}

    private TeamsAccountBlockPageArgs(TeamsAccountBlockPageArgs $) {
        this.backgroundColor = $.backgroundColor;
        this.enabled = $.enabled;
        this.footerText = $.footerText;
        this.headerText = $.headerText;
        this.logoPath = $.logoPath;
        this.mailtoAddress = $.mailtoAddress;
        this.mailtoSubject = $.mailtoSubject;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamsAccountBlockPageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamsAccountBlockPageArgs $;

        public Builder() {
            $ = new TeamsAccountBlockPageArgs();
        }

        public Builder(TeamsAccountBlockPageArgs defaults) {
            $ = new TeamsAccountBlockPageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backgroundColor Hex code of block page background color.
         * 
         * @return builder
         * 
         */
        public Builder backgroundColor(@Nullable Output<String> backgroundColor) {
            $.backgroundColor = backgroundColor;
            return this;
        }

        /**
         * @param backgroundColor Hex code of block page background color.
         * 
         * @return builder
         * 
         */
        public Builder backgroundColor(String backgroundColor) {
            return backgroundColor(Output.of(backgroundColor));
        }

        /**
         * @param enabled Indicator of enablement.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Indicator of enablement.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param footerText Block page footer text.
         * 
         * @return builder
         * 
         */
        public Builder footerText(@Nullable Output<String> footerText) {
            $.footerText = footerText;
            return this;
        }

        /**
         * @param footerText Block page footer text.
         * 
         * @return builder
         * 
         */
        public Builder footerText(String footerText) {
            return footerText(Output.of(footerText));
        }

        /**
         * @param headerText Block page header text.
         * 
         * @return builder
         * 
         */
        public Builder headerText(@Nullable Output<String> headerText) {
            $.headerText = headerText;
            return this;
        }

        /**
         * @param headerText Block page header text.
         * 
         * @return builder
         * 
         */
        public Builder headerText(String headerText) {
            return headerText(Output.of(headerText));
        }

        /**
         * @param logoPath URL of block page logo.
         * 
         * @return builder
         * 
         */
        public Builder logoPath(@Nullable Output<String> logoPath) {
            $.logoPath = logoPath;
            return this;
        }

        /**
         * @param logoPath URL of block page logo.
         * 
         * @return builder
         * 
         */
        public Builder logoPath(String logoPath) {
            return logoPath(Output.of(logoPath));
        }

        /**
         * @param mailtoAddress Admin email for users to contact.
         * 
         * @return builder
         * 
         */
        public Builder mailtoAddress(@Nullable Output<String> mailtoAddress) {
            $.mailtoAddress = mailtoAddress;
            return this;
        }

        /**
         * @param mailtoAddress Admin email for users to contact.
         * 
         * @return builder
         * 
         */
        public Builder mailtoAddress(String mailtoAddress) {
            return mailtoAddress(Output.of(mailtoAddress));
        }

        /**
         * @param mailtoSubject Subject line for emails created from block page.
         * 
         * @return builder
         * 
         */
        public Builder mailtoSubject(@Nullable Output<String> mailtoSubject) {
            $.mailtoSubject = mailtoSubject;
            return this;
        }

        /**
         * @param mailtoSubject Subject line for emails created from block page.
         * 
         * @return builder
         * 
         */
        public Builder mailtoSubject(String mailtoSubject) {
            return mailtoSubject(Output.of(mailtoSubject));
        }

        /**
         * @param name Name of block page configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of block page configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public TeamsAccountBlockPageArgs build() {
            return $;
        }
    }

}
