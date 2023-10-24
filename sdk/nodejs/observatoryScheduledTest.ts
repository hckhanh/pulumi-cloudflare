// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Observatory Scheduled Test resource.
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/observatoryScheduledTest:ObservatoryScheduledTest example <zone_id>:<url>:<region>
 * ```
 */
export class ObservatoryScheduledTest extends pulumi.CustomResource {
    /**
     * Get an existing ObservatoryScheduledTest resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ObservatoryScheduledTestState, opts?: pulumi.CustomResourceOptions): ObservatoryScheduledTest {
        return new ObservatoryScheduledTest(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/observatoryScheduledTest:ObservatoryScheduledTest';

    /**
     * Returns true if the given object is an instance of ObservatoryScheduledTest.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ObservatoryScheduledTest {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ObservatoryScheduledTest.__pulumiType;
    }

    /**
     * The frequency to run the test. Available values: `DAILY`, `WEEKLY`. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly frequency!: pulumi.Output<string>;
    /**
     * The region to run the test in. Available values: `us-central1`, `us-east1`, `us-east4`, `us-south1`, `us-west1`, `southamerica-east1`, `europe-north1`, `europe-southwest1`, `europe-west1`, `europe-west2`, `europe-west3`, `europe-west4`, `europe-west8`, `europe-west9`, `asia-east1`, `asia-southeast1`, `me-west1`, `australia-southeast1`. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The page to run the test on. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly url!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a ObservatoryScheduledTest resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ObservatoryScheduledTestArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ObservatoryScheduledTestArgs | ObservatoryScheduledTestState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ObservatoryScheduledTestState | undefined;
            resourceInputs["frequency"] = state ? state.frequency : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ObservatoryScheduledTestArgs | undefined;
            if ((!args || args.frequency === undefined) && !opts.urn) {
                throw new Error("Missing required property 'frequency'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.url === undefined) && !opts.urn) {
                throw new Error("Missing required property 'url'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["frequency"] = args ? args.frequency : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ObservatoryScheduledTest.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ObservatoryScheduledTest resources.
 */
export interface ObservatoryScheduledTestState {
    /**
     * The frequency to run the test. Available values: `DAILY`, `WEEKLY`. **Modifying this attribute will force creation of a new resource.**
     */
    frequency?: pulumi.Input<string>;
    /**
     * The region to run the test in. Available values: `us-central1`, `us-east1`, `us-east4`, `us-south1`, `us-west1`, `southamerica-east1`, `europe-north1`, `europe-southwest1`, `europe-west1`, `europe-west2`, `europe-west3`, `europe-west4`, `europe-west8`, `europe-west9`, `asia-east1`, `asia-southeast1`, `me-west1`, `australia-southeast1`. **Modifying this attribute will force creation of a new resource.**
     */
    region?: pulumi.Input<string>;
    /**
     * The page to run the test on. **Modifying this attribute will force creation of a new resource.**
     */
    url?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ObservatoryScheduledTest resource.
 */
export interface ObservatoryScheduledTestArgs {
    /**
     * The frequency to run the test. Available values: `DAILY`, `WEEKLY`. **Modifying this attribute will force creation of a new resource.**
     */
    frequency: pulumi.Input<string>;
    /**
     * The region to run the test in. Available values: `us-central1`, `us-east1`, `us-east4`, `us-south1`, `us-west1`, `southamerica-east1`, `europe-north1`, `europe-southwest1`, `europe-west1`, `europe-west2`, `europe-west3`, `europe-west4`, `europe-west8`, `europe-west9`, `asia-east1`, `asia-southeast1`, `me-west1`, `australia-southeast1`. **Modifying this attribute will force creation of a new resource.**
     */
    region: pulumi.Input<string>;
    /**
     * The page to run the test on. **Modifying this attribute will force creation of a new resource.**
     */
    url: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}
