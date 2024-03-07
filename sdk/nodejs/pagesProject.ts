// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a resource which manages Cloudflare Pages projects.
 *
 * > If you are using a `source` block configuration, you must first have a
 *    connected GitHub or GitLab account connected to Cloudflare. See the
 *    [Getting Started with Pages] documentation on how to link your accounts.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Direct upload Pages project
 * const basicProject = new cloudflare.PagesProject("basicProject", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "this-is-my-project-01",
 *     productionBranch: "main",
 * });
 * // Pages project with managing build config
 * const buildConfig = new cloudflare.PagesProject("buildConfig", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     buildConfig: {
 *         buildCommand: "npm run build",
 *         destinationDir: "build",
 *         rootDir: "",
 *         webAnalyticsTag: "cee1c73f6e4743d0b5e6bb1a0bcaabcc",
 *         webAnalyticsToken: "021e1057c18547eca7b79f2516f06o7x",
 *     },
 *     name: "this-is-my-project-01",
 *     productionBranch: "main",
 * });
 * // Pages project managing project source
 * const sourceConfig = new cloudflare.PagesProject("sourceConfig", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "this-is-my-project-01",
 *     productionBranch: "main",
 *     source: {
 *         config: {
 *             deploymentsEnabled: true,
 *             owner: "cloudflare",
 *             prCommentsEnabled: true,
 *             previewBranchExcludes: [
 *                 "main",
 *                 "prod",
 *             ],
 *             previewBranchIncludes: [
 *                 "dev",
 *                 "preview",
 *             ],
 *             previewDeploymentSetting: "custom",
 *             productionBranch: "main",
 *             productionDeploymentEnabled: true,
 *             repoName: "ninjakittens",
 *         },
 *         type: "github",
 *     },
 * });
 * // Pages project managing all configs
 * const deploymentConfigs = new cloudflare.PagesProject("deploymentConfigs", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     buildConfig: {
 *         buildCommand: "npm run build",
 *         destinationDir: "build",
 *         rootDir: "",
 *         webAnalyticsTag: "cee1c73f6e4743d0b5e6bb1a0bcaabcc",
 *         webAnalyticsToken: "021e1057c18547eca7b79f2516f06o7x",
 *     },
 *     deploymentConfigs: {
 *         preview: {
 *             compatibilityDate: "2022-08-15",
 *             compatibilityFlags: ["nodejs_compat"],
 *             d1Databases: {
 *                 D1BINDING: "445e2955-951a-4358-a35b-a4d0c813f63",
 *             },
 *             durableObjectNamespaces: {
 *                 DOBINDING: "5eb63bbbe01eeed093cb22bb8f5acdc3",
 *             },
 *             environmentVariables: {
 *                 ENVIRONMENT: "preview",
 *             },
 *             kvNamespaces: {
 *                 KVBINDING: "5eb63bbbe01eeed093cb22bb8f5acdc3",
 *             },
 *             r2Buckets: {
 *                 R2BINDING: "some-bucket",
 *             },
 *             secrets: {
 *                 TURNSTILESECRET: "1x0000000000000000000000000000000AA",
 *             },
 *         },
 *         production: {
 *             compatibilityDate: "2022-08-16",
 *             compatibilityFlags: [
 *                 "nodejs_compat",
 *                 "streams_enable_constructors",
 *             ],
 *             d1Databases: {
 *                 D1BINDING1: "445e2955-951a-4358-a35b-a4d0c813f63",
 *                 D1BINDING2: "a399414b-c697-409a-a688-377db6433cd9",
 *             },
 *             durableObjectNamespaces: {
 *                 DOBINDING1: "5eb63bbbe01eeed093cb22bb8f5acdc3",
 *                 DOBINDING2: "3cdca5f8bb22bc390deee10ebbb36be5",
 *             },
 *             environmentVariables: {
 *                 ENVIRONMENT: "production",
 *                 OTHERVALUE: "other value",
 *             },
 *             kvNamespaces: {
 *                 KVBINDING1: "5eb63bbbe01eeed093cb22bb8f5acdc3",
 *                 KVBINDING2: "3cdca5f8bb22bc390deee10ebbb36be5",
 *             },
 *             r2Buckets: {
 *                 R2BINDING1: "some-bucket",
 *                 R2BINDING2: "other-bucket",
 *             },
 *             secrets: {
 *                 TURNSTILEINVISSECRET: "2x0000000000000000000000000000000AA",
 *                 TURNSTILESECRET: "1x0000000000000000000000000000000AA",
 *             },
 *         },
 *     },
 *     name: "this-is-my-project-01",
 *     productionBranch: "main",
 *     source: {
 *         config: {
 *             deploymentsEnabled: true,
 *             owner: "cloudflare",
 *             prCommentsEnabled: true,
 *             previewBranchExcludes: [
 *                 "main",
 *                 "prod",
 *             ],
 *             previewBranchIncludes: [
 *                 "dev",
 *                 "preview",
 *             ],
 *             previewDeploymentSetting: "custom",
 *             productionBranch: "main",
 *             productionDeploymentEnabled: true,
 *             repoName: "ninjakittens",
 *         },
 *         type: "github",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * !> It is not possible to import a pages project with secret environment variables. If you have a secret environment variable, you must remove it from your project before importing it.
 *
 * ```sh
 * $ pulumi import cloudflare:index/pagesProject:PagesProject example <account_id>/<project_name>
 * ```
 */
export class PagesProject extends pulumi.CustomResource {
    /**
     * Get an existing PagesProject resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PagesProjectState, opts?: pulumi.CustomResourceOptions): PagesProject {
        return new PagesProject(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/pagesProject:PagesProject';

    /**
     * Returns true if the given object is an instance of PagesProject.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PagesProject {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PagesProject.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
     */
    public readonly buildConfig!: pulumi.Output<outputs.PagesProjectBuildConfig | undefined>;
    /**
     * When the project was created.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * Configuration for deployments in a project.
     */
    public readonly deploymentConfigs!: pulumi.Output<outputs.PagesProjectDeploymentConfigs>;
    /**
     * A list of associated custom domains for the project.
     */
    public /*out*/ readonly domains!: pulumi.Output<string[]>;
    /**
     * The global variable for the binding in your Worker code.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Project production branch name.
     */
    public readonly productionBranch!: pulumi.Output<string>;
    /**
     * Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
     */
    public readonly source!: pulumi.Output<outputs.PagesProjectSource | undefined>;
    /**
     * The Cloudflare subdomain associated with the project.
     */
    public /*out*/ readonly subdomain!: pulumi.Output<string>;

    /**
     * Create a PagesProject resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PagesProjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PagesProjectArgs | PagesProjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PagesProjectState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["buildConfig"] = state ? state.buildConfig : undefined;
            resourceInputs["createdOn"] = state ? state.createdOn : undefined;
            resourceInputs["deploymentConfigs"] = state ? state.deploymentConfigs : undefined;
            resourceInputs["domains"] = state ? state.domains : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["productionBranch"] = state ? state.productionBranch : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["subdomain"] = state ? state.subdomain : undefined;
        } else {
            const args = argsOrState as PagesProjectArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.productionBranch === undefined) && !opts.urn) {
                throw new Error("Missing required property 'productionBranch'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["buildConfig"] = args ? args.buildConfig : undefined;
            resourceInputs["deploymentConfigs"] = args ? args.deploymentConfigs : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["productionBranch"] = args ? args.productionBranch : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["createdOn"] = undefined /*out*/;
            resourceInputs["domains"] = undefined /*out*/;
            resourceInputs["subdomain"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PagesProject.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PagesProject resources.
 */
export interface PagesProjectState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
     */
    buildConfig?: pulumi.Input<inputs.PagesProjectBuildConfig>;
    /**
     * When the project was created.
     */
    createdOn?: pulumi.Input<string>;
    /**
     * Configuration for deployments in a project.
     */
    deploymentConfigs?: pulumi.Input<inputs.PagesProjectDeploymentConfigs>;
    /**
     * A list of associated custom domains for the project.
     */
    domains?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The global variable for the binding in your Worker code.
     */
    name?: pulumi.Input<string>;
    /**
     * Project production branch name.
     */
    productionBranch?: pulumi.Input<string>;
    /**
     * Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
     */
    source?: pulumi.Input<inputs.PagesProjectSource>;
    /**
     * The Cloudflare subdomain associated with the project.
     */
    subdomain?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PagesProject resource.
 */
export interface PagesProjectArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
     */
    buildConfig?: pulumi.Input<inputs.PagesProjectBuildConfig>;
    /**
     * Configuration for deployments in a project.
     */
    deploymentConfigs?: pulumi.Input<inputs.PagesProjectDeploymentConfigs>;
    /**
     * The global variable for the binding in your Worker code.
     */
    name: pulumi.Input<string>;
    /**
     * Project production branch name.
     */
    productionBranch: pulumi.Input<string>;
    /**
     * Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
     */
    source?: pulumi.Input<inputs.PagesProjectSource>;
}
