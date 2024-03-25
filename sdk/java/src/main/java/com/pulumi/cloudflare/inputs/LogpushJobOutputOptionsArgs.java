// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogpushJobOutputOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogpushJobOutputOptionsArgs Empty = new LogpushJobOutputOptionsArgs();

    /**
     * String to be prepended before each batch.
     * 
     */
    @Import(name="batchPrefix")
    private @Nullable Output<String> batchPrefix;

    /**
     * @return String to be prepended before each batch.
     * 
     */
    public Optional<Output<String>> batchPrefix() {
        return Optional.ofNullable(this.batchPrefix);
    }

    /**
     * String to be appended after each batch.
     * 
     */
    @Import(name="batchSuffix")
    private @Nullable Output<String> batchSuffix;

    /**
     * @return String to be appended after each batch.
     * 
     */
    public Optional<Output<String>> batchSuffix() {
        return Optional.ofNullable(this.batchSuffix);
    }

    /**
     * Mitigation for CVE-2021-44228. If set to true, will cause all occurrences of ${ in the generated files to be replaced with x{. Defaults to `false`.
     * 
     */
    @Import(name="cve20214428")
    private @Nullable Output<Boolean> cve20214428;

    /**
     * @return Mitigation for CVE-2021-44228. If set to true, will cause all occurrences of ${ in the generated files to be replaced with x{. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> cve20214428() {
        return Optional.ofNullable(this.cve20214428);
    }

    /**
     * String to join fields. This field be ignored when record_template is set. Defaults to `,`.
     * 
     */
    @Import(name="fieldDelimiter")
    private @Nullable Output<String> fieldDelimiter;

    /**
     * @return String to join fields. This field be ignored when record_template is set. Defaults to `,`.
     * 
     */
    public Optional<Output<String>> fieldDelimiter() {
        return Optional.ofNullable(this.fieldDelimiter);
    }

    /**
     * List of field names to be included in the Logpush output.
     * 
     */
    @Import(name="fieldNames")
    private @Nullable Output<List<String>> fieldNames;

    /**
     * @return List of field names to be included in the Logpush output.
     * 
     */
    public Optional<Output<List<String>>> fieldNames() {
        return Optional.ofNullable(this.fieldNames);
    }

    /**
     * Specifies the output type. Available values: `ndjson`, `csv`. Defaults to `ndjson`.
     * 
     */
    @Import(name="outputType")
    private @Nullable Output<String> outputType;

    /**
     * @return Specifies the output type. Available values: `ndjson`, `csv`. Defaults to `ndjson`.
     * 
     */
    public Optional<Output<String>> outputType() {
        return Optional.ofNullable(this.outputType);
    }

    /**
     * String to be inserted in-between the records as separator.
     * 
     */
    @Import(name="recordDelimiter")
    private @Nullable Output<String> recordDelimiter;

    /**
     * @return String to be inserted in-between the records as separator.
     * 
     */
    public Optional<Output<String>> recordDelimiter() {
        return Optional.ofNullable(this.recordDelimiter);
    }

    /**
     * String to be prepended before each record. Defaults to `{`.
     * 
     */
    @Import(name="recordPrefix")
    private @Nullable Output<String> recordPrefix;

    /**
     * @return String to be prepended before each record. Defaults to `{`.
     * 
     */
    public Optional<Output<String>> recordPrefix() {
        return Optional.ofNullable(this.recordPrefix);
    }

    /**
     * String to be appended after each record. Defaults to `}`.
     * 
     */
    @Import(name="recordSuffix")
    private @Nullable Output<String> recordSuffix;

    /**
     * @return String to be appended after each record. Defaults to `}`.
     * 
     */
    public Optional<Output<String>> recordSuffix() {
        return Optional.ofNullable(this.recordSuffix);
    }

    /**
     * String to use as template for each record instead of the default comma-separated list.
     * 
     */
    @Import(name="recordTemplate")
    private @Nullable Output<String> recordTemplate;

    /**
     * @return String to use as template for each record instead of the default comma-separated list.
     * 
     */
    public Optional<Output<String>> recordTemplate() {
        return Optional.ofNullable(this.recordTemplate);
    }

    /**
     * Specifies the sampling rate. Defaults to `1`.
     * 
     */
    @Import(name="sampleRate")
    private @Nullable Output<Double> sampleRate;

    /**
     * @return Specifies the sampling rate. Defaults to `1`.
     * 
     */
    public Optional<Output<Double>> sampleRate() {
        return Optional.ofNullable(this.sampleRate);
    }

    /**
     * Specifies the format for timestamps. Available values: `unixnano`, `unix`, `rfc3339`. Defaults to `unixnano`.
     * 
     */
    @Import(name="timestampFormat")
    private @Nullable Output<String> timestampFormat;

    /**
     * @return Specifies the format for timestamps. Available values: `unixnano`, `unix`, `rfc3339`. Defaults to `unixnano`.
     * 
     */
    public Optional<Output<String>> timestampFormat() {
        return Optional.ofNullable(this.timestampFormat);
    }

    private LogpushJobOutputOptionsArgs() {}

    private LogpushJobOutputOptionsArgs(LogpushJobOutputOptionsArgs $) {
        this.batchPrefix = $.batchPrefix;
        this.batchSuffix = $.batchSuffix;
        this.cve20214428 = $.cve20214428;
        this.fieldDelimiter = $.fieldDelimiter;
        this.fieldNames = $.fieldNames;
        this.outputType = $.outputType;
        this.recordDelimiter = $.recordDelimiter;
        this.recordPrefix = $.recordPrefix;
        this.recordSuffix = $.recordSuffix;
        this.recordTemplate = $.recordTemplate;
        this.sampleRate = $.sampleRate;
        this.timestampFormat = $.timestampFormat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogpushJobOutputOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogpushJobOutputOptionsArgs $;

        public Builder() {
            $ = new LogpushJobOutputOptionsArgs();
        }

        public Builder(LogpushJobOutputOptionsArgs defaults) {
            $ = new LogpushJobOutputOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchPrefix String to be prepended before each batch.
         * 
         * @return builder
         * 
         */
        public Builder batchPrefix(@Nullable Output<String> batchPrefix) {
            $.batchPrefix = batchPrefix;
            return this;
        }

        /**
         * @param batchPrefix String to be prepended before each batch.
         * 
         * @return builder
         * 
         */
        public Builder batchPrefix(String batchPrefix) {
            return batchPrefix(Output.of(batchPrefix));
        }

        /**
         * @param batchSuffix String to be appended after each batch.
         * 
         * @return builder
         * 
         */
        public Builder batchSuffix(@Nullable Output<String> batchSuffix) {
            $.batchSuffix = batchSuffix;
            return this;
        }

        /**
         * @param batchSuffix String to be appended after each batch.
         * 
         * @return builder
         * 
         */
        public Builder batchSuffix(String batchSuffix) {
            return batchSuffix(Output.of(batchSuffix));
        }

        /**
         * @param cve20214428 Mitigation for CVE-2021-44228. If set to true, will cause all occurrences of ${ in the generated files to be replaced with x{. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder cve20214428(@Nullable Output<Boolean> cve20214428) {
            $.cve20214428 = cve20214428;
            return this;
        }

        /**
         * @param cve20214428 Mitigation for CVE-2021-44228. If set to true, will cause all occurrences of ${ in the generated files to be replaced with x{. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder cve20214428(Boolean cve20214428) {
            return cve20214428(Output.of(cve20214428));
        }

        /**
         * @param fieldDelimiter String to join fields. This field be ignored when record_template is set. Defaults to `,`.
         * 
         * @return builder
         * 
         */
        public Builder fieldDelimiter(@Nullable Output<String> fieldDelimiter) {
            $.fieldDelimiter = fieldDelimiter;
            return this;
        }

        /**
         * @param fieldDelimiter String to join fields. This field be ignored when record_template is set. Defaults to `,`.
         * 
         * @return builder
         * 
         */
        public Builder fieldDelimiter(String fieldDelimiter) {
            return fieldDelimiter(Output.of(fieldDelimiter));
        }

        /**
         * @param fieldNames List of field names to be included in the Logpush output.
         * 
         * @return builder
         * 
         */
        public Builder fieldNames(@Nullable Output<List<String>> fieldNames) {
            $.fieldNames = fieldNames;
            return this;
        }

        /**
         * @param fieldNames List of field names to be included in the Logpush output.
         * 
         * @return builder
         * 
         */
        public Builder fieldNames(List<String> fieldNames) {
            return fieldNames(Output.of(fieldNames));
        }

        /**
         * @param fieldNames List of field names to be included in the Logpush output.
         * 
         * @return builder
         * 
         */
        public Builder fieldNames(String... fieldNames) {
            return fieldNames(List.of(fieldNames));
        }

        /**
         * @param outputType Specifies the output type. Available values: `ndjson`, `csv`. Defaults to `ndjson`.
         * 
         * @return builder
         * 
         */
        public Builder outputType(@Nullable Output<String> outputType) {
            $.outputType = outputType;
            return this;
        }

        /**
         * @param outputType Specifies the output type. Available values: `ndjson`, `csv`. Defaults to `ndjson`.
         * 
         * @return builder
         * 
         */
        public Builder outputType(String outputType) {
            return outputType(Output.of(outputType));
        }

        /**
         * @param recordDelimiter String to be inserted in-between the records as separator.
         * 
         * @return builder
         * 
         */
        public Builder recordDelimiter(@Nullable Output<String> recordDelimiter) {
            $.recordDelimiter = recordDelimiter;
            return this;
        }

        /**
         * @param recordDelimiter String to be inserted in-between the records as separator.
         * 
         * @return builder
         * 
         */
        public Builder recordDelimiter(String recordDelimiter) {
            return recordDelimiter(Output.of(recordDelimiter));
        }

        /**
         * @param recordPrefix String to be prepended before each record. Defaults to `{`.
         * 
         * @return builder
         * 
         */
        public Builder recordPrefix(@Nullable Output<String> recordPrefix) {
            $.recordPrefix = recordPrefix;
            return this;
        }

        /**
         * @param recordPrefix String to be prepended before each record. Defaults to `{`.
         * 
         * @return builder
         * 
         */
        public Builder recordPrefix(String recordPrefix) {
            return recordPrefix(Output.of(recordPrefix));
        }

        /**
         * @param recordSuffix String to be appended after each record. Defaults to `}`.
         * 
         * @return builder
         * 
         */
        public Builder recordSuffix(@Nullable Output<String> recordSuffix) {
            $.recordSuffix = recordSuffix;
            return this;
        }

        /**
         * @param recordSuffix String to be appended after each record. Defaults to `}`.
         * 
         * @return builder
         * 
         */
        public Builder recordSuffix(String recordSuffix) {
            return recordSuffix(Output.of(recordSuffix));
        }

        /**
         * @param recordTemplate String to use as template for each record instead of the default comma-separated list.
         * 
         * @return builder
         * 
         */
        public Builder recordTemplate(@Nullable Output<String> recordTemplate) {
            $.recordTemplate = recordTemplate;
            return this;
        }

        /**
         * @param recordTemplate String to use as template for each record instead of the default comma-separated list.
         * 
         * @return builder
         * 
         */
        public Builder recordTemplate(String recordTemplate) {
            return recordTemplate(Output.of(recordTemplate));
        }

        /**
         * @param sampleRate Specifies the sampling rate. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder sampleRate(@Nullable Output<Double> sampleRate) {
            $.sampleRate = sampleRate;
            return this;
        }

        /**
         * @param sampleRate Specifies the sampling rate. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder sampleRate(Double sampleRate) {
            return sampleRate(Output.of(sampleRate));
        }

        /**
         * @param timestampFormat Specifies the format for timestamps. Available values: `unixnano`, `unix`, `rfc3339`. Defaults to `unixnano`.
         * 
         * @return builder
         * 
         */
        public Builder timestampFormat(@Nullable Output<String> timestampFormat) {
            $.timestampFormat = timestampFormat;
            return this;
        }

        /**
         * @param timestampFormat Specifies the format for timestamps. Available values: `unixnano`, `unix`, `rfc3339`. Defaults to `unixnano`.
         * 
         * @return builder
         * 
         */
        public Builder timestampFormat(String timestampFormat) {
            return timestampFormat(Output.of(timestampFormat));
        }

        public LogpushJobOutputOptionsArgs build() {
            return $;
        }
    }

}
