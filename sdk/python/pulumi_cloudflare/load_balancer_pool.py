# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class LoadBalancerPool(pulumi.CustomResource):
    check_regions: pulumi.Output[list]
    """
    A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
    """
    created_on: pulumi.Output[str]
    """
    The RFC3339 timestamp of when the load balancer was created.
    """
    description: pulumi.Output[str]
    """
    Free text description.
    """
    enabled: pulumi.Output[bool]
    """
    Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
    """
    minimum_origins: pulumi.Output[float]
    """
    The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
    """
    modified_on: pulumi.Output[str]
    """
    The RFC3339 timestamp of when the load balancer was last modified.
    """
    monitor: pulumi.Output[str]
    """
    The ID of the Monitor to use for health checking origins within this pool.
    """
    name: pulumi.Output[str]
    """
    A human-identifiable name for the origin.
    """
    notification_email: pulumi.Output[str]
    """
    The email address to send health status notifications to. This can be an individual mailbox or a mailing list.
    """
    origins: pulumi.Output[list]
    """
    The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.

      * `address` (`str`) - The IP address (IPv4 or IPv6) of the origin, or the publicly addressable hostname. Hostnames entered here should resolve directly to the origin, and not be a hostname proxied by Cloudflare.
      * `enabled` (`bool`) - Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
      * `name` (`str`) - A human-identifiable name for the origin.
      * `weight` (`float`) - The weight (0.01 - 1.00) of this origin, relative to other origins in the pool. Equal values mean equal weighting. A weight of 0 means traffic will not be sent to this origin, but health is still checked. Default: 1.
    """
    def __init__(__self__, resource_name, opts=None, check_regions=None, description=None, enabled=None, minimum_origins=None, monitor=None, name=None, notification_email=None, origins=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Cloudflare Load Balancer pool resource. This provides a pool of origins that can be used by a Cloudflare Load Balancer. Note that the load balancing feature must be enabled in your Cloudflare account before you can use this resource.




        > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/load_balancer_pool.html.markdown.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[list] check_regions: A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
        :param pulumi.Input[str] description: Free text description.
        :param pulumi.Input[bool] enabled: Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
        :param pulumi.Input[float] minimum_origins: The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
        :param pulumi.Input[str] monitor: The ID of the Monitor to use for health checking origins within this pool.
        :param pulumi.Input[str] name: A human-identifiable name for the origin.
        :param pulumi.Input[str] notification_email: The email address to send health status notifications to. This can be an individual mailbox or a mailing list.
        :param pulumi.Input[list] origins: The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.

        The **origins** object supports the following:

          * `address` (`pulumi.Input[str]`) - The IP address (IPv4 or IPv6) of the origin, or the publicly addressable hostname. Hostnames entered here should resolve directly to the origin, and not be a hostname proxied by Cloudflare.
          * `enabled` (`pulumi.Input[bool]`) - Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
          * `name` (`pulumi.Input[str]`) - A human-identifiable name for the origin.
          * `weight` (`pulumi.Input[float]`) - The weight (0.01 - 1.00) of this origin, relative to other origins in the pool. Equal values mean equal weighting. A weight of 0 means traffic will not be sent to this origin, but health is still checked. Default: 1.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['check_regions'] = check_regions
            __props__['description'] = description
            __props__['enabled'] = enabled
            __props__['minimum_origins'] = minimum_origins
            __props__['monitor'] = monitor
            if name is None:
                raise TypeError("Missing required property 'name'")
            __props__['name'] = name
            __props__['notification_email'] = notification_email
            if origins is None:
                raise TypeError("Missing required property 'origins'")
            __props__['origins'] = origins
            __props__['created_on'] = None
            __props__['modified_on'] = None
        super(LoadBalancerPool, __self__).__init__(
            'cloudflare:index/loadBalancerPool:LoadBalancerPool',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, check_regions=None, created_on=None, description=None, enabled=None, minimum_origins=None, modified_on=None, monitor=None, name=None, notification_email=None, origins=None):
        """
        Get an existing LoadBalancerPool resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[list] check_regions: A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
        :param pulumi.Input[str] created_on: The RFC3339 timestamp of when the load balancer was created.
        :param pulumi.Input[str] description: Free text description.
        :param pulumi.Input[bool] enabled: Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
        :param pulumi.Input[float] minimum_origins: The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
        :param pulumi.Input[str] modified_on: The RFC3339 timestamp of when the load balancer was last modified.
        :param pulumi.Input[str] monitor: The ID of the Monitor to use for health checking origins within this pool.
        :param pulumi.Input[str] name: A human-identifiable name for the origin.
        :param pulumi.Input[str] notification_email: The email address to send health status notifications to. This can be an individual mailbox or a mailing list.
        :param pulumi.Input[list] origins: The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.

        The **origins** object supports the following:

          * `address` (`pulumi.Input[str]`) - The IP address (IPv4 or IPv6) of the origin, or the publicly addressable hostname. Hostnames entered here should resolve directly to the origin, and not be a hostname proxied by Cloudflare.
          * `enabled` (`pulumi.Input[bool]`) - Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
          * `name` (`pulumi.Input[str]`) - A human-identifiable name for the origin.
          * `weight` (`pulumi.Input[float]`) - The weight (0.01 - 1.00) of this origin, relative to other origins in the pool. Equal values mean equal weighting. A weight of 0 means traffic will not be sent to this origin, but health is still checked. Default: 1.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["check_regions"] = check_regions
        __props__["created_on"] = created_on
        __props__["description"] = description
        __props__["enabled"] = enabled
        __props__["minimum_origins"] = minimum_origins
        __props__["modified_on"] = modified_on
        __props__["monitor"] = monitor
        __props__["name"] = name
        __props__["notification_email"] = notification_email
        __props__["origins"] = origins
        return LoadBalancerPool(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

