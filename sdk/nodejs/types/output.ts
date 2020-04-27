// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as outputs from "../types/output";

export interface AccessGroupExclude {
    anyValidServiceToken?: boolean;
    azures?: outputs.AccessGroupExcludeAzure[];
    certificate?: boolean;
    commonName?: string;
    emails?: string[];
    emailDomains?: string[];
    everyone?: boolean;
    githubs?: outputs.AccessGroupExcludeGithub[];
    groups?: string[];
    gsuites?: outputs.AccessGroupExcludeGsuite[];
    ips?: string[];
    oktas?: outputs.AccessGroupExcludeOkta[];
    samls?: outputs.AccessGroupExcludeSaml[];
    serviceTokens?: string[];
}

export interface AccessGroupExcludeAzure {
    id?: string;
    identityProviderId?: string;
}

export interface AccessGroupExcludeGithub {
    identityProviderId?: string;
    /**
     * Friendly name of the Access Group.
     */
    name?: string;
}

export interface AccessGroupExcludeGsuite {
    email?: string;
    identityProviderId?: string;
}

export interface AccessGroupExcludeOkta {
    identityProviderId?: string;
    /**
     * Friendly name of the Access Group.
     */
    name?: string;
}

export interface AccessGroupExcludeSaml {
    attributeName?: string;
    attributeValue?: string;
    identityProviderId?: string;
}

export interface AccessGroupInclude {
    anyValidServiceToken?: boolean;
    azures?: outputs.AccessGroupIncludeAzure[];
    certificate?: boolean;
    commonName?: string;
    emails?: string[];
    emailDomains?: string[];
    everyone?: boolean;
    githubs?: outputs.AccessGroupIncludeGithub[];
    groups?: string[];
    gsuites?: outputs.AccessGroupIncludeGsuite[];
    ips?: string[];
    oktas?: outputs.AccessGroupIncludeOkta[];
    samls?: outputs.AccessGroupIncludeSaml[];
    serviceTokens?: string[];
}

export interface AccessGroupIncludeAzure {
    id?: string;
    identityProviderId?: string;
}

export interface AccessGroupIncludeGithub {
    identityProviderId?: string;
    /**
     * Friendly name of the Access Group.
     */
    name?: string;
}

export interface AccessGroupIncludeGsuite {
    email?: string;
    identityProviderId?: string;
}

export interface AccessGroupIncludeOkta {
    identityProviderId?: string;
    /**
     * Friendly name of the Access Group.
     */
    name?: string;
}

export interface AccessGroupIncludeSaml {
    attributeName?: string;
    attributeValue?: string;
    identityProviderId?: string;
}

export interface AccessGroupRequire {
    anyValidServiceToken?: boolean;
    azures?: outputs.AccessGroupRequireAzure[];
    certificate?: boolean;
    commonName?: string;
    emails?: string[];
    emailDomains?: string[];
    everyone?: boolean;
    githubs?: outputs.AccessGroupRequireGithub[];
    groups?: string[];
    gsuites?: outputs.AccessGroupRequireGsuite[];
    ips?: string[];
    oktas?: outputs.AccessGroupRequireOkta[];
    samls?: outputs.AccessGroupRequireSaml[];
    serviceTokens?: string[];
}

export interface AccessGroupRequireAzure {
    id?: string;
    identityProviderId?: string;
}

export interface AccessGroupRequireGithub {
    identityProviderId?: string;
    /**
     * Friendly name of the Access Group.
     */
    name?: string;
}

export interface AccessGroupRequireGsuite {
    email?: string;
    identityProviderId?: string;
}

export interface AccessGroupRequireOkta {
    identityProviderId?: string;
    /**
     * Friendly name of the Access Group.
     */
    name?: string;
}

export interface AccessGroupRequireSaml {
    attributeName?: string;
    attributeValue?: string;
    identityProviderId?: string;
}

export interface AccessIdentityProviderConfig {
    appsDomain?: string;
    attributes?: string[];
    authUrl?: string;
    centrifyAccount?: string;
    centrifyAppId?: string;
    certsUrl?: string;
    clientId?: string;
    clientSecret?: string;
    directoryId?: string;
    emailAttributeName?: string;
    idpPublicCert?: string;
    issuerUrl?: string;
    oktaAccount?: string;
    oneloginAccount?: string;
    redirectUrl: string;
    signRequest?: boolean;
    ssoTargetUrl?: string;
    supportGroups?: boolean;
    tokenUrl?: string;
}

