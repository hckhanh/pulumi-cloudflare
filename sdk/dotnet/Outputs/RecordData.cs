// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class RecordData
    {
        public readonly int? Algorithm;
        public readonly double? Altitude;
        public readonly string? Certificate;
        public readonly string? Content;
        public readonly string? Digest;
        public readonly int? DigestType;
        public readonly string? Fingerprint;
        public readonly string? Flags;
        public readonly int? KeyTag;
        public readonly int? LatDegrees;
        public readonly string? LatDirection;
        public readonly int? LatMinutes;
        public readonly double? LatSeconds;
        public readonly int? LongDegrees;
        public readonly string? LongDirection;
        public readonly int? LongMinutes;
        public readonly double? LongSeconds;
        public readonly int? MatchingType;
        /// <summary>
        /// The name of the record. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        public readonly string? Name;
        public readonly int? Order;
        public readonly int? Port;
        public readonly double? PrecisionHorz;
        public readonly double? PrecisionVert;
        public readonly int? Preference;
        /// <summary>
        /// The priority of the record.
        /// </summary>
        public readonly int? Priority;
        public readonly string? Proto;
        public readonly int? Protocol;
        public readonly string? PublicKey;
        public readonly string? Regex;
        public readonly string? Replacement;
        public readonly int? Selector;
        public readonly string? Service;
        public readonly double? Size;
        public readonly string? Tag;
        public readonly string? Target;
        /// <summary>
        /// The type of the record. Available values: `A`, `AAAA`, `CAA`, `CNAME`, `TXT`, `SRV`, `LOC`, `MX`, `NS`, `SPF`, `CERT`, `DNSKEY`, `DS`, `NAPTR`, `SMIMEA`, `SSHFP`, `TLSA`, `URI`, `PTR`, `HTTPS`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        public readonly int? Type;
        public readonly int? Usage;
        /// <summary>
        /// The value of the record. Conflicts with `data`.
        /// </summary>
        public readonly string? Value;
        public readonly int? Weight;

        [OutputConstructor]
        private RecordData(
            int? algorithm,

            double? altitude,

            string? certificate,

            string? content,

            string? digest,

            int? digestType,

            string? fingerprint,

            string? flags,

            int? keyTag,

            int? latDegrees,

            string? latDirection,

            int? latMinutes,

            double? latSeconds,

            int? longDegrees,

            string? longDirection,

            int? longMinutes,

            double? longSeconds,

            int? matchingType,

            string? name,

            int? order,

            int? port,

            double? precisionHorz,

            double? precisionVert,

            int? preference,

            int? priority,

            string? proto,

            int? protocol,

            string? publicKey,

            string? regex,

            string? replacement,

            int? selector,

            string? service,

            double? size,

            string? tag,

            string? target,

            int? type,

            int? usage,

            string? value,

            int? weight)
        {
            Algorithm = algorithm;
            Altitude = altitude;
            Certificate = certificate;
            Content = content;
            Digest = digest;
            DigestType = digestType;
            Fingerprint = fingerprint;
            Flags = flags;
            KeyTag = keyTag;
            LatDegrees = latDegrees;
            LatDirection = latDirection;
            LatMinutes = latMinutes;
            LatSeconds = latSeconds;
            LongDegrees = longDegrees;
            LongDirection = longDirection;
            LongMinutes = longMinutes;
            LongSeconds = longSeconds;
            MatchingType = matchingType;
            Name = name;
            Order = order;
            Port = port;
            PrecisionHorz = precisionHorz;
            PrecisionVert = precisionVert;
            Preference = preference;
            Priority = priority;
            Proto = proto;
            Protocol = protocol;
            PublicKey = publicKey;
            Regex = regex;
            Replacement = replacement;
            Selector = selector;
            Service = service;
            Size = size;
            Tag = tag;
            Target = target;
            Type = type;
            Usage = usage;
            Value = value;
            Weight = weight;
        }
    }
}
