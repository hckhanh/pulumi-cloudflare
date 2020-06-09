// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to get the [IP ranges](https://www.cloudflare.com/ips/) of Cloudflare edge nodes.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * import * as gcp from "@pulumi/gcp";
 *
 * const cloudflare = cloudflare.getIpRanges({});
 * const allowCloudflareIngress = new gcp.compute.Firewall("allowCloudflareIngress", {
 *     network: "default",
 *     sourceRanges: cloudflare.then(cloudflare => cloudflare.ipv4CidrBlocks),
 *     allow: [{
 *         ports: "443",
 *         protocol: "tcp",
 *     }],
 * });
 * ```
 */
export function getIpRanges(opts?: pulumi.InvokeOptions): Promise<GetIpRangesResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("cloudflare:index/getIpRanges:getIpRanges", {
    }, opts);
}

/**
 * A collection of values returned by getIpRanges.
 */
export interface GetIpRangesResult {
    readonly cidrBlocks: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ipv4CidrBlocks: string[];
    readonly ipv6CidrBlocks: string[];
}
