// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecordDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecordDataArgs Empty = new RecordDataArgs();

    @Import(name="algorithm")
    private @Nullable Output<Integer> algorithm;

    public Optional<Output<Integer>> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    @Import(name="altitude")
    private @Nullable Output<Double> altitude;

    public Optional<Output<Double>> altitude() {
        return Optional.ofNullable(this.altitude);
    }

    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    @Import(name="content")
    private @Nullable Output<String> content;

    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    @Import(name="digest")
    private @Nullable Output<String> digest;

    public Optional<Output<String>> digest() {
        return Optional.ofNullable(this.digest);
    }

    @Import(name="digestType")
    private @Nullable Output<Integer> digestType;

    public Optional<Output<Integer>> digestType() {
        return Optional.ofNullable(this.digestType);
    }

    @Import(name="fingerprint")
    private @Nullable Output<String> fingerprint;

    public Optional<Output<String>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }

    @Import(name="flags")
    private @Nullable Output<String> flags;

    public Optional<Output<String>> flags() {
        return Optional.ofNullable(this.flags);
    }

    @Import(name="keyTag")
    private @Nullable Output<Integer> keyTag;

    public Optional<Output<Integer>> keyTag() {
        return Optional.ofNullable(this.keyTag);
    }

    @Import(name="latDegrees")
    private @Nullable Output<Integer> latDegrees;

    public Optional<Output<Integer>> latDegrees() {
        return Optional.ofNullable(this.latDegrees);
    }

    @Import(name="latDirection")
    private @Nullable Output<String> latDirection;

    public Optional<Output<String>> latDirection() {
        return Optional.ofNullable(this.latDirection);
    }

    @Import(name="latMinutes")
    private @Nullable Output<Integer> latMinutes;

    public Optional<Output<Integer>> latMinutes() {
        return Optional.ofNullable(this.latMinutes);
    }

    @Import(name="latSeconds")
    private @Nullable Output<Double> latSeconds;

    public Optional<Output<Double>> latSeconds() {
        return Optional.ofNullable(this.latSeconds);
    }

    @Import(name="longDegrees")
    private @Nullable Output<Integer> longDegrees;

    public Optional<Output<Integer>> longDegrees() {
        return Optional.ofNullable(this.longDegrees);
    }

    @Import(name="longDirection")
    private @Nullable Output<String> longDirection;

    public Optional<Output<String>> longDirection() {
        return Optional.ofNullable(this.longDirection);
    }

    @Import(name="longMinutes")
    private @Nullable Output<Integer> longMinutes;

    public Optional<Output<Integer>> longMinutes() {
        return Optional.ofNullable(this.longMinutes);
    }

    @Import(name="longSeconds")
    private @Nullable Output<Double> longSeconds;

    public Optional<Output<Double>> longSeconds() {
        return Optional.ofNullable(this.longSeconds);
    }

    @Import(name="matchingType")
    private @Nullable Output<Integer> matchingType;

    public Optional<Output<Integer>> matchingType() {
        return Optional.ofNullable(this.matchingType);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="order")
    private @Nullable Output<Integer> order;

    public Optional<Output<Integer>> order() {
        return Optional.ofNullable(this.order);
    }

    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="precisionHorz")
    private @Nullable Output<Double> precisionHorz;

    public Optional<Output<Double>> precisionHorz() {
        return Optional.ofNullable(this.precisionHorz);
    }

    @Import(name="precisionVert")
    private @Nullable Output<Double> precisionVert;

    public Optional<Output<Double>> precisionVert() {
        return Optional.ofNullable(this.precisionVert);
    }

    @Import(name="preference")
    private @Nullable Output<Integer> preference;

    public Optional<Output<Integer>> preference() {
        return Optional.ofNullable(this.preference);
    }

    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    @Import(name="proto")
    private @Nullable Output<String> proto;

    public Optional<Output<String>> proto() {
        return Optional.ofNullable(this.proto);
    }

    @Import(name="protocol")
    private @Nullable Output<Integer> protocol;

    public Optional<Output<Integer>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    @Import(name="regex")
    private @Nullable Output<String> regex;

    public Optional<Output<String>> regex() {
        return Optional.ofNullable(this.regex);
    }

    @Import(name="replacement")
    private @Nullable Output<String> replacement;

    public Optional<Output<String>> replacement() {
        return Optional.ofNullable(this.replacement);
    }

    @Import(name="selector")
    private @Nullable Output<Integer> selector;

    public Optional<Output<Integer>> selector() {
        return Optional.ofNullable(this.selector);
    }

    @Import(name="service")
    private @Nullable Output<String> service;

    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    @Import(name="size")
    private @Nullable Output<Double> size;

    public Optional<Output<Double>> size() {
        return Optional.ofNullable(this.size);
    }

    @Import(name="tag")
    private @Nullable Output<String> tag;

    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    @Import(name="target")
    private @Nullable Output<String> target;

    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    @Import(name="type")
    private @Nullable Output<Integer> type;

    public Optional<Output<Integer>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="usage")
    private @Nullable Output<Integer> usage;

    public Optional<Output<Integer>> usage() {
        return Optional.ofNullable(this.usage);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private RecordDataArgs() {}

    private RecordDataArgs(RecordDataArgs $) {
        this.algorithm = $.algorithm;
        this.altitude = $.altitude;
        this.certificate = $.certificate;
        this.content = $.content;
        this.digest = $.digest;
        this.digestType = $.digestType;
        this.fingerprint = $.fingerprint;
        this.flags = $.flags;
        this.keyTag = $.keyTag;
        this.latDegrees = $.latDegrees;
        this.latDirection = $.latDirection;
        this.latMinutes = $.latMinutes;
        this.latSeconds = $.latSeconds;
        this.longDegrees = $.longDegrees;
        this.longDirection = $.longDirection;
        this.longMinutes = $.longMinutes;
        this.longSeconds = $.longSeconds;
        this.matchingType = $.matchingType;
        this.name = $.name;
        this.order = $.order;
        this.port = $.port;
        this.precisionHorz = $.precisionHorz;
        this.precisionVert = $.precisionVert;
        this.preference = $.preference;
        this.priority = $.priority;
        this.proto = $.proto;
        this.protocol = $.protocol;
        this.publicKey = $.publicKey;
        this.regex = $.regex;
        this.replacement = $.replacement;
        this.selector = $.selector;
        this.service = $.service;
        this.size = $.size;
        this.tag = $.tag;
        this.target = $.target;
        this.type = $.type;
        this.usage = $.usage;
        this.value = $.value;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecordDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordDataArgs $;

        public Builder() {
            $ = new RecordDataArgs();
        }

        public Builder(RecordDataArgs defaults) {
            $ = new RecordDataArgs(Objects.requireNonNull(defaults));
        }

        public Builder algorithm(@Nullable Output<Integer> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        public Builder algorithm(Integer algorithm) {
            return algorithm(Output.of(algorithm));
        }

        public Builder altitude(@Nullable Output<Double> altitude) {
            $.altitude = altitude;
            return this;
        }

        public Builder altitude(Double altitude) {
            return altitude(Output.of(altitude));
        }

        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        public Builder content(String content) {
            return content(Output.of(content));
        }

        public Builder digest(@Nullable Output<String> digest) {
            $.digest = digest;
            return this;
        }

        public Builder digest(String digest) {
            return digest(Output.of(digest));
        }

        public Builder digestType(@Nullable Output<Integer> digestType) {
            $.digestType = digestType;
            return this;
        }

        public Builder digestType(Integer digestType) {
            return digestType(Output.of(digestType));
        }

        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        public Builder fingerprint(String fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        public Builder flags(@Nullable Output<String> flags) {
            $.flags = flags;
            return this;
        }

        public Builder flags(String flags) {
            return flags(Output.of(flags));
        }

        public Builder keyTag(@Nullable Output<Integer> keyTag) {
            $.keyTag = keyTag;
            return this;
        }

        public Builder keyTag(Integer keyTag) {
            return keyTag(Output.of(keyTag));
        }

        public Builder latDegrees(@Nullable Output<Integer> latDegrees) {
            $.latDegrees = latDegrees;
            return this;
        }

        public Builder latDegrees(Integer latDegrees) {
            return latDegrees(Output.of(latDegrees));
        }

        public Builder latDirection(@Nullable Output<String> latDirection) {
            $.latDirection = latDirection;
            return this;
        }

        public Builder latDirection(String latDirection) {
            return latDirection(Output.of(latDirection));
        }

        public Builder latMinutes(@Nullable Output<Integer> latMinutes) {
            $.latMinutes = latMinutes;
            return this;
        }

        public Builder latMinutes(Integer latMinutes) {
            return latMinutes(Output.of(latMinutes));
        }

        public Builder latSeconds(@Nullable Output<Double> latSeconds) {
            $.latSeconds = latSeconds;
            return this;
        }

        public Builder latSeconds(Double latSeconds) {
            return latSeconds(Output.of(latSeconds));
        }

        public Builder longDegrees(@Nullable Output<Integer> longDegrees) {
            $.longDegrees = longDegrees;
            return this;
        }

        public Builder longDegrees(Integer longDegrees) {
            return longDegrees(Output.of(longDegrees));
        }

        public Builder longDirection(@Nullable Output<String> longDirection) {
            $.longDirection = longDirection;
            return this;
        }

        public Builder longDirection(String longDirection) {
            return longDirection(Output.of(longDirection));
        }

        public Builder longMinutes(@Nullable Output<Integer> longMinutes) {
            $.longMinutes = longMinutes;
            return this;
        }

        public Builder longMinutes(Integer longMinutes) {
            return longMinutes(Output.of(longMinutes));
        }

        public Builder longSeconds(@Nullable Output<Double> longSeconds) {
            $.longSeconds = longSeconds;
            return this;
        }

        public Builder longSeconds(Double longSeconds) {
            return longSeconds(Output.of(longSeconds));
        }

        public Builder matchingType(@Nullable Output<Integer> matchingType) {
            $.matchingType = matchingType;
            return this;
        }

        public Builder matchingType(Integer matchingType) {
            return matchingType(Output.of(matchingType));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder order(@Nullable Output<Integer> order) {
            $.order = order;
            return this;
        }

        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder precisionHorz(@Nullable Output<Double> precisionHorz) {
            $.precisionHorz = precisionHorz;
            return this;
        }

        public Builder precisionHorz(Double precisionHorz) {
            return precisionHorz(Output.of(precisionHorz));
        }

        public Builder precisionVert(@Nullable Output<Double> precisionVert) {
            $.precisionVert = precisionVert;
            return this;
        }

        public Builder precisionVert(Double precisionVert) {
            return precisionVert(Output.of(precisionVert));
        }

        public Builder preference(@Nullable Output<Integer> preference) {
            $.preference = preference;
            return this;
        }

        public Builder preference(Integer preference) {
            return preference(Output.of(preference));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder proto(@Nullable Output<String> proto) {
            $.proto = proto;
            return this;
        }

        public Builder proto(String proto) {
            return proto(Output.of(proto));
        }

        public Builder protocol(@Nullable Output<Integer> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(Integer protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        public Builder regex(@Nullable Output<String> regex) {
            $.regex = regex;
            return this;
        }

        public Builder regex(String regex) {
            return regex(Output.of(regex));
        }

        public Builder replacement(@Nullable Output<String> replacement) {
            $.replacement = replacement;
            return this;
        }

        public Builder replacement(String replacement) {
            return replacement(Output.of(replacement));
        }

        public Builder selector(@Nullable Output<Integer> selector) {
            $.selector = selector;
            return this;
        }

        public Builder selector(Integer selector) {
            return selector(Output.of(selector));
        }

        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        public Builder service(String service) {
            return service(Output.of(service));
        }

        public Builder size(@Nullable Output<Double> size) {
            $.size = size;
            return this;
        }

        public Builder size(Double size) {
            return size(Output.of(size));
        }

        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        public Builder target(String target) {
            return target(Output.of(target));
        }

        public Builder type(@Nullable Output<Integer> type) {
            $.type = type;
            return this;
        }

        public Builder type(Integer type) {
            return type(Output.of(type));
        }

        public Builder usage(@Nullable Output<Integer> usage) {
            $.usage = usage;
            return this;
        }

        public Builder usage(Integer usage) {
            return usage(Output.of(usage));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public RecordDataArgs build() {
            return $;
        }
    }

}
