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
    public sealed class ZoneSettingsOverrideInitialSetting
    {
        public readonly string? AlwaysOnline;
        public readonly string? AlwaysUseHttps;
        public readonly string? AutomaticHttpsRewrites;
        public readonly string? BinaryAst;
        public readonly string? Brotli;
        public readonly int? BrowserCacheTtl;
        public readonly string? BrowserCheck;
        public readonly string? CacheLevel;
        public readonly int? ChallengeTtl;
        public readonly ImmutableArray<string> Ciphers;
        public readonly string? CnameFlattening;
        public readonly string? DevelopmentMode;
        public readonly string? EarlyHints;
        public readonly string? EmailObfuscation;
        public readonly string? FilterLogsToCloudflare;
        public readonly string? H2Prioritization;
        public readonly string? HotlinkProtection;
        public readonly string? Http2;
        public readonly string? Http3;
        public readonly string? ImageResizing;
        public readonly string? IpGeolocation;
        public readonly string? Ipv6;
        public readonly string? LogToCloudflare;
        public readonly int? MaxUpload;
        public readonly string? MinTlsVersion;
        public readonly Outputs.ZoneSettingsOverrideInitialSettingMinify? Minify;
        public readonly string? Mirage;
        public readonly Outputs.ZoneSettingsOverrideInitialSettingMobileRedirect? MobileRedirect;
        public readonly string? OpportunisticEncryption;
        public readonly string? OpportunisticOnion;
        public readonly string? OrangeToOrange;
        public readonly string? OriginErrorPagePassThru;
        public readonly string? OriginMaxHttpVersion;
        public readonly string? Polish;
        public readonly string? PrefetchPreload;
        public readonly string? PrivacyPass;
        public readonly string? ProxyReadTimeout;
        public readonly string? PseudoIpv4;
        public readonly string? ResponseBuffering;
        public readonly string? RocketLoader;
        public readonly Outputs.ZoneSettingsOverrideInitialSettingSecurityHeader? SecurityHeader;
        public readonly string? SecurityLevel;
        public readonly string? ServerSideExclude;
        public readonly string? SortQueryStringForCache;
        public readonly string? Ssl;
        public readonly string? Tls12Only;
        public readonly string? Tls13;
        public readonly string? TlsClientAuth;
        public readonly string? TrueClientIpHeader;
        public readonly string? UniversalSsl;
        public readonly string? VisitorIp;
        public readonly string? Waf;
        public readonly string? Webp;
        public readonly string? Websockets;
        public readonly string? ZeroRtt;

        [OutputConstructor]
        private ZoneSettingsOverrideInitialSetting(
            string? alwaysOnline,

            string? alwaysUseHttps,

            string? automaticHttpsRewrites,

            string? binaryAst,

            string? brotli,

            int? browserCacheTtl,

            string? browserCheck,

            string? cacheLevel,

            int? challengeTtl,

            ImmutableArray<string> ciphers,

            string? cnameFlattening,

            string? developmentMode,

            string? earlyHints,

            string? emailObfuscation,

            string? filterLogsToCloudflare,

            string? h2Prioritization,

            string? hotlinkProtection,

            string? http2,

            string? http3,

            string? imageResizing,

            string? ipGeolocation,

            string? ipv6,

            string? logToCloudflare,

            int? maxUpload,

            string? minTlsVersion,

            Outputs.ZoneSettingsOverrideInitialSettingMinify? minify,

            string? mirage,

            Outputs.ZoneSettingsOverrideInitialSettingMobileRedirect? mobileRedirect,

            string? opportunisticEncryption,

            string? opportunisticOnion,

            string? orangeToOrange,

            string? originErrorPagePassThru,

            string? originMaxHttpVersion,

            string? polish,

            string? prefetchPreload,

            string? privacyPass,

            string? proxyReadTimeout,

            string? pseudoIpv4,

            string? responseBuffering,

            string? rocketLoader,

            Outputs.ZoneSettingsOverrideInitialSettingSecurityHeader? securityHeader,

            string? securityLevel,

            string? serverSideExclude,

            string? sortQueryStringForCache,

            string? ssl,

            string? tls12Only,

            string? tls13,

            string? tlsClientAuth,

            string? trueClientIpHeader,

            string? universalSsl,

            string? visitorIp,

            string? waf,

            string? webp,

            string? websockets,

            string? zeroRtt)
        {
            AlwaysOnline = alwaysOnline;
            AlwaysUseHttps = alwaysUseHttps;
            AutomaticHttpsRewrites = automaticHttpsRewrites;
            BinaryAst = binaryAst;
            Brotli = brotli;
            BrowserCacheTtl = browserCacheTtl;
            BrowserCheck = browserCheck;
            CacheLevel = cacheLevel;
            ChallengeTtl = challengeTtl;
            Ciphers = ciphers;
            CnameFlattening = cnameFlattening;
            DevelopmentMode = developmentMode;
            EarlyHints = earlyHints;
            EmailObfuscation = emailObfuscation;
            FilterLogsToCloudflare = filterLogsToCloudflare;
            H2Prioritization = h2Prioritization;
            HotlinkProtection = hotlinkProtection;
            Http2 = http2;
            Http3 = http3;
            ImageResizing = imageResizing;
            IpGeolocation = ipGeolocation;
            Ipv6 = ipv6;
            LogToCloudflare = logToCloudflare;
            MaxUpload = maxUpload;
            MinTlsVersion = minTlsVersion;
            Minify = minify;
            Mirage = mirage;
            MobileRedirect = mobileRedirect;
            OpportunisticEncryption = opportunisticEncryption;
            OpportunisticOnion = opportunisticOnion;
            OrangeToOrange = orangeToOrange;
            OriginErrorPagePassThru = originErrorPagePassThru;
            OriginMaxHttpVersion = originMaxHttpVersion;
            Polish = polish;
            PrefetchPreload = prefetchPreload;
            PrivacyPass = privacyPass;
            ProxyReadTimeout = proxyReadTimeout;
            PseudoIpv4 = pseudoIpv4;
            ResponseBuffering = responseBuffering;
            RocketLoader = rocketLoader;
            SecurityHeader = securityHeader;
            SecurityLevel = securityLevel;
            ServerSideExclude = serverSideExclude;
            SortQueryStringForCache = sortQueryStringForCache;
            Ssl = ssl;
            Tls12Only = tls12Only;
            Tls13 = tls13;
            TlsClientAuth = tlsClientAuth;
            TrueClientIpHeader = trueClientIpHeader;
            UniversalSsl = universalSsl;
            VisitorIp = visitorIp;
            Waf = waf;
            Webp = webp;
            Websockets = websockets;
            ZeroRtt = zeroRtt;
        }
    }
}