export interface AccessPolicyExclude {
    anyValidServiceToken?: boolean;
    azures?: outputs.AccessPolicyExcludeAzure[];
    certificate?: boolean;
    commonName?: string;
    emails?: string[];
    emailDomains?: string[];
    everyone?: boolean;
    githubs?: outputs.AccessPolicyExcludeGithub[];
    groups?: string[];
    gsuites?: outputs.AccessPolicyExcludeGsuite[];
    ips?: string[];
    oktas?: outputs.AccessPolicyExcludeOkta[];
    samls?: outputs.AccessPolicyExcludeSaml[];
    serviceTokens?: string[];
}

export interface AccessPolicyExcludeAzure {
    id?: string;
    identityProviderId?: string;
}

export interface AccessPolicyExcludeGithub {
    identityProviderId?: string;
    /**
     * Friendly name of the Access Application.
     */
    name?: string;
}

export interface AccessPolicyExcludeGsuite {
    email?: string;
    identityProviderId?: string;
}

export interface AccessPolicyExcludeOkta {
    identityProviderId?: string;
    /**
     * Friendly name of the Access Application.
     */
    name?: string;
}

export interface AccessPolicyExcludeSaml {
    attributeName?: string;
    attributeValue?: string;
    identityProviderId?: string;
}

export interface AccessPolicyInclude {
    anyValidServiceToken?: boolean;
    azures?: outputs.AccessPolicyIncludeAzure[];
    certificate?: boolean;
    commonName?: string;
    emails?: string[];
    emailDomains?: string[];
    everyone?: boolean;
    githubs?: outputs.AccessPolicyIncludeGithub[];
    groups?: string[];
    gsuites?: outputs.AccessPolicyIncludeGsuite[];
    ips?: string[];
    oktas?: outputs.AccessPolicyIncludeOkta[];
    samls?: outputs.AccessPolicyIncludeSaml[];
    serviceTokens?: string[];
}

export interface AccessPolicyIncludeAzure {
    id?: string;
    identityProviderId?: string;
}

export interface AccessPolicyIncludeGithub {
    identityProviderId?: string;
    /**
     * Friendly name of the Access Application.
     */
    name?: string;
}

export interface AccessPolicyIncludeGsuite {
    email?: string;
    identityProviderId?: string;
}

export interface AccessPolicyIncludeOkta {
    identityProviderId?: string;
    /**
     * Friendly name of the Access Application.
     */
    name?: string;
}

export interface AccessPolicyIncludeSaml {
    attributeName?: string;
    attributeValue?: string;
    identityProviderId?: string;
}

export interface AccessPolicyRequire {
    anyValidServiceToken?: boolean;
    azures?: outputs.AccessPolicyRequireAzure[];
    certificate?: boolean;
    commonName?: string;
    emails?: string[];
    emailDomains?: string[];
    everyone?: boolean;
    githubs?: outputs.AccessPolicyRequireGithub[];
    groups?: string[];
    gsuites?: outputs.AccessPolicyRequireGsuite[];
    ips?: string[];
    oktas?: outputs.AccessPolicyRequireOkta[];
    samls?: outputs.AccessPolicyRequireSaml[];
    serviceTokens?: string[];
}

export interface AccessPolicyRequireAzure {
    id?: string;
    identityProviderId?: string;
}

export interface AccessPolicyRequireGithub {
    identityProviderId?: string;
    /**
     * Friendly name of the Access Application.
     */
    name?: string;
}

export interface AccessPolicyRequireGsuite {
    email?: string;
    identityProviderId?: string;
}

export interface AccessPolicyRequireOkta {
    identityProviderId?: string;
    /**
     * Friendly name of the Access Application.
     */
    name?: string;
}

export interface AccessPolicyRequireSaml {
    attributeName?: string;
    attributeValue?: string;
    identityProviderId?: string;
}

