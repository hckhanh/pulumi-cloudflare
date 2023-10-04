// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.RecordDataArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecordArgs Empty = new RecordArgs();

    /**
     * Allow creation of this record in Terraform to overwrite an existing record, if any. This does not affect the ability to
     * update the record in Terraform and does not prevent other resources within Terraform or manual changes outside Terraform
     * from overwriting this record. **This configuration is not recommended for most environments**
     * 
     */
    @Import(name="allowOverwrite")
    private @Nullable Output<Boolean> allowOverwrite;

    /**
     * @return Allow creation of this record in Terraform to overwrite an existing record, if any. This does not affect the ability to
     * update the record in Terraform and does not prevent other resources within Terraform or manual changes outside Terraform
     * from overwriting this record. **This configuration is not recommended for most environments**
     * 
     */
    public Optional<Output<Boolean>> allowOverwrite() {
        return Optional.ofNullable(this.allowOverwrite);
    }

    /**
     * Comments or notes about the DNS record. This field has no effect on DNS responses.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Comments or notes about the DNS record. This field has no effect on DNS responses.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Map of attributes that constitute the record value. Conflicts with `value`.
     * 
     */
    @Import(name="data")
    private @Nullable Output<RecordDataArgs> data;

    /**
     * @return Map of attributes that constitute the record value. Conflicts with `value`.
     * 
     */
    public Optional<Output<RecordDataArgs>> data() {
        return Optional.ofNullable(this.data);
    }

    /**
     * The name of the record.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the record.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The priority of the record.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of the record.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Whether the record gets Cloudflare&#39;s origin protection.
     * 
     */
    @Import(name="proxied")
    private @Nullable Output<Boolean> proxied;

    /**
     * @return Whether the record gets Cloudflare&#39;s origin protection.
     * 
     */
    public Optional<Output<Boolean>> proxied() {
        return Optional.ofNullable(this.proxied);
    }

    /**
     * Custom tags for the DNS record.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Custom tags for the DNS record.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The TTL of the record.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    /**
     * @return The TTL of the record.
     * 
     */
    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    /**
     * The type of the record. Available values: `A`, `AAAA`, `CAA`, `CNAME`, `TXT`, `SRV`, `LOC`, `MX`, `NS`, `SPF`, `CERT`,
     * `DNSKEY`, `DS`, `NAPTR`, `SMIMEA`, `SSHFP`, `TLSA`, `URI`, `PTR`, `HTTPS`, `SVCB`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the record. Available values: `A`, `AAAA`, `CAA`, `CNAME`, `TXT`, `SRV`, `LOC`, `MX`, `NS`, `SPF`, `CERT`,
     * `DNSKEY`, `DS`, `NAPTR`, `SMIMEA`, `SSHFP`, `TLSA`, `URI`, `PTR`, `HTTPS`, `SVCB`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The value of the record.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the record.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private RecordArgs() {}

    private RecordArgs(RecordArgs $) {
        this.allowOverwrite = $.allowOverwrite;
        this.comment = $.comment;
        this.data = $.data;
        this.name = $.name;
        this.priority = $.priority;
        this.proxied = $.proxied;
        this.tags = $.tags;
        this.ttl = $.ttl;
        this.type = $.type;
        this.value = $.value;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordArgs $;

        public Builder() {
            $ = new RecordArgs();
        }

        public Builder(RecordArgs defaults) {
            $ = new RecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowOverwrite Allow creation of this record in Terraform to overwrite an existing record, if any. This does not affect the ability to
         * update the record in Terraform and does not prevent other resources within Terraform or manual changes outside Terraform
         * from overwriting this record. **This configuration is not recommended for most environments**
         * 
         * @return builder
         * 
         */
        public Builder allowOverwrite(@Nullable Output<Boolean> allowOverwrite) {
            $.allowOverwrite = allowOverwrite;
            return this;
        }

        /**
         * @param allowOverwrite Allow creation of this record in Terraform to overwrite an existing record, if any. This does not affect the ability to
         * update the record in Terraform and does not prevent other resources within Terraform or manual changes outside Terraform
         * from overwriting this record. **This configuration is not recommended for most environments**
         * 
         * @return builder
         * 
         */
        public Builder allowOverwrite(Boolean allowOverwrite) {
            return allowOverwrite(Output.of(allowOverwrite));
        }

        /**
         * @param comment Comments or notes about the DNS record. This field has no effect on DNS responses.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Comments or notes about the DNS record. This field has no effect on DNS responses.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param data Map of attributes that constitute the record value. Conflicts with `value`.
         * 
         * @return builder
         * 
         */
        public Builder data(@Nullable Output<RecordDataArgs> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data Map of attributes that constitute the record value. Conflicts with `value`.
         * 
         * @return builder
         * 
         */
        public Builder data(RecordDataArgs data) {
            return data(Output.of(data));
        }

        /**
         * @param name The name of the record.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the record.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority The priority of the record.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of the record.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param proxied Whether the record gets Cloudflare&#39;s origin protection.
         * 
         * @return builder
         * 
         */
        public Builder proxied(@Nullable Output<Boolean> proxied) {
            $.proxied = proxied;
            return this;
        }

        /**
         * @param proxied Whether the record gets Cloudflare&#39;s origin protection.
         * 
         * @return builder
         * 
         */
        public Builder proxied(Boolean proxied) {
            return proxied(Output.of(proxied));
        }

        /**
         * @param tags Custom tags for the DNS record.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Custom tags for the DNS record.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Custom tags for the DNS record.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param ttl The TTL of the record.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl The TTL of the record.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        /**
         * @param type The type of the record. Available values: `A`, `AAAA`, `CAA`, `CNAME`, `TXT`, `SRV`, `LOC`, `MX`, `NS`, `SPF`, `CERT`,
         * `DNSKEY`, `DS`, `NAPTR`, `SMIMEA`, `SSHFP`, `TLSA`, `URI`, `PTR`, `HTTPS`, `SVCB`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the record. Available values: `A`, `AAAA`, `CAA`, `CNAME`, `TXT`, `SRV`, `LOC`, `MX`, `NS`, `SPF`, `CERT`,
         * `DNSKEY`, `DS`, `NAPTR`, `SMIMEA`, `SSHFP`, `TLSA`, `URI`, `PTR`, `HTTPS`, `SVCB`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The value of the record.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the record.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public RecordArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
