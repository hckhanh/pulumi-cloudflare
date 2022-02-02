// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Access Application resource. Access Applications
 * are used to restrict access to a whole application using an
 * authorisation gateway managed by Cloudflare.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // With CORS configuration
 * const stagingApp = new cloudflare.AccessApplication("staging_app", {
 *     corsHeaders: [{
 *         allowCredentials: true,
 *         allowedMethods: [
 *             "GET",
 *             "POST",
 *             "OPTIONS",
 *         ],
 *         allowedOrigins: ["https://example.com"],
 *         maxAge: 10,
 *     }],
 *     domain: "staging.example.com",
 *     name: "staging application",
 *     sessionDuration: "24h",
 *     type: "self_hosted",
 *     zoneId: "1d5fdc9e88c8a8c4518b068cd94331fe",
 * });
 * ```
 *
 * ## Import
 *
 * Access Applications can be imported using a composite ID formed of account ID and application ID.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/accessApplication:AccessApplication staging cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
 * ```
 */
export class AccessApplication extends pulumi.CustomResource {
    /**
     * Get an existing AccessApplication resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessApplicationState, opts?: pulumi.CustomResourceOptions): AccessApplication {
        return new AccessApplication(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accessApplication:AccessApplication';

    /**
     * Returns true if the given object is an instance of AccessApplication.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessApplication {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessApplication.__pulumiType;
    }

    /**
     * The account to which the access application should be added. Conflicts with `zoneId`.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The identity providers selected for the application.
     */
    public readonly allowedIdps!: pulumi.Output<string[] | undefined>;
    /**
     * Option to show/hide applications in App Launcher. Defaults to `true`.
     */
    public readonly appLauncherVisible!: pulumi.Output<boolean | undefined>;
    /**
     * Application Audience (AUD) Tag of the application
     */
    public /*out*/ readonly aud!: pulumi.Output<string>;
    /**
     * Option to skip identity provider
     * selection if only one is configured in allowed_idps. Defaults to `false`
     * (disabled).
     */
    public readonly autoRedirectToIdentity!: pulumi.Output<boolean | undefined>;
    /**
     * CORS configuration for the Access Application. See
     * below for reference structure.
     */
    public readonly corsHeaders!: pulumi.Output<outputs.AccessApplicationCorsHeader[] | undefined>;
    /**
     * Option that returns a custom error message when a user is denied access to the application.
     */
    public readonly customDenyMessage!: pulumi.Output<string | undefined>;
    /**
     * Option that redirects to a custom URL when a user is denied access to the application.
     */
    public readonly customDenyUrl!: pulumi.Output<string | undefined>;
    /**
     * The complete URL of the asset you wish to put
     * Cloudflare Access in front of. Can include subdomains or paths. Or both.
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
     */
    public readonly enableBindingCookie!: pulumi.Output<boolean | undefined>;
    public readonly httpOnlyCookieAttribute!: pulumi.Output<boolean | undefined>;
    public readonly logoUrl!: pulumi.Output<string | undefined>;
    /**
     * Friendly name of the Access Application.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly sameSiteCookieAttribute!: pulumi.Output<string | undefined>;
    /**
     * How often a user will be forced to
     * re-authorise. Must be in the format `"48h"` or `"2h45m"`.
     * Valid time units are `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`. Defaults to `24h`.
     */
    public readonly sessionDuration!: pulumi.Output<string | undefined>;
    public readonly skipInterstitial!: pulumi.Output<boolean | undefined>;
    /**
     * The application type. Defaults to `selfHosted`. Valid
     * values are `selfHosted`, `ssh`, `vnc`, `file` or `bookmark`.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * The DNS zone to which the access application should be added. Conflicts with `accountId`.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a AccessApplication resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessApplicationArgs | AccessApplicationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessApplicationState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["allowedIdps"] = state ? state.allowedIdps : undefined;
            resourceInputs["appLauncherVisible"] = state ? state.appLauncherVisible : undefined;
            resourceInputs["aud"] = state ? state.aud : undefined;
            resourceInputs["autoRedirectToIdentity"] = state ? state.autoRedirectToIdentity : undefined;
            resourceInputs["corsHeaders"] = state ? state.corsHeaders : undefined;
            resourceInputs["customDenyMessage"] = state ? state.customDenyMessage : undefined;
            resourceInputs["customDenyUrl"] = state ? state.customDenyUrl : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["enableBindingCookie"] = state ? state.enableBindingCookie : undefined;
            resourceInputs["httpOnlyCookieAttribute"] = state ? state.httpOnlyCookieAttribute : undefined;
            resourceInputs["logoUrl"] = state ? state.logoUrl : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["sameSiteCookieAttribute"] = state ? state.sameSiteCookieAttribute : undefined;
            resourceInputs["sessionDuration"] = state ? state.sessionDuration : undefined;
            resourceInputs["skipInterstitial"] = state ? state.skipInterstitial : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as AccessApplicationArgs | undefined;
            if ((!args || args.domain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domain'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["allowedIdps"] = args ? args.allowedIdps : undefined;
            resourceInputs["appLauncherVisible"] = args ? args.appLauncherVisible : undefined;
            resourceInputs["autoRedirectToIdentity"] = args ? args.autoRedirectToIdentity : undefined;
            resourceInputs["corsHeaders"] = args ? args.corsHeaders : undefined;
            resourceInputs["customDenyMessage"] = args ? args.customDenyMessage : undefined;
            resourceInputs["customDenyUrl"] = args ? args.customDenyUrl : undefined;
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["enableBindingCookie"] = args ? args.enableBindingCookie : undefined;
            resourceInputs["httpOnlyCookieAttribute"] = args ? args.httpOnlyCookieAttribute : undefined;
            resourceInputs["logoUrl"] = args ? args.logoUrl : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["sameSiteCookieAttribute"] = args ? args.sameSiteCookieAttribute : undefined;
            resourceInputs["sessionDuration"] = args ? args.sessionDuration : undefined;
            resourceInputs["skipInterstitial"] = args ? args.skipInterstitial : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["aud"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessApplication.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessApplication resources.
 */
export interface AccessApplicationState {
    /**
     * The account to which the access application should be added. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The identity providers selected for the application.
     */
    allowedIdps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Option to show/hide applications in App Launcher. Defaults to `true`.
     */
    appLauncherVisible?: pulumi.Input<boolean>;
    /**
     * Application Audience (AUD) Tag of the application
     */
    aud?: pulumi.Input<string>;
    /**
     * Option to skip identity provider
     * selection if only one is configured in allowed_idps. Defaults to `false`
     * (disabled).
     */
    autoRedirectToIdentity?: pulumi.Input<boolean>;
    /**
     * CORS configuration for the Access Application. See
     * below for reference structure.
     */
    corsHeaders?: pulumi.Input<pulumi.Input<inputs.AccessApplicationCorsHeader>[]>;
    /**
     * Option that returns a custom error message when a user is denied access to the application.
     */
    customDenyMessage?: pulumi.Input<string>;
    /**
     * Option that redirects to a custom URL when a user is denied access to the application.
     */
    customDenyUrl?: pulumi.Input<string>;
    /**
     * The complete URL of the asset you wish to put
     * Cloudflare Access in front of. Can include subdomains or paths. Or both.
     */
    domain?: pulumi.Input<string>;
    /**
     * Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
     */
    enableBindingCookie?: pulumi.Input<boolean>;
    httpOnlyCookieAttribute?: pulumi.Input<boolean>;
    logoUrl?: pulumi.Input<string>;
    /**
     * Friendly name of the Access Application.
     */
    name?: pulumi.Input<string>;
    sameSiteCookieAttribute?: pulumi.Input<string>;
    /**
     * How often a user will be forced to
     * re-authorise. Must be in the format `"48h"` or `"2h45m"`.
     * Valid time units are `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`. Defaults to `24h`.
     */
    sessionDuration?: pulumi.Input<string>;
    skipInterstitial?: pulumi.Input<boolean>;
    /**
     * The application type. Defaults to `selfHosted`. Valid
     * values are `selfHosted`, `ssh`, `vnc`, `file` or `bookmark`.
     */
    type?: pulumi.Input<string>;
    /**
     * The DNS zone to which the access application should be added. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessApplication resource.
 */
export interface AccessApplicationArgs {
    /**
     * The account to which the access application should be added. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The identity providers selected for the application.
     */
    allowedIdps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Option to show/hide applications in App Launcher. Defaults to `true`.
     */
    appLauncherVisible?: pulumi.Input<boolean>;
    /**
     * Option to skip identity provider
     * selection if only one is configured in allowed_idps. Defaults to `false`
     * (disabled).
     */
    autoRedirectToIdentity?: pulumi.Input<boolean>;
    /**
     * CORS configuration for the Access Application. See
     * below for reference structure.
     */
    corsHeaders?: pulumi.Input<pulumi.Input<inputs.AccessApplicationCorsHeader>[]>;
    /**
     * Option that returns a custom error message when a user is denied access to the application.
     */
    customDenyMessage?: pulumi.Input<string>;
    /**
     * Option that redirects to a custom URL when a user is denied access to the application.
     */
    customDenyUrl?: pulumi.Input<string>;
    /**
     * The complete URL of the asset you wish to put
     * Cloudflare Access in front of. Can include subdomains or paths. Or both.
     */
    domain: pulumi.Input<string>;
    /**
     * Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
     */
    enableBindingCookie?: pulumi.Input<boolean>;
    httpOnlyCookieAttribute?: pulumi.Input<boolean>;
    logoUrl?: pulumi.Input<string>;
    /**
     * Friendly name of the Access Application.
     */
    name: pulumi.Input<string>;
    sameSiteCookieAttribute?: pulumi.Input<string>;
    /**
     * How often a user will be forced to
     * re-authorise. Must be in the format `"48h"` or `"2h45m"`.
     * Valid time units are `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`. Defaults to `24h`.
     */
    sessionDuration?: pulumi.Input<string>;
    skipInterstitial?: pulumi.Input<boolean>;
    /**
     * The application type. Defaults to `selfHosted`. Valid
     * values are `selfHosted`, `ssh`, `vnc`, `file` or `bookmark`.
     */
    type?: pulumi.Input<string>;
    /**
     * The DNS zone to which the access application should be added. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}