export interface AccessRuleConfiguration {
    /**
     * The request property to target. Allowed values: "ip", "ip6", "ipRange", "asn", "country"
     */
    target: string;
    /**
     * The value to target. Depends on target's type.
     */
    value: string;
}

export interface CustomSslCustomSslOptions {
    /**
     * Method of building intermediate certificate chain. A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Valid values are `ubiquitous` (default), `optimal`, `force`.
     */
    bundleMethod?: string;
    /**
     * Certificate certificate and the intermediate(s)
     */
    certificate: string;
    /**
     * Specifies the region where your private key can be held locally. Valid values are `us`, `eu`, `highestSecurity`.
     */
    geoRestrictions?: string;
    /**
     * Certificate's private key
     */
    privateKey: string;
    /**
     * Whether to enable support for legacy clients which do not include SNI in the TLS handshake. Valid values are `legacyCustom` (default), `sniCustom`.
     */
    type?: string;
}

export interface CustomSslCustomSslPriority {
    id?: string;
    priority?: number;
}

export interface GetWafGroupsFilter {
    mode?: string;
    name?: string;
}

export interface GetWafGroupsGroup {
    description?: string;
    id?: string;
    mode?: string;
    modifiedRulesCount?: number;
    name?: string;
    packageId?: string;
    rulesCount?: number;
}

export interface GetWafPackagesFilter {
    actionMode?: string;
    detectionMode?: string;
    name?: string;
    sensitivity?: string;
}

export interface GetWafPackagesPackage {
    actionMode?: string;
    description?: string;
    detectionMode?: string;
    id?: string;
    name?: string;
    sensitivity?: string;
}

export interface GetWafRulesFilter {
    description?: string;
    groupId?: string;
    mode?: string;
}

export interface GetWafRulesRule {
    allowedModes?: string[];
    description?: string;
    groupId?: string;
    groupName?: string;
    id?: string;
    mode?: string;
    packageId?: string;
    priority?: string;
}

export interface GetZonesFilter {
    name?: string;
    paused?: boolean;
    status?: string;
}

export interface GetZonesZone {
    id?: string;
    name?: string;
}

export interface LoadBalancerMonitorHeader {
    /**
     * The header name.
     */
    header: string;
    /**
     * A list of string values for the header.
     */
    values: string[];
}

export interface LoadBalancerPoolOrigin {
    /**
     * The IP address (IPv4 or IPv6) of the origin, or the publicly addressable hostname. Hostnames entered here should resolve directly to the origin, and not be a hostname proxied by Cloudflare.
     */
    address: string;
    /**
     * Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
     */
    enabled?: boolean;
    /**
     * A human-identifiable name for the origin.
     */
    name: string;
    /**
     * The weight (0.01 - 1.00) of this origin, relative to other origins in the pool. Equal values mean equal weighting. A weight of 0 means traffic will not be sent to this origin, but health is still checked. Default: 1.
     */
    weight?: number;
}

export interface LoadBalancerPopPool {
    /**
     * A list of pool IDs in failover priority to use for traffic reaching the given PoP.
     */
    poolIds: string[];
    /**
     * A 3-letter code for the Point-of-Presence. Allowed values can be found in the list of datacenters on the [status page](https://www.cloudflarestatus.com/). Multiple entries should not be specified with the same PoP.
     */
    pop: string;
}

export interface LoadBalancerRegionPool {
    /**
     * A list of pool IDs in failover priority to use for traffic reaching the given PoP.
     */
    poolIds: string[];
    /**
     * A region code which must be in the list defined [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions). Multiple entries should not be specified with the same region.
     */
    region: string;
}

