// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to get the [IP ranges][1] of Cloudflare edge nodes.
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/d/ip_ranges.html.markdown.
 */
export function getIpRanges(opts?: pulumi.InvokeOptions): Promise<GetIpRangesResult> & GetIpRangesResult {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetIpRangesResult> = pulumi.runtime.invoke("cloudflare:index/getIpRanges:getIpRanges", {
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of values returned by getIpRanges.
 */
export interface GetIpRangesResult {
    readonly cidrBlocks: string[];
    readonly ipv4CidrBlocks: string[];
    readonly ipv6CidrBlocks: string[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
