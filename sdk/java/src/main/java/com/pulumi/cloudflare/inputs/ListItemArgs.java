// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ListItemValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListItemArgs Empty = new ListItemArgs();

    /**
     * An optional comment for the item.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return An optional comment for the item.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="value", required=true)
    private Output<ListItemValueArgs> value;

    public Output<ListItemValueArgs> value() {
        return this.value;
    }

    private ListItemArgs() {}

    private ListItemArgs(ListItemArgs $) {
        this.comment = $.comment;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListItemArgs $;

        public Builder() {
            $ = new ListItemArgs();
        }

        public Builder(ListItemArgs defaults) {
            $ = new ListItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment An optional comment for the item.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment An optional comment for the item.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder value(Output<ListItemValueArgs> value) {
            $.value = value;
            return this;
        }

        public Builder value(ListItemValueArgs value) {
            return value(Output.of(value));
        }

        public ListItemArgs build() {
            if ($.value == null) {
                throw new MissingRequiredPropertyException("ListItemArgs", "value");
            }
            return $;
        }
    }

}