export interface PageRuleActions {
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    alwaysOnline?: string;
    /**
     * Boolean of whether this action is enabled. Default: false.
     */
    alwaysUseHttps?: boolean;
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    automaticHttpsRewrites?: string;
    /**
     * The Time To Live for the browser cache. `0` means 'Respect Existing Headers'
     */
    browserCacheTtl?: string;
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    browserCheck?: string;
    /**
     * String value of cookie name to conditionally bypass cache the page.
     */
    bypassCacheOnCookie?: string;
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    cacheByDeviceType?: string;
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    cacheDeceptionArmor?: string;
    /**
     * Whether to set the cache level to `"bypass"`, `"basic"`, `"simplified"`, `"aggressive"`, or `"cacheEverything"`.
     */
    cacheLevel?: string;
    /**
     * String value of cookie name to conditionally cache the page.
     */
    cacheOnCookie?: string;
    /**
     * Boolean of whether this action is enabled. Default: false.
     */
    disableApps?: boolean;
    /**
     * Boolean of whether this action is enabled. Default: false.
     */
    disablePerformance?: boolean;
    /**
     * Boolean of whether this action is enabled. Default: false.
     */
    disableRailgun?: boolean;
    /**
     * Boolean of whether this action is enabled. Default: false.
     */
    disableSecurity?: boolean;
    /**
     * The Time To Live for the edge cache.
     */
    edgeCacheTtl?: number;
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    emailObfuscation?: string;
    /**
     * Whether origin Cache-Control action is `"on"` or `"off"`.
     */
    explicitCacheControl?: string;
    /**
     * The URL to forward to, and with what status. See below.
     */
    forwardingUrl?: outputs.PageRuleActionsForwardingUrl;
    /**
     * Value of the Host header to send.
     */
    hostHeaderOverride?: string;
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    ipGeolocation?: string;
    /**
     * The configuration for HTML, CSS and JS minification. See below for full list of options.
     */
    minifies?: outputs.PageRuleActionsMinify[];
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    mirage?: string;
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    opportunisticEncryption?: string;
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    originErrorPagePassThru?: string;
    /**
     * Whether this action is `"off"`, `"lossless"` or `"lossy"`.
     */
    polish?: string;
    /**
     * Overridden origin server name.
     */
    resolveOverride?: string;
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    respectStrongEtag?: string;
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    responseBuffering?: string;
    /**
     * Whether to set the rocket loader to `"on"`, `"off"`.
     */
    rocketLoader?: string;
    /**
     * Whether to set the security level to `"off"`, `"essentiallyOff"`, `"low"`, `"medium"`, `"high"`, or `"underAttack"`.
     */
    securityLevel?: string;
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    serverSideExclude?: string;
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    sortQueryStringForCache?: string;
    /**
     * Whether to set the SSL mode to `"off"`, `"flexible"`, `"full"`, `"strict"`, or `"originPull"`.
     */
    ssl?: string;
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    trueClientIpHeader?: string;
    /**
     * Whether this action is `"on"` or `"off"`.
     */
    waf?: string;
}

export interface PageRuleActionsForwardingUrl {
    /**
     * The status code to use for the redirection.
     */
    statusCode: number;
    /**
     * The URL to which the page rule should forward.
     */
    url: string;
}

export interface PageRuleActionsMinify {
    /**
     * Whether CSS should be minified. Valid values are `"on"` or `"off"`.
     */
    css: string;
    /**
     * Whether HTML should be minified. Valid values are `"on"` or `"off"`.
     */
    html: string;
    /**
     * Whether Javascript should be minified. Valid values are `"on"` or `"off"`.
     */
    js: string;
}

export interface RateLimitAction {
    /**
     * The type of action to perform. Allowable values are 'simulate', 'ban', 'challenge' and 'js_challenge'.
     */
    mode: string;
    /**
     * Custom content-type and body to return, this overrides the custom error for the zone. This field is not required. Omission will result in default HTML error page. Definition below.
     */
    response?: outputs.RateLimitActionResponse;
    /**
     * The time in seconds as an integer to perform the mitigation action. This field is required if the `mode` is either `simulate` or `ban`. Must be the same or greater than the period (min: 1, max: 86400).
     */
    timeout?: number;
}

export interface RateLimitActionResponse {
    /**
     * The body to return, the content here should conform to the content_type.
     */
    body: string;
    /**
     * The content-type of the body, must be one of: 'text/plain', 'text/xml', 'application/json'.
     */
    contentType: string;
}

export interface RateLimitCorrelate {
    /**
     * If set to 'nat', NAT support will be enabled for rate limiting.
     */
    by?: string;
}

