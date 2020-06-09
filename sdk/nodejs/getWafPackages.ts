// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to look up [WAF Rule Packages](https://api.cloudflare.com/#waf-rule-packages-properties).
 */
export function getWafPackages(args: GetWafPackagesArgs, opts?: pulumi.InvokeOptions): Promise<GetWafPackagesResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("cloudflare:index/getWafPackages:getWafPackages", {
        "filter": args.filter,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWafPackages.
 */
export interface GetWafPackagesArgs {
    readonly filter?: inputs.GetWafPackagesFilter;
    readonly zoneId: string;
}

/**
 * A collection of values returned by getWafPackages.
 */
export interface GetWafPackagesResult {
    readonly filter?: outputs.GetWafPackagesFilter;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly packages: outputs.GetWafPackagesPackage[];
    readonly zoneId: string;
}
