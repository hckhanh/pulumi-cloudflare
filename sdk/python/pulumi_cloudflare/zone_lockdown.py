# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['ZoneLockdown']


class ZoneLockdown(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configurations: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['ZoneLockdownConfigurationArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 paused: Optional[pulumi.Input[bool]] = None,
                 priority: Optional[pulumi.Input[float]] = None,
                 urls: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Cloudflare Zone Lockdown resource. Zone Lockdown allows you to define one or more URLs (with wildcard matching on the domain or path) that will only permit access if the request originates from an IP address that matches a safelist of one or more IP addresses and/or IP ranges.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Restrict access to these endpoints to requests from a known IP address.
        endpoint_lockdown = cloudflare.ZoneLockdown("endpointLockdown",
            configurations=[cloudflare.ZoneLockdownConfigurationArgs(
                target="ip",
                value="198.51.100.4",
            )],
            description="Restrict access to these endpoints to requests from a known IP address",
            paused=False,
            urls=["api.mysite.com/some/endpoint*"],
            zone_id="d41d8cd98f00b204e9800998ecf8427e")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['ZoneLockdownConfigurationArgs']]]] configurations: A list of IP addresses or IP ranges to match the request against specified in target, value pairs.  It's a complex value. See description below.   The order of the configuration entries is unimportant.
        :param pulumi.Input[str] description: A description about the lockdown entry. Typically used as a reminder or explanation for the lockdown.
        :param pulumi.Input[bool] paused: Boolean of whether this zone lockdown is currently paused. Default: false.
        :param pulumi.Input[List[pulumi.Input[str]]] urls: A list of simple wildcard patterns to match requests against. The order of the urls is unimportant.
        :param pulumi.Input[str] zone_id: The DNS zone ID to which the access rule should be added.
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
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if configurations is None:
                raise TypeError("Missing required property 'configurations'")
            __props__['configurations'] = configurations
            __props__['description'] = description
            __props__['paused'] = paused
            __props__['priority'] = priority
            if urls is None:
                raise TypeError("Missing required property 'urls'")
            __props__['urls'] = urls
            if zone_id is None:
                raise TypeError("Missing required property 'zone_id'")
            __props__['zone_id'] = zone_id
        super(ZoneLockdown, __self__).__init__(
            'cloudflare:index/zoneLockdown:ZoneLockdown',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            configurations: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['ZoneLockdownConfigurationArgs']]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            paused: Optional[pulumi.Input[bool]] = None,
            priority: Optional[pulumi.Input[float]] = None,
            urls: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'ZoneLockdown':
        """
        Get an existing ZoneLockdown resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['ZoneLockdownConfigurationArgs']]]] configurations: A list of IP addresses or IP ranges to match the request against specified in target, value pairs.  It's a complex value. See description below.   The order of the configuration entries is unimportant.
        :param pulumi.Input[str] description: A description about the lockdown entry. Typically used as a reminder or explanation for the lockdown.
        :param pulumi.Input[bool] paused: Boolean of whether this zone lockdown is currently paused. Default: false.
        :param pulumi.Input[List[pulumi.Input[str]]] urls: A list of simple wildcard patterns to match requests against. The order of the urls is unimportant.
        :param pulumi.Input[str] zone_id: The DNS zone ID to which the access rule should be added.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["configurations"] = configurations
        __props__["description"] = description
        __props__["paused"] = paused
        __props__["priority"] = priority
        __props__["urls"] = urls
        __props__["zone_id"] = zone_id
        return ZoneLockdown(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def configurations(self) -> List['outputs.ZoneLockdownConfiguration']:
        """
        A list of IP addresses or IP ranges to match the request against specified in target, value pairs.  It's a complex value. See description below.   The order of the configuration entries is unimportant.
        """
        return pulumi.get(self, "configurations")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        A description about the lockdown entry. Typically used as a reminder or explanation for the lockdown.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def paused(self) -> Optional[bool]:
        """
        Boolean of whether this zone lockdown is currently paused. Default: false.
        """
        return pulumi.get(self, "paused")

    @property
    @pulumi.getter
    def priority(self) -> Optional[float]:
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def urls(self) -> List[str]:
        """
        A list of simple wildcard patterns to match requests against. The order of the urls is unimportant.
        """
        return pulumi.get(self, "urls")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> str:
        """
        The DNS zone ID to which the access rule should be added.
        """
        return pulumi.get(self, "zone_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