export interface RateLimitMatch {
    /**
     * Matches HTTP requests (from the client to Cloudflare). See definition below.
     */
    request: outputs.RateLimitMatchRequest;
    /**
     * Custom content-type and body to return, this overrides the custom error for the zone. This field is not required. Omission will result in default HTML error page. Definition below.
     */
    response: outputs.RateLimitMatchResponse;
}

export interface RateLimitMatchRequest {
    /**
     * HTTP Methods, can be a subset ['POST','PUT'] or all ['\_ALL\_']. Default: ['\_ALL\_'].
     */
    methods: string[];
    /**
     * HTTP Schemes, can be one ['HTTPS'], both ['HTTP','HTTPS'] or all ['\_ALL\_'].  Default: ['\_ALL\_'].
     */
    schemes: string[];
    /**
     * The URL pattern to match comprised of the host and path, i.e. example.org/path. Wildcard are expanded to match applicable traffic, query strings are not matched. Use * for all traffic to your zone. Default: '*'.
     */
    urlPattern: string;
}

export interface RateLimitMatchResponse {
    /**
     * Only count traffic that has come from your origin servers. If true, cached items that Cloudflare serve will not count towards rate limiting. Default: `true`.
     */
    originTraffic: boolean;
    /**
     * HTTP Status codes, can be one [403], many [401,403] or indicate all by not providing this value.
     */
    statuses: number[];
}

export interface RecordData {
    algorithm?: number;
    altitude?: number;
    certificate?: string;
    content?: string;
    digest?: string;
    digestType?: number;
    fingerprint?: string;
    flags?: string;
    keyTag?: number;
    latDegrees?: number;
    latDirection?: string;
    latMinutes?: number;
    latSeconds?: number;
    longDegrees?: number;
    longDirection?: string;
    longMinutes?: number;
    longSeconds?: number;
    matchingType?: number;
    /**
     * The name of the record
     */
    name?: string;
    order?: number;
    port?: number;
    precisionHorz?: number;
    precisionVert?: number;
    preference?: number;
    /**
     * The priority of the record
     */
    priority?: number;
    proto?: string;
    protocol?: number;
    publicKey?: string;
    regex?: string;
    replacement?: string;
    selector?: number;
    service?: string;
    size?: number;
    target?: string;
    /**
     * The type of the record
     */
    type?: number;
    usage?: number;
    weight?: number;
}

export interface SpectrumApplicationDns {
    /**
     * Fully qualified domain name of the origin e.g. origin-ssh.example.com.
     */
    name: string;
    /**
     * The type of DNS record associated with the application. Valid values: `CNAME`.
     */
    type: string;
}

export interface SpectrumApplicationOriginDns {
    /**
     * Fully qualified domain name of the origin e.g. origin-ssh.example.com.
     */
    name: string;
}

export interface WorkerScriptKvNamespaceBinding {
    /**
     * The name for the binding.
     */
    name: string;
    /**
     * ID of KV namespace.
     */
    namespaceId: string;
}

export interface ZoneLockdownConfiguration {
    /**
     * The request property to target. Allowed values: "ip", "ipRange"
     */
    target: string;
    /**
     * The value to target. Depends on target's type. IP addresses should just be standard IPv4/IPv6 notation i.e. `198.51.100.4` or `2001:db8::/32` and IP ranges in CIDR format i.e. `198.51.0.0/16`.
     */
    value: string;
}

export interface ZoneMeta {
    phishingDetected: boolean;
    wildcardProxiable: boolean;
}

export interface ZoneSettingsOverrideInitialSettings {
    alwaysOnline: string;
    alwaysUseHttps: string;
    automaticHttpsRewrites: string;
    brotli: string;
    browserCacheTtl: number;
    browserCheck: string;
    cacheLevel: string;
    challengeTtl: number;
    cnameFlattening: string;
    developmentMode: string;
    emailObfuscation: string;
    h2Prioritization: string;
    hotlinkProtection: string;
    http2: string;
    http3: string;
    imageResizing: string;
    ipGeolocation: string;
    ipv6: string;
    maxUpload: number;
    minTlsVersion: string;
    minify: outputs.ZoneSettingsOverrideInitialSettingsMinify;
    mirage: string;
    mobileRedirect: outputs.ZoneSettingsOverrideInitialSettingsMobileRedirect;
    opportunisticEncryption: string;
    opportunisticOnion: string;
    originErrorPagePassThru: string;
    polish: string;
    prefetchPreload: string;
    privacyPass: string;
    pseudoIpv4: string;
    responseBuffering: string;
    rocketLoader: string;
    securityHeader: outputs.ZoneSettingsOverrideInitialSettingsSecurityHeader;
    securityLevel: string;
    serverSideExclude: string;
    sortQueryStringForCache: string;
    ssl: string;
    tls12Only: string;
    tls13: string;
    tlsClientAuth: string;
    trueClientIpHeader: string;
    universalSsl: string;
    waf: string;
    /**
     * . Note that the value specified will be ignored unless `polish` is turned on (i.e. is "lossless" or "lossy")
     */
    webp: string;
    websockets: string;
    zeroRtt: string;
}

export interface ZoneSettingsOverrideInitialSettingsMinify {
    /**
     * "on"/"off"
     */
    css: string;
    /**
     * "on"/"off"
     */
    html: string;
    /**
     * "on"/"off"
     */
    js: string;
}

export interface ZoneSettingsOverrideInitialSettingsMobileRedirect {
    /**
     * String value
     */
    mobileSubdomain: string;
    /**
     * "on"/"off"
     */
    status: string;
    /**
     * true/false
     */
    stripUri: boolean;
}

export interface ZoneSettingsOverrideInitialSettingsSecurityHeader {
    /**
     * true/false
     */
    enabled: boolean;
    /**
     * true/false
     */
    includeSubdomains: boolean;
    /**
     * Integer
     */
    maxAge: number;
    /**
     * true/false
     */
    nosniff: boolean;
    /**
     * true/false
     */
    preload: boolean;
}

export interface ZoneSettingsOverrideSettings {
    alwaysOnline: string;
    alwaysUseHttps: string;
    automaticHttpsRewrites: string;
    brotli: string;
    browserCacheTtl: number;
    browserCheck: string;
    cacheLevel: string;
    challengeTtl: number;
    cnameFlattening: string;
    developmentMode: string;
    emailObfuscation: string;
    h2Prioritization: string;
    hotlinkProtection: string;
    http2: string;
    http3: string;
    imageResizing: string;
    ipGeolocation: string;
    ipv6: string;
    maxUpload: number;
    minTlsVersion: string;
    minify: outputs.ZoneSettingsOverrideSettingsMinify;
    mirage: string;
    mobileRedirect: outputs.ZoneSettingsOverrideSettingsMobileRedirect;
    opportunisticEncryption: string;
    opportunisticOnion: string;
    originErrorPagePassThru: string;
    polish: string;
    prefetchPreload: string;
    privacyPass: string;
    pseudoIpv4: string;
    responseBuffering: string;
    rocketLoader: string;
    securityHeader: outputs.ZoneSettingsOverrideSettingsSecurityHeader;
    securityLevel: string;
    serverSideExclude: string;
    sortQueryStringForCache: string;
    ssl: string;
    tls12Only: string;
    tls13: string;
    tlsClientAuth: string;
    trueClientIpHeader: string;
    universalSsl: string;
    waf: string;
    /**
     * . Note that the value specified will be ignored unless `polish` is turned on (i.e. is "lossless" or "lossy")
     */
    webp: string;
    websockets: string;
    zeroRtt: string;
}

export interface ZoneSettingsOverrideSettingsMinify {
    /**
     * "on"/"off"
     */
    css: string;
    /**
     * "on"/"off"
     */
    html: string;
    /**
     * "on"/"off"
     */
    js: string;
}

export interface ZoneSettingsOverrideSettingsMobileRedirect {
    /**
     * String value
     */
    mobileSubdomain: string;
    /**
     * "on"/"off"
     */
    status: string;
    /**
     * true/false
     */
    stripUri: boolean;
}

export interface ZoneSettingsOverrideSettingsSecurityHeader {
    /**
     * true/false
     */
    enabled: boolean;
    /**
     * true/false
     */
    includeSubdomains: boolean;
    /**
     * Integer
     */
    maxAge: number;
    /**
     * true/false
     */
    nosniff: boolean;
    /**
     * true/false
     */
    preload: boolean;
}
